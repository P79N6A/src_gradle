package com.ss.android.ugc.aweme.photo;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.b.d;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.filter.w;

public class PhotoView extends d implements LifecycleObserver {
    public static ChangeQuickRedirect o;
    private PhotoContext p;
    private int q;
    private int r;

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 63600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 63600, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void resume() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 63601, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 63601, new Class[0], Void.TYPE);
            return;
        }
        c();
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    public final void a(PhotoContext photoContext) {
        if (PatchProxy.isSupport(new Object[]{photoContext}, this, o, false, 63603, new Class[]{PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{photoContext}, this, o, false, 63603, new Class[]{PhotoContext.class}, Void.TYPE);
            return;
        }
        this.p = photoContext;
        a(w.a(this.p.mFilterIndex).j, this.p.mFilterRate);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(LifecycleOwner lifecycleOwner, PhotoContext photoContext) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, photoContext}, this, o, false, 63602, new Class[]{LifecycleOwner.class, PhotoContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, photoContext}, this, o, false, 63602, new Class[]{LifecycleOwner.class, PhotoContext.class}, Void.TYPE);
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
        this.p = photoContext;
        if (PatchProxy.isSupport(new Object[0], this, o, false, 63604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 63604, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            c.a(e.a(this.p.getPhotoUri()), this.q, this.r, (b<Bitmap>) new b<Bitmap>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58452a;

                public final /* synthetic */ void accept(Object obj) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f58452a, false, 63605, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f58452a, false, 63605, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    if (bitmap != null) {
                        PhotoView.this.setImage(bitmap);
                    }
                }
            });
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, o, false, 63599, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, o, false, 63599, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        this.q = getWidth();
        this.r = getHeight();
    }
}
