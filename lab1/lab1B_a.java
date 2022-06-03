public class Main{
    Client c = new Client();
    c.doAction();
}

public class Client{
    public void doAction(){
        System.out.println("Client: doAction");
        Server s = new Server();
        s.doService();
    }
}

public class Server{
    public void doService(){
        System.out.println("Server: doService");
    }
}

public class Server2 extends Server {
    System.out.println("Server2: doService");
}