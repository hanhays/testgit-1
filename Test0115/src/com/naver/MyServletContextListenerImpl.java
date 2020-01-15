package com.naver;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*@WebListener*/
public class MyServletContextListenerImpl 
					implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("SC 종료");
		
	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("SC 생성");
		
	}

}
