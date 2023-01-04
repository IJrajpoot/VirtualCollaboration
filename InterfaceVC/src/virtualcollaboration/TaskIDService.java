/**
 * TaskIDService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface TaskIDService extends javax.xml.rpc.Service {
    public java.lang.String getTaskIDAddress();

    public virtualcollaboration.TaskID getTaskID() throws javax.xml.rpc.ServiceException;

    public virtualcollaboration.TaskID getTaskID(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
