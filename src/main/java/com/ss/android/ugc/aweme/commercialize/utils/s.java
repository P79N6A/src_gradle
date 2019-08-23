package com.ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commerce.service.logs.ak;
import com.ss.android.ugc.aweme.commerce.service.logs.al;
import com.ss.android.ugc.aweme.commerce.service.logs.n;
import com.ss.android.ugc.aweme.commerce.service.models.x;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.g;
import java.util.Locale;
import org.json.JSONObject;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39824a;

    /* renamed from: b  reason: collision with root package name */
    private static Aweme f39825b;

    /* renamed from: c  reason: collision with root package name */
    private static Rect f39826c;

    public static Aweme a() {
        return f39825b;
    }

    public static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f39824a, true, 32435, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f39824a, true, 32435, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (!g.b().N().getDisableCard().booleanValue()) {
                return true;
            }
            return false;
        } catch (a unused) {
            return true;
        }
    }

    public static int b(@NonNull Aweme aweme) {
        int i;
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{aweme2}, null, f39824a, true, 32436, new Class[]{Aweme.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{aweme2}, null, f39824a, true, 32436, new Class[]{Aweme.class}, Integer.TYPE)).intValue();
        } else if (aweme.getPromotionOtherInfo() != null && aweme.getPromotionOtherInfo().getCardPredictDuration() > 0) {
            return aweme.getPromotionOtherInfo().getCardPredictDuration();
        } else {
            try {
                i = g.b().N().getCardShowDuration().intValue();
            } catch (a unused) {
                i = 0;
            }
            if (i == -2) {
                return i;
            }
            if (i == -1) {
                return (int) ad.a().a(aweme2);
            }
            if (i > 0) {
                return i;
            }
            return i == 0 ? 15000 : 15000;
        }
    }

    @NonNull
    public static Bundle a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f39824a, true, 32433, new Class[]{Aweme.class}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{aweme}, null, f39824a, true, 32433, new Class[]{Aweme.class}, Bundle.class);
        }
        Bundle bundle = new Bundle();
        if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isWithGoods() || aweme.getPromotion() == null) {
            return bundle;
        }
        String cardUrl = aweme.getPromotion().getCardUrl();
        if (TextUtils.isEmpty(cardUrl)) {
            return bundle;
        }
        bundle.putString(PushConstants.WEB_URL, cardUrl);
        bundle.putBoolean("hide_nav_bar", true);
        bundle.putBoolean("show_load_dialog", false);
        bundle.putBoolean("bundle_forbidden_jump", true);
        if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase(Locale.getDefault()))) {
            bundle.putBoolean("bundle_fix_webview", false);
        }
        f39825b = aweme;
        return bundle;
    }

    public static boolean a(@Nullable Activity activity, @Nullable View view) {
        Rect rect;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{activity, view2}, null, f39824a, true, 32434, new Class[]{Activity.class, View.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity, view2}, null, f39824a, true, 32434, new Class[]{Activity.class, View.class}, Boolean.TYPE)).booleanValue();
        } else if (activity == null || view2 == null) {
            return false;
        } else {
            if (f39826c == null) {
                rect = new Rect();
            } else {
                rect = f39826c;
            }
            f39826c = rect;
            activity.getWindow().getDecorView().getHitRect(f39826c);
            return view2.getLocalVisibleRect(f39826c);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0097, code lost:
        if (com.ss.android.ugc.aweme.setting.AbTestManager.a().X() == 0) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        if (com.ss.android.ugc.aweme.setting.AbTestManager.a().X() != 0) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        if (com.ss.android.ugc.aweme.setting.AbTestManager.a().X() == 2) goto L_0x00a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19) {
        /*
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            r10 = 1
            r2[r10] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = f39824a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = 0
            r5 = 1
            r6 = 32438(0x7eb6, float:4.5455E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x004e
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r9] = r18
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r11[r10] = r0
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = f39824a
            r14 = 1
            r15 = 32438(0x7eb6, float:4.5455E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004e:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 != 0) goto L_0x00b2
            if (r18 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r18.getStatus()
            if (r2 == 0) goto L_0x00b2
            com.ss.android.ugc.aweme.app.x r2 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r2 = r2.N()
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0071
            goto L_0x00b2
        L_0x0071:
            boolean r2 = com.ss.android.ugc.aweme.feed.k.b.b((com.ss.android.ugc.aweme.feed.model.Aweme) r18)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = r18.getStatus()
            boolean r3 = r3.isWithGoods()
            if (r3 == 0) goto L_0x0087
            com.ss.android.ugc.aweme.commerce.service.models.x r0 = r18.getPromotion()
            if (r0 == 0) goto L_0x0087
            r0 = 1
            goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r0 == 0) goto L_0x00b1
            switch(r19) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x009a;
                default: goto L_0x008d;
            }
        L_0x008d:
            if (r2 != 0) goto L_0x00a4
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.X()
            if (r0 == 0) goto L_0x00b1
            goto L_0x00a4
        L_0x009a:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.X()
            if (r0 == 0) goto L_0x00b1
        L_0x00a4:
            r9 = 1
            goto L_0x00b1
        L_0x00a6:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            int r0 = r0.X()
            if (r0 != r1) goto L_0x00b1
            goto L_0x00a4
        L_0x00b1:
            return r9
        L_0x00b2:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.utils.s.a(com.ss.android.ugc.aweme.feed.model.Aweme, int):boolean");
    }

    public static void a(Context context, Aweme aweme, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context, aweme, str2}, null, f39824a, true, 32440, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE)) {
            Object[] objArr = {context, aweme, str2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f39824a, true, 32440, new Class[]{Context.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.commercialize.log.g.y(context, aweme);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("group_id", aweme.getAid());
            if (b.b(aweme)) {
                r.a(context, "click_mine_product", str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, jSONObject);
                new n().a(str2).b(aweme.getAid()).a(false).b();
            } else {
                r.a(context, "click_cart", str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, jSONObject);
            }
            com.ss.android.ugc.aweme.commercialize.log.g.c(context, aweme);
            if (c.u(aweme)) {
                com.ss.android.ugc.aweme.commercialize.log.g.d(context, aweme);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(Aweme aweme, View view, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aweme, view, str2}, null, f39824a, true, 32439, new Class[]{Aweme.class, View.class, String.class}, Void.TYPE)) {
            Object[] objArr = {aweme, view, str2};
            PatchProxy.accessDispatch(objArr, null, f39824a, true, 32439, new Class[]{Aweme.class, View.class, String.class}, Void.TYPE);
        } else if (aweme != null) {
            x promotion = aweme.getPromotion();
            if (promotion != null && view.getVisibility() == 0) {
                if (!b.b(aweme)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (aweme.getAid() != null) {
                            jSONObject.put("group_id", aweme.getAid());
                        }
                        r.a(view.getContext(), "product_entrance_show", str, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_NOTIFY, jSONObject);
                    } catch (Exception unused) {
                    }
                }
                new ak().e(aweme.getAuthorUid()).a("video_cart_tag").b(promotion.getPromotionId()).a(Integer.valueOf(promotion.getPromotionSource())).d(str2).c(aweme.getAid()).b();
                new al().f(aweme.getAuthorUid()).b("video_cart_tag").c(promotion.getPromotionId()).a(Integer.valueOf(promotion.getPromotionSource())).g(str2).d(aweme.getAid()).e("video_play").h(null).a(str2).b();
            }
        }
    }
}
