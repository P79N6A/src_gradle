package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

public abstract class j<T> {

    static final class a<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, RequestBody> f84284a;

        a(e<T, RequestBody> eVar) {
            this.f84284a = eVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) {
            if (t != null) {
                try {
                    lVar.f84313c = (RequestBody) this.f84284a.a(t);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e2);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    static final class b<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f84285a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f84286b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f84287c;

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) throws IOException {
            if (t != null) {
                String str = (String) this.f84286b.a(t);
                if (str != null) {
                    lVar.b(this.f84285a, str, this.f84287c);
                }
            }
        }

        b(String str, e<T, String> eVar, boolean z) {
            this.f84285a = (String) p.a(str, "name == null");
            this.f84286b = eVar;
            this.f84287c = z;
        }
    }

    static final class c<T> extends j<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f84288a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f84289b;

        c(e<T, String> eVar, boolean z) {
            this.f84288a = eVar;
            this.f84289b = z;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(l lVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f84288a.a(value);
                            if (str2 != null) {
                                lVar.b(str, str2, this.f84289b);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + this.f84288a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Field map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    static final class d<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f84290a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f84291b;

        d(String str, e<T, String> eVar) {
            this.f84290a = (String) p.a(str, "name == null");
            this.f84291b = eVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) throws IOException {
            if (t != null) {
                String str = (String) this.f84291b.a(t);
                if (str != null) {
                    lVar.a(this.f84290a, str);
                }
            }
        }
    }

    static final class e<T> extends j<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f84292a;

        e(e<T, String> eVar) {
            this.f84292a = eVar;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(l lVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            lVar.a(str, (String) this.f84292a.a(value));
                        } else {
                            throw new IllegalArgumentException("Header map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    static final class f<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Headers f84293a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, RequestBody> f84294b;

        f(Headers headers, e<T, RequestBody> eVar) {
            this.f84293a = headers;
            this.f84294b = eVar;
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) {
            if (t != null) {
                try {
                    lVar.a(this.f84293a, (RequestBody) this.f84294b.a(t));
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e2);
                }
            }
        }
    }

    static final class g<T> extends j<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, RequestBody> f84295a;

        /* renamed from: b  reason: collision with root package name */
        private final String f84296b;

        g(e<T, RequestBody> eVar, String str) {
            this.f84295a = eVar;
            this.f84296b = str;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(l lVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            lVar.a(Headers.of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f84296b), (RequestBody) this.f84295a.a(value));
                        } else {
                            throw new IllegalArgumentException("Part map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    static final class h<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f84297a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f84298b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f84299c;

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) throws IOException {
            if (t != null) {
                String str = this.f84297a;
                String str2 = (String) this.f84298b.a(t);
                boolean z = this.f84299c;
                if (lVar.f84311a != null) {
                    String str3 = lVar.f84311a;
                    lVar.f84311a = str3.replace("{" + str + "}", l.a(str2, z));
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException("Path parameter \"" + this.f84297a + "\" value must not be null.");
        }

        h(String str, e<T, String> eVar, boolean z) {
            this.f84297a = (String) p.a(str, "name == null");
            this.f84298b = eVar;
            this.f84299c = z;
        }
    }

    static final class i<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f84300a;

        /* renamed from: b  reason: collision with root package name */
        private final e<T, String> f84301b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f84302c;

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) throws IOException {
            if (t != null) {
                String str = (String) this.f84301b.a(t);
                if (str != null) {
                    lVar.a(this.f84300a, str, this.f84302c);
                }
            }
        }

        i(String str, e<T, String> eVar, boolean z) {
            this.f84300a = (String) p.a(str, "name == null");
            this.f84301b = eVar;
            this.f84302c = z;
        }
    }

    /* renamed from: retrofit2.j$j  reason: collision with other inner class name */
    static final class C0904j<T> extends j<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f84303a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f84304b;

        C0904j(e<T, String> eVar, boolean z) {
            this.f84303a = eVar;
            this.f84304b = z;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(l lVar, @Nullable Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f84303a.a(value);
                            if (str2 != null) {
                                lVar.a(str, str2, this.f84304b);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + this.f84303a.getClass().getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException("Query map contained null value for key '" + str + "'.");
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    static final class k<T> extends j<T> {

        /* renamed from: a  reason: collision with root package name */
        private final e<T, String> f84305a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f84306b;

        k(e<T, String> eVar, boolean z) {
            this.f84305a = eVar;
            this.f84306b = z;
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable T t) throws IOException {
            if (t != null) {
                lVar.a((String) this.f84305a.a(t), null, this.f84306b);
            }
        }
    }

    static final class l extends j<MultipartBody.Part> {

        /* renamed from: a  reason: collision with root package name */
        static final l f84307a = new l();

        private l() {
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(l lVar, @Nullable Object obj) throws IOException {
            MultipartBody.Part part = (MultipartBody.Part) obj;
            if (part != null) {
                lVar.f84312b.addPart(part);
            }
        }
    }

    static final class m extends j<Object> {
        m() {
        }

        /* access modifiers changed from: package-private */
        public final void a(l lVar, @Nullable Object obj) {
            p.a(obj, "@Url parameter is null.");
            lVar.f84311a = obj.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a(l lVar, @Nullable T t) throws IOException;

    j() {
    }

    /* access modifiers changed from: package-private */
    public final j<Iterable<T>> a() {
        return new j<Iterable<T>>() {
            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a(l lVar, @Nullable Object obj) throws IOException {
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object a2 : iterable) {
                        j.this.a(lVar, a2);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final j<Object> b() {
        return new j<Object>() {
            /* access modifiers changed from: package-private */
            public final void a(l lVar, @Nullable Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        j.this.a(lVar, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
