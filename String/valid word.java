class Solution {
    public boolean isValid(String word) {
        if (word.length()<3)
        {
            return false;
        }
        int vowel=0;
        int cons=0;
        for (int i = 0; i < word.length(); i++) {
    char c = word.charAt(i);

    if (Character.isLetter(c)) {
        if ("aeiouAEIOU".indexOf(c) != -1)
        {
            vowel++;
        } else
         {
            cons++;
        }
    } 
    else if (!Character.isDigit(c))
     {
        return false;
    }
        }
    if (vowel < 1 || cons< 1) 
    {
    return false;
    }
        
    return true;
    }
}