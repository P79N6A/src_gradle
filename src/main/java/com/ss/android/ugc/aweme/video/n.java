package com.ss.android.ugc.aweme.video;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.playerkit.videoview.b;

public final /* synthetic */ class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76176a;

    /* renamed from: b  reason: collision with root package name */
    private final g f76177b;

    public n(g gVar) {
        this.f76177b = gVar;
    }

    public final boolean a(VideoUrlModel videoUrlModel) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (!PatchProxy.isSupport(new Object[]{videoUrlModel2}, this, f76176a, false, 88940, new Class[]{VideoUrlModel.class}, Boolean.TYPE)) {
            return this.f76177b.a(videoUrlModel2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{videoUrlModel2}, this, f76176a, false, 88940, new Class[]{VideoUrlModel.class}, Boolean.TYPE)).booleanValue();
    }
}
