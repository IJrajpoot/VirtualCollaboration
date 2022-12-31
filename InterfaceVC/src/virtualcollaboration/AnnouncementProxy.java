package virtualcollaboration;

public class AnnouncementProxy implements virtualcollaboration.Announcement {
  private String _endpoint = null;
  private virtualcollaboration.Announcement announcement = null;
  
  public AnnouncementProxy() {
    _initAnnouncementProxy();
  }
  
  public AnnouncementProxy(String endpoint) {
    _endpoint = endpoint;
    _initAnnouncementProxy();
  }
  
  private void _initAnnouncementProxy() {
    try {
      announcement = (new virtualcollaboration.AnnouncementServiceLocator()).getAnnouncement();
      if (announcement != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)announcement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)announcement)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (announcement != null)
      ((javax.xml.rpc.Stub)announcement)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public virtualcollaboration.Announcement getAnnouncement() {
    if (announcement == null)
      _initAnnouncementProxy();
    return announcement;
  }
  
  public java.lang.String addAnnouncementt(java.lang.String announcement0, int groupID) throws java.rmi.RemoteException{
    if (announcement == null)
      _initAnnouncementProxy();
    return announcement.addAnnouncementt(announcement0, groupID);
  }
  
  public java.lang.String delAnnouncementt(int announceID) throws java.rmi.RemoteException{
    if (announcement == null)
      _initAnnouncementProxy();
    return announcement.delAnnouncementt(announceID);
  }
  
  public java.lang.String[] seeAnnouncements(int groupID) throws java.rmi.RemoteException{
    if (announcement == null)
      _initAnnouncementProxy();
    return announcement.seeAnnouncements(groupID);
  }
  
  
}