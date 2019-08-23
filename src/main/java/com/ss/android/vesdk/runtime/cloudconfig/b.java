package com.ss.android.vesdk.runtime.cloudconfig;

import android.annotation.SuppressLint;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f78104f = new String[0];
    private static C0831b g = C0831b.f78115a;

    /* renamed from: a  reason: collision with root package name */
    public boolean f78105a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f78106b = 8192;

    /* renamed from: c  reason: collision with root package name */
    public long f78107c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f78108d;

    /* renamed from: e  reason: collision with root package name */
    public f f78109e = f.f78117a;
    private HttpURLConnection h;
    private final URL i;
    private final String j;
    private e k;
    private boolean l;
    private boolean m;
    private String n;
    private int o;

    protected static abstract class a<V> extends d<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Closeable f78113a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f78114b;

        /* access modifiers changed from: protected */
        public final void b() throws IOException {
            if (this.f78113a instanceof Flushable) {
                ((Flushable) this.f78113a).flush();
            }
            if (this.f78114b) {
                try {
                    this.f78113a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f78113a.close();
            }
        }

        protected a(Closeable closeable, boolean z) {
            this.f78113a = closeable;
            this.f78114b = z;
        }
    }

    /* renamed from: com.ss.android.vesdk.runtime.cloudconfig.b$b  reason: collision with other inner class name */
    public interface C0831b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0831b f78115a = new C0831b() {
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

        public c(IOException iOException) {
            super(iOException);
        }
    }

    protected static abstract class d<V> implements Callable<V> {
        /* access modifiers changed from: protected */
        public abstract V a() throws c, IOException;

        /* access modifiers changed from: protected */
        public abstract void b() throws IOException;

        protected d() {
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
        public final CharsetEncoder f78116a;

        public final e a(String str) throws IOException {
            ByteBuffer encode = this.f78116a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public interface f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f78117a = new f() {
        };
    }

    private int f() {
        return c("Content-Length");
    }

    private b h() throws c {
        try {
            return g();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private HttpURLConnection c() {
        if (this.h == null) {
            this.h = b();
        }
        return this.h;
    }

    private int d() throws c {
        try {
            g();
            return c().getResponseCode();
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private HttpURLConnection b() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.n != null) {
                httpURLConnection = g.a(this.i, new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.n, this.o)));
            } else {
                httpURLConnection = g.a(this.i);
            }
            httpURLConnection.setRequestMethod(this.j);
            return httpURLConnection;
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    private b g() throws IOException {
        this.f78109e = f.f78117a;
        if (this.k == null) {
            return this;
        }
        if (this.l) {
            this.k.a("\r\n--00content0boundary00--\r\n");
        }
        if (this.f78105a) {
            try {
                this.k.close();
            } catch (IOException unused) {
            }
        } else {
            this.k.close();
        }
        this.k = null;
        return this;
    }

    public final String toString() {
        return c().getRequestMethod() + ' ' + c().getURL();
    }

    private InputStream e() throws c {
        InputStream inputStream;
        if (d() < 400) {
            try {
                inputStream = c().getInputStream();
            } catch (IOException e2) {
                throw new c(e2);
            }
        } else {
            inputStream = c().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = c().getInputStream();
                } catch (IOException e3) {
                    if (f() <= 0) {
                        inputStream = new ByteArrayInputStream(new byte[0]);
                    } else {
                        throw new c(e3);
                    }
                }
            }
        }
        if (!this.m || !"gzip".equals(b("Content-Encoding"))) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e4) {
            throw new c(e4);
        }
    }

    public final String a() throws c {
        String b2 = b("Content-Type");
        String str = null;
        if (b2 != null && b2.length() != 0) {
            int length = b2.length();
            int indexOf = b2.indexOf(59) + 1;
            if (indexOf != 0 && indexOf != length) {
                int indexOf2 = b2.indexOf(59, indexOf);
                if (indexOf2 == -1) {
                    indexOf2 = length;
                }
                while (true) {
                    if (indexOf >= indexOf2) {
                        break;
                    }
                    int indexOf3 = b2.indexOf(61, indexOf);
                    if (indexOf3 != -1 && indexOf3 < indexOf2 && "charset".equals(b2.substring(indexOf, indexOf3).trim())) {
                        String trim = b2.substring(indexOf3 + 1, indexOf2).trim();
                        int length2 = trim.length();
                        if (length2 != 0) {
                            if (length2 > 2 && '\"' == trim.charAt(0)) {
                                int i2 = length2 - 1;
                                if ('\"' == trim.charAt(i2)) {
                                    str = trim.substring(1, i2);
                                }
                            }
                            str = trim;
                        }
                    }
                    indexOf = indexOf2 + 1;
                    indexOf2 = b2.indexOf(59, indexOf);
                    if (indexOf2 == -1) {
                        break;
                    }
                }
            }
        }
        return a(str);
    }

    private String b(String str) throws c {
        h();
        return c().getHeaderField(str);
    }

    private int c(String str) throws c {
        h();
        return c().getHeaderFieldInt(str, -1);
    }

    @SuppressLint({"infer"})
    private String a(String str) throws c {
        ByteArrayOutputStream byteArrayOutputStream;
        int f2 = f();
        if (f2 > 0) {
            byteArrayOutputStream = new ByteArrayOutputStream(f2);
        } else {
            byteArrayOutputStream = new ByteArrayOutputStream();
        }
        try {
            final BufferedInputStream bufferedInputStream = new BufferedInputStream(e(), this.f78106b);
            final ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            AnonymousClass1 r2 = new a<b>(bufferedInputStream, this.f78105a) {
                public final /* synthetic */ Object a() throws c, IOException {
                    byte[] bArr = new byte[b.this.f78106b];
                    while (true) {
                        int read = bufferedInputStream.read(bArr);
                        if (read == -1) {
                            return b.this;
                        }
                        byteArrayOutputStream2.write(bArr, 0, read);
                        b.this.f78108d += (long) read;
                    }
                }
            };
            b bVar = (b) r2.call();
            if (str == null || str.length() <= 0) {
                str = "UTF-8";
            }
            return byteArrayOutputStream.toString(str);
        } catch (IOException e2) {
            throw new c(e2);
        }
    }

    public static String a(CharSequence charSequence) throws c {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            if (url.getPort() != -1) {
                host = host + ':' + Integer.toString(r1);
            }
            try {
                URI uri = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null);
                String aSCIIString = uri.toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0) {
                    return aSCIIString;
                }
                if (indexOf + 1 >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, r0) + aSCIIString.substring(r0).replace("+", "%2B");
            } catch (URISyntaxException e2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e2);
                throw new c(iOException);
            }
        } catch (IOException e3) {
            throw new c(e3);
        }
    }

    public b(CharSequence charSequence, String str) throws c {
        try {
            this.i = new URL(charSequence.toString());
            this.j = str;
        } catch (MalformedURLException e2) {
            throw new c(e2);
        }
    }

    static StringBuilder a(Object obj, Object obj2, StringBuilder sb) {
        if (obj2 != null && obj2.getClass().isArray()) {
            if (obj2 instanceof Object[]) {
                obj2 = Arrays.asList((Object[]) obj2);
            } else {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                if (obj2 instanceof int[]) {
                    int[] iArr = (int[]) obj2;
                    int length = iArr.length;
                    while (i2 < length) {
                        arrayList.add(Integer.valueOf(iArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj2;
                    int length2 = zArr.length;
                    while (i2 < length2) {
                        arrayList.add(Boolean.valueOf(zArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof long[]) {
                    long[] jArr = (long[]) obj2;
                    int length3 = jArr.length;
                    while (i2 < length3) {
                        arrayList.add(Long.valueOf(jArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof float[]) {
                    float[] fArr = (float[]) obj2;
                    int length4 = fArr.length;
                    while (i2 < length4) {
                        arrayList.add(Float.valueOf(fArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof double[]) {
                    double[] dArr = (double[]) obj2;
                    int length5 = dArr.length;
                    while (i2 < length5) {
                        arrayList.add(Double.valueOf(dArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length6 = sArr.length;
                    while (i2 < length6) {
                        arrayList.add(Short.valueOf(sArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length7 = bArr.length;
                    while (i2 < length7) {
                        arrayList.add(Byte.valueOf(bArr[i2]));
                        i2++;
                    }
                } else if (obj2 instanceof char[]) {
                    char[] cArr = (char[]) obj2;
                    int length8 = cArr.length;
                    while (i2 < length8) {
                        arrayList.add(Character.valueOf(cArr[i2]));
                        i2++;
                    }
                }
                obj2 = arrayList;
            }
        }
        if (obj2 instanceof Iterable) {
            Iterator it2 = ((Iterable) obj2).iterator();
            while (it2.hasNext()) {
                sb.append(obj);
                sb.append("[]=");
                Object next = it2.next();
                if (next != null) {
                    sb.append(next);
                }
                if (it2.hasNext()) {
                    sb.append("&");
                }
            }
        } else {
            sb.append(obj);
            sb.append("=");
            if (obj2 != null) {
                sb.append(obj2);
            }
        }
        return sb;
    }
}
