package com.ss.android.ugc.aweme.account.util;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33095a;

    public static void a(Activity activity, boolean z, boolean z2) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, Byte.valueOf(z ? (byte) 1 : 0), (byte) 1}, null, f33095a, true, 21323, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Byte.valueOf(z), (byte) 1}, null, f33095a, true, 21323, new Class[]{Activity.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (!activity.isFinishing()) {
            Intent intent = null;
            if (activity.isTaskRoot()) {
                intent = ToolUtils.getLaunchIntentForPackage(activity2, activity.getPackageName());
            }
            activity.finish();
            if (intent != null) {
                activity2.startActivity(intent);
                return;
            }
            if (z) {
                activity2.overridePendingTransition(C0906R.anim.cx, C0906R.anim.da);
            }
        }
    }
}
