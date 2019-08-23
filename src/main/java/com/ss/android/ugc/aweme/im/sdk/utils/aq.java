package com.ss.android.ugc.aweme.im.sdk.utils;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ExecutorService;

public abstract class aq<T> implements WeakHandler.IHandler, Runnable {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f52486b;

    /* renamed from: a  reason: collision with root package name */
    private p<T> f52487a;

    /* renamed from: c  reason: collision with root package name */
    public q<T> f52488c;

    /* renamed from: d  reason: collision with root package name */
    private T f52489d;

    /* renamed from: e  reason: collision with root package name */
    private WeakHandler f52490e = new WeakHandler(Looper.getMainLooper(), this);

    public abstract ExecutorService a();

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f52486b, false, 53691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52486b, false, 53691, new Class[0], Void.TYPE);
            return;
        }
        a().submit(this);
    }

    public void run() {
        if (PatchProxy.isSupport(new Object[0], this, f52486b, false, 53690, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52486b, false, 53690, new Class[0], Void.TYPE);
            return;
        }
        T t = null;
        if (this.f52488c != null) {
            t = this.f52488c.a();
        }
        this.f52489d = t;
        if (this.f52490e != null) {
            Message obtain = Message.obtain();
            obtain.what = 100001;
            obtain.obj = this;
            this.f52490e.sendMessage(obtain);
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f52486b, false, 53692, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f52486b, false, 53692, new Class[]{Message.class}, Void.TYPE);
        } else if (message2.obj instanceof aq) {
            aq aqVar = (aq) message2.obj;
            if (message2.what == 100001 && aqVar.f52487a != null) {
                aqVar.f52487a.a(aqVar.f52489d);
            }
        }
    }

    public aq(q<T> qVar, p<T> pVar) {
        this.f52488c = qVar;
        this.f52487a = pVar;
    }
}
