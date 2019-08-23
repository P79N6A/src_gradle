package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.a.c;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.view.adapter.StoryFeedPagerAdapter;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ViewPagerMotionEventViewModel;
import java.util.Iterator;

public abstract class BaseFeedBottomWidget extends Widget implements Observer<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4153a;

    /* renamed from: b  reason: collision with root package name */
    protected b f4154b;
    protected UserStory k;
    protected StoryFeedPagerAdapter l;
    protected com.ss.android.ugc.aweme.story.feed.view.adapter.a m;
    public com.ss.android.ugc.aweme.story.feed.view.ui.a n;
    public boolean o;
    private d p;

    public boolean a(boolean z) {
        return true;
    }

    public boolean b(boolean z) {
        return true;
    }

    public void e() {
    }

    public abstract int i();

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84227, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84227, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.m();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84228, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84228, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.l();
        }
    }

    public final boolean j() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84232, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84232, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.k != null && this.k.getFriendType() == 4) {
            z = true;
        }
        return z;
    }

    public final boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84234, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84234, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.k != null && this.k.getFriendType() == 2) {
            z = true;
        }
        return z;
    }

    public final boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84225, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84225, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (c() == null) {
            return false;
        } else {
            b b2 = StoryChange.b((FragmentActivity) c());
            if (b2 != null && g.a(b2, this.f4154b)) {
                z = true;
            }
            return z;
        }
    }

    public final boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84233, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84233, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k == null || (this.k.getFriendType() != 1 && this.k.getFriendType() != 0)) {
            return false;
        } else {
            return true;
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84223, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84223, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84224, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84224, new Class[0], Void.TYPE);
        } else {
            this.g.a("story_feed_data", (Observer<a>) this).a("story_feed_page_selected", (Observer<a>) this).a("story_feed_page_unselected", (Observer<a>) this).a("story_show_loading", (Observer<a>) this).a("story_hide_loading", (Observer<a>) this);
            ((ViewPagerMotionEventViewModel) ViewModelProviders.of((FragmentActivity) c()).get(ViewPagerMotionEventViewModel.class)).a().observe(a(), new Observer<c>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72896a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    c cVar = (c) obj;
                    if (PatchProxy.isSupport(new Object[]{cVar}, this, f72896a, false, 84235, new Class[]{c.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{cVar}, this, f72896a, false, 84235, new Class[]{c.class}, Void.TYPE);
                        return;
                    }
                    if (cVar != null) {
                        int i = cVar.f72457c;
                        if (i != 2) {
                            switch (i) {
                                case 4:
                                    if (BaseFeedBottomWidget.this.f() && !BaseFeedBottomWidget.this.o && BaseFeedBottomWidget.this.n.a(BaseFeedBottomWidget.this.f2711f, false, 200)) {
                                        BaseFeedBottomWidget.this.o = true;
                                        return;
                                    }
                                case 5:
                                    if (BaseFeedBottomWidget.this.f()) {
                                        BaseFeedBottomWidget.this.e();
                                        break;
                                    }
                                    break;
                                case 6:
                                    break;
                            }
                        }
                        if (BaseFeedBottomWidget.this.o) {
                            BaseFeedBottomWidget.this.n.a(BaseFeedBottomWidget.this.f2711f, true, 200);
                            BaseFeedBottomWidget.this.o = false;
                        }
                    }
                }
            });
        }
        this.n = new com.ss.android.ugc.aweme.story.feed.view.ui.a();
        this.p = (d) ServiceManager.get().getService(d.class);
    }

    public void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f4153a, false, 84226, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f4153a, false, 84226, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        LayoutInflater.from(this.f2709d).inflate(i(), (ViewGroup) view);
        this.l = (StoryFeedPagerAdapter) this.g.a("story_feed_adapter");
        this.m = (com.ss.android.ugc.aweme.story.feed.view.adapter.a) this.g.a("story_view_holder");
    }

    /* renamed from: a */
    public void onChanged(@Nullable a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f4153a, false, 84229, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f4153a, false, 84229, new Class[]{a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            if (TextUtils.equals(aVar2.f34376a, "story_feed_data")) {
                b bVar = (b) aVar.a();
                if (bVar != null) {
                    a(bVar);
                }
            }
        }
    }

    public void a(b bVar) {
        UserStory userStory;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f4153a, false, 84230, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f4153a, false, 84230, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.f4154b = bVar;
        if (PatchProxy.isSupport(new Object[0], this, f4153a, false, 84231, new Class[0], UserStory.class)) {
            userStory = (UserStory) PatchProxy.accessDispatch(new Object[0], this, f4153a, false, 84231, new Class[0], UserStory.class);
        } else {
            com.ss.android.ugc.aweme.story.feed.model.a aVar = (com.ss.android.ugc.aweme.story.feed.model.a) LifeFeedModel.a((FragmentActivity) c()).c().getValue();
            if (aVar != null) {
                Iterator<UserStory> it2 = aVar.getUserStoryList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    UserStory next = it2.next();
                    if (next.getAwemeList() != null && next.getAwemeList().contains(this.f4154b)) {
                        userStory = next;
                        break;
                    }
                }
            }
            userStory = null;
        }
        this.k = userStory;
        boolean a2 = a(j());
        boolean b2 = b(l());
        View view = this.f2711f;
        if (!a2 || !b2) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
