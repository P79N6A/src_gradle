package com.ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2614a;

    /* renamed from: com.ss.android.ugc.aweme.app.a$a  reason: collision with other inner class name */
    static class C0021a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f2615a;

        /* renamed from: b  reason: collision with root package name */
        Handler f2616b;

        /* renamed from: c  reason: collision with root package name */
        Handler.Callback f2617c;

        public final boolean handleMessage(Message message) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{message}, this, f2615a, false, 22110, new Class[]{Message.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f2615a, false, 22110, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
            } else if (message == null) {
                if (this.f2617c != null) {
                    return this.f2617c.handleMessage(message);
                }
                return false;
            } else if (message.what == 131) {
                try {
                    if (this.f2617c != null) {
                        z = this.f2617c.handleMessage(message);
                    }
                    if (!z && this.f2616b != null) {
                        this.f2616b.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    if (th instanceof SecurityException) {
                        return true;
                    }
                    throw th;
                }
            } else if (this.f2617c != null) {
                return this.f2617c.handleMessage(message);
            } else {
                return false;
            }
        }

        public C0021a(Handler handler, Handler.Callback callback) {
            this.f2616b = handler;
            this.f2617c = callback;
        }
    }
}
