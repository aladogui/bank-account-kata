package com.exalt.kata.bank.account.entity;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

@Data
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  private Amount balance = new Amount(0);


  public void withdrawal(final Amount amount, final LocalDate withdrawalDate) {
  }

  public void deposit(final Amount amount, final LocalDate depositDate) {
  }
}
