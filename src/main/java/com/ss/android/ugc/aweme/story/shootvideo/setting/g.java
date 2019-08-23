package com.ss.android.ugc.aweme.story.shootvideo.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74138a;

    public final String c() {
        return "story_reply_permission";
    }

    public final boolean e() {
        return false;
    }

    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f74138a, false, 86047, new Class[0], String.class)) {
            return this.f74143e.getResources().getString(C0906R.string.cfy);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f74138a, false, 86047, new Class[0], String.class);
    }

    public final String f() {
        if (!PatchProxy.isSupport(new Object[0], this, f74138a, false, 86048, new Class[0], String.class)) {
            return this.f74143e.getResources().getString(C0906R.string.cg2);
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f74138a, false, 86048, new Class[0], String.class);
    }
}
