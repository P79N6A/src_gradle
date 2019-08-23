package com.ss.android.ugc.aweme.video.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.videoview.d.d;
import com.ss.android.ugc.playerkit.videoview.d.e;
import com.ss.android.ugc.playerkit.videoview.d.g;
import com.ss.ttvideoengine.DataLoaderHelper;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76040a;

    public final e a(g.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f76040a, false, 89305, new Class[]{g.a.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{aVar}, this, f76040a, false, 89305, new Class[]{g.a.class}, e.class);
        }
        d a2 = aVar.a();
        VideoUrlModel videoUrlModel = a2.f77763a;
        return new e(DataLoaderHelper.getDataLoader().proxyUrl(videoUrlModel.getBitRatedRatioUri(), videoUrlModel.getBitRatedRatioUri(), a2.f77765c, null, null));
    }
}
