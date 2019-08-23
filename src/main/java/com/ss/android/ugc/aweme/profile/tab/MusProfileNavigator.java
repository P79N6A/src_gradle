package com.ss.android.ugc.aweme.profile.tab;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.common.internal.Preconditions;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter;

public class MusProfileNavigator extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61678a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f61679b;

    /* renamed from: c  reason: collision with root package name */
    public View f61680c;

    /* renamed from: d  reason: collision with root package name */
    boolean f61681d;

    /* renamed from: e  reason: collision with root package name */
    FragmentPagerAdapter f61682e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f61683f = true;
    private int g;

    public interface a {
        void j(int i);

        void k(int i);
    }

    private boolean a() {
        if (this.g == 1) {
            return true;
        }
        return false;
    }

    public int getTabCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f61678a, false, 67663, new Class[0], Integer.TYPE)) {
            return this.f61679b.getChildCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f61678a, false, 67663, new Class[0], Integer.TYPE)).intValue();
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f61678a, false, 67660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61678a, false, 67660, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f61679b = (LinearLayout) findViewById(C0906R.id.cyn);
    }

    public void setScrollable(boolean z) {
        this.f61683f = z;
    }

    public MusProfileNavigator(Context context) {
        super(context);
    }

    public final View a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61678a, false, 67664, new Class[]{Integer.TYPE}, View.class)) {
            return this.f61679b.getChildAt(i);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61678a, false, 67664, new Class[]{Integer.TYPE}, View.class);
    }

    public MusProfileNavigator(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusProfileNavigator(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private void a(c cVar, int i, int i2) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f61678a, false, 67662, new Class[]{c.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f61678a, false, 67662, new Class[]{c.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i != i2 - 1) {
            View view = new View(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 0.5f), (int) UIUtils.dip2Px(getContext(), 16.0f));
            layoutParams.addRule(15);
            layoutParams.addRule(11);
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(getResources().getColor(C0906R.color.r));
            cVar2.addView(view);
        }
    }

    public final void a(ViewPager viewPager, boolean z, boolean z2, a aVar) {
        int i;
        int i2;
        int i3;
        int i4;
        final ViewPager viewPager2 = viewPager;
        boolean z3 = z2;
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{viewPager2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), aVar2}, this, f61678a, false, 67661, new Class[]{ViewPager.class, Boolean.TYPE, Boolean.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, Byte.valueOf(z), Byte.valueOf(z2), aVar2}, this, f61678a, false, 67661, new Class[]{ViewPager.class, Boolean.TYPE, Boolean.TYPE, a.class}, Void.TYPE);
            return;
        }
        Preconditions.checkNotNull(viewPager);
        Preconditions.checkNotNull(viewPager.getAdapter());
        this.f61682e = (FragmentPagerAdapter) viewPager.getAdapter();
        if (this.f61682e.getCount() > 0) {
            this.f61681d = z3;
            this.f61679b.removeAllViews();
            int count = this.f61682e.getCount();
            if (count == 4) {
                this.g = 1;
            } else {
                this.g = 0;
            }
            for (final int i5 = 0; i5 < count; i5++) {
                if (!z3 || !(this.f61682e instanceof ProfileFragmentAdapter)) {
                    i = (int) this.f61682e.getItemId(i5);
                } else {
                    i = ((ProfileFragmentAdapter) this.f61682e).c(i5);
                }
                if (i != 3) {
                    switch (i) {
                        case 0:
                            Context context = getContext();
                            int i6 = this.g;
                            LinearLayout linearLayout = this.f61679b;
                            if (!a()) {
                                i3 = 2130839349;
                            } else {
                                i3 = C0906R.string.du_;
                            }
                            c a2 = a.a(context, i6, linearLayout, i3);
                            a2.setOnClickListener(new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f61689a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f61689a, false, 67667, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f61689a, false, 67667, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    if (MusProfileNavigator.this.f61683f) {
                                        if (aVar2 != null) {
                                            aVar2.k(0);
                                        }
                                        viewPager2.setCurrentItem(i5);
                                    }
                                }
                            });
                            a(a2, i5, count);
                            this.f61679b.addView(a2);
                            break;
                        case 1:
                            Context context2 = getContext();
                            int i7 = this.g;
                            LinearLayout linearLayout2 = this.f61679b;
                            if (!a()) {
                                i4 = 2130839350;
                            } else {
                                i4 = C0906R.string.b5j;
                            }
                            c a3 = a.a(context2, i7, linearLayout2, i4);
                            a3.setOnClickListener(new View.OnClickListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f61694a;

                                public final void onClick(View view) {
                                    if (PatchProxy.isSupport(new Object[]{view}, this, f61694a, false, 67668, new Class[]{View.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{view}, this, f61694a, false, 67668, new Class[]{View.class}, Void.TYPE);
                                        return;
                                    }
                                    ClickInstrumentation.onClick(view);
                                    if (MusProfileNavigator.this.f61683f) {
                                        if (aVar2 != null) {
                                            aVar2.k(1);
                                        }
                                        viewPager2.setCurrentItem(i5);
                                    }
                                }
                            });
                            a(a3, i5, count);
                            this.f61679b.addView(a3);
                            break;
                        default:
                            throw new IllegalArgumentException("unknown aweme list type: " + i);
                    }
                } else {
                    Context context3 = getContext();
                    int i8 = this.g;
                    LinearLayout linearLayout3 = this.f61679b;
                    if (!a()) {
                        i2 = 2130839147;
                    } else {
                        i2 = C0906R.string.bee;
                    }
                    c a4 = a.a(context3, i8, linearLayout3, i2);
                    this.f61680c = a4;
                    a4.setSelected(true);
                    a4.setOnClickListener(new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61684a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f61684a, false, 67666, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f61684a, false, 67666, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (MusProfileNavigator.this.f61683f) {
                                if (aVar2 != null) {
                                    aVar2.k(3);
                                }
                                viewPager2.setCurrentItem(i5);
                            }
                        }
                    });
                    a(a4, i5, count);
                    this.f61679b.addView(a4);
                }
            }
            c cVar = (c) a(0);
            if (cVar != null) {
                this.f61680c = cVar;
                cVar.setSelected(true);
            }
            viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61699a;

                public void onPageScrollStateChanged(int i) {
                }

                public void onPageScrolled(int i, float f2, int i2) {
                }

                public void onPageSelected(int i) {
                    int i2;
                    int i3;
                    int i4 = i;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61699a, false, 67669, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61699a, false, 67669, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    View childAt = MusProfileNavigator.this.f61679b.getChildAt(i4);
                    if (MusProfileNavigator.this.f61680c != null) {
                        MusProfileNavigator.this.f61680c.setSelected(false);
                    }
                    if (childAt != null) {
                        childAt.setSelected(true);
                        MusProfileNavigator.this.f61680c = childAt;
                    }
                    if (aVar2 != null) {
                        a aVar = aVar2;
                        MusProfileNavigator musProfileNavigator = MusProfileNavigator.this;
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, musProfileNavigator, MusProfileNavigator.f61678a, false, 67665, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                            MusProfileNavigator musProfileNavigator2 = musProfileNavigator;
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, musProfileNavigator2, MusProfileNavigator.f61678a, false, 67665, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                        } else if (musProfileNavigator.f61682e == null || musProfileNavigator.f61682e.getCount() <= i4) {
                            i2 = 0;
                        } else {
                            if (!musProfileNavigator.f61681d || !(musProfileNavigator.f61682e instanceof ProfileFragmentAdapter)) {
                                i3 = (int) musProfileNavigator.f61682e.getItemId(i4);
                            } else {
                                i3 = ((ProfileFragmentAdapter) musProfileNavigator.f61682e).c(i4);
                            }
                            i2 = i3;
                        }
                        aVar.j(i2);
                    }
                }
            });
        }
    }
}
