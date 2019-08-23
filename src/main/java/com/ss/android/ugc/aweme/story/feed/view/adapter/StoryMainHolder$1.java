package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.view.widget.StoryAuthorWidget;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;

class StoryMainHolder$1 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72713a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f72714b;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f2, int i2) {
    }

    StoryMainHolder$1(c cVar) {
        this.f72714b = cVar;
    }

    public void onPageSelected(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72713a, false, 83996, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72713a, false, 83996, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f72714b.f72721b != null) {
            if (this.f72714b.k != null) {
                StoryAuthorWidget storyAuthorWidget = this.f72714b.k;
                b b2 = this.f72714b.f72724e.b(i2);
                if (PatchProxy.isSupport(new Object[]{b2}, storyAuthorWidget, StoryAuthorWidget.f72900a, false, 84248, new Class[]{b.class}, Void.TYPE)) {
                    StoryAuthorWidget storyAuthorWidget2 = storyAuthorWidget;
                    PatchProxy.accessDispatch(new Object[]{b2}, storyAuthorWidget2, StoryAuthorWidget.f72900a, false, 84248, new Class[]{b.class}, Void.TYPE);
                } else if (b2 != null) {
                    storyAuthorWidget.q = b2;
                    storyAuthorWidget.e();
                }
            }
            this.f72714b.a(i2);
            if (g.a(this.f72714b.f72725f, StoryChange.c(this.f72714b.f72721b.getActivity()))) {
                c cVar = this.f72714b;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, cVar, c.f72720a, false, 83951, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, cVar2, c.f72720a, false, 83951, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (cVar.f72725f != null) {
                    long j = (long) i2;
                    if (j < cVar.f72725f.getCurPos()) {
                        cVar.b();
                    } else if (j > cVar.f72725f.getLastPos()) {
                        cVar.a();
                    } else if (j - cVar.f72725f.getCurPos() <= 3) {
                        cVar.b();
                    } else if (cVar.f72725f.getLastPos() - j <= 3) {
                        cVar.a();
                    }
                }
            }
            StoryChange.a(this.f72714b.f72721b.getActivity(), g.a(this.f72714b.f72725f), i2);
        }
    }
}
