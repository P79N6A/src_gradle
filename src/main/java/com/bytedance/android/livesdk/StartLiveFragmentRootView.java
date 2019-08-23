package com.bytedance.android.livesdk;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;
import com.bytedance.android.livesdk.utils.s;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class StartLiveFragmentRootView extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8867a;

    /* renamed from: b  reason: collision with root package name */
    EditText f8868b;

    public StartLiveFragmentRootView(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f8867a, false, 2992, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f8867a, false, 2992, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.f8868b == null) {
            this.f8868b = (EditText) findViewById(C0906R.id.bf9);
        }
        if (this.f8868b != null) {
            s.b(getContext(), this.f8868b);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public StartLiveFragmentRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StartLiveFragmentRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
