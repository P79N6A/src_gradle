package com.ss.android.ugc.aweme.longvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public final /* synthetic */ class k implements j {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f53967c;

    /* renamed from: d  reason: collision with root package name */
    static final j f53968d = new k();

    private k() {
    }

    public final Video a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f53967c, false, 56668, new Class[]{Aweme.class}, Video.class)) {
            return (Video) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53967c, false, 56668, new Class[]{Aweme.class}, Video.class);
        } else if (aweme == null) {
            return null;
        } else {
            return aweme.getVideo();
        }
    }
}
