package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.smartphone.a.f;
import com.ss.android.ad.smartphone.b;
import com.ss.android.ad.smartphone.c;
import com.ss.android.ad.smartphone.d;
import com.ss.android.ugc.aweme.app.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.ss.android.ugc.aweme.web.k;

public final class af {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39679a;

    /* renamed from: c  reason: collision with root package name */
    private static final String f39680c = k.f76858d;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ad.smartphone.a.a f39681b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static af f39690a = new af((byte) 0);
    }

    public static af a() {
        return a.f39690a;
    }

    private af() {
        if (PatchProxy.isSupport(new Object[0], this, f39679a, false, 32559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39679a, false, 32559, new Class[0], Void.TYPE);
            return;
        }
        i a2 = i.a();
        c.f22739f = a2.getContext();
        com.ss.android.ad.smartphone.b.a aVar = d.a().f22758d;
        c.f22736c = new ag(a2);
        aVar.a((com.ss.android.ad.smartphone.a.c) new ah(a2)).a(ai.f39696b).a(f39680c).a(2000);
        c.f22734a = new f() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39682a;

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: java.lang.Object[]} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(@android.support.annotation.Nullable android.app.Activity r22, @android.support.annotation.NonNull java.lang.String[] r23, com.ss.android.ad.smartphone.a.a r24) {
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
                    com.meituan.robust.ChangeQuickRedirect r6 = f39682a
                    java.lang.Class[] r9 = new java.lang.Class[r3]
                    java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
                    r9[r11] = r5
                    java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
                    r9[r12] = r5
                    java.lang.Class<com.ss.android.ad.smartphone.a.a> r5 = com.ss.android.ad.smartphone.a.a.class
                    r9[r13] = r5
                    java.lang.Class r10 = java.lang.Void.TYPE
                    r7 = 0
                    r8 = 32566(0x7f36, float:4.5635E-41)
                    r5 = r21
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                    if (r4 == 0) goto L_0x0055
                    java.lang.Object[] r14 = new java.lang.Object[r3]
                    r14[r11] = r0
                    r14[r12] = r1
                    r14[r13] = r2
                    com.meituan.robust.ChangeQuickRedirect r16 = f39682a
                    r17 = 0
                    r18 = 32566(0x7f36, float:4.5635E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r3]
                    java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                    r0[r11] = r1
                    java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                    r0[r12] = r1
                    java.lang.Class<com.ss.android.ad.smartphone.a.a> r1 = com.ss.android.ad.smartphone.a.a.class
                    r0[r13] = r1
                    java.lang.Class r20 = java.lang.Void.TYPE
                    r15 = r21
                    r19 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                    return
                L_0x0055:
                    if (r0 != 0) goto L_0x0058
                    return
                L_0x0058:
                    r3 = r1[r11]
                    java.lang.Object[] r4 = new java.lang.Object[r13]
                    r4[r11] = r0
                    r4[r12] = r3
                    com.meituan.robust.ChangeQuickRedirect r6 = f39682a
                    r7 = 0
                    r8 = 32567(0x7f37, float:4.5636E-41)
                    java.lang.Class[] r9 = new java.lang.Class[r13]
                    java.lang.Class<android.content.Context> r5 = android.content.Context.class
                    r9[r11] = r5
                    java.lang.Class<java.lang.String> r5 = java.lang.String.class
                    r9[r12] = r5
                    java.lang.Class r10 = java.lang.Boolean.TYPE
                    r5 = r21
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                    if (r4 == 0) goto L_0x00a0
                    java.lang.Object[] r14 = new java.lang.Object[r13]
                    r14[r11] = r0
                    r14[r12] = r3
                    com.meituan.robust.ChangeQuickRedirect r16 = f39682a
                    r17 = 0
                    r18 = 32567(0x7f37, float:4.5636E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r13]
                    java.lang.Class<android.content.Context> r4 = android.content.Context.class
                    r3[r11] = r4
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r3[r12] = r4
                    java.lang.Class r20 = java.lang.Boolean.TYPE
                    r15 = r21
                    r19 = r3
                    java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r11 = r3.booleanValue()
                    goto L_0x00a9
                L_0x00a0:
                    if (r0 == 0) goto L_0x00a9
                    int r3 = android.support.v4.content.ContextCompat.checkSelfPermission(r0, r3)
                    if (r3 != 0) goto L_0x00a9
                    r11 = 1
                L_0x00a9:
                    if (r11 == 0) goto L_0x00af
                    r24.a()
                    return
                L_0x00af:
                    r3 = r21
                    com.ss.android.ugc.aweme.commercialize.utils.af r4 = com.ss.android.ugc.aweme.commercialize.utils.af.this
                    r4.f39681b = r2
                    r2 = 101(0x65, float:1.42E-43)
                    android.support.v4.app.ActivityCompat.requestPermissions(r0, r1, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.af.AnonymousClass1.a(android.app.Activity, java.lang.String[], com.ss.android.ad.smartphone.a.a):void");
            }
        };
    }

    /* synthetic */ af(byte b2) {
        this();
    }

    public final void a(@NonNull Activity activity, Aweme aweme, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, aweme, str2}, this, f39679a, false, 32560, new Class[]{Activity.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, aweme, str2}, this, f39679a, false, 32560, new Class[]{Activity.class, Aweme.class, String.class}, Void.TYPE);
        } else if (aweme == null || !aweme.isAd()) {
        } else {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            b a2 = new b.a().a(String.valueOf(awemeRawAd.getAdId())).b(String.valueOf(awemeRawAd.getCreativeId())).c(awemeRawAd.getLogExtra()).f(awemeRawAd.getPhoneNumber()).a(awemeRawAd.getInstancePhoneId()).d(awemeRawAd.getPhoneKey()).a(1).e(str2).a();
            final DmtLoadingDialog dmtLoadingDialog = new DmtLoadingDialog(activity2);
            dmtLoadingDialog.show();
            d.a().a(activity2, a2, new com.ss.android.ad.smartphone.b.d() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39684a;

                public final void a(com.ss.android.ad.smartphone.b.b bVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f39684a, false, 32568, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f39684a, false, 32568, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE);
                        return;
                    }
                    dmtLoadingDialog.dismiss();
                }

                public final void b(com.ss.android.ad.smartphone.b.b bVar) {
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f39684a, false, 32569, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f39684a, false, 32569, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE);
                        return;
                    }
                    dmtLoadingDialog.dismiss();
                }
            });
        }
    }

    public final void a(@NonNull Activity activity, String str, String str2, String str3, String str4) {
        Activity activity2 = activity;
        String str5 = str;
        String str6 = str3;
        String str7 = str4;
        if (PatchProxy.isSupport(new Object[]{activity2, str5, str2, str6, str7}, this, f39679a, false, 32561, new Class[]{Activity.class, String.class, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {activity2, str5, str2, str6, str7};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f39679a, false, 32561, new Class[]{Activity.class, String.class, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        long j = 0;
        try {
            j = Long.valueOf(str2).longValue();
        } catch (Exception unused) {
        }
        b a2 = new b.a().f(str5).a(j).d(str6).e(str7).a();
        final DmtLoadingDialog dmtLoadingDialog = new DmtLoadingDialog(activity2);
        dmtLoadingDialog.show();
        d.a().a(activity2, a2, new com.ss.android.ad.smartphone.b.d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f39687a;

            public final void a(com.ss.android.ad.smartphone.b.b bVar) {
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f39687a, false, 32570, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f39687a, false, 32570, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE);
                    return;
                }
                dmtLoadingDialog.dismiss();
            }

            public final void b(com.ss.android.ad.smartphone.b.b bVar) {
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f39687a, false, 32571, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f39687a, false, 32571, new Class[]{com.ss.android.ad.smartphone.b.b.class}, Void.TYPE);
                    return;
                }
                dmtLoadingDialog.dismiss();
            }
        });
    }
}
