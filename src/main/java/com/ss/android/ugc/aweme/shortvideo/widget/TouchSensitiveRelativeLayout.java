package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class TouchSensitiveRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71385a;

    /* renamed from: b  reason: collision with root package name */
    private a f71386b;

    public interface a {
        void a();
    }

    public TouchSensitiveRelativeLayout(Context context) {
        super(context);
    }

    public void setNoBlockTouchListener(a aVar) {
        this.f71386b = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f71385a, false, 81456, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f71385a, false, 81456, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f71386b != null) {
            this.f71386b.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
