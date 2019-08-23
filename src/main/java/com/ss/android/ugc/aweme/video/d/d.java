package com.ss.android.ugc.aweme.video.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LongVideo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.d.e;
import com.ss.android.ugc.playerkit.videoview.d.g;
import java.util.Iterator;
import java.util.List;

public final class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76045a;

    public final e a(g.a aVar) {
        g.a aVar2 = aVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76045a, false, 89311, new Class[]{g.a.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76045a, false, 89311, new Class[]{g.a.class}, e.class);
        }
        com.ss.android.ugc.playerkit.videoview.d.d a2 = aVar.a();
        VideoUrlModel videoUrlModel = a2.f77763a;
        String sourceId = videoUrlModel.getSourceId();
        double duration = videoUrlModel.getDuration();
        if (PatchProxy.isSupport(new Object[]{sourceId, Double.valueOf(duration)}, this, f76045a, false, 89312, new Class[]{String.class, Double.TYPE}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{sourceId, Double.valueOf(duration)}, this, f76045a, false, 89312, new Class[]{String.class, Double.TYPE}, Boolean.TYPE)).booleanValue();
        } else {
            if (!TextUtils.isEmpty(sourceId)) {
                Aweme b2 = a.a().b(sourceId);
                if (b2 != null) {
                    List<LongVideo> longVideos = b2.getLongVideos();
                    if (longVideos != null && !longVideos.isEmpty()) {
                        Iterator<LongVideo> it2 = longVideos.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            LongVideo next = it2.next();
                            if (next != null) {
                                Video video = next.getVideo();
                                if (video != null && ((double) video.getDuration()) == duration) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z = false;
        }
        if (z) {
            return aVar2.a(a2);
        }
        String a3 = com.ss.android.ugc.aweme.commercialize.splash.a.a().a(videoUrlModel.getSourceId());
        if (!TextUtils.isEmpty(a3)) {
            return new e(a3);
        }
        return aVar2.a(a2);
    }
}
