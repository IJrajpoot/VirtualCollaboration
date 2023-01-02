/**
 * Groups.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface Groups extends java.rmi.Remote {
    public java.lang.String createGroup(java.lang.String name, java.lang.String purpose) throws java.rmi.RemoteException;
    public java.lang.String addMembers(int groupID, java.lang.String[] users) throws java.rmi.RemoteException;
    public java.lang.String[] existingGroups(int userID) throws java.rmi.RemoteException;
}
