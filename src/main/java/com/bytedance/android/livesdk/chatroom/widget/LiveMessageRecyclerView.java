package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.bytedance.android.live.uikit.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveMessageRecyclerView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13391a;

    /* renamed from: b  reason: collision with root package name */
    private float f13392b;

    /* renamed from: c  reason: collision with root package name */
    private float f13393c;

    /* renamed from: d  reason: collision with root package name */
    private float f13394d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13395e = true;

    public float getBottomFadingEdgeStrength() {
        if (PatchProxy.isSupport(new Object[0], this, f13391a, false, 7908, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f13391a, false, 7908, new Class[0], Float.TYPE)).floatValue();
        } else if (a.f()) {
            return 0.0f;
        } else {
            return super.getBottomFadingEdgeStrength();
        }
    }

    public void setDisableAllowIntercept(boolean z) {
        this.f13395e = z;
    }

    public LiveMessageRecyclerView(Context context) {
        super(context);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13391a, false, 7907, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13391a, false, 7907, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f13391a, false, 7906, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f13391a, false, 7906, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (!a.e() || !this.f13395e) {
            this.f13393c = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                ViewParent parent = getParent();
                if (parent != null && this.f13395e) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                this.f13392b = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                this.f13394d = this.f13393c - this.f13392b;
                if (Math.abs(this.f13394d) <= 10.0f || getScrollY() != 0) {
                    a(true);
                } else {
                    a(false);
                }
            }
        } else if (motionEvent.getAction() == 0) {
            ViewParent parent2 = getParent();
            if (parent2 != null) {
                parent2.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public LiveMessageRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveMessageRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
