package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class o implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74268a;

    /* renamed from: b  reason: collision with root package name */
    private final StoryTextRecordLayout f74269b;

    o(StoryTextRecordLayout storyTextRecordLayout) {
        this.f74269b = storyTextRecordLayout;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f74268a, false, 86238, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f74268a, false, 86238, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        StoryTextRecordLayout storyTextRecordLayout = this.f74269b;
        if (motionEvent.getAction() == 0) {
            storyTextRecordLayout.m = System.currentTimeMillis();
            storyTextRecordLayout.n = motionEvent.getX();
            storyTextRecordLayout.o = motionEvent.getY();
        } else if (motionEvent.getAction() == 1 && storyTextRecordLayout.u && System.currentTimeMillis() - storyTextRecordLayout.m < 200 && ((Math.abs(motionEvent.getX() - storyTextRecordLayout.n) <= 5.0f || Math.abs(motionEvent.getY() - storyTextRecordLayout.o) <= 5.0f) && System.currentTimeMillis() - storyTextRecordLayout.t > 500)) {
            if (storyTextRecordLayout.p != null) {
                storyTextRecordLayout.p.a();
            }
            storyTextRecordLayout.t = System.currentTimeMillis();
        }
        return false;
    }
}
