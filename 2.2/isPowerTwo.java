/**
 * Checks if given <code>value</code> is a power of two.
 *
 * @param value any number
 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
 */
public static boolean isPowerOfTwo(int value) {
    int bitm;

        bitm=1;
        while(bitm < Math.abs(value))
        {
                bitm*=2;
        }
        if (bitm == Math.abs(value))
            return true;
        else
            return false;
}