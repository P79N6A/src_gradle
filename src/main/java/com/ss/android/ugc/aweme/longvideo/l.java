package com.ss.android.ugc.aweme.longvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public final /* synthetic */ class l implements j {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f53969c;

    /* renamed from: d  reason: collision with root package name */
    static final j f53970d = new l();

    private l() {
    }

    public final Video a(Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f53969c, false, 56669, new Class[]{Aweme.class}, Video.class)) {
            return (Video) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53969c, false, 56669, new Class[]{Aweme.class}, Video.class);
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
