package com.ss.android.ugc.aweme.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.model.AwemeSettings;
import java.util.List;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44945a;

    /* renamed from: c  reason: collision with root package name */
    private static h f44946c;

    /* renamed from: b  reason: collision with root package name */
    public List<AwemeSettings.DeviceInfo> f44947b;

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f44945a, true, 40535, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f44945a, true, 40535, new Class[0], h.class);
        }
        if (f44946c == null) {
            synchronized (h.class) {
                if (f44946c == null) {
                    f44946c = new h();
                }
            }
        }
        return f44946c;
    }
}
