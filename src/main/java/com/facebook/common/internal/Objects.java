package com.facebook.common.internal;

import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public final class Objects {

    public static final class ToStringHelper {
        private final String className;
        private a holderHead;
        private a holderTail;
        private boolean omitNullValues;

        static final class a {
            @Nullable

            /* renamed from: a  reason: collision with root package name */
            String f23526a;
            @Nullable

            /* renamed from: b  reason: collision with root package name */
            Object f23527b;

            /* renamed from: c  reason: collision with root package name */
            a f23528c;

            private a() {
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }

        public final ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        private a addHolder() {
            a aVar = new a((byte) 0);
            this.holderTail.f23528c = aVar;
            this.holderTail = aVar;
            return aVar;
        }

        public final String toString() {
            boolean z = this.omitNullValues;
            String str = "";
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.className);
            sb.append('{');
            for (a aVar = this.holderHead.f23528c; aVar != null; aVar = aVar.f23528c) {
                if (!z || aVar.f23527b != null) {
                    sb.append(str);
                    str = ", ";
                    if (aVar.f23526a != null) {
                        sb.append(aVar.f23526a);
                        sb.append('=');
                    }
                    sb.append(aVar.f23527b);
                }
            }
            sb.append('}');
            return sb.toString();
        }

        private ToStringHelper addHolder(@Nullable Object obj) {
            addHolder().f23527b = obj;
            return this;
        }

        public final ToStringHelper addValue(@Nullable Object obj) {
            return addHolder(obj);
        }

        public final ToStringHelper addValue(char c2) {
            return addHolder(String.valueOf(c2));
        }

        private ToStringHelper(String str) {
            this.holderHead = new a((byte) 0);
            this.holderTail = this.holderHead;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        public final ToStringHelper addValue(double d2) {
            return addHolder(String.valueOf(d2));
        }

        public final ToStringHelper addValue(float f2) {
            return addHolder(String.valueOf(f2));
        }

        public final ToStringHelper addValue(int i) {
            return addHolder(String.valueOf(i));
        }

        public final ToStringHelper addValue(long j) {
            return addHolder(String.valueOf(j));
        }

        public final ToStringHelper addValue(boolean z) {
            return addHolder(String.valueOf(z));
        }

        public final ToStringHelper add(String str, @Nullable Object obj) {
            return addHolder(str, obj);
        }

        public final ToStringHelper add(String str, char c2) {
            return addHolder(str, String.valueOf(c2));
        }

        private ToStringHelper addHolder(String str, @Nullable Object obj) {
            a addHolder = addHolder();
            addHolder.f23527b = obj;
            addHolder.f23526a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        public final ToStringHelper add(String str, double d2) {
            return addHolder(str, String.valueOf(d2));
        }

        public final ToStringHelper add(String str, float f2) {
            return addHolder(str, String.valueOf(f2));
        }

        public final ToStringHelper add(String str, int i) {
            return addHolder(str, String.valueOf(i));
        }

        public final ToStringHelper add(String str, long j) {
            return addHolder(str, String.valueOf(j));
        }

        public final ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }
    }

    private Objects() {
    }

    public static int hashCode(@Nullable Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(simpleName(cls));
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(simpleName(obj.getClass()));
    }

    private static String simpleName(Class<?> cls) {
        String replaceAll = cls.getName().replaceAll("\\$[0-9]+", "\\$");
        int lastIndexOf = replaceAll.lastIndexOf(36);
        if (lastIndexOf == -1) {
            lastIndexOf = replaceAll.lastIndexOf(46);
        }
        return replaceAll.substring(lastIndexOf + 1);
    }

    public static <T> T firstNonNull(@Nullable T t, @Nullable T t2) {
        if (t != null) {
            return t;
        }
        return Preconditions.checkNotNull(t2);
    }

    @CheckReturnValue
    public static boolean equal(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }
}
