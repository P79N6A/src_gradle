package com.bytedance.retrofit2.mime;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;

public final class b implements TypedOutput {

    /* renamed from: a  reason: collision with root package name */
    final ByteArrayOutputStream f21914a = new ByteArrayOutputStream();

    public final String fileName() {
        return null;
    }

    public final String mimeType() {
        return "application/x-www-form-urlencoded; charset=UTF-8";
    }

    public final long length() {
        return (long) this.f21914a.size();
    }

    public final String md5Stub() {
        return a.a(this.f21914a.toByteArray());
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.f21914a.toByteArray());
    }

    public final void a(String str, String str2) {
        a(str, true, str2, true);
    }

    public final void a(String str, boolean z, String str2, boolean z2) {
        if (str == null) {
            throw new NullPointerException("name");
        } else if (str2 != null) {
            if (this.f21914a.size() > 0) {
                this.f21914a.write(38);
            }
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
            if (z2) {
                str2 = URLEncoder.encode(str2, "UTF-8");
            }
            this.f21914a.write(str.getBytes("UTF-8"));
            this.f21914a.write(61);
            this.f21914a.write(str2.getBytes("UTF-8"));
        } else {
            throw new NullPointerException("value");
        }
    }
}
