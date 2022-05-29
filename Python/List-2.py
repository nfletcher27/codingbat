# List-2

def count_evens(nums):
  if len(nums) == 0:
    return 0
  count = 0
  for i in range(len(nums)):
    if nums[i] % 2 == 0:
      count += 1
  return count

def big_diff(nums):
  biggest = -100
  smallest = 100
  for i in nums:
    if i > biggest:
      biggest = i
    if i < smallest:
      smallest = i

  return biggest - smallest
