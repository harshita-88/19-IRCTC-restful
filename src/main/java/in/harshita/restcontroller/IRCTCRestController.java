package in.harshita.restcontroller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.harshita.binding.Passenger;
import in.harshita.binding.Ticket;
import in.harshita.serviceImpl.ServiceImpl;

@RestController
public class IRCTCRestController {
	@Autowired
	private ServiceImpl service;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> getTicketdetails(@RequestBody Passenger p) {
		Ticket t =  service.getticket(p);
		return new ResponseEntity<> (t,HttpStatus.CREATED);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<Collection<Ticket>> getAllTickets(){
		Collection<Ticket> ct = service.getAll();
		return new ResponseEntity<>(ct,HttpStatus.OK); 
	}
	
	
}
