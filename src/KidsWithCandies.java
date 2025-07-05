

// There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

// Note that multiple kids can have the greatest number of candies.

 


import java.util.*;
import java.util.stream.Collectors;


public class KidsWithCandies {
    public static void main(String[] args) {

        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
        
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        return Arrays.stream(candies).mapToObj(x -> x + extraCandies >= Arrays.stream(candies)
                                               .max().getAsInt())
                                                .collect(Collectors.toList());
         
    }

    
}
