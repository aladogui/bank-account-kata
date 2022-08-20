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
    assertEquals(Operation.DEPOSIT, firstTransaction.getOperation());
  }


}