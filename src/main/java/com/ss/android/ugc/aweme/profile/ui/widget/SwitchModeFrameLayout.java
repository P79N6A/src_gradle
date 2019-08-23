package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63109a;

    /* renamed from: b  reason: collision with root package name */
    private b f63110b;

    public static class a implements b {
        public void a(MotionEvent motionEvent) {
        }
    }

    public interface b {
        void a(MotionEvent motionEvent);
    }

    public SwitchModeFrameLayout(Context context) {
        super(context);
    }

    public void setIntercepter(b bVar) {
        this.f63110b = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f63109a, false, 69874, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.onTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63109a, false, 69874, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f63109a, false, 69875, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f63109a, false, 69875, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f63110b != null) {
            this.f63110b.a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
