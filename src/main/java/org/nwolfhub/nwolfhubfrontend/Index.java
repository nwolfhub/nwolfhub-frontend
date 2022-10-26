package org.nwolfhub.nwolfhubfrontend;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Span
        ;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class Index extends VerticalLayout {
    public Index() {
        VerticalLayout layout2 = new VerticalLayout();
        Label text = new Label("Restarted NWOLFHUB");
        text.getStyle().set("color", "white");
        layout2.add(text);
        layout2.setAlignItems(Alignment.CENTER);
        add(layout2);
        add(new Divider());
        VerticalLayout indiv = new VerticalLayout();
        HorizontalLayout second = new HorizontalLayout();
        Button projects = new Button("My projects");
        projects.getStyle().set("background-color", "white").set("color", "black");
        projects.addClickListener((ComponentEventListener<ClickEvent<Button>>) buttonClickEvent -> {
            UI.getCurrent().getPage().setLocation("projects");
        });
        second.add(projects);
        Button contact = new Button("Contact me");
        contact.getStyle().set("background-color", "white").set("color", "black");;
        contact.addClickListener((ComponentEventListener<ClickEvent<Button>>) buttonClickEvent -> {
            UI.getCurrent().getPage().setLocation("contact");
        });
        second.add(contact);
        indiv.add(second);
        indiv.getStyle().set("margin", "15% auto");
        indiv.setAlignItems(Alignment.CENTER);
        add(indiv);
    }

    public static class Divider extends Span {
        public Divider() {
            getStyle().set("background-color", "white");
            getStyle().set("flex", "0 0 1px");
            getStyle().set("margin-top", "-10px");
            getStyle().set("align-self", "stretch");
        }
    }
}
