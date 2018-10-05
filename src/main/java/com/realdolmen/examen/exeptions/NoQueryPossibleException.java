package com.realdolmen.examen.exeptions;

public class NoQueryPossibleException extends Exception {

    private static final String MESSAGE = "There is no query possible here";

    public NoQueryPossibleException() {
        super(MESSAGE);
    }
}
