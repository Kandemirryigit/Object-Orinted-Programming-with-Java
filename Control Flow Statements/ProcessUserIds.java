public class ProcessUserIds {
    public static void main(String[] args){
        int[] userIds={101,-5,205,0,302,-1,400};

        for(int userId:userIds){
            if(userId<=0){
                continue;  // Skip invalid user IDs
            }
            System.out.println("Processing User Id: "+userId);
        }

        System.out.println("User ID Process finished");
    }
}
