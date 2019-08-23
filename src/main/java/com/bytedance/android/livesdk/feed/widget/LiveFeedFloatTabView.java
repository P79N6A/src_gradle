package com.bytedance.android.livesdk.feed.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.feed.d.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class LiveFeedFloatTabView extends LiveTabIndicator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14519a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14520b;

    /* renamed from: c  reason: collision with root package name */
    public Animator f14521c;

    /* renamed from: d  reason: collision with root package name */
    public Animator f14522d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f14523e;

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14519a, false, 9042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14519a, false, 9042, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f14520b = true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14519a, false, 9045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14519a, false, 9045, new Class[0], Void.TYPE);
        } else if (this.f14520b && this.f14523e) {
            if (this.f14521c != null && this.f14521c.isRunning()) {
                this.f14521c.cancel();
            }
            this.f14522d = ObjectAnimator.ofFloat(this, "translationY", new float[]{getTranslationY(), (float) (-getHeight())});
            this.f14522d.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    LiveFeedFloatTabView.this.f14523e = false;
                }
            });
            this.f14522d.start();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14519a, false, 9046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14519a, false, 9046, new Class[0], Void.TYPE);
        } else if (this.f14520b) {
            if (this.f14521c != null && this.f14521c.isRunning()) {
                this.f14521c.cancel();
            }
            setTranslationY((float) (-getHeight()));
            this.f14523e = false;
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f14519a, false, 9047, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14519a, false, 9047, new Class[0], Void.TYPE);
            return;
        }
        this.f14520b = false;
        if (this.f14521c != null && this.f14521c.isRunning()) {
            this.f14521c.cancel();
        }
        if (this.f14522d != null && this.f14522d.isRunning()) {
            this.f14522d.cancel();
        }
        super.onDetachedFromWindow();
    }

    public LiveFeedFloatTabView(Context context) {
        this(context, null);
    }

    public void setTabList(List<g> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f14519a, false, 9043, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f14519a, false, 9043, new Class[]{List.class}, Void.TYPE);
            return;
        }
        setTitles(list);
    }

    public LiveFeedFloatTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveFeedFloatTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
