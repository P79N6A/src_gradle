package com.ss.android.ugc.aweme.utils;

import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class cd {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75670a;

    static class a implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75673a;

        /* renamed from: b  reason: collision with root package name */
        private final PathMeasure f75674b;

        /* renamed from: c  reason: collision with root package name */
        private final float[] f75675c = new float[2];

        /* renamed from: d  reason: collision with root package name */
        private final float f75676d = this.f75674b.getLength();

        public a(b bVar) {
            Path path = new Path();
            path.reset();
            bVar.a(path);
            this.f75674b = new PathMeasure(path, false);
        }

        public final float getInterpolation(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f75673a, false, 88362, new Class[]{Float.TYPE}, Float.TYPE)) {
                return ((Float) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f75673a, false, 88362, new Class[]{Float.TYPE}, Float.TYPE)).floatValue();
            }
            this.f75674b.getPosTan(this.f75676d * f2, this.f75675c, null);
            return this.f75675c[1];
        }
    }

    interface b {
        void a(Path path);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.TimeInterpolator a(int r18, float... r19) {
        /*
            r0 = r19
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r9 = 0
            r2[r9] = r3
            r10 = 1
            r2[r10] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f75670a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r9] = r3
            java.lang.Class<float[]> r3 = float[].class
            r7[r10] = r3
            java.lang.Class<android.animation.TimeInterpolator> r8 = android.animation.TimeInterpolator.class
            r3 = 0
            r5 = 1
            r6 = 88358(0x15926, float:1.23816E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004e
            java.lang.Object[] r11 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r11[r9] = r2
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f75670a
            r14 = 1
            r15 = 88358(0x15926, float:1.23816E-40)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r9] = r1
            java.lang.Class<float[]> r1 = float[].class
            r0[r10] = r1
            java.lang.Class<android.animation.TimeInterpolator> r17 = android.animation.TimeInterpolator.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            android.animation.TimeInterpolator r0 = (android.animation.TimeInterpolator) r0
            return r0
        L_0x004e:
            com.ss.android.ugc.aweme.utils.cd$a r1 = new com.ss.android.ugc.aweme.utils.cd$a
            com.ss.android.ugc.aweme.utils.cd$1 r2 = new com.ss.android.ugc.aweme.utils.cd$1
            r2.<init>(r0)
            r1.<init>(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.cd.a(int, float[]):android.animation.TimeInterpolator");
    }
}
