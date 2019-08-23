package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77070a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77071b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f77072c;

    b(Context context, Map map) {
        this.f77071b = context;
        this.f77072c = map;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77070a, false, 90297, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77070a, false, 90297, new Class[0], Void.TYPE);
            return;
        }
        MessageAppManager.inst().handleAppLogUpdate(this.f77071b, this.f77072c);
    }
}
