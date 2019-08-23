package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.WidgetManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.base.view.viewpager.RollViewPager;
import com.ss.android.ugc.aweme.story.feed.b.f;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.model.LifeFeedModel;
import com.ss.android.ugc.aweme.story.feed.view.ui.StoryProgressViewReal;
import com.ss.android.ugc.aweme.story.feed.view.ui.a;
import com.ss.android.ugc.aweme.story.feed.view.widget.StoryAuthorWidget;
import com.ss.android.ugc.aweme.story.feed.view.widget.d;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ViewPagerMotionEventViewModel;
import com.ss.android.ugc.aweme.story.metrics.m;
import com.ss.android.ugc.aweme.story.player.b;
import com.ss.android.ugc.aweme.video.e;
import java.util.List;

public class c implements RollViewPager.a, com.ss.android.ugc.aweme.story.feed.b.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72720a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f72721b;

    /* renamed from: c  reason: collision with root package name */
    public RollViewPager f72722c;

    /* renamed from: d  reason: collision with root package name */
    public StoryProgressViewReal f72723d;

    /* renamed from: e  reason: collision with root package name */
    public StoryFeedPagerAdapter f72724e;

    /* renamed from: f  reason: collision with root package name */
    public UserStory f72725f;
    public f g;
    ViewPager h;
    public View i;
    public a j;
    public StoryAuthorWidget k;
    private View l;
    private DataCenter m;
    private WidgetManager n;
    private com.ss.android.ugc.aweme.story.api.model.f o;
    private b p = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72726a;

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72726a, false, 83997, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72726a, false, 83997, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            if (c.this.e()) {
                c.this.f72723d.e(c.this.c());
            }
        }

        public final void b(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72726a, false, 83999, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72726a, false, 83999, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.b(str);
            if (c.this.a(str)) {
                c.this.f72723d.c(c.this.c());
            }
        }

        public final void c(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72726a, false, 84001, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72726a, false, 84001, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.c(str);
            if (c.this.a(str)) {
                c.this.f72723d.a(c.this.c());
            }
        }

        public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72726a, false, 84003, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f72726a, false, 84003, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
                return;
            }
            super.a(aVar);
            if (c.this.a(aVar.f76010a)) {
                c.this.f72723d.setMCanUpdate(true);
                c.this.f72723d.a(aVar.f76012c, c.this.c());
                return;
            }
            c.this.f72723d.setMCanUpdate(false);
        }

        public final void b(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72726a, false, 84002, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72726a, false, 84002, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.b(z);
            if (c.this.e()) {
                c.this.f72723d.b(c.this.c());
            }
        }

        public final void a(e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f72726a, false, 83998, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f72726a, false, 83998, new Class[]{e.class}, Void.TYPE);
                return;
            }
            super.a(eVar);
            c.this.f72723d.a();
        }

        public final void a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f72726a, false, 84000, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f72726a, false, 84000, new Class[]{String.class}, Void.TYPE);
                return;
            }
            super.a(str);
            if (c.this.a(str)) {
                c.this.f72723d.d(c.this.c());
            }
        }
    };

    public final void a(Throwable th) {
    }

    public final void d() {
    }

    public boolean g() {
        if (this.o == null || (this.o.detailType != 2 && this.o.detailType != 6)) {
            return false;
        }
        return true;
    }

    private boolean n() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83977, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83977, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f72725f != null && this.f72725f.getCurPos() > 0) {
            z = true;
        }
        return z;
    }

    private void p() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83982, new Class[0], Void.TYPE);
            return;
        }
        final LifeFeedModel lifeFeedModel = (LifeFeedModel) ViewModelProviders.of(this.f72721b).get(LifeFeedModel.class);
        final UserStory userStory = this.g.f72479c;
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72732a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72732a, false, 84006, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72732a, false, 84006, new Class[0], Void.TYPE);
                    return;
                }
                lifeFeedModel.a(userStory);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83952, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83952, new Class[0], Void.TYPE);
            return;
        }
        if (l()) {
            m();
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83953, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83953, new Class[0], Void.TYPE);
            return;
        }
        if (n()) {
            o();
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83988, new Class[0], Void.TYPE);
            return;
        }
        a j2 = j();
        if (j2 != null) {
            j2.k();
        }
    }

    public final a j() {
        if (!PatchProxy.isSupport(new Object[0], this, f72720a, false, 83989, new Class[0], a.class)) {
            return b(this.f72722c.getCurrentItem());
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83989, new Class[0], a.class);
    }

    private boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83948, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83948, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!(this.f72721b == null || this.f72721b.getActivity() == null || this.f72721b.getActivity().isFinishing())) {
            z = true;
        }
        return z;
    }

    private boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83973, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83973, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f72725f != null && this.f72725f.getLastPos() < this.f72725f.getTotalCount() - 1) {
            z = true;
        }
        return z;
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83976, new Class[0], Void.TYPE);
        } else if (g()) {
            this.g.b(this.o.storyId);
        } else {
            this.g.b(com.ss.android.ugc.aweme.story.feed.c.a.a(this.f72725f));
        }
    }

    private void o() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83978, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83978, new Class[0], Void.TYPE);
        } else if (g()) {
            this.g.c(this.o.storyId);
        } else {
            this.g.c(com.ss.android.ugc.aweme.story.feed.c.a.a(this.f72725f));
        }
    }

    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83956, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83956, new Class[0], Long.TYPE)).longValue();
        } else if (this.f72721b.getActivity() == null) {
            return 0;
        } else {
            com.ss.android.ugc.aweme.story.api.model.b b2 = StoryChange.b(this.f72721b.getActivity());
            if (b2 == null) {
                return 0;
            }
            if (b2.getAwemeType() == 15) {
                return com.ss.android.ugc.aweme.story.player.c.d().f73264d;
            }
            return com.ss.android.ugc.aweme.story.player.c.d().b().longValue();
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83962, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83962, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.h == null) {
            return false;
        } else {
            UserStory b2 = ((StoryMainPagerAdapter) this.h.getAdapter()).b(this.h.getCurrentItem());
            if (b2 == null || b2.getUser() == null || this.f72725f == null || this.f72725f.getUser() == null || !TextUtils.equals(b2.getUser().getUid(), this.f72725f.getUser().getUid())) {
                return false;
            }
            return true;
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83967, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83967, new Class[0], Void.TYPE);
            return;
        }
        this.g.a();
        this.g.b();
        this.f72724e.a();
        com.ss.android.ugc.aweme.story.player.c.d().b((com.ss.android.ugc.aweme.video.a.a) this.p);
        int childCount = this.f72722c.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f72722c.getChildAt(i2);
            if (childAt != null) {
                a aVar = (a) childAt.getTag();
                if (aVar != null) {
                    aVar.h();
                }
            }
        }
    }

    public final boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83958, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83958, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f72721b.getActivity() == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.story.api.model.b b2 = StoryChange.b(this.f72721b.getActivity());
            if (PatchProxy.isSupport(new Object[]{b2}, this, f72720a, false, 83959, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{b2}, this, f72720a, false, 83959, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Boolean.TYPE)).booleanValue();
            } else if (b2 == null || CollectionUtils.isEmpty(this.f72724e.f4152f) || !this.f72724e.f4152f.contains(b2)) {
                return false;
            } else {
                return true;
            }
        }
    }

    public final void a(int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72720a, false, 83954, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72720a, false, 83954, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f72724e.g) {
            i3 = i2 - 1;
        } else {
            i3 = i2;
        }
        this.f72723d.setMCanUpdate(true);
        this.f72723d.a((int) this.f72725f.getTotalCount(), i3, com.ss.android.ugc.aweme.story.player.c.d().c());
        this.f72723d.setMCanUpdate(false);
    }

    public a b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72720a, false, 83970, new Class[]{Integer.TYPE}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72720a, false, 83970, new Class[]{Integer.TYPE}, a.class);
        } else if (this.f72722c == null) {
            return null;
        } else {
            int childCount = this.f72722c.getChildCount();
            if (i2 < 0 || i2 >= this.f72724e.getCount()) {
                return null;
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                a aVar = (a) this.f72722c.getChildAt(i3).getTag();
                if (aVar != null && g.a(aVar.j(), this.f72724e.b(i2))) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public final void d(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72720a, false, 83984, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72720a, false, 83984, new Class[]{UserStory.class}, Void.TYPE);
        } else if (k() && userStory != null) {
            this.f72725f = userStory;
            this.f72724e.a(this.f72725f.getAwemeList());
            p();
        }
    }

    public final void a(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72720a, false, 83980, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72720a, false, 83980, new Class[]{UserStory.class}, Void.TYPE);
        } else if (k() && userStory != null) {
            if (this.f72725f == null || g.a(this.f72725f, userStory)) {
                this.f72725f = userStory;
                this.f72724e.a(this.f72725f.getAwemeList());
            }
        }
    }

    public final void b(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f72720a, false, 83983, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f72720a, false, 83983, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        this.f72725f.setHasMore(0);
    }

    public final void c(UserStory userStory) {
        if (PatchProxy.isSupport(new Object[]{userStory}, this, f72720a, false, 83981, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory}, this, f72720a, false, 83981, new Class[]{UserStory.class}, Void.TYPE);
        } else if (k() && userStory != null) {
            this.f72725f = userStory;
            this.f72724e.a(this.f72725f.getAwemeList());
            p();
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72720a, false, 83969, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72720a, false, 83969, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int currentItem = this.f72722c.getCurrentItem();
        a(currentItem);
        a b2 = b(currentItem);
        if (b2 != null) {
            b2.d();
        }
        if (f() && this.o.detailType != 1 && l()) {
            m();
        }
    }

    public final void b(UserStory userStory) {
        int i2;
        CharSequence charSequence;
        UserStory userStory2 = userStory;
        if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72720a, false, 83966, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72720a, false, 83966, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        this.f72725f = userStory2;
        this.g = new f(this);
        this.o = com.ss.android.ugc.aweme.story.feed.c.e.a(this.f72721b.getActivity());
        if (g()) {
            this.g.f72481e = 1;
        }
        this.g.f72479c = userStory2;
        this.f72724e.a(userStory.getAwemeList());
        if (this.f72725f.getReadFlag() == 1) {
            i2 = 0;
        } else {
            List<com.ss.android.ugc.aweme.story.api.model.b> list = this.f72724e.f4152f;
            if (PatchProxy.isSupport(new Object[]{list}, null, g.f72502a, true, 83697, new Class[]{List.class}, Integer.TYPE)) {
                i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{list}, null, g.f72502a, true, 83697, new Class[]{List.class}, Integer.TYPE)).intValue();
            } else {
                i2 = g.f72503b.a(list);
            }
        }
        this.f72722c.setCurrentItem(i2);
        StoryAuthorWidget storyAuthorWidget = this.k;
        if (PatchProxy.isSupport(new Object[]{userStory2}, storyAuthorWidget, StoryAuthorWidget.f72900a, false, 84251, new Class[]{UserStory.class}, Void.TYPE)) {
            StoryAuthorWidget storyAuthorWidget2 = storyAuthorWidget;
            PatchProxy.accessDispatch(new Object[]{userStory2}, storyAuthorWidget2, StoryAuthorWidget.f72900a, false, 84251, new Class[]{UserStory.class}, Void.TYPE);
        } else if (!(userStory2 == null || userStory.getUser() == null)) {
            storyAuthorWidget.r = userStory2;
            storyAuthorWidget.s = userStory.getUser();
            if (PatchProxy.isSupport(new Object[0], storyAuthorWidget, StoryAuthorWidget.f72900a, false, 84253, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyAuthorWidget, StoryAuthorWidget.f72900a, false, 84253, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.base.c.b(storyAuthorWidget.l, storyAuthorWidget.s.getAvatarMedium());
                storyAuthorWidget.l.setOnClickListener(new com.ss.android.ugc.aweme.story.feed.view.widget.b(storyAuthorWidget));
                DmtTextView dmtTextView = storyAuthorWidget.m;
                User user = storyAuthorWidget.s;
                if (PatchProxy.isSupport(new Object[]{user}, null, g.f72502a, true, 83727, new Class[]{User.class}, CharSequence.class)) {
                    charSequence = (CharSequence) PatchProxy.accessDispatch(new Object[]{user}, null, g.f72502a, true, 83727, new Class[]{User.class}, CharSequence.class);
                } else {
                    charSequence = g.f72503b.d(user);
                }
                dmtTextView.setText(charSequence);
                storyAuthorWidget.m.setOnClickListener(new com.ss.android.ugc.aweme.story.feed.view.widget.c(storyAuthorWidget));
                storyAuthorWidget.p.setOnClickListener(new d(storyAuthorWidget));
            }
            if (PatchProxy.isSupport(new Object[0], storyAuthorWidget, StoryAuthorWidget.f72900a, false, 84255, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], storyAuthorWidget, StoryAuthorWidget.f72900a, false, 84255, new Class[0], Void.TYPE);
            } else if (!storyAuthorWidget.g() || storyAuthorWidget.h()) {
                storyAuthorWidget.n.setVisibility(8);
            } else {
                storyAuthorWidget.n.setVisibility(0);
                storyAuthorWidget.a(storyAuthorWidget.s.getFollowStatus());
                storyAuthorWidget.n.setOnClickListener(new com.ss.android.ugc.aweme.story.feed.view.widget.e(storyAuthorWidget));
            }
            storyAuthorWidget.q = StoryChange.b((FragmentActivity) storyAuthorWidget.c());
            storyAuthorWidget.e();
        }
        com.ss.android.ugc.aweme.story.player.c.d().a((com.ss.android.ugc.aweme.video.a.a) this.p);
        this.f72722c.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72730a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72730a, false, 84005, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72730a, false, 84005, new Class[0], Void.TYPE);
                    return;
                }
                if (!(c.this.f72721b == null || c.this.f72721b.getActivity() == null)) {
                    c.this.f72721b.getActivity().supportStartPostponedEnterTransition();
                }
            }
        });
    }

    public final boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f72720a, false, 83957, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f72720a, false, 83957, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f72721b.getActivity() == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.story.api.model.b b2 = StoryChange.b(this.f72721b.getActivity());
            if (b2 != null) {
                return TextUtils.equals(b2.getStoryId(), str);
            }
            return false;
        }
    }

    public c(View view, Fragment fragment, ViewPager viewPager) {
        this.f72721b = fragment;
        this.l = view;
        this.h = viewPager;
        this.j = new a();
        if (PatchProxy.isSupport(new Object[]{view}, this, f72720a, false, 83950, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72720a, false, 83950, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f72722c = (RollViewPager) view.findViewById(C0906R.id.duu);
            this.f72722c.setFragment(this.f72721b);
            this.f72722c.setLoadMore(this);
            if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83961, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83961, new Class[0], Void.TYPE);
            } else {
                ((ViewPagerMotionEventViewModel) ViewModelProviders.of(this.f72721b.getActivity()).get(ViewPagerMotionEventViewModel.class)).a().observe(this.f72721b, new Observer<com.ss.android.ugc.aweme.story.feed.a.c>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72728a;

                    public final /* synthetic */ void onChanged(@Nullable Object obj) {
                        String str;
                        com.ss.android.ugc.aweme.story.feed.a.c cVar = (com.ss.android.ugc.aweme.story.feed.a.c) obj;
                        if (PatchProxy.isSupport(new Object[]{cVar}, this, f72728a, false, 84004, new Class[]{com.ss.android.ugc.aweme.story.feed.a.c.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{cVar}, this, f72728a, false, 84004, new Class[]{com.ss.android.ugc.aweme.story.feed.a.c.class}, Void.TYPE);
                            return;
                        }
                        if (cVar != null && c.this.f()) {
                            int i = cVar.f72457c;
                            if (i != 6) {
                                switch (i) {
                                    case 1:
                                        a j = c.this.j();
                                        if (j != null) {
                                            j.n();
                                            new m().a("homepage_story").b("long_press").a(j.j()).post();
                                            return;
                                        }
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        c cVar2 = c.this;
                                        boolean z = cVar.f72458d;
                                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, cVar2, c.f72720a, false, 83963, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                            c cVar3 = cVar2;
                                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, cVar3, c.f72720a, false, 83963, new Class[]{Boolean.TYPE}, Void.TYPE);
                                            break;
                                        } else {
                                            if (System.currentTimeMillis() - com.ss.android.ugc.aweme.story.feed.a.c.f72455a >= 100) {
                                                com.ss.android.ugc.aweme.story.feed.a.c.f72455a = System.currentTimeMillis();
                                                if (cVar2.h != null) {
                                                    PagerAdapter adapter = cVar2.h.getAdapter();
                                                    if (adapter != null) {
                                                        int count = adapter.getCount();
                                                        int count2 = cVar2.f72724e.getCount();
                                                        int currentItem = cVar2.h.getCurrentItem();
                                                        int currentItem2 = cVar2.f72722c.getCurrentItem();
                                                        com.ss.android.ugc.aweme.arch.widgets.base.b<String> a2 = ChangeUserModeViewModel.a(cVar2.f72721b.getActivity());
                                                        if (z) {
                                                            str = "click_next";
                                                        } else {
                                                            str = "click_previous";
                                                        }
                                                        a2.setValue(str);
                                                        if (currentItem2 == 0) {
                                                            if (z) {
                                                                if (currentItem2 != count2 - 1) {
                                                                    cVar2.b(z, currentItem2, count2);
                                                                    break;
                                                                } else {
                                                                    cVar2.a(z, currentItem, count);
                                                                    break;
                                                                }
                                                            } else {
                                                                cVar2.a(z, currentItem, count);
                                                                break;
                                                            }
                                                        } else if (currentItem2 == count2 - 1) {
                                                            if (!z) {
                                                                cVar2.b(z, currentItem2, count2);
                                                                break;
                                                            } else {
                                                                cVar2.a(z, currentItem, count);
                                                                break;
                                                            }
                                                        } else {
                                                            cVar2.b(z, currentItem2, count2);
                                                        }
                                                    }
                                                }
                                            }
                                            return;
                                        }
                                    case 4:
                                        if (c.this.e()) {
                                            c.this.j.a(c.this.i, false, 200);
                                            break;
                                        }
                                        break;
                                }
                            }
                            c.this.j.a(c.this.i, true, 200);
                            a j2 = c.this.j();
                            if (j2 != null) {
                                j2.o();
                            }
                        }
                    }
                });
            }
            this.i = view.findViewById(C0906R.id.d57);
            if (PatchProxy.isSupport(new Object[]{view}, this, f72720a, false, 83955, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f72720a, false, 83955, new Class[]{View.class}, Void.TYPE);
            } else {
                this.f72723d = (StoryProgressViewReal) view.findViewById(C0906R.id.c81);
            }
            if (com.ss.android.ugc.aweme.story.base.utils.b.a().b()) {
                int c2 = com.ss.android.ugc.aweme.story.base.utils.b.a().c();
                if (c2 != 0) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
                    layoutParams.topMargin += c2;
                    this.i.setLayoutParams(layoutParams);
                }
            } else if (com.ss.android.ugc.aweme.story.base.utils.c.a(this.i.getContext(), this.l)) {
                int statusBarHeight = UIUtils.getStatusBarHeight(this.i.getContext());
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
                layoutParams2.topMargin += statusBarHeight;
                this.i.setLayoutParams(layoutParams2);
            }
            this.f72722c.setFirstOnPageChangeListener(new StoryMainHolder$1(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f72720a, false, 83949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72720a, false, 83949, new Class[0], Void.TYPE);
        } else {
            this.k = new StoryAuthorWidget(this.f72721b);
            this.m = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a(this.f72721b), (LifecycleOwner) this.f72721b);
            this.n = WidgetManager.a(this.f72721b, this.l);
            this.n.a(this.m);
            this.n.b(C0906R.id.gt, this.k);
        }
        this.f72724e = new StoryFeedPagerAdapter(this.l.getContext(), LayoutInflater.from(this.l.getContext()), this.f72721b, this.f72722c);
        this.f72722c.setAdapter(this.f72724e);
        this.f72722c.setLoadMore(this);
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z, int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72720a, false, 83965, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72720a, false, 83965, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (!z || i4 >= i3 - 1) {
            if (!z && i4 > 0) {
                this.f72722c.setCurrentItem(i4 - 1, false);
            }
        } else {
            this.f72722c.setCurrentItem(i4 + 1, false);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z, int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72720a, false, 83964, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72720a, false, 83964, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.f72721b == null || this.f72721b.getActivity() == null || this.h == null)) {
            if (z) {
                if (i4 < i3 - 1) {
                    this.h.setCurrentItem(i4 + 1, true);
                } else if (this.f72721b.getActivity() != null) {
                    this.f72721b.getActivity().supportFinishAfterTransition();
                }
            } else if (i4 > 0) {
                this.h.setCurrentItem(i4 - 1, true);
            }
        }
    }
}
