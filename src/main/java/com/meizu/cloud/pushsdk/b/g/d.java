package com.meizu.cloud.pushsdk.b.g;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class d implements Serializable, Comparable<d> {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f27000a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b  reason: collision with root package name */
    public static final d f27001b = a(new byte[0]);
    private static final long serialVersionUID = 1;

    /* renamed from: c  reason: collision with root package name */
    final byte[] f27002c;

    /* renamed from: d  reason: collision with root package name */
    transient int f27003d;

    /* renamed from: e  reason: collision with root package name */
    transient String f27004e;

    d(byte[] bArr) {
        this.f27002c = bArr;
    }

    public static d a(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (i >= 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new d(bArr);
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + i);
        }
    }

    public static d a(String str) {
        if (str != null) {
            d dVar = new d(str.getBytes(n.f27029a));
            dVar.f27004e = str;
            return dVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static d a(byte... bArr) {
        if (bArr != null) {
            return new d((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    private d b(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.f27002c));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        d a2 = a(objectInputStream, objectInputStream.readInt());
        try {
            Field declaredField = d.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, a2.f27002c);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError();
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f27002c.length);
        objectOutputStream.write(this.f27002c);
    }

    public byte a(int i) {
        return this.f27002c[i];
    }

    /* renamed from: a */
    public int compareTo(d dVar) {
        int d2 = d();
        int d3 = dVar.d();
        int min = Math.min(d2, d3);
        for (int i = 0; i < min; i++) {
            byte a2 = a(i) & 255;
            byte a3 = dVar.a(i) & 255;
            if (a2 != a3) {
                return a2 < a3 ? -1 : 1;
            }
        }
        if (d2 == d3) {
            return 0;
        }
        return d2 < d3 ? -1 : 1;
    }

    public String a() {
        String str = this.f27004e;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f27002c, n.f27029a);
        this.f27004e = str2;
        return str2;
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        aVar.c(this.f27002c, 0, this.f27002c.length);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        return i <= this.f27002c.length - i3 && i2 <= bArr.length - i3 && n.a(this.f27002c, i, bArr, i2, i3);
    }

    public d b() {
        return b("MD5");
    }

    public String c() {
        char[] cArr = new char[(this.f27002c.length * 2)];
        int i = 0;
        for (byte b2 : this.f27002c) {
            int i2 = i + 1;
            cArr[i] = f27000a[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = f27000a[b2 & 15];
        }
        return new String(cArr);
    }

    public int d() {
        return this.f27002c.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return dVar.d() == this.f27002c.length && dVar.a(0, this.f27002c, 0, this.f27002c.length);
        }
    }

    public int hashCode() {
        int i = this.f27003d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f27002c);
        this.f27003d = hashCode;
        return hashCode;
    }

    public String toString() {
        String str;
        Object[] objArr;
        if (this.f27002c.length == 0) {
            return "ByteString[size=0]";
        }
        if (this.f27002c.length <= 16) {
            str = "ByteString[size=%s data=%s]";
            objArr = new Object[]{Integer.valueOf(this.f27002c.length), c()};
        } else {
            str = "ByteString[size=%s md5=%s]";
            objArr = new Object[]{Integer.valueOf(this.f27002c.length), b().c()};
        }
        return String.format(str, objArr);
    }
}
