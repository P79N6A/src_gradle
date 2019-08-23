package com.ss.android.ugc.aweme.story.base.view.viewpager;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter;
import com.ss.android.ugc.aweme.story.feed.viewmodel.PageSelectViewModel;
import com.ss.android.ugc.aweme.story.player.c;

public class RollViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72080a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f72081b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f72082c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f72083d = true;

    /* renamed from: e  reason: collision with root package name */
    private a f72084e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f72085f;

    public interface a {
    }

    public void setCanScroll(boolean z) {
        this.f72085f = z;
    }

    public void setFirstOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f72082c = onPageChangeListener;
    }

    public void setFragment(Fragment fragment) {
        this.f72081b = fragment;
    }

    public void setLoadMore(a aVar) {
        this.f72084e = aVar;
    }

    public RollViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f72080a, false, 82588, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f72080a, false, 82588, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f72085f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f72080a, false, 82589, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f72080a, false, 82589, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f72085f || !super.onTouchEvent(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    public RollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
        if (PatchProxy.isSupport(new Object[0], this, f72080a, false, 82587, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72080a, false, 82587, new Class[0], Void.TYPE);
            return;
        }
        addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72086a;

            /* renamed from: b  reason: collision with root package name */
            int f72087b = -1;

            /* renamed from: d  reason: collision with root package name */
            private boolean f72089d;

            /* renamed from: e  reason: collision with root package name */
            private int f72090e;

            public void onPageScrollStateChanged(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72086a, false, 82595, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72086a, false, 82595, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (RollViewPager.this.f72082c != null) {
                    RollViewPager.this.f72082c.onPageScrollStateChanged(i);
                }
            }

            public void onPageSelected(int i) {
                int i2;
                MutableLiveData<Integer> mutableLiveData;
                int i3 = i;
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72086a, false, 82594, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72086a, false, 82594, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (RollViewPager.this.f72082c != null) {
                    RollViewPager.this.f72082c.onPageSelected(i3);
                }
                c.d().a();
                if (i3 < this.f72090e) {
                    z = false;
                }
                this.f72089d = z;
                this.f72087b = i3;
                if (this.f72089d) {
                    i2 = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
                PageSelectViewModel pageSelectViewModel = (PageSelectViewModel) ViewModelProviders.of(RollViewPager.this.f72081b).get(PageSelectViewModel.class);
                if (PatchProxy.isSupport(new Object[0], pageSelectViewModel, PageSelectViewModel.f72990a, false, 84381, new Class[0], MutableLiveData.class)) {
                    mutableLiveData = (MutableLiveData) PatchProxy.accessDispatch(new Object[0], pageSelectViewModel, PageSelectViewModel.f72990a, false, 84381, new Class[0], MutableLiveData.class);
                } else {
                    if (pageSelectViewModel.f72991b == null) {
                        pageSelectViewModel.f72991b = new MutableLiveData<>();
                        pageSelectViewModel.f72991b.setValue(0);
                    }
                    mutableLiveData = pageSelectViewModel.f72991b;
                }
                mutableLiveData.setValue(Integer.valueOf(i));
                for (int i4 = 0; i4 < RollViewPager.this.getChildCount(); i4++) {
                    com.ss.android.ugc.aweme.story.feed.view.adapter.a aVar = (com.ss.android.ugc.aweme.story.feed.view.adapter.a) RollViewPager.this.getChildAt(i4).getTag();
                    if (aVar != null) {
                        if (g.a(aVar.j(), ((StoryFeedPagerAdapter) RollViewPager.this.getAdapter()).b(i2))) {
                            aVar.e();
                        } else if (g.a(aVar.j(), ((StoryFeedPagerAdapter) RollViewPager.this.getAdapter()).b(i3))) {
                            aVar.d();
                        }
                    }
                }
            }

            public void onPageScrolled(int i, float f2, int i2) {
                int i3 = i;
                float f3 = f2;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f72086a, false, 82593, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f72086a, false, 82593, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (RollViewPager.this.f72082c != null) {
                    RollViewPager.this.f72082c.onPageScrolled(i, f3, i2);
                }
                if (i3 == this.f72087b && f3 < 1.0E-10f) {
                    this.f72090e = i3;
                    this.f72087b = -1;
                }
            }
        });
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72080a, false, 82592, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72080a, false, 82592, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException unused) {
            return i2;
        }
    }
}
