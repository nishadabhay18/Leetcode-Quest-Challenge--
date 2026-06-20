class Solution {
    // TC-> O(logs.length) SC-> O(n)
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        int prevTime=0;
        for(String log: logs){
            String[] str=log.split(":");
            int id=Integer.parseInt(str[0]);
            String type=str[1];
            int timestamps=Integer.parseInt(str[2]);
            if(type.equals("start")){
                if(st.size()!=0) ans[st.peek()]+=timestamps-prevTime;
                st.push(id);
                prevTime=timestamps;
            }else{ // end is inclusive thats why time+1
                ans[st.pop()]+=timestamps-prevTime+1;
                prevTime=timestamps+1;
            }
        }
        return ans;
    }
}