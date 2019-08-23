package com.ss.android.ugc.aweme.longvideonew;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.longvideo.e;

public final /* synthetic */ class f implements d {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54040c;

    /* renamed from: d  reason: collision with root package name */
    static final d f54041d = new f();

    private f() {
    }

    public final Video a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f54040c, false, 56875, new Class[]{Aweme.class}, Video.class)) {
            return (Video) PatchProxy.accessDispatch(new Object[]{aweme}, this, f54040c, false, 56875, new Class[]{Aweme.class}, Video.class);
        } else if (e.f53909b.b()) {
            if (aweme == null) {
                return null;
            }
            return aweme.getVideo();
        } else if (aweme == null || aweme.getLongVideos() == null || aweme.getLongVideos().size() <= 0) {
            return null;
        } else {
            return aweme.getLongVideos().get(0).getVideo();
        }
    }
}
