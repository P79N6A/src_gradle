package com.ss.android.ugc.aweme.video.d;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.playerkit.b.b;
import com.ss.android.ugc.playerkit.videoview.d.d;
import com.ss.android.ugc.playerkit.videoview.d.e;
import com.ss.android.ugc.playerkit.videoview.d.g;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76044a;

    public final e a(g.a aVar) {
        String str;
        g.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f76044a, false, 89310, new Class[]{g.a.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f76044a, false, 89310, new Class[]{g.a.class}, e.class);
        }
        d a2 = aVar.a();
        VideoUrlModel videoUrlModel = a2.f77763a;
        LocalVideoPlayerManager a3 = LocalVideoPlayerManager.a();
        if (PatchProxy.isSupport(new Object[]{videoUrlModel}, a3, LocalVideoPlayerManager.f76123a, false, 89144, new Class[]{VideoUrlModel.class}, String.class)) {
            LocalVideoPlayerManager localVideoPlayerManager = a3;
            str = (String) PatchProxy.accessDispatch(new Object[]{videoUrlModel}, localVideoPlayerManager, LocalVideoPlayerManager.f76123a, false, 89144, new Class[]{VideoUrlModel.class}, String.class);
        } else {
            str = a3.a(videoUrlModel.getSourceId());
            if (!TextUtils.isEmpty(str)) {
                com.ss.android.ugc.aweme.video.local.g a4 = a3.f76126c.a(videoUrlModel.getSourceId());
                if (a4 != null) {
                    String uri = a4.getUri();
                    String uri2 = videoUrlModel.getUri();
                    if (!(uri == null || uri2 == null || TextUtils.equals(uri.split("_")[0], uri2.split("_")[0]))) {
                        b.a(LocalVideoPlayerManager.f76124b, "local video not match, expire");
                        a3.f76126c.b(a4.getSourceId());
                        str = null;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return aVar2.a(a2);
        }
        ai.a("LocalVideoCache=>play video using cache,filePath:" + str);
        return new e(str);
    }
}
