package com.ss.android.ugc.aweme.photomovie;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.edit.music.PhotoMovieMusicModule;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58875a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMovieEditActivity f58876b;

    /* renamed from: c  reason: collision with root package name */
    private final PhotoMovieContext f58877c;

    d(PhotoMovieEditActivity photoMovieEditActivity, PhotoMovieContext photoMovieContext) {
        this.f58876b = photoMovieEditActivity;
        this.f58877c = photoMovieContext;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58875a, false, 63942, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58875a, false, 63942, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhotoMovieEditActivity photoMovieEditActivity = this.f58876b;
        PhotoMovieContext photoMovieContext = this.f58877c;
        if (photoMovieEditActivity.g == null) {
            PhotoMovieMusicModule photoMovieMusicModule = new PhotoMovieMusicModule(photoMovieEditActivity, photoMovieEditActivity.f58813b, photoMovieEditActivity.f58815d, photoMovieEditActivity.f58814c, photoMovieEditActivity, photoMovieContext.mShootWay, photoMovieContext.creationId);
            photoMovieEditActivity.g = photoMovieMusicModule;
        }
        photoMovieEditActivity.f58814c.a(photoMovieEditActivity.g);
    }
}
