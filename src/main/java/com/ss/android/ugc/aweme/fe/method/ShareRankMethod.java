package com.ss.android.ugc.aweme.fe.method;

import android.graphics.Bitmap;
import com.facebook.react.bridge.ReactContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.a;

public class ShareRankMethod extends BaseCommonJavaMethod implements a.C0555a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44505a;

    /* renamed from: b  reason: collision with root package name */
    private BaseCommonJavaMethod.a f44506b;
    private a g;

    public ShareRankMethod(com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    public ShareRankMethod(ReactContext reactContext) {
        super(reactContext);
    }

    public final void a(Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{bitmap}, this, f44505a, false, 39831, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap}, this, f44505a, false, 39831, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        this.f44506b.a((Object) "done");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069 A[Catch:{ Exception -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de A[Catch:{ Exception -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r20, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f44505a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 39830(0x9b96, float:5.5814E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f44505a
            r3 = 0
            r4 = 39830(0x9b96, float:5.5814E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<org.json.JSONObject> r1 = org.json.JSONObject.class
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a> r1 = com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod.a.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            java.lang.String r0 = "is_valentines_day"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x014b }
            java.lang.String r1 = "true"
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch:{ Exception -> 0x014b }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "is_valentines_day"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x014b }
            java.lang.String r1 = "1"
            boolean r0 = android.text.TextUtils.equals(r0, r1)     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r0 = 0
            goto L_0x0067
        L_0x0066:
            r0 = 1
        L_0x0067:
            if (r0 == 0) goto L_0x00de
            java.lang.ref.WeakReference r0 = r7.f3123e     // Catch:{ Exception -> 0x014b }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x00dd
            java.lang.String r0 = "user_id"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x014b }
            java.lang.String r1 = "influence"
            java.lang.String r1 = r8.optString(r1)     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = "avatar_url"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ Exception -> 0x014b }
            java.lang.String r3 = "name"
            java.lang.String r3 = r8.optString(r3)     // Catch:{ Exception -> 0x014b }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x014b }
            if (r4 != 0) goto L_0x00dc
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x014b }
            if (r4 != 0) goto L_0x00dc
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x014b }
            if (r4 == 0) goto L_0x009c
            goto L_0x00dc
        L_0x009c:
            com.ss.android.ugc.aweme.hotsearch.share.s r4 = new com.ss.android.ugc.aweme.hotsearch.share.s     // Catch:{ Exception -> 0x014b }
            java.lang.ref.WeakReference r5 = r7.f3123e     // Catch:{ Exception -> 0x014b }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x014b }
            android.app.Activity r5 = (android.app.Activity) r5     // Catch:{ Exception -> 0x014b }
            com.ss.android.ugc.aweme.hotsearch.share.b r6 = new com.ss.android.ugc.aweme.hotsearch.share.b     // Catch:{ Exception -> 0x014b }
            r6.<init>(r0, r3, r2, r1)     // Catch:{ Exception -> 0x014b }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x014b }
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014b }
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.hotsearch.share.s.f49861a     // Catch:{ Exception -> 0x014b }
            r15 = 0
            r16 = 49796(0xc284, float:6.9779E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x014b }
            java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x014b }
            r13 = r4
            r17 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x00d6
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x014b }
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.hotsearch.share.s.f49861a     // Catch:{ Exception -> 0x014b }
            r15 = 0
            r16 = 49796(0xc284, float:6.9779E-41)
            java.lang.Class[] r0 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x014b }
            java.lang.Class r18 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x014b }
            r13 = r4
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x014b }
            return
        L_0x00d6:
            com.ss.android.ugc.aweme.hotsearch.share.ValentineShareDialog r0 = r4.f49862b     // Catch:{ Exception -> 0x014b }
            r0.show()     // Catch:{ Exception -> 0x014b }
            goto L_0x00dd
        L_0x00dc:
            return
        L_0x00dd:
            return
        L_0x00de:
            r7.f44506b = r9     // Catch:{ Exception -> 0x014b }
            java.lang.String r0 = "type"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ Exception -> 0x014b }
            com.ss.android.ugc.aweme.base.share.ShareInfo r1 = new com.ss.android.ugc.aweme.base.share.ShareInfo     // Catch:{ Exception -> 0x014b }
            r1.<init>()     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = "share_url"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ Exception -> 0x014b }
            r1.setShareUrl(r2)     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = "share_title"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ Exception -> 0x014b }
            r1.setShareTitle(r2)     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = "share_link_desc"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ Exception -> 0x014b }
            r1.setShareLinkDesc(r2)     // Catch:{ Exception -> 0x014b }
            java.lang.String r2 = "active_time"
            java.lang.String r2 = r8.optString(r2)     // Catch:{ Exception -> 0x014b }
            java.lang.String r3 = "edition_id"
            java.lang.String r3 = r8.optString(r3)     // Catch:{ Exception -> 0x014b }
            java.lang.ref.WeakReference r4 = r7.f3123e     // Catch:{ Exception -> 0x014b }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x014b }
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ Exception -> 0x014b }
            java.lang.String r5 = "rn"
            boolean r5 = android.text.TextUtils.equals(r5, r0)     // Catch:{ Exception -> 0x014b }
            if (r5 == 0) goto L_0x012a
            com.ss.android.ugc.aweme.fe.method.f r0 = new com.ss.android.ugc.aweme.fe.method.f     // Catch:{ Exception -> 0x014b }
            r0.<init>(r4, r1, r2, r3)     // Catch:{ Exception -> 0x014b }
            r7.g = r0     // Catch:{ Exception -> 0x014b }
            goto L_0x0139
        L_0x012a:
            java.lang.String r5 = "web"
            boolean r0 = android.text.TextUtils.equals(r5, r0)     // Catch:{ Exception -> 0x014b }
            if (r0 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.fe.method.d r0 = new com.ss.android.ugc.aweme.fe.method.d     // Catch:{ Exception -> 0x014b }
            r0.<init>(r4, r1, r2, r3)     // Catch:{ Exception -> 0x014b }
            r7.g = r0     // Catch:{ Exception -> 0x014b }
        L_0x0139:
            com.ss.android.ugc.aweme.fe.method.a r0 = r7.g     // Catch:{ Exception -> 0x014b }
            r0.f44523d = r7     // Catch:{ Exception -> 0x014b }
            com.ss.android.ugc.aweme.fe.method.a r0 = r7.g     // Catch:{ Exception -> 0x014b }
            r0.a()     // Catch:{ Exception -> 0x014b }
            return
        L_0x0143:
            com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a r0 = r7.f44506b     // Catch:{ Exception -> 0x014b }
            java.lang.String r1 = ""
            r0.a(r12, r1)     // Catch:{ Exception -> 0x014b }
            return
        L_0x014b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.ShareRankMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod$a):void");
    }
}
