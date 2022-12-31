/**
 * Announcement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface Announcement extends java.rmi.Remote {
    public java.lang.String addAnnouncementt(java.lang.String announcement, int groupID) throws java.rmi.RemoteException;
    public java.lang.String delAnnouncementt(int announceID) throws java.rmi.RemoteException;
    public java.lang.String[] seeAnnouncements(int groupID) throws java.rmi.RemoteException;
}
