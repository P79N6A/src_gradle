package com.ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.client.MessageAppManager;
import java.util.Map;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f77073a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f77074b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f77075c;

    public c(Context context, Map map) {
        this.f77074b = context;
        this.f77075c = map;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f77073a, false, 90298, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f77073a, false, 90298, new Class[0], Void.TYPE);
            return;
        }
        MessageAppManager.inst().handleAppLogUpdate(this.f77074b, this.f77075c);
    }
}
