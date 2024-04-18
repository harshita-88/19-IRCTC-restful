package in.harshita.service;

import java.util.Collection;

import in.harshita.binding.Passenger;
import in.harshita.binding.Ticket;


public interface Service {
	
	public Ticket getticket(Passenger p);
	public Collection<Ticket> getAll();

}
