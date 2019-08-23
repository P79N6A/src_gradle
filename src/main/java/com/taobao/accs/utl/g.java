package com.taobao.accs.utl;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class g extends ByteArrayInputStream {
    public int a() {
        return read() & 255;
    }

    public int b() {
        return (a() << 8) | a();
    }

    public byte[] c() throws IOException {
        byte[] bArr = new byte[available()];
        read(bArr);
        return bArr;
    }

    public g(byte[] bArr) {
        super(bArr);
    }

    public String a(int i) throws IOException {
        byte[] bArr = new byte[i];
        int read = read(bArr);
        if (read == i) {
            return new String(bArr, "utf-8");
        }
        throw new IOException("read len not match. ask for " + i + " but read for " + read);
    }
}
