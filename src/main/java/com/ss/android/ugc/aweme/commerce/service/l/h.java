package com.ss.android.ugc.aweme.commerce.service.l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class h implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38018a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38019b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38020c;

    /* renamed from: d  reason: collision with root package name */
    private long f38021d;

    /* renamed from: e  reason: collision with root package name */
    private long f38022e;

    /* renamed from: f  reason: collision with root package name */
    private long f38023f;
    private Handler g = new WeakHandler(Looper.getMainLooper(), this);
    private Map<String, WeakReference<a>> h = new ConcurrentHashMap();

    public interface a {
        void a(long j);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38018a, false, 30006, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38018a, false, 30006, new Class[0], Void.TYPE);
            return;
        }
        this.f38020c = true;
        this.f38019b = false;
        if (this.g != null) {
            this.g.removeMessages(1);
        }
        if (this.h != null) {
            this.h.clear();
        }
    }

    public final h b() {
        if (PatchProxy.isSupport(new Object[0], this, f38018a, false, 30007, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f38018a, false, 30007, new Class[0], h.class);
        }
        this.f38020c = false;
        this.f38019b = true;
        if (this.f38021d <= 0) {
            this.f38019b = false;
            return this;
        }
        this.f38023f = SystemClock.elapsedRealtime();
        this.g.sendMessage(this.g.obtainMessage(1));
        return this;
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38018a, false, 30005, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f38018a, false, 30005, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.h == null) {
            return false;
        } else {
            this.h.remove(str);
            return true;
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f38018a, false, 30008, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f38018a, false, 30008, new Class[]{Message.class}, Void.TYPE);
        } else if (!this.f38020c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = (elapsedRealtime - this.f38023f) + this.f38021d;
            if (this.h != null && !this.h.isEmpty()) {
                for (WeakReference next : this.h.values()) {
                    if (next.get() != null) {
                        ((a) next.get()).a(j);
                    }
                }
            }
            long elapsedRealtime2 = this.f38022e - (SystemClock.elapsedRealtime() - elapsedRealtime);
            while (elapsedRealtime2 < 0) {
                elapsedRealtime2 += this.f38022e;
            }
            this.g.sendMessageDelayed(this.g.obtainMessage(1), elapsedRealtime2);
        }
    }

    public h(long j, long j2) {
        this.f38021d = j;
        this.f38022e = j2;
    }

    public final boolean a(String str, a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, aVar}, this, f38018a, false, 30004, new Class[]{String.class, a.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, aVar}, this, f38018a, false, 30004, new Class[]{String.class, a.class}, Boolean.TYPE)).booleanValue();
        } else if (this.h == null) {
            return false;
        } else {
            aVar.a((SystemClock.elapsedRealtime() - this.f38023f) + this.f38021d);
            this.h.put(str, new WeakReference(aVar));
            return true;
        }
    }
}
