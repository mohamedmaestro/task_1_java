public class bags {

    public static void main(String[] args) {
        
        System.out.println(bag(3, 1, 3));  
        System.out.println(bag(3, 1, 4));  
        System.out.println(bag(3, 2, 5)); 
        System.out.println(bag(1, 2, 6)); 
    }

    public static boolean bag(int small, int big, int goal) {
        
        int maxBigBags = goal / 5;
        int bigBagsToUse = Math.min(big, maxBigBags);

        
        int remaining = goal - (bigBagsToUse * 5);

        
        return small >= remaining;
    }
}
