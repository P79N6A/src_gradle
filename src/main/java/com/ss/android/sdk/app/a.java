package com.ss.android.sdk.app;

import com.bytedance.dataplatform.d;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.z;

public final /* synthetic */ class a implements d {

    /* renamed from: a  reason: collision with root package name */
    static final d f30669a = new a();

    private a() {
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, z.f28227a, true, 15646, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, null, z.f28227a, true, 15646, new Class[]{String.class}, Void.TYPE);
            return;
        }
        AppLog.setAbSDKVersion(str);
    }
}
