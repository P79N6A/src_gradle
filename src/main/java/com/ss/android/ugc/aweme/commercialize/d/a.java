package com.ss.android.ugc.aweme.commercialize.d;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.main.story.live.a.c;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38650a;

    /* renamed from: b  reason: collision with root package name */
    TextView f38651b;

    /* renamed from: c  reason: collision with root package name */
    TextView f38652c;

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(AbsLiveStoryItemView absLiveStoryItemView) {
        if (PatchProxy.isSupport(new Object[]{absLiveStoryItemView}, this, f38650a, false, 30978, new Class[]{AbsLiveStoryItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absLiveStoryItemView}, this, f38650a, false, 30978, new Class[]{AbsLiveStoryItemView.class}, Void.TYPE);
            return;
        }
        super.a(absLiveStoryItemView);
        if (absLiveStoryItemView instanceof d) {
            View rootView = absLiveStoryItemView.getRootView();
            this.f38651b = (TextView) rootView.findViewById(C0906R.id.awi);
            this.f38652c = (TextView) rootView.findViewById(C0906R.id.awj);
        }
    }

    public final void a(@ColorInt int i, @ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38650a, false, 30979, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38650a, false, 30979, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LiveCircleView liveCircleView = this.f54967e;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, liveCircleView, LiveCircleView.f46206a, false, 42870, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = LiveCircleView.f46206a;
            Object[] objArr2 = objArr;
            LiveCircleView liveCircleView2 = liveCircleView;
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            PatchProxy.accessDispatch(objArr2, liveCircleView2, changeQuickRedirect2, false, 42870, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, Shader.TileMode.MIRROR);
            liveCircleView.f46207b.setShader(linearGradient);
            liveCircleView.f46208c.setShader(linearGradient);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke((int) UIUtils.dip2Px(this.f38651b.getContext(), 1.0f), -16777216);
        gradientDrawable.setCornerRadius(UIUtils.dip2Px(this.f38651b.getContext(), 3.0f));
        this.f38651b.setBackground(gradientDrawable);
    }
}
