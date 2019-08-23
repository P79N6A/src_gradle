package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.k.b;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.a.d;

public final /* synthetic */ class r implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76266a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoUrlModel f76267b;

    r(VideoUrlModel videoUrlModel) {
        this.f76267b = videoUrlModel;
    }

    public final Object a() {
        if (!PatchProxy.isSupport(new Object[0], this, f76266a, false, 89027, new Class[0], Object.class)) {
            return Integer.valueOf(b.b(this.f76267b));
        }
        return PatchProxy.accessDispatch(new Object[0], this, f76266a, false, 89027, new Class[0], Object.class);
    }
}
