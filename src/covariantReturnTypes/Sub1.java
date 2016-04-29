package covariantReturnTypes;

public class Sub1 extends Base {
	
	Sub1 () {}
	
	Sub1 getThis() {
		return this;
	}
}
