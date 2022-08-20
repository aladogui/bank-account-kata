package com.exalt.kata.bank.account.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmountTest {


  @Test
  void initializeAmount() {
    Amount amount = new Amount();

    amount.setValue(0);

    assertEquals(0, amount.getValue());
  }

  @Test
  void addAmount() {
    Amount amount = new Amount();

    amount.setValue(0);

    assertEquals(0, amount.getValue());

    amount.add(10);

    assertEquals(10, amount.getValue());

    amount.add(25);

    assertEquals(35, amount.getValue());
  }


}