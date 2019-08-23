package com.ss.android.ugc.aweme.im.sdk.j;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.d.a;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.d;
import com.ss.android.ugc.aweme.im.sdk.utils.g;
import com.ss.android.websocket.b.b;
import com.ss.android.websocket.b.b.f;
import org.greenrobot.eventbus.Subscribe;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3379a;

    /* renamed from: e  reason: collision with root package name */
    private static c f3380e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f3381f;

    /* renamed from: b  reason: collision with root package name */
    public Context f3382b;

    /* renamed from: c  reason: collision with root package name */
    public String f3383c;

    /* renamed from: d  reason: collision with root package name */
    public b.a f3384d = b.a.CLOSED;

    private c() {
    }

    /* access modifiers changed from: package-private */
    public String b() {
        if (PatchProxy.isSupport(new Object[0], this, f3379a, false, 54011, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f3379a, false, 54011, new Class[0], String.class);
        }
        String wsUrl = a.a().e().getWsUrl();
        if (TextUtils.isEmpty(wsUrl)) {
            wsUrl = g.f52585a;
        }
        return wsUrl;
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f3379a, true, 53998, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f3379a, true, 53998, new Class[0], c.class);
        }
        if (f3380e == null) {
            synchronized (c.class) {
                if (f3380e == null) {
                    f3380e = new c();
                }
            }
        }
        return f3380e;
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.a aVar) {
        com.ss.android.websocket.b.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3379a, false, 54009, new Class[]{com.ss.android.websocket.b.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3379a, false, 54009, new Class[]{com.ss.android.websocket.b.b.a.class}, Void.TYPE);
        } else if (TextUtils.equals(b(), aVar2.f78205c)) {
            this.f3384d = b.a.CLOSED;
        }
    }

    public static synchronized void a(Context context) {
        Context context2 = context;
        synchronized (c.class) {
            if (PatchProxy.isSupport(new Object[]{context2}, null, f3379a, true, 53999, new Class[]{Context.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2}, null, f3379a, true, 53999, new Class[]{Context.class}, Void.TYPE);
            } else if (!f3381f) {
                a().f3382b = context2;
                f3381f = true;
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.b bVar) {
        com.ss.android.websocket.b.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f3379a, false, 54010, new Class[]{com.ss.android.websocket.b.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f3379a, false, 54010, new Class[]{com.ss.android.websocket.b.b.b.class}, Void.TYPE);
        } else if (TextUtils.equals(b(), bVar2.f78206a)) {
            this.f3384d = b.a.CONNECTED;
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.c cVar) {
        com.ss.android.websocket.b.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3379a, false, 54007, new Class[]{com.ss.android.websocket.b.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3379a, false, 54007, new Class[]{com.ss.android.websocket.b.b.c.class}, Void.TYPE);
        } else if (TextUtils.equals(b(), cVar2.f78208a)) {
            Object obj = cVar2.f78208a;
            Object obj2 = cVar2.f78210c;
            int i = cVar2.f78211d;
            int i2 = cVar2.f78212e;
            Object obj3 = cVar2.f78209b;
            if (PatchProxy.isSupport(new Object[]{obj, obj2, Integer.valueOf(i), Integer.valueOf(i2), obj3}, this, f3379a, false, 54003, new Class[]{String.class, Object.class, Integer.TYPE, Integer.TYPE, byte[].class}, Void.TYPE)) {
                Object[] objArr = {obj, obj2, Integer.valueOf(i), Integer.valueOf(i2), obj3};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f3379a, false, 54003, new Class[]{String.class, Object.class, Integer.TYPE, Integer.TYPE, byte[].class}, Void.TYPE);
                return;
            }
            if (d.a() && i == 1 && i2 == 5) {
                a aVar = (a) obj2;
                com.bytedance.im.core.a.c.a().a(aVar.f51699f, aVar.h);
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.d dVar) {
        com.ss.android.websocket.b.b.d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2}, this, f3379a, false, 54005, new Class[]{com.ss.android.websocket.b.b.d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2}, this, f3379a, false, 54005, new Class[]{com.ss.android.websocket.b.b.d.class}, Void.TYPE);
        } else if (TextUtils.equals(b(), dVar2.f78213a)) {
        }
    }

    @Subscribe
    public void onEvent(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f3379a, false, 54006, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f3379a, false, 54006, new Class[]{f.class}, Void.TYPE);
        } else if (TextUtils.equals(b(), fVar2.f78215a)) {
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.websocket.b.b.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f3379a, false, 54008, new Class[]{com.ss.android.websocket.b.b.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f3379a, false, 54008, new Class[]{com.ss.android.websocket.b.b.g.class}, Void.TYPE);
        } else if (TextUtils.equals(b(), gVar.f78218a)) {
            this.f3384d = gVar.f78219b;
            if (this.f3384d == b.a.CONNECTED) {
                ad.c();
            }
        }
    }
}
