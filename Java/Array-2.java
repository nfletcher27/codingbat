public String[] fizzBuzz(int start, int end) {
  String[] str = new String[end - start];
  int counter = 0;
  for(int i = start; i < end; i++) {
    if(i % 3 == 0 && i % 5 == 0) {
      str[counter] = "FizzBuzz";
    } else if(i % 3 == 0) {
      str[counter] = "Fizz";
    } else if(i % 5 == 0) {
      str[counter] = "Buzz";
    } else {
      str[counter] = String.valueOf(i);
    }
    counter++;
  }
  
  return str;
}
