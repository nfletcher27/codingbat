// Warmup-1 questions

public boolean sleepIn(boolean weekday, boolean vacation) {
 if(weekday == false || vacation == true) {
   return true;
 } else {
   return false;
 }
}

public int diff21(int n) {
  if(n > 21) {
    return Math.abs((n-21)*2);
  } else {
    return Math.abs(n-21);
  }
}

public boolean nearHundred(int n) {
  if(n > 0) {
    if(Math.abs(n) > 189 && Math.abs(n) < 211) {
      return true;
    } else if(Math.abs(n) > 89 && Math.abs(n) < 111) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

public String missingChar(String str, int n) {
  return str.substring(0, n) + str.substring(n+1);
}

public String backAround(String str) {
  return str.substring(str.length()-1, str.length()) + str +
  str.substring(str.length()-1, str.length());
}

public boolean startHi(String str) {
  if(str.length() >= 2) {
    if(str.substring(0, 2).equals("hi")) {
      return true;
    } else {
      return false;
    }
  } else {
    return false;
  }
}

public boolean hasTeen(int a, int b, int c) {
  if((a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20)) {
    return true;
  } else {
    return false;
  }
}

public boolean mixStart(String str) {
  if(str.contains("ix")) {
    return true;
  } else {
    return false;
  }
}

public int close10(int a, int b) {
  if(a == b || Math.abs(a-10) == Math.abs(b-10)) {
    return 0;
  } else if(Math.abs(a-10) > Math.abs(b-10)) {
    return b;
  } else {
    return a;
  }
}

public boolean stringE(String str) {
  int eCount = 0;
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'e') {
      eCount++;
    } else {
      eCount += 0;
    }
  }
  if(eCount > 0 && eCount < 4) {
    return true;
  } else {
    return false;
  }
}

public String everyNth(String str, int n) {
 String finished = "";
    for(int i = 0; i <= str.length()-1; i += n) {
      finished += str.charAt(i);
    }
  return finished;
}

