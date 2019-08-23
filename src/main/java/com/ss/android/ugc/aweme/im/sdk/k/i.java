package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class i implements s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51743a;

    /* renamed from: b  reason: collision with root package name */
    private final char[] f51744b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f51745c;

    static final class a implements Comparable<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51746a;

        /* renamed from: b  reason: collision with root package name */
        public final char f51747b;

        /* renamed from: c  reason: collision with root package name */
        public final byte f51748c;

        public final int hashCode() {
            return this.f51747b;
        }

        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f51746a, false, 54247, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f51746a, false, 54247, new Class[0], String.class);
            }
            return "0x" + Integer.toHexString(65535 & this.f51747b) + "->0x" + Integer.toHexString(this.f51748c & 255);
        }

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.f51747b - ((a) obj).f51747b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f51747b == aVar.f51747b && this.f51748c == aVar.f51748c) {
                return true;
            }
            return false;
        }

        a(byte b2, char c2) {
            this.f51748c = b2;
            this.f51747b = c2;
        }
    }

    public i(char[] cArr) {
        this.f51744b = (char[]) cArr.clone();
        ArrayList arrayList = new ArrayList(this.f51744b.length);
        byte b2 = Byte.MAX_VALUE;
        for (char aVar : this.f51744b) {
            b2 = (byte) (b2 + 1);
            arrayList.add(new a(b2, aVar));
        }
        Collections.sort(arrayList);
        this.f51745c = Collections.unmodifiableList(arrayList);
    }

    private a a(char c2) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, this, f51743a, false, 54243, new Class[]{Character.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, this, f51743a, false, 54243, new Class[]{Character.TYPE}, a.class);
        }
        int size = this.f51745c.size();
        while (size > i) {
            int i2 = ((size - i) / 2) + i;
            a aVar = this.f51745c.get(i2);
            if (aVar.f51747b == c2) {
                return aVar;
            }
            if (aVar.f51747b < c2) {
                i = i2 + 1;
            } else {
                size = i2;
            }
        }
        if (i >= this.f51745c.size()) {
            return null;
        }
        a aVar2 = this.f51745c.get(i);
        if (aVar2.f51747b != c2) {
            return null;
        }
        return aVar2;
    }

    public final String a(byte[] bArr) throws IOException {
        char c2;
        byte[] bArr2 = bArr;
        if (PatchProxy.isSupport(new Object[]{bArr2}, this, f51743a, false, 54246, new Class[]{byte[].class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{bArr2}, this, f51743a, false, 54246, new Class[]{byte[].class}, String.class);
        }
        char[] cArr = new char[bArr2.length];
        for (int i = 0; i < bArr2.length; i++) {
            byte b2 = bArr2[i];
            if (b2 >= 0) {
                c2 = (char) b2;
            } else {
                c2 = this.f51744b[b2 + 128];
            }
            cArr[i] = c2;
        }
        return new String(cArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer b(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51743a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class<java.nio.ByteBuffer> r8 = java.nio.ByteBuffer.class
            r5 = 0
            r6 = 54245(0xd3e5, float:7.6013E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51743a
            r13 = 0
            r14 = 54245(0xd3e5, float:7.6013E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class<java.nio.ByteBuffer> r16 = java.nio.ByteBuffer.class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            return r0
        L_0x0039:
            int r2 = r18.length()
            r3 = 6
            int r2 = r2 + r3
            int r4 = r18.length()
            int r4 = r4 + r1
            r5 = 2
            int r4 = r4 / r5
            int r2 = r2 + r4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r4 = r2
            r2 = 0
        L_0x004d:
            int r6 = r18.length()
            if (r2 >= r6) goto L_0x00db
            char r6 = r0.charAt(r2)
            int r7 = r4.remaining()
            if (r7 >= r3) goto L_0x0066
            int r7 = r4.position()
            int r7 = r7 + r3
            java.nio.ByteBuffer r4 = com.ss.android.ugc.aweme.im.sdk.k.t.a((java.nio.ByteBuffer) r4, (int) r7)
        L_0x0066:
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            java.lang.Character r7 = java.lang.Character.valueOf(r6)
            r10[r1] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = f51743a
            r13 = 0
            r14 = 54242(0xd3e2, float:7.6009E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<java.nio.ByteBuffer> r7 = java.nio.ByteBuffer.class
            r15[r9] = r7
            java.lang.Class r7 = java.lang.Character.TYPE
            r15[r1] = r7
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r7 == 0) goto L_0x00b6
            java.lang.Object[] r10 = new java.lang.Object[r5]
            r10[r9] = r4
            java.lang.Character r7 = java.lang.Character.valueOf(r6)
            r10[r1] = r7
            com.meituan.robust.ChangeQuickRedirect r12 = f51743a
            r13 = 0
            r14 = 54242(0xd3e2, float:7.6009E-41)
            java.lang.Class[] r15 = new java.lang.Class[r5]
            java.lang.Class<java.nio.ByteBuffer> r7 = java.nio.ByteBuffer.class
            r15[r9] = r7
            java.lang.Class r7 = java.lang.Character.TYPE
            r15[r1] = r7
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r7 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r8 = r7
        L_0x00b3:
            r7 = r17
            goto L_0x00d2
        L_0x00b6:
            if (r6 < 0) goto L_0x00c2
            r7 = 128(0x80, float:1.794E-43)
            if (r6 >= r7) goto L_0x00c2
            byte r7 = (byte) r6
            r4.put(r7)
            r8 = 1
            goto L_0x00b3
        L_0x00c2:
            r7 = r17
            com.ss.android.ugc.aweme.im.sdk.k.i$a r8 = r7.a((char) r6)
            if (r8 != 0) goto L_0x00cc
            r8 = 0
            goto L_0x00d2
        L_0x00cc:
            byte r8 = r8.f51748c
            r4.put(r8)
            r8 = 1
        L_0x00d2:
            if (r8 != 0) goto L_0x00d7
            com.ss.android.ugc.aweme.im.sdk.k.t.a((java.nio.ByteBuffer) r4, (char) r6)
        L_0x00d7:
            int r2 = r2 + 1
            goto L_0x004d
        L_0x00db:
            r7 = r17
            int r0 = r4.position()
            r4.limit(r0)
            r4.rewind()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.i.b(java.lang.String):java.nio.ByteBuffer");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a1 A[LOOP:0: B:5:0x003e->B:21:0x00a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51743a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 54244(0xd3e4, float:7.6012E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51743a
            r13 = 0
            r14 = 54244(0xd3e4, float:7.6012E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            r2 = 0
        L_0x003e:
            int r3 = r18.length()
            if (r2 >= r3) goto L_0x00a4
            char r3 = r0.charAt(r2)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Character r4 = java.lang.Character.valueOf(r3)
            r10[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r12 = f51743a
            r13 = 0
            r14 = 54241(0xd3e1, float:7.6008E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class r4 = java.lang.Character.TYPE
            r15[r9] = r4
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x008b
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r10[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = f51743a
            r13 = 0
            r14 = 54241(0xd3e1, float:7.6008E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Character.TYPE
            r15[r9] = r3
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
        L_0x0088:
            r4 = r17
            goto L_0x009e
        L_0x008b:
            if (r3 < 0) goto L_0x0093
            r4 = 128(0x80, float:1.794E-43)
            if (r3 >= r4) goto L_0x0093
            r3 = 1
            goto L_0x0088
        L_0x0093:
            r4 = r17
            com.ss.android.ugc.aweme.im.sdk.k.i$a r3 = r4.a((char) r3)
            if (r3 == 0) goto L_0x009d
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            if (r3 != 0) goto L_0x00a1
            return r9
        L_0x00a1:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x00a4:
            r4 = r17
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.i.a(java.lang.String):boolean");
    }
}
