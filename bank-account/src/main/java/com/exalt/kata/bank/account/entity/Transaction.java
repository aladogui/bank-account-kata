package com.exalt.kata.bank.account.entity;/*
 * Copyright (c) 2022. @Ala DOGUI
 */

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


  private Amount amount;
  private LocalDate date;
  private Operation operation;


}
