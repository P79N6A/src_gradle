package okhttp3.logging;

import java.io.EOFException;
import java.nio.charset.Charset;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.internal.platform.Platform;
import okio.Buffer;

public final class HttpLoggingInterceptor implements Interceptor {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    private volatile Level level;
    private final Logger logger;

    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    public interface Logger {
        public static final Logger DEFAULT = new Logger() {
            public void log(String str) {
                Platform.get().log(4, str, null);
            }
        };

        void log(String str);
    }

    public final Level getLevel() {
        return this.level;
    }

    public HttpLoggingInterceptor() {
        this(Logger.DEFAULT);
    }

    public HttpLoggingInterceptor(Logger logger2) {
        this.level = Level.NONE;
        this.logger = logger2;
    }

    public final HttpLoggingInterceptor setLevel(Level level2) {
        if (level2 != null) {
            this.level = level2;
            return this;
        }
        throw new NullPointerException("level == null. Use Level.NONE instead.");
    }

    private boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        if (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) {
            return false;
        }
        return true;
    }

    static boolean isPlaintext(Buffer buffer) {
        long j;
        try {
            Buffer buffer2 = new Buffer();
            if (buffer.size() < 64) {
                j = buffer.size();
            } else {
                j = 64;
            }
            buffer.copyTo(buffer2, 0, j);
            for (int i = 0; i < 16 && !buffer2.exhausted(); i++) {
                int readUtf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(readUtf8CodePoint) && !Character.isWhitespace(readUtf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:92:0x030a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r17) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            okhttp3.logging.HttpLoggingInterceptor$Level r2 = r1.level
            okhttp3.Request r3 = r17.request()
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.NONE
            if (r2 != r4) goto L_0x0013
            okhttp3.Response r0 = r0.proceed(r3)
            return r0
        L_0x0013:
            okhttp3.logging.HttpLoggingInterceptor$Level r4 = okhttp3.logging.HttpLoggingInterceptor.Level.BODY
            r6 = 1
            if (r2 != r4) goto L_0x001a
            r4 = 1
            goto L_0x001b
        L_0x001a:
            r4 = 0
        L_0x001b:
            if (r4 != 0) goto L_0x0024
            okhttp3.logging.HttpLoggingInterceptor$Level r7 = okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS
            if (r2 != r7) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r2 = 0
            goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            okhttp3.RequestBody r7 = r3.body()
            if (r7 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            okhttp3.Connection r8 = r17.connection()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "--> "
            r9.<init>(r10)
            java.lang.String r10 = r3.method()
            r9.append(r10)
            r10 = 32
            r9.append(r10)
            okhttp3.HttpUrl r11 = r3.url()
            r9.append(r11)
            if (r8 == 0) goto L_0x0060
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = " "
            r11.<init>(r12)
            okhttp3.Protocol r8 = r8.protocol()
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            goto L_0x0062
        L_0x0060:
            java.lang.String r8 = ""
        L_0x0062:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            if (r2 != 0) goto L_0x008a
            if (r6 == 0) goto L_0x008a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " ("
            r9.append(r8)
            long r11 = r7.contentLength()
            r9.append(r11)
            java.lang.String r8 = "-byte body)"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
        L_0x008a:
            okhttp3.logging.HttpLoggingInterceptor$Logger r9 = r1.logger
            r9.log(r8)
            r8 = -1
            if (r2 == 0) goto L_0x01d3
            if (r6 == 0) goto L_0x00d1
            okhttp3.MediaType r11 = r7.contentType()
            if (r11 == 0) goto L_0x00b2
            okhttp3.logging.HttpLoggingInterceptor$Logger r11 = r1.logger
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Content-Type: "
            r12.<init>(r13)
            okhttp3.MediaType r13 = r7.contentType()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.log(r12)
        L_0x00b2:
            long r11 = r7.contentLength()
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x00d1
            okhttp3.logging.HttpLoggingInterceptor$Logger r11 = r1.logger
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Content-Length: "
            r12.<init>(r13)
            long r13 = r7.contentLength()
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.log(r12)
        L_0x00d1:
            okhttp3.Headers r11 = r3.headers()
            int r12 = r11.size()
            r13 = 0
        L_0x00da:
            if (r13 >= r12) goto L_0x0110
            java.lang.String r14 = r11.name(r13)
            java.lang.String r15 = "Content-Type"
            boolean r15 = r15.equalsIgnoreCase(r14)
            if (r15 != 0) goto L_0x010d
            java.lang.String r15 = "Content-Length"
            boolean r15 = r15.equalsIgnoreCase(r14)
            if (r15 != 0) goto L_0x010d
            okhttp3.logging.HttpLoggingInterceptor$Logger r15 = r1.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r14 = ": "
            r5.append(r14)
            java.lang.String r14 = r11.value(r13)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            r15.log(r5)
        L_0x010d:
            int r13 = r13 + 1
            goto L_0x00da
        L_0x0110:
            if (r4 == 0) goto L_0x01bc
            if (r6 != 0) goto L_0x0116
            goto L_0x01bc
        L_0x0116:
            okhttp3.Headers r5 = r3.headers()
            boolean r5 = r1.bodyHasUnknownEncoding(r5)
            if (r5 == 0) goto L_0x013e
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "--> END "
            r6.<init>(r7)
            java.lang.String r7 = r3.method()
            r6.append(r7)
            java.lang.String r7 = " (encoded body omitted)"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.log(r6)
            goto L_0x01d3
        L_0x013e:
            okio.Buffer r5 = new okio.Buffer
            r5.<init>()
            r7.writeTo(r5)
            java.nio.charset.Charset r6 = UTF8
            okhttp3.MediaType r11 = r7.contentType()
            if (r11 == 0) goto L_0x0154
            java.nio.charset.Charset r6 = UTF8
            java.nio.charset.Charset r6 = r11.charset(r6)
        L_0x0154:
            okhttp3.logging.HttpLoggingInterceptor$Logger r11 = r1.logger
            java.lang.String r12 = ""
            r11.log(r12)
            boolean r11 = isPlaintext(r5)
            if (r11 == 0) goto L_0x0193
            okhttp3.logging.HttpLoggingInterceptor$Logger r11 = r1.logger
            java.lang.String r5 = r5.readString(r6)
            r11.log(r5)
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "--> END "
            r6.<init>(r11)
            java.lang.String r11 = r3.method()
            r6.append(r11)
            java.lang.String r11 = " ("
            r6.append(r11)
            long r11 = r7.contentLength()
            r6.append(r11)
            java.lang.String r7 = "-byte body)"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.log(r6)
            goto L_0x01d3
        L_0x0193:
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "--> END "
            r6.<init>(r11)
            java.lang.String r11 = r3.method()
            r6.append(r11)
            java.lang.String r11 = " (binary "
            r6.append(r11)
            long r11 = r7.contentLength()
            r6.append(r11)
            java.lang.String r7 = "-byte body omitted)"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.log(r6)
            goto L_0x01d3
        L_0x01bc:
            okhttp3.logging.HttpLoggingInterceptor$Logger r5 = r1.logger
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "--> END "
            r6.<init>(r7)
            java.lang.String r7 = r3.method()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.log(r6)
        L_0x01d3:
            long r5 = java.lang.System.nanoTime()
            okhttp3.Response r0 = r0.proceed(r3)     // Catch:{ Exception -> 0x03ad }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r11 = java.lang.System.nanoTime()
            long r11 = r11 - r5
            long r5 = r3.toMillis(r11)
            okhttp3.ResponseBody r3 = r0.body()
            long r11 = r3.contentLength()
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x0204
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r11)
            java.lang.String r8 = "-byte"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x0206
        L_0x0204:
            java.lang.String r7 = "unknown-length"
        L_0x0206:
            okhttp3.logging.HttpLoggingInterceptor$Logger r8 = r1.logger
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r13 = "<-- "
            r9.<init>(r13)
            int r13 = r0.code()
            r9.append(r13)
            java.lang.String r13 = r0.message()
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x0223
            java.lang.String r13 = ""
            goto L_0x0235
        L_0x0223:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = " "
            r13.<init>(r14)
            java.lang.String r14 = r0.message()
            r13.append(r14)
            java.lang.String r13 = r13.toString()
        L_0x0235:
            r9.append(r13)
            r9.append(r10)
            okhttp3.Request r10 = r0.request()
            okhttp3.HttpUrl r10 = r10.url()
            r9.append(r10)
            java.lang.String r10 = " ("
            r9.append(r10)
            r9.append(r5)
            java.lang.String r5 = "ms"
            r9.append(r5)
            if (r2 != 0) goto L_0x0269
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = ", "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r6 = " body"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            goto L_0x026b
        L_0x0269:
            java.lang.String r5 = ""
        L_0x026b:
            r9.append(r5)
            r5 = 41
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            r8.log(r5)
            if (r2 == 0) goto L_0x03ac
            okhttp3.Headers r2 = r0.headers()
            int r5 = r2.size()
            r6 = 0
        L_0x0285:
            if (r6 >= r5) goto L_0x02ab
            okhttp3.logging.HttpLoggingInterceptor$Logger r7 = r1.logger
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r2.name(r6)
            r8.append(r9)
            java.lang.String r9 = ": "
            r8.append(r9)
            java.lang.String r9 = r2.value(r6)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.log(r8)
            int r6 = r6 + 1
            goto L_0x0285
        L_0x02ab:
            if (r4 == 0) goto L_0x03a5
            boolean r4 = okhttp3.internal.http.HttpHeaders.hasBody(r0)
            if (r4 != 0) goto L_0x02b5
            goto L_0x03a5
        L_0x02b5:
            okhttp3.Headers r4 = r0.headers()
            boolean r4 = r1.bodyHasUnknownEncoding(r4)
            if (r4 == 0) goto L_0x02c8
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP (encoded body omitted)"
            r2.log(r3)
            goto L_0x03ac
        L_0x02c8:
            okio.BufferedSource r4 = r3.source()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4.request(r5)
            okio.Buffer r4 = r4.buffer()
            java.lang.String r5 = "gzip"
            java.lang.String r6 = "Content-Encoding"
            java.lang.String r2 = r2.get(r6)
            boolean r2 = r5.equalsIgnoreCase(r2)
            r5 = 0
            if (r2 == 0) goto L_0x030e
            long r6 = r4.size()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            okio.GzipSource r6 = new okio.GzipSource     // Catch:{ all -> 0x0307 }
            okio.Buffer r4 = r4.clone()     // Catch:{ all -> 0x0307 }
            r6.<init>(r4)     // Catch:{ all -> 0x0307 }
            okio.Buffer r4 = new okio.Buffer     // Catch:{ all -> 0x0304 }
            r4.<init>()     // Catch:{ all -> 0x0304 }
            r4.writeAll(r6)     // Catch:{ all -> 0x0304 }
            r6.close()
            goto L_0x030f
        L_0x0304:
            r0 = move-exception
            r5 = r6
            goto L_0x0308
        L_0x0307:
            r0 = move-exception
        L_0x0308:
            if (r5 == 0) goto L_0x030d
            r5.close()
        L_0x030d:
            throw r0
        L_0x030e:
            r2 = r5
        L_0x030f:
            java.nio.charset.Charset r5 = UTF8
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L_0x031d
            java.nio.charset.Charset r5 = UTF8
            java.nio.charset.Charset r5 = r3.charset(r5)
        L_0x031d:
            boolean r3 = isPlaintext(r4)
            if (r3 != 0) goto L_0x0347
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = ""
            r2.log(r3)
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "<-- END HTTP (binary "
            r3.<init>(r5)
            long r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = "-byte body omitted)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.log(r3)
            return r0
        L_0x0347:
            r6 = 0
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x0361
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.String r6 = ""
            r3.log(r6)
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            okio.Buffer r6 = r4.clone()
            java.lang.String r5 = r6.readString(r5)
            r3.log(r5)
        L_0x0361:
            if (r2 == 0) goto L_0x0388
            okhttp3.logging.HttpLoggingInterceptor$Logger r3 = r1.logger
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "<-- END HTTP ("
            r5.<init>(r6)
            long r6 = r4.size()
            r5.append(r6)
            java.lang.String r4 = "-byte, "
            r5.append(r4)
            r5.append(r2)
            java.lang.String r2 = "-gzipped-byte body)"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r3.log(r2)
            goto L_0x03ac
        L_0x0388:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "<-- END HTTP ("
            r3.<init>(r5)
            long r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = "-byte body)"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.log(r3)
            goto L_0x03ac
        L_0x03a5:
            okhttp3.logging.HttpLoggingInterceptor$Logger r2 = r1.logger
            java.lang.String r3 = "<-- END HTTP"
            r2.log(r3)
        L_0x03ac:
            return r0
        L_0x03ad:
            r0 = move-exception
            r2 = r0
            okhttp3.logging.HttpLoggingInterceptor$Logger r0 = r1.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "<-- HTTP FAILED: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.log(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
