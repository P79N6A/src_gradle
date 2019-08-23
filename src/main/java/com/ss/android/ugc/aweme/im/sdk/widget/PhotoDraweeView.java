package com.ss.android.ugc.aweme.im.sdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import f.a.a.a.b;

public class PhotoDraweeView extends b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52811a;

    /* renamed from: b  reason: collision with root package name */
    public DraweeHolder<GenericDraweeHierarchy> f52812b;

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f52811a, false, 54181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52811a, false, 54181, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f52812b.onAttach();
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f52811a, false, 54179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52811a, false, 54179, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f52812b.onDetach();
    }

    public void onFinishTemporaryDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f52811a, false, 54182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52811a, false, 54182, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishTemporaryDetach();
        this.f52812b.onAttach();
    }

    public void onStartTemporaryDetach() {
        if (PatchProxy.isSupport(new Object[0], this, f52811a, false, 54180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f52811a, false, 54180, new Class[0], Void.TYPE);
            return;
        }
        super.onStartTemporaryDetach();
        this.f52812b.onDetach();
    }

    public PhotoDraweeView(Context context) {
        this(context, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f52811a, false, 54184, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f52811a, false, 54184, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f52812b.onTouchEvent(motionEvent2) || super.onTouchEvent(motionEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void setProgressBarImage(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f52811a, false, 54187, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable2}, this, f52811a, false, 54187, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        ((GenericDraweeHierarchy) this.f52812b.getHierarchy()).setProgressBarImage(drawable2);
    }

    public boolean verifyDrawable(@NonNull Drawable drawable) {
        Drawable drawable2 = drawable;
        if (PatchProxy.isSupport(new Object[]{drawable2}, this, f52811a, false, 54183, new Class[]{Drawable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{drawable2}, this, f52811a, false, 54183, new Class[]{Drawable.class}, Boolean.TYPE)).booleanValue();
        }
        super.verifyDrawable(drawable);
        if (drawable2 == ((GenericDraweeHierarchy) this.f52812b.getHierarchy()).getTopLevelDrawable()) {
            return true;
        }
        return false;
    }

    public PhotoDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (PatchProxy.isSupport(new Object[]{context}, this, f52811a, false, 54178, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f52811a, false, 54178, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f52812b == null) {
            this.f52812b = DraweeHolder.create(new GenericDraweeHierarchyBuilder(getResources()).build(), context);
        }
        setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}
