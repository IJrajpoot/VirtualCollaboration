/**
 * TaskIDServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public class TaskIDServiceLocator extends org.apache.axis.client.Service implements virtualcollaboration.TaskIDService {

    public TaskIDServiceLocator() {
    }


    public TaskIDServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaskIDServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaskID
    private java.lang.String TaskID_address = "http://localhost:8080/virtualCollaboration/services/TaskID";

    public java.lang.String getTaskIDAddress() {
        return TaskID_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaskIDWSDDServiceName = "TaskID";

    public java.lang.String getTaskIDWSDDServiceName() {
        return TaskIDWSDDServiceName;
    }

    public void setTaskIDWSDDServiceName(java.lang.String name) {
        TaskIDWSDDServiceName = name;
    }

    public virtualcollaboration.TaskID getTaskID() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaskID_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaskID(endpoint);
    }

    public virtualcollaboration.TaskID getTaskID(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            virtualcollaboration.TaskIDSoapBindingStub _stub = new virtualcollaboration.TaskIDSoapBindingStub(portAddress, this);
            _stub.setPortName(getTaskIDWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaskIDEndpointAddress(java.lang.String address) {
        TaskID_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (virtualcollaboration.TaskID.class.isAssignableFrom(serviceEndpointInterface)) {
                virtualcollaboration.TaskIDSoapBindingStub _stub = new virtualcollaboration.TaskIDSoapBindingStub(new java.net.URL(TaskID_address), this);
                _stub.setPortName(getTaskIDWSDDServiceName());
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
        if ("TaskID".equals(inputPortName)) {
            return getTaskID();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://virtualcollaboration", "TaskIDService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://virtualcollaboration", "TaskID"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaskID".equals(portName)) {
            setTaskIDEndpointAddress(address);
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
