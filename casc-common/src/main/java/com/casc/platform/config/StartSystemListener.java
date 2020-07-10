package com.casc.platform.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartSystemListener implements ServletContextListener {
    //在application被创建时执行
    public void contextInitialized(ServletContextEvent sce) {
        // TODO Auto-generated method stub
        ServletContext application = sce.getServletContext();
        String contextPath = application.getContextPath();
        System.out.println(contextPath);
        application.setAttribute("APP_PATH", contextPath);
    }
}


