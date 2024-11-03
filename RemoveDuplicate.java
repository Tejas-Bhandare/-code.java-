public class RemoveDuplicate {
    
    public static void removeDuplicate(String str, int idx, StringBuilder sb, boolean map[])
    {
        if(idx == str.length())
        {
            System.out.println(sb);
            return;
        }

        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true)
        {
            removeDuplicate(str, idx+1, sb, map);
        }
        else
        {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, sb.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = "aabgghabbhga";
        int idx = 0;
        boolean map [] = new boolean[26];
        removeDuplicate(str, idx, sb, map);
    }
}
