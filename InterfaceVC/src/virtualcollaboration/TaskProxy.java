package virtualcollaboration;

public class TaskProxy implements virtualcollaboration.Task {
  private String _endpoint = null;
  private virtualcollaboration.Task task = null;
  
  public TaskProxy() {
    _initTaskProxy();
  }
  
  public TaskProxy(String endpoint) {
    _endpoint = endpoint;
    _initTaskProxy();
  }
  
  private void _initTaskProxy() {
    try {
      task = (new virtualcollaboration.TaskServiceLocator()).getTask();
      if (task != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)task)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)task)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (task != null)
      ((javax.xml.rpc.Stub)task)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public virtualcollaboration.Task getTask() {
    if (task == null)
      _initTaskProxy();
    return task;
  }
  
  public java.lang.String addTask(java.lang.String task0, java.lang.String date, java.lang.String time, int groupID) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.addTask(task0, date, time, groupID);
  }
  
  public java.lang.String addSpTask(java.lang.String task0, java.lang.String date, java.lang.String time, java.lang.String email) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.addSpTask(task0, date, time, email);
  }
  
  public java.lang.String delTask(int taskID) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.delTask(taskID);
  }
  
  public java.lang.String[] userApproval(int userID) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.userApproval(userID);
  }
  
  public java.lang.String getUserID(java.lang.String email) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.getUserID(email);
  }
  
  public java.lang.String getTaskID(int userID) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.getTaskID(userID);
  }
  
  public java.lang.String rejectTask(int taskID) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.rejectTask(taskID);
  }
  
  public java.lang.String[] seeTask(int groupID) throws java.rmi.RemoteException{
    if (task == null)
      _initTaskProxy();
    return task.seeTask(groupID);
  }
  
  
}