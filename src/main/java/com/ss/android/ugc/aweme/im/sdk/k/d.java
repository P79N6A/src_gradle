package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51723a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<z, Class<?>> f51724b = new ConcurrentHashMap();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f51725a = new a(0);

        /* renamed from: b  reason: collision with root package name */
        public static final a f51726b = new a(1);

        /* renamed from: c  reason: collision with root package name */
        public static final a f51727c = new a(2);

        /* renamed from: d  reason: collision with root package name */
        public final int f51728d;

        private a(int i) {
            this.f51728d = i;
        }
    }

    static {
        a(b.class);
        a(g.class);
        a(k.class);
        a(j.class);
        a(o.class);
    }

    private static void a(Class<?> cls) {
        Class<?> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, null, f51723a, true, 54224, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, null, f51723a, true, 54224, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        try {
            f51724b.put(((v) cls.newInstance()).e(), cls2);
        } catch (ClassCastException unused) {
            throw new RuntimeException(cls2 + " doesn't implement ZipExtraField");
        } catch (InstantiationException unused2) {
            throw new RuntimeException(cls2 + " is not a concrete class");
        } catch (IllegalAccessException unused3) {
            throw new RuntimeException(cls2 + "'s no-arg constructor is not public");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(com.ss.android.ugc.aweme.im.sdk.k.v[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51723a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r3 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r7[r9] = r3
            java.lang.Class<byte[]> r8 = byte[].class
            r3 = 0
            r5 = 1
            r6 = 54229(0xd3d5, float:7.5991E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51723a
            r13 = 1
            r14 = 54229(0xd3d5, float:7.5991E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r0 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r15[r9] = r0
            java.lang.Class<byte[]> r16 = byte[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            byte[] r0 = (byte[]) r0
            return r0
        L_0x0037:
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0044
            int r2 = r0.length
            int r2 = r2 - r1
            r2 = r0[r2]
            boolean r2 = r2 instanceof com.ss.android.ugc.aweme.im.sdk.k.l
            if (r2 == 0) goto L_0x0044
            r2 = 1
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            if (r2 == 0) goto L_0x004a
            int r3 = r0.length
            int r3 = r3 - r1
            goto L_0x004b
        L_0x004a:
            int r3 = r0.length
        L_0x004b:
            int r4 = r3 * 4
            int r5 = r0.length
            r6 = r4
            r4 = 0
        L_0x0050:
            if (r4 >= r5) goto L_0x005e
            r7 = r0[r4]
            com.ss.android.ugc.aweme.im.sdk.k.z r7 = r7.d()
            int r7 = r7.f51820b
            int r6 = r6 + r7
            int r4 = r4 + 1
            goto L_0x0050
        L_0x005e:
            byte[] r4 = new byte[r6]
            r5 = 0
            r6 = 0
        L_0x0062:
            if (r5 >= r3) goto L_0x0094
            r7 = r0[r5]
            com.ss.android.ugc.aweme.im.sdk.k.z r7 = r7.e()
            byte[] r7 = r7.a()
            r8 = 2
            java.lang.System.arraycopy(r7, r9, r4, r6, r8)
            r7 = r0[r5]
            com.ss.android.ugc.aweme.im.sdk.k.z r7 = r7.d()
            byte[] r7 = r7.a()
            int r10 = r6 + 2
            java.lang.System.arraycopy(r7, r9, r4, r10, r8)
            r7 = r0[r5]
            byte[] r7 = r7.c()
            int r8 = r6 + 4
            int r10 = r7.length
            java.lang.System.arraycopy(r7, r9, r4, r8, r10)
            int r7 = r7.length
            int r7 = r7 + 4
            int r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x0062
        L_0x0094:
            if (r2 == 0) goto L_0x00a2
            int r2 = r0.length
            int r2 = r2 - r1
            r0 = r0[r2]
            byte[] r0 = r0.c()
            int r1 = r0.length
            java.lang.System.arraycopy(r0, r9, r4, r6, r1)
        L_0x00a2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.d.a(com.ss.android.ugc.aweme.im.sdk.k.v[]):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.im.sdk.k.v[] a(byte[] r21, boolean r22, com.ss.android.ugc.aweme.im.sdk.k.d.a r23) throws java.util.zip.ZipException {
        /*
            r0 = r21
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            java.lang.Byte r5 = java.lang.Byte.valueOf(r22)
            r12 = 1
            r4[r12] = r5
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f51723a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<byte[]> r5 = byte[].class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r9[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.d$a> r5 = com.ss.android.ugc.aweme.im.sdk.k.d.a.class
            r9[r13] = r5
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r10 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r5 = 0
            r7 = 1
            r8 = 54228(0xd3d4, float:7.599E-41)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005e
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r22)
            r14[r12] = r0
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f51723a
            r17 = 1
            r18 = 54228(0xd3d4, float:7.599E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.d$a> r1 = com.ss.android.ugc.aweme.im.sdk.k.d.a.class
            r0[r13] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r20 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = (com.ss.android.ugc.aweme.im.sdk.k.v[]) r0
            return r0
        L_0x005e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L_0x0064:
            int r5 = r0.length
            int r5 = r5 + -4
            if (r4 > r5) goto L_0x015e
            com.ss.android.ugc.aweme.im.sdk.k.z r5 = new com.ss.android.ugc.aweme.im.sdk.k.z
            r5.<init>(r0, r4)
            com.ss.android.ugc.aweme.im.sdk.k.z r6 = new com.ss.android.ugc.aweme.im.sdk.k.z
            int r7 = r4 + 2
            r6.<init>(r0, r7)
            int r6 = r6.f51820b
            int r7 = r4 + 4
            int r8 = r7 + r6
            int r9 = r0.length
            if (r8 <= r9) goto L_0x00dd
            int r5 = r2.f51728d
            switch(r5) {
                case 0: goto L_0x00b0;
                case 1: goto L_0x015e;
                case 2: goto L_0x0099;
                default: goto L_0x0083;
            }
        L_0x0083:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "unknown UnparseableExtraField key: "
            r1.<init>(r3)
            int r2 = r2.f51728d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0099:
            com.ss.android.ugc.aweme.im.sdk.k.l r2 = new com.ss.android.ugc.aweme.im.sdk.k.l
            r2.<init>()
            if (r22 == 0) goto L_0x00a6
            int r1 = r0.length
            int r1 = r1 - r4
            r2.a(r0, r4, r1)
            goto L_0x00ab
        L_0x00a6:
            int r1 = r0.length
            int r1 = r1 - r4
            r2.b(r0, r4, r1)
        L_0x00ab:
            r3.add(r2)
            goto L_0x015e
        L_0x00b0:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "bad extra field starting at "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = ".  Block length of "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " bytes exceeds remaining data of "
            r2.append(r3)
            int r0 = r0.length
            int r0 = r0 - r4
            int r0 = r0 + -4
            r2.append(r0)
            java.lang.String r0 = " bytes."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00dd:
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r13[r11] = r5     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f51723a     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r16 = 1
            r17 = 54225(0xd3d1, float:7.5985E-41)
            java.lang.Class[] r8 = new java.lang.Class[r12]     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.z> r9 = com.ss.android.ugc.aweme.im.sdk.k.z.class
            r8[r11] = r9     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v> r19 = com.ss.android.ugc.aweme.im.sdk.k.v.class
            r18 = r8
            boolean r8 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            if (r8 == 0) goto L_0x0116
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r13[r11] = r5     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f51723a     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r16 = 1
            r17 = 54225(0xd3d1, float:7.5985E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.z> r8 = com.ss.android.ugc.aweme.im.sdk.k.z.class
            r5[r11] = r8     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v> r19 = com.ss.android.ugc.aweme.im.sdk.k.v.class
            r18 = r5
            java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            com.ss.android.ugc.aweme.im.sdk.k.v r5 = (com.ss.android.ugc.aweme.im.sdk.k.v) r5     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            goto L_0x012f
        L_0x0116:
            java.util.Map<com.ss.android.ugc.aweme.im.sdk.k.z, java.lang.Class<?>> r8 = f51724b     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            java.lang.Object r8 = r8.get(r5)     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            if (r8 == 0) goto L_0x0127
            java.lang.Object r5 = r8.newInstance()     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            com.ss.android.ugc.aweme.im.sdk.k.v r5 = (com.ss.android.ugc.aweme.im.sdk.k.v) r5     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            goto L_0x012f
        L_0x0127:
            com.ss.android.ugc.aweme.im.sdk.k.m r8 = new com.ss.android.ugc.aweme.im.sdk.k.m     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r8.<init>()     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r8.f51756b = r5     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r5 = r8
        L_0x012f:
            if (r22 != 0) goto L_0x013d
            boolean r8 = r5 instanceof com.ss.android.ugc.aweme.im.sdk.k.c     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            if (r8 != 0) goto L_0x0136
            goto L_0x013d
        L_0x0136:
            r8 = r5
            com.ss.android.ugc.aweme.im.sdk.k.c r8 = (com.ss.android.ugc.aweme.im.sdk.k.c) r8     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            r8.b(r0, r7, r6)     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            goto L_0x0140
        L_0x013d:
            r5.a(r0, r7, r6)     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
        L_0x0140:
            r3.add(r5)     // Catch:{ InstantiationException -> 0x0153, IllegalAccessException -> 0x0148 }
            int r6 = r6 + 4
            int r4 = r4 + r6
            goto L_0x0064
        L_0x0148:
            r0 = move-exception
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L_0x0153:
            r0 = move-exception
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L_0x015e:
            int r0 = r3.size()
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = new com.ss.android.ugc.aweme.im.sdk.k.v[r0]
            java.lang.Object[] r0 = r3.toArray(r0)
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = (com.ss.android.ugc.aweme.im.sdk.k.v[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.d.a(byte[], boolean, com.ss.android.ugc.aweme.im.sdk.k.d$a):com.ss.android.ugc.aweme.im.sdk.k.v[]");
    }
}
