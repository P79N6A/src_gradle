package com.bytedance.retrofit2.mime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class e implements TypedInput, TypedOutput {

    /* renamed from: a  reason: collision with root package name */
    public final File f21926a;

    /* renamed from: b  reason: collision with root package name */
    private final String f21927b;

    public final String mimeType() {
        return this.f21927b;
    }

    public final String fileName() {
        return this.f21926a.getName();
    }

    public final int hashCode() {
        return this.f21926a.hashCode();
    }

    public final InputStream in() throws IOException {
        return new FileInputStream(this.f21926a);
    }

    public final long length() {
        return this.f21926a.length();
    }

    public final String md5Stub() {
        return this.f21926a == null ? null : null;
    }

    public final String toString() {
        return this.f21926a.getAbsolutePath() + " (" + mimeType() + ")";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f21926a.equals(((e) obj).f21926a);
        }
        return false;
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f21926a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    public e(String str, File file) {
        str = str == null ? "application/octet-stream" : str;
        if (file != null) {
            this.f21927b = str;
            this.f21926a = file;
            return;
        }
        throw new NullPointerException("file");
    }
}
