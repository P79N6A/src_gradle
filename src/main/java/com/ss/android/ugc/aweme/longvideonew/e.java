package com.ss.android.ugc.aweme.longvideonew;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public final /* synthetic */ class e implements d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54038c;

    /* renamed from: d  reason: collision with root package name */
    static final d f54039d = new e();

    private e() {
    }

    public final Video a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f54038c, false, 56874, new Class[]{Aweme.class}, Video.class)) {
            return (Video) PatchProxy.accessDispatch(new Object[]{aweme}, this, f54038c, false, 56874, new Class[]{Aweme.class}, Video.class);
        } else if (aweme == null) {
            return null;
        } else {
            return aweme.getVideo();
        }
    }
}
