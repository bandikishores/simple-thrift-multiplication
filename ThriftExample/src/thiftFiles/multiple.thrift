namespace java multipleTutorial

typedef i32 int

struct complexStruct
{
	1: required string someString
}

struct complexMap
{
	1: optional map<i16, list<i16>> complexMap
}

service multiplicationService
{
	int multiply(1:int a, 2:int b);
	
	complexMap returnComplexMap();
}

