package com.ss.android.http.a.b;

import com.ss.android.http.a.d;

public final class b implements com.ss.android.http.a.b, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f29133a;

    /* renamed from: b  reason: collision with root package name */
    private final String f29134b;

    /* renamed from: c  reason: collision with root package name */
    private final d[] f29135c;

    public final String a() {
        return this.f29133a;
    }

    public final String b() {
        return this.f29134b;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final d[] c() {
        return (d[]) this.f29135c.clone();
    }

    public final int hashCode() {
        int a2 = com.ss.android.http.a.d.d.a(com.ss.android.http.a.d.d.a(17, (Object) this.f29133a), (Object) this.f29134b);
        for (d a3 : this.f29135c) {
            a2 = com.ss.android.http.a.d.d.a(a2, (Object) a3);
        }
        return a2;
    }

    public final String toString() {
        com.ss.android.http.a.d.b bVar = new com.ss.android.http.a.d.b(64);
        bVar.a(this.f29133a);
        if (this.f29134b != null) {
            bVar.a("=");
            bVar.a(this.f29134b);
        }
        for (d valueOf : this.f29135c) {
            bVar.a("; ");
            bVar.a(String.valueOf(valueOf));
        }
        return bVar.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r7 == null) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r6 != r7) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r7 instanceof com.ss.android.http.a.b
            if (r2 == 0) goto L_0x0049
            com.ss.android.http.a.b.b r7 = (com.ss.android.http.a.b.b) r7
            java.lang.String r2 = r6.f29133a
            java.lang.String r3 = r7.f29133a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r6.f29134b
            java.lang.String r3 = r7.f29134b
            boolean r2 = com.ss.android.http.a.d.d.a((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0048
            com.ss.android.http.a.d[] r2 = r6.f29135c
            com.ss.android.http.a.d[] r7 = r7.f29135c
            if (r2 != 0) goto L_0x002e
            if (r7 != 0) goto L_0x002c
        L_0x002a:
            r7 = 1
            goto L_0x0045
        L_0x002c:
            r7 = 0
            goto L_0x0045
        L_0x002e:
            if (r7 == 0) goto L_0x002c
            int r3 = r2.length
            int r4 = r7.length
            if (r3 != r4) goto L_0x002c
            r3 = 0
        L_0x0035:
            int r4 = r2.length
            if (r3 >= r4) goto L_0x002a
            r4 = r2[r3]
            r5 = r7[r3]
            boolean r4 = com.ss.android.http.a.d.d.a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x002c
            int r3 = r3 + 1
            goto L_0x0035
        L_0x0045:
            if (r7 == 0) goto L_0x0048
            return r1
        L_0x0048:
            return r0
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.http.a.b.b.equals(java.lang.Object):boolean");
    }

    public b(String str, String str2, d[] dVarArr) {
        if (str != null) {
            this.f29133a = str;
            this.f29134b = str2;
            if (dVarArr != null) {
                this.f29135c = dVarArr;
            } else {
                this.f29135c = new d[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
