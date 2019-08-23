package com.ss.android.ugc.aweme.story.shootvideo.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class l extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74161a;

    public final String c() {
        return "story_view_permission";
    }

    public final boolean e() {
        return true;
    }

    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f74161a, false, 86072, new Class[0], String.class)) {
            return this.f74143e.getResources().getString(C0906R.string.cg3);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f74161a, false, 86072, new Class[0], String.class);
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f74161a, false, 86073, new Class[0], String.class)) {
            return this.f74143e.getResources().getString(C0906R.string.cfx);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f74161a, false, 86073, new Class[0], String.class);
    }
}
