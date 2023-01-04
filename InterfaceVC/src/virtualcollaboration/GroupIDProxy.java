package virtualcollaboration;

public class GroupIDProxy implements virtualcollaboration.GroupID {
  private String _endpoint = null;
  private virtualcollaboration.GroupID groupID = null;
  
  public GroupIDProxy() {
    _initGroupIDProxy();
  }
  
  public GroupIDProxy(String endpoint) {
    _endpoint = endpoint;
    _initGroupIDProxy();
  }
  
  private void _initGroupIDProxy() {
    try {
      groupID = (new virtualcollaboration.GroupIDServiceLocator()).getGroupID();
      if (groupID != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)groupID)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)groupID)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (groupID != null)
      ((javax.xml.rpc.Stub)groupID)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public virtualcollaboration.GroupID getGroupID() {
    if (groupID == null)
      _initGroupIDProxy();
    return groupID;
  }
  
  public java.lang.String[] getGroupID(int userID) throws java.rmi.RemoteException{
    if (groupID == null)
      _initGroupIDProxy();
    return groupID.getGroupID(userID);
  }
  
  
}