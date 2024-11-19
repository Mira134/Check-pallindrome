import java.util.*;

class P{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string as an input to check weather it is pallindrome or not");
        String input = scanner.nextLine();
        if(isPallindrome(input)){
            System.out.println(input+"is a pallindrome string");
        }
        else
        {
            System.out.println(input+"is not a pallindrome string");
        }
    }
    public static boolean isPallindrome(String str) {
        int left = 0,right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}