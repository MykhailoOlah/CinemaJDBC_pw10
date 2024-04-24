package com.olah.cinema.persistence.service.validator.impl.TicketHandlerImpl;

import com.olah.cinema.persistence.entity.Ticket;
import com.olah.cinema.persistence.service.validator.contract.TicketHandler;

public class RowNumberHandlerImpl implements TicketHandler {
	private TicketHandler nextTicketHandler;

	@Override
	public void validate(Ticket ticket) {
		if (ticket.getRowNumber() <= 0) {
			ticket.getValidationMessages().add("Номер ряду повинен бути більшим за 0");
		}
		if (nextTicketHandler != null) {
			nextTicketHandler.validate(ticket);
		}
	}

	@Override
	public void setNextHandler(TicketHandler ticketHandler) {
		nextTicketHandler = ticketHandler;
	}
}
