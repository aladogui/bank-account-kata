package com.exalt.kata.bank.account.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

@Data
@AllArgsConstructor
@Builder
public class Amount {

  private double value;

  public Amount() {
    this.value = 0;
  }

  public void add(final double value) {
    this.value += value;
  }

  public void subtract(final int value) {
    this.value -= value;
  }
}
