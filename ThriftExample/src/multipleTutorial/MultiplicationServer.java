package multipleTutorial;

import org.apache.http.util.Args;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class MultiplicationServer {
	
	public static MultiplicationHandler handler;

	public static multiplicationService.Processor processor;
	  
	public static void main(String[] args)
	{
		try 
		{
		      handler = new MultiplicationHandler();
		      processor = new multiplicationService.Processor(handler);

		      Runnable simple = new Runnable() 
		      {
		        public void run() 
		        {
		          simple(processor);
		        }
		      };      
		     
		      new Thread(simple).start();
		} 
		catch (Exception x) 
		{
		    x.printStackTrace();
		}
	}
	
	public static void simple(multiplicationService.Processor processor) 
	{
	    try 
	    {
	      TServerTransport serverTransport = new TServerSocket(9090);
	      TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

	      System.out.println("Starting the simple server...");
	      server.serve();
	    } 
	    catch (Exception e) 
	    {
	      e.printStackTrace();
	    }
	  }

}
