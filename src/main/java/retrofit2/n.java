package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.a;
import retrofit2.c;
import retrofit2.e;
import retrofit2.http.DELETE;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Headers;
import retrofit2.http.Multipart;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.o;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Call.Factory f84321a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpUrl f84322b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e.a> f84323c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c.a> f84324d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final Executor f84325e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f84326f;
    private final Map<Method, o<?, ?>> g = new ConcurrentHashMap();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final k f84330a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private Call.Factory f84331b;

        /* renamed from: c  reason: collision with root package name */
        private HttpUrl f84332c;

        /* renamed from: d  reason: collision with root package name */
        private final List<e.a> f84333d;

        /* renamed from: e  reason: collision with root package name */
        private final List<c.a> f84334e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        private Executor f84335f;
        private boolean g;

        public a() {
            this(k.a());
        }

        public final n a() {
            if (this.f84332c != null) {
                Call.Factory factory = this.f84331b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Call.Factory factory2 = factory;
                Executor executor = this.f84335f;
                if (executor == null) {
                    executor = this.f84330a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f84334e);
                arrayList.add(this.f84330a.a(executor2));
                n nVar = new n(factory2, this.f84332c, new ArrayList(this.f84333d), arrayList, executor2, this.g);
                return nVar;
            }
            throw new IllegalStateException("Base URL required.");
        }

        public final a a(Call.Factory factory) {
            this.f84331b = (Call.Factory) p.a(factory, "factory == null");
            return this;
        }

        private a(k kVar) {
            this.f84333d = new ArrayList();
            this.f84334e = new ArrayList();
            this.f84330a = kVar;
            this.f84333d.add(new a());
        }

        public final a a(OkHttpClient okHttpClient) {
            return a((Call.Factory) p.a(okHttpClient, "client == null"));
        }

        private a a(HttpUrl httpUrl) {
            p.a(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f84332c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + httpUrl);
        }

        public final a a(String str) {
            p.a(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                return a(parse);
            }
            throw new IllegalArgumentException("Illegal URL: " + str);
        }

        public final a a(c.a aVar) {
            this.f84334e.add(p.a(aVar, "factory == null"));
            return this;
        }

        public final a a(e.a aVar) {
            this.f84333d.add(p.a(aVar, "factory == null"));
            return this;
        }
    }

    private void b(Class<?> cls) {
        k a2 = k.a();
        for (Method method : cls.getDeclaredMethods()) {
            if (!a2.a(method)) {
                a(method);
            }
        }
    }

    public final <T> T a(final Class<T> cls) {
        p.a(cls);
        if (this.f84326f) {
            b(cls);
        }
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

            /* renamed from: c  reason: collision with root package name */
            private final k f84329c = k.a();

            public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.f84329c.a(method)) {
                    return this.f84329c.a(method, cls, obj, objArr);
                }
                o<?, ?> a2 = n.this.a(method);
                return a2.f84339d.a(new i(a2, objArr));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final o<?, ?> a(Method method) {
        o<?, ?> oVar;
        o<?, ?> oVar2 = this.g.get(method);
        if (oVar2 != null) {
            return oVar2;
        }
        synchronized (this.g) {
            oVar = this.g.get(method);
            if (oVar == null) {
                o.a aVar = new o.a(this, method);
                aVar.w = aVar.a();
                aVar.f84347f = aVar.w.a();
                if (aVar.f84347f == m.class || aVar.f84347f == Response.class) {
                    throw aVar.a("'" + p.a(aVar.f84347f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                }
                aVar.v = aVar.b();
                for (Annotation annotation : aVar.f84344c) {
                    if (annotation instanceof DELETE) {
                        aVar.a("DELETE", ((DELETE) annotation).a(), false);
                    } else if (annotation instanceof GET) {
                        aVar.a("GET", ((GET) annotation).a(), false);
                    } else if (annotation instanceof HEAD) {
                        aVar.a("HEAD", ((HEAD) annotation).a(), false);
                        if (!Void.class.equals(aVar.f84347f)) {
                            throw aVar.a("HEAD method must use Void as response type.", new Object[0]);
                        }
                    } else if (annotation instanceof PATCH) {
                        aVar.a("PATCH", ((PATCH) annotation).a(), true);
                    } else if (annotation instanceof POST) {
                        aVar.a("POST", ((POST) annotation).a(), true);
                    } else if (annotation instanceof PUT) {
                        aVar.a("PUT", ((PUT) annotation).a(), true);
                    } else if (annotation instanceof OPTIONS) {
                        aVar.a("OPTIONS", ((OPTIONS) annotation).a(), false);
                    } else if (annotation instanceof HTTP) {
                        HTTP http = (HTTP) annotation;
                        aVar.a(http.a(), http.b(), http.c());
                    } else if (annotation instanceof Headers) {
                        String[] a2 = ((Headers) annotation).a();
                        if (a2.length != 0) {
                            aVar.r = aVar.a(a2);
                        } else {
                            throw aVar.a("@Headers annotation is empty.", new Object[0]);
                        }
                    } else if (annotation instanceof Multipart) {
                        if (!aVar.o) {
                            aVar.p = true;
                        } else {
                            throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (!(annotation instanceof FormUrlEncoded)) {
                        continue;
                    } else if (!aVar.p) {
                        aVar.o = true;
                    } else {
                        throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                    }
                }
                if (aVar.m != null) {
                    if (!aVar.n) {
                        if (aVar.p) {
                            throw aVar.a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        } else if (aVar.o) {
                            throw aVar.a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = aVar.f84345d.length;
                    aVar.u = new j[length];
                    int i = 0;
                    while (i < length) {
                        Type type = aVar.f84346e[i];
                        if (!p.d(type)) {
                            Annotation[] annotationArr = aVar.f84345d[i];
                            if (annotationArr != null) {
                                aVar.u[i] = aVar.a(i, type, annotationArr);
                                i++;
                            } else {
                                throw aVar.a(i, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw aVar.a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                    }
                    if (aVar.q == null) {
                        if (!aVar.l) {
                            throw aVar.a("Missing either @%s URL or @Url parameter.", aVar.m);
                        }
                    }
                    if (!aVar.o && !aVar.p && !aVar.n) {
                        if (aVar.i) {
                            throw aVar.a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                    }
                    if (aVar.o) {
                        if (!aVar.g) {
                            throw aVar.a("Form-encoded method must contain at least one @Field.", new Object[0]);
                        }
                    }
                    if (aVar.p) {
                        if (!aVar.h) {
                            throw aVar.a("Multipart method must contain at least one @Part.", new Object[0]);
                        }
                    }
                    o<?, ?> oVar3 = new o<>(aVar);
                    this.g.put(method, oVar3);
                    oVar = oVar3;
                } else {
                    throw aVar.a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
            }
        }
        return oVar;
    }

    public final <T> e<ResponseBody, T> a(Type type, Annotation[] annotationArr) {
        return a((e.a) null, type, annotationArr);
    }

    public final <T> e<T, String> b(Type type, Annotation[] annotationArr) {
        p.a(type, "type == null");
        p.a(annotationArr, "annotations == null");
        int size = this.f84323c.size();
        for (int i = 0; i < size; i++) {
            this.f84323c.get(i);
        }
        return a.d.f84245a;
    }

    private <T> e<ResponseBody, T> a(@Nullable e.a aVar, Type type, Annotation[] annotationArr) {
        p.a(type, "type == null");
        p.a(annotationArr, "annotations == null");
        int indexOf = this.f84323c.indexOf(null) + 1;
        int size = this.f84323c.size();
        for (int i = indexOf; i < size; i++) {
            e<ResponseBody, T> a2 = this.f84323c.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f84323c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f84323c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final c<?, ?> a(@Nullable c.a aVar, Type type, Annotation[] annotationArr) {
        p.a(type, "returnType == null");
        p.a(annotationArr, "annotations == null");
        int indexOf = this.f84324d.indexOf(aVar) + 1;
        int size = this.f84324d.size();
        for (int i = indexOf; i < size; i++) {
            c<?, ?> a2 = this.f84324d.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f84324d.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.f84324d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f84324d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> e<T, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        p.a(type, "type == null");
        p.a(annotationArr, "parameterAnnotations == null");
        p.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f84323c.indexOf(null) + 1;
        int size = this.f84323c.size();
        for (int i = indexOf; i < size; i++) {
            e<T, RequestBody> a2 = this.f84323c.get(i).a(type, annotationArr, annotationArr2, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.f84323c.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f84323c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    n(Call.Factory factory, HttpUrl httpUrl, List<e.a> list, List<c.a> list2, @Nullable Executor executor, boolean z) {
        this.f84321a = factory;
        this.f84322b = httpUrl;
        this.f84323c = Collections.unmodifiableList(list);
        this.f84324d = Collections.unmodifiableList(list2);
        this.f84325e = executor;
        this.f84326f = z;
    }
}
