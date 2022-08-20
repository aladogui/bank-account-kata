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
public class Transaction {


  private Amount amount = new Amount(0);
  private LocalDate date;
  private Operation operation;


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Transaction{");
    sb.append("amount=").append(amount);
    sb.append(", date=").append(date);
    sb.append(", operation=").append(operation);
    sb.append('}');
    return sb.toString();
  }
}
