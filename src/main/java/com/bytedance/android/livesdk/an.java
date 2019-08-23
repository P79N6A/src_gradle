package com.bytedance.android.livesdk;

import android.support.annotation.NonNull;
import com.bytedance.ies.sdk.widgets.IRecyclableWidget;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class an implements IWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9021a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile an f9022b;

    /* renamed from: c  reason: collision with root package name */
    private Map<Class, IRecyclableWidget> f9023c = new HashMap();

    public static an a() {
        if (PatchProxy.isSupport(new Object[0], null, f9021a, true, 2758, new Class[0], an.class)) {
            return (an) PatchProxy.accessDispatch(new Object[0], null, f9021a, true, 2758, new Class[0], an.class);
        }
        if (f9022b == null) {
            synchronized (an.class) {
                if (f9022b == null) {
                    f9022b = new an();
                }
            }
        }
        return f9022b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9021a, false, 2760, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9021a, false, 2760, new Class[0], Void.TYPE);
            return;
        }
        for (Map.Entry<Class, IRecyclableWidget> value : this.f9023c.entrySet()) {
            ((IRecyclableWidget) value.getValue()).setClearAfterDestroyed();
        }
        this.f9023c.clear();
    }

    @NonNull
    public <T extends IRecyclableWidget> T provide(Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f9021a, false, 2759, new Class[]{Class.class}, IRecyclableWidget.class)) {
            return (IRecyclableWidget) PatchProxy.accessDispatch(new Object[]{cls}, this, f9021a, false, 2759, new Class[]{Class.class}, IRecyclableWidget.class);
        }
        T t = (IRecyclableWidget) this.f9023c.get(cls);
        if (t != null && t.isAlive()) {
            t.setClearAfterDestroyed();
            t = null;
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (IRecyclableWidget) cls.newInstance();
            this.f9023c.put(cls, t2);
            return t2;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        }
    }
}
