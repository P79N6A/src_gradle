package com.bytedance.retrofit2;

import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class a extends Converter.Factory {

    /* renamed from: com.bytedance.retrofit2.a$a  reason: collision with other inner class name */
    static final class C0223a implements Converter<TypedInput, TypedInput> {

        /* renamed from: a  reason: collision with root package name */
        static final C0223a f21843a = new C0223a();

        C0223a() {
        }

        public final /* synthetic */ Object convert(Object obj) throws IOException {
            return a((TypedInput) obj);
        }

        private static TypedInput a(TypedInput typedInput) throws IOException {
            if (typedInput == null || (typedInput instanceof TypedByteArray)) {
                return typedInput;
            }
            String mimeType = typedInput.mimeType();
            InputStream in = typedInput.in();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (in != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = in.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                return new TypedByteArray(mimeType, byteArrayOutputStream.toByteArray(), new String[0]);
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    static final class b implements Converter<Header, Header> {

        /* renamed from: a  reason: collision with root package name */
        static final b f21844a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object convert(Object obj) throws IOException {
            return (Header) obj;
        }
    }

    static final class c implements Converter<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        static final c f21845a = new c();

        public final Object convert(Object obj) throws IOException {
            return obj;
        }

        c() {
        }
    }

    static final class d implements Converter<TypedOutput, TypedOutput> {

        /* renamed from: a  reason: collision with root package name */
        static final d f21846a = new d();

        d() {
        }

        public final /* bridge */ /* synthetic */ Object convert(Object obj) throws IOException {
            return (TypedOutput) obj;
        }
    }

    static final class e implements Converter<TypedInput, TypedInput> {

        /* renamed from: a  reason: collision with root package name */
        static final e f21847a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ Object convert(Object obj) throws IOException {
            return (TypedInput) obj;
        }
    }

    static final class f implements Converter<String, String> {

        /* renamed from: a  reason: collision with root package name */
        static final f f21848a = new f();

        f() {
        }

        public final /* bridge */ /* synthetic */ Object convert(Object obj) throws IOException {
            return (String) obj;
        }
    }

    static final class g implements Converter<TypedInput, String> {

        /* renamed from: a  reason: collision with root package name */
        static final g f21849a = new g();

        g() {
        }

        public final /* synthetic */ Object convert(Object obj) throws IOException {
            TypedInput typedInput = (TypedInput) obj;
            if (!(typedInput instanceof TypedByteArray)) {
                return null;
            }
            String str = "UTF-8";
            if (typedInput.mimeType() != null) {
                str = com.bytedance.retrofit2.mime.c.a(typedInput.mimeType(), str);
            }
            return new String(((TypedByteArray) typedInput).getBytes(), str);
        }
    }

    static final class h implements Converter<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        static final h f21850a = new h();

        h() {
        }

        public final /* synthetic */ Object convert(Object obj) throws IOException {
            return String.valueOf(obj);
        }
    }

    static final class i implements Converter<TypedInput, Void> {

        /* renamed from: a  reason: collision with root package name */
        static final i f21851a = new i();

        i() {
        }

        public final /* synthetic */ Object convert(Object obj) throws IOException {
            InputStream in = ((TypedInput) obj).in();
            if (in != null) {
                in.close();
            }
            return null;
        }
    }

    a() {
    }

    public final Converter<?, Header> headerConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == Header.class) {
            return b.f21844a;
        }
        return null;
    }

    public final Converter<?, Object> objectConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == Object.class) {
            return c.f21845a;
        }
        return null;
    }

    public final Converter<?, String> stringConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == String.class) {
            return f.f21848a;
        }
        return null;
    }

    public final Converter<TypedInput, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (type == TypedInput.class) {
            Class<Streaming> cls = Streaming.class;
            int length = annotationArr.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (cls.isInstance(annotationArr[i2])) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                return e.f21847a;
            }
            return C0223a.f21843a;
        } else if (type == String.class) {
            return g.f21849a;
        } else {
            if (type == Void.class) {
                return i.f21851a;
            }
            return null;
        }
    }

    public final Converter<?, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        if (TypedOutput.class.isAssignableFrom(s.a(type))) {
            return d.f21846a;
        }
        return null;
    }
}
