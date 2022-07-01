// Recursion 1

public int factorial(int n) {
  if(n <= 2) return n;
  return n * factorial(n-1);
}

public int bunnyEars(int bunnies) {
  if(bunnies == 0) return 0;
  return 2+bunnyEars(bunnies-1);
}

public int fibonacci(int n) {
  if(n <= 1) return n;
  return fibonacci(n-1) + fibonacci(n-2);
}

public int bunnyEars2(int bunnies) {
  if(bunnies == 0) return 0;
  if(bunnies == 1) return 2;
  if(bunnies % 2 == 0) return bunnyEars2(bunnies-1) + 3;
  return bunnyEars2(bunnies-1) + 2;
}

public int triangle(int rows) {
  if(rows <= 1) return rows;
  return rows + triangle(rows-1);
}

public int powerN(int base, int n) {
  if(n == 1) return base;
  if(n == 2) return base * base;
  return powerN(base, n-1) * base;
}
