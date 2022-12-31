/**
 * Login.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface Login extends java.rmi.Remote {
    public boolean login(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String delUser(java.lang.String password, java.lang.String email) throws java.rmi.RemoteException;
    public java.lang.String createUser(java.lang.String name, java.lang.String password, java.lang.String email) throws java.rmi.RemoteException;
}
