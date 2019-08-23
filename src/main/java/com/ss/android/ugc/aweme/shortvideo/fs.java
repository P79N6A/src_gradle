package com.ss.android.ugc.aweme.shortvideo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoPublishService;
import java.util.concurrent.Callable;

public final /* synthetic */ class fs implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67802a;

    /* renamed from: b  reason: collision with root package name */
    private final ShortVideoPublishService.a f67803b;

    fs(ShortVideoPublishService.a aVar) {
        this.f67803b = aVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f67802a, false, 74675, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f67802a, false, 74675, new Class[0], Object.class);
        }
        ShortVideoPublishService.this.a(new hn(new Throwable("Video has failed to upload")));
        return null;
    }
}
