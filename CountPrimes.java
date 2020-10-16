class Solution {
    public int countPrimes(int n) {
        int c=0;
        for(int i=2;i<n;i++){
            if(isPrime(i))
                c++;
        }
       return c; 
    }
    public boolean isPrime(int num){
        for(int i=2; i*i<=num;i++){
            if(num%i==0) return false;
        }
            return true;
    } 

}
