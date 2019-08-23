package com.ss.android.ugc.aweme.story.shootvideo;

import android.arch.lifecycle.Observer;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class g implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73622a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoStoryEditPublishActivity f73623b;

    g(VideoStoryEditPublishActivity videoStoryEditPublishActivity) {
        this.f73623b = videoStoryEditPublishActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73622a, false, 85150, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f73622a, false, 85150, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        VideoStoryEditPublishActivity videoStoryEditPublishActivity = this.f73623b;
        Integer num = (Integer) obj;
        if (num.intValue() != 0) {
            a.b(videoStoryEditPublishActivity.getApplicationContext(), videoStoryEditPublishActivity.getString(C0906R.string.bfz, new Object[]{num})).a();
            videoStoryEditPublishActivity.finish();
            return;
        }
        videoStoryEditPublishActivity.f73386d.mVideoLength = videoStoryEditPublishActivity.b().t();
    }
}
