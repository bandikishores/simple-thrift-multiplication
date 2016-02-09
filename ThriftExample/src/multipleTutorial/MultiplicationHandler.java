package multipleTutorial;

import org.apache.thrift.TException;

public class MultiplicationHandler implements multiplicationService.Iface
{
	@Override
	public int multiply(int a, int b) throws TException 
	{
		return a*b;
	}

	@Override
	public complexMap returnComplexMap() throws TException {
		return new complexMap();
	}
}
