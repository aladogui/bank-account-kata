package com.exalt.kata.bank.account.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

@Data
@AllArgsConstructor
@Slf4j
public class StatementLine {

  private Transaction transaction;
  private Amount currentBalance;


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append(transaction.toString());
    sb.append("\t | ").append(currentBalance.getValue());
    return sb.toString();
  }


}
