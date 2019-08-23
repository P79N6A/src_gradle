package com.bytedance.android.livesdk.v;

import com.bytedance.android.livesdk.gift.panel.widget.DouyinGiftPanelBottomWidget;
import com.bytedance.android.livesdk.gift.panel.widget.FakeDouyinGiftPanelBottomWidget;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17657a;

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<Class, Widget> f17658b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f17659c;

    private b() {
        if (PatchProxy.isSupport(new Object[0], this, f17657a, false, 13193, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17657a, false, 13193, new Class[0], Void.TYPE);
            return;
        }
        f17658b.put(FakeDouyinGiftPanelBottomWidget.class, new DouyinGiftPanelBottomWidget());
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f17657a, true, 13192, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f17657a, true, 13192, new Class[0], b.class);
        }
        if (f17659c == null) {
            synchronized (b.class) {
                if (f17659c == null) {
                    f17659c = new b();
                }
            }
        }
        return f17659c;
    }

    public final Widget a(Class cls) {
        Class cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f17657a, false, 13194, new Class[]{Class.class}, Widget.class)) {
            return f17658b.get(cls2);
        }
        return (Widget) PatchProxy.accessDispatch(new Object[]{cls2}, this, f17657a, false, 13194, new Class[]{Class.class}, Widget.class);
    }
}
