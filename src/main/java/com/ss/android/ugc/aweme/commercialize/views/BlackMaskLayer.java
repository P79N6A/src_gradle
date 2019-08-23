package com.ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class BlackMaskLayer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39882a;

    public BlackMaskLayer(@NonNull Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f39882a, false, 32826, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f39882a, false, 32826, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public BlackMaskLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BlackMaskLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f39882a, false, 32825, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39882a, false, 32825, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundColor(Color.parseColor("#000000"));
        setAlpha(0.0f);
    }
}
