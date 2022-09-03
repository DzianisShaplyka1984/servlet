package com.academy.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class MyHttpAttributeListener implements HttpSessionAttributeListener {
  @Override
  public void attributeAdded(HttpSessionBindingEvent event) {
    System.out.println("Attribute with name " + event.getName() + " and value " + event.getValue() + " was added to session");
  }
}
