class Task implements Runnable {
	int i;
	Task(int i) {
		this.i = i;
	}
	@Override
	public void run() {
		f(i);
	}
}

ExecutorService executor = Executors.newFixedThreadPool(4);
for (int i = 1; i <= 1000; i++) {
	Task task = new Task(i);
	executor.submit(task);
}
executor.awaitTermination(10L, TimeUnit.MINUTES);
System.out.println("Finished");

ExecutorService executor = Executors.newFixedThreadPool(4);
for (int i = 1; i <= 1000; i++) {
	Task task = new Task(i);
	executor.submit(() -> f(i));
}
executor.awaitTermination(10L, TimeUnit.MINUTES);
System.out.println("Finished");

var y = x.stream().filter(p).collect(Collectors.toList());

byte[] encoded = Files.readAllBytes(Paths.get(f));
String lines = new String(encoded, StandardCharsets.UTF_8);

System.err.format("%d is negative\n",x);

String x = args[0];

Instant d = Instant.now();

int i = x.indexOf(y);

String x2 = x.replace(y, z);

BigInteger x = new BigInteger("3", 10).pow(247);

String s = new DecimalFormat("0.0%").format(x);

BigInteger z = x.pow(n);

static BigInteger binom(int N, int K) {
    BigInteger ret = BigInteger.ONE;
    for (int k = 0; k < K; k++) {
        ret = ret.multiply(BigInteger.valueOf(N-k))
                 .divide(BigInteger.valueOf(k+1));
    }
    return ret;
}

BitSet x = new BitSet(n);

Random r = new Random(s);

Random rand = new Random(System.currentTimeMillis());

public class Echo {
    public static void main(final String... args) {
        out.println(join(" ", args));
    }
}
