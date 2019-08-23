package com.bytedance.android.livesdk.s;

import android.view.KeyEvent;
import com.bytedance.android.livesdkapi.depend.d.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17102a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f17103b;

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f17102a, true, 12856, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f17102a, true, 12856, new Class[0], c.class);
        }
        if (f17103b == null) {
            synchronized (a.class) {
                if (f17103b == null) {
                    f17103b = new a();
                }
            }
        }
        return f17103b;
    }

    public final boolean a(int i, int i2, KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        if (PatchProxy.isSupport(new Object[]{0, Integer.valueOf(i2), keyEvent2}, this, f17102a, false, 12857, new Class[]{Integer.TYPE, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{0, Integer.valueOf(i2), keyEvent2}, this, f17102a, false, 12857, new Class[]{Integer.TYPE, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdk.g.a(0, i2, keyEvent2));
        return com.bytedance.android.live.uikit.a.a.a();
    }
}
