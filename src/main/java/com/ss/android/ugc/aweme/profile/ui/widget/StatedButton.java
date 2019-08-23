package com.ss.android.ugc.aweme.profile.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public class StatedButton extends AutoRTLImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63103a;

    /* renamed from: b  reason: collision with root package name */
    public int f63104b;

    /* renamed from: c  reason: collision with root package name */
    public int f63105c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f63106d;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63103a, false, 69872, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63103a, false, 69872, new Class[0], Void.TYPE);
            return;
        }
        this.f63106d = true;
        animate().rotationBy(360.0f).setDuration(800).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63107a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f63107a, false, 69873, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f63107a, false, 69873, new Class[0], Void.TYPE);
                } else if (StatedButton.this.f63106d) {
                    StatedButton.this.a();
                } else {
                    StatedButton.this.animate().cancel();
                    StatedButton.this.animate().rotation(0.0f).rotationXBy(0.0f).rotationYBy(0.0f).setDuration(1).start();
                    StatedButton.this.setImageResource(StatedButton.this.f63104b);
                }
            }
        }).start();
    }

    public void setLoadingBackground(int i) {
        this.f63105c = i;
    }

    public StatedButton(Context context) {
        this(context, null);
    }

    public void setLoginBackgroundRes(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f63103a, false, 69870, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f63103a, false, 69870, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f63104b = i;
        setImageResource(this.f63104b);
    }

    public StatedButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StatedButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f63104b = 2130839557;
        this.f63105c = 2130839558;
        setImageResource(this.f63104b);
    }
}
