package org.nwolfhub.nwolfhubfrontend;

import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.StreamResource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Route("contact")
public class Contact extends VerticalLayout {
    public Contact() throws FileNotFoundException {
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
        VerticalLayout layoutPrimary = new VerticalLayout();
        HorizontalLayout layout = new HorizontalLayout();
        StreamResource imageResource = new StreamResource("telegram.svg",
                () -> {
                    try {
                        return new FileInputStream("telegram.svg");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                });
        Image telegram = new Image(imageResource, "Telegram");
        telegram.setHeight("50%");
        telegram.setWidth("50%");
        telegram.addClickListener((ComponentEventListener<ClickEvent<Image>>) imageClickEvent -> {
            UI.getCurrent().getPage().setLocation("https://t.me/s0m31_tg");
        });
        imageResource = new StreamResource("vk.svg",
                () -> {
                    try {
                        return new FileInputStream("vk.svg");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                });
        Image vk = new Image(imageResource, "Vk");
        vk.addClickListener((ComponentEventListener<ClickEvent<Image>>) imageClickEvent -> {
            UI.getCurrent().getPage().setLocation("https://vk.com/s0m30ne");
        });
        vk.setWidth("50%");
        vk.setHeight("50%");
        layout.add(telegram);
        layout.add(vk);
        layoutPrimary.setWidth("100%");
        layoutPrimary.setAlignItems(Alignment.CENTER);
        layoutPrimary.add(layout);
        add(layoutPrimary);
    }
}
