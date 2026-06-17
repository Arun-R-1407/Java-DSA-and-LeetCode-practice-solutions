/*  Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"]
Output: 6 */



class Solution {

    public int mostWordsFound(String[] sentences) {

        int max = 0;
      
        for(int i = 0; i < sentences.length; i++) {
            
            int words = sentences[i].split(" ").length;
            if(words > max) {
                max = words;
            }
        }

        return max;
    }
}
