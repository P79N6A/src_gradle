package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.cg;

public final /* synthetic */ class ag implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70752a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoPublishFragment f70753b;

    ag(VideoPublishFragment videoPublishFragment) {
        this.f70753b = videoPublishFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f70752a, false, 80469, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f70752a, false, 80469, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        cg.a((Activity) this.f70753b.getActivity());
        return false;
    }
}
