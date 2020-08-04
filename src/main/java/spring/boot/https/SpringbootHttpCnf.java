package spring.boot.https;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author: 程泰恒
 * @date: 2019/3/27 15:48
 */
@Component
public class SpringbootHttpCnf {

    private static final int HTTP_PORT = 1668;

    /**
     * 添加http端口
     */
    @Bean
    public TomcatServletWebServerFactory tomcatServletWebServerFactory() {
        final TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
        tomcatServletWebServerFactory.addAdditionalTomcatConnectors(addConnector());
        return tomcatServletWebServerFactory;
    }

    public Connector addConnector() {
        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(HTTP_PORT);
        connector.setScheme("http");
        return connector;
    }

    //TODO:http请求自动转为https

    /**
     * http请求自动转为https
     *
     * @return
     */
//    @Bean
//    public EmbeddedServletContainerFactory servletContainer() {
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");//confidential
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/*");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//        tomcat.addAdditionalTomcatConnectors(httpConnector());
//        return tomcat;
//    }

//    @Bean
//    public Connector httpConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(1667);
//        connector.setSecure(false);
//        connector.setRedirectPort(1667);
//        return connector;
//    }
}
