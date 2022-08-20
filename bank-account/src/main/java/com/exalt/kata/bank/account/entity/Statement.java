package com.exalt.kata.bank.account.entity;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/*
 * Copyright (c) 2022. @Ala DOGUI
 */

@Data
@Slf4j
public class Statement {

  public static final String STATEMENT_HEADER = "Operation | Date\t       | Amount\t| Balance";

  private Deque<StatementLine> statementLines = new ArrayDeque<>();

  public void print() {
    log.info("***************** Begin statement account *****************\n");
    log.info(String.join("\u0332", STATEMENT_HEADER.split("", -1)));
    printStatementLines();
    log.info("***************** End statement account *****************");
  }

  public void printStatementLines() {
    Iterator<StatementLine> iterator = statementLines.descendingIterator();
    while (iterator.hasNext()) {
      log.info(iterator.next().toString());
    }
  }

  public void addLineContaining(final Transaction transaction, final Amount newCurrentBalance) {

    statementLines.offerLast(new StatementLine(transaction, newCurrentBalance));
  }
}
