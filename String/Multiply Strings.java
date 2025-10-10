class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length(), m = num2.length();
        int[] res = new int[n + m];

        // Multiply each digit like we do on paper
        for (int i = n - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';
                int sum = res[i + j + 1] + digit1 * digit2;
                res[i + j + 1] = sum % 10; // unit place
                res[i + j] += sum / 10;    // carry
            }
        }

        // Convert array to string, skipping leading zeros
        String result = "";
        for (int i = 0; i < res.length; i++) {
            if (result.isEmpty() && res[i] == 0) continue; // skip leading zeros
            result += res[i];
        }

        return result.isEmpty() ? "0" : result;
    }
}
