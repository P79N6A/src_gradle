package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class t implements bc {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74935a;

    /* renamed from: b  reason: collision with root package name */
    public float f74936b;

    /* renamed from: c  reason: collision with root package name */
    public float f74937c;

    /* renamed from: d  reason: collision with root package name */
    public int f74938d;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74935a, false, 86960, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74935a, false, 86960, new Class[0], String.class);
        }
        return "FilterStateEvent{velocity=" + this.f74936b + ", fraction=" + this.f74937c + ", type=" + this.f74938d + '}';
    }
}
