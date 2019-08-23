package com.ss.android.ugc.aweme.feed.g;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.video.o;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45347a;

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f45348e;

    /* renamed from: b  reason: collision with root package name */
    public o f45349b;

    /* renamed from: c  reason: collision with root package name */
    public String f45350c;

    /* renamed from: d  reason: collision with root package name */
    public long f45351d = -1;

    private d() {
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f45347a, true, 41310, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f45347a, true, 41310, new Class[0], d.class);
        }
        if (f45348e == null) {
            synchronized (d.class) {
                if (f45348e == null) {
                    f45348e = new d();
                }
            }
        }
        return f45348e;
    }
}
