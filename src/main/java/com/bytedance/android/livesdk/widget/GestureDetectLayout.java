package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.chatroom.bl.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public class GestureDetectLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18222a;

    /* renamed from: b  reason: collision with root package name */
    private List<View.OnTouchListener> f18223b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<View.OnTouchListener> f18224c = new ArrayList();

    public GestureDetectLayout(@NonNull Context context) {
        super(context);
    }

    public final void a(View.OnTouchListener onTouchListener) {
        View.OnTouchListener onTouchListener2 = onTouchListener;
        if (PatchProxy.isSupport(new Object[]{onTouchListener2}, this, f18222a, false, 14371, new Class[]{View.OnTouchListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onTouchListener2}, this, f18222a, false, 14371, new Class[]{View.OnTouchListener.class}, Void.TYPE);
        } else if (onTouchListener2 != null) {
            this.f18224c.add(onTouchListener2);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f18222a, false, 14374, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f18222a, false, 14374, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (int size = this.f18223b.size() - 1; size >= 0; size--) {
            this.f18223b.get(size).onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f18222a, false, 14375, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f18222a, false, 14375, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        for (int size = this.f18224c.size() - 1; size >= 0; size--) {
            this.f18224c.get(size).onTouch(this, motionEvent);
        }
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f18222a, false, 14376, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f18222a, false, 14376, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z);
        d.INSTANCE.setCurrentWindowFocus(z);
    }

    public GestureDetectLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GestureDetectLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }
}
