package com.company.declare;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() {
        try {
            int c = super.read();
            return (c == -1) ? c : Character.toLowerCase((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException();
    }

    public int read(byte[] b, int offset, int len) {
        int c = 0;
        try {
            c = super.read(b, offset, len);
            for (int i = offset; i < offset + c; i++) {
                b[i] = (byte) (Character.toLowerCase(b[i]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c;
    }
}
