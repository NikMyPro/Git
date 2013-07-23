package com.array;


public class ArrayToString{
    public static void main(String[] argv) throws Exception {
        String[] myArray = new String[] { "A", "a", "B" };
        String s = arrayToString(myArray);
        System.out.println(s);
    }
    
    
    public static String arrayToString(String[] strs) {
        if (strs.length == 0) { return ""; }
        StringBuffer sbuf = new StringBuffer();
        sbuf.append(strs[0]);
        for (int idx = 1; idx < strs.length; idx++) {
          sbuf.append(",");
          sbuf.append(strs[idx]);
        }
        return sbuf.toString();
      }
}