class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) {
        return false;
            }

            HashMap<Character ,Integer>CountS=new HashMap<>();
            HashMap<Character ,Integer>CountT=new HashMap<>();

            for(int i=0;i<s.length();i++){
                char chS=s.charAt(i);
                char chT=t.charAt(i);

                CountS.put(chS,CountS.getOrDefault(chS,0)+1);
                CountT.put(chT,CountT.getOrDefault(chT,0)+1);

            }
                return CountS.equals(CountT);



        }
        

    }

