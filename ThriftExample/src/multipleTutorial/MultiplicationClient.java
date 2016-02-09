package multipleTutorial;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class MultiplicationClient 
{
	public static void main(String[] args) 
	{
		try 
		{
			TTransport transport = new TSocket("localhost", 9090);
			TProtocol protocol = new TBinaryProtocol(transport);
			multiplicationService.Client client = new multiplicationService.Client(protocol);
			transport.open();
			int result = client.multiply(5, 2);
			// complexMap complex = client.returnComplexMap();
			transport.close();
			System.out.println("value of multiplication " + result);
		} 
		catch (TTransportException e) 
		{
			e.printStackTrace();
		} 
		catch (TException e) 
		{
			e.printStackTrace();
		}
	}

}
