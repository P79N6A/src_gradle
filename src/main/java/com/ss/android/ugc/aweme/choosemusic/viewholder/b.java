package com.ss.android.ugc.aweme.choosemusic.viewholder;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36163a;

    /* renamed from: b  reason: collision with root package name */
    private final RemoteImageView f36164b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36165c;

    b(RemoteImageView remoteImageView, String str) {
        this.f36164b = remoteImageView;
        this.f36165c = str;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f36163a, false, 26921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36163a, false, 26921, new Class[0], Void.TYPE);
            return;
        }
        RemoteImageView remoteImageView = this.f36164b;
        String str = this.f36165c;
        if (remoteImageView.getMeasuredHeight() <= 0 || remoteImageView.getMeasuredWidth() <= 0) {
            c.a(remoteImageView, str);
        } else {
            c.a(remoteImageView, str, remoteImageView.getMeasuredWidth(), remoteImageView.getMeasuredHeight());
        }
    }
}
