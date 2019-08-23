package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordGestureLayout;

public class ChooseMediaGestureLayout extends VideoRecordGestureLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68316a;
    private a m;

    public interface a {
    }

    public ChooseMediaGestureLayout(@NonNull Context context) {
        super(context);
    }

    public void setInterceptTouchEvent(a aVar) {
        this.m = aVar;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!PatchProxy.isSupport(new Object[]{motionEvent}, this, f68316a, false, 77578, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f68316a, false, 77578, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public ChooseMediaGestureLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChooseMediaGestureLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
