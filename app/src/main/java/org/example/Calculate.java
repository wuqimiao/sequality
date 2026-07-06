package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int getIndividualFee(int age) {
    int fee = 0;
    if (age < 13) {
      fee = 1000;
    } else if (age >= 13) {
      fee = 2000;
    }

    return fee;
  }

  public int getTotalFee(int age, int size) {
    int total = 0;

    if (size < 10) {
      total = getIndividualFee(age) * size;
    } else if (size >= 10) {
      total = getIndividualFee(age) * size * 9 / 10;
    }

    return total;
  }
}
