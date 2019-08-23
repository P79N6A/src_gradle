package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.e;
import retrofit2.http.Streaming;

public final class a extends e.a {

    /* renamed from: retrofit2.a$a  reason: collision with other inner class name */
    static final class C0901a implements e<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        static final C0901a f84213a = new C0901a();

        C0901a() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) throws IOException {
            return a((ResponseBody) obj);
        }

        private static ResponseBody a(ResponseBody responseBody) throws IOException {
            try {
                return p.a(responseBody);
            } finally {
                responseBody.close();
            }
        }
    }

    static final class b implements e<RequestBody, RequestBody> {

        /* renamed from: a  reason: collision with root package name */
        static final b f84222a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) throws IOException {
            return (RequestBody) obj;
        }
    }

    static final class c implements e<ResponseBody, ResponseBody> {

        /* renamed from: a  reason: collision with root package name */
        static final c f84244a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) throws IOException {
            return (ResponseBody) obj;
        }
    }

    static final class d implements e<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        static final d f84245a = new d();

        d() {
        }

        public final /* synthetic */ Object a(Object obj) throws IOException {
            return obj.toString();
        }
    }

    static final class e implements e<ResponseBody, Void> {

        /* renamed from: a  reason: collision with root package name */
        static final e f84246a = new e();

        e() {
        }

        public final /* synthetic */ Object a(Object obj) throws IOException {
            ((ResponseBody) obj).close();
            return null;
        }
    }

    a() {
    }

    public final e<ResponseBody, ?> a(Type type, Annotation[] annotationArr, n nVar) {
        if (type == ResponseBody.class) {
            Class<Streaming> cls = Streaming.class;
            int length = annotationArr.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (cls.isInstance(annotationArr[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return c.f84244a;
            }
            return C0901a.f84213a;
        } else if (type == Void.class) {
            return e.f84246a;
        } else {
            return null;
        }
    }

    public final e<?, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, n nVar) {
        if (RequestBody.class.isAssignableFrom(p.a(type))) {
            return b.f84222a;
        }
        return null;
    }
}
