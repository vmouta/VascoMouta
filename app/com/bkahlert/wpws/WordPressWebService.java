/**
 * WordPressWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.bkahlert.wpws;

public interface WordPressWebService extends javax.xml.rpc.Service {
    public java.lang.String getWordPressWebServiceHttpSoapEndpointAddress();

    public com.bkahlert.wpws.WordPressWebServicePortType getWordPressWebServiceHttpSoapEndpoint() throws javax.xml.rpc.ServiceException;

    public com.bkahlert.wpws.WordPressWebServicePortType getWordPressWebServiceHttpSoapEndpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
