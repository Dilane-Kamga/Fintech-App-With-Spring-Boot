package com.peerlender.lendingengine.domain.exception;

public class LoanApplicationNotFoundException extends RuntimeException{

    public LoanApplicationNotFoundException(long loanApplicationId) {
        super("loan application with id " +loanApplicationId+ " was not found");
    }
}
