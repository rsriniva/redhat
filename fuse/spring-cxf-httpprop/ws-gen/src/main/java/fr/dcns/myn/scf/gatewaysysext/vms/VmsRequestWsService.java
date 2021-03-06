package fr.dcns.myn.scf.gatewaysysext.vms;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0.fuse-71-047
 * 2013-09-30T11:26:31.628+10:00
 * Generated source version: 2.6.0.fuse-71-047
 * 
 */
@WebServiceClient(name = "VmsRequestWsService", 
                  wsdlLocation = "file:/home/jshepher/git-casework/redhat/fuse/spring-cxf-httpprop/ws-gen/src/main/resources/VmsPolling-1.1.wsdl",
                  targetNamespace = "http://vms.gatewaySysExt.scf.myn.dcns.fr/") 
public class VmsRequestWsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://vms.gatewaySysExt.scf.myn.dcns.fr/", "VmsRequestWsService");
    public final static QName VmsRequestWsPort = new QName("http://vms.gatewaySysExt.scf.myn.dcns.fr/", "VmsRequestWsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/jshepher/git-casework/redhat/fuse/spring-cxf-httpprop/ws-gen/src/main/resources/VmsPolling-1.1.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(VmsRequestWsService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/jshepher/git-casework/redhat/fuse/spring-cxf-httpprop/ws-gen/src/main/resources/VmsPolling-1.1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VmsRequestWsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VmsRequestWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VmsRequestWsService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VmsRequestWsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VmsRequestWsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public VmsRequestWsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns VmsRequestWsPortType
     */
    @WebEndpoint(name = "VmsRequestWsPort")
    public VmsRequestWsPortType getVmsRequestWsPort() {
        return super.getPort(VmsRequestWsPort, VmsRequestWsPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VmsRequestWsPortType
     */
    @WebEndpoint(name = "VmsRequestWsPort")
    public VmsRequestWsPortType getVmsRequestWsPort(WebServiceFeature... features) {
        return super.getPort(VmsRequestWsPort, VmsRequestWsPortType.class, features);
    }

}
