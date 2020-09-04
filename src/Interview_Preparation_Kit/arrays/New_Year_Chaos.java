package Interview_Preparation_Kit.arrays;
/*
https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class New_Year_Chaos {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
       //version1 bazi testleri gecemedi
        /* int total = 0;

        for(int i = 0 ; i < q.length-1 ; i++){
            int count = 0 ;
            for (int j = i; j <= q.length ; j++) {

                    if(q[i] < j+1 && q[i] > q[i+1]){
                    count++;
                    }
                    if (q[i] != j+1 && q[i] > j+1) {
                        count++;
                    } else {
                        break;
                    }
                }

                if (count > 2) {
                    System.out.println("Too chaotic");
                    return;
                } else if (count <= 2) {
                    total += count;

                }
        }
        System.out.println(total);*/

        //version2 bazi testleri zamandan dolayi gecemedi
        /*int total = 0;
        for (int i = 0; i < q.length; i++) {
            int count = 0;
            for (int j = i+1; j < q.length ; j++) {
                if(q[i]> q[j]){
                    count++;
                }

            }
            if (count > 2) {
                System.out.println("Too chaotic");
                return;
            } else if (count <= 2) {
                total += count;

            }
        }
        System.out.println(total);
*/


    //version 3: tricky li testi gecmiyor.
      /*  int total = 0;
        int count = 0;
        for (int i = 0; i < q.length; i++) {
            if(q[i] - (i+1) > 2){
                System.out.println("Too chaotic");
                return;
            } else if(i+1 > q[i]){
                count += (i+1) - q [i];

            }

        }
        System.out.println(total);*/


    //verison 4
        int total = 0;
        for (int i = 0; i < q.length; i++) {
            int count = 0;
            for (int j = i+1; j < q.length ; j++) {
                if(q[i]> q[j]){
                    count++;
                    continue;
                }

            }
            if (count > 2) {
                System.out.println("Too chaotic");
                return;
            } else if (count <= 2) {
                total += count;

            }
        }
        System.out.println(total);

    }


    public static void main(String[] args) {

       // minimumBribes(new int[]{2,4,1,3,5});
       // minimumBribes(new int[]{2,4,3,1,5});
        minimumBribes(new int[]{2,1,5,3,4});
       // minimumBribes(new int[]{2,5,1,3,4});


    }
}
