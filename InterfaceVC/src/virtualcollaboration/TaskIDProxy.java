package virtualcollaboration;

public class TaskIDProxy implements virtualcollaboration.TaskID {
  private String _endpoint = null;
  private virtualcollaboration.TaskID taskID = null;
  
  public TaskIDProxy() {
    _initTaskIDProxy();
  }
  
  public TaskIDProxy(String endpoint) {
    _endpoint = endpoint;
    _initTaskIDProxy();
  }
  
  private void _initTaskIDProxy() {
    try {
      taskID = (new virtualcollaboration.TaskIDServiceLocator()).getTaskID();
      if (taskID != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)taskID)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)taskID)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (taskID != null)
      ((javax.xml.rpc.Stub)taskID)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public virtualcollaboration.TaskID getTaskID() {
    if (taskID == null)
      _initTaskIDProxy();
    return taskID;
  }
  
  public java.lang.String[] getTaskID(int groupID) throws java.rmi.RemoteException{
    if (taskID == null)
      _initTaskIDProxy();
    return taskID.getTaskID(groupID);
  }
  
  public java.lang.String[] seeTask(int groupID) throws java.rmi.RemoteException{
    if (taskID == null)
      _initTaskIDProxy();
    return taskID.seeTask(groupID);
  }
  
  
}