package com.bytedance.apm.i;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    String f19024a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f19025b;

    /* renamed from: c  reason: collision with root package name */
    final Map<String, String> f19026c = new HashMap();

    /* access modifiers changed from: package-private */
    public void a() throws IOException {
        if (this.f19025b.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f19025b);
                gZIPOutputStream.close();
                this.f19025b = byteArrayOutputStream.toByteArray();
                this.f19026c.put("Content-Encoding", "gzip");
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        }
    }

    d(String str, byte[] bArr) {
        this.f19024a = str;
        this.f19025b = bArr;
    }
}
