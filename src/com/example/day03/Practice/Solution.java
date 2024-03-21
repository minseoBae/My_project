package com.example.day03.Practice;


public class Solution {
    static int idx = 0;
    static int answer = 0;

    public static void main(String args[])
    { solution("AAAAE"); }
    public static int solution(String word) {
        dfs(word, "");
        System.out.println(answer);
        return answer;
    }
    public static void dfs(String word, String text) {
        if(answer > 0) {
            return;
        }
        if(word.equals(text)) {
            answer=idx;
        }
        idx++;
        if(text.length()==5) {
            return;
        }
        dfs(word, text+"A");
        dfs(word, text+"E");
        dfs(word, text+"I");
        dfs(word, text+"O");
        dfs(word, text+"U");
    }
}