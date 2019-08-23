package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.http.AddCommonParam;
import com.bytedance.retrofit2.http.Body;
import com.bytedance.retrofit2.http.ExtraInfo;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.HeaderList;
import com.bytedance.retrofit2.http.MaxLength;
import com.bytedance.retrofit2.http.Part;
import com.bytedance.retrofit2.http.PartMap;
import com.bytedance.retrofit2.http.Path;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.bytedance.retrofit2.k;
import com.bytedance.retrofit2.mime.TypedInput;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit2.http.HeaderMap;
import retrofit2.http.QueryName;

public final class p<T> {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f21931a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f21932b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c  reason: collision with root package name */
    final Client.Provider f21933c;

    /* renamed from: d  reason: collision with root package name */
    final CallAdapter<?> f21934d;

    /* renamed from: e  reason: collision with root package name */
    final List<Interceptor> f21935e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f21936f;
    final int g;
    final boolean h;
    final int i;
    final boolean j;
    final Object k;
    final Converter<TypedInput, T> l;
    private final e m;
    private final String n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final k<?>[] t;
    private List<Header> u;
    private String v;

    static final class a<T> {
        Set<String> A;
        String B;
        k<?>[] C;
        Converter<TypedInput, T> D;
        CallAdapter<?> E;

        /* renamed from: a  reason: collision with root package name */
        final Retrofit f21937a;

        /* renamed from: b  reason: collision with root package name */
        final Method f21938b;

        /* renamed from: c  reason: collision with root package name */
        final Annotation[] f21939c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f21940d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f21941e;

        /* renamed from: f  reason: collision with root package name */
        int f21942f = 1;
        boolean g;
        int h = -1;
        boolean i = true;
        boolean j;
        Object k;
        Type l;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        boolean q;
        boolean r;
        boolean s;
        String t;
        boolean u;
        boolean v;
        boolean w;
        String x;
        List<Header> y;
        String z;

        /* access modifiers changed from: package-private */
        public void a(String str, String str2, boolean z2) {
            if (this.t == null) {
                this.t = str;
                if (str != null) {
                    this.B = p.b(str);
                }
                if (this.B != null) {
                    this.j = true;
                }
                this.u = z2;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (p.f21931a.matcher(substring).find()) {
                            throw a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.x = str2;
                    this.A = p.a(str2);
                    return;
                }
                return;
            }
            throw a("Only one HTTP method is allowed. Found: %s and %s.", this.t, str);
        }

        /* access modifiers changed from: package-private */
        public List<Header> a(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.z = trim;
                } else {
                    arrayList.add(new Header(substring, trim));
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public Converter<TypedInput, T> b() {
            try {
                return this.f21937a.responseBodyConverter(this.l, this.f21938b.getAnnotations());
            } catch (RuntimeException e2) {
                throw a((Throwable) e2, "Unable to create converter for %s", this.l);
            }
        }

        /* access modifiers changed from: package-private */
        public CallAdapter<?> a() {
            Type genericReturnType = this.f21938b.getGenericReturnType();
            if (s.d(genericReturnType)) {
                throw a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f21937a.callAdapter(genericReturnType, this.f21938b.getAnnotations());
                } catch (RuntimeException e2) {
                    throw a((Throwable) e2, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        public RuntimeException a(String str, Object... objArr) {
            return a((Throwable) null, str, objArr);
        }

        public a(Retrofit retrofit, Method method) {
            this.f21937a = retrofit;
            this.f21938b = method;
            this.f21939c = method.getAnnotations();
            this.f21941e = method.getGenericParameterTypes();
            this.f21940d = method.getParameterAnnotations();
        }

        private void a(int i2, String str) {
            if (!p.f21932b.matcher(str).matches()) {
                throw a(i2, "@Path parameter name must match %s. Found: %s", p.f21931a.pattern(), str);
            } else if (!this.A.contains(str)) {
                throw a(i2, "URL \"%s\" does not contain \"{%s}\".", this.x, str);
            }
        }

        private RuntimeException a(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f21938b.getDeclaringClass().getSimpleName() + ClassUtils.PACKAGE_SEPARATOR + this.f21938b.getName(), th);
        }

        /* access modifiers changed from: package-private */
        public k<?> a(int i2, Type type, Annotation[] annotationArr) {
            k<?> kVar = null;
            for (Annotation annotation : annotationArr) {
                k<?> a2 = a(i2, type, annotationArr, annotation);
                if (a2 == null && l.b()) {
                    a2 = b(i2, type, annotationArr, annotation);
                }
                if (a2 != null) {
                    if (kVar == null) {
                        kVar = a2;
                    } else {
                        throw a(i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (kVar != null) {
                return kVar;
            }
            throw a(i2, "No Retrofit annotation found.", new Object[0]);
        }

        /* access modifiers changed from: package-private */
        public RuntimeException a(int i2, String str, Object... objArr) {
            return a(str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        private RuntimeException a(Throwable th, int i2, String str, Object... objArr) {
            return a(th, str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        private k<?> a(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                if (this.r) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.p) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.q) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.x == null) {
                    this.r = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new k.q();
                    }
                    throw a(i2, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.t);
                }
            } else if (annotation instanceof Path) {
                if (this.q) {
                    throw a(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.r) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.x != null) {
                    this.p = true;
                    Path path = (Path) annotation;
                    String a2 = path.a();
                    a(i2, a2);
                    return new k.m(a2, this.f21937a.stringConverter(type, annotationArr), path.b());
                } else {
                    throw a(i2, "@Path can only be used with relative url on @%s", this.t);
                }
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String a3 = query.a();
                boolean b2 = query.b();
                Class<?> a4 = s.a(type);
                this.q = true;
                if (Iterable.class.isAssignableFrom(a4)) {
                    if (type instanceof ParameterizedType) {
                        return new k.n(a3, this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr), b2).a();
                    }
                    throw a(i2, a4.getSimpleName() + " must include generic type (e.g., " + a4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a4.isArray()) {
                    return new k.n(a3, this.f21937a.stringConverter(type, annotationArr), b2);
                } else {
                    return new k.n(a3, this.f21937a.stringConverter(p.a(a4.getComponentType()), annotationArr), b2).b();
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> a5 = s.a(type);
                if (Map.class.isAssignableFrom(a5)) {
                    Type a6 = s.a(type, a5, Map.class);
                    if (a6 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a6;
                        Type a7 = s.a(0, parameterizedType);
                        if (String.class == a7) {
                            return new k.o(this.f21937a.stringConverter(s.a(1, parameterizedType), annotationArr), ((QueryMap) annotation).encode());
                        }
                        throw a(i2, "@QueryMap keys must be of type String: " + a7, new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof com.bytedance.retrofit2.http.Header) {
                String a8 = ((com.bytedance.retrofit2.http.Header) annotation).a();
                Class<?> a9 = s.a(type);
                if (Iterable.class.isAssignableFrom(a9)) {
                    if (type instanceof ParameterizedType) {
                        return new k.f(a8, this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr)).a();
                    }
                    throw a(i2, a9.getSimpleName() + " must include generic type (e.g., " + a9.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a9.isArray()) {
                    return new k.f(a8, this.f21937a.stringConverter(type, annotationArr));
                } else {
                    return new k.f(a8, this.f21937a.stringConverter(p.a(a9.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof HeaderList) {
                Class<?> a10 = s.a(type);
                if (List.class.isAssignableFrom(a10)) {
                    Type a11 = s.a(type, a10, List.class);
                    if (a11 instanceof ParameterizedType) {
                        Type a12 = s.a(0, (ParameterizedType) a11);
                        if (Header.class == a12) {
                            return new k.g(this.f21937a.headerConverter(a12, annotationArr));
                        }
                        throw a(i2, "@HeaderList keys must be of type retrofit.client.Header: " + a12, new Object[0]);
                    }
                    throw a(i2, "List must include generic types (e.g., List<Header>)", new Object[0]);
                }
                throw a(i2, "@HeaderList parameter type must be List.", new Object[0]);
            } else if (annotation instanceof Field) {
                if (this.v) {
                    Field field = (Field) annotation;
                    String a13 = field.a();
                    boolean b3 = field.b();
                    this.m = true;
                    Class<?> a14 = s.a(type);
                    if (Iterable.class.isAssignableFrom(a14)) {
                        if (type instanceof ParameterizedType) {
                            return new k.d(a13, this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr), b3).a();
                        }
                        throw a(i2, a14.getSimpleName() + " must include generic type (e.g., " + a14.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a14.isArray()) {
                        return new k.d(a13, this.f21937a.stringConverter(type, annotationArr), b3);
                    } else {
                        return new k.d(a13, this.f21937a.stringConverter(p.a(a14.getComponentType()), annotationArr), b3).b();
                    }
                } else {
                    throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof FieldMap) {
                if (this.v) {
                    Class<?> a15 = s.a(type);
                    if (Map.class.isAssignableFrom(a15)) {
                        Type a16 = s.a(type, a15, Map.class);
                        if (a16 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) a16;
                            Type a17 = s.a(0, parameterizedType2);
                            if (String.class == a17) {
                                Converter stringConverter = this.f21937a.stringConverter(s.a(1, parameterizedType2), annotationArr);
                                this.m = true;
                                return new k.e(stringConverter, ((FieldMap) annotation).a());
                            }
                            throw a(i2, "@FieldMap keys must be of type String: " + a17, new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof Part) {
                if (this.w) {
                    this.n = true;
                    return new k.C0224k(((Part) annotation).a(), this.f21937a.requestBodyConverter(type, annotationArr, this.f21939c));
                }
                throw a(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof PartMap) {
                if (this.w) {
                    this.n = true;
                    Class<?> a18 = s.a(type);
                    if (Map.class.isAssignableFrom(a18)) {
                        Type a19 = s.a(type, a18, Map.class);
                        if (a19 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a19;
                            Type a20 = s.a(0, parameterizedType3);
                            if (String.class == a20) {
                                return new k.l(this.f21937a.requestBodyConverter(s.a(1, parameterizedType3), annotationArr, this.f21939c), ((PartMap) annotation).encoding());
                            }
                            throw a(i2, "@PartMap keys must be of type String: " + a20, new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof Body) {
                if (this.v || this.w) {
                    throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.o) {
                    try {
                        Converter requestBodyConverter = this.f21937a.requestBodyConverter(type, annotationArr, this.f21939c);
                        this.o = true;
                        return new k.b(this.j, requestBodyConverter);
                    } catch (RuntimeException e2) {
                        throw a((Throwable) e2, i2, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (annotation instanceof com.bytedance.retrofit2.http.Method) {
                if (!this.s) {
                    this.s = true;
                    String a21 = ((com.bytedance.retrofit2.http.Method) annotation).a();
                    if (!p.f21932b.matcher(a21).matches()) {
                        throw a(i2, "@Method parameter name must match %s. Found: %s", p.f21931a.pattern(), a21);
                    } else if (this.B == null || this.B.equals(a21)) {
                        return new k.j(a21, this.f21937a.stringConverter(type, annotationArr));
                    } else {
                        throw a(i2, "Method \"%s\" does not contain \"{%s}\".", this.t, a21);
                    }
                } else {
                    throw a(i2, "Multiple @Method method annotations found.", new Object[0]);
                }
            } else if (annotation instanceof MaxLength) {
                try {
                    return new k.i(this.f21937a.stringConverter(type, annotationArr));
                } catch (RuntimeException e3) {
                    throw a((Throwable) e3, i2, "Unable to create @MaxLength converter for %s", type);
                }
            } else if (annotation instanceof AddCommonParam) {
                try {
                    return new k.a(this.f21937a.stringConverter(type, annotationArr));
                } catch (RuntimeException e4) {
                    throw a((Throwable) e4, i2, "Unable to create @AddCommonParam converter for %s", type);
                }
            } else if (!(annotation instanceof ExtraInfo)) {
                return null;
            } else {
                try {
                    return new k.c(this.f21937a.objectConverter(type, annotationArr));
                } catch (RuntimeException e5) {
                    throw a((Throwable) e5, i2, "Unable to create @ExtraInfo converter for %s", type);
                }
            }
        }

        private k<?> b(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof retrofit2.http.Url) {
                if (this.r) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.p) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.q) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.x == null) {
                    this.r = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new k.q();
                    }
                    throw a(i2, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.t);
                }
            } else if (annotation instanceof retrofit2.http.Path) {
                if (this.q) {
                    throw a(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.r) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.x != null) {
                    this.p = true;
                    retrofit2.http.Path path = (retrofit2.http.Path) annotation;
                    String a2 = path.a();
                    a(i2, a2);
                    return new k.m(a2, this.f21937a.stringConverter(type, annotationArr), !path.b());
                } else {
                    throw a(i2, "@Path can only be used with relative url on @%s", this.t);
                }
            } else if (annotation instanceof retrofit2.http.Query) {
                retrofit2.http.Query query = (retrofit2.http.Query) annotation;
                String a3 = query.a();
                boolean b2 = query.b();
                Class<?> a4 = s.a(type);
                this.q = true;
                if (Iterable.class.isAssignableFrom(a4)) {
                    if (type instanceof ParameterizedType) {
                        return new k.n(a3, this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr), !b2).a();
                    }
                    throw a(i2, a4.getSimpleName() + " must include generic type (e.g., " + a4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a4.isArray()) {
                    return new k.n(a3, this.f21937a.stringConverter(type, annotationArr), !b2);
                } else {
                    return new k.n(a3, this.f21937a.stringConverter(p.a(a4.getComponentType()), annotationArr), !b2).b();
                }
            } else if (annotation instanceof QueryName) {
                boolean a5 = ((QueryName) annotation).a();
                Class<?> a6 = s.a(type);
                this.q = true;
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (type instanceof ParameterizedType) {
                        return new k.p(this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr), a5).a();
                    }
                    throw a(i2, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a6.isArray()) {
                    return new k.p(this.f21937a.stringConverter(type, annotationArr), a5);
                } else {
                    return new k.p(this.f21937a.stringConverter(p.a(a6.getComponentType()), annotationArr), a5).b();
                }
            } else if (annotation instanceof retrofit2.http.QueryMap) {
                Class<?> a7 = s.a(type);
                if (Map.class.isAssignableFrom(a7)) {
                    Type a8 = s.a(type, a7, Map.class);
                    if (a8 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a8;
                        Type a9 = s.a(0, parameterizedType);
                        if (String.class == a9) {
                            return new k.o(this.f21937a.stringConverter(s.a(1, parameterizedType), annotationArr), !((retrofit2.http.QueryMap) annotation).a());
                        }
                        throw a(i2, "@QueryMap keys must be of type String: " + a9, new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Header) {
                String a10 = ((retrofit2.http.Header) annotation).a();
                Class<?> a11 = s.a(type);
                if (Iterable.class.isAssignableFrom(a11)) {
                    if (type instanceof ParameterizedType) {
                        return new k.f(a10, this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr)).a();
                    }
                    throw a(i2, a11.getSimpleName() + " must include generic type (e.g., " + a11.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a11.isArray()) {
                    return new k.f(a10, this.f21937a.stringConverter(type, annotationArr));
                } else {
                    return new k.f(a10, this.f21937a.stringConverter(p.a(a11.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> a12 = s.a(type);
                if (Map.class.isAssignableFrom(a12)) {
                    Type a13 = s.a(type, a12, Map.class);
                    if (a13 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a13;
                        Type a14 = s.a(0, parameterizedType2);
                        if (String.class == a14) {
                            return new k.h(this.f21937a.stringConverter(s.a(1, parameterizedType2), annotationArr));
                        }
                        throw a(i2, "@HeaderMap keys must be of type String: " + a14, new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Field) {
                if (this.v) {
                    retrofit2.http.Field field = (retrofit2.http.Field) annotation;
                    String a15 = field.a();
                    boolean b3 = field.b();
                    this.m = true;
                    Class<?> a16 = s.a(type);
                    if (Iterable.class.isAssignableFrom(a16)) {
                        if (type instanceof ParameterizedType) {
                            return new k.d(a15, this.f21937a.stringConverter(s.a(0, (ParameterizedType) type), annotationArr), !b3).a();
                        }
                        throw a(i2, a16.getSimpleName() + " must include generic type (e.g., " + a16.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a16.isArray()) {
                        return new k.d(a15, this.f21937a.stringConverter(type, annotationArr), !b3);
                    } else {
                        return new k.d(a15, this.f21937a.stringConverter(p.a(a16.getComponentType()), annotationArr), !b3).b();
                    }
                } else {
                    throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof retrofit2.http.FieldMap) {
                if (this.v) {
                    Class<?> a17 = s.a(type);
                    if (Map.class.isAssignableFrom(a17)) {
                        Type a18 = s.a(type, a17, Map.class);
                        if (a18 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a18;
                            Type a19 = s.a(0, parameterizedType3);
                            if (String.class == a19) {
                                Converter stringConverter = this.f21937a.stringConverter(s.a(1, parameterizedType3), annotationArr);
                                this.m = true;
                                return new k.e(stringConverter, !((retrofit2.http.FieldMap) annotation).a());
                            }
                            throw a(i2, "@FieldMap keys must be of type String: " + a19, new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.Part) {
                if (this.w) {
                    this.n = true;
                    return new k.C0224k(((retrofit2.http.Part) annotation).a(), this.f21937a.requestBodyConverter(type, annotationArr, this.f21939c));
                }
                throw a(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof retrofit2.http.PartMap) {
                if (this.w) {
                    this.n = true;
                    Class<?> a20 = s.a(type);
                    if (Map.class.isAssignableFrom(a20)) {
                        Type a21 = s.a(type, a20, Map.class);
                        if (a21 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a21;
                            Type a22 = s.a(0, parameterizedType4);
                            if (String.class == a22) {
                                return new k.l(this.f21937a.requestBodyConverter(s.a(1, parameterizedType4), annotationArr, this.f21939c), ((retrofit2.http.PartMap) annotation).a());
                            }
                            throw a(i2, "@PartMap keys must be of type String: " + a22, new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof retrofit2.http.Body)) {
                return null;
            } else {
                if (this.v || this.w) {
                    throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.o) {
                    try {
                        Converter requestBodyConverter = this.f21937a.requestBodyConverter(type, annotationArr, this.f21939c);
                        this.o = true;
                        return new k.b(this.j, requestBodyConverter);
                    } catch (RuntimeException e2) {
                        throw a((Throwable) e2, i2, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    static Set<String> a(String str) {
        Matcher matcher = f21931a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    static String b(String str) {
        Matcher matcher = f21931a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    static Class<?> a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    p(a<T> aVar) {
        this.f21933c = aVar.f21937a.clientProvider();
        this.f21934d = aVar.E;
        this.f21935e = aVar.f21937a.interceptors();
        this.f21936f = aVar.f21937a.httpExecutor();
        this.m = aVar.f21937a.server();
        this.l = aVar.D;
        this.n = aVar.t;
        this.o = aVar.x;
        this.q = aVar.u;
        this.r = aVar.v;
        this.s = aVar.w;
        this.t = aVar.C;
        this.u = aVar.y;
        this.v = aVar.z;
        this.g = aVar.f21942f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.p = aVar.j;
        this.k = aVar.k;
    }

    /* access modifiers changed from: package-private */
    public final Request a(h hVar, Object... objArr) throws IOException {
        int i2;
        Object[] objArr2 = objArr;
        m mVar = r2;
        m mVar2 = new m(this.n, this.m, this.o, this.u, this.v, this.g, this.h, this.i, this.j, this.k, this.q, this.r, this.s);
        k[] kVarArr = (k[]) this.t;
        if (objArr2 != null) {
            i2 = objArr2.length;
        } else {
            i2 = 0;
        }
        if (i2 == kVarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                kVarArr[i3].a(mVar, objArr2[i3]);
            }
            return mVar.a(hVar);
        }
        throw new IllegalArgumentException("Argument count (" + i2 + ") doesn't match expected count (" + kVarArr.length + ")");
    }
}
