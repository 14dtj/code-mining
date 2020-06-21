/**
 * 连接数据库
 */

 try {

       ServerAddress serverAddress = new ServerAddress($address,$port);
       List<ServerAddress> addrs = new ArrayList<ServerAddress>();
       addrs.add(serverAddress);


       MongoCredential credential = MongoCredential.createScramSha1Credential("username", "databaseName", "password".toCharArray());
       List<MongoCredential> credentials = new ArrayList<MongoCredential>();
       credentials.add(credential);


       MongoClient mongoClient = new MongoClient(addrs,credentials);


 } catch (Exception e) {
     $handleException
 }