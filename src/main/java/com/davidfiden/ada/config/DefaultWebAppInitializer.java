package com.davidfiden.ada.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

//public class DefaultWebAppInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletContext) {
//    	
//    	// Create the 'root' Spring application context
//        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//        rootContext.register(DefaultRootConfig.class);
//        rootContext.refresh();
//        
//        // Manage the lifecycle of the root appcontext
//        servletContext.addListener(new ContextLoaderListener(rootContext));
//        servletContext.setInitParameter("defaultHtmlEscape", "true");
//
//        // Create the dispatcher servlet's Spring application context
//        AnnotationConfigWebApplicationContext dispatcherContext = new AnnotationConfigWebApplicationContext();
//        dispatcherContext.register(DefaultWebMvcConfig.class);
//        
//        // Register and map the dispatcher servlet
//        DispatcherServlet dispatcherServlet = new DispatcherServlet(dispatcherContext);
//        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", dispatcherServlet);
//        registration.setLoadOnStartup(1);
//        registration.addMapping("/");
//    }
//
////	public void onStartup(ServletContext container) throws ServletException {
////
////		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
////		ctx.register(DefaultWebMvcConfig.class);
////		ctx.setServletContext(container);
////
////		ServletRegistration.Dynamic servlet = container.addServlet(
////				"dispatcher", new DispatcherServlet(ctx));
////
////		servlet.setLoadOnStartup(1);
////		servlet.addMapping("/");
////	}
//}
