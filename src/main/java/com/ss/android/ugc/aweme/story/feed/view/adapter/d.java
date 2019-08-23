package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.model.a;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import java.util.Iterator;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72736a;

    /* renamed from: b  reason: collision with root package name */
    protected b f72737b;

    /* renamed from: c  reason: collision with root package name */
    protected Fragment f72738c;

    /* renamed from: d  reason: collision with root package name */
    protected View f72739d;

    /* renamed from: e  reason: collision with root package name */
    private StoryFeedPagerAdapter f72740e;

    public final void e() {
    }

    public final void f() {
    }

    public final void h() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public final void m() {
    }

    public final void n() {
    }

    public final void o() {
    }

    public final b j() {
        return this.f72737b;
    }

    public final View p() {
        return this.f72739d;
    }

    public final String i() {
        if (!PatchProxy.isSupport(new Object[0], this, f72736a, false, 84014, new Class[0], String.class)) {
            return this.f72737b.getStoryId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f72736a, false, 84014, new Class[0], String.class);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f72736a, false, 84015, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72736a, false, 84015, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = this.f72738c.getActivity();
        if (activity != null && !activity.isFinishing()) {
            a aVar = (a) LifeFeedModel.a(activity).d();
            if (aVar != null) {
                Iterator<UserStory> it2 = aVar.getUserStoryList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    UserStory next = it2.next();
                    if (next.getAwemeList().contains(this.f72737b)) {
                        if (!g.a(StoryChange.c(activity), next)) {
                            if (PatchProxy.isSupport(new Object[]{activity, next}, null, StoryChange.f72992a, true, 84386, new Class[]{FragmentActivity.class, UserStory.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{activity, next}, null, StoryChange.f72992a, true, 84386, new Class[]{FragmentActivity.class, UserStory.class}, Void.TYPE);
                            } else if (activity != null && !activity.isFinishing()) {
                                StoryChange.a(activity).f72993b.setValue(next);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(b bVar) {
        this.f72737b = bVar;
    }

    public d(View view, Fragment fragment, StoryFeedPagerAdapter storyFeedPagerAdapter) {
        this.f72738c = fragment;
        this.f72739d = view;
        this.f72740e = storyFeedPagerAdapter;
    }
}
