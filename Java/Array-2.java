public int[] evenOdd(int[] nums) {
  
  ArrayList<Integer> odds = new ArrayList<Integer>();
  ArrayList<Integer> evens = new ArrayList<Integer>();
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 2 == 0) {
      evens.add(nums[i]);
    } else {
      odds.add(nums[i]);
    }
  }
  
  evens.addAll(odds);
  int[] arr = evens.stream().mapToInt(i -> i).toArray();
  return arr;
}


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

public boolean sameEnds(int[] nums, int len) {
  for(int i = 0; i < len; i++) {
    if(nums[i] != nums[nums.length - len + i]) return false;
    
  }
  return true;
}
