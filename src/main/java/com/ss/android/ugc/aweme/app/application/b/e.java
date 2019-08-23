package com.ss.android.ugc.aweme.app.application.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.newmedia.logsdk.b;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;

public final class e implements b.C0020b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2642a;

    @MeasureFunction
    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2642a, false, 23242, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2642a, false, 23242, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            a.b(new f(str2));
        }
    }
}
