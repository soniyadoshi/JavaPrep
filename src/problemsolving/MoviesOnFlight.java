package problemsolving;

import java.util.*;
import java.util.stream.Collectors;

/*
You are on a flight and wanna watch two movies during this flight.
You are given List<Integer> movieDurations which includes all the movie durations.
You are also given the duration of the flight which is d in minutes.
Now, you need to pick two movies and the total duration of the two movies is less than or equal to (d - 30min).

Find the pair of movies with the longest total duration and return they indexes.
If multiple found, return the pair with the longest movie.

Example 1:

Input: movieDurations = [90, 85, 75, 60, 120, 150, 125], d = 250
Output: [0, 6]
Explanation: movieDurations[0] + movieDurations[6] = 90 + 125 = 215
is the maximum number within 220 (250min - 30min)
 */
public class MoviesOnFlight {
    public static void main(String args[]) {

        int movieDurations[] = {90, 85, 75, 60, 120, 150, 125};
        //60, 75, 85, 90,120, 125, 125, 150
        int d = 250;

        findMovies(movieDurations, d);
    }

    public static List<List<Integer>>  findMovies (int[] nums, int d) {

        List<List<Integer>> ls = new LinkedList<>();

        int target = d - 30;
        Map<Integer, List<Integer>> mp = new HashMap<>();

        //O(n)
        for (int i = 0; i<nums.length; i++) {
            mp.putIfAbsent(nums[i], new ArrayList<>());
            mp.get(nums[i]).add(i);
        }

        Arrays.sort(nums);

        int i =0;
        int j = nums.length-1;
        int maxMovieTime = Integer.MIN_VALUE;
        int pair[] = new int[2];
        int tempPair[] = new int[2];

        while (i < j) {

            int sum = nums[i] + nums[j];

            if (sum <= target) {
                if (sum > maxMovieTime ) {
                    maxMovieTime = sum;
                    pair[0] = nums[i];
                    pair[1] = nums[j];
                } else if (sum == maxMovieTime) {

                    List<Integer> list = new ArrayList<>();
                    if (mp.get(nums[i]).size() == 1 && mp.get(nums[j]).size() == 1) {
                        list.add(mp.get(nums[i]).get(0));
                        list.add(mp.get(nums[j]).get(0));
                    }
                    ls.add(list);
                }
                i++;
            } else {
                j--;
            }
        }

        List<Integer> list = new ArrayList<>();
        if (mp.get(pair[0]).size() == 1 && mp.get(pair[1]).size() == 1) {
            list.add(mp.get(pair[0]).get(0));
            list.add(mp.get(pair[1]).get(0));
        }
        ls.add(list);
        System.out.println(ls.toString());
    return ls;
    }
}
