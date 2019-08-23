package com.ss.android.newmedia.logsdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.greenrobot.eventbus.c;

public final class b implements WeakHandler.IHandler, AppLog.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2516a;

    /* renamed from: b  reason: collision with root package name */
    public Set<C0020b> f2517b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public Set<a> f2518c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private Handler f2519d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: e  reason: collision with root package name */
    private String f2520e = AppLog.getServerDeviceId();

    public interface a {
        void j();
    }

    /* renamed from: com.ss.android.newmedia.logsdk.b$b  reason: collision with other inner class name */
    public interface C0020b {
        void a(String str);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2516a, false, 18645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2516a, false, 18645, new Class[0], Void.TYPE);
            return;
        }
        this.f2519d.sendEmptyMessage(0);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2516a, false, 18646, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2516a, false, 18646, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Iterator<a> it2 = this.f2518c.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f2516a, false, 18644, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f2516a, false, 18644, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 0) {
            for (a next : this.f2518c) {
                if (next != null) {
                    next.j();
                }
            }
            if (AppLog.getServerDeviceId() != null && !TextUtils.equals(this.f2520e, AppLog.getServerDeviceId())) {
                this.f2520e = AppLog.getServerDeviceId();
                for (C0020b next2 : this.f2517b) {
                    if (next2 != null) {
                        next2.a(this.f2520e);
                    }
                }
            }
            c.a().d(new com.ss.android.ugc.aweme.rocket.b());
        }
    }
}
