package com.ss.android.ugc.aweme.story.feed.view.ui.comment;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class i extends Dialog {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f72895c;

    public abstract void a();

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f72895c, false, 84221, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f72895c, false, 84221, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        Context context = getContext();
        if (PatchProxy.isSupport(new Object[]{context, motionEvent}, this, f72895c, false, 84222, new Class[]{Context.class, MotionEvent.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context, motionEvent}, this, f72895c, false, 84222, new Class[]{Context.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int scaledWindowTouchSlop = ViewConfiguration.get(context).getScaledWindowTouchSlop();
            View decorView = getWindow().getDecorView();
            int i = -scaledWindowTouchSlop;
            if (x >= i && y >= i && x <= decorView.getWidth() + scaledWindowTouchSlop && y <= decorView.getHeight() + scaledWindowTouchSlop) {
                z = false;
            }
        }
        if (z) {
            a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public i(@NonNull Context context, int i) {
        super(context, i);
    }
}
