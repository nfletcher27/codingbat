# Warmup 1

def sleep_in(weekday, vacation):
  if vacation:
    return True
  elif weekday:
    return False
  else: 
    return True

def diff21(n):
  if n > 21:
    return abs(n-21)*2
  else:
    return abs(n-21)
