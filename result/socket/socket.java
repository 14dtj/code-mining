 logger.info("服务器启动..");
  ServerSocket ss=new ServerSocket(SERVER_PORT);
  try {
    while (true) {
      Socket s=ss.accept();
      new Thread(new ServerThread(s)).start();
    }
  }
 catch (  Exception e) {
    e.printStackTrace();
  }
 finally {
  }
  
