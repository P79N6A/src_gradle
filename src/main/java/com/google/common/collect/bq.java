package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bq<K, V> extends ak<K, V> {

    /* renamed from: b  reason: collision with root package name */
    static final ak<Object, Object> f24691b = new bq(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f24692c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int[] f24693d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f24694e;

    static class a<K, V> extends ar<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        private final transient ak<K, V> f24695a;
        public final transient Object[] alternatingKeysAndValues;
        public final transient int keyOffset = 0;
        public final transient int size;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.size;
        }

        /* access modifiers changed from: package-private */
        public final ai<Map.Entry<K, V>> c() {
            return new ai<Map.Entry<K, V>>() {
                public final boolean isPartialView() {
                    return true;
                }

                public final int size() {
                    return a.this.size;
                }

                public final Map.Entry<K, V> get(int i) {
                    m.a(i, a.this.size);
                    int i2 = i * 2;
                    return new AbstractMap.SimpleImmutableEntry(a.this.alternatingKeysAndValues[a.this.keyOffset + i2], a.this.alternatingKeysAndValues[i2 + (a.this.keyOffset ^ 1)]);
                }
            };
        }

        public final cg<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f24695a.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final int a(Object[] objArr, int i) {
            return asList().a(objArr, i);
        }

        a(ak<K, V> akVar, Object[] objArr, int i, int i2) {
            this.f24695a = akVar;
            this.alternatingKeysAndValues = objArr;
            this.size = i2;
        }
    }

    static final class b<K> extends ar<K> {

        /* renamed from: a  reason: collision with root package name */
        private final transient ak<K, ?> f24696a;

        /* renamed from: b  reason: collision with root package name */
        private final transient ai<K> f24697b;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final ai<K> asList() {
            return this.f24697b;
        }

        public final int size() {
            return this.f24696a.size();
        }

        public final cg<K> iterator() {
            return asList().iterator();
        }

        public final boolean contains(@NullableDecl Object obj) {
            if (this.f24696a.get(obj) != null) {
                return true;
            }
            return false;
        }

        b(ak<K, ?> akVar, ai<K> aiVar) {
            this.f24696a = akVar;
            this.f24697b = aiVar;
        }

        /* access modifiers changed from: package-private */
        public final int a(Object[] objArr, int i) {
            return asList().a(objArr, i);
        }
    }

    static final class c extends ai<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final transient Object[] f24698a;

        /* renamed from: b  reason: collision with root package name */
        private final transient int f24699b;

        /* renamed from: c  reason: collision with root package name */
        private final transient int f24700c;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return true;
        }

        public final int size() {
            return this.f24700c;
        }

        public final Object get(int i) {
            m.a(i, this.f24700c);
            return this.f24698a[(i * 2) + this.f24699b];
        }

        c(Object[] objArr, int i, int i2) {
            this.f24698a = objArr;
            this.f24699b = i;
            this.f24700c = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return false;
    }

    public final int size() {
        return this.f24694e;
    }

    /* access modifiers changed from: package-private */
    public final ar<Map.Entry<K, V>> a() {
        return new a(this, this.f24692c, 0, this.f24694e);
    }

    /* access modifiers changed from: package-private */
    public final ar<K> b() {
        return new b(this, new c(this.f24692c, 0, this.f24694e));
    }

    /* access modifiers changed from: package-private */
    public final ag<V> c() {
        return new c(this.f24692c, 1, this.f24694e);
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        int[] iArr = this.f24693d;
        V[] vArr = this.f24692c;
        int i = this.f24694e;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a2 = af.a(obj.hashCode());
            while (true) {
                int i2 = a2 & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (vArr[i3].equals(obj)) {
                    return vArr[i3 ^ 1];
                }
                a2 = i2 + 1;
            }
        }
    }

    static <K, V> bq<K, V> a(int i, Object[] objArr) {
        if (i == 0) {
            return (bq) f24691b;
        }
        if (i == 1) {
            l.a(objArr[0], objArr[1]);
            return new bq<>(null, objArr, 1);
        }
        m.b(i, objArr.length >> 1);
        return new bq<>(a(objArr, i, ar.b(i), 0), objArr, i);
    }

    private bq(int[] iArr, Object[] objArr, int i) {
        this.f24693d = iArr;
        this.f24692c = objArr;
        this.f24694e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r11[r6] = r4;
        r12 = r12 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r12 = 0
            r0 = 1
            if (r10 != r0) goto L_0x000d
            r10 = r9[r12]
            r9 = r9[r0]
            com.google.common.collect.l.a((java.lang.Object) r10, (java.lang.Object) r9)
            r9 = 0
            return r9
        L_0x000d:
            int r1 = r11 + -1
            int[] r11 = new int[r11]
            r2 = -1
            java.util.Arrays.fill(r11, r2)
        L_0x0015:
            if (r12 >= r10) goto L_0x0072
            int r3 = r12 * 2
            int r4 = r3 + 0
            r5 = r9[r4]
            int r3 = r3 + r0
            r3 = r9[r3]
            com.google.common.collect.l.a((java.lang.Object) r5, (java.lang.Object) r3)
            int r6 = r5.hashCode()
            int r6 = com.google.common.collect.af.a((int) r6)
        L_0x002b:
            r6 = r6 & r1
            r7 = r11[r6]
            if (r7 != r2) goto L_0x0035
            r11[r6] = r4
            int r12 = r12 + 1
            goto L_0x0015
        L_0x0035:
            r8 = r9[r7]
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0040
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0040:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Multiple entries with same key: "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r12 = "="
            r11.append(r12)
            r11.append(r3)
            java.lang.String r12 = " and "
            r11.append(r12)
            r12 = r9[r7]
            r11.append(r12)
            java.lang.String r12 = "="
            r11.append(r12)
            r12 = r7 ^ 1
            r9 = r9[r12]
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0072:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.bq.a(java.lang.Object[], int, int, int):int[]");
    }
}
