package com.mapbox.mapboxsdk.style.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f26792a;

    /* renamed from: b  reason: collision with root package name */
    private final a[] f26793b;

    /* renamed from: com.mapbox.mapboxsdk.style.a.a$a  reason: collision with other inner class name */
    public static class C0310a extends a implements e {

        /* renamed from: a  reason: collision with root package name */
        protected Object f26794a;

        @NonNull
        public final Object[] c() {
            return new Object[]{"literal", this.f26794a};
        }

        public final Object d() {
            for (C0310a aVar = this; !(aVar.f26794a instanceof com.mapbox.mapboxsdk.style.layers.d); aVar = (C0310a) aVar.f26794a) {
                if (!(aVar.f26794a instanceof C0310a)) {
                    return aVar.f26794a;
                }
            }
            throw new IllegalArgumentException("PropertyValue are not allowed as an expression literal, use value instead.");
        }

        public int hashCode() {
            int i;
            int hashCode = a.super.hashCode() * 31;
            if (this.f26794a != null) {
                i = this.f26794a.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        public String toString() {
            if (!(this.f26794a instanceof String)) {
                return this.f26794a.toString();
            }
            return "\"" + this.f26794a + "\"";
        }

        public C0310a(@NonNull Object obj) {
            String str;
            if (obj instanceof String) {
                String str2 = (String) obj;
                int length = str2.length();
                str = str2;
                if (length > 1) {
                    char charAt = str2.charAt(0);
                    str = str2;
                    if (charAt == '\"') {
                        char charAt2 = str2.charAt(str2.length() - 1);
                        str = str2;
                        if (charAt2 == '\"') {
                            str = str2.substring(1, str2.length() - 1);
                        }
                    }
                }
            } else {
                boolean z = obj instanceof Number;
                str = obj;
                if (z) {
                    str = Float.valueOf(((Number) obj).floatValue());
                }
            }
            this.f26794a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass() || !a.super.equals(obj)) {
                return false;
            }
            C0310a aVar = (C0310a) obj;
            if (this.f26794a != null) {
                return this.f26794a.equals(aVar.f26794a);
            }
            if (aVar.f26794a == null) {
                return true;
            }
            return false;
        }
    }

    static class b extends C0310a {
        public final String toString() {
            Object[] objArr = (Object[]) this.f26794a;
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj instanceof String) {
                    sb.append("\"");
                    sb.append(obj);
                    sb.append("\"");
                } else {
                    sb.append(obj);
                }
                if (i != objArr.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }

        b(@NonNull Object[] objArr) {
            super(objArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Arrays.equals((Object[]) this.f26794a, (Object[]) ((b) obj).f26794a);
        }
    }

    public static class c extends a {
        c(@NonNull String str, @Nullable a... aVarArr) {
            super(str, aVarArr);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private Object f26795a;

        /* renamed from: b  reason: collision with root package name */
        private Object f26796b;

        static a[] a(d... dVarArr) {
            a[] aVarArr = new a[(dVarArr.length * 2)];
            for (int i = 0; i < dVarArr.length; i++) {
                d dVar = dVarArr[i];
                Object obj = dVar.f26795a;
                Object obj2 = dVar.f26796b;
                if (!(obj instanceof a)) {
                    obj = a.a(obj);
                }
                if (!(obj2 instanceof a)) {
                    obj2 = a.a(obj2);
                }
                int i2 = i * 2;
                aVarArr[i2] = (a) obj;
                aVarArr[i2 + 1] = (a) obj2;
            }
            return aVarArr;
        }

        d(Object obj, Object obj2) {
            this.f26795a = obj;
            this.f26796b = obj2;
        }
    }

    interface e {
        Object d();
    }

    a() {
    }

    public static a a(@NonNull Object[] objArr) {
        return new a("literal", new b(objArr));
    }

    private static a[] a(a[] aVarArr, a[] aVarArr2) {
        a[] aVarArr3 = new a[(aVarArr.length + aVarArr2.length)];
        System.arraycopy(aVarArr, 0, aVarArr3, 0, aVarArr.length);
        System.arraycopy(aVarArr2, 0, aVarArr3, aVarArr.length, aVarArr2.length);
        return aVarArr3;
    }

    public static a a() {
        return new a("zoom", new a[0]);
    }

    public static c b() {
        return new c("linear", new a[0]);
    }

    public int hashCode() {
        int i;
        if (this.f26792a != null) {
            i = this.f26792a.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + Arrays.hashCode(this.f26793b);
    }

    @NonNull
    public Object[] c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f26792a);
        if (this.f26793b != null) {
            for (a aVar : this.f26793b) {
                if (aVar instanceof e) {
                    arrayList.add(((e) aVar).d());
                } else {
                    arrayList.add(aVar.c());
                }
            }
        }
        return arrayList.toArray();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[\"");
        sb.append(this.f26792a);
        sb.append("\"");
        if (this.f26793b != null) {
            for (a obj : this.f26793b) {
                sb.append(", ");
                sb.append(obj.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static a b(@Size(min = 2) @NonNull a... aVarArr) {
        return new a("match", aVarArr);
    }

    public static a b(@NonNull String str) {
        return a(a(str));
    }

    public boolean equals(Object obj) {
        super.equals(obj);
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26792a == null ? aVar.f26792a == null : this.f26792a.equals(aVar.f26792a)) {
            return Arrays.deepEquals(this.f26793b, aVar.f26793b);
        }
        return false;
    }

    private static a a(@NonNull a aVar) {
        return new a("get", aVar);
    }

    public static a a(@NonNull Object obj) {
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                objArr[i] = Array.get(obj, i);
            }
            return a(objArr);
        } else if (!(obj instanceof a)) {
            return new C0310a(obj);
        } else {
            throw new RuntimeException("Can't convert an expression to a literal");
        }
    }

    public static a a(@NonNull String str) {
        return new C0310a(str);
    }

    public static a a(@Size(min = 1) @NonNull a... aVarArr) {
        return new a("case", aVarArr);
    }

    public a(@NonNull String str, @Nullable a... aVarArr) {
        this.f26792a = str;
        this.f26793b = aVarArr;
    }

    public static d a(@NonNull Object obj, @NonNull Object obj2) {
        return new d(obj, obj2);
    }

    public static a a(@NonNull c cVar, @NonNull a aVar, d... dVarArr) {
        return a(cVar, aVar, d.a(dVarArr));
    }

    private static a a(@NonNull c cVar, @NonNull a aVar, a... aVarArr) {
        return new a("interpolate", a(new a[]{cVar, aVar}, aVarArr));
    }

    public static a a(@NonNull a aVar, @NonNull a aVar2, @NonNull d... dVarArr) {
        return b(a(a(new a[]{aVar}, d.a(dVarArr)), new a[]{aVar2}));
    }
}
