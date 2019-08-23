package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.d.b;
import com.ss.android.ugc.aweme.d.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75495a;

    public static boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f75495a, true, 88074, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75495a, true, 88074, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (d.a() && AbTestManager.a().aj() == 30) {
            z = true;
        }
        return z;
    }

    public static void a(Context context, b bVar) {
        final Context context2 = context;
        final b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2}, null, f75495a, true, 88075, new Class[]{Context.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bVar2}, null, f75495a, true, 88075, new Class[]{Context.class, b.class}, Void.TYPE);
        } else if (!d.a()) {
            bVar2.a(false);
        } else {
            int aj = AbTestManager.a().aj();
            if (aj == 10) {
                bVar2.a(false);
            } else if (aj == 30) {
                d.a(context2, C0906R.string.mq, new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f75500a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f75500a, false, 88079, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f75500a, false, 88079, new Class[0], Void.TYPE);
                            return;
                        }
                        bVar2.a(true);
                    }
                });
            } else if (aj != 40) {
                switch (aj) {
                    case 20:
                        SharePrefCache.inst().setIsFirstPublishComment(false);
                        d.a(context2, C0906R.string.mq, new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f75496a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f75496a, false, 88077, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f75496a, false, 88077, new Class[0], Void.TYPE);
                                    return;
                                }
                                bVar2.a(false);
                            }
                        });
                        return;
                    case 21:
                        if (SharePrefCache.inst().getIsFirstPublishComment()) {
                            SharePrefCache.inst().setIsFirstPublishComment(false);
                            d.a(context2, C0906R.string.mq, new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f75498a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f75498a, false, 88078, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f75498a, false, 88078, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    bVar2.a(false);
                                }
                            });
                            return;
                        }
                        bVar2.a(false);
                        return;
                    default:
                        if (SharePrefCache.inst().getIsFirstPublishComment()) {
                            SharePrefCache.inst().setIsFirstPublishComment(false);
                            d.a(context2, C0906R.string.mq, new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f75504a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f75504a, false, 88081, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f75504a, false, 88081, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    bVar2.a(false);
                                }
                            });
                            return;
                        }
                        bVar2.a(false);
                        return;
                }
            } else {
                d.a(context2, C0906R.string.mq, new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f75502a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f75502a, false, 88080, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f75502a, false, 88080, new Class[0], Void.TYPE);
                            return;
                        }
                        Context context = context2;
                        if (PatchProxy.isSupport(new Object[]{context, "用户拒绝绑定"}, null, aj.f75495a, true, 88076, new Class[]{Context.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{context, "用户拒绝绑定"}, null, aj.f75495a, true, 88076, new Class[]{Context.class, String.class}, Void.TYPE);
                            return;
                        }
                        a.b(context, context.getString(C0906R.string.v7)).a();
                        User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                        if (curUser != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("user id = ");
                            sb.append(curUser.getUid());
                            sb.append(" first comment = ");
                            sb.append(SharePrefCache.inst().getIsFirstPublishComment());
                            sb.append(" failed reason = ");
                            sb.append("用户拒绝绑定");
                            sb.append(" bind phone = ");
                            sb.append(curUser.getBindPhone());
                            com.ss.android.ugc.aweme.framework.a.a.a("comment_failed", String.valueOf(sb));
                        }
                    }
                });
            }
        }
    }
}
