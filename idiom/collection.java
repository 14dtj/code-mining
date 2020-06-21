Map<String,Integer> x = new HashMap<>();
x.put("one", 1);
x.put("two", 2);

final Map<String, Integer> x = new HashMap<String, Integer>() {{
    put("one", 1);
    put("two", 2);
    put("three", 3);
}};

class BinTree<T extends Comparable<T>>{
   T value;
   BinTree<T> left;
   BinTree<T> right;
}

Collections.shuffle(x);

x.get((int)(Math.random()*x.size()))

x.get(ThreadLocalRandom.current().nextInt(0, x.size()))

boolean contains(int[] list, int x){
  for(int y:list)
    if( y==x )
      return true;
  return false;
}

boolean <T> contains(T[] list, T x){
  if( x==null){
    for(T y:list)
      if( y==null )
        return true;
  }else{
    for(T y:list)
      if( x.equals(y) )
        return true;
  }
  return false;
}

list.contains(x)

for (Map.Entry<Object, Object> entry : mymap.entrySet()) {
    Object k = entry.getKey();
    Object x = entry.getValue();
    System.out.println("Key=" + k + ", Value=" + x);
}

double pick(double a, double b){
	return a + (Math.random() * (b-a));
}

int pick(int a, int b){
	return a + new Random().nextInt(b - a + 1);
}

void dfs(BinTree bt) {
	if (bt.left != null) {
		dfs(bt.left);
        }
	f(bt);
	if (bt.right != null) {
		dfs(bt.right);
	}
}

class BinTree {
	// ...

	void dfs() {
		if( left != null )
			left.dfs();
		f(this);
		if( right != null )
			right.dfs();
	}
}

class BinTree<T> {
	// ...

	void dfs(Consumer<BinTree<T>> f) {
		if( left != null )
			left.dfs(f);
		f.accept(this);
		if( right != null )
			right.dfs(f);
	}
}

class Tree<K,V> {
  K key;
  V deco;
  List<Tree<K,V>> children = new ArrayList<>();
}

static <T> void reverse(List<T> x){
	int n = x.size();
	for(int i=0;i<n/2;i++){
		T tmp = x.get(i);
		x.set(i, x.get(n-i-1));
		x.set(n-i-1, tmp);
	}
}

Collections.reverse(x);

Collections.reverse(x);
static class Position{
	int i;
	int j;
}

Position search(int[][] m, int x){
	for(int i=0;i<m.length;i++)
		for(int j=0;j<m[i].length;j++)
			if(m[i][j] == x){
				Position pos= new Position();
				pos.i = i;
				pos.j = j;
				return pos;
			}
	return null;
}

T tmp = a;
a = b;
b = tmp;

int i = Integer.parseInt(s);

int i = new Integer(s).intValue();

String s = String.format("%.2f", x);

String s = "ネコ";

https://gist.github.com/f7c174c53efaba4d8575

double[][] x = new double[m][n];

double[][][] x = new double[m][n][p];

Arrays.sort(items, new Comparator<Item>(){
	public int compare(Item a, Item b){
		return a.p - b.p;
	}
});

Collections.sort(items, new Comparator<Item>(){
	@Override
	public int compare(Item a, Item b){
		return a.p - b.p;
	}
});

items.stream().sorted(Comparator.comparing(x -> x.p))

items.remove(i);

final ExecutorService executor = Executors.newFixedThreadPool(NB_THREADS);
for (int i = 1; i <= 1000; i++) {
  executor.submit(() -> f(i));
}
executor.shutdown();

int f(int i){
	if(i==0)
		return 1;
	else
		return i * f(i-1);
}

int exp(int x, int n){
	if(n==0)
		return 1;
	if(n==1)
		return x;
	if(n%2==0)
		return exp(x*x, n/2);
	else
		return x * exp(x*x, (n-1)/2);
}

synchronized(lock){
  x = f(x);
}

Set<T> x = new HashSet<T>();