class Solution {
    public int numJewelsInStones(String J, String S) {
    if(J.length()==0 || S.length()==0) return 0;  
    int result=0;
    int count=0;
    HashSet<Character> seen= new HashSet<>();
     char ch[]=J.toCharArray();
        for (char c:ch){
            seen.add(c); 
        }
      char ch2[]=S.toCharArray();
        for(char i:ch2){
            if (seen.contains(i)){
                count++;
            }
        }
        result =count;
        return result;
    }
}
