package com.olah.cinema.persistence.service.validator;

public interface Handler<E, T extends Handler<E, T>>{

	void validate(E e);

	void setNextHandler(T t);
}
