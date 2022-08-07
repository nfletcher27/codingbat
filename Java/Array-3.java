public boolean canBalance(int[] nums) {
  int sum = 0;
  
  for(int i = 0; i < nums.length; i++) {
    sum += nums[i];
    int secondSum = 0;
    for(int j = i+1; j < nums.length; j++) {
      secondSum += nums[j];
    }
    if(sum == secondSum) return true;
  }
  return false;
}
