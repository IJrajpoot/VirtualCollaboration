/**
 * GroupIDServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public class GroupIDServiceLocator extends org.apache.axis.client.Service implements virtualcollaboration.GroupIDService {

    public GroupIDServiceLocator() {
    }


    public GroupIDServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GroupIDServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GroupID
    private java.lang.String GroupID_address = "http://localhost:8080/virtualCollaboration/services/GroupID";

    public java.lang.String getGroupIDAddress() {
        return GroupID_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GroupIDWSDDServiceName = "GroupID";

    public java.lang.String getGroupIDWSDDServiceName() {
        return GroupIDWSDDServiceName;
    }

    public void setGroupIDWSDDServiceName(java.lang.String name) {
        GroupIDWSDDServiceName = name;
    }

    public virtualcollaboration.GroupID getGroupID() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GroupID_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGroupID(endpoint);
    }

    public virtualcollaboration.GroupID getGroupID(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            virtualcollaboration.GroupIDSoapBindingStub _stub = new virtualcollaboration.GroupIDSoapBindingStub(portAddress, this);
            _stub.setPortName(getGroupIDWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGroupIDEndpointAddress(java.lang.String address) {
        GroupID_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (virtualcollaboration.GroupID.class.isAssignableFrom(serviceEndpointInterface)) {
                virtualcollaboration.GroupIDSoapBindingStub _stub = new virtualcollaboration.GroupIDSoapBindingStub(new java.net.URL(GroupID_address), this);
                _stub.setPortName(getGroupIDWSDDServiceName());
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
        if ("GroupID".equals(inputPortName)) {
            return getGroupID();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://virtualcollaboration", "GroupIDService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://virtualcollaboration", "GroupID"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GroupID".equals(portName)) {
            setGroupIDEndpointAddress(address);
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
