package com.ss.android.ugc.aweme.app.application.a;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp_api.model.l;
import com.ss.android.ugc.aweme.t;
import com.ss.android.ugc.aweme.utils.bg;

public final class a implements t {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33916a;

    public final void a(String str, @Nullable Bundle bundle) {
        String str2 = str;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{str2, bundle2}, this, f33916a, false, 23226, new Class[]{String.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bundle2}, this, f33916a, false, 23226, new Class[]{String.class, Bundle.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(str2, "weixin")) {
            bg.a(new l(bundle2.getInt("errorCode"), bundle2.getString("miniProgramExtMsg")));
        }
    }
}
