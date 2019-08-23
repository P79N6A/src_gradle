package com.loc;

import com.google.a.a.a.a.a.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class ax extends bd {

    /* renamed from: a  reason: collision with root package name */
    ByteArrayOutputStream f25506a = new ByteArrayOutputStream();

    public ax() {
    }

    public ax(bd bdVar) {
        super(bdVar);
    }

    /* access modifiers changed from: protected */
    public final byte[] a(byte[] bArr) {
        byte[] byteArray = this.f25506a.toByteArray();
        try {
            this.f25506a.close();
        } catch (IOException e2) {
            a.b(e2);
        }
        this.f25506a = new ByteArrayOutputStream();
        return byteArray;
    }

    public final void b(byte[] bArr) {
        try {
            this.f25506a.write(bArr);
        } catch (Throwable th) {
            a.b(th);
        }
    }
}
