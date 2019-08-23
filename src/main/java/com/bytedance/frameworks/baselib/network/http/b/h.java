package com.bytedance.frameworks.baselib.network.http.b;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private static final String f19772a = "h";
    private static final long serialVersionUID = 6374381323722046732L;

    /* renamed from: b  reason: collision with root package name */
    private transient e f19773b;
    private long whenCreated = System.currentTimeMillis();

    public e getHttpCookie() {
        return this.f19773b;
    }

    public Long getWhenCreated() {
        return Long.valueOf(this.whenCreated);
    }

    public int hashCode() {
        return this.f19773b.hashCode();
    }

    public String encode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(this);
            return a(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean hasExpired() {
        long j = this.f19773b.f19752e;
        if (j != -1 && (System.currentTimeMillis() - this.whenCreated) / 1000 > j) {
            return true;
        }
        return false;
    }

    public h(e eVar) {
        this.f19773b = eVar;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f19773b.equals(obj);
        }
        if (obj instanceof h) {
            return this.f19773b.equals(((h) obj).f19773b);
        }
        return false;
    }

    private static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            byte b3 = b2 & 255;
            if (b3 < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(b3));
        }
        return sb.toString();
    }

    public static h decode(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        try {
            return (h) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            return null;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this.f19773b.f19753f);
        objectOutputStream.writeObject(this.f19773b.k);
        objectOutputStream.writeObject(this.f19773b.f19748a);
        objectOutputStream.writeObject(this.f19773b.f19749b);
        objectOutputStream.writeObject(this.f19773b.f19751d);
        objectOutputStream.writeLong(this.f19773b.f19752e);
        objectOutputStream.writeObject(this.f19773b.g);
        objectOutputStream.writeObject(this.f19773b.h);
        objectOutputStream.writeInt(this.f19773b.l);
        objectOutputStream.writeBoolean(this.f19773b.i);
        objectOutputStream.writeBoolean(this.f19773b.f19750c);
        objectOutputStream.writeBoolean(this.f19773b.j);
        objectOutputStream.writeLong(this.whenCreated);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.f19773b = new e((String) objectInputStream.readObject(), (String) objectInputStream.readObject());
        this.f19773b.f19748a = (String) objectInputStream.readObject();
        this.f19773b.f19749b = (String) objectInputStream.readObject();
        this.f19773b.a((String) objectInputStream.readObject());
        this.f19773b.f19752e = objectInputStream.readLong();
        this.f19773b.g = (String) objectInputStream.readObject();
        this.f19773b.h = (String) objectInputStream.readObject();
        e eVar = this.f19773b;
        int readInt = objectInputStream.readInt();
        if (readInt == 0 || readInt == 1) {
            eVar.l = readInt;
            this.f19773b.i = objectInputStream.readBoolean();
            this.f19773b.f19750c = objectInputStream.readBoolean();
            this.f19773b.j = objectInputStream.readBoolean();
            this.whenCreated = objectInputStream.readLong();
            return;
        }
        throw new IllegalArgumentException("Bad version: " + readInt);
    }

    public static int getEffectivePort(String str, int i) {
        if (i != -1) {
            return i;
        }
        if ("http".equalsIgnoreCase(str)) {
            return 80;
        }
        if ("https".equalsIgnoreCase(str)) {
            return 443;
        }
        return -1;
    }
}
