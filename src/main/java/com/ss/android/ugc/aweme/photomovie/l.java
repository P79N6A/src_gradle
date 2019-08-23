package com.ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cg;

public final /* synthetic */ class l implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59013a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59014b;

    l(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59014b = photoMoviePublishFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f59013a, false, 64029, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f59013a, false, 64029, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        cg.a((Activity) this.f59014b.getActivity());
        return false;
    }
}
