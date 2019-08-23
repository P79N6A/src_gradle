package com.ss.android.ugc.aweme.web.jsbridge.b;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class i implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76762a;

    /* renamed from: b  reason: collision with root package name */
    private final d f76763b;

    i(d dVar) {
        this.f76763b = dVar;
    }

    public final boolean handleMessage(Message message) {
        Message message2 = message;
        if (!PatchProxy.isSupport(new Object[]{message2}, this, f76762a, false, 90087, new Class[]{Message.class}, Boolean.TYPE)) {
            return this.f76763b.a(message2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{message2}, this, f76762a, false, 90087, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
    }
}
