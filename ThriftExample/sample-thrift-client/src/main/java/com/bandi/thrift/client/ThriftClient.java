package com.bandi.thrift.client;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.bandi.thrift.data.ComplexMap;
import com.bandi.thrift.data.ComplexStruct;
import com.bandi.thrift.data.multiplicationService;

public class ThriftClient implements multiplicationService.Iface {

	private multiplicationService.Client client;

	private TTransport transport;

	public static void main(String[] args) throws TTransportException, TException {
		new ThriftClient().test(new ComplexStruct("abc"));
	}

	public ThriftClient(String ipAddress, int port) throws TTransportException {
		super();
		transport = new TSocket(ipAddress, port);
		TProtocol protocol = new TBinaryProtocol(transport);
		client = new multiplicationService.Client(protocol);
		transport.open();
	}

	public ThriftClient() throws TTransportException {
		super();
		transport = new TSocket("localhost", 9090);
		TProtocol protocol = new TBinaryProtocol(transport);
		client = new multiplicationService.Client(protocol);
		transport.open();
	}

	public int multiply(int a, int b) throws TException {
		return client.multiply(a, b);
	}

	public ComplexMap returnComplexMap() throws TException {
		return client.returnComplexMap();
	}

	public void test(ComplexStruct complexStruct) throws TException {
		client.test(complexStruct);
	}

	public void closeConnection() {
		if (transport != null && transport.isOpen()) {
			transport.close();
		}
	}

}
