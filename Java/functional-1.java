public List<Integer> doubling(List<Integer> nums) {
  nums.replaceAll(n -> n * 2);
  return nums;
}

public List<String> addStar(List<String> strings) {
  strings.replaceAll(str -> str + "*");
  return strings;
}

public List<String> copies3(List<String> strings) {
  strings.replaceAll(str -> str + str + str);
  return strings;
}
