package com.ss.android.ugc.aweme.im.sdk.k;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;

public class u extends ZipEntry implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51776a;
    private static final byte[] h = new byte[0];
    private static final v[] m = new v[0];

    /* renamed from: b  reason: collision with root package name */
    public int f51777b;

    /* renamed from: c  reason: collision with root package name */
    public int f51778c;

    /* renamed from: d  reason: collision with root package name */
    public long f51779d;

    /* renamed from: e  reason: collision with root package name */
    public l f51780e;

    /* renamed from: f  reason: collision with root package name */
    byte[] f51781f;
    public f g;
    private int i;
    private long j;
    private v[] k;
    private String l;

    public int getMethod() {
        return this.i;
    }

    public long getSize() {
        return this.j;
    }

    public final void a(z zVar) {
        if (PatchProxy.isSupport(new Object[]{zVar}, this, f51776a, false, 54303, new Class[]{z.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{zVar}, this, f51776a, false, 54303, new Class[]{z.class}, Void.TYPE);
        } else if (this.k != null) {
            ArrayList arrayList = new ArrayList();
            for (v vVar : this.k) {
                if (!zVar.equals(vVar.e())) {
                    arrayList.add(vVar);
                }
            }
            if (this.k.length != arrayList.size()) {
                this.k = (v[]) arrayList.toArray(new v[arrayList.size()]);
                a();
                return;
            }
            throw new NoSuchElementException();
        } else {
            throw new NoSuchElementException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(byte[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51776a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 54308(0xd424, float:7.6102E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51776a
            r13 = 0
            r14 = 54308(0xd424, float:7.6102E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.im.sdk.k.d$a r1 = com.ss.android.ugc.aweme.im.sdk.k.d.a.f51727c     // Catch:{ ZipException -> 0x0044 }
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = com.ss.android.ugc.aweme.im.sdk.k.d.a(r0, r9, r1)     // Catch:{ ZipException -> 0x0044 }
            r1 = r17
            r1.a((com.ss.android.ugc.aweme.im.sdk.k.v[]) r0, (boolean) r9)     // Catch:{ ZipException -> 0x0042 }
            return
        L_0x0042:
            r0 = move-exception
            goto L_0x0047
        L_0x0044:
            r0 = move-exception
            r1 = r17
        L_0x0047:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.u.a(byte[]):void");
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f51776a, false, 54313, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f51776a, false, 54313, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.l = (str == null || this.f51778c != 0 || str.contains("/")) ? str : str.replace('\\', '/');
    }

    public u() {
        this("");
    }

    private v[] d() {
        if (this.f51780e == null) {
            return m;
        }
        return new v[]{this.f51780e};
    }

    private v[] c() {
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54298, new Class[0], v[].class)) {
            return (v[]) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54298, new Class[0], v[].class);
        }
        v[] a2 = a(this.k, this.k.length + 1);
        a2[this.k.length] = this.f51780e;
        return a2;
    }

    private v[] e() {
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54300, new Class[0], v[].class)) {
            return (v[]) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54300, new Class[0], v[].class);
        } else if (this.k == null) {
            return d();
        } else {
            if (this.f51780e != null) {
                return c();
            }
            return this.k;
        }
    }

    private byte[] f() {
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54309, new Class[0], byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54309, new Class[0], byte[].class);
        }
        byte[] extra = getExtra();
        if (extra != null) {
            return extra;
        }
        return h;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54307, new Class[0], Void.TYPE);
            return;
        }
        super.setExtra(d.a(a(true)));
    }

    public Object clone() {
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54289, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54289, new Class[0], Object.class);
        }
        u uVar = (u) super.clone();
        uVar.f51777b = this.f51777b;
        uVar.f51779d = this.f51779d;
        uVar.a(e());
        return uVar;
    }

    public String getName() {
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54311, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54311, new Class[0], String.class);
        } else if (this.l == null) {
            return super.getName();
        } else {
            return this.l;
        }
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f51776a, false, 54317, new Class[0], Integer.TYPE)) {
            return getName().hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54317, new Class[0], Integer.TYPE)).intValue();
    }

    public boolean isDirectory() {
        if (!PatchProxy.isSupport(new Object[0], this, f51776a, false, 54312, new Class[0], Boolean.TYPE)) {
            return getName().endsWith("/");
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54312, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51776a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<byte[]> r7 = byte[].class
            r4 = 0
            r5 = 54310(0xd426, float:7.6105E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51776a
            r5 = 0
            r6 = 54310(0xd426, float:7.6105E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<byte[]> r8 = byte[].class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            byte[] r0 = (byte[]) r0
            return r0
        L_0x0028:
            r1 = 1
            com.ss.android.ugc.aweme.im.sdk.k.v[] r2 = r11.a((boolean) r1)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r0] = r2
            r4 = 0
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.im.sdk.k.d.f51723a
            r6 = 1
            r7 = 54230(0xd3d6, float:7.5992E-41)
            java.lang.Class[] r8 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r9 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r8[r0] = r9
            java.lang.Class<byte[]> r9 = byte[].class
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0060
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r0] = r2
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.im.sdk.k.d.f51723a
            r7 = 1
            r8 = 54230(0xd3d6, float:7.5992E-41)
            java.lang.Class[] r9 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r1 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r9[r0] = r1
            java.lang.Class<byte[]> r10 = byte[].class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            byte[] r0 = (byte[]) r0
            return r0
        L_0x0060:
            int r3 = r2.length
            if (r3 <= 0) goto L_0x006d
            int r3 = r2.length
            int r3 = r3 - r1
            r3 = r2[r3]
            boolean r3 = r3 instanceof com.ss.android.ugc.aweme.im.sdk.k.l
            if (r3 == 0) goto L_0x006d
            r3 = 1
            goto L_0x006e
        L_0x006d:
            r3 = 0
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            int r4 = r2.length
            int r4 = r4 - r1
            goto L_0x0074
        L_0x0073:
            int r4 = r2.length
        L_0x0074:
            int r5 = r4 * 4
            int r6 = r2.length
            r7 = r5
            r5 = 0
        L_0x0079:
            if (r5 >= r6) goto L_0x0087
            r8 = r2[r5]
            com.ss.android.ugc.aweme.im.sdk.k.z r8 = r8.b()
            int r8 = r8.f51820b
            int r7 = r7 + r8
            int r5 = r5 + 1
            goto L_0x0079
        L_0x0087:
            byte[] r5 = new byte[r7]
            r6 = 0
            r7 = 0
        L_0x008b:
            if (r6 >= r4) goto L_0x00bd
            r8 = r2[r6]
            com.ss.android.ugc.aweme.im.sdk.k.z r8 = r8.e()
            byte[] r8 = r8.a()
            r9 = 2
            java.lang.System.arraycopy(r8, r0, r5, r7, r9)
            r8 = r2[r6]
            com.ss.android.ugc.aweme.im.sdk.k.z r8 = r8.b()
            byte[] r8 = r8.a()
            int r10 = r7 + 2
            java.lang.System.arraycopy(r8, r0, r5, r10, r9)
            r8 = r2[r6]
            byte[] r8 = r8.a()
            int r9 = r7 + 4
            int r10 = r8.length
            java.lang.System.arraycopy(r8, r0, r5, r9, r10)
            int r8 = r8.length
            int r8 = r8 + 4
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00bd:
            if (r3 == 0) goto L_0x00cb
            int r3 = r2.length
            int r3 = r3 - r1
            r1 = r2[r3]
            byte[] r1 = r1.a()
            int r2 = r1.length
            java.lang.System.arraycopy(r1, r0, r5, r7, r2)
        L_0x00cb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.u.b():byte[]");
    }

    private u(String str) {
        super(str);
        this.i = -1;
        this.j = -1;
        this.g = new f();
        a(str);
    }

    private void a(v[] vVarArr) {
        if (PatchProxy.isSupport(new Object[]{vVarArr}, this, f51776a, false, 54292, new Class[]{v[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVarArr}, this, f51776a, false, 54292, new Class[]{v[].class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (l lVar : vVarArr) {
            if (lVar instanceof l) {
                this.f51780e = lVar;
            } else {
                arrayList.add(lVar);
            }
        }
        this.k = (v[]) arrayList.toArray(new v[arrayList.size()]);
        a();
    }

    private void b(v vVar) {
        if (PatchProxy.isSupport(new Object[]{vVar}, this, f51776a, false, 54301, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar}, this, f51776a, false, 54301, new Class[]{v.class}, Void.TYPE);
            return;
        }
        if (vVar instanceof l) {
            this.f51780e = (l) vVar;
        } else if (this.k == null) {
            this.k = new v[]{vVar};
        } else {
            if (b(vVar.e()) != null) {
                a(vVar.e());
            }
            v[] a2 = a(this.k, this.k.length + 1);
            a2[this.k.length] = vVar;
            this.k = a2;
        }
        a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setExtra(byte[] r18) throws java.lang.RuntimeException {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51776a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r3 = byte[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 54306(0xd422, float:7.6099E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51776a
            r13 = 0
            r14 = 54306(0xd422, float:7.6099E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<byte[]> r0 = byte[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.im.sdk.k.d$a r2 = com.ss.android.ugc.aweme.im.sdk.k.d.a.f51727c     // Catch:{ ZipException -> 0x0044 }
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = com.ss.android.ugc.aweme.im.sdk.k.d.a(r0, r1, r2)     // Catch:{ ZipException -> 0x0044 }
            r2 = r17
            r2.a((com.ss.android.ugc.aweme.im.sdk.k.v[]) r0, (boolean) r1)     // Catch:{ ZipException -> 0x0042 }
            return
        L_0x0042:
            r0 = move-exception
            goto L_0x0047
        L_0x0044:
            r0 = move-exception
            r2 = r17
        L_0x0047:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Error parsing extra fields for entry: "
            r3.<init>(r4)
            java.lang.String r4 = r17.getName()
            r3.append(r4)
            java.lang.String r4 = " - "
            r3.append(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.u.setExtra(byte[]):void");
    }

    public void setMethod(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f51776a, false, 54290, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f51776a, false, 54290, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i3 >= 0) {
            this.i = i3;
        } else {
            throw new IllegalArgumentException("ZIP compression method can not be negative: " + i3);
        }
    }

    public void setSize(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f51776a, false, 54314, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f51776a, false, 54314, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (j3 >= 0) {
            this.j = j3;
        } else {
            throw new IllegalArgumentException("invalid entry size");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.aweme.im.sdk.k.v[] b(com.ss.android.ugc.aweme.im.sdk.k.v[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f51776a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r3 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r8 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r5 = 0
            r6 = 54296(0xd418, float:7.6085E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0039
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f51776a
            r13 = 0
            r14 = 54296(0xd418, float:7.6085E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r0 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r16 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = (com.ss.android.ugc.aweme.im.sdk.k.v[]) r0
            return r0
        L_0x0039:
            int r1 = r0.length
            r2 = r17
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = r2.a((com.ss.android.ugc.aweme.im.sdk.k.v[]) r0, (int) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.u.b(com.ss.android.ugc.aweme.im.sdk.k.v[]):com.ss.android.ugc.aweme.im.sdk.k.v[]");
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f51776a, false, 54320, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f51776a, false, 54320, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            u uVar = (u) obj;
            String name = getName();
            String name2 = uVar.getName();
            if (name == null) {
                if (name2 != null) {
                    return false;
                }
            } else if (!name.equals(name2)) {
                return false;
            }
            String comment = getComment();
            String comment2 = uVar.getComment();
            if (comment == null) {
                comment = "";
            }
            if (comment2 == null) {
                comment2 = "";
            }
            if (getTime() == uVar.getTime() && comment.equals(comment2) && this.f51777b == uVar.f51777b && this.f51778c == uVar.f51778c && this.f51779d == uVar.f51779d && getMethod() == uVar.getMethod() && getSize() == uVar.getSize() && getCrc() == uVar.getCrc() && getCompressedSize() == uVar.getCompressedSize() && Arrays.equals(b(), uVar.b()) && Arrays.equals(f(), uVar.f()) && this.g.equals(uVar.g)) {
                return true;
            }
            return false;
        }
    }

    private v[] a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f51776a, false, 54294, new Class[]{Boolean.TYPE}, v[].class)) {
            return (v[]) PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f51776a, false, 54294, new Class[]{Boolean.TYPE}, v[].class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f51776a, false, 54299, new Class[0], v[].class)) {
            return (v[]) PatchProxy.accessDispatch(new Object[0], this, f51776a, false, 54299, new Class[0], v[].class);
        }
        v[] e2 = e();
        if (e2 == this.k) {
            return b(e2);
        }
        return e2;
    }

    public final v b(z zVar) {
        if (PatchProxy.isSupport(new Object[]{zVar}, this, f51776a, false, 54305, new Class[]{z.class}, v.class)) {
            return (v) PatchProxy.accessDispatch(new Object[]{zVar}, this, f51776a, false, 54305, new Class[]{z.class}, v.class);
        }
        if (this.k != null) {
            for (v vVar : this.k) {
                if (zVar.equals(vVar.e())) {
                    return vVar;
                }
            }
        }
        return null;
    }

    public final void a(v vVar) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{vVar}, this, f51776a, false, 54302, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar}, this, f51776a, false, 54302, new Class[]{v.class}, Void.TYPE);
            return;
        }
        if (b(vVar.e()) != null) {
            a(vVar.e());
        }
        v[] vVarArr = this.k;
        if (this.k != null) {
            i2 = this.k.length + 1;
        } else {
            i2 = 1;
        }
        this.k = new v[i2];
        this.k[0] = vVar;
        if (vVarArr != null) {
            System.arraycopy(vVarArr, 0, this.k, 1, this.k.length - 1);
        }
        a();
    }

    private void a(v[] vVarArr, boolean z) throws ZipException {
        v vVar;
        if (PatchProxy.isSupport(new Object[]{vVarArr, Byte.valueOf(z ? (byte) 1 : 0)}, this, f51776a, false, 54318, new Class[]{v[].class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVarArr, Byte.valueOf(z)}, this, f51776a, false, 54318, new Class[]{v[].class, Boolean.TYPE}, Void.TYPE);
        } else if (this.k == null) {
            a(vVarArr);
        } else {
            for (v vVar2 : vVarArr) {
                if (vVar2 instanceof l) {
                    vVar = this.f51780e;
                } else {
                    vVar = b(vVar2.e());
                }
                if (vVar == null) {
                    b(vVar2);
                } else if (z || !(vVar instanceof c)) {
                    byte[] c2 = vVar2.c();
                    vVar.a(c2, 0, c2.length);
                } else {
                    byte[] a2 = vVar2.a();
                    ((c) vVar).b(a2, 0, a2.length);
                }
            }
            a();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.android.ugc.aweme.im.sdk.k.v[] a(com.ss.android.ugc.aweme.im.sdk.k.v[] r20, int r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r3[r11] = r4
            com.meituan.robust.ChangeQuickRedirect r5 = f51776a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r4 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r8[r10] = r4
            java.lang.Class r4 = java.lang.Integer.TYPE
            r8[r11] = r4
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r9 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r6 = 0
            r7 = 54297(0xd419, float:7.6086E-41)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0052
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = f51776a
            r15 = 0
            r16 = 54297(0xd419, float:7.6086E-41)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r1 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.k.v[]> r18 = com.ss.android.ugc.aweme.im.sdk.k.v[].class
            r13 = r19
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.im.sdk.k.v[] r0 = (com.ss.android.ugc.aweme.im.sdk.k.v[]) r0
            return r0
        L_0x0052:
            com.ss.android.ugc.aweme.im.sdk.k.v[] r2 = new com.ss.android.ugc.aweme.im.sdk.k.v[r1]
            int r3 = r0.length
            int r1 = java.lang.Math.min(r3, r1)
            java.lang.System.arraycopy(r0, r10, r2, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.k.u.a(com.ss.android.ugc.aweme.im.sdk.k.v[], int):com.ss.android.ugc.aweme.im.sdk.k.v[]");
    }
}
