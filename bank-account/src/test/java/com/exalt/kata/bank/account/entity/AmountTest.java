package com.exalt.kata.bank.account.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmountTest {


  @Test
  void initializeAmount() {
    Amount zero = new Amount(0);
    Amount amount = new Amount();

    amount.setValue(0);

    assertEquals(zero, amount);
  }

  @Test
  void addAmount() {
    Amount zero = new Amount(0);
    Amount ten = new Amount(10);
    Amount thirtyFive = new Amount(35);
    Amount amount = new Amount();

    amount.setValue(0);

    assertEquals(zero, amount);

    amount.add(10);

    assertEquals(ten, amount);

    amount.add(25);

    assertEquals(thirtyFive, amount);
  }


  @Test
  void subtractAmount() {
    Amount zero = new Amount(0);
    Amount ten = new Amount(10);
    Amount thirtyFive = new Amount(35);

    Amount amount = new Amount();

    amount.setValue(35);

    assertEquals(thirtyFive, amount);

    amount.subtract(25);

    assertEquals(ten, amount);

    amount.subtract(10);

    assertEquals(zero, amount);
  }



}