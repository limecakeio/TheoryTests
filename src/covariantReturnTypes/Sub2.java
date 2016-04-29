package covariantReturnTypes;

public class Sub2 extends Sub1 {
	Sub2 () {}
	
	Sub2 getThis() {
		return this;
	}
}
