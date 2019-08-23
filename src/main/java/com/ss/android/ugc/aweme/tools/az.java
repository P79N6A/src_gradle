package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class az extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74642a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74643b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74644c;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74642a, false, 86995, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74642a, false, 86995, new Class[0], String.class);
        }
        return "SwitchDurationDisableEvent{mCurrentMode=" + this.f74644c + "mToDisable=" + this.f74643b + '}';
    }

    public az(boolean z, boolean z2) {
        this.f74644c = z;
        this.f74643b = z2;
    }
}
