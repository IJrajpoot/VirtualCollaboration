/**
 * Task.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface Task extends java.rmi.Remote {
    public java.lang.String addTask(java.lang.String task, java.lang.String date, java.lang.String time, int groupID) throws java.rmi.RemoteException;
    public java.lang.String addSpTask(java.lang.String task, java.lang.String date, java.lang.String time, java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String delTask(int taskID) throws java.rmi.RemoteException;
    public java.lang.String[] userApproval(int userID) throws java.rmi.RemoteException;
    public java.lang.String getUserID(java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String getTaskID(int userID) throws java.rmi.RemoteException;
    public java.lang.String rejectTask(int taskID) throws java.rmi.RemoteException;
    public java.lang.String[] seeTask(int groupID) throws java.rmi.RemoteException;
}
