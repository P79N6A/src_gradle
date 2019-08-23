package com.bytedance.android.livesdk.utils;

import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import com.bytedance.android.live.core.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17642a;

    public static void a(Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, null, f17642a, true, 13694, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment}, null, f17642a, true, 13694, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && g.a(activity)) {
            Window window = activity.getWindow();
            if (window != null && Build.VERSION.SDK_INT >= 21) {
                if (Build.VERSION.SDK_INT > 20) {
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(-16777216);
                }
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
    }
}
