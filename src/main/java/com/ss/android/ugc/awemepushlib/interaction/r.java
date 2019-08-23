package com.ss.android.ugc.awemepushlib.interaction;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77043a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77044b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f77045c;

    r(Context context, Map map) {
        this.f77044b = context;
        this.f77045c = map;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77043a, false, 90260, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77043a, false, 90260, new Class[0], Void.TYPE);
            return;
        }
        MessageAppManager.inst().handleAppLogUpdate(this.f77044b, this.f77045c);
    }
}
