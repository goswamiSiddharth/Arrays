package arrays;

import static java.lang.Math.*;

public class test {

  public static void main(String args[]) {

    String arr[] = { "w jrpihe zsyqn l dxchifbxlasaehj", "nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom",
        "xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg",
        "krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm",
        "rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr",
        "o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk",
        "hrvh efqvjilibdqxjlpmanmogiossjyxepotezo", "qstd zui nbbohtuk", "qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc" };
    System.out.println(arr.length);
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      // System.out.println(arr[i]);
      // char ch=arr[i].charAt(0);
      int len = arr[i].length();
      int c = 1;
      for (int j = i; j < len; j++) {
        char ch = arr[i].charAt(j);
        if (ch == ' ') {
          c++;
        }
      }
      if (c > max) {
        max = c;
      }
    }
    System.out.println(max);

  }
}
