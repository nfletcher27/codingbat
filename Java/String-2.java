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
