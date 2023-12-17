class Assignment_1 {

  public static void main(String args[]) {
    // Question 1
    System.out.println();
    int n = 8;
    // I
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (j == n / 2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print(" ");
      //   N
      for (int j = 0; j < n; j++) {
        if (j == 0 || j == n - 1 || i == j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print(" ");
      // E
      for (int j = 0; j < n; j++) {
        if (j == 0 || i == 0 || i == n - 1 || i == n / 2) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.print(" ");
      // U
      for (int j = 0; j < n; j++) {
        if (j == 0 || j == n - 1 || i == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      //  R
      System.out.print(" ");
      for (int j = 0; j < n; j++) {
        if (
          j == 0 ||
          (i == 0 && j < n - 1) ||
          (j == n - 1 && i < n / 2 && i != 0) ||
          (i == n / 2 && j < n - 1) ||
          (i == j && i > n / 2)
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print(" ");
      //   O
      for (int j = 0; j < n; j++) {
        if (
          (i == 0 && j < n - 1 && j != 0) ||
          (i == n - 1 && j != 0 && j < n - 1) ||
          (j == n - 1 && i != 0 && i != n - 1) ||
          ((j == 0 && i != 0 && i != n - 1))
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print(" ");

      for (int j = 0; j < n; j++) {
        if (j == 0 || j == n - 1 || i == j) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    System.out.println();
    // Question 2
    int num = 4;
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.print(i + 1);
      }
      System.out.println();
    }
    System.out.println();

    // Question 3
    int num_2 = 14;
    for (int i = 0; i < num_2; i++) {
      for (int j = 0; j < num_2; j++) {
        if (
          i == 0 ||
          j == 0 ||
          i == num_2 - 1 ||
          j == num_2 - 1 ||
          (i > 0 && i < num_2 / 2 && j <= num_2 / 2 - i) ||
          (j >= num_2 / 2 && i > 0 && i <= num_2 / 2 && j >= num_2 / 2 + i)
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // Question 4
    int num_3 = 14;
    for (int i = 0; i < num_3; i++) {
      for (int j = 0; j < num_3; j++) {
        if (
          i >= num_3 / 2 &&
          (i - j >= num_3 / 2 || i - (num_3 - j - 1) >= num_3 / 2) ||
          (i == num_3 - 2 && (j == num_3 / 2))
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    // Question 5
    System.out.println();
    int num_4 = 14;
    for (int i = 0; i < num_4; i++) {
      for (int j = 0; j < num_4; j++) {
        if (
          i == 0 ||
          i == num_4 - 1 ||
          (i > 0 && i < num_4 / 2 && (i + j <= num_4 / 2)) ||
          (i >= num_4 / 2 && (i - j - num_4 / 2 >= 0))
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
