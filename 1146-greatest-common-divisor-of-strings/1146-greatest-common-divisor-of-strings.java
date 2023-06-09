class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcd_point=gcd(str1.length(),str2.length());
        return str1.substring(0,gcd_point);
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}

// 1.find the gcd of the lengths of the strings
// 2.then return the substring from 0 to the gcd returned  val.