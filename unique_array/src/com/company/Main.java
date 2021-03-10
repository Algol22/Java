package com.company;

public class Main {

    public static int[] b = {1,2,3,4,5,2,8,9,10,11,12,13};

    public static boolean check(int [] nums){
        boolean outcome=true;

        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length && outcome == true; j++){
                System.out.println(nums[i]+ "kkk" +nums[j]);
                if(nums[i]==nums[j]) {
                    outcome = false;
                }

                }

            }
        return outcome;
        }




    public static void main(String[] args) {
	// write your code here

        System.out.println(Main.check(b));
    }
}
