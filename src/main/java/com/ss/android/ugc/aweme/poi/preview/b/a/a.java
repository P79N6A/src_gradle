package com.ss.android.ugc.aweme.poi.preview.b.a;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.poi.preview.b.b;
import com.ss.android.ugc.aweme.poi.preview.view.indicator.NumberIndicator;
import com.ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator;
import kotlin.jvm.internal.Intrinsics;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60132a;

    /* renamed from: b  reason: collision with root package name */
    private View f60133b;

    /* renamed from: c  reason: collision with root package name */
    private NumberIndicator f60134c;

    /* renamed from: d  reason: collision with root package name */
    private TitleIndicator f60135d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.ugc.aweme.poi.preview.b.a f60136e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60132a, false, 65406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60132a, false, 65406, new Class[0], Void.TYPE);
        } else if (this.f60133b != null) {
            this.f60133b.setVisibility(8);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60132a, false, 65407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60132a, false, 65407, new Class[0], Void.TYPE);
        } else if (this.f60133b != null) {
            ViewGroup viewGroup = (ViewGroup) this.f60133b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f60133b);
            }
        }
    }

    public final void a(ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f60132a, false, 65405, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f60132a, false, 65405, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.f60133b.setVisibility(0);
        this.f60134c.setViewPager(viewPager2);
        if (this.f60135d != null) {
            TitleIndicator titleIndicator = this.f60135d;
            com.ss.android.ugc.aweme.poi.preview.b.a aVar = this.f60136e;
            if (PatchProxy.isSupport(new Object[]{viewPager2, aVar}, titleIndicator, TitleIndicator.f60280a, false, 65606, new Class[]{ViewPager.class, com.ss.android.ugc.aweme.poi.preview.b.a.class}, Void.TYPE)) {
                TitleIndicator titleIndicator2 = titleIndicator;
                PatchProxy.accessDispatch(new Object[]{viewPager2, aVar}, titleIndicator2, TitleIndicator.f60280a, false, 65606, new Class[]{ViewPager.class, com.ss.android.ugc.aweme.poi.preview.b.a.class}, Void.TYPE);
                return;
            }
            Context context = titleIndicator.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            titleIndicator.setTextColor(context.getResources().getColor(C0906R.color.ou));
            titleIndicator.setTextSize(17.0f);
            titleIndicator.f60281b = aVar;
            if (!(viewPager2 == null || viewPager.getAdapter() == null || titleIndicator.f60281b == null)) {
                titleIndicator.setVisibility(0);
                viewPager2.removeOnPageChangeListener(titleIndicator.f60282c);
                viewPager2.addOnPageChangeListener(titleIndicator.f60282c);
                titleIndicator.f60282c.onPageSelected(viewPager.getCurrentItem());
            }
        }
    }

    public final void a(FrameLayout frameLayout, com.ss.android.ugc.aweme.poi.preview.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{frameLayout, aVar}, this, f60132a, false, 65404, new Class[]{FrameLayout.class, com.ss.android.ugc.aweme.poi.preview.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{frameLayout, aVar}, this, f60132a, false, 65404, new Class[]{FrameLayout.class, com.ss.android.ugc.aweme.poi.preview.b.a.class}, Void.TYPE);
            return;
        }
        this.f60136e = aVar;
        this.f60133b = LayoutInflater.from(frameLayout.getContext()).inflate(C0906R.layout.a7p, null);
        this.f60134c = (NumberIndicator) this.f60133b.findViewById(C0906R.id.c5l);
        this.f60135d = (TitleIndicator) this.f60133b.findViewById(C0906R.id.c5o);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(this.f60133b, layoutParams);
    }
}
