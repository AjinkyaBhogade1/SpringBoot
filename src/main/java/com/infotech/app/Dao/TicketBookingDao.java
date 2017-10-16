package com.infotech.app.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.infotech.app.entities.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
	
	

}
