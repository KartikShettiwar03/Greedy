import java.util.*;
import java.util.Comparator;
public class prblm_1_ {
    // public static void main(String args[]){
    //     int start[] = {1,3,0,5,8,5};
    //     int end[] = {2,4,6,7,9,9};
    //     int maxAct = 0;
    //     ArrayList<Integer>ans = new ArrayList<>();
    //     maxAct = 1;
    //     ans.add(0);
    //     int lastEnd = end[0];
    //     for(int i=1 ; i<end.length ; i++){
    //         if(start[i]>=lastEnd){
    //             maxAct++;
    //             ans.add(i);
    //             lastEnd = end[i];
    //         }
    //     }

    //     System.out.println(ans);
    // }
    //Sorting condition
    public static void main(String g[]){
        int start[] = {1,2,3,1};
        int end[] = {2,3,3,4};

        int activities[][] = new int[start.length][3];
        for(int i=0 ; i<start.length ; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }//yaha per index start and end as it is store kiya

        //comparators are interface for sorting java obj
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2])); // lambda fn
        //end ka base pe sorted 
        //hum ko ans ques k diye hue array k index pe hona to jo idx store kiya tha ab kaam aayega na

        int maxAct = 0;
        ArrayList<Integer>ans = new ArrayList<>();
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1 ; i<end.length ; i++){
            if(activities[i][1]>=lastEnd){
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        } 

        System.out.println(ans);
    }
}
