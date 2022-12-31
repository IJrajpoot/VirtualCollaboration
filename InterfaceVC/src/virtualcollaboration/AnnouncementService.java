/**
 * AnnouncementService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface AnnouncementService extends javax.xml.rpc.Service {
    public java.lang.String getAnnouncementAddress();

    public virtualcollaboration.Announcement getAnnouncement() throws javax.xml.rpc.ServiceException;

    public virtualcollaboration.Announcement getAnnouncement(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
