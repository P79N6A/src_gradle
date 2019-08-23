package io.fabric.sdk.android.services.d;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f83270d = new String[0];

    /* renamed from: e  reason: collision with root package name */
    private static b f83271e = b.f83281a;

    /* renamed from: a  reason: collision with root package name */
    public final URL f83272a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f83273b = true;

    /* renamed from: c  reason: collision with root package name */
    public int f83274c = 8192;

    /* renamed from: f  reason: collision with root package name */
    private HttpURLConnection f83275f;
    private final String g;
    private e h;
    private boolean i;
    private boolean j;
    private String k;
    private int l;

    protected static abstract class a<V> extends C0883d<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Closeable f83279a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f83280b;

        /* access modifiers changed from: protected */
        public final void b() throws IOException {
            if (this.f83279a instanceof Flushable) {
                ((Flushable) this.f83279a).flush();
            }
            if (this.f83280b) {
                try {
                    this.f83279a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f83279a.close();
            }
        }

        protected a(Closeable closeable, boolean z) {
            this.f83279a = closeable;
            this.f83280b = z;
        }
    }

    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83281a = new b() {
            public final HttpURLConnection a(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            public final HttpURLConnection a(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        HttpURLConnection a(URL url) throws IOException;

        HttpURLConnection a(URL url, Proxy proxy) throws IOException;
    }

    public static class c extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        public final IOException getCause() {
            return (IOException) super.getCause();
        }

        protected c(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: io.fabric.sdk.android.services.d.d$d  reason: collision with other inner class name */
    protected static abstract class C0883d<V> implements Callable<V> {
        /* access modifiers changed from: protected */
        public abstract V a() throws c, IOException;

        /* access modifiers changed from: protected */
        public abstract void b() throws IOException;

        protected C0883d() {
        }

        public V call() throws c {
            boolean z = true;
            try {
                V a2 = a();
                try {
                    b();
                    return a2;
                } catch (IOException e2) {
                    throw new c(e2);
                }
            } catch (c e3) {
                throw e3;
            } catch (IOException e4) {
                throw new c(e4);
            } catch (Throwable th) {
                th = th;
                b();
                throw th;
            }
        }
    }

    public static class e extends BufferedOutputStream {

        /* renamed from: a  reason: collision with root package name */
        public final CharsetEncoder f83282a;

        public final e a(String str) throws IOException {
            ByteBuffer encode = this.f83282a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }

        public e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f83282a = Charset.forName(d.a(str)).newEncoder();
        }
    }

    public final HttpURLConnection a() {
        if (this.f83275f == null) {
            this.f83275f = e();
        }
        return this.f83275f;
    }

    public final d a(String str, String str2, String str3, InputStream inputStream) throws c {
        try {
            j();
            a(str, str2, str3);
            a(inputStream, (OutputStream) this.h);
            return this;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private d h() throws c {
        try {
            return g();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public final String d() {
        return a().getRequestMethod();
    }

    public final String c() throws c {
        return c(c(b("Content-Type"), "charset"));
    }

    private HttpURLConnection e() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.k != null) {
                httpURLConnection = f83271e.a(this.f83272a, new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.k, this.l)));
            } else {
                httpURLConnection = f83271e.a(this.f83272a);
            }
            httpURLConnection.setRequestMethod(this.g);
            return httpURLConnection;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private d g() throws IOException {
        if (this.h == null) {
            return this;
        }
        if (this.i) {
            this.h.a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f83273b) {
            try {
                this.h.close();
            } catch (IOException unused) {
            }
        } else {
            this.h.close();
        }
        this.h = null;
        return this;
    }

    private d i() throws IOException {
        if (this.h != null) {
            return this;
        }
        a().setDoOutput(true);
        this.h = new e(a().getOutputStream(), c(a().getRequestProperty("Content-Type"), "charset"), this.f83274c);
        return this;
    }

    private d j() throws IOException {
        if (!this.i) {
            this.i = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").i();
            this.h.a("--00content0boundary00\r\n");
        } else {
            this.h.a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    public final int b() throws c {
        try {
            g();
            return a().getResponseCode();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public final String toString() {
        return d() + ' ' + a().getURL();
    }

    private InputStream f() throws c {
        InputStream inputStream;
        if (b() < 400) {
            try {
                inputStream = a().getInputStream();
            } catch (IOException e2) {
                throw new c(e2);
            }
        } else {
            inputStream = a().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = a().getInputStream();
                } catch (IOException e3) {
                    throw new c(e3);
                }
            }
        }
        if (!this.j || !"gzip".equals(b("Content-Encoding"))) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e4) {
            throw new c(e4);
        }
    }

    public static d a(CharSequence charSequence) throws c {
        return new d(charSequence, "PUT");
    }

    public static d b(CharSequence charSequence) throws c {
        return new d(charSequence, "DELETE");
    }

    private static d d(CharSequence charSequence) throws c {
        return new d(charSequence, "GET");
    }

    private static d e(CharSequence charSequence) throws c {
        return new d(charSequence, "POST");
    }

    private d f(CharSequence charSequence) throws c {
        try {
            i();
            this.h.a(charSequence.toString());
            return this;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private String c(String str) throws c {
        ByteArrayOutputStream byteArrayOutputStream;
        h();
        int headerFieldInt = a().getHeaderFieldInt("Content-Length", -1);
        if (headerFieldInt > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(headerFieldInt);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            a((InputStream) new BufferedInputStream(f(), this.f83274c), (OutputStream) byteArrayOutputStream);
            return byteArrayOutputStream.toString(a(str));
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private static String c(CharSequence charSequence) throws c {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            if (url.getPort() != -1) {
                host = host + ':' + Integer.toString(r1);
            }
            try {
                URI uri = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), url.getRef());
                String aSCIIString = uri.toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0) {
                    return aSCIIString;
                }
                if (indexOf + 1 >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, r0) + aSCIIString.substring(r0).replace("+", "%2B").replace("#", "%23");
            } catch (URISyntaxException e2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e2);
                throw new c(iOException);
            }
        } catch (IOException e3) {
            throw new c(e3);
        }
    }

    public final String b(String str) throws c {
        h();
        return a().getHeaderField(str);
    }

    public static String a(String str) {
        if (str == null || str.length() <= 0) {
            return "UTF-8";
        }
        return str;
    }

    private d(CharSequence charSequence, String str) throws c {
        try {
            this.f83272a = new URL(charSequence.toString());
            this.g = str;
        } catch (MalformedURLException e2) {
            throw new c(e2);
        }
    }

    private d a(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        AnonymousClass1 r0 = new a<d>(inputStream, this.f83273b) {
            public final /* synthetic */ Object a() throws c, IOException {
                byte[] bArr = new byte[d.this.f83274c];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return d.this;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        };
        return (d) r0.call();
    }

    private d d(String str, String str2) throws c {
        return f(str).f(": ").f(str2).f("\r\n");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    private static java.lang.String c(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0071
            int r1 = r8.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0071
        L_0x000a:
            int r1 = r8.length()
            r2 = 59
            int r3 = r8.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x0070
            if (r3 != r1) goto L_0x001b
            goto L_0x0070
        L_0x001b:
            int r5 = r8.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r8.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r8.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r8.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r8 = 2
            if (r7 <= r8) goto L_0x0065
            r8 = 0
            char r8 = r3.charAt(r8)
            r9 = 34
            if (r9 != r8) goto L_0x0065
            int r7 = r7 - r4
            char r8 = r3.charAt(r7)
            if (r9 != r8) goto L_0x0065
            java.lang.String r8 = r3.substring(r4, r7)
            return r8
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r8.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        L_0x0070:
            return r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.d.d.c(java.lang.String, java.lang.String):java.lang.String");
    }

    public final d b(String str, String str2) {
        return b(str, (String) null, str2);
    }

    private static String a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        if (charSequence2.indexOf(58) + 2 == charSequence2.lastIndexOf(47)) {
            sb.append('/');
        }
        int indexOf = charSequence2.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && charSequence2.charAt(length) != '&') {
            sb.append('&');
        }
        Iterator<Map.Entry<?, ?>> it2 = map.entrySet().iterator();
        Map.Entry next = it2.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it2.hasNext()) {
            sb.append('&');
            Map.Entry next2 = it2.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    public final d a(String str, Number number) throws c {
        String str2;
        if (number != null) {
            str2 = number.toString();
        } else {
            str2 = null;
        }
        return b(str, (String) null, str2);
    }

    public final d a(String str, String str2) {
        a().setRequestProperty(str, str2);
        return this;
    }

    public static d a(CharSequence charSequence, Map<?, ?> map, boolean z) {
        return d(c((CharSequence) a(charSequence, map)));
    }

    public static d b(CharSequence charSequence, Map<?, ?> map, boolean z) {
        return e(c((CharSequence) a(charSequence, map)));
    }

    private d b(String str, String str2, String str3) throws c {
        return a(str, str2, (String) null, str3);
    }

    private d a(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        d("Content-Disposition", sb.toString());
        if (str3 != null) {
            d("Content-Type", str3);
        }
        return f("\r\n");
    }

    private d a(String str, String str2, String str3, String str4) throws c {
        try {
            j();
            a(str, str2, (String) null);
            this.h.a(str4);
            return this;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[SYNTHETIC, Splitter:B:19:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final io.fabric.sdk.android.services.d.d a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) throws io.fabric.sdk.android.services.d.d.c {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x001b }
            r2.<init>(r7)     // Catch:{ IOException -> 0x001b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001b }
            io.fabric.sdk.android.services.d.d r4 = r3.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.io.InputStream) r1)     // Catch:{ IOException -> 0x0016, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r4
        L_0x0013:
            r4 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x0016:
            r4 = move-exception
            r0 = r1
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
        L_0x001c:
            io.fabric.sdk.android.services.d.d$c r5 = new io.fabric.sdk.android.services.d.d$c     // Catch:{ all -> 0x0019 }
            r5.<init>(r4)     // Catch:{ all -> 0x0019 }
            throw r5     // Catch:{ all -> 0x0019 }
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.d.d.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):io.fabric.sdk.android.services.d.d");
    }
}
