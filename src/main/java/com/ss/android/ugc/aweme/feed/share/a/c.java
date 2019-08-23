package com.ss.android.ugc.aweme.feed.share.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import org.jetbrains.annotations.Contract;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45858a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f45858a, true, 42387, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f45858a, true, 42387, new Class[0], String.class);
        }
        an<String> downloadForbiddenToast = SharePrefCache.inst().getDownloadForbiddenToast();
        if (downloadForbiddenToast == null) {
            return null;
        }
        return (String) downloadForbiddenToast.c();
    }

    private static boolean f(@NonNull Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42380, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return aweme.isReviewed();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42380, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    @UiThread
    @Contract
    public static boolean b(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42385, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42385, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!x.a().V() || aweme == null || f(aweme) || a(aweme)) {
            return true;
        } else {
            return false;
        }
    }

    @UiThread
    @Contract
    public static boolean c(@Nullable Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42386, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42386, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getDownloadStatus() == 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean d(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42390, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42390, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee() || !((Boolean) x.a().E().c()).booleanValue()) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean g(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42382, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42382, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.getVideo() == null || !aweme.getVideo().isHasWaterMark()) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean h(@NonNull Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42383, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42383, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme.getVideo() == null || !aweme.getVideo().hasEndWaterMark() || !AbTestManager.a().bb()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean a(@NonNull Aweme aweme) {
        if (!PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42381, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return TextUtils.equals(d.a().getCurUserId(), aweme.getAuthorUid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42381, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
    }

    public static boolean e(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, null, f45858a, true, 42391, new Class[]{Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, null, f45858a, true, 42391, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        }
        Integer num = (Integer) x.a().U().c();
        if (num == null || num.intValue() != 2) {
            return false;
        }
        User currentUser = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser();
        if (aweme == null || currentUser == null || !TextUtils.equals(aweme.getRegion(), currentUser.getRegion()) || f(aweme) || a(aweme)) {
            return false;
        }
        return true;
    }

    @UiThread
    public static boolean a(@NonNull Context context, @Nullable Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f45858a, true, 42384, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f45858a, true, 42384, new Class[]{Context.class, Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (!b(aweme)) {
            String a2 = a();
            if (TextUtils.isEmpty(a2)) {
                a2 = context2.getString(C0906R.string.a7m);
            }
            a.b(context2, a2, 1).a();
            return false;
        } else if (c(aweme)) {
            return true;
        } else {
            a.b(context2, context2.getString(C0906R.string.ah8)).a();
            return false;
        }
    }

    public static boolean a(@Nullable Aweme aweme, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{aweme, (byte) 0}, null, f45858a, true, 42389, new Class[]{Aweme.class, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme, (byte) 0}, null, f45858a, true, 42389, new Class[]{Aweme.class, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (aweme == null || d(aweme) || e(aweme)) {
            return false;
        } else {
            if (g(aweme) || h(aweme)) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean f2 = f(aweme);
            if (a(aweme)) {
                if (!f2 && AbTestManager.a().D()) {
                    return false;
                }
                return true;
            } else if (!aweme.isImage() && z2) {
                return false;
            } else {
                return true;
            }
        }
    }
}
