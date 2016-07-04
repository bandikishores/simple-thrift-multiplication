package com.bandi.thrift.server;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import com.bandi.thrift.data.multiplicationService;
import com.bandi.thrift.service.ThriftHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThriftServer {
	private static final int port = 9090;
	public static multiplicationService.Processor<multiplicationService.Iface> processor;

	public static void main(String[] args) {
		try {
			processor = new multiplicationService.Processor<multiplicationService.Iface>(new ThriftHandler());

			new Thread(() -> {
				simple(processor);
			}).start();

		} catch (Exception x) {
			x.printStackTrace();
		}
	}

	public static void simple(multiplicationService.Processor<multiplicationService.Iface> processor) {
		try {
			TServerTransport serverTransport = new TServerSocket(port);
			TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));

			System.out.println("Starting the simple server at port " + port + " ... ");
			server.serve();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
