BigInteger x = a.gcd(b);

BigInteger a = new BigInteger("123456789");
BigInteger b = new BigInteger("987654321");
BigInteger x = a.multiply(b).divide(a.gcd(b));

String s = Integer.toBinaryString(x);

Complex x = new Complex(-2.0, 3.0);
x = x.multiply(Complex.I);

do {
	someThing();
	someOtherThing();
} while(c);

float y = x;

int y = (int)x;

long y = Math.round(x);

int count = StringUtils.countMatches(s, t);

Pattern r = Pattern.compile("htt+p");

int c = Integer.bitCount(i);

public boolean addingWillOverflow(int x, int y){
    boolean willOverFlow = false;
    if(x > 0 && y > 0){
        if(y > (Integer.MAX_VALUE - x)){
            willOverFlow = true;
        }
    }
    if(x < 0 && y < 0){
       if(y < (Integer.MIN_VALUE - x)){
           willOverFlow = true;
       }
    }
    return willOverFlow;
}

static boolean multiplyWillOverflow(int x, int y) {
	return Integer.MAX_VALUE/x < y;
}

System.exit(0);

byte[] buf = new byte[1000000];

throw new IllegalArgumentException("Invalid value for x:" + x);

throw new IllegalArgumentException("The parameter _x is invalid because [...]")

static void control(Runnable f) {
    f.run();
}

int a = 0;
String b = "str";
System.out.println(((Object)a).getClass().getName());
System.out.println(b.getClass().getName());

long x = new File(path).length();

boolean b = s.startsWith(prefix);

boolean b = s.endsWith(suffix);

Date date = new Date(numberOfSecondsSinceEpoch  * 1000);

String x = new SimpleDateFormat("yyyy-MM-dd").format(d);

String x = String.format("%1$tY-%1$tm-%1$td", d)

Arrays.sort(items, c);

Collections.sort(items, c);

String s = System.getProperty("sun.java.command");

String path = this.getClass().getClassLoader().getResource("").getPath();

boolean blank = StringUtils.isBlank(s);

boolean blank = s.trim().isEmpty();

SortedMap<K, V> mymap = new TreeMap<>();
...
for(Map.Entry<K, V> e: mymap.entrySet())
	System.out.println("Key=" + e.getKey() + ", Value=" + e.getValue());

List<K> keys = new ArrayList<>(mymap.keySet());
Collections.sort(keys);
for(K k: keys)
	System.out.println("Key=" + k + ", Value=" + mymap.get(k));

var map = Map.of("a", 1, "d", 4, "c", 3, "b", 2);
new TreeMap<>(map).entrySet().forEach(System.out::println);

mymap.entrySet().stream().sorted(Entry.comparingByKey()).forEach(System.out::println);

boolean before = (d1.compareTo(d2) == -1);

String s2 = s1.replace(w, "");

int n = x.size();

int n = x.length;

Set<T> y = new HashSet<>(x);

Set<T> uniques = new HashSet<>(x);
x.clear();
x.addAll(uniques);

x = new ArrayList<T>(new HashSet<T>(x));

final HashSet<T> seen = new HashSet<T>();
final Iterator<T> listIt = x.iterator();
while (listIt.hasNext()) {
  final T curr = listIt.next();
  if (seen.contains(curr)) {
    listIt.remove();
  } else {
    seen.add(curr);
  }
}

Scanner in = new Scanner(System.in);
n = in.nextInt();

int len = 1024;
int p = 8888;
byte[] b = new byte[len];
try (DatagramSocket socket = new DatagramSocket(p)) {
  DatagramPacket packet = new DatagramPacket(b, len);
  socket.receive(packet);
}

enum Suit{
  SPADES,
  HEARTS,
  DIAMONDS,
  CLUBS;
}

assert isConsistent() : "State consistency violated";

static int binarySearch(final int[] arr, final int key) {
    final int index = Arrays.binarySearch(arr, key);
    return index < 0 ? - 1 : index;
}

static Object[] returnAnything() {
    return new Object[]{"a string", true};
}

public static void main (String[] args) {
    Object[] array = returnAnything();
    System.out.println(array[0]);
    System.out.println(array[1]);
}

static void breadthFirstSearch(Node root, Consumer<Node> f) {
    Queue<Node> queue = new LinkedList<>();
    queue.offer(root);

    while(!queue.isEmpty()) {
        Node polled = queue.poll();
        f.accept(polled);
        polled.children.forEach(a -> queue.offer(a));
    }
}

if (c1) {
   f1();
} else if (c2) {
   f2();
} else if (c3) { 
   f3();
}

long clock(Runnable f) {
    long t0 = System.currentTimeMillis();
    f.run();
    long t1 = System.currentTimeMillis();
    return t1 - t0;
}

ok = s.toLowerCase().contains(word.toLowerCase());

List<T> items = new ArrayList<>();
items.add(a);
items.add(b);
items.add(c);

List<T> items = Arrays.asList(a, b, c);

items.stream().findFirst().filter(item -> "x".equals(item)).ifPresent(removeIndex -> items.remove(removeIndex));

items.removeAll(Collections.singleton(x));

boolean b = s.matches("[0-9]*");

map.remove(k);

items1.forEach(System.out::println);
items2.forEach(System.out::println);

for (String item : items1) {
	System.out.println(item);
}
for (String item : items2) {
	System.out.println(item);
}

Stream.concat(
	items1.stream(), 
	items2.stream()
).forEach(System.out::println);

String s = Integer.toHexString(x);

Iterator<String> iter1 = items1.iterator();
Iterator<String> iter2 = items2.iterator();
while (iter1.hasNext() || iter2.hasNext()) {
	if (iter1.hasNext()) {
		System.out.println(iter1.next());
	}
	if (iter2.hasNext()) {
		System.out.println(iter2.next());
	}
}

IntStream.range(0, Math.max(items1.size(), items2.size()))
	.boxed()
	.flatMap(idx -> Stream.of(
		items1.size() > idx ? items1.get(idx) : null,
		items2.size() > idx ? items2.get(idx) : null
	))
	.filter(Objects::nonNull)
	.forEach(System.out::println);

boolean b = new File(fb).exists();

Logger LOGGER = Logger.getLogger(MyClass.class.getName());

LOGGER.info(msg);

String floatString = "14.5";
float x = Float.parseFloat(floatString);
double y = Double.parseFloat(floatString);

String t = s.replaceAll("[^\\x00-\\x7F]", "");



if (p.endsWith("/")) {
    p = p.substring(0, p.length() - 1);
}

p = p.replaceAll("/$", "");

String s = String.valueOf(c);

String s = Character.toString(c);

String s = c + "";

String s = = new Character(c).toString();

String t = s + i;

String r1 = c1.substring(1,3);
String g1 = c1.substring(3,5);
String b1 = c1.substring(5,7);

String r2 = c2.substring(1,3);
String g2 = c2.substring(3,5);
String b2 = c2.substring(5,7);

String r = String.format("%02X", (Integer.parseInt(r1, 16)+Integer.parseInt(r2, 16))/2 );
String g = String.format("%02X", (Integer.parseInt(g1, 16)+Integer.parseInt(g2, 16))/2 );
String b = String.format("%02X", (Integer.parseInt(b1, 16)+Integer.parseInt(b2, 16))/2 );

String c = "#" + r + g + b;

StringBuilder sb = new StringBuilder("#");
for(int i=0;i<3;i++) {
  String sub1 = c1.substring(1+2*i,3+2*i);
  String sub2 = c2.substring(1+2*i,3+2*i);
  int v1 = Integer.parseInt(sub1, 16);
  int v2 = Integer.parseInt(sub2, 16);
  int v = (v1 + v2)/2;
  String sub = String.format("%02X", v);
  sb.append(sub);
}
String c = sb.toString();

new File(filepath).delete();

String s = String.format("%03d", i);

static final String planet = "Earth";

switch(System.getProperty("sun.arch.data.model")) {
  case "64": 
    f64(); 
    break;
  case "32":
    f32();
    break;
}

elements.stream().map(e -> e*c).collect(Collectors.toList())

int x = items[items.length - 1];

var ab = new ArrayList<>(a);
ab.addAll(b);

String t = s.replaceFirst("^" + p, "");

int n = s.length();

int n = mymap.size();

List<String> stringList = new ArrayList<>();
stringList.add("hello")

String.format("%,d", 1000000);

double[] c = {(x1+x2)/2,(y1+y2)/2};

final File directory = new File(dirPath);
final File[] files = file.listFiles();

LocalDate t = LocalDate.now().plusDays(1);

ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
executorService.schedule(() -> _f(42), delayInSeconds, TimeUnit.SECONDS);

System.exit(0);

public class DisjointSetElement {
  private DisjointSetElement representative = this;

  public DisjointSetElement getRepresentative() {
    if (representative != this) {
      representative = representative.getRepresentative();
    }
    return representative;
  }

  public void union(DisjointSetElement other) {
    other.getRepresentative().representative = getRepresentative();
  }
}

List<String> lines = Files.readAllLines(new File(path).toPath());

Arrays.stream(data).map(i -> i * i).sum()

System.out.println(${word_selection}${});${cursor}

private static final Logger LOG = LoggerFactory.getLogger(${enclosing_type}.class);

private static final Logger LOG = LogManager.getLogger(${enclosing_type}.class);

private static final Logger LOG = Logger.getLogger(${enclosing_type}.class);

private static final Logger LOG = Logger.getLogger(${enclosing_type}.class.getName());

BufferedReader in = null;  
try {  
   in = new BufferedReader(new FileReader(${fileName}));  
   String line;  
   while ((line = in.readLine()) != null) {  
      ${process}  
   }  
}  
catch (FileNotFoundException e) {  
   logger.error(e) ;  
}  
catch (IOException e) {  
   logger.error(e) ;  
} finally {  
   if(in != null) in.close();  
}  
${cursor}

try (BufferedReader in = Files.newBufferedReader(Paths.get(${fileName:var(String)}),
                                                 Charset.forName(""UTF-8""))) {
    String line = null;
    while ((line = in.readLine()) != null) {
        ${cursor}
    }
} catch (IOException e) {
    // ${todo}: handle exception
}

${lock}.acquire();
try {
    ${line_selection}
    ${cursor}
} finally {
    ${lock}.release();
}

static enum Singleton {
    INSTANCE;

    private static final ${enclosing_type} singleton = new ${enclosing_type}();

    public ${enclosing_type} getSingleton() {
        return singleton;
    }
}
${cursor}

for (Entry<${keyType:argType(map, 0)}, ${valueType:argType(map, 1)}> ${entry} : ${map:var(java.util.Map)}.entrySet())
{
    ${keyType} ${key} = ${entry}.getKey();
    ${valueType} ${value} = ${entry}.getValue();
    ${cursor}
}

if( ${word_selection} != null ){
    ${cursor}
}

if( ${word_selection} == null ){
    ${cursor}
}

for (${iterable_type} ${iterable_element} : ${iterable}) {
    ${cursor}
}