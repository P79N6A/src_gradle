package com.ss.android.ugc.aweme.d;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41033a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f41034b;

    public static boolean a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f41033a, true, 25622, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f41033a, true, 25622, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.getAuthor() == null || !d.a().getCurUserId().equals(aweme.getAuthorUid()) || !d.a() || ((AbTestManager.a().ak() != 30 && AbTestManager.a().ak() != 40) || aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1)) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(Context context, b bVar) {
        Context context2 = context;
        final b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{context2, bVar2}, null, f41033a, true, 25621, new Class[]{Context.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, bVar2}, null, f41033a, true, 25621, new Class[]{Context.class, b.class}, Void.TYPE);
        } else if (!d.a()) {
            bVar2.a(false);
        } else {
            int ak = AbTestManager.a().ak();
            if (ak == 10) {
                bVar2.a(false);
            } else if (ak == 30) {
                d.b(context2, C0906R.string.mr, new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41039a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f41039a, false, 25625, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f41039a, false, 25625, new Class[0], Void.TYPE);
                            return;
                        }
                        bVar2.a(true);
                        a.f41034b = true;
                    }
                });
            } else if (ak != 40) {
                switch (ak) {
                    case 20:
                        SharePrefCache.inst().setIsFirstPublishAweme(false);
                        d.b(context2, C0906R.string.mr, new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f41035a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f41035a, false, 25623, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f41035a, false, 25623, new Class[0], Void.TYPE);
                                    return;
                                }
                                bVar2.a(false);
                            }
                        });
                        return;
                    case 21:
                        if (SharePrefCache.inst().getIsFirstPublishAweme()) {
                            SharePrefCache.inst().setIsFirstPublishAweme(false);
                            d.b(context2, C0906R.string.mr, new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f41037a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f41037a, false, 25624, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f41037a, false, 25624, new Class[0], Void.TYPE);
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
                        if (SharePrefCache.inst().getIsFirstPublishAweme()) {
                            SharePrefCache.inst().setIsFirstPublishAweme(false);
                            d.b(context2, C0906R.string.mr, new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f41043a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f41043a, false, 25627, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f41043a, false, 25627, new Class[0], Void.TYPE);
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
                d.b(context2, C0906R.string.mr, new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f41041a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f41041a, false, 25626, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f41041a, false, 25626, new Class[0], Void.TYPE);
                            return;
                        }
                        bVar2.a();
                    }
                });
            }
        }
    }
}
