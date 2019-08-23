package com.ss.android.ugc.aweme.utils.a;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75474a;

    static class a implements Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75475a;

        /* renamed from: b  reason: collision with root package name */
        Handler f75476b;

        /* renamed from: c  reason: collision with root package name */
        Handler.Callback f75477c;

        /* renamed from: d  reason: collision with root package name */
        List<Handler.Callback> f75478d = new ArrayList();

        public final boolean handleMessage(Message message) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{message}, this, f75475a, false, 88729, new Class[]{Message.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f75475a, false, 88729, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
            } else if (message == null) {
                if (this.f75477c != null) {
                    return this.f75477c.handleMessage(message);
                }
                return false;
            } else if (message.what == 131 && Build.VERSION.SDK_INT == 19 && !StringUtils.isEmpty(Build.MODEL) && Build.MODEL.toLowerCase().trim().startsWith("vivo")) {
                try {
                    if (this.f75477c != null) {
                        z = this.f75477c.handleMessage(message);
                    }
                    if (!z && this.f75476b != null) {
                        this.f75476b.handleMessage(message);
                    }
                    return true;
                } catch (Throwable th) {
                    if (th instanceof SecurityException) {
                        return true;
                    }
                    throw th;
                }
            } else {
                for (Handler.Callback handleMessage : this.f75478d) {
                    if (handleMessage.handleMessage(message)) {
                        return true;
                    }
                }
                if (this.f75477c != null) {
                    return this.f75477c.handleMessage(message);
                }
                return false;
            }
        }

        a(Handler handler, Handler.Callback callback) {
            this.f75476b = handler;
            this.f75477c = callback;
        }
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f75474a, true, 88727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75474a, true, 88727, new Class[0], Void.TYPE);
            return;
        }
        try {
            Reflect call = Reflect.on(Class.forName("android.app.ActivityThread")).call("currentActivityThread");
            if (call != null) {
                Handler handler = (Handler) call.field("mH", Class.forName("android.app.ActivityThread$H")).get();
                if (handler != null) {
                    Reflect on = Reflect.on((Object) handler);
                    a aVar = new a(handler, (Handler.Callback) on.field("mCallback", Handler.Callback.class).get());
                    a aVar2 = new a();
                    if (PatchProxy.isSupport(new Object[]{aVar2}, aVar, a.f75475a, false, 88728, new Class[]{Handler.Callback.class}, Void.TYPE)) {
                        a aVar3 = aVar;
                        PatchProxy.accessDispatch(new Object[]{aVar2}, aVar3, a.f75475a, false, 88728, new Class[]{Handler.Callback.class}, Void.TYPE);
                    } else {
                        aVar.f75478d.add(aVar2);
                    }
                    on.set("mCallback", aVar);
                }
            }
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
    }
}
