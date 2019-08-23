package com.ss.android.ugc.aweme.shortvideo.widget;

import android.view.MotionEvent;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class GuideTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71331a;

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71331a, false, 81307, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71331a, false, 81307, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        return false;
    }
}
