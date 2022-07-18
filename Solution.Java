class Solution {
    public String convert(String s, int numRows) {
        //1 = high - -1 = low
        int zigZag = 1;
        int counter = 0;
        String arr[] = new String[numRows];
        for(int i = 0; i < numRows; i++)
        {
            arr[i] = "";
        }
        String result = "";
        for (int i = 0; i < s.length(); i++)
        {
            arr[counter] += s.charAt(i);
            if(numRows == 1)
                zigZag = 0;
            else if(counter == numRows - 1)
                zigZag = -1;
            else if (counter == 0)
                zigZag = 1;
            counter += zigZag;
        }
        for(int i = 0; i < numRows; i++)
        {
            result += arr[i];
        }
        return result;
        
    }
}