package org.nwolfhub.nwolfhubfrontend;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme("nwolfhub")
public class NwolfhubFrontendApplication implements AppShellConfigurator {

	public static void main(String[] args) {
		SpringApplication.run(NwolfhubFrontendApplication.class, args);
	}

}
