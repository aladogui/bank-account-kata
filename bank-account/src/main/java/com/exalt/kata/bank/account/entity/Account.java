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
  private Statement statement;

  public Account(final Amount balance) {
    this.balance = balance;
    this.statement = new Statement();
  }

  public void withdrawal(final Transaction transaction) {

    addTransaction(transaction.getWithdrawalTransaction());
  }

  public void deposit(final Transaction transaction) {
    addTransaction(transaction);
  }

  private void addTransaction(Transaction transaction) {
    Amount balanceAfterTransaction = transaction.getBalanceAfterTransaction(balance);
    balance = balanceAfterTransaction;
    statement.addLineContaining(transaction, balanceAfterTransaction);
  }

  public void printStatement() {
    statement.print();
  }
}
