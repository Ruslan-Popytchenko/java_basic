/**
 * Created by Ruark on 27.03.2016.
 */
public class AsciiCharSequence implements java.lang.CharSequence {

    private byte[] vals;

    AsciiCharSequence(byte[] init)  {
        vals = new byte[init.length];
        for(int i = 0; i < init.length; i++)    {
            this.vals[i] = init[i];
        }
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end)    {
        byte[] sub = new byte[end - start];
        int j = 0;
        for(int i = start; i < end; i++)   {
            sub[j++] = this.vals[i];
        }

        AsciiCharSequence ret = new AsciiCharSequence(sub);

        return ret;
    }

    @Override
    public char charAt(int index)   {
        return (char)this.vals[index];
    }

    @Override
    public int length() {
        return this.vals.length;
    }

    public String toString()    {
        return new String(this.vals);
    }

}
