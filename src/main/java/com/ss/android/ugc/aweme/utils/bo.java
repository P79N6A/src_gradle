package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class bo {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75623a;

    /* renamed from: b  reason: collision with root package name */
    public int f75624b;

    public bo(int i) {
        this.f75624b = i;
    }

    public final bo a(int i) {
        this.f75624b = i | this.f75624b;
        return this;
    }

    public final boolean c(int i) {
        if ((this.f75624b & i) == i) {
            return true;
        }
        return false;
    }

    public final bo b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f75623a, false, 88322, new Class[]{Integer.TYPE}, bo.class)) {
            return (bo) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f75623a, false, 88322, new Class[]{Integer.TYPE}, bo.class);
        }
        if (c(i)) {
            this.f75624b &= i ^ -1;
        }
        return this;
    }
}
