
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n  = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int ans = 0;

        int[] arr = new int[n];


        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            int first = arr[i];
            for(int j=i+1; j<n; j++){
                if(first< arr[j] && (arr[j]-first ) > ans ){
                    ans = arr[j]-first;
                }
            }
        }

        System.out.println(ans);





        }
    }