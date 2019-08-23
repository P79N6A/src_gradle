package com.ss.android.ugc.aweme.newfollow.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FollowFeedLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57225a;

    /* renamed from: b  reason: collision with root package name */
    private View.OnAttachStateChangeListener f57226b = new View.OnAttachStateChangeListener() {
        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
        }
    };

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f57227c = this.f57226b;

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f57225a, false, 61512, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57225a, false, 61512, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f57227c.onViewAttachedToWindow(this);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f57225a, false, 61513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57225a, false, 61513, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f57227c.onViewDetachedFromWindow(this);
    }

    public FollowFeedLayout(@NonNull Context context) {
        super(context);
    }

    public void setOnAttachStateChangeListener(View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (onAttachStateChangeListener == null) {
            this.f57227c = this.f57226b;
        } else {
            this.f57227c = onAttachStateChangeListener;
        }
    }

    public FollowFeedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FollowFeedLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
