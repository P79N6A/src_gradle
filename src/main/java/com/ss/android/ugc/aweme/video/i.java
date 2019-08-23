package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.videoview.d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76114a;

    public static VideoUrlModel a(Video video, c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{video, aVar}, null, f76114a, true, 88932, new Class[]{Video.class, c.a.class}, VideoUrlModel.class)) {
            return (VideoUrlModel) PatchProxy.accessDispatch(new Object[]{video, aVar}, null, f76114a, true, 88932, new Class[]{Video.class, c.a.class}, VideoUrlModel.class);
        }
        VideoUrlModel videoUrlModel = null;
        if (video != null) {
            if (!o.v()) {
                if (d.a(video, aVar)) {
                    videoUrlModel = video.getPlayAddrH265();
                } else {
                    videoUrlModel = video.getPlayAddrH264();
                }
            } else if (d.a(video, aVar)) {
                videoUrlModel = video.getPlayAddrH265();
            } else {
                videoUrlModel = video.getPlayAddrH264();
            }
        }
        return videoUrlModel;
    }
}
