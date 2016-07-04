package com.bandi.thrift.service;

import org.apache.thrift.TException;

import com.bandi.thrift.data.ComplexMap;
import com.bandi.thrift.data.ComplexStruct;
import com.bandi.thrift.data.multiplicationService;

public class ThriftHandler implements multiplicationService.Iface {

	@Override
	public int multiply(int a, int b) throws TException {
		return a * b;
	}

	@Override
	public ComplexMap returnComplexMap() throws TException {
		return new ComplexMap();
	}

	@Override
	public void test(ComplexStruct complexStruct) throws TException {
		System.out.println("Test Called");
		System.out.println("is optional field set? "+complexStruct.isSetOptionalString());
	}
}
