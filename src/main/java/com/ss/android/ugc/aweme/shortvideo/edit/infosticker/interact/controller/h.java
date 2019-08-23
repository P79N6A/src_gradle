package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.c;

public final /* synthetic */ class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67275a;

    /* renamed from: b  reason: collision with root package name */
    private final int f67276b;

    /* renamed from: c  reason: collision with root package name */
    private final int f67277c;

    /* renamed from: d  reason: collision with root package name */
    private final int f67278d;

    /* renamed from: e  reason: collision with root package name */
    private final int f67279e;

    h(int i, int i2, int i3, int i4) {
        this.f67276b = i;
        this.f67277c = i2;
        this.f67278d = i3;
        this.f67279e = i4;
    }

    public final Object a(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f67275a, false, 76977, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f67275a, false, 76977, new Class[]{Object.class}, Object.class);
        }
        return j.a((ViewGroup) obj, this.f67276b, this.f67277c, this.f67278d, this.f67279e);
    }
}
