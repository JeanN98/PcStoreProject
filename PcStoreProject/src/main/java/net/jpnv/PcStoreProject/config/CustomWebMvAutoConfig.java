package net.jpnv.PcStoreProject.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@AutoConfigureAfter(DispatcherServletAutoConfiguration.class)
public class CustomWebMvAutoConfig implements WebMvcConfigurer{

		
		@Value("${upload.path}")
		public String uploadDir;
		
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
		    String myExternalFilePath = "file:"+uploadDir+"/";
		    registry.addResourceHandler("/pic/**").addResourceLocations(myExternalFilePath);
		}
}
