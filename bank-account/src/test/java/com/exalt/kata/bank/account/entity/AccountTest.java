package com.exalt.kata.bank.account.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

class AccountTest {

  @Test
  void should_initialize_account_with_one_hundred() {
    Amount hundred = new Amount(100);

    Account account = new Account(hundred);

    assertEquals(hundred, account.getBalance());

  }

  @Test
  void should_withdrawal_five_hundred_from_one_thousand() {
    Amount thousand = new Amount(1000);

    Account account = new Account(thousand);

    LocalDate withdrawalDate = LocalDate.of(2022, 8, 20);
    Amount fiveHundred = new Amount(500);

    Transaction firstTransaction = new Transaction(new Amount(500), withdrawalDate,
        Operation.RETRIEVE);

    account.withdrawal(firstTransaction);

    assertEquals(fiveHundred, account.getBalance());
  }

  @Test
  void should_deposit_five_hundred() {
    Amount zero = new Amount(0);

    Account account = new Account(zero);

    LocalDate depositDate = LocalDate.of(2022, 8, 20);
    Amount fiveHundred = new Amount(500);

    Transaction transaction = new Transaction(fiveHundred, depositDate,
        Operation.DEPOSIT);

    account.deposit(transaction);

    assertEquals(fiveHundred, account.getBalance());

  }

}