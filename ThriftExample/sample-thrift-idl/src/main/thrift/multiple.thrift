namespace java com.bandi.thrift.data

typedef i32 int

struct ComplexStruct
{
	1: required string someString,
	2: optional string optionalString
}

struct ComplexMap
{
	1: optional map<i16, list<i16>> complexMap
}

service multiplicationService
{
	int multiply(1:int a, 2:int b);
	
	ComplexMap returnComplexMap();
	
	void test(1: required ComplexStruct complexStruct);
}

