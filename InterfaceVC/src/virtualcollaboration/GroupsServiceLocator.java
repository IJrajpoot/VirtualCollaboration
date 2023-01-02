/**
 * GroupsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public class GroupsServiceLocator extends org.apache.axis.client.Service implements virtualcollaboration.GroupsService {

    public GroupsServiceLocator() {
    }


    public GroupsServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GroupsServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Groups
    private java.lang.String Groups_address = "http://localhost:8080/virtualCollaboration/services/Groups";

    public java.lang.String getGroupsAddress() {
        return Groups_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GroupsWSDDServiceName = "Groups";

    public java.lang.String getGroupsWSDDServiceName() {
        return GroupsWSDDServiceName;
    }

    public void setGroupsWSDDServiceName(java.lang.String name) {
        GroupsWSDDServiceName = name;
    }

    public virtualcollaboration.Groups getGroups() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Groups_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGroups(endpoint);
    }

    public virtualcollaboration.Groups getGroups(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            virtualcollaboration.GroupsSoapBindingStub _stub = new virtualcollaboration.GroupsSoapBindingStub(portAddress, this);
            _stub.setPortName(getGroupsWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGroupsEndpointAddress(java.lang.String address) {
        Groups_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (virtualcollaboration.Groups.class.isAssignableFrom(serviceEndpointInterface)) {
                virtualcollaboration.GroupsSoapBindingStub _stub = new virtualcollaboration.GroupsSoapBindingStub(new java.net.URL(Groups_address), this);
                _stub.setPortName(getGroupsWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Groups".equals(inputPortName)) {
            return getGroups();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://virtualcollaboration", "GroupsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://virtualcollaboration", "Groups"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Groups".equals(portName)) {
            setGroupsEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
