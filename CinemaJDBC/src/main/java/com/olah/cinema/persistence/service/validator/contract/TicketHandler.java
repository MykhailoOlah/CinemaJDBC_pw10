package com.olah.cinema.persistence.service.validator.contract;

import com.olah.cinema.persistence.entity.Ticket;
import com.olah.cinema.persistence.service.validator.Handler;

public interface TicketHandler extends Handler<Ticket, TicketHandler> {

	@Override
	void validate(Ticket ticket);

	@Override
	void setNextHandler(TicketHandler ticketHandler);
}