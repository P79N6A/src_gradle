package com.ss.android.ugc.aweme.sp;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.GuardedBy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.LinkedList;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4061a = null;

    /* renamed from: b  reason: collision with root package name */
    static final Object f4062b = new Object();

    /* renamed from: c  reason: collision with root package name */
    static Object f4063c = new Object();
    @GuardedBy("sLock")

    /* renamed from: d  reason: collision with root package name */
    static final LinkedList<Runnable> f4064d = new LinkedList<>();
    @GuardedBy("sLock")

    /* renamed from: e  reason: collision with root package name */
    static final LinkedList<Runnable> f4065e = new LinkedList<>();
    @GuardedBy("sLock")

    /* renamed from: f  reason: collision with root package name */
    static boolean f4066f = true;
    private static final String g = "d";
    @GuardedBy("sLock")
    private static Handler h = null;
    @GuardedBy("sLock")
    private static final b i = new b(16);
    private static int j = 0;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4067a;

        a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            LinkedList linkedList;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f4067a, false, 81721, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f4067a, false, 81721, new Class[]{Message.class}, Void.TYPE);
            } else if (message2.what != 1) {
            } else {
                if (PatchProxy.isSupport(new Object[0], null, d.f4061a, true, 81719, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, d.f4061a, true, 81719, new Class[0], Void.TYPE);
                    return;
                }
                synchronized (d.f4063c) {
                    synchronized (d.f4062b) {
                        linkedList = (LinkedList) d.f4065e.clone();
                        d.f4065e.clear();
                        d.a().removeMessages(1);
                    }
                    if (linkedList.size() > 0) {
                        Iterator it2 = linkedList.iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                    }
                }
            }
        }
    }

    public static boolean b() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], null, f4061a, true, 81718, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f4061a, true, 81718, new Class[0], Boolean.TYPE)).booleanValue();
        }
        synchronized (f4062b) {
            z = !f4065e.isEmpty();
        }
        return z;
    }

    static Handler a() {
        Handler handler;
        if (PatchProxy.isSupport(new Object[0], null, f4061a, true, 81712, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], null, f4061a, true, 81712, new Class[0], Handler.class);
        }
        synchronized (f4062b) {
            if (h == null) {
                HandlerThread handlerThread = new HandlerThread("queued-work-looper", -2);
                handlerThread.start();
                h = new a(handlerThread.getLooper());
            }
            handler = h;
        }
        return handler;
    }
}
