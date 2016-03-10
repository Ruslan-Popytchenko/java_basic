/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */
public static BigInteger factorial(int value) {
    return ((value == 1) ? BigInteger.valueOf(value) : BigInteger.valueOf(value).multiply(factorial(value - 1)));
}