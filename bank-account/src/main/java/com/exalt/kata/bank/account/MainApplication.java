package com.exalt.kata.bank.account;

import com.exalt.kata.bank.account.entity.Account;
import com.exalt.kata.bank.account.entity.Amount;
import com.exalt.kata.bank.account.entity.Operation;
import com.exalt.kata.bank.account.entity.Statement;
import com.exalt.kata.bank.account.entity.Transaction;
import java.time.LocalDate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

@Slf4j
@SpringBootApplication
public class MainApplication {

  public static void main(String[] args) {
    SpringApplication.run(MainApplication.class, args);

    // Initialize account
    Account account = new Account(Amount.of(0), new Statement());

    /*
     * US1 : In order to save money
     * As a bank client
     * I want to make a deposit in my account
     */
    Transaction firstDeposit = new Transaction(Amount.of(1000), LocalDate.of(2022, 8, 20),
        Operation.DEPOSIT);
    account.deposit(firstDeposit);

    Transaction secondDeposit = new Transaction(Amount.of(2000), LocalDate.of(2022, 8, 21),
        Operation.DEPOSIT);
    account.deposit(secondDeposit);

    /*
     * US2 : In order to retrieve some or all of my savings As a bank client I want
     * to make a withdrawal from my account
     */
    Transaction withdraw = new Transaction(Amount.of(500), LocalDate.of(2022, 8, 22),
        Operation.RETRIEVE);
    account.withdrawal(withdraw);

    /*
     * US3 : In order to check my operations As a bank client I want to see the
     * history (operation, date, amount, balance) of my operations
     */
    account.printStatement();
  }

}
