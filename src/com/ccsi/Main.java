package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    String s="Hello World     ";
        System.out.println(lengthOfLastWord(s));
    }
    //Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
    //return the length of last word in the string.
    //从后面开始遍历，找到最后一个单词的最后一个字符开始计数，然后依次向前知道遇到第一个空格. 为了避免这个String
    //是空格结尾
    public static int lengthOfLastWord(String s){
        if(s==null||s.length()==0)return 0;
        int count=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            if(count==0){             //如果是末尾的空格，skip
                if(s.charAt(i)==' ')continue;
                else count++;
            }else{                    //开始计数之后碰到空格，停止循环，返回count
                if(s.charAt(i)==' ')break;
                else count++;
            }
        }
        return count;
    }
}
