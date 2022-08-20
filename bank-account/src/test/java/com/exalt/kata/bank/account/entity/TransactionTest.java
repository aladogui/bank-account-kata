package com.exalt.kata.bank.account.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

class TransactionTest {

  @Test
  void should_initialize_transaction() {
    Amount thousand = new Amount(1000);

    Transaction firstTransaction = new Transaction(thousand, LocalDate.now(), Operation.DEPOSIT);

    assertEquals(thousand, firstTransaction.getAmount());
    assertEquals(LocalDate.now(), firstTransaction.getDate());
  }

  @Test
  void should_add_deposit_transaction_to_account() {

    Amount thousand = new Amount(1000);

    Account account = new Account(Amount.builder().value(0).build());

    Transaction firstTransaction = new Transaction(new Amount(1000), LocalDate.now(),
        Operation.DEPOSIT);

    account.deposit(firstTransaction);

    assertEquals(thousand, account.getBalance());

  }

  @Test
  void should_withdraw_transaction_to_account() {

    Amount zero = new Amount(0);

    Account account = new Account(new Amount(1000));

    Transaction firstTransaction = new Transaction(new Amount(1000), LocalDate.now(),
        Operation.RETRIEVE);

    account.withdrawal(firstTransaction);

    assertEquals(zero, account.getBalance());

  }

}