public String mixString(String a, String b) {
  int len = (a.length() < b.length()) ? a.length() : b.length();
  String fin = "";
  for(int i = 0; i < len; i++) {
    fin += a.charAt(i);
    fin += b.charAt(i);
  }
  fin += (a.length() > b.length()) ? a.substring(len, a.length()) : 
                                     b.substring(len, b.length());
  return fin;
}

public String zipZap(String str) {
  String str2 = "";
  if(str.length() < 3) return str;
  
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p') {
      str2 += "zp";
      i += 2;
    } else {
      str2 += str.charAt(i);
    }
  }
  
  return str2;
}
