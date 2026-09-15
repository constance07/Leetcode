class Solution {
    public boolean checkIfPangram(String sentence) {
        
        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        HashMap<Character, Integer> letterFreq = new HashMap<>();

        for(char c: alphabet){
            letterFreq.put(c, 0);
        }

        for(char c: sentence.toCharArray()){
            letterFreq.replace(c, letterFreq.get(c) + 1);
        }

        for(char c: alphabet){
            if(letterFreq.get(c) < 1){
                return false;
            }
        }

        return true;

    }
}