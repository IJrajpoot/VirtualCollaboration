/**
 * TaskServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public class TaskServiceLocator extends org.apache.axis.client.Service implements virtualcollaboration.TaskService {

    public TaskServiceLocator() {
    }


    public TaskServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaskServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Task
    private java.lang.String Task_address = "http://localhost:8080/virtualCollaboration/services/Task";

    public java.lang.String getTaskAddress() {
        return Task_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaskWSDDServiceName = "Task";

    public java.lang.String getTaskWSDDServiceName() {
        return TaskWSDDServiceName;
    }

    public void setTaskWSDDServiceName(java.lang.String name) {
        TaskWSDDServiceName = name;
    }

    public virtualcollaboration.Task getTask() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Task_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTask(endpoint);
    }

    public virtualcollaboration.Task getTask(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            virtualcollaboration.TaskSoapBindingStub _stub = new virtualcollaboration.TaskSoapBindingStub(portAddress, this);
            _stub.setPortName(getTaskWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaskEndpointAddress(java.lang.String address) {
        Task_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (virtualcollaboration.Task.class.isAssignableFrom(serviceEndpointInterface)) {
                virtualcollaboration.TaskSoapBindingStub _stub = new virtualcollaboration.TaskSoapBindingStub(new java.net.URL(Task_address), this);
                _stub.setPortName(getTaskWSDDServiceName());
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
        if ("Task".equals(inputPortName)) {
            return getTask();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://virtualcollaboration", "TaskService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://virtualcollaboration", "Task"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Task".equals(portName)) {
            setTaskEndpointAddress(address);
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
