package com.ss.android.ugc.aweme.feed.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;

public class CustomInterceptTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46085a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f46086b = u.a(8.0d);

    /* renamed from: c  reason: collision with root package name */
    boolean f46087c;

    /* renamed from: d  reason: collision with root package name */
    private a f46088d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f46089e;

    /* renamed from: f  reason: collision with root package name */
    private int f46090f;
    private int g;
    private boolean h;

    public interface a {
        boolean a();
    }

    public CustomInterceptTouchEventFrameLayout(@NonNull Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46085a, false, 42466, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46085a, false, 42466, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        super.onInterceptTouchEvent(motionEvent);
        a(motionEvent);
        return this.f46087c;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46085a, false, 42467, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46085a, false, 42467, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        a(motionEvent);
        return true;
    }

    @Nullable
    private boolean a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46085a, false, 42468, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46085a, false, 42468, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f46090f = (int) motionEvent.getX();
                this.g = (int) motionEvent.getY();
                break;
            case 1:
            case 3:
                this.f46087c = false;
                this.h = false;
                break;
            case 2:
                if (this.f46088d != null) {
                    float x = motionEvent.getX() - ((float) this.f46090f);
                    float y = motionEvent.getY() - ((float) this.g);
                    if (Math.abs(x) > ((float) f46086b) || Math.abs(y) > ((float) f46086b)) {
                        if (!this.f46088d.a()) {
                            this.f46087c = false;
                            break;
                        } else {
                            this.f46089e.run();
                            break;
                        }
                    }
                }
                break;
        }
        return this.f46087c;
    }

    public CustomInterceptTouchEventFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomInterceptTouchEventFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public CustomInterceptTouchEventFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
    }
}
