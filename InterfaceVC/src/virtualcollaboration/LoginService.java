/**
 * LoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package virtualcollaboration;

public interface LoginService extends javax.xml.rpc.Service {
    public java.lang.String getLoginAddress();

    public virtualcollaboration.Login getLogin() throws javax.xml.rpc.ServiceException;

    public virtualcollaboration.Login getLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
