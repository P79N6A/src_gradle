package com.ss.android.ugc.aweme.story.feed.jedi;

import android.support.v4.view.ViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolder2$initView$1", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "i", "", "onPageScrolled", "v", "", "i1", "onPageSelected", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryMainHolder2$initView$1 implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72597a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StoryMainHolder2 f72598b;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f2, int i2) {
    }

    StoryMainHolder2$initView$1(StoryMainHolder2 storyMainHolder2) {
        this.f72598b = storyMainHolder2;
    }

    public final void onPageSelected(int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72597a, false, 83395, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72597a, false, 83395, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        StoryAuthorJediWidget storyAuthorJediWidget = this.f72598b.i;
        b b2 = this.f72598b.f72585f.b(i2);
        if (PatchProxy.isSupport(new Object[]{b2}, storyAuthorJediWidget, StoryAuthorJediWidget.f72526a, false, 83252, new Class[]{b.class}, Void.TYPE)) {
            StoryAuthorJediWidget storyAuthorJediWidget2 = storyAuthorJediWidget;
            PatchProxy.accessDispatch(new Object[]{b2}, storyAuthorJediWidget2, StoryAuthorJediWidget.f72526a, false, 83252, new Class[]{b.class}, Void.TYPE);
        } else if (b2 != null) {
            storyAuthorJediWidget.o = b2;
            storyAuthorJediWidget.h();
        }
        this.f72598b.a(i2);
        UserStory p = this.f72598b.p();
        if (g.f72503b.a(p, StoryChange.c(this.f72598b.k.requireActivity()))) {
            StoryMainHolder2 storyMainHolder2 = this.f72598b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, storyMainHolder2, StoryMainHolder2.f72581b, false, 83362, new Class[]{Integer.TYPE}, Void.TYPE)) {
                StoryMainHolder2 storyMainHolder22 = storyMainHolder2;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, storyMainHolder22, StoryMainHolder2.f72581b, false, 83362, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                UserStory p2 = storyMainHolder2.p();
                long j = (long) i2;
                if (j < p2.getCurPos()) {
                    storyMainHolder2.n();
                } else if (j > p2.getLastPos()) {
                    storyMainHolder2.m();
                } else if (j - p2.getCurPos() <= 3) {
                    storyMainHolder2.n();
                } else if (p2.getLastPos() - j <= 3) {
                    storyMainHolder2.m();
                }
            }
        }
        StoryChange.a(this.f72598b.k.requireActivity(), g.f72503b.b(p), i2);
    }
}
