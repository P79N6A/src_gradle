package com.ss.android.ugc.aweme.comment.ui;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.f.f;
import com.ss.android.ugc.aweme.utils.bg;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36611a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36612b;

    q(VideoCommentDialogFragment2 videoCommentDialogFragment2) {
        this.f36612b = videoCommentDialogFragment2;
    }

    public final void run() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f36611a, false, 27726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36611a, false, 27726, new Class[0], Void.TYPE);
            return;
        }
        VideoCommentDialogFragment2 videoCommentDialogFragment2 = this.f36612b;
        FragmentActivity activity = videoCommentDialogFragment2.getActivity();
        if (activity != null) {
            f fVar = new f(0);
            fVar.f45303b = videoCommentDialogFragment2.y;
            f a2 = fVar.a(activity.hashCode());
            if (videoCommentDialogFragment2.r != null) {
                str = videoCommentDialogFragment2.r.getAid();
            } else {
                str = "";
            }
            a2.f45304c = str;
            bg.a(a2);
        }
    }
}
