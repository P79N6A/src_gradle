package com.ss.android.ugc.aweme.im.sdk.chat;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import java.lang.ref.WeakReference;

public final class n extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50704a;

    /* renamed from: b  reason: collision with root package name */
    WeakReference<a> f50705b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f50706c;

    public interface a {
        void a(Object obj, int i);

        void b();

        void c();
    }

    public n(a aVar) {
        this.f50705b = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f50704a, false, 50485, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f50704a, false, 50485, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        super.handleMessage(message);
        a aVar = (a) this.f50705b.get();
        if (!(aVar == null || message == null)) {
            Object obj = message.obj;
            switch (message.what) {
                case 1:
                    aVar.c();
                    if (this.f50706c != 0) {
                        this.f50706c = 0;
                        removeMessages(1);
                        return;
                    }
                    break;
                case 2:
                    if (this.f50706c == 0) {
                        sendEmptyMessageDelayed(1, 300);
                    }
                    this.f50706c++;
                    return;
                case 3:
                    aVar.b();
                    return;
                case 4:
                    if (obj != null) {
                        aVar.a(obj, 0);
                        return;
                    }
                    break;
                case 5:
                    if (obj != null) {
                        aVar.a(obj, 1);
                        return;
                    }
                    break;
                case 6:
                    if (obj != null) {
                        aVar.a(obj, 2);
                        return;
                    }
                    break;
                case e.l:
                    if (obj != null) {
                        aVar.a(obj, 3);
                        break;
                    }
                    break;
            }
        }
    }
}
