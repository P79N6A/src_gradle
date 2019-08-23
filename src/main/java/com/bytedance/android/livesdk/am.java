package com.bytedance.android.livesdk;

import android.util.SparseArray;
import com.bytedance.ies.sdk.widgets.Widget;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class am {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9018a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile am f9019c;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<Widget> f9020b = new SparseArray<>();

    private am() {
    }

    public static am a() {
        if (PatchProxy.isSupport(new Object[0], null, f9018a, true, 2754, new Class[0], am.class)) {
            return (am) PatchProxy.accessDispatch(new Object[0], null, f9018a, true, 2754, new Class[0], am.class);
        }
        if (f9019c == null) {
            synchronized (am.class) {
                if (f9019c == null) {
                    f9019c = new am();
                }
            }
        }
        return f9019c;
    }
}
