package com.ss.android.ugc.aweme.comment.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class aa implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36567a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoCommentDialogFragment2 f36568b;

    /* renamed from: c  reason: collision with root package name */
    private final long f36569c;

    aa(VideoCommentDialogFragment2 videoCommentDialogFragment2, long j) {
        this.f36568b = videoCommentDialogFragment2;
        this.f36569c = j;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f36567a, false, 27736, new Class[0], Object.class)) {
            return this.f36568b.a(this.f36569c);
        }
        return PatchProxy.accessDispatch(new Object[0], this, f36567a, false, 27736, new Class[0], Object.class);
    }
}
