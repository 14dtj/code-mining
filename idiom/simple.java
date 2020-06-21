System.out.println("Hello World");

for(int i=0;i<10;i++)
  System.out.println("Hello");

void finish(String name){
  System.out.println("My job here is done. Goodbye " + name);
}

int square(int x){
  return x*x;
}

class Point{
  double x;
  double y;
}

for(Item x : items ){
	doSomething( x );
}

for(int i=0;i<items.length;i++){
	doSomething( items[i] );
}

items.stream().forEach(item -> doSomething(item));

for (int i = 0; i < items.length; i++) {
    T x = items[i];
    System.out.printf("Item %d = %s%n", i, x);
}

for (int i = 0; i < items.size(); i++) {
    T x = items.get(i);
    System.out.printf("Item %d = %s%n", i, x);
}

for (int x; x < list.size(); x++) {
	System.out.println("index " + x + " value " + list.get(x));
}