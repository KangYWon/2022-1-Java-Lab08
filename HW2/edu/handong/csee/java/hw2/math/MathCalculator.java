package edu.handong.csee.java.hw2.math;

/**
 * this is MathCalculator class
 */
public class MathCalculator {
    
    private String name;

    /**
     * this is setName Method
     * @param name enter name
     */
    public void setName(String name){
        this.name = name;
    }
    /**
     * This is string getName method 
     * @return name return
     */
    public String getName(){
        return name;
    }
    /**
     * this is getMax method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return return Max Number
     */
    public int getMax(int N1, int N2){
        if(N1>N2)
        return N1;
        else
        return N2;
    }
    /**
     * this is getMin method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return return Min Number
     */
    public int getMin(int N1, int N2){
        if(N1>N2)
        return N2;
        else
        return N1;
    }

    /**
     * this is getAbs method
     * @param N Number 
     * @return positive Number
     */
    public int getAbs(int N){
        if(N>0)
        return N;
        else 
        return -N;
    }

    /**
     * this is getSum method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return N1 plus N2
     */
    public int getSum(int N1, int N2){
        return N1+N2;
    }

    /**
     * this is getDiff method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return N1 minus N2
     */
    public int getDiff(int N1, int N2){
        if (N1>N2)
        return N1-N2;
        else 
        return N2-N1;
    }
    
    /**
     * this is getProduct method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return product
     */
    public int getProduct(int N1, int N2){
        return N1 * N2;
    }

    /**
     * this is getQuotient method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return Quotient
     */
    public int getQuotient(int N1, int N2){
        int A;
        A = N1/N2;
        return A;
    }
    /**
     * this is getRemainder method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return Remainder
     */
    public int getRemainder(int N1, int N2){
        int B;
        B = N1%N2;
        return B;
    }

    /**
     * this is getPower method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return power number
     */
    public int getPower(int N1, int N2){ 
        
         return (int) Math.pow(N1, N2);
    }

    /**
     * this is getFactorial method
     * @param N Number 
     * @return factorial
     */
    public int getFactorial(int N){ 
        int i,fact=1; 
        for(i=1;i<=N;i++){ 
            fact=fact*i;
        }
        return fact;
    }

    /**
     * this is getGcd method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return GCD 
     */
    public int getGcd(int N1, int N2){
        if (N1%N2 == 0) {
            return N2;
        }
        return getGcd(N2, N1 % N2);
    }
    /**
     * this is getLcm method
     * @param N1 Number 1 
     * @param N2 Number 2
     * @return LCM
     */
    public int getLcm(int N1, int N2){ 
        return N1 * N2 / getGcd(N1,N2);
    }
    /**
     * this it getSqare method
     * @param N Number 
     * @return Square
     */
    public int getSquare(int N){
        double result = Math.sqrt(N);
        return (int) result;
    }


}
