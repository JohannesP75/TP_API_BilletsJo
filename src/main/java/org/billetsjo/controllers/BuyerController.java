package org.billetsjo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class BuyerController {

  public String name;

  public Ticket ticket;

  public Ticket getTicket() {
  return ticket;
  }

}