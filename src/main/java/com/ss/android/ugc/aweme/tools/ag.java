package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ag extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74613a;

    /* renamed from: b  reason: collision with root package name */
    public int f74614b;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74613a, false, 86980, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74613a, false, 86980, new Class[0], String.class);
        }
        return "PreviewModeChangeEvent{mode=" + this.f74614b + '}';
    }

    public ag(int i) {
        this.f74614b = i;
    }
}
