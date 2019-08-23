package retrofit2;

import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;

public final class l {

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f84310d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    String f84311a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    MultipartBody.Builder f84312b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public RequestBody f84313c;

    /* renamed from: e  reason: collision with root package name */
    private final String f84314e;

    /* renamed from: f  reason: collision with root package name */
    private final HttpUrl f84315f;
    @Nullable
    private HttpUrl.Builder g;
    private final Request.Builder h = new Request.Builder();
    @Nullable
    private MediaType i;
    private final boolean j;
    @Nullable
    private FormBody.Builder k;

    static class a extends RequestBody {

        /* renamed from: a  reason: collision with root package name */
        private final RequestBody f84316a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaType f84317b;

        public final MediaType contentType() {
            return this.f84317b;
        }

        public final long contentLength() throws IOException {
            return this.f84316a.contentLength();
        }

        public final void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f84316a.writeTo(bufferedSink);
        }

        a(RequestBody requestBody, MediaType mediaType) {
            this.f84316a = requestBody;
            this.f84317b = mediaType;
        }
    }

    /* access modifiers changed from: package-private */
    public final Request a() {
        HttpUrl httpUrl;
        HttpUrl.Builder builder = this.g;
        if (builder != null) {
            httpUrl = builder.build();
        } else {
            httpUrl = this.f84315f.resolve(this.f84311a);
            if (httpUrl == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f84315f + ", Relative: " + this.f84311a);
            }
        }
        a aVar = this.f84313c;
        if (aVar == null) {
            if (this.k != null) {
                aVar = this.k.build();
            } else if (this.f84312b != null) {
                aVar = this.f84312b.build();
            } else if (this.j) {
                aVar = RequestBody.create((MediaType) null, new byte[0]);
            }
        }
        MediaType mediaType = this.i;
        if (mediaType != null) {
            if (aVar != null) {
                aVar = new a(aVar, mediaType);
            } else {
                this.h.addHeader("Content-Type", mediaType.toString());
            }
        }
        return this.h.url(httpUrl).method(this.f84314e, aVar).build();
    }

    /* access modifiers changed from: package-private */
    public final void a(Headers headers, RequestBody requestBody) {
        this.f84312b.addPart(headers, requestBody);
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            MediaType parse = MediaType.parse(str2);
            if (parse != null) {
                this.i = parse;
                return;
            }
            throw new IllegalArgumentException("Malformed content type: " + str2);
        }
        this.h.addHeader(str, str2);
    }

    static String a(String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, i2);
                Buffer buffer2 = null;
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.writeUtf8CodePoint(codePointAt2);
                            while (!buffer2.exhausted()) {
                                byte readByte = buffer2.readByte() & 255;
                                buffer.writeByte(37);
                                buffer.writeByte((int) f84310d[(readByte >> 4) & 15]);
                                buffer.writeByte((int) f84310d[readByte & 15]);
                            }
                        } else {
                            buffer.writeUtf8CodePoint(codePointAt2);
                        }
                    }
                    i2 += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str, String str2, boolean z) {
        if (z) {
            this.k.addEncoded(str, str2);
        } else {
            this.k.add(str, str2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, @Nullable String str2, boolean z) {
        if (this.f84311a != null) {
            this.g = this.f84315f.newBuilder(this.f84311a);
            if (this.g != null) {
                this.f84311a = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f84315f + ", Relative: " + this.f84311a);
            }
        }
        if (z) {
            this.g.addEncodedQueryParameter(str, str2);
        } else {
            this.g.addQueryParameter(str, str2);
        }
    }

    l(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f84314e = str;
        this.f84315f = httpUrl;
        this.f84311a = str2;
        this.i = mediaType;
        this.j = z;
        if (headers != null) {
            this.h.headers(headers);
        }
        if (z2) {
            this.k = new FormBody.Builder();
            return;
        }
        if (z3) {
            this.f84312b = new MultipartBody.Builder();
            this.f84312b.setType(MultipartBody.FORM);
        }
    }
}
