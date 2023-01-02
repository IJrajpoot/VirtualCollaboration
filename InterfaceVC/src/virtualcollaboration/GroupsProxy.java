package virtualcollaboration;

public class GroupsProxy implements virtualcollaboration.Groups {
  private String _endpoint = null;
  private virtualcollaboration.Groups groups = null;
  
  public GroupsProxy() {
    _initGroupsProxy();
  }
  
  public GroupsProxy(String endpoint) {
    _endpoint = endpoint;
    _initGroupsProxy();
  }
  
  private void _initGroupsProxy() {
    try {
      groups = (new virtualcollaboration.GroupsServiceLocator()).getGroups();
      if (groups != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)groups)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)groups)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (groups != null)
      ((javax.xml.rpc.Stub)groups)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public virtualcollaboration.Groups getGroups() {
    if (groups == null)
      _initGroupsProxy();
    return groups;
  }
  
  public java.lang.String createGroup(java.lang.String name, java.lang.String purpose) throws java.rmi.RemoteException{
    if (groups == null)
      _initGroupsProxy();
    return groups.createGroup(name, purpose);
  }
  
  public java.lang.String addMembers(int groupID, java.lang.String[] users) throws java.rmi.RemoteException{
    if (groups == null)
      _initGroupsProxy();
    return groups.addMembers(groupID, users);
  }
  
  public java.lang.String[] existingGroups(int userID) throws java.rmi.RemoteException{
    if (groups == null)
      _initGroupsProxy();
    return groups.existingGroups(userID);
  }
  
  
}