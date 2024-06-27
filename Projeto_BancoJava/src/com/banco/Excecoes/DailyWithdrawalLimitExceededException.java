package com.banco.Excecoes;

public class DailyWithdrawalLimitExceededException extends Exception {
    public DailyWithdrawalLimitExceededException() {
        super();
    }

    public DailyWithdrawalLimitExceededException(String message) {
        super(message);
    }
}

