package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class i {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f24405a;

        /* renamed from: b  reason: collision with root package name */
        private final C0278a f24406b;

        /* renamed from: c  reason: collision with root package name */
        private C0278a f24407c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f24408d;

        /* renamed from: com.google.common.a.i$a$a  reason: collision with other inner class name */
        static final class C0278a {
            @NullableDecl

            /* renamed from: a  reason: collision with root package name */
            String f24409a;
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            Object f24410b;
            @NullableDecl

            /* renamed from: c  reason: collision with root package name */
            C0278a f24411c;

            private C0278a() {
            }

            /* synthetic */ C0278a(byte b2) {
                this();
            }
        }

        private C0278a a() {
            C0278a aVar = new C0278a((byte) 0);
            this.f24407c.f24411c = aVar;
            this.f24407c = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.f24408d;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f24405a);
            sb.append('{');
            for (C0278a aVar = this.f24406b.f24411c; aVar != null; aVar = aVar.f24411c) {
                Object obj = aVar.f24410b;
                if (!z || obj != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f24409a != null) {
                        sb.append(aVar.f24409a);
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
            a().f24410b = obj;
            return this;
        }

        private a(String str) {
            this.f24406b = new C0278a((byte) 0);
            this.f24407c = this.f24406b;
            this.f24408d = false;
            this.f24405a = (String) m.a(str);
        }

        /* synthetic */ a(String str, byte b2) {
            this(str);
        }

        private a b(String str, @NullableDecl Object obj) {
            C0278a a2 = a();
            a2.f24410b = obj;
            a2.f24409a = (String) m.a(str);
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

    public static a a(Object obj) {
        return new a(obj.getClass().getSimpleName(), (byte) 0);
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
