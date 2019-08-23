package com.ss.android.ugc.aweme.thread;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4222a;

    /* renamed from: b  reason: collision with root package name */
    public static i f4223b = i.a().a();

    /* renamed from: c  reason: collision with root package name */
    public static c f4224c = new c() {
        public final void a(JSONObject jSONObject) {
        }

        public final boolean a() {
            return false;
        }

        public final void b(JSONObject jSONObject) {
        }

        public final boolean b() {
            return false;
        }

        public final void c(JSONObject jSONObject) {
        }

        public final boolean c() {
            return false;
        }

        public final void d(JSONObject jSONObject) {
        }

        public final boolean d() {
            return false;
        }

        public final void e(JSONObject jSONObject) {
        }

        public final boolean e() {
            return false;
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private static volatile ExecutorService f4225d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile ExecutorService f4226e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile ExecutorService f4227f;
    private static volatile ScheduledExecutorService g;
    private static volatile ExecutorService h;

    public static i a() {
        return f4223b;
    }

    public static c b() {
        return f4224c;
    }

    public static ExecutorService c() {
        if (PatchProxy.isSupport(new Object[0], null, f4222a, true, 86891, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, f4222a, true, 86891, new Class[0], ExecutorService.class);
        }
        if (f4225d == null) {
            synchronized (h.class) {
                if (f4225d == null) {
                    f4225d = n.a().a(m.a(p.IO).a(), true);
                }
            }
        }
        return f4225d;
    }

    public static ExecutorService d() {
        if (PatchProxy.isSupport(new Object[0], null, f4222a, true, 86892, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, f4222a, true, 86892, new Class[0], ExecutorService.class);
        }
        if (f4226e == null) {
            synchronized (h.class) {
                if (f4226e == null) {
                    f4226e = n.a().a(m.a(p.DEFAULT).a(), true);
                }
            }
        }
        return f4226e;
    }

    public static ExecutorService e() {
        if (PatchProxy.isSupport(new Object[0], null, f4222a, true, 86893, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, f4222a, true, 86893, new Class[0], ExecutorService.class);
        }
        if (f4227f == null) {
            synchronized (h.class) {
                if (f4227f == null) {
                    f4227f = n.a().a(m.a(p.BACKGROUND).a(), true);
                }
            }
        }
        return f4227f;
    }

    public static ScheduledExecutorService f() {
        if (PatchProxy.isSupport(new Object[0], null, f4222a, true, 86894, new Class[0], ScheduledExecutorService.class)) {
            return (ScheduledExecutorService) PatchProxy.accessDispatch(new Object[0], null, f4222a, true, 86894, new Class[0], ScheduledExecutorService.class);
        }
        if (g == null) {
            synchronized (h.class) {
                if (g == null) {
                    g = (ScheduledExecutorService) n.a().a(m.a(p.SCHEDULED).a(1).a(), true);
                }
            }
        }
        return g;
    }

    public static ExecutorService g() {
        if (PatchProxy.isSupport(new Object[0], null, f4222a, true, 86895, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, f4222a, true, 86895, new Class[0], ExecutorService.class);
        }
        if (h == null) {
            synchronized (h.class) {
                if (h == null) {
                    h = n.a().a(m.a(p.SERIAL).a(), true);
                }
            }
        }
        return h;
    }

    public static ExecutorService a(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, null, f4222a, true, 86896, new Class[]{m.class}, ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[]{mVar2}, null, f4222a, true, 86896, new Class[]{m.class}, ExecutorService.class);
        } else if (mVar2.f4246b != p.IO && mVar2.f4246b != p.DEFAULT && mVar2.f4246b != p.BACKGROUND) {
            return n.a().a(mVar2, false);
        } else {
            throw new IllegalArgumentException();
        }
    }

    static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4222a, true, 86889, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f4222a, true, 86889, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            for (String contains : f4223b.f4231d) {
                if (str2.contains(contains)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean a(ExecutorService executorService) {
        ExecutorService executorService2 = executorService;
        if (PatchProxy.isSupport(new Object[]{executorService2}, null, f4222a, true, 86890, new Class[]{ExecutorService.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{executorService2}, null, f4222a, true, 86890, new Class[]{ExecutorService.class}, Boolean.TYPE)).booleanValue();
        } else if (executorService2 == c() || executorService2 == d() || executorService2 == e() || executorService2 == f() || executorService2 == g()) {
            return true;
        } else {
            return false;
        }
    }
}
