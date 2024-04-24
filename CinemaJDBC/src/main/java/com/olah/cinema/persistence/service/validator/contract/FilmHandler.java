package com.olah.cinema.persistence.service.validator.contract;

import com.olah.cinema.persistence.entity.Film;
import com.olah.cinema.persistence.service.validator.Handler;

public interface FilmHandler extends Handler<Film, FilmHandler> {

	@Override
	void validate(Film film);

	@Override
	void setNextHandler(FilmHandler filmHandler);
}
