package org.nwolfhub.nwolfhubfrontend;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("projects")
public class Projects extends VerticalLayout {
    public Projects() throws InterruptedException {
        VerticalLayout layout2 = new VerticalLayout();
        Label text = new Label("Restarted NWOLFHUB");
        text.getStyle().set("color", "white");
        layout2.add(text);
        layout2.setAlignItems(Alignment.CENTER);
        layout2.addClickListener((ComponentEventListener<ClickEvent<VerticalLayout>>) verticalLayoutClickEvent -> {
            UI.getCurrent().getPage().setLocation("/");
        });
        add(layout2);
        add(new Index.Divider());
        Label l = new Label();
        l.getElement().setProperty("innerHTML", "Nothing special is here for now. Yet you can always visit my <a href=https://github.com/s0m31-hub>Github</a> to check smaller projects!");
        add(l);
    }
}
