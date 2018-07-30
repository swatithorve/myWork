import java.util.Hashtable;

public class Anagram {

    public static void main(String[] args)
    {
        Solution s = new Solution();
        System.out.println(s.isAnagram("anagram","nagaram"));
        System.out.println(s.isAnagram("", "abc"));
        System.out.println(s.isAnagram("abc", "abcd"));
        System.out.println(s.isAnagram("", ""));

    }
}


class Solution {

    public boolean isAnagram(String s, String t)
    {
        if (s.length() == 0 || t.length() == 0)
            return true;
        else if(s.length() != t.length())
            return false;
        else {
            Hashtable<Character, Integer> ht = new Hashtable<>();
            for (int i=0; i < s.length(); i++)
            {
                if (ht.containsKey(s.charAt(i)))
                    ht.put(s.charAt(i),ht.get(s.charAt(i))+1);
                else
                    ht.put(s.charAt(i),1);
            }

            for (int i=0; i < t.length(); i++)
            {
                if (ht.containsKey(t.charAt(i))) {
                    ht.put(t.charAt(i), ht.get(t.charAt(i)) - 1);
                    if (ht.get(t.charAt(i)) < 0)
                        return false;
                }
                else
                    return false;

            }

            for (char i: ht.keySet())
            {
                if (ht.get(i) != 0 )
                    return false;
            }
            return true;

        }
    }
}



