package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public int getIndividualFee(int age) {
    if (age < 13) {
      return 1000;
    } else if (age >= 13) {
      return 2000;
    }

    return -1;
  }

  public int getTotalFee(int age, int size) {
    int total = 0;
    if (age <= 12) {
      total = 1000;
    } else if (age >= 13) {
      total = 2000;
    }

    if (size < 10) {
      return total * size;
    } else if (size >= 10) {
      return total * size * 9 / 10;
    }

    return -1;
  }
}
