package com.ss.android.ugc.aweme.account.util;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public final class q implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33109a;

    /* renamed from: b  reason: collision with root package name */
    public long f33110b;

    /* renamed from: c  reason: collision with root package name */
    public a f33111c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHandler f33112d;

    public interface a {
        void a(long j);
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f33109a, false, 21421, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f33109a, false, 21421, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        this.f33110b--;
        if (this.f33110b <= 0) {
            this.f33110b = 0;
        } else {
            this.f33112d.sendEmptyMessageDelayed(BaseLoginOrRegisterActivity.o, 1000);
        }
        if (this.f33111c != null) {
            this.f33111c.a(this.f33110b);
        }
    }
}
