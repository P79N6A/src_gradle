package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.k.n;

public abstract class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51715a;

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f51716b = x.a(8448);

    private static boolean b(u uVar) {
        if (!uVar.g.f51734d) {
            return true;
        }
        return false;
    }

    public static void a(u uVar) throws n {
        u uVar2 = uVar;
        if (PatchProxy.isSupport(new Object[]{uVar2}, null, f51715a, true, 54414, new Class[]{u.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uVar2}, null, f51715a, true, 54414, new Class[]{u.class}, Void.TYPE);
        } else if (!b(uVar)) {
            throw new n(n.a.ENCRYPTION, uVar2);
        } else if (!c(uVar)) {
            throw new n(n.a.METHOD, uVar2);
        }
    }

    private static boolean c(u uVar) {
        if (PatchProxy.isSupport(new Object[]{uVar}, null, f51715a, true, 54413, new Class[]{u.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uVar}, null, f51715a, true, 54413, new Class[]{u.class}, Boolean.TYPE)).booleanValue();
        } else if (uVar.getMethod() == 0 || uVar.getMethod() == 8) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] a(byte[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51715a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class<byte[]> r8 = byte[].class
            r3 = 0
            r5 = 1
            r6 = 54411(0xd48b, float:7.6246E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f51715a
            r13 = 1
            r14 = 54411(0xd48b, float:7.6246E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class<byte[]> r16 = byte[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            byte[] r0 = (byte[]) r0
            return r0
        L_0x0037:
            if (r0 == 0) goto L_0x0041
            int r1 = r0.length
            byte[] r1 = new byte[r1]
            int r2 = r1.length
            java.lang.System.arraycopy(r0, r9, r1, r9, r2)
            return r1
        L_0x0041:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.aa.a(byte[]):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String a(com.ss.android.ugc.aweme.im.sdk.k.a r16, byte[] r17) {
        /*
            r7 = r16
            r0 = r17
            r1 = 2
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r15 = 0
            r8[r15] = r7
            r2 = 1
            r8[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = f51715a
            java.lang.Class[] r13 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.a> r3 = com.ss.android.ugc.aweme.im.sdk.k.a.class
            r13[r15] = r3
            java.lang.Class<byte[]> r3 = byte[].class
            r13[r2] = r3
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = 0
            r11 = 1
            r12 = 54410(0xd48a, float:7.6245E-41)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r8, r9, r10, r11, r12, r13, r14)
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r15] = r7
            r4[r2] = r0
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f51715a
            r7 = 1
            r8 = 54410(0xd48a, float:7.6245E-41)
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.a> r0 = com.ss.android.ugc.aweme.im.sdk.k.a.class
            r9[r15] = r0
            java.lang.Class<byte[]> r0 = byte[].class
            r9[r2] = r0
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0046:
            r8 = 0
            if (r7 == 0) goto L_0x009d
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            r1.update(r0)
            long r0 = r1.getValue()
            long r2 = r7.f51712b
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x009d
            com.ss.android.ugc.aweme.im.sdk.k.s r9 = com.ss.android.ugc.aweme.im.sdk.k.t.f51770b     // Catch:{ IOException -> 0x009c }
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x009c }
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.im.sdk.k.a.f51711a     // Catch:{ IOException -> 0x009c }
            r3 = 0
            r4 = 54205(0xd3bd, float:7.5957E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]     // Catch:{ IOException -> 0x009c }
            java.lang.Class<byte[]> r6 = byte[].class
            r1 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x009c }
            if (r0 == 0) goto L_0x0086
            java.lang.Object[] r0 = new java.lang.Object[r15]     // Catch:{ IOException -> 0x009c }
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.im.sdk.k.a.f51711a     // Catch:{ IOException -> 0x009c }
            r3 = 0
            r4 = 54205(0xd3bd, float:7.5957E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]     // Catch:{ IOException -> 0x009c }
            java.lang.Class<byte[]> r6 = byte[].class
            r1 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x009c }
            byte[] r0 = (byte[]) r0     // Catch:{ IOException -> 0x009c }
            goto L_0x0097
        L_0x0086:
            byte[] r0 = r7.f51713c     // Catch:{ IOException -> 0x009c }
            if (r0 == 0) goto L_0x0096
            byte[] r0 = r7.f51713c     // Catch:{ IOException -> 0x009c }
            int r0 = r0.length     // Catch:{ IOException -> 0x009c }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x009c }
            byte[] r1 = r7.f51713c     // Catch:{ IOException -> 0x009c }
            int r2 = r0.length     // Catch:{ IOException -> 0x009c }
            java.lang.System.arraycopy(r1, r15, r0, r15, r2)     // Catch:{ IOException -> 0x009c }
            goto L_0x0097
        L_0x0096:
            r0 = r8
        L_0x0097:
            java.lang.String r0 = r9.a((byte[]) r0)     // Catch:{ IOException -> 0x009c }
            return r0
        L_0x009c:
            return r8
        L_0x009d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.aa.a(com.ss.android.ugc.aweme.im.sdk.k.a, byte[]):java.lang.String");
    }
}
