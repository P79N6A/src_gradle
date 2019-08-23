package com.ss.android.ugc.aweme.im.sdk.chat.input.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50353a;

    /* renamed from: c  reason: collision with root package name */
    private static b f50354c;

    /* renamed from: b  reason: collision with root package name */
    public h f50355b;

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f50353a, true, 50662, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f50353a, true, 50662, new Class[0], b.class);
        }
        if (f50354c == null) {
            synchronized (b.class) {
                if (f50354c == null) {
                    f50354c = new b();
                }
            }
        }
        return f50354c;
    }
}
