package com.ss.android.ugc.aweme.tools;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ay extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74637a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f74638b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f74639c;

    /* renamed from: d  reason: collision with root package name */
    public int f74640d = 1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74641e;

    public final boolean a() {
        if (this.f74640d == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74637a, false, 86994, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74637a, false, 86994, new Class[0], String.class);
        }
        return "SwitchDurationConfigEvent{isShortMode=" + this.f74639c + "isEnabled=" + this.f74638b + '}';
    }

    public ay(boolean z, boolean z2) {
        this.f74639c = z;
        this.f74638b = z2;
    }
}
