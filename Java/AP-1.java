// AP-1 questions

//
public boolean scoresIncreasing(int[] scores) {
  
  for(int i = 0; i < scores.length-1; i++) {
    if(scores[i+1] < scores[i]) return false;
  }
  return true;
}

//
public List wordsWithoutList(String[] words, int len) {
  ArrayList<String> without = new ArrayList<String>();
  for(int i = 0; i < words.length; i++) {
    if(words[i].length() != len) without.add(words[i]);
  }
  return without;
}

//
public int sumHeights(int[] heights, int start, int end) {
  int counter = 0;
  for(int i = start; i < end; i++) {
    counter += Math.abs(heights[i]-heights[i+1]);
  }
  return counter;
}

//
public boolean scores100(int[] scores) {
  for(int i = 0; i < scores.length-1; i++) {
    if(scores[i] == 100 && scores[i] == scores[i+1]) return true;
  }
  return false;
}

//
public int wordsCount(String[] words, int len) {
  int counter = 0;
  for(int i = 0; i < words.length; i++) {
    if(words[i].toString().length() == len) counter++;
  }
  return counter;
}

//
public String[] wordsWithout(String[] words, String target) {
  int counter = 0;
  for(int i = 0; i < words.length; i++) {
    if(words[i].equals(target)) counter++;
  }
  ArrayList<String> without = new ArrayList<String>();
  for(int i = 0; i < words.length; i++) {
    if(!words[i].equals(target)) without.add(words[i]);
  }
  
  return without.toArray(new String[words.length-counter]);
}

//
public boolean scoresClump(int[] scores) {
  
  for(int i = 0; i < scores.length-2; i++) {
    if(Math.abs(scores[i]-(scores[i+1])) <= 2 && Math.abs(scores[i]-(scores[i+2]))
    <= 2 && Math.abs((scores[i+1])-(scores[i+2])) <= 2) {
      return true;
    }
  }
  return false;
}

//
public int matchUp(String[] a, String[] b) {
  int count = 0;
  for(int i = 0; i < a.length; i++) {
    if(!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)) count++;
  }
  return count;
}

//
public int scoresSpecial(int[] a, int[] b) {
  return findBiggest(a) + findBiggest(b);
}

public int findBiggest(int[] n) {
  
  int biggest = 0;
  for(int i = 0; i < n.length; i++) {
    if(n[i] > biggest && n[i] % 10 == 0) {
      biggest = n[i];
    }
  }
  return biggest;
}
  
