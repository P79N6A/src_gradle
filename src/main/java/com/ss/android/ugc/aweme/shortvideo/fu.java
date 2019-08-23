package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity;
import com.ss.android.ugc.aweme.tools.aq;
import com.ss.android.ugc.aweme.tools.bc;
import com.ss.android.ugc.aweme.tools.bd;
import com.ss.android.ugc.aweme.tools.bg;
import com.ss.android.ugc.aweme.tools.bh;
import java.lang.reflect.Type;

public final class fu implements bh {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67807a;

    /* renamed from: b  reason: collision with root package name */
    public final VideoRecordNewActivity f67808b;

    public fu(VideoRecordNewActivity videoRecordNewActivity) {
        this.f67808b = videoRecordNewActivity;
    }

    public final <T extends bc> bg<T> a(bd bdVar, Type type) {
        if (PatchProxy.isSupport(new Object[]{bdVar, type}, this, f67807a, false, 74704, new Class[]{bd.class, Type.class}, bg.class)) {
            return (bg) PatchProxy.accessDispatch(new Object[]{bdVar, type}, this, f67807a, false, 74704, new Class[]{bd.class, Type.class}, bg.class);
        } else if (type != aq.class) {
            return null;
        } else {
            final bg a2 = bdVar.a((bh) this, (Type) aq.class);
            return new bg<T>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f67809a;

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Object[]} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.Object[]} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(java.lang.Object r23, T r24) {
                    /*
                        r22 = this;
                        r7 = r22
                        r8 = r23
                        r9 = r24
                        r10 = 2
                        java.lang.Object[] r0 = new java.lang.Object[r10]
                        r11 = 0
                        r0[r11] = r8
                        r12 = 1
                        r0[r12] = r9
                        com.meituan.robust.ChangeQuickRedirect r2 = f67809a
                        java.lang.Class[] r5 = new java.lang.Class[r10]
                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                        r5[r11] = r1
                        java.lang.Class<com.ss.android.ugc.aweme.tools.bc> r1 = com.ss.android.ugc.aweme.tools.bc.class
                        r5[r12] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r3 = 0
                        r4 = 74705(0x123d1, float:1.04684E-40)
                        r1 = r22
                        boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                        if (r0 == 0) goto L_0x0047
                        java.lang.Object[] r0 = new java.lang.Object[r10]
                        r0[r11] = r8
                        r0[r12] = r9
                        com.meituan.robust.ChangeQuickRedirect r2 = f67809a
                        r3 = 0
                        r4 = 74705(0x123d1, float:1.04684E-40)
                        java.lang.Class[] r5 = new java.lang.Class[r10]
                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                        r5[r11] = r1
                        java.lang.Class<com.ss.android.ugc.aweme.tools.bc> r1 = com.ss.android.ugc.aweme.tools.bc.class
                        r5[r12] = r1
                        java.lang.Class r6 = java.lang.Void.TYPE
                        r1 = r22
                        com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                        return
                    L_0x0047:
                        com.ss.android.ugc.aweme.tools.bg r0 = r0
                        if (r0 == 0) goto L_0x0050
                        com.ss.android.ugc.aweme.tools.bg r0 = r0
                        r0.a(r8, r9)
                    L_0x0050:
                        com.ss.android.ugc.aweme.shortvideo.fu r0 = com.ss.android.ugc.aweme.shortvideo.fu.this
                        com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = r0.f67808b
                        com.ss.android.ugc.aweme.photo.PhotoModule r0 = r0.n
                        java.lang.Object[] r13 = new java.lang.Object[r11]
                        com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.photo.PhotoModule.f3717a
                        r16 = 0
                        r17 = 63592(0xf868, float:8.9111E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r11]
                        java.lang.Class r19 = java.lang.Void.TYPE
                        r14 = r0
                        r18 = r1
                        boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
                        if (r1 == 0) goto L_0x0081
                        java.lang.Object[] r13 = new java.lang.Object[r11]
                        com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.photo.PhotoModule.f3717a
                        r16 = 0
                        r17 = 63592(0xf868, float:8.9111E-41)
                        java.lang.Class[] r1 = new java.lang.Class[r11]
                        java.lang.Class r19 = java.lang.Void.TYPE
                        r14 = r0
                        r18 = r1
                        com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
                        goto L_0x0107
                    L_0x0081:
                        com.ss.android.ugc.aweme.photo.t r1 = r0.f3722f
                        com.ss.android.ugc.aweme.photo.c r1 = (com.ss.android.ugc.aweme.photo.c) r1
                        android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
                        r1.f58483b = r2
                        com.ss.android.ugc.aweme.photo.t r1 = r0.f3722f
                        java.lang.String r14 = r1.a()
                        com.bytedance.ies.uikit.base.AbsActivity r1 = r0.f3719c
                        java.lang.String r2 = ""
                        com.ss.android.ugc.aweme.shortvideo.view.d r1 = com.ss.android.ugc.aweme.shortvideo.view.d.b(r1, r2)
                        r0.g = r1
                        com.ss.android.ugc.aweme.shortvideo.view.d r1 = r0.g
                        r1.setIndeterminate(r12)
                        com.ss.android.medialib.presenter.MediaRecordPresenter r1 = r0.f3720d
                        int[] r2 = com.ss.android.ugc.aweme.photo.PhotoModule.f3718b
                        com.ss.android.ugc.aweme.photo.p r3 = new com.ss.android.ugc.aweme.photo.p
                        r3.<init>(r0, r14)
                        r0 = 3
                        java.lang.Object[] r15 = new java.lang.Object[r0]
                        r15[r11] = r14
                        r15[r12] = r2
                        r15[r10] = r3
                        com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
                        r18 = 0
                        r19 = 17656(0x44f8, float:2.4741E-41)
                        java.lang.Class[] r4 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.String> r5 = java.lang.String.class
                        r4[r11] = r5
                        java.lang.Class<int[]> r5 = int[].class
                        r4[r12] = r5
                        java.lang.Class<com.ss.android.medialib.common.a$b> r5 = com.ss.android.medialib.common.a.b.class
                        r4[r10] = r5
                        java.lang.Class r21 = java.lang.Integer.TYPE
                        r16 = r1
                        r20 = r4
                        boolean r4 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)
                        if (r4 == 0) goto L_0x00fc
                        java.lang.Object[] r15 = new java.lang.Object[r0]
                        r15[r11] = r14
                        r15[r12] = r2
                        r15[r10] = r3
                        com.meituan.robust.ChangeQuickRedirect r17 = com.ss.android.medialib.presenter.MediaRecordPresenter.f29728a
                        r18 = 0
                        r19 = 17656(0x44f8, float:2.4741E-41)
                        java.lang.Class[] r0 = new java.lang.Class[r0]
                        java.lang.Class<java.lang.String> r2 = java.lang.String.class
                        r0[r11] = r2
                        java.lang.Class<int[]> r2 = int[].class
                        r0[r12] = r2
                        java.lang.Class<com.ss.android.medialib.common.a$b> r2 = com.ss.android.medialib.common.a.b.class
                        r0[r10] = r2
                        java.lang.Class r21 = java.lang.Integer.TYPE
                        r16 = r1
                        r20 = r0
                        java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        r0.intValue()
                        goto L_0x0107
                    L_0x00fc:
                        r16 = 1
                        android.graphics.Bitmap$CompressFormat r17 = android.graphics.Bitmap.CompressFormat.PNG
                        r13 = r1
                        r15 = r2
                        r18 = r3
                        r13.a((java.lang.String) r14, (int[]) r15, (boolean) r16, (android.graphics.Bitmap.CompressFormat) r17, (com.ss.android.medialib.common.a.b) r18)
                    L_0x0107:
                        com.ss.android.ugc.aweme.shortvideo.fu r0 = com.ss.android.ugc.aweme.shortvideo.fu.this
                        com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r0 = r0.f67808b
                        org.json.JSONObject r0 = r0.i()
                        java.lang.String r1 = "prop_id"
                        com.ss.android.ugc.aweme.shortvideo.fu r2 = com.ss.android.ugc.aweme.shortvideo.fu.this     // Catch:{ JSONException -> 0x012d }
                        com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = r2.f67808b     // Catch:{ JSONException -> 0x012d }
                        com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r2 = r2.k     // Catch:{ JSONException -> 0x012d }
                        com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.g     // Catch:{ JSONException -> 0x012d }
                        if (r2 == 0) goto L_0x0128
                        com.ss.android.ugc.aweme.shortvideo.fu r2 = com.ss.android.ugc.aweme.shortvideo.fu.this     // Catch:{ JSONException -> 0x012d }
                        com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity r2 = r2.f67808b     // Catch:{ JSONException -> 0x012d }
                        com.ss.android.ugc.aweme.shortvideo.sticker.StickerModule r2 = r2.k     // Catch:{ JSONException -> 0x012d }
                        com.ss.android.ugc.aweme.sticker.model.FaceStickerBean r2 = r2.g     // Catch:{ JSONException -> 0x012d }
                        long r2 = r2.getStickerId()     // Catch:{ JSONException -> 0x012d }
                        goto L_0x012a
                    L_0x0128:
                        r2 = 0
                    L_0x012a:
                        r0.put(r1, r2)     // Catch:{ JSONException -> 0x012d }
                    L_0x012d:
                        com.ss.android.ugc.aweme.common.MobClick r1 = com.ss.android.ugc.aweme.common.MobClick.obtain()
                        java.lang.String r2 = "shoot_photo"
                        com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
                        java.lang.String r2 = "shoot_page"
                        com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
                        com.ss.android.ugc.aweme.common.MobClick r0 = r1.setJsonObject(r0)
                        com.ss.android.ugc.aweme.common.r.onEvent(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.fu.AnonymousClass1.a(java.lang.Object, com.ss.android.ugc.aweme.tools.bc):void");
                }
            };
        }
    }
}
