package covariantReturnTypes;

public class Base {
	/** Base is the top class in the hierarchy*/
	Base() {
	}

	Base getThis() {
		return this;
	}

	public static void main(String[] args) {
		/**Initialising 3 Objects from different classes all of which contain the method getThis()*/
		Base b1 = new Base();
		Base s1 = new Sub1();
		Base s2 = new Sub2();

		/** Running getThis() for each object to show that each method overrides the other 
		 * but returns a different type - covariant return type*/
		System.out.println("Running getThis() on Base:\n -> " + b1.getThis().getClass() + "\n");
		System.out.println("Running getThis() on Sub1:\n -> " + s1.getThis().getClass() + "\n");
		System.out.println("Running getThis() on Sub2:\n -> " + s2.getThis().getClass() + "\n");

		/*Why is this important?
		 * Overriding methods have to have the SAME return type. If a class extends another, however,
		 * it can return a "different" return-type as long as this different type is part of the class hierarchy.
		 * **/                                                           
	}

}
