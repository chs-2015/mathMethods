/**
 * Author: Brandon B.
 * Date: 9-3-15
 */
 
public class mathMethods {
    
    public static void main(String[] args) {
    	double a = -379.22;
    	double b = 42.01;
    	double c = 3.728;
    	double d /* omg double d's hahahah!!!!AAA! */ = 3;
    	double e = 2;

		// Square root method
		double squareRoot = Math.sqrt(b);

		// The POWER RANGERS method
		// -- Really, this is just exponents.
		double power = Math.pow(d, e);

		// Absolute value method
		double absoluteValue = Math.abs(a);

		// Floor method
		// -- Returns the lowest whole number from a value.
		double floorIt = Math.floor(c);
		
		// Ceiling Method
		// -- Returns the highest whole number from a value.
		double newCeilingFan = Math.ceil(c);

		// Max method
		// -- Returns the larger of two values.
		// --- This is the most ridiculous thing I've ever seen.
		double maxTheDog = Math.max(b, d);

		// Min method
		// -- Returns the lower of two values.
		// --- Again this is ridiculous.
		double thanksPfeffer = Math.min(b, d);

		// Random method
		// -- Returns a random number >= 0 but <1.
		double neat;
		neat = Math.random();
		while (neat != 0) {
			neat = Math.random();
			System.out.println(neat);
		}

		double randomRodeo = Math.random();

		// Pi method
		double piratePi = Math.PI;

		// Round method
		double woodysRoundup = Math.round(a);

		// Print everything
		System.out.println(squareRoot);
		System.out.println(power);
		System.out.println(absoluteValue);
		System.out.println(floorIt);
		System.out.println(newCeilingFan);
		System.out.println(maxTheDog);
		System.out.println(thanksPfeffer);
		System.out.println(randomRodeo);
		System.out.println(piratePi);
		System.out.println(woodysRoundup);
    }
}
