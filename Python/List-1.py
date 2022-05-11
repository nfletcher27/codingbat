# List-1

def first_last6(nums):
  if nums[0] == 6 or nums[len(nums)-1] == 6:
    return True
  else:
    return False
  
def common_end(a, b):
  if a[0] == b[0] or a[len(a)-1] == b[len(b)-1]:
    return True
  else:
    return False

def reverse3(nums):
  swap = nums[0]
  nums[0] = nums[2]
  nums[2] = swap
  return nums

def middle_way(a, b):
  middle = []
  middle.append(a[1])
  middle.append(b[1])
  return middle

def same_first_last(nums):
  if(len(nums) > 0):
    return (nums[0] == nums[len(nums)-1])
  return False

def sum3(nums):
  return nums[0] + nums[1] + nums[2]

def max_end3(nums):
  if nums[0] > nums[2]:
    for i in range(len(nums)-1):
      nums[2] = nums[0]
      nums[i] = nums[0]
  else:
    for i in range(len(nums)-1):
      nums[1] = nums[2]
      nums[i] = nums[2]
  return nums

def make_ends(nums):
  nums2 = [nums[0], nums[len(nums)-1]]
  return nums2

def make_pi():
  return [3, 1, 4]

def rotate_left3(nums):
  temp = nums[1]
  nums[1] = nums[2]
  nums[2] = nums[0]
  nums[0] = temp
  return nums

def sum2(nums):
  if len(nums) == 0:
    return 0
  if len(nums) < 2:
    return nums[0]
  else:
    return nums[0] + nums[1]

def has23(nums):
  if 2 in nums or 3 in nums:
    return True
  return False
