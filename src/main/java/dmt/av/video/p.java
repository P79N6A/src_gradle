package dmt.av.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Arrays;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83050a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f83051b;

    /* renamed from: c  reason: collision with root package name */
    public long f83052c;

    /* renamed from: d  reason: collision with root package name */
    public long f83053d;

    /* renamed from: e  reason: collision with root package name */
    public int f83054e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f83055f;
    public int g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f83050a, false, 92009, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f83050a, false, 92009, new Class[0], String.class);
        }
        return "VEFilterEffectOp{mEffectIndexes=" + Arrays.toString(this.f83051b) + ", mTimePoint=" + this.f83052c + ", mOp=" + this.f83054e + ", mReverse=" + this.f83055f + ", mColor=" + this.g + ", mResource='" + this.h + '\'' + ", mName='" + this.j + '\'' + ", mKey='" + this.i + '\'' + '}';
    }

    public static p a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f83050a, true, 92003, new Class[]{Integer.TYPE}, p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f83050a, true, 92003, new Class[]{Integer.TYPE}, p.class);
        }
        p pVar = new p();
        pVar.f83054e = 7;
        pVar.f83051b = new int[]{i2};
        return pVar;
    }

    public static p b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f83050a, true, 92006, new Class[]{Integer.TYPE}, p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f83050a, true, 92006, new Class[]{Integer.TYPE}, p.class);
        }
        p pVar = new p();
        pVar.f83054e = 2;
        pVar.f83051b = new int[]{i2};
        return pVar;
    }

    public static p a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, null, f83050a, true, 92005, new Class[]{Long.TYPE}, p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[]{new Long(j3)}, null, f83050a, true, 92005, new Class[]{Long.TYPE}, p.class);
        }
        p pVar = new p();
        pVar.f83054e = 1;
        pVar.f83052c = j3;
        return pVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static dmt.av.video.p a(int[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f83050a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class<dmt.av.video.p> r8 = dmt.av.video.p.class
            r3 = 0
            r5 = 1
            r6 = 92007(0x16767, float:1.28929E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f83050a
            r13 = 1
            r14 = 92007(0x16767, float:1.28929E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<int[]> r0 = int[].class
            r15[r9] = r0
            java.lang.Class<dmt.av.video.p> r16 = dmt.av.video.p.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            dmt.av.video.p r0 = (dmt.av.video.p) r0
            return r0
        L_0x0037:
            dmt.av.video.p r1 = new dmt.av.video.p
            r1.<init>()
            r2 = 4
            r1.f83054e = r2
            r1.f83051b = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.p.a(int[]):dmt.av.video.p");
    }

    public static p a(String str, long j2) {
        String str2 = str;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3)}, null, f83050a, true, 92004, new Class[]{String.class, Long.TYPE}, p.class)) {
            return (p) PatchProxy.accessDispatch(new Object[]{str2, new Long(j3)}, null, f83050a, true, 92004, new Class[]{String.class, Long.TYPE}, p.class);
        }
        p pVar = new p();
        pVar.f83054e = 0;
        pVar.h = str2;
        pVar.f83052c = j3;
        return pVar;
    }
}
