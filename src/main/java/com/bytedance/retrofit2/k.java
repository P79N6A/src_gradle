package com.bytedance.retrofit2;

import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public abstract class k<T> {

    static final class a<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, String> f21870a;

        a(Converter<T, String> converter) {
            this.f21870a = (Converter) s.a(converter, "converter == null");
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                try {
                    mVar.j = Boolean.parseBoolean((String) this.f21870a.convert(t));
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to AddCommonParam", e2);
                }
            }
        }
    }

    static final class b<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f21871a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, TypedOutput> f21872b;

        b(boolean z, Converter<T, TypedOutput> converter) {
            this.f21871a = z;
            this.f21872b = converter;
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) {
            if (t != null) {
                try {
                    mVar.f21910f = (TypedOutput) this.f21872b.convert(t);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to TypedOutput", e2);
                }
            } else if (!this.f21871a) {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    static final class c<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, Object> f21873a;

        c(Converter<T, Object> converter) {
            this.f21873a = (Converter) s.a(converter, "converter == null");
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                try {
                    mVar.k = this.f21873a.convert(t);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to ExtraInfo", e2);
                }
            }
        }
    }

    static final class d<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f21874a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, String> f21875b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21876c;

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                mVar.b(this.f21874a, (String) this.f21875b.convert(t), this.f21876c);
            }
        }

        d(String str, Converter<T, String> converter, boolean z) {
            this.f21874a = (String) s.a(str, "name == null");
            this.f21875b = converter;
            this.f21876c = z;
        }
    }

    static final class e<T> extends k<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, String> f21877a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f21878b;

        e(Converter<T, String> converter, boolean z) {
            this.f21877a = converter;
            this.f21878b = z;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(m mVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            mVar.b(str, (String) this.f21877a.convert(value), this.f21878b);
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

    static final class f<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f21879a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, String> f21880b;

        f(String str, Converter<T, String> converter) {
            this.f21879a = (String) s.a(str, "name == null");
            this.f21880b = converter;
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                mVar.a(this.f21879a, (String) this.f21880b.convert(t));
            }
        }
    }

    static final class g<T> extends k<List<T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, Header> f21881a;

        g(Converter<T, Header> converter) {
            this.f21881a = converter;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(m mVar, Object obj) throws IOException {
            List<Object> list = (List) obj;
            if (list != null) {
                for (Object convert : list) {
                    Header header = (Header) this.f21881a.convert(convert);
                    mVar.a(header.getName(), header.getValue());
                }
            }
        }
    }

    static final class h<T> extends k<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, String> f21882a;

        h(Converter<T, String> converter) {
            this.f21882a = converter;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(m mVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            mVar.a(str, (String) this.f21882a.convert(value));
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

    static final class i<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, String> f21883a;

        i(Converter<T, String> converter) {
            this.f21883a = (Converter) s.a(converter, "converter == null");
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                try {
                    mVar.i = Integer.parseInt((String) this.f21883a.convert(t));
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to MaxLength", e2);
                }
            }
        }
    }

    static final class j<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f21884a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, String> f21885b;

        j(String str, Converter<T, String> converter) {
            this.f21884a = (String) s.a(str, "name == null");
            this.f21885b = converter;
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                String str = this.f21884a;
                String str2 = (String) this.f21885b.convert(t);
                if (mVar.f21905a != null) {
                    String str3 = mVar.f21905a;
                    mVar.f21905a = str3.replace("{" + str + "}", str2);
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException("Method parameter \"" + this.f21884a + "\" value must not be null.");
        }
    }

    /* renamed from: com.bytedance.retrofit2.k$k  reason: collision with other inner class name */
    static final class C0224k<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f21886a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, TypedOutput> f21887b;

        C0224k(String str, Converter<T, TypedOutput> converter) {
            this.f21886a = str;
            this.f21887b = converter;
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) {
            if (t != null) {
                try {
                    TypedOutput typedOutput = (TypedOutput) this.f21887b.convert(t);
                    mVar.f21909e.a(this.f21886a, typedOutput);
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e2);
                }
            }
        }
    }

    static final class l<T> extends k<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, TypedOutput> f21888a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21889b;

        l(Converter<T, TypedOutput> converter, String str) {
            this.f21888a = converter;
            this.f21889b = str;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(m mVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            mVar.f21909e.a(str, this.f21889b, (TypedOutput) this.f21888a.convert(value));
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

    static final class m<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f21890a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, String> f21891b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21892c;

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                String str = this.f21890a;
                String str2 = (String) this.f21891b.convert(t);
                boolean z = this.f21892c;
                if (mVar.f21907c == null) {
                    throw new AssertionError();
                } else if (str == null) {
                    throw new IllegalArgumentException("Path replacement name must not be null.");
                } else if (str2 == null) {
                    throw new IllegalArgumentException("Path replacement \"" + str + "\" value must not be null.");
                } else if (z) {
                    try {
                        String replace = URLEncoder.encode(String.valueOf(str2), "UTF-8").replace("+", "%20");
                        String str3 = mVar.f21907c;
                        mVar.f21907c = str3.replace("{" + str + "}", replace);
                    } catch (UnsupportedEncodingException e2) {
                        throw new RuntimeException("Unable to convert path parameter \"" + str + "\" value to UTF-8:" + str2, e2);
                    }
                } else {
                    String str4 = mVar.f21907c;
                    mVar.f21907c = str4.replace("{" + str + "}", String.valueOf(str2));
                }
            } else {
                throw new IllegalArgumentException("Path parameter \"" + this.f21890a + "\" value must not be null.");
            }
        }

        m(String str, Converter<T, String> converter, boolean z) {
            this.f21890a = (String) s.a(str, "name == null");
            this.f21891b = converter;
            this.f21892c = z;
        }
    }

    static final class n<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final String f21893a;

        /* renamed from: b  reason: collision with root package name */
        private final Converter<T, String> f21894b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21895c;

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                mVar.a(this.f21893a, (String) this.f21894b.convert(t), this.f21895c);
            }
        }

        n(String str, Converter<T, String> converter, boolean z) {
            this.f21893a = (String) s.a(str, "name == null");
            this.f21894b = converter;
            this.f21895c = z;
        }
    }

    static final class o<T> extends k<Map<String, T>> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, String> f21896a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f21897b;

        o(Converter<T, String> converter, boolean z) {
            this.f21896a = converter;
            this.f21897b = z;
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(m mVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            mVar.a(str, (String) this.f21896a.convert(value), this.f21897b);
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
            }
        }
    }

    static final class p<T> extends k<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Converter<T, String> f21898a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f21899b;

        p(Converter<T, String> converter, boolean z) {
            this.f21898a = converter;
            this.f21899b = z;
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, T t) throws IOException {
            if (t != null) {
                mVar.a((String) this.f21898a.convert(t), null, this.f21899b);
            }
        }
    }

    static final class q extends k<Object> {
        q() {
        }

        /* access modifiers changed from: package-private */
        public final void a(m mVar, Object obj) {
            if (obj != null) {
                mVar.f21907c = obj.toString();
                return;
            }
            throw new NullPointerException("@Url parameter is null.");
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void a(m mVar, T t) throws IOException;

    k() {
    }

    /* access modifiers changed from: package-private */
    public final k<Iterable<T>> a() {
        return new k<Iterable<T>>() {
            /* access modifiers changed from: package-private */
            public final /* synthetic */ void a(m mVar, Object obj) throws IOException {
                Iterable<Object> iterable = (Iterable) obj;
                if (iterable != null) {
                    for (Object a2 : iterable) {
                        k.this.a(mVar, a2);
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final k<Object> b() {
        return new k<Object>() {
            /* access modifiers changed from: package-private */
            public final void a(m mVar, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        k.this.a(mVar, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
