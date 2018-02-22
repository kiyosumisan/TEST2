import java.io.*;

class Test2
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int sum = 0;
        int i = 0;
        for(i=1; i<=99; i++){
            if((i % num) == 0 || (i % 10) == num){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("‡Œv‚Í" + sum);
    }
}