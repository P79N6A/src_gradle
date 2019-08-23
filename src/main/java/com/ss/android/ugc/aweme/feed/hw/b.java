package com.ss.android.ugc.aweme.feed.hw;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.g.a;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45550a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoMusicHuaweiCoverWidget f45551b;

    b(VideoMusicHuaweiCoverWidget videoMusicHuaweiCoverWidget) {
        this.f45551b = videoMusicHuaweiCoverWidget;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f45550a, false, 41351, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f45550a, false, 41351, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VideoMusicHuaweiCoverWidget videoMusicHuaweiCoverWidget = this.f45551b;
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        if (videoMusicHuaweiCoverWidget.f45543b != null) {
            videoMusicHuaweiCoverWidget.f45543b.a(videoItemParams);
        }
        if (!(!a.a() || videoItemParams == null || videoItemParams.mAweme == null)) {
            videoItemParams.mAweme.getMusic();
        }
    }
}
