package problemsolving;

public class codingTest2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int A[] = {2,2,2,3,3,3,3,4,5,5,5,5};
        System.out.println(new codingTest2().solution(A, 2));
    }

    int solution(int[] A, int K) {
        int n = A.length;
        int best = 0;
        int count = 0;
        for (int i = 0; i < n -K- 1; i++) {
            if (A[i] == A[i + 1])
                count = count + 1;
            else
                count = 0;
            if (count > best)
                best = count;
        }
        int result = best+1+K;

        return result;
    }
}
