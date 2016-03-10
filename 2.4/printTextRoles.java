private String printTextPerRole(String[] roles, String[] textLines) {
      StringBuilder[] strArr = new StringBuilder[roles.length];
        int[] strIdx = new int[roles.length];
        int j = 0;

        for(String l : textLines) {
            j++;
            for(int i = 0; i < roles.length; i++)   {
                if(l.substring(0, roles[i].length()).compareTo(roles[i]) == 0)   {
                    strIdx[i]++;
                    StringBuilder s = new StringBuilder();
                    s.append(j).append(')').append(l.substring(roles[i].length()+1, l.length()));
                    //if(i != roles.length-1) {
                        s.append('\n');
                    //}
                    if (strArr[i] == null)
                        strArr[i] = new StringBuilder();
                    strArr[i].append(s);

                    break;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < roles.length; i++)   {
            result.append(roles[i]).append(':').append('\n');
            result.append(strArr[i]);
            //if(i != roles.length-1) {
                result.append('\n');
                //result.append('\r');
            //}
        }
        
        return result.toString();
}