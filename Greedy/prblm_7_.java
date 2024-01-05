
import java.util.Arrays;
import java.util.Collections;

public class prblm_7_ {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer costVer[] = {2,1,3,1,4};
        Integer costHor[] = {4,1,2};

        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());

        int ans = 0;
        int h=0;
        int v=0;
        int hp = 1;
        int vp = 1;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v]<=costHor[h]){
                ans += costHor[h]*vp;
                hp++;
                h++;
            }
            else{
                ans += costVer[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<costHor.length){
            ans += costHor[h]*vp;
            h++;
            hp++;
        }
        while(v<costVer.length){
            ans += costVer[v]*hp;
            v++;
            vp++;
        }

        System.out.println(ans);
    }
}
