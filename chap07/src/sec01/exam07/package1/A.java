package sec01.exam07.package1;

public class A {
	protected String field;
	protected A() {
		
	}
	protected void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
