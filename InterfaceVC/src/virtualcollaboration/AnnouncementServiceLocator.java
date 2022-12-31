/**
 * AnnouncementServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public class AnnouncementServiceLocator extends org.apache.axis.client.Service implements virtualcollaboration.AnnouncementService {

    public AnnouncementServiceLocator() {
    }


    public AnnouncementServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AnnouncementServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Announcement
    private java.lang.String Announcement_address = "http://localhost:8080/virtualCollaboration/services/Announcement";

    public java.lang.String getAnnouncementAddress() {
        return Announcement_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AnnouncementWSDDServiceName = "Announcement";

    public java.lang.String getAnnouncementWSDDServiceName() {
        return AnnouncementWSDDServiceName;
    }

    public void setAnnouncementWSDDServiceName(java.lang.String name) {
        AnnouncementWSDDServiceName = name;
    }

    public virtualcollaboration.Announcement getAnnouncement() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Announcement_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAnnouncement(endpoint);
    }

    public virtualcollaboration.Announcement getAnnouncement(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            virtualcollaboration.AnnouncementSoapBindingStub _stub = new virtualcollaboration.AnnouncementSoapBindingStub(portAddress, this);
            _stub.setPortName(getAnnouncementWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAnnouncementEndpointAddress(java.lang.String address) {
        Announcement_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (virtualcollaboration.Announcement.class.isAssignableFrom(serviceEndpointInterface)) {
                virtualcollaboration.AnnouncementSoapBindingStub _stub = new virtualcollaboration.AnnouncementSoapBindingStub(new java.net.URL(Announcement_address), this);
                _stub.setPortName(getAnnouncementWSDDServiceName());
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
        if ("Announcement".equals(inputPortName)) {
            return getAnnouncement();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://virtualcollaboration", "AnnouncementService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://virtualcollaboration", "Announcement"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Announcement".equals(portName)) {
            setAnnouncementEndpointAddress(address);
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
