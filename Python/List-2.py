# List-2

def count_evens(nums):
  if len(nums) == 0:
    return 0
  count = 0
  for i in range(len(nums)):
    if nums[i] % 2 == 0:
      count += 1
  return count
