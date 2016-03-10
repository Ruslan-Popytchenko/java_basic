public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object objE)   {
        if (this == objE)   {
            return true;
        }
        if (objE instanceof  ComplexNumber) {
            ComplexNumber cn = (ComplexNumber)objE;
            if ((this.getRe() == cn.getRe()) && (this.getIm() == cn.getIm()))   {
                return true;
            }   else    {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode()    {
        String s = Double.toHexString(getRe()) + Double.toHexString(getIm());
        return s.hashCode();
    }
}