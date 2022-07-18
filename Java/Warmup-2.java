public int stringMatch(String a, String b) {
  int subMatch = 0;
  if(a.length() > b.length()) {
    for(int i = 0; i < b.length()-1; i++) {
    if(a.substring(i, i+2).equals(b.substring(i, i+2))) {
      subMatch++;
    }
  }
  } else {
    for(int i = 0; i < a.length()-1; i++) {
    if(a.substring(i, i+2).equals(b.substring(i, i+2))) {
      subMatch++;
    }
  }
  }
  return subMatch;
}

public String stringYak(String str) { 
  String noYak = "";
  for(int i = 0; i < str.length(); i++) {
    if(i+2 < str.length() && str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
      i += 2;
    } else {
      noYak += str.charAt(i);
    }
  }
  return noYak;
}

