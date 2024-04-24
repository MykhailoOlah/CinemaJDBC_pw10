package com.olah.cinema.persistence.service.validator.contract;

import com.olah.cinema.persistence.entity.Cinema;
import com.olah.cinema.persistence.service.validator.Handler;

public interface CinemaHandler extends Handler<Cinema, CinemaHandler> {

	@Override
	void validate(Cinema cinema);

	@Override
	void setNextHandler(CinemaHandler cinemaHandler);
}
