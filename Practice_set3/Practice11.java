public class Practice11 {
    static boolean isPalindrome(String str){

        // --------------String Builder Method------
        // String cleanedStr=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // String reversed=new StringBuilder(cleanedStr).reverse().toString();
        // return cleanedStr.equals(reversed);

        // --------- Using pointers----
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Aashish"));
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("12321"));
    }
}
