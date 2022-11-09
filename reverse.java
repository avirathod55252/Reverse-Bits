class Solution {

    static Long reversedBits(Long X) {

        long reverse =0;

        long remainder = 0;

        

        int n=1;

        

        while(n<=32){

            remainder = X%2;

            reverse = reverse*2 + remainder;

            X = X/2;

            n++;

        }

        

        return reverse;

    }

};
