package com.ss.android.ugc.aweme.story.shootvideo;

import android.content.DialogInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.shootvideo.edit.a;

public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73630a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoStoryEditPublishActivity f73631b;

    k(VideoStoryEditPublishActivity videoStoryEditPublishActivity) {
        this.f73631b = videoStoryEditPublishActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f73630a, false, 85154, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f73630a, false, 85154, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        VideoStoryEditPublishActivity videoStoryEditPublishActivity = this.f73631b;
        videoStoryEditPublishActivity.setResult(5);
        if (videoStoryEditPublishActivity.f73387e != null) {
            a aVar = videoStoryEditPublishActivity.f73387e;
            if (PatchProxy.isSupport(new Object[0], aVar, a.f73436a, false, 85228, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, a.f73436a, false, 85228, new Class[0], Void.TYPE);
            } else if (aVar.l != null) {
                aVar.l.d();
            }
        }
        videoStoryEditPublishActivity.finish();
        videoStoryEditPublishActivity.overridePendingTransition(0, C0906R.anim.da);
    }
}
