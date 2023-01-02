/**
 * GroupsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface GroupsService extends javax.xml.rpc.Service {
    public java.lang.String getGroupsAddress();

    public virtualcollaboration.Groups getGroups() throws javax.xml.rpc.ServiceException;

    public virtualcollaboration.Groups getGroups(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
