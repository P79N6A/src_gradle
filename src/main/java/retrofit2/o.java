package retrofit2;

import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.c;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;
import retrofit2.http.Url;
import retrofit2.j;

public final class o<R, T> {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f84336a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f84337b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c  reason: collision with root package name */
    final Call.Factory f84338c;

    /* renamed from: d  reason: collision with root package name */
    final c<R, T> f84339d;

    /* renamed from: e  reason: collision with root package name */
    final e<ResponseBody, R> f84340e;

    /* renamed from: f  reason: collision with root package name */
    private final HttpUrl f84341f;
    private final String g;
    private final String h;
    private final Headers i;
    private final MediaType j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final j<?>[] n;

    static final class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final n f84342a;

        /* renamed from: b  reason: collision with root package name */
        final Method f84343b;

        /* renamed from: c  reason: collision with root package name */
        final Annotation[] f84344c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f84345d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f84346e;

        /* renamed from: f  reason: collision with root package name */
        Type f84347f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        String m;
        boolean n;
        boolean o;
        boolean p;
        String q;
        Headers r;
        MediaType s;
        Set<String> t;
        j<?>[] u;
        e<ResponseBody, T> v;
        c<T, R> w;

        /* access modifiers changed from: package-private */
        public e<ResponseBody, T> b() {
            try {
                return this.f84342a.a(this.f84347f, this.f84343b.getAnnotations());
            } catch (RuntimeException e2) {
                throw a((Throwable) e2, "Unable to create converter for %s", this.f84347f);
            }
        }

        /* access modifiers changed from: package-private */
        public c<T, R> a() {
            Type genericReturnType = this.f84343b.getGenericReturnType();
            if (p.d(genericReturnType)) {
                throw a("Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f84342a.a((c.a) null, genericReturnType, this.f84343b.getAnnotations());
                } catch (RuntimeException e2) {
                    throw a((Throwable) e2, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw a("Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        public Headers a(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    MediaType parse = MediaType.parse(trim);
                    if (parse != null) {
                        this.s = parse;
                    } else {
                        throw a("Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        /* access modifiers changed from: package-private */
        public RuntimeException a(String str, Object... objArr) {
            return a((Throwable) null, str, objArr);
        }

        a(n nVar, Method method) {
            this.f84342a = nVar;
            this.f84343b = method;
            this.f84344c = method.getAnnotations();
            this.f84346e = method.getGenericParameterTypes();
            this.f84345d = method.getParameterAnnotations();
        }

        /* access modifiers changed from: package-private */
        public RuntimeException a(int i2, String str, Object... objArr) {
            return a(str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        private RuntimeException a(Throwable th, String str, Object... objArr) {
            String format = String.format(str, objArr);
            return new IllegalArgumentException(format + "\n    for method " + this.f84343b.getDeclaringClass().getSimpleName() + ClassUtils.PACKAGE_SEPARATOR + this.f84343b.getName(), th);
        }

        /* access modifiers changed from: package-private */
        public j<?> a(int i2, Type type, Annotation[] annotationArr) {
            j<?> jVar = null;
            for (Annotation a2 : annotationArr) {
                j<?> a3 = a(i2, type, annotationArr, a2);
                if (a3 != null) {
                    if (jVar == null) {
                        jVar = a3;
                    } else {
                        throw a(i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (jVar != null) {
                return jVar;
            }
            throw a(i2, "No Retrofit annotation found.", new Object[0]);
        }

        /* access modifiers changed from: package-private */
        public void a(String str, String str2, boolean z) {
            if (this.m == null) {
                this.m = str;
                this.n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (o.f84336a.matcher(substring).find()) {
                            throw a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.q = str2;
                    this.t = o.a(str2);
                    return;
                }
                return;
            }
            throw a("Only one HTTP method is allowed. Found: %s and %s.", this.m, str);
        }

        private j<?> a(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof Url) {
                if (this.l) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.j) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.k) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.q == null) {
                    this.l = true;
                    if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new j.m();
                    }
                    throw a(i2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.m);
                }
            } else if (annotation instanceof Path) {
                if (this.k) {
                    throw a(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.l) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.q != null) {
                    this.j = true;
                    Path path = (Path) annotation;
                    String a2 = path.a();
                    if (!o.f84337b.matcher(a2).matches()) {
                        throw a(i2, "@Path parameter name must match %s. Found: %s", o.f84336a.pattern(), a2);
                    } else if (this.t.contains(a2)) {
                        return new j.h(a2, this.f84342a.b(type, annotationArr), path.b());
                    } else {
                        throw a(i2, "URL \"%s\" does not contain \"{%s}\".", this.q, a2);
                    }
                } else {
                    throw a(i2, "@Path can only be used with relative url on @%s", this.m);
                }
            } else if (annotation instanceof Query) {
                Query query = (Query) annotation;
                String a3 = query.a();
                boolean b2 = query.b();
                Class<?> a4 = p.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a4)) {
                    if (type instanceof ParameterizedType) {
                        return new j.i(a3, this.f84342a.b(p.a(0, (ParameterizedType) type), annotationArr), b2).a();
                    }
                    throw a(i2, a4.getSimpleName() + " must include generic type (e.g., " + a4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a4.isArray()) {
                    return new j.i(a3, this.f84342a.b(type, annotationArr), b2);
                } else {
                    return new j.i(a3, this.f84342a.b(o.a(a4.getComponentType()), annotationArr), b2).b();
                }
            } else if (annotation instanceof QueryName) {
                boolean a5 = ((QueryName) annotation).a();
                Class<?> a6 = p.a(type);
                this.k = true;
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (type instanceof ParameterizedType) {
                        return new j.k(this.f84342a.b(p.a(0, (ParameterizedType) type), annotationArr), a5).a();
                    }
                    throw a(i2, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a6.isArray()) {
                    return new j.k(this.f84342a.b(type, annotationArr), a5);
                } else {
                    return new j.k(this.f84342a.b(o.a(a6.getComponentType()), annotationArr), a5).b();
                }
            } else if (annotation instanceof QueryMap) {
                Class<?> a7 = p.a(type);
                if (Map.class.isAssignableFrom(a7)) {
                    Type a8 = p.a(type, a7, Map.class);
                    if (a8 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a8;
                        Type a9 = p.a(0, parameterizedType);
                        if (String.class == a9) {
                            return new j.C0904j(this.f84342a.b(p.a(1, parameterizedType), annotationArr), ((QueryMap) annotation).a());
                        }
                        throw a(i2, "@QueryMap keys must be of type String: " + a9, new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Header) {
                String a10 = ((Header) annotation).a();
                Class<?> a11 = p.a(type);
                if (Iterable.class.isAssignableFrom(a11)) {
                    if (type instanceof ParameterizedType) {
                        return new j.d(a10, this.f84342a.b(p.a(0, (ParameterizedType) type), annotationArr)).a();
                    }
                    throw a(i2, a11.getSimpleName() + " must include generic type (e.g., " + a11.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a11.isArray()) {
                    return new j.d(a10, this.f84342a.b(type, annotationArr));
                } else {
                    return new j.d(a10, this.f84342a.b(o.a(a11.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof HeaderMap) {
                Class<?> a12 = p.a(type);
                if (Map.class.isAssignableFrom(a12)) {
                    Type a13 = p.a(type, a12, Map.class);
                    if (a13 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a13;
                        Type a14 = p.a(0, parameterizedType2);
                        if (String.class == a14) {
                            return new j.e(this.f84342a.b(p.a(1, parameterizedType2), annotationArr));
                        }
                        throw a(i2, "@HeaderMap keys must be of type String: " + a14, new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof Field) {
                if (this.o) {
                    Field field = (Field) annotation;
                    String a15 = field.a();
                    boolean b3 = field.b();
                    this.g = true;
                    Class<?> a16 = p.a(type);
                    if (Iterable.class.isAssignableFrom(a16)) {
                        if (type instanceof ParameterizedType) {
                            return new j.b(a15, this.f84342a.b(p.a(0, (ParameterizedType) type), annotationArr), b3).a();
                        }
                        throw a(i2, a16.getSimpleName() + " must include generic type (e.g., " + a16.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a16.isArray()) {
                        return new j.b(a15, this.f84342a.b(type, annotationArr), b3);
                    } else {
                        return new j.b(a15, this.f84342a.b(o.a(a16.getComponentType()), annotationArr), b3).b();
                    }
                } else {
                    throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof FieldMap) {
                if (this.o) {
                    Class<?> a17 = p.a(type);
                    if (Map.class.isAssignableFrom(a17)) {
                        Type a18 = p.a(type, a17, Map.class);
                        if (a18 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a18;
                            Type a19 = p.a(0, parameterizedType3);
                            if (String.class == a19) {
                                e b4 = this.f84342a.b(p.a(1, parameterizedType3), annotationArr);
                                this.g = true;
                                return new j.c(b4, ((FieldMap) annotation).a());
                            }
                            throw a(i2, "@FieldMap keys must be of type String: " + a19, new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof Part) {
                if (this.p) {
                    Part part = (Part) annotation;
                    this.h = true;
                    String a20 = part.a();
                    Class<?> a21 = p.a(type);
                    if (!a20.isEmpty()) {
                        Headers of = Headers.of("Content-Disposition", "form-data; name=\"" + a20 + "\"", "Content-Transfer-Encoding", part.b());
                        if (Iterable.class.isAssignableFrom(a21)) {
                            if (type instanceof ParameterizedType) {
                                Type a22 = p.a(0, (ParameterizedType) type);
                                if (!MultipartBody.Part.class.isAssignableFrom(p.a(a22))) {
                                    return new j.f(of, this.f84342a.a(a22, annotationArr, this.f84344c)).a();
                                }
                                throw a(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw a(i2, a21.getSimpleName() + " must include generic type (e.g., " + a21.getSimpleName() + "<String>)", new Object[0]);
                        } else if (a21.isArray()) {
                            Class<?> a23 = o.a(a21.getComponentType());
                            if (!MultipartBody.Part.class.isAssignableFrom(a23)) {
                                return new j.f(of, this.f84342a.a((Type) a23, annotationArr, this.f84344c)).b();
                            }
                            throw a(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!MultipartBody.Part.class.isAssignableFrom(a21)) {
                            return new j.f(of, this.f84342a.a(type, annotationArr, this.f84344c));
                        } else {
                            throw a(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a21)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw a(i2, a21.getSimpleName() + " must include generic type (e.g., " + a21.getSimpleName() + "<String>)", new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(p.a(p.a(0, (ParameterizedType) type)))) {
                            return j.l.f84307a.a();
                        } else {
                            throw a(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a21.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(a21.getComponentType())) {
                            return j.l.f84307a.b();
                        }
                        throw a(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (MultipartBody.Part.class.isAssignableFrom(a21)) {
                        return j.l.f84307a;
                    } else {
                        throw a(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw a(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof PartMap) {
                if (this.p) {
                    this.h = true;
                    Class<?> a24 = p.a(type);
                    if (Map.class.isAssignableFrom(a24)) {
                        Type a25 = p.a(type, a24, Map.class);
                        if (a25 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a25;
                            Type a26 = p.a(0, parameterizedType4);
                            if (String.class == a26) {
                                Type a27 = p.a(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(p.a(a27))) {
                                    return new j.g(this.f84342a.a(a27, annotationArr, this.f84344c), ((PartMap) annotation).a());
                                }
                                throw a(i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw a(i2, "@PartMap keys must be of type String: " + a26, new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof Body)) {
                return null;
            } else {
                if (this.o || this.p) {
                    throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.i) {
                    try {
                        e a28 = this.f84342a.a(type, annotationArr, this.f84344c);
                        this.i = true;
                        return new j.a(a28);
                    } catch (RuntimeException e2) {
                        Object[] objArr = {type};
                        throw a((Throwable) e2, "Unable to create @Body converter for %s" + " (parameter #" + (i2 + 1) + ")", objArr);
                    }
                } else {
                    throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    static Set<String> a(String str) {
        Matcher matcher = f84336a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    o(a<R, T> aVar) {
        this.f84338c = aVar.f84342a.f84321a;
        this.f84339d = aVar.w;
        this.f84341f = aVar.f84342a.f84322b;
        this.f84340e = aVar.v;
        this.g = aVar.m;
        this.h = aVar.q;
        this.i = aVar.r;
        this.j = aVar.s;
        this.k = aVar.n;
        this.l = aVar.o;
        this.m = aVar.p;
        this.n = aVar.u;
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

    /* access modifiers changed from: package-private */
    public final Request a(@Nullable Object... objArr) throws IOException {
        int i2;
        l lVar = new l(this.g, this.f84341f, this.h, this.i, this.j, this.k, this.l, this.m);
        j<?>[] jVarArr = this.n;
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        if (i2 == jVarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                jVarArr[i3].a(lVar, objArr[i3]);
            }
            return lVar.a();
        }
        throw new IllegalArgumentException("Argument count (" + i2 + ") doesn't match expected count (" + jVarArr.length + ")");
    }
}
