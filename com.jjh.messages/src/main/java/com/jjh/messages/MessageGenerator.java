package com.jjh.messages;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java.util.logging.Logger;

public class MessageGenerator {

  private static final Logger logger = Logger.getLogger(MessageGenerator.class.getName());

  public String getMessage() {
    logger.setLevel(Level.INFO);
    logger.info("Info information");
    String message = "Welcome, today is";
    Date date = Calendar.getInstance().getTime();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    String strDate = dateFormat.format(date);
    return message + " " + strDate;
  }

}

