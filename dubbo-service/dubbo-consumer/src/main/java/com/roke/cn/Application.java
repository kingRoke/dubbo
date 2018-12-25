package com.roke.cn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;

@SpringBootApplication
public class Application implements EmbeddedServletContainerCustomizer{

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
//        // 关闭Banner
//        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {
		// TODO Auto-generated method stub
		container.setPort(8088);
	}
  
}
