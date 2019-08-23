package com.ss.android.ugc.aweme.photomovie;

import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58872a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMovieEditActivity f58873b;

    /* renamed from: c  reason: collision with root package name */
    private final PhotoMovieContext f58874c;

    c(PhotoMovieEditActivity photoMovieEditActivity, PhotoMovieContext photoMovieContext) {
        this.f58873b = photoMovieEditActivity;
        this.f58874c = photoMovieContext;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58872a, false, 63941, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58872a, false, 63941, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhotoMovieEditActivity photoMovieEditActivity = this.f58873b;
        PhotoMovieContext photoMovieContext = this.f58874c;
        r.a("click_modify_entrance", (Map) d.a().a("creation_id", photoMovieContext.creationId).a("shoot_way", photoMovieContext.mShootWay).a("enter_from", "video_edit_page").a("content_source", "upload").a("content_type", "slideshow").a("scene_id", "1004").f34114b);
        if (!photoMovieEditActivity.f58814c.a()) {
            photoMovieEditActivity.h.b();
        }
    }
}
