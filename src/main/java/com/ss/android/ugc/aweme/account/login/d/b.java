package com.ss.android.ugc.aweme.account.login.d;

import android.content.Context;
import android.os.Message;
import android.support.annotation.NonNull;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;

public abstract class b extends a {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f32204f;
    protected final com.ss.android.mobilelib.a.a g = com.ss.android.mobilelib.a.a.INSTANCE;

    public abstract void a(String str, String str2, i iVar);

    public abstract void b(String str, String str2, i iVar);

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32204f, false, 20321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32204f, false, 20321, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.g.setRetryTime(-1);
        this.g.setLastSendTime(0);
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f32204f, false, 20322, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f32204f, false, 20322, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        super.handleMsg(message);
    }

    public b(@NonNull Context context, com.ss.android.mobilelib.c.b bVar) {
        super(context, bVar);
    }
}
