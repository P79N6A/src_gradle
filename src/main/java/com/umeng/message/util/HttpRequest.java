package com.umeng.message.util;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

public class HttpRequest {
    private static ConnectionFactory CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
    private static final String[] EMPTY_STRINGS = new String[0];
    private static SSLSocketFactory TRUSTED_FACTORY;
    private static HostnameVerifier TRUSTED_VERIFIER;
    private static int connectTimeout = 60000;
    private static int readTimeOut = 60000;
    public int bufferSize = 8192;
    private HttpURLConnection connection;
    private boolean form;
    private String httpProxyHost;
    private int httpProxyPort;
    private boolean ignoreCloseExceptions = true;
    private boolean multipart;
    private e output;
    private final String requestMethod;
    private boolean uncompress;
    private final URL url;

    public interface ConnectionFactory {
        public static final ConnectionFactory DEFAULT = new ConnectionFactory() {
            public final HttpURLConnection create(URL url) throws IOException {
                return (HttpURLConnection) url.openConnection();
            }

            public final HttpURLConnection create(URL url, Proxy proxy) throws IOException {
                return (HttpURLConnection) url.openConnection(proxy);
            }
        };

        HttpURLConnection create(URL url) throws IOException;

        HttpURLConnection create(URL url, Proxy proxy) throws IOException;
    }

    public static class HttpRequestException extends RuntimeException {
        private static final long serialVersionUID = -1170466989781746231L;

        /* renamed from: a */
        public IOException getCause() {
            return (IOException) super.getCause();
        }

        protected HttpRequestException(IOException iOException) {
            super(iOException);
        }
    }

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        private static final byte[] f81402c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        private a() {
        }

        public static String a(byte[] bArr) {
            return a(bArr, 0, bArr.length);
        }

        public static String a(String str) {
            byte[] bArr;
            try {
                bArr = str.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                bArr = str.getBytes();
            }
            return a(bArr);
        }

        public static String a(byte[] bArr, int i, int i2) {
            byte[] b2 = b(bArr, i, i2);
            try {
                return new String(b2, "US-ASCII");
            } catch (UnsupportedEncodingException unused) {
                return new String(b2);
            }
        }

        public static byte[] b(byte[] bArr, int i, int i2) {
            if (bArr == null) {
                throw new NullPointerException("Cannot serialize a null array.");
            } else if (i < 0) {
                throw new IllegalArgumentException("Cannot have negative offset: " + i);
            } else if (i2 < 0) {
                throw new IllegalArgumentException("Cannot have length offset: " + i2);
            } else if (i + i2 <= bArr.length) {
                int i3 = 4;
                int i4 = (i2 / 3) * 4;
                if (i2 % 3 <= 0) {
                    i3 = 0;
                }
                byte[] bArr2 = new byte[(i4 + i3)];
                int i5 = i2 - 2;
                int i6 = 0;
                int i7 = 0;
                while (i6 < i5) {
                    a(bArr, i6 + i, 3, bArr2, i7);
                    i6 += 3;
                    i7 += 4;
                }
                if (i6 < i2) {
                    a(bArr, i + i6, i2 - i6, bArr2, i7);
                    i7 += 4;
                }
                if (i7 > bArr2.length - 1) {
                    return bArr2;
                }
                byte[] bArr3 = new byte[i7];
                System.arraycopy(bArr2, 0, bArr3, 0, i7);
                return bArr3;
            } else {
                throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)}));
            }
        }

        private static byte[] a(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
            int i4;
            int i5;
            byte[] bArr3 = f81402c;
            int i6 = 0;
            if (i2 > 0) {
                i4 = (bArr[i] << 24) >>> 8;
            } else {
                i4 = 0;
            }
            if (i2 > 1) {
                i5 = (bArr[i + 1] << 24) >>> 16;
            } else {
                i5 = 0;
            }
            int i7 = i4 | i5;
            if (i2 > 2) {
                i6 = (bArr[i + 2] << 24) >>> 24;
            }
            int i8 = i7 | i6;
            switch (i2) {
                case 1:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = 61;
                    bArr2[i3 + 3] = 61;
                    return bArr2;
                case 2:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = bArr3[(i8 >>> 6) & 63];
                    bArr2[i3 + 3] = 61;
                    return bArr2;
                case 3:
                    bArr2[i3] = bArr3[i8 >>> 18];
                    bArr2[i3 + 1] = bArr3[(i8 >>> 12) & 63];
                    bArr2[i3 + 2] = bArr3[(i8 >>> 6) & 63];
                    bArr2[i3 + 3] = bArr3[i8 & 63];
                    return bArr2;
                default:
                    return bArr2;
            }
        }
    }

    protected static abstract class b<V> extends d<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Closeable f81403a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f81404b;

        /* access modifiers changed from: protected */
        public void c() throws IOException {
            if (this.f81403a instanceof Flushable) {
                ((Flushable) this.f81403a).flush();
            }
            if (this.f81404b) {
                try {
                    this.f81403a.close();
                } catch (IOException unused) {
                }
            } else {
                this.f81403a.close();
            }
        }

        protected b(Closeable closeable, boolean z) {
            this.f81403a = closeable;
            this.f81404b = z;
        }
    }

    protected static abstract class c<V> extends d<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Flushable f81405a;

        /* access modifiers changed from: protected */
        public void c() throws IOException {
            this.f81405a.flush();
        }

        protected c(Flushable flushable) {
            this.f81405a = flushable;
        }
    }

    protected static abstract class d<V> implements Callable<V> {
        /* access modifiers changed from: protected */
        public abstract V b() throws HttpRequestException, IOException;

        /* access modifiers changed from: protected */
        public abstract void c() throws IOException;

        protected d() {
        }

        public V call() throws HttpRequestException {
            boolean z = true;
            try {
                V b2 = b();
                try {
                    c();
                    return b2;
                } catch (IOException e2) {
                    throw new HttpRequestException(e2);
                }
            } catch (HttpRequestException e3) {
                throw e3;
            } catch (IOException e4) {
                throw new HttpRequestException(e4);
            } catch (Throwable th) {
                th = th;
                c();
                throw th;
            }
        }
    }

    public static class e extends BufferedOutputStream {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final CharsetEncoder f81406a;

        public e a(String str) throws IOException {
            ByteBuffer encode = this.f81406a.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }

        public e(OutputStream outputStream, String str, int i) {
            super(outputStream, i);
            this.f81406a = Charset.forName(HttpRequest.getValidCharset(str)).newEncoder();
        }
    }

    public int bufferSize() {
        return this.bufferSize;
    }

    public HttpRequest acceptGzipEncoding() {
        return acceptEncoding("gzip");
    }

    public HttpRequest acceptJson() {
        return accept("application/json");
    }

    public String cacheControl() {
        return header("Cache-Control");
    }

    public String contentEncoding() {
        return header("Content-Encoding");
    }

    public int contentLength() {
        return intHeader("Content-Length");
    }

    public long date() {
        return dateHeader("Date");
    }

    public HttpRequest disconnect() {
        getConnection().disconnect();
        return this;
    }

    public String eTag() {
        return header("ETag");
    }

    public long expires() {
        return dateHeader("Expires");
    }

    public boolean ignoreCloseExceptions() {
        return this.ignoreCloseExceptions;
    }

    public long lastModified() {
        return dateHeader("Last-Modified");
    }

    public String location() {
        return header("Location");
    }

    public String server() {
        return header("Server");
    }

    private static HostnameVerifier getTrustedVerifier() {
        if (TRUSTED_VERIFIER == null) {
            TRUSTED_VERIFIER = new HostnameVerifier() {
                public final boolean verify(String str, SSLSession sSLSession) {
                    return true;
                }
            };
        }
        return TRUSTED_VERIFIER;
    }

    public boolean badRequest() throws HttpRequestException {
        if (400 == code()) {
            return true;
        }
        return false;
    }

    public BufferedInputStream buffer() throws HttpRequestException {
        return new BufferedInputStream(stream(), this.bufferSize);
    }

    public BufferedReader bufferedReader() throws HttpRequestException {
        return bufferedReader(charset());
    }

    public String charset() {
        return parameter("Content-Type", "charset");
    }

    /* access modifiers changed from: protected */
    public HttpRequest closeOutputQuietly() throws HttpRequestException {
        try {
            return closeOutput();
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public String contentType() {
        return header("Content-Type");
    }

    public boolean created() throws HttpRequestException {
        if (201 == code()) {
            return true;
        }
        return false;
    }

    public HttpURLConnection getConnection() {
        if (this.connection == null) {
            this.connection = createConnection();
        }
        return this.connection;
    }

    public Map<String, List<String>> headers() throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFields();
    }

    public boolean isBodyEmpty() throws HttpRequestException {
        if (contentLength() == 0) {
            return true;
        }
        return false;
    }

    public String method() {
        return getConnection().getRequestMethod();
    }

    public boolean notFound() throws HttpRequestException {
        if (404 == code()) {
            return true;
        }
        return false;
    }

    public boolean notModified() throws HttpRequestException {
        if (304 == code()) {
            return true;
        }
        return false;
    }

    public boolean ok() throws HttpRequestException {
        if (200 == code()) {
            return true;
        }
        return false;
    }

    public InputStreamReader reader() throws HttpRequestException {
        return reader(charset());
    }

    public boolean serverError() throws HttpRequestException {
        if (500 == code()) {
            return true;
        }
        return false;
    }

    public URL url() {
        return getConnection().getURL();
    }

    private Proxy createProxy() {
        return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.httpProxyHost, this.httpProxyPort));
    }

    public String body() throws HttpRequestException {
        return body(charset());
    }

    /* access modifiers changed from: protected */
    public ByteArrayOutputStream byteStream() {
        int contentLength = contentLength();
        if (contentLength > 0) {
            return new ByteArrayOutputStream(contentLength);
        }
        return new ByteArrayOutputStream();
    }

    public byte[] bytes() throws HttpRequestException {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy((InputStream) buffer(), (OutputStream) byteStream);
            return byteStream.toByteArray();
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public int code() throws HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseCode();
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public String message() throws HttpRequestException {
        try {
            closeOutput();
            return getConnection().getResponseMessage();
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public HttpRequest startPart() throws IOException {
        if (!this.multipart) {
            this.multipart = true;
            contentType("multipart/form-data; boundary=00content0boundary00").openOutput();
            this.output.a("--00content0boundary00\r\n");
        } else {
            this.output.a("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    public String toString() {
        return method() + ' ' + url();
    }

    public HttpRequest trustAllHosts() {
        HttpURLConnection connection2 = getConnection();
        if (connection2 instanceof HttpsURLConnection) {
            ((HttpsURLConnection) connection2).setHostnameVerifier(getTrustedVerifier());
        }
        return this;
    }

    public HttpRequest trustHosts() {
        HttpURLConnection connection2 = getConnection();
        if (connection2 instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) connection2;
            httpsURLConnection.setHostnameVerifier(getTrustedVerifier(httpsURLConnection));
        }
        return this;
    }

    public OutputStreamWriter writer() throws HttpRequestException {
        try {
            openOutput();
            return new OutputStreamWriter(this.output, this.output.f81406a.charset());
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    private HttpURLConnection createConnection() {
        HttpURLConnection httpURLConnection;
        try {
            if (this.httpProxyHost != null) {
                httpURLConnection = CONNECTION_FACTORY.create(this.url, createProxy());
            } else {
                httpURLConnection = CONNECTION_FACTORY.create(this.url);
            }
            httpURLConnection.setRequestMethod(this.requestMethod);
            return httpURLConnection;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public HttpRequest closeOutput() throws IOException {
        if (this.output == null) {
            return this;
        }
        if (this.multipart) {
            this.output.a("\r\n--00content0boundary00--\r\n");
        }
        if (this.ignoreCloseExceptions) {
            try {
                this.output.close();
            } catch (IOException unused) {
            }
        } else {
            this.output.close();
        }
        this.output = null;
        return this;
    }

    /* access modifiers changed from: protected */
    public HttpRequest openOutput() throws IOException {
        if (this.output != null) {
            return this;
        }
        getConnection().setDoOutput(true);
        this.output = new e(getConnection().getOutputStream(), getParam(getConnection().getRequestProperty("Content-Type"), "charset"), this.bufferSize);
        return this;
    }

    public InputStream stream() throws HttpRequestException {
        InputStream inputStream;
        if (code() < 400) {
            try {
                inputStream = getConnection().getInputStream();
            } catch (IOException e2) {
                throw new HttpRequestException(e2);
            }
        } else {
            inputStream = getConnection().getErrorStream();
            if (inputStream == null) {
                try {
                    inputStream = getConnection().getInputStream();
                } catch (IOException e3) {
                    throw new HttpRequestException(e3);
                }
            }
        }
        if (!this.uncompress || !"gzip".equals(contentEncoding())) {
            return inputStream;
        }
        try {
            return new GZIPInputStream(inputStream);
        } catch (IOException e4) {
            throw new HttpRequestException(e4);
        }
    }

    public HttpRequest ignoreCloseExceptions(boolean z) {
        this.ignoreCloseExceptions = z;
        return this;
    }

    public HttpRequest uncompress(boolean z) {
        this.uncompress = z;
        return this;
    }

    public static HttpRequest delete(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "DELETE");
    }

    public static HttpRequest get(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "GET");
    }

    public static HttpRequest head(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "HEAD");
    }

    public static HttpRequest options(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "OPTIONS");
    }

    public static HttpRequest put(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "PUT");
    }

    public static HttpRequest trace(CharSequence charSequence) throws HttpRequestException {
        return new HttpRequest(charSequence, "TRACE");
    }

    public HttpRequest accept(String str) {
        return header("Accept", str);
    }

    public HttpRequest acceptCharset(String str) {
        return header("Accept-Charset", str);
    }

    public HttpRequest acceptEncoding(String str) {
        return header("Accept-Encoding", str);
    }

    public HttpRequest authorization(String str) {
        return header("Authorization", str);
    }

    public HttpRequest body(AtomicReference<String> atomicReference) throws HttpRequestException {
        atomicReference.set(body());
        return this;
    }

    public HttpRequest chunk(int i) {
        getConnection().setChunkedStreamingMode(i);
        return this;
    }

    public HttpRequest code(AtomicInteger atomicInteger) throws HttpRequestException {
        atomicInteger.set(code());
        return this;
    }

    public HttpRequest connectTimeout(int i) {
        getConnection().setConnectTimeout(i);
        return this;
    }

    public HttpRequest contentType(String str) {
        return contentType(str, null);
    }

    public long dateHeader(String str) throws HttpRequestException {
        return dateHeader(str, -1);
    }

    public HttpRequest followRedirects(boolean z) {
        getConnection();
        HttpURLConnection.setFollowRedirects(z);
        return this;
    }

    public HttpRequest ifModifiedSince(long j) {
        getConnection().setIfModifiedSince(j);
        return this;
    }

    public HttpRequest ifNoneMatch(String str) {
        return header("If-None-Match", str);
    }

    public int intHeader(String str) throws HttpRequestException {
        return intHeader(str, -1);
    }

    public HttpRequest proxyAuthorization(String str) {
        return header("Proxy-Authorization", str);
    }

    public HttpRequest readTimeout(int i) {
        getConnection().setReadTimeout(i);
        return this;
    }

    public HttpRequest receive(PrintStream printStream) throws HttpRequestException {
        return receive((OutputStream) printStream);
    }

    public HttpRequest referer(String str) {
        return header("Referer", str);
    }

    public HttpRequest useCaches(boolean z) {
        getConnection().setUseCaches(z);
        return this;
    }

    public HttpRequest userAgent(String str) {
        return header("User-Agent", str);
    }

    public static String getValidCharset(String str) {
        if (str == null || str.length() <= 0) {
            return "UTF-8";
        }
        return str;
    }

    public static void keepAlive(boolean z) {
        setProperty("http.keepAlive", Boolean.toString(z));
    }

    public static HttpRequest options(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "OPTIONS");
    }

    public static void proxyHost(String str) {
        setProperty("http.proxyHost", str);
        setProperty("https.proxyHost", str);
    }

    public static void proxyPort(int i) {
        String num = Integer.toString(i);
        setProperty("http.proxyPort", num);
        setProperty("https.proxyPort", num);
    }

    public static void setConnectionFactory(ConnectionFactory connectionFactory) {
        if (connectionFactory == null) {
            CONNECTION_FACTORY = ConnectionFactory.DEFAULT;
        } else {
            CONNECTION_FACTORY = connectionFactory;
        }
    }

    public static HttpRequest trace(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "TRACE");
    }

    public HttpRequest bufferSize(int i) {
        if (i > 0) {
            this.bufferSize = i;
            return this;
        }
        throw new IllegalArgumentException("Size must be greater than zero");
    }

    public HttpRequest contentLength(int i) {
        getConnection().setFixedLengthStreamingMode(i);
        return this;
    }

    public HttpRequest form(Map.Entry<?, ?> entry) throws HttpRequestException {
        return form(entry, "UTF-8");
    }

    public Map<String, String> parameters(String str) {
        return getParams(header(str));
    }

    public HttpRequest receive(OutputStream outputStream) throws HttpRequestException {
        try {
            return copy((InputStream) buffer(), outputStream);
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest send(InputStream inputStream) throws HttpRequestException {
        try {
            openOutput();
            copy(inputStream, (OutputStream) this.output);
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    private static HostnameVerifier getTrustedVerifier(final HttpsURLConnection httpsURLConnection) {
        if (TRUSTED_VERIFIER == null) {
            TRUSTED_VERIFIER = new HostnameVerifier() {
                public final boolean verify(String str, SSLSession sSLSession) {
                    String requestProperty = httpsURLConnection.getRequestProperty("Host");
                    if (requestProperty == null) {
                        requestProperty = httpsURLConnection.getURL().getHost();
                    }
                    return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
                }
            };
        }
        return TRUSTED_VERIFIER;
    }

    public static HttpRequest post(CharSequence charSequence) throws HttpRequestException {
        HttpRequest httpRequest = new HttpRequest(charSequence, "POST");
        httpRequest.getConnection().setConnectTimeout(connectTimeout);
        httpRequest.getConnection().setReadTimeout(readTimeOut);
        return httpRequest;
    }

    public BufferedReader bufferedReader(String str) throws HttpRequestException {
        return new BufferedReader(reader(str), this.bufferSize);
    }

    public HttpRequest contentLength(String str) {
        return contentLength(Integer.parseInt(str));
    }

    public HttpRequest header(Map.Entry<String, String> entry) {
        return header(entry.getKey(), entry.getValue());
    }

    public HttpRequest headers(Map<String, String> map) {
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> header : map.entrySet()) {
                header(header);
            }
        }
        return this;
    }

    public InputStreamReader reader(String str) throws HttpRequestException {
        try {
            return new InputStreamReader(stream(), getValidCharset(str));
        } catch (UnsupportedEncodingException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest receive(Writer writer) throws HttpRequestException {
        final BufferedReader bufferedReader = bufferedReader();
        final Writer writer2 = writer;
        AnonymousClass8 r0 = new b<HttpRequest>(bufferedReader, this.ignoreCloseExceptions) {
            /* renamed from: a */
            public HttpRequest b() throws IOException {
                return HttpRequest.this.copy((Reader) bufferedReader, writer2);
            }
        };
        return (HttpRequest) r0.call();
    }

    public HttpRequest send(File file) throws HttpRequestException {
        try {
            return send((InputStream) new BufferedInputStream(new FileInputStream(file)));
        } catch (FileNotFoundException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public static HttpRequest delete(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "DELETE");
    }

    public static HttpRequest get(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "GET");
    }

    public static HttpRequest head(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "HEAD");
    }

    public static void nonProxyHosts(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            setProperty("http.nonProxyHosts", null);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = strArr.length - 1;
        for (int i = 0; i < length; i++) {
            sb.append(strArr[i]);
            sb.append('|');
        }
        sb.append(strArr[length]);
        setProperty("http.nonProxyHosts", sb.toString());
    }

    public static HttpRequest put(URL url2) throws HttpRequestException {
        return new HttpRequest(url2, "PUT");
    }

    public String body(String str) throws HttpRequestException {
        ByteArrayOutputStream byteStream = byteStream();
        try {
            copy((InputStream) buffer(), (OutputStream) byteStream);
            return byteStream.toString(getValidCharset(str));
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest form(Map<?, ?> map) throws HttpRequestException {
        return form(map, "UTF-8");
    }

    public String header(String str) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderField(str);
    }

    public String[] headers(String str) {
        Map<String, List<String>> headers = headers();
        if (headers == null || headers.isEmpty()) {
            return EMPTY_STRINGS;
        }
        List list = headers.get(str);
        if (list == null || list.isEmpty()) {
            return EMPTY_STRINGS;
        }
        return (String[]) list.toArray(new String[list.size()]);
    }

    public HttpRequest receive(File file) throws HttpRequestException {
        try {
            final BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file), this.bufferSize);
            return (HttpRequest) new b<HttpRequest>(this.ignoreCloseExceptions, bufferedOutputStream) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public HttpRequest b() throws HttpRequestException, IOException {
                    return HttpRequest.this.receive(bufferedOutputStream);
                }
            }.call();
        } catch (FileNotFoundException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest send(final Reader reader) throws HttpRequestException {
        try {
            openOutput();
            final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.output, this.output.f81406a.charset());
            return (HttpRequest) new c<HttpRequest>(outputStreamWriter) {
                /* access modifiers changed from: protected */
                /* renamed from: a */
                public HttpRequest b() throws IOException {
                    return HttpRequest.this.copy(reader, outputStreamWriter);
                }
            }.call();
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public static HttpRequest post(URL url2) throws HttpRequestException {
        HttpRequest httpRequest = new HttpRequest(url2, "POST");
        httpRequest.getConnection().setConnectTimeout(connectTimeout);
        httpRequest.getConnection().setReadTimeout(readTimeOut);
        return httpRequest;
    }

    public HttpRequest receive(Appendable appendable) throws HttpRequestException {
        final BufferedReader bufferedReader = bufferedReader();
        final Appendable appendable2 = appendable;
        AnonymousClass7 r0 = new b<HttpRequest>(bufferedReader, this.ignoreCloseExceptions) {
            /* renamed from: a */
            public HttpRequest b() throws IOException {
                CharBuffer allocate = CharBuffer.allocate(HttpRequest.this.bufferSize);
                while (true) {
                    int read = bufferedReader.read(allocate);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    allocate.rewind();
                    appendable2.append(allocate, 0, read);
                    allocate.rewind();
                }
            }
        };
        return (HttpRequest) r0.call();
    }

    public HttpRequest send(CharSequence charSequence) throws HttpRequestException {
        try {
            openOutput();
            this.output.a(charSequence.toString());
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public static String encode(CharSequence charSequence) throws HttpRequestException {
        try {
            URL url2 = new URL(charSequence.toString());
            String host = url2.getHost();
            if (url2.getPort() != -1) {
                host = host + ':' + Integer.toString(r1);
            }
            try {
                URI uri = new URI(url2.getProtocol(), host, url2.getPath(), url2.getQuery(), null);
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
                throw new HttpRequestException(iOException);
            }
        } catch (IOException e3) {
            throw new HttpRequestException(e3);
        }
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getParams(String str) {
        int i;
        if (str == null || str.length() == 0) {
            return Collections.emptyMap();
        }
        int length = str.length();
        int indexOf = str.indexOf(59) + 1;
        if (indexOf == 0 || indexOf == length) {
            return Collections.emptyMap();
        }
        int indexOf2 = str.indexOf(59, indexOf);
        if (indexOf2 == -1) {
            indexOf2 = length;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (indexOf < i) {
            int indexOf3 = str.indexOf(61, indexOf);
            if (indexOf3 != -1 && indexOf3 < i) {
                String trim = str.substring(indexOf, indexOf3).trim();
                if (trim.length() > 0) {
                    String trim2 = str.substring(indexOf3 + 1, i).trim();
                    int length2 = trim2.length();
                    if (length2 != 0) {
                        if (length2 > 2 && '\"' == trim2.charAt(0)) {
                            int i2 = length2 - 1;
                            if ('\"' == trim2.charAt(i2)) {
                                linkedHashMap.put(trim, trim2.substring(1, i2));
                            }
                        }
                        linkedHashMap.put(trim, trim2);
                    }
                }
            }
            indexOf = i + 1;
            i = str.indexOf(59, indexOf);
            if (i == -1) {
                i = length;
            }
        }
        return linkedHashMap;
    }

    public HttpRequest send(byte[] bArr) throws HttpRequestException {
        return send((InputStream) new ByteArrayInputStream(bArr));
    }

    public HttpRequest form(Object obj, Object obj2) throws HttpRequestException {
        return form(obj, obj2, "UTF-8");
    }

    public HttpRequest header(String str, String str2) {
        getConnection().setRequestProperty(str, str2);
        return this;
    }

    public HttpRequest part(String str, File file) throws HttpRequestException {
        return part(str, (String) null, file);
    }

    /* access modifiers changed from: protected */
    public HttpRequest writePartHeader(String str, String str2) throws IOException {
        return writePartHeader(str, str2, null);
    }

    public HttpRequest(URL url2, String str) throws HttpRequestException {
        this.url = url2;
        this.requestMethod = str;
    }

    public HttpRequest body(AtomicReference<String> atomicReference, String str) throws HttpRequestException {
        atomicReference.set(body(str));
        return this;
    }

    public long dateHeader(String str, long j) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldDate(str, j);
    }

    public HttpRequest header(String str, Number number) {
        String str2;
        if (number != null) {
            str2 = number.toString();
        } else {
            str2 = null;
        }
        return header(str, str2);
    }

    public int intHeader(String str, int i) throws HttpRequestException {
        closeOutputQuietly();
        return getConnection().getHeaderFieldInt(str, i);
    }

    public String parameter(String str, String str2) {
        return getParam(header(str), str2);
    }

    public HttpRequest part(String str, InputStream inputStream) throws HttpRequestException {
        return part(str, (String) null, (String) null, inputStream);
    }

    public HttpRequest(CharSequence charSequence, String str) throws HttpRequestException {
        try {
            this.url = new URL(charSequence.toString());
            this.requestMethod = str;
        } catch (MalformedURLException e2) {
            throw new HttpRequestException(e2);
        }
    }

    private static StringBuilder addPathSeparator(String str, StringBuilder sb) {
        if (str.indexOf(58) + 2 == str.lastIndexOf(47)) {
            sb.append('/');
        }
        return sb;
    }

    private static String setProperty(final String str, final String str2) {
        PrivilegedAction privilegedAction;
        if (str2 != null) {
            privilegedAction = new PrivilegedAction<String>() {
                /* renamed from: a */
                public final String run() {
                    return System.setProperty(str, str2);
                }
            };
        } else {
            privilegedAction = new PrivilegedAction<String>() {
                /* renamed from: a */
                public final String run() {
                    return System.clearProperty(str);
                }
            };
        }
        return (String) AccessController.doPrivileged(privilegedAction);
    }

    /* access modifiers changed from: protected */
    public HttpRequest copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        final InputStream inputStream2 = inputStream;
        final OutputStream outputStream2 = outputStream;
        AnonymousClass9 r0 = new b<HttpRequest>(inputStream, this.ignoreCloseExceptions) {
            /* renamed from: a */
            public HttpRequest b() throws IOException {
                byte[] bArr = new byte[HttpRequest.this.bufferSize];
                while (true) {
                    int read = inputStream2.read(bArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    outputStream2.write(bArr, 0, read);
                }
            }
        };
        return (HttpRequest) r0.call();
    }

    public HttpRequest form(Map.Entry<?, ?> entry, String str) throws HttpRequestException {
        return form(entry.getKey(), entry.getValue(), str);
    }

    public HttpRequest part(String str, Number number) throws HttpRequestException {
        return part(str, (String) null, number);
    }

    public HttpRequest partHeader(String str, String str2) throws HttpRequestException {
        return send((CharSequence) str).send((CharSequence) ": ").send((CharSequence) str2).send((CharSequence) "\r\n");
    }

    public HttpRequest useProxy(String str, int i) {
        if (this.connection == null) {
            this.httpProxyHost = str;
            this.httpProxyPort = i;
            return this;
        }
        throw new IllegalStateException("The connection has already been created. This method must be called before reading or writing to the request.");
    }

    private static StringBuilder addParamPrefix(String str, StringBuilder sb) {
        int indexOf = str.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && str.charAt(length) != '&') {
            sb.append('&');
        }
        return sb;
    }

    public HttpRequest basic(String str, String str2) {
        return authorization("Basic " + a.a(str + ':' + str2));
    }

    public HttpRequest contentType(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return header("Content-Type", str);
        }
        return header("Content-Type", str + "; charset=" + str2);
    }

    /* access modifiers changed from: protected */
    public HttpRequest copy(Reader reader, Writer writer) throws IOException {
        final Reader reader2 = reader;
        final Writer writer2 = writer;
        AnonymousClass10 r0 = new b<HttpRequest>(reader, this.ignoreCloseExceptions) {
            /* renamed from: a */
            public HttpRequest b() throws IOException {
                char[] cArr = new char[HttpRequest.this.bufferSize];
                while (true) {
                    int read = reader2.read(cArr);
                    if (read == -1) {
                        return HttpRequest.this;
                    }
                    writer2.write(cArr, 0, read);
                }
            }
        };
        return (HttpRequest) r0.call();
    }

    public HttpRequest part(String str, String str2) {
        return part(str, (String) null, str2);
    }

    public HttpRequest proxyBasic(String str, String str2) {
        return proxyAuthorization("Basic " + a.a(str + ':' + str2));
    }

    public static String append(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        addPathSeparator(charSequence2, sb);
        addParamPrefix(charSequence2, sb);
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

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006f A[SYNTHETIC] */
    protected java.lang.String getParam(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0071
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x0071
        L_0x000a:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x0070
            if (r3 != r1) goto L_0x001b
            goto L_0x0070
        L_0x001b:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r9 = 2
            if (r7 <= r9) goto L_0x0065
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L_0x0065
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L_0x0065
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        L_0x0070:
            return r0
        L_0x0071:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.util.HttpRequest.getParam(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String append(CharSequence charSequence, Object... objArr) {
        String charSequence2 = charSequence.toString();
        if (objArr == null || objArr.length == 0) {
            return charSequence2;
        }
        if (objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder(charSequence2);
            addPathSeparator(charSequence2, sb);
            addParamPrefix(charSequence2, sb);
            sb.append(objArr[0]);
            sb.append('=');
            Object obj = objArr[1];
            if (obj != null) {
                sb.append(obj);
            }
            for (int i = 2; i < objArr.length; i += 2) {
                sb.append('&');
                sb.append(objArr[i]);
                sb.append('=');
                Object obj2 = objArr[i + 1];
                if (obj2 != null) {
                    sb.append(obj2);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Must specify an even number of parameter names/values");
    }

    public HttpRequest form(Map<?, ?> map, String str) throws HttpRequestException {
        if (!map.isEmpty()) {
            for (Map.Entry<?, ?> form2 : map.entrySet()) {
                form(form2, str);
            }
        }
        return this;
    }

    public static HttpRequest delete(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return delete((CharSequence) append);
    }

    public static HttpRequest get(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return get((CharSequence) append);
    }

    public static HttpRequest head(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return head((CharSequence) append);
    }

    public static HttpRequest post(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return post((CharSequence) append);
    }

    public static HttpRequest put(CharSequence charSequence, Map<?, ?> map, boolean z) {
        String append = append(charSequence, map);
        if (z) {
            append = encode(append);
        }
        return put((CharSequence) append);
    }

    public static HttpRequest delete(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return delete((CharSequence) append);
    }

    public static HttpRequest get(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return get((CharSequence) append);
    }

    public static HttpRequest head(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return head((CharSequence) append);
    }

    public static HttpRequest put(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return put((CharSequence) append);
    }

    public static HttpRequest post(CharSequence charSequence, boolean z, Object... objArr) {
        String append = append(charSequence, objArr);
        if (z) {
            append = encode(append);
        }
        return post((CharSequence) append);
    }

    /* access modifiers changed from: protected */
    public HttpRequest writePartHeader(String str, String str2, String str3) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(str);
        if (str2 != null) {
            sb.append("\"; filename=\"");
            sb.append(str2);
        }
        sb.append('\"');
        partHeader("Content-Disposition", sb.toString());
        if (str3 != null) {
            partHeader("Content-Type", str3);
        }
        return send((CharSequence) "\r\n");
    }

    public HttpRequest form(Object obj, Object obj2, String str) throws HttpRequestException {
        boolean z = !this.form;
        if (z) {
            contentType("application/x-www-form-urlencoded", str);
            this.form = true;
        }
        String validCharset = getValidCharset(str);
        try {
            openOutput();
            if (!z) {
                this.output.write(38);
            }
            this.output.a(URLEncoder.encode(obj.toString(), validCharset));
            this.output.write(61);
            if (obj2 != null) {
                this.output.a(URLEncoder.encode(obj2.toString(), validCharset));
            }
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest part(String str, String str2, File file) throws HttpRequestException {
        return part(str, str2, (String) null, file);
    }

    public HttpRequest part(String str, String str2, Number number) throws HttpRequestException {
        String str3;
        if (number != null) {
            str3 = number.toString();
        } else {
            str3 = null;
        }
        return part(str, str2, str3);
    }

    public HttpRequest part(String str, String str2, String str3) throws HttpRequestException {
        return part(str, str2, (String) null, str3);
    }

    public HttpRequest part(String str, String str2, String str3, File file) throws HttpRequestException {
        try {
            return part(str, str2, str3, (InputStream) new BufferedInputStream(new FileInputStream(file)));
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest part(String str, String str2, String str3, InputStream inputStream) throws HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            copy(inputStream, (OutputStream) this.output);
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest part(String str, String str2, String str3, String str4) throws HttpRequestException {
        try {
            startPart();
            writePartHeader(str, str2, str3);
            this.output.a(str4);
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }
}
