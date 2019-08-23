package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.medialib.FaceBeautyInvoker;

public final /* synthetic */ class bf implements FaceBeautyInvoker.OnCherEffectParmaCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70807a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70808b;

    bf(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70808b = videoRecordNewActivity;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCherEffect(java.lang.String[] r22, double[] r23, boolean[] r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f70807a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r11] = r5
            java.lang.Class<double[]> r5 = double[].class
            r9[r12] = r5
            java.lang.Class<boolean[]> r5 = boolean[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 80629(0x13af5, float:1.12985E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0057
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f70807a
            r17 = 0
            r18 = 80629(0x13af5, float:1.12985E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<double[]> r1 = double[].class
            r0[r12] = r1
            java.lang.Class<boolean[]> r1 = boolean[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0057:
            r3 = r21
            com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r4 = r3.f70808b
            if (r0 != 0) goto L_0x0063
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r4.f4034c
            r1 = 0
            r0.aw = r1
            goto L_0x006c
        L_0x0063:
            com.ss.android.ugc.aweme.shortvideo.fh r5 = r4.f4034c
            com.ss.android.ugc.aweme.shortvideo.ah r6 = new com.ss.android.ugc.aweme.shortvideo.ah
            r6.<init>(r0, r1, r2)
            r5.aw = r6
        L_0x006c:
            com.ss.android.ugc.aweme.shortvideo.fh r0 = r4.f4034c
            com.ss.android.ugc.aweme.shortvideo.ah r0 = r0.aw
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.d.a.f66731a
            r7 = 1
            r8 = 75263(0x125ff, float:1.05466E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ah> r1 = com.ss.android.ugc.aweme.shortvideo.ah.class
            r9[r11] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x00a0
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r4[r11] = r0
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.shortvideo.d.a.f66731a
            r7 = 1
            r8 = 75263(0x125ff, float:1.05466E-40)
            java.lang.Class[] r9 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.ah> r0 = com.ss.android.ugc.aweme.shortvideo.ah.class
            r9[r11] = r0
            java.lang.Class r10 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x00a0:
            android.app.Application r1 = com.ss.android.ugc.aweme.port.in.a.f61119b
            java.lang.String r2 = "publish"
            android.content.SharedPreferences r1 = com.ss.android.ugc.aweme.q.c.a(r1, r2, r11)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            if (r0 == 0) goto L_0x00ba
            java.lang.String r2 = "ve_cher_effect_param"
            com.google.gson.Gson r4 = com.ss.android.ugc.aweme.port.in.a.f61120c
            java.lang.String r0 = r4.toJson((java.lang.Object) r0)
            r1.putString(r2, r0)
            goto L_0x00bf
        L_0x00ba:
            java.lang.String r0 = "ve_cher_effect_param"
            r1.remove(r0)
        L_0x00bf:
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.bf.onCherEffect(java.lang.String[], double[], boolean[]):void");
    }
}
