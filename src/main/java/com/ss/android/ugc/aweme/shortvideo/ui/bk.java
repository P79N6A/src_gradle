package com.ss.android.ugc.aweme.shortvideo.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FaceBeautyInvoker;
import com.ss.android.medialib.presenter.MediaRecordPresenter;

public final /* synthetic */ class bk implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70818a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoRecordNewActivity f70819b;

    public bk(VideoRecordNewActivity videoRecordNewActivity) {
        this.f70819b = videoRecordNewActivity;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f70818a, false, 80634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70818a, false, 80634, new Class[0], Void.TYPE);
            return;
        }
        VideoRecordNewActivity videoRecordNewActivity = this.f70819b;
        if (videoRecordNewActivity.t != null) {
            MediaRecordPresenter mediaRecordPresenter = videoRecordNewActivity.t;
            bl blVar = new bl(videoRecordNewActivity);
            if (PatchProxy.isSupport(new Object[]{blVar}, mediaRecordPresenter, MediaRecordPresenter.f29728a, false, 17676, new Class[]{FaceBeautyInvoker.OnARTextContentCallback.class}, Integer.TYPE)) {
                MediaRecordPresenter mediaRecordPresenter2 = mediaRecordPresenter;
                ((Integer) PatchProxy.accessDispatch(new Object[]{blVar}, mediaRecordPresenter2, MediaRecordPresenter.f29728a, false, 17676, new Class[]{FaceBeautyInvoker.OnARTextContentCallback.class}, Integer.TYPE)).intValue();
            } else {
                mediaRecordPresenter.j.slamGetTextParagraphContent(blVar);
            }
        }
    }
}
