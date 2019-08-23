package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.vote;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class VoteEditText extends AppCompatEditText {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67336a;

    /* renamed from: b  reason: collision with root package name */
    public long f67337b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67338c;

    public VoteEditText(Context context) {
        super(context);
    }

    public void setMode(boolean z) {
        this.f67338c = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f67336a, false, 77115, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f67336a, false, 77115, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f67338c) {
            return super.onTouchEvent(motionEvent);
        } else {
            this.f67337b = System.currentTimeMillis();
            return false;
        }
    }

    public VoteEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
