package com.exalt.kata.bank.account.entity;


import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class Transaction {


  public static final String SEPARATOR = "\t | ";
  private Amount amount = new Amount(0);
  private LocalDate date;
  private Operation operation;


  @Override
  public String toString() {
    return operation.toString()
        + SEPARATOR + date + SEPARATOR
        + amount.getValue();
  }

  public Transaction getWithdrawalTransaction() {
    return Transaction.builder().amount(new Amount(amount.getNegativeValue())).date(date)
        .operation(operation).build();
  }

  public Amount getBalanceAfterTransaction(Amount currentBalance) {
    return currentBalance.calculateAddition(amount);
  }


}
