package com.inti.exception;

public class TailleTelephoneException extends Exception {

	private static final long serialVersionUID = 1L;

	public TailleTelephoneException() {
		super("la taille du numéro de téléphone n'est pas respectée!");
	}
}
