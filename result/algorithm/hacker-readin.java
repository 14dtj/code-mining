/**
 * 标准输入
 */
public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();

        while(t-->0)
            {
                int n=in.nextInt();
                $result = $solve(n);
                System.out.println($result);
            }
}

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
$parse(br.readLine());