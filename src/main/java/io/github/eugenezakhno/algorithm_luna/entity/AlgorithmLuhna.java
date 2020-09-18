package io.github.eugenezakhno.algorithm_luna.entity;

public class AlgorithmLuhna {

    public static void main(String[] args) {
        String value = "5671 5756 5764 4657";
        System.out.println(Luna(value));
    }
    private static String Luna(final String value){
        int sum = 0;
        int nDigits = value.length();
        int parity = nDigits % 2;
        for(int i = nDigits; i > 0; i--){
            int digit = Character.getNumericValue(value.charAt(i-1));
            if(i%2 == parity){
                digit *= 2;
                if(digit > 9){
                    digit -= 9;
                }
                sum += digit;
            }
        }
        for(int i = nDigits; i > 0; i --){
            int digit = Character.getNumericValue(value.charAt(i-1));
            if(i % 2 != parity){
                sum += digit;
            }
        }
        if((((sum % 10) - 10) * -1) == 10){
            return (value + "0");
        }else{
            return (value + (((sum % 10) - 10) * -1));
        }
    }

}
