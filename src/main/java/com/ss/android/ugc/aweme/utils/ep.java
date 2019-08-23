package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.services.IAVService;

public final class ep {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75839a;

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75839a, true, 88626, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75839a, true, 88626, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (context2 != null && (context2 instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) context2;
            if (!(mainActivity.getCurFragment() instanceof MainFragment) || !mainActivity.isFeedPage()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f75839a, true, 88627, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75839a, true, 88627, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (context2 == null) {
            return false;
        } else {
            if (context2 instanceof DetailActivity) {
                return ((DetailActivity) context2).c();
            }
            if (d(context) || c(context)) {
                return true;
            }
            return false;
        }
    }

    private static boolean c(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75839a, true, 88628, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().isVideoPublishPreviewActivity(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75839a, true, 88628, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    private static boolean d(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75839a, true, 88629, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((IAVService) ServiceManager.get().getService(IAVService.class)).recordActivityService().instanceOfVideoRecordActivity(context2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f75839a, true, 88629, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }
}
