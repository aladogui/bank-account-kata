package com.exalt.kata.bank.account.entity;

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


  public void withdrawal(final Transaction transaction) {
  }

  public void deposit(final Transaction transaction) {
  }
}
