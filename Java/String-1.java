public String middleThree(String str) {
  return str.substring((str.length()/2)-1, str.length()/2+2);
}

public String startWord(String str, String word) {
  if(word.length() > str.length()) return "";
  if(str.substring(1, word.length()).equals(word.substring(1, word.length()))) {
    return str.substring(0, word.length());
  } else {
    return "";
  }
}
