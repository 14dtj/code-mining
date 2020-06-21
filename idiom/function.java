public <A,B,C> Function<A,C> compose(Function<A,B> f, Function<B,C> g){
   return x -> g.apply(f.apply(x));
}

Function<Integer, Integer> addOne = i-> i + 1;
Function<Integer, String> toString = i-> i.toString();
Function<Integer, String> printIncremented = toString.compose(addOne);

default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

IntBinaryOperator simpleAdd = (a, b) -> a + b;
IntFunction<IntUnaryOperator> curriedAdd = a -> b -> a + b;
System.out.println(simpleAdd.applyAsInt(4, 5));
System.out.println(curriedAdd.apply(4).applyAsInt(5));

String t = s.substring(i,j);

boolean ok = s.contains(word);

class Graph{
  List<Vertex> vertices;

  static class Vertex{
    int id;
    List<Vertex> neighbours;
  }
}

class Graph{
  Set<Vertex> vertices;

  static class Vertex{
    int id;
    Set<Vertex> neighbours;
  }
}

String t = new StringBuilder(s).reverse().toString();

mainloop: for(int v:a){
	for(int w:b){
		if(v==w)
			continue mainloop;
	}
	System.out.println(v);
}

mainloop: for(int i=0;i<m.length;i++)
	for(int j=0;j<m[i].length;j++)
		if(m[i][j]<0){
			System.out.println(m[i][j]);
			break mainloop;
		}

s.add(i, x);

Thread.sleep(5000);

TimeUnit.SECONDS.sleep(5);

String t = s.substring(0,5);

int n = s.length();
String t = s.substring(n-5,n);

String s = "This is a very long string which needs " +
           "to wrap across multiple lines because " +
           "otherwise my code is unreadable.";

String[] chunks = s.split("\\s+");

for(;;){
	// Do something
}

while(true) {
	// Do something	
}

m.containsKey(k)

m.containsValue(v)

String y = String.join(", ", x);

int s = 0;
for (int i : x) {
  s += i;
}
String s=((Integer)i).toString();

String s = Integer.parseInt(i);

String s = Integer.toString(i);

String s = String.valueOf(i);

String s = "" + i;