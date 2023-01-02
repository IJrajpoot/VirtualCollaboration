package virtualcollaboration;

public class LoginProxy implements virtualcollaboration.Login {
  private String _endpoint = null;
  private virtualcollaboration.Login login = null;
  
  public LoginProxy() {
    _initLoginProxy();
  }
  
  public LoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initLoginProxy();
  }
  
  private void _initLoginProxy() {
    try {
      login = (new virtualcollaboration.LoginServiceLocator()).getLogin();
      if (login != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)login)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (login != null)
      ((javax.xml.rpc.Stub)login)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public virtualcollaboration.Login getLogin() {
    if (login == null)
      _initLoginProxy();
    return login;
  }
  
  public boolean login(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.login(email, password);
  }
  
  public java.lang.String createUser(java.lang.String name, java.lang.String password, java.lang.String email) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.createUser(name, password, email);
  }
  
  public java.lang.String delUser(java.lang.String password, java.lang.String email) throws java.rmi.RemoteException{
    if (login == null)
      _initLoginProxy();
    return login.delUser(password, email);
  }
  
  
}