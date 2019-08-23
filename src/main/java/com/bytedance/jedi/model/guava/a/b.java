package com.bytedance.jedi.model.guava.a;

import com.bytedance.jedi.model.guava.annotations.CanIgnoreReturnValue;
import com.bytedance.jedi.model.guava.annotations.GwtCompatible;
import com.bytedance.jedi.model.guava.annotations.NullableDecl;
import java.util.Arrays;

@GwtCompatible
public final class b {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f21623a;

        /* renamed from: b  reason: collision with root package name */
        private final C0218a f21624b;

        /* renamed from: c  reason: collision with root package name */
        private C0218a f21625c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f21626d;

        /* renamed from: com.bytedance.jedi.model.guava.a.b$a$a  reason: collision with other inner class name */
        static final class C0218a {
            @NullableDecl

            /* renamed from: a  reason: collision with root package name */
            String f21627a;
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            Object f21628b;
            @NullableDecl

            /* renamed from: c  reason: collision with root package name */
            C0218a f21629c;

            private C0218a() {
            }

            /* synthetic */ C0218a(byte b2) {
                this();
            }
        }

        private C0218a a() {
            C0218a aVar = new C0218a((byte) 0);
            this.f21625c.f21629c = aVar;
            this.f21625c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f21626d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f21623a);
            sb.append('{');
            for (C0218a aVar = this.f21624b.f21629c; aVar != null; aVar = aVar.f21629c) {
                Object obj = aVar.f21628b;
                if (!z || obj != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f21627a != null) {
                        sb.append(aVar.f21627a);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                }
            }
            sb.append('}');
            return sb.toString();
        }

        @CanIgnoreReturnValue
        public final a a(@NullableDecl Object obj) {
            a().f21628b = obj;
            return this;
        }

        private a(String str) {
            this.f21624b = new C0218a((byte) 0);
            this.f21625c = this.f21624b;
            this.f21626d = false;
            this.f21623a = (String) c.a(str);
        }

        public /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        private a b(String str, @NullableDecl Object obj) {
            C0218a a2 = a();
            a2.f21628b = obj;
            a2.f21627a = (String) c.a(str);
            return this;
        }

        @CanIgnoreReturnValue
        public final a a(String str, int i) {
            return b(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public final a a(String str, long j) {
            return b(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        public final a a(String str, @NullableDecl Object obj) {
            return b(str, obj);
        }
    }

    public static <T> T a(@NullableDecl T t, @NullableDecl T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
