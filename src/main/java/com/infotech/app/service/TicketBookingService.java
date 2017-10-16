package com.infotech.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.app.Dao.TicketBookingDao;
import com.infotech.app.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicketById(Integer ticketId) {
       ticketBookingDao.delete(ticketId);
	}

	public Ticket updateTicketById(Integer ticketId, String newEmail) {
		Ticket ticketFromDb=ticketBookingDao.findOne(ticketId);
		ticketFromDb.setEmail(newEmail);
		return ticketBookingDao.save(ticketFromDb);
	}

}
