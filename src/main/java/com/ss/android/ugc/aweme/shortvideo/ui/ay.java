package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.d;

public final /* synthetic */ class ay implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70792a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70793b;

    ay(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70793b = videoRecordNewActivity;
    }

    public final Object a() {
        if (!PatchProxy.isSupport(new Object[0], this, f70792a, false, 80622, new Class[0], Object.class)) {
            return this.f70793b.i();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f70792a, false, 80622, new Class[0], Object.class);
    }
}
