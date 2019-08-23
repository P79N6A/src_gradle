package com.bytedance.retrofit2;

import com.bytedance.retrofit2.CallAdapter;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.a;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.http.DELETE;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.HEAD;
import com.bytedance.retrofit2.http.HTTP;
import com.bytedance.retrofit2.http.Headers;
import com.bytedance.retrofit2.http.Multipart;
import com.bytedance.retrofit2.http.OPTIONS;
import com.bytedance.retrofit2.http.PATCH;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.PUT;
import com.bytedance.retrofit2.http.Priority;
import com.bytedance.retrofit2.http.Streaming;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public final class Retrofit {
    private final List<CallAdapter.Factory> adapterFactories;
    private final Executor callbackExecutor;
    private final Client.Provider clientProvider;
    private final List<Converter.Factory> converterFactories;
    private final Executor httpExecutor;
    private final List<Interceptor> interceptors;
    private final e server;
    private final Map<Method, p> serviceMethodCache = new LinkedHashMap();
    private final boolean validateEagerly;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private l f21830a;

        /* renamed from: b  reason: collision with root package name */
        private Client.Provider f21831b;

        /* renamed from: c  reason: collision with root package name */
        private e f21832c;

        /* renamed from: d  reason: collision with root package name */
        private List<Interceptor> f21833d;

        /* renamed from: e  reason: collision with root package name */
        private List<Converter.Factory> f21834e;

        /* renamed from: f  reason: collision with root package name */
        private List<CallAdapter.Factory> f21835f;
        private Executor g;
        private Executor h;
        private boolean i;

        public a() {
            this(l.a());
        }

        public final Retrofit a() {
            if (this.f21832c == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            } else if (this.f21831b == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            } else if (this.g != null) {
                Executor executor = this.h;
                if (executor == null) {
                    executor = this.f21830a.c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f21835f);
                arrayList.add(this.f21830a.a(executor2));
                Retrofit retrofit = new Retrofit(this.f21832c, this.f21831b, this.f21833d, new ArrayList(this.f21834e), arrayList, this.g, executor2, this.i);
                return retrofit;
            } else {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
        }

        private a b(Client.Provider provider) {
            this.f21831b = (Client.Provider) s.a(provider, "provider == null");
            return this;
        }

        public final a a(CallAdapter.Factory factory) {
            this.f21835f.add(s.a(factory, "factory == null"));
            return this;
        }

        public final a a(Converter.Factory factory) {
            this.f21834e.add(s.a(factory, "factory == null"));
            return this;
        }

        private a(l lVar) {
            this.f21833d = new LinkedList();
            this.f21834e = new ArrayList();
            this.f21835f = new ArrayList();
            this.f21830a = lVar;
            this.f21834e.add(new a());
        }

        public final a a(Client.Provider provider) {
            return b((Client.Provider) s.a(provider, "provider == null"));
        }

        public final a a(Interceptor interceptor) {
            this.f21833d.add((Interceptor) s.a(interceptor, "interceptor == null"));
            return this;
        }

        public final a a(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f21832c = f.a(str);
            return this;
        }

        public final a a(Executor executor) {
            this.g = (Executor) s.a(executor, "httpExecutor == null");
            return this;
        }
    }

    public final List<CallAdapter.Factory> callAdapterFactories() {
        return this.adapterFactories;
    }

    public final Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public final Client.Provider clientProvider() {
        return this.clientProvider;
    }

    public final List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public final Executor httpExecutor() {
        return this.httpExecutor;
    }

    public final List<Interceptor> interceptors() {
        return this.interceptors;
    }

    public final e server() {
        return this.server;
    }

    private void eagerlyValidateMethods(Class<?> cls) {
        for (Method loadServiceMethod : cls.getDeclaredMethods()) {
            loadServiceMethod(loadServiceMethod);
        }
    }

    public final <T> T create(final Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length <= 0) {
            if (this.validateEagerly) {
                eagerlyValidateMethods(cls);
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {

                /* renamed from: c  reason: collision with root package name */
                private final l f21829c = l.a();

                public final Object invoke(Object obj, Method method, Object... objArr) throws Throwable {
                    if (method.getDeclaringClass() == Object.class) {
                        return method.invoke(this, objArr);
                    }
                    p loadServiceMethod = Retrofit.this.loadServiceMethod(method);
                    return loadServiceMethod.f21934d.a(new SsHttpCall(loadServiceMethod, objArr));
                }
            });
        } else {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* access modifiers changed from: package-private */
    public final p loadServiceMethod(Method method) {
        p pVar;
        synchronized (this.serviceMethodCache) {
            pVar = this.serviceMethodCache.get(method);
            if (pVar == null) {
                p.a aVar = new p.a(this, method);
                aVar.E = aVar.a();
                aVar.l = aVar.E.a();
                if (aVar.l != Response.class) {
                    aVar.D = aVar.b();
                    for (Annotation annotation : aVar.f21939c) {
                        if (annotation instanceof DELETE) {
                            aVar.a("DELETE", ((DELETE) annotation).a(), false);
                        } else if (annotation instanceof GET) {
                            aVar.a("GET", ((GET) annotation).value(), false);
                        } else if (annotation instanceof HEAD) {
                            aVar.a("HEAD", ((HEAD) annotation).a(), false);
                            if (!Void.class.equals(aVar.l)) {
                                throw aVar.a("HEAD method must use Void as response type.", new Object[0]);
                            }
                        } else if (annotation instanceof PATCH) {
                            aVar.a("PATCH", ((PATCH) annotation).a(), true);
                        } else if (annotation instanceof POST) {
                            aVar.a("POST", ((POST) annotation).value(), true);
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
                                aVar.y = aVar.a(a2);
                            } else {
                                throw aVar.a("@Headers annotation is empty.", new Object[0]);
                            }
                        } else if (annotation instanceof Multipart) {
                            if (!aVar.v) {
                                aVar.w = true;
                            } else {
                                throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (annotation instanceof FormUrlEncoded) {
                            if (!aVar.w) {
                                aVar.v = true;
                            } else {
                                throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                            }
                        } else if (annotation instanceof Streaming) {
                            aVar.g = true;
                        } else if (annotation instanceof Priority) {
                            aVar.f21942f = ((Priority) annotation).a();
                        }
                        if (l.b()) {
                            if (annotation instanceof retrofit2.http.DELETE) {
                                aVar.a("DELETE", ((retrofit2.http.DELETE) annotation).a(), false);
                            } else if (annotation instanceof retrofit2.http.GET) {
                                aVar.a("GET", ((retrofit2.http.GET) annotation).a(), false);
                            } else if (annotation instanceof retrofit2.http.HEAD) {
                                aVar.a("HEAD", ((retrofit2.http.HEAD) annotation).a(), false);
                                if (!Void.class.equals(aVar.l)) {
                                    throw aVar.a("HEAD method must use Void as response type.", new Object[0]);
                                }
                            } else if (annotation instanceof retrofit2.http.PATCH) {
                                aVar.a("PATCH", ((retrofit2.http.PATCH) annotation).a(), true);
                            } else if (annotation instanceof retrofit2.http.POST) {
                                aVar.a("POST", ((retrofit2.http.POST) annotation).a(), true);
                            } else if (annotation instanceof retrofit2.http.PUT) {
                                aVar.a("PUT", ((retrofit2.http.PUT) annotation).a(), true);
                            } else if (annotation instanceof retrofit2.http.OPTIONS) {
                                aVar.a("OPTIONS", ((retrofit2.http.OPTIONS) annotation).a(), false);
                            } else if (annotation instanceof retrofit2.http.HTTP) {
                                retrofit2.http.HTTP http2 = (retrofit2.http.HTTP) annotation;
                                aVar.a(http2.a(), http2.b(), http2.c());
                            } else if (annotation instanceof retrofit2.http.Headers) {
                                String[] a3 = ((retrofit2.http.Headers) annotation).a();
                                if (a3.length != 0) {
                                    aVar.y = aVar.a(a3);
                                } else {
                                    throw aVar.a("@Headers annotation is empty.", new Object[0]);
                                }
                            } else if (annotation instanceof retrofit2.http.Multipart) {
                                if (!aVar.v) {
                                    aVar.w = true;
                                } else {
                                    throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                                }
                            } else if (annotation instanceof retrofit2.http.FormUrlEncoded) {
                                if (!aVar.w) {
                                    aVar.v = true;
                                } else {
                                    throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                                }
                            } else if (annotation instanceof retrofit2.http.Streaming) {
                                aVar.g = true;
                            }
                        }
                    }
                    if (aVar.t != null) {
                        if (!aVar.u && !aVar.j) {
                            if (aVar.w) {
                                throw aVar.a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            } else if (aVar.v) {
                                throw aVar.a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            }
                        }
                        int length = aVar.f21940d.length;
                        aVar.C = new k[length];
                        int i = 0;
                        while (i < length) {
                            Type type = aVar.f21941e[i];
                            if (!s.d(type)) {
                                Annotation[] annotationArr = aVar.f21940d[i];
                                if (annotationArr != null) {
                                    aVar.C[i] = aVar.a(i, type, annotationArr);
                                    i++;
                                } else {
                                    throw aVar.a(i, "No Retrofit annotation found.", new Object[0]);
                                }
                            } else {
                                throw aVar.a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                            }
                        }
                        if (aVar.x == null) {
                            if (!aVar.r) {
                                throw aVar.a("Missing either @%s URL or @Url parameter.", aVar.t);
                            }
                        }
                        if (!aVar.v && !aVar.w && !aVar.u && !aVar.j) {
                            if (aVar.o) {
                                throw aVar.a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                            }
                        }
                        if (aVar.v) {
                            if (!aVar.m) {
                                throw aVar.a("Form-encode method must contain at least one @Field.", new Object[0]);
                            }
                        }
                        if (aVar.w) {
                            if (!aVar.n) {
                                throw aVar.a("Multipart method must contain at least one @Part.", new Object[0]);
                            }
                        }
                        p pVar2 = new p(aVar);
                        this.serviceMethodCache.put(method, pVar2);
                        pVar = pVar2;
                    } else {
                        throw aVar.a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                    }
                } else {
                    throw aVar.a("'" + s.a(aVar.l).getName() + "' is not a valid response body type.", new Object[0]);
                }
            }
        }
        return pVar;
    }

    public final CallAdapter<?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public final <T> Converter<TypedInput, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public final <T> Converter<T, Header> headerConverter(Type type, Annotation[] annotationArr) {
        s.a(type, "type == null");
        s.a(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, Header> headerConverter = this.converterFactories.get(i).headerConverter(type, annotationArr, this);
            if (headerConverter != null) {
                return headerConverter;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    public final <T> Converter<T, Object> objectConverter(Type type, Annotation[] annotationArr) {
        s.a(type, "type == null");
        s.a(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, Object> objectConverter = this.converterFactories.get(i).objectConverter(type, annotationArr, this);
            if (objectConverter != null) {
                return objectConverter;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    public final <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        s.a(type, "type == null");
        s.a(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> stringConverter = this.converterFactories.get(i).stringConverter(type, annotationArr, this);
            if (stringConverter != null) {
                return stringConverter;
            }
        }
        return a.h.f21850a;
    }

    public final <T> Converter<T, TypedOutput> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public final CallAdapter<?> nextCallAdapter(CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        s.a(type, "returnType == null");
        s.a(annotationArr, "annotations == null");
        int indexOf = this.adapterFactories.indexOf(factory) + 1;
        int size = this.adapterFactories.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?> callAdapter = this.adapterFactories.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.adapterFactories.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.adapterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.adapterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<TypedInput, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        s.a(type, "type == null");
        s.a(annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<TypedInput, T> responseBodyConverter = this.converterFactories.get(i).responseBodyConverter(type, annotationArr, this);
            if (responseBodyConverter != null) {
                return responseBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<T, TypedOutput> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        s.a(type, "type == null");
        s.a(annotationArr, "parameterAnnotations == null");
        s.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, TypedOutput> requestBodyConverter = this.converterFactories.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (requestBodyConverter != null) {
                return requestBodyConverter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append(10);
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    Retrofit(e eVar, Client.Provider provider, List<Interceptor> list, List<Converter.Factory> list2, List<CallAdapter.Factory> list3, Executor executor, Executor executor2, boolean z) {
        this.server = eVar;
        this.clientProvider = provider;
        this.interceptors = list;
        this.converterFactories = Collections.unmodifiableList(list2);
        this.adapterFactories = Collections.unmodifiableList(list3);
        this.httpExecutor = executor;
        this.callbackExecutor = executor2;
        this.validateEagerly = z;
    }
}
