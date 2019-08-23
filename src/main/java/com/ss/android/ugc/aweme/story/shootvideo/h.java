package com.ss.android.ugc.aweme.story.shootvideo;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73624a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoStoryEditPublishActivity f73625b;

    h(VideoStoryEditPublishActivity videoStoryEditPublishActivity) {
        this.f73625b = videoStoryEditPublishActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73624a, false, 85151, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f73624a, false, 85151, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f73625b.g();
    }
}
