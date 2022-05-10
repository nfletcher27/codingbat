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

def near_hundred(n):
   return (n > 189 and n < 211) or (n > 89 and n < 111)

def missing_char(str, n):
  return str[:n] + str[n+1:]
 
def monkey_trouble(a_smile, b_smile):
  if a_smile == b_smile:
    return True
  else:
    return False
  
def parrot_trouble(talking, hour):
  if talking and (hour < 7 or hour > 20):
    return True
  return False

def pos_neg(a, b, negative):
  if negative:
    return a < 0 and b < 0
  else:
    return (a < 0 and b > -1) or (b < 0 and a > -1)

def front_back(str):
  if(len(str) == 1):
    return str
  return str[len(str)-1:len(str)] + str[1:len(str)-1] + str[0:1]

def sum_double(a, b):
  if a == b:
    return (a+b)*2
  else:
    return a+b

def makes10(a, b):
  return (a == 10 or b == 10) or (a+b == 10)

def not_string(str):
  if str[0:3] == "not":
    return str
  else:
    return "not " + str

def front3(str):
  if(len(str) < 3):
    return str[0:] + str[0:] + str[0:]
  else:
    return str[0:3] + str[0:3] + str[0:3]
