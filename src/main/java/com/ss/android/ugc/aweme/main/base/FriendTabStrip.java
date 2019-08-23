package com.ss.android.ugc.aweme.main.base;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout;

public class FriendTabStrip extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54372a;

    /* renamed from: b  reason: collision with root package name */
    public CommonTabLayout f54373b;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager f54374c;

    /* renamed from: d  reason: collision with root package name */
    private Context f54375d;

    public CommonTabLayout getTabLayout() {
        return this.f54373b;
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f54372a, false, 57736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54372a, false, 57736, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
    }

    public FriendTabStrip(Context context) {
        this(context, null);
    }

    public void setViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f54372a, false, 57734, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f54372a, false, 57734, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.f54374c = viewPager;
        if (PatchProxy.isSupport(new Object[0], this, f54372a, false, 57735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54372a, false, 57735, new Class[0], Void.TYPE);
            return;
        }
        this.f54373b.setTabMargin(16);
        this.f54373b.setupWithViewPager(this.f54374c);
    }

    public FriendTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FriendTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54375d = context;
        if (PatchProxy.isSupport(new Object[0], this, f54372a, false, 57737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54372a, false, 57737, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a5y, this, true);
        this.f54373b = (CommonTabLayout) findViewById(C0906R.id.cyz);
        this.f54373b.a((CommonTabLayout.b) new CommonTabLayout.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54376a;

            public final void c(CommonTabLayout.e eVar) {
            }

            public final void a(CommonTabLayout.e eVar) {
                CommonTabLayout.e eVar2 = eVar;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f54376a, false, 57739, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f54376a, false, 57739, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
                    return;
                }
                CommonTabLayout.f fVar = eVar2.i;
                if (!(fVar == null || fVar.getTextView() == null)) {
                    fVar.getTextView().setTypeface(Typeface.defaultFromStyle(1));
                }
            }

            public final void b(CommonTabLayout.e eVar) {
                CommonTabLayout.e eVar2 = eVar;
                if (PatchProxy.isSupport(new Object[]{eVar2}, this, f54376a, false, 57740, new Class[]{CommonTabLayout.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar2}, this, f54376a, false, 57740, new Class[]{CommonTabLayout.e.class}, Void.TYPE);
                    return;
                }
                CommonTabLayout.f fVar = eVar2.i;
                if (!(fVar == null || fVar.getTextView() == null)) {
                    fVar.getTextView().setTypeface(Typeface.defaultFromStyle(0));
                }
            }
        });
    }
}
