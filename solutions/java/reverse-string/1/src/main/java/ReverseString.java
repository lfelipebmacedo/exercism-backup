class ReverseString {

  String reverse(String inputString) {
    char[] result = new char[inputString.length()];
    for (int i = 0; i < inputString.length(); i++) {
      int index = (inputString.length() - 1) - i;
      result[i] = inputString.charAt(index);
    }
    return String.copyValueOf(result);
  }

}
