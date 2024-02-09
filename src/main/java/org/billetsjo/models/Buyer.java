package org.billetsjo.models;


import java.util.Vector;
import org.springframework.web.bind.annotation;

@Entity
public class Buyer {

  @Id
  public int id;

  public String name;

  public Ticket  ticket;

  public Ticket getTicket() {
  return ticket;
  }

}