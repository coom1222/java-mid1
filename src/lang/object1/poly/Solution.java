package lang.object1.poly;

class Solution {
        public String solution(String[] arr) {
            String answer = "";

            for(int i = 0; i < arr.length; i++){
                answer += arr[i];
            }
            return answer;
        }


    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] arr = {"a", "b", "c"};
        System.out.println(sol.solution(arr));


    }


}

