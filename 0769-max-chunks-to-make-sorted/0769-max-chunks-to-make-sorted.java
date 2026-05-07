class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || stack.peek() <= arr[i]) {
                stack.push(arr[i]);
            } else {
                int max = stack.pop();
                while (!stack.isEmpty() && stack.peek() > arr[i]) {
                    stack.pop();
                }

                stack.push(max);
            }
        }
        return stack.size();
    }
}