package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.a.d;

public final /* synthetic */ class t implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76272a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoUrlModel f76273b;

    t(VideoUrlModel videoUrlModel) {
        this.f76273b = videoUrlModel;
    }

    public final Object a() {
        if (PatchProxy.isSupport(new Object[0], this, f76272a, false, 89029, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f76272a, false, 89029, new Class[0], Object.class);
        }
        return Boolean.valueOf(g.f().a(this.f76273b));
    }
}
