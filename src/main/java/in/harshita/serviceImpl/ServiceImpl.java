package in.harshita.serviceImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;

import in.harshita.binding.Passenger;
import in.harshita.binding.Ticket;
import in.harshita.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
	
	Map<Integer, Ticket> db = new HashMap<>();

	@Override
	public Ticket getticket(Passenger p) {
		Ticket t = new Ticket();
		
		BeanUtils.copyProperties(p, t);
		
		Random r = new Random();
		int id = r.nextInt(5);
		t.setTicket_no(id);
		t.setStatus("CONFIRMED");
		db.put(id, t);
		return t;
	}

	@Override
	public Collection<Ticket> getAll() {
		return db.values();
	}

}
