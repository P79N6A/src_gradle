package com.bytedance.retrofit2.mime;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public final class d implements TypedOutput {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f21916a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f21917b;

    /* renamed from: c  reason: collision with root package name */
    private final String f21918c;

    /* renamed from: d  reason: collision with root package name */
    private long f21919d;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final TypedOutput f21920a;

        /* renamed from: b  reason: collision with root package name */
        byte[] f21921b;

        /* renamed from: c  reason: collision with root package name */
        byte[] f21922c;

        /* renamed from: d  reason: collision with root package name */
        private final String f21923d;

        /* renamed from: e  reason: collision with root package name */
        private final String f21924e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f21925f;
        private final String g;
        private boolean h;

        /* access modifiers changed from: package-private */
        public void b() {
            if (!this.h) {
                this.f21921b = d.a(this.g, this.f21925f, false);
                this.f21922c = d.b(this.f21923d, this.f21924e, this.f21920a);
                this.h = true;
            }
        }

        public final long a() {
            b();
            if (this.f21920a.length() > -1) {
                return this.f21920a.length() + ((long) this.f21921b.length) + ((long) this.f21922c.length);
            }
            return -1;
        }

        public a(String str, String str2, TypedOutput typedOutput, String str3, boolean z) {
            this.f21923d = str;
            this.f21924e = str2;
            this.f21920a = typedOutput;
            this.f21925f = z;
            this.g = str3;
        }
    }

    public final String fileName() {
        return null;
    }

    public final long length() {
        return this.f21919d;
    }

    public d() {
        this(UUID.randomUUID().toString());
    }

    public final String mimeType() {
        return "multipart/form-data; boundary=" + this.f21918c;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0036 A[SYNTHETIC, Splitter:B:24:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC, Splitter:B:28:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0045 A[SYNTHETIC, Splitter:B:35:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x004c A[SYNTHETIC, Splitter:B:39:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String md5Stub() {
        /*
            r7 = this;
            long r0 = r7.f21919d
            r2 = 0
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0041, all -> 0x0031 }
            r0.<init>()     // Catch:{ Throwable -> 0x0041, all -> 0x0031 }
            r7.writeTo(r0)     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            byte[] r3 = r0.toByteArray()     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x002f, all -> 0x002d }
            java.lang.String r3 = com.bytedance.retrofit2.mime.a.a((java.io.InputStream) r1)     // Catch:{ Throwable -> 0x002b, all -> 0x0026 }
            r0.close()     // Catch:{ Throwable -> 0x0022 }
        L_0x0022:
            r1.close()     // Catch:{ Throwable -> 0x0025 }
        L_0x0025:
            return r3
        L_0x0026:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0034
        L_0x002b:
            goto L_0x0043
        L_0x002d:
            r1 = move-exception
            goto L_0x0034
        L_0x002f:
            r1 = r2
            goto L_0x0043
        L_0x0031:
            r0 = move-exception
            r1 = r0
            r0 = r2
        L_0x0034:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ Throwable -> 0x003a }
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.close()     // Catch:{ Throwable -> 0x0040 }
        L_0x0040:
            throw r1
        L_0x0041:
            r0 = r2
            r1 = r0
        L_0x0043:
            if (r0 == 0) goto L_0x004a
            r0.close()     // Catch:{ Throwable -> 0x0049 }
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            if (r1 == 0) goto L_0x004f
            r1.close()     // Catch:{ Throwable -> 0x004f }
        L_0x004f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.mime.d.md5Stub():java.lang.String");
    }

    private d(String str) {
        this.f21916a = new LinkedList();
        this.f21918c = str;
        this.f21917b = a(str, false, true);
        this.f21919d = (long) this.f21917b.length;
    }

    public final void writeTo(OutputStream outputStream) throws IOException {
        for (a next : this.f21916a) {
            next.b();
            outputStream.write(next.f21921b);
            outputStream.write(next.f21922c);
            next.f21920a.writeTo(outputStream);
        }
        outputStream.write(this.f21917b);
    }

    public final void a(String str, TypedOutput typedOutput) {
        a(str, "binary", typedOutput);
    }

    public static byte[] a(String str, boolean z, boolean z2) {
        try {
            StringBuilder sb = new StringBuilder(str.length() + 8);
            if (!z) {
                sb.append("\r\n");
            }
            sb.append("--");
            sb.append(str);
            if (z2) {
                sb.append("--");
            }
            sb.append("\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e2) {
            throw new RuntimeException("Unable to write multipart boundary", e2);
        }
    }

    public static byte[] b(String str, String str2, TypedOutput typedOutput) {
        try {
            StringBuilder sb = new StringBuilder(SearchJediMixFeedAdapter.f42517f);
            sb.append("Content-Disposition: form-data; name=\"");
            sb.append(str);
            String fileName = typedOutput.fileName();
            if (fileName != null) {
                sb.append("\"; filename=\"");
                sb.append(fileName);
            }
            sb.append("\"\r\nContent-Type: ");
            sb.append(typedOutput.mimeType());
            long length = typedOutput.length();
            if (length != -1) {
                sb.append("\r\nContent-Length: ");
                sb.append(length);
            }
            sb.append("\r\nContent-Transfer-Encoding: ");
            sb.append(str2);
            sb.append("\r\n\r\n");
            return sb.toString().getBytes("UTF-8");
        } catch (IOException e2) {
            throw new RuntimeException("Unable to write multipart header", e2);
        }
    }

    public final void a(String str, String str2, TypedOutput typedOutput) {
        if (str == null) {
            throw new NullPointerException("Part name must not be null.");
        } else if (str2 == null) {
            throw new NullPointerException("Transfer encoding must not be null.");
        } else if (typedOutput != null) {
            a aVar = new a(str, str2, typedOutput, this.f21918c, this.f21916a.isEmpty());
            this.f21916a.add(aVar);
            long a2 = aVar.a();
            if (a2 == -1) {
                this.f21919d = -1;
                return;
            }
            if (this.f21919d != -1) {
                this.f21919d += a2;
            }
        } else {
            throw new NullPointerException("Part body must not be null.");
        }
    }
}
