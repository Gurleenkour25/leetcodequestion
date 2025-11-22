class Solution {

    // Custom reverse function
    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0, j = 0;

        // Skip leading spaces
        while (i < n && arr[i] == ' ') i++;

        // Process characters and remove extra spaces
        while (i < n) {

            // Copy non-space characters
            while (i < n && arr[i] != ' ') {
                arr[j++] = arr[i++];
            }

            // Skip extra spaces between words
            while (i < n && arr[i] == ' ') i++;

            // Add a single space if not at end
            if (i < n) {
                arr[j++] = ' ';
            }
        }

        // Resize the array effectively (string from 0 to j)
        String trimmed = new String(arr, 0, j);

        // Convert trimmed string back to char array
        char[] finalArr = trimmed.toCharArray();
        int len = finalArr.length;

        // Step 1: Reverse the entire string
        reverse(finalArr, 0, len - 1);

        // Step 2: Reverse each word
        int start = 0;
        for (i = 0; i <= len; i++) {
            if (i == len || finalArr[i] == ' ') {
                reverse(finalArr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(finalArr);
    }
}
