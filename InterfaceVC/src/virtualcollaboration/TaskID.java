/**
 * TaskID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface TaskID extends java.rmi.Remote {
    public java.lang.String[] getTaskID(int groupID) throws java.rmi.RemoteException;
    public java.lang.String[] seeTask(int groupID) throws java.rmi.RemoteException;
}
