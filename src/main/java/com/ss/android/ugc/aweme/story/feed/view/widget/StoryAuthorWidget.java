package com.ss.android.ugc.aweme.story.feed.view.widget;

import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.d;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.feed.viewmodel.a;
import com.ss.android.ugc.aweme.story.metrics.c;

public class StoryAuthorWidget extends Widget {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72900a = null;

    /* renamed from: b  reason: collision with root package name */
    public static int f72901b = 0;
    public static int k = 1;
    public AvatarImageView l;
    public DmtTextView m;
    public DmtTextView n;
    public DmtTextView o;
    public ImageView p;
    public b q;
    public UserStory r;
    public User s;
    final Fragment t;
    d u;
    private LinearLayout v;
    private DmtTextView w;
    private ImageView x;
    private StoryChange.a y;

    public final boolean g() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84258, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84258, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.r != null && this.r.getFriendType() == 4) {
            z = true;
        }
        return z;
    }

    public final boolean h() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84259, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84259, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.r != null && this.r.getFriendType() == 2) {
            z = true;
        }
        return z;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84247, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84247, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.y = new StoryChange.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72902a;

            public final void a(b bVar) {
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f72902a, false, 84264, new Class[]{b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f72902a, false, 84264, new Class[]{b.class}, Void.TYPE);
                } else if (StoryAuthorWidget.this.c() != null && StoryAuthorWidget.this.r != null && bVar != null) {
                    User user = null;
                    UserStory c2 = StoryChange.c((FragmentActivity) StoryAuthorWidget.this.c());
                    if (c2 != null) {
                        user = c2.getUser();
                    }
                    if (user != null && TextUtils.equals(user.getUid(), StoryAuthorWidget.this.s.getUid())) {
                        StoryAuthorWidget.this.q = bVar;
                        StoryAuthorWidget.this.e();
                    }
                }
            }
        };
        StoryChange.a((FragmentActivity) c(), a(), this.y);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84249, new Class[0], Void.TYPE);
            return;
        }
        StoryChange.a((FragmentActivity) c(), this.y);
        super.onDestroy();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84252, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84252, new Class[0], Void.TYPE);
        } else if (this.q != null) {
            if (h()) {
                this.w.setVisibility(8);
            } else {
                this.w.setVisibility(0);
                long createTime = this.q.getLifeStory().getCreateTime() * 1000;
                if (createTime <= 0) {
                    createTime = System.currentTimeMillis();
                }
                this.w.setText(com.ss.android.ugc.aweme.story.feed.c.b.a(this.f2709d.getResources(), createTime));
            }
            i();
        }
    }

    private void i() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84256, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84256, new Class[0], Void.TYPE);
        } else if (!g() || h()) {
            this.o.setVisibility(8);
            this.x.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            this.x.setVisibility(0);
            if (this.q.getReason() == null) {
                str = "";
            } else {
                str = this.q.getReason();
            }
            com.ss.android.ugc.aweme.arch.widgets.base.b<String> a2 = a.a().a(this.s.getUid());
            if (TextUtils.isEmpty(str)) {
                str = (String) a2.getValue();
            } else {
                a2.postValue(str);
            }
            if (!TextUtils.isEmpty(str)) {
                this.o.setText(Html.fromHtml(str));
            } else {
                this.o.setVisibility(8);
            }
            a2.observe(a(), new Observer<String>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72907a;

                public final /* synthetic */ void onChanged(@Nullable Object obj) {
                    String str = (String) obj;
                    if (PatchProxy.isSupport(new Object[]{str}, this, f72907a, false, 84266, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f72907a, false, 84266, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        StoryAuthorWidget.this.o.setVisibility(0);
                        StoryAuthorWidget.this.o.setText(Html.fromHtml(str));
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f72900a, false, 84254, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72900a, false, 84254, new Class[0], Void.TYPE);
        } else if (!h()) {
            if (this.q != null) {
                new c().b("homepage_story").d(this.q.getLifeStory().getStoryId()).c(this.s.getUid()).a("click_head").a(this.q.getLogPb()).post();
            }
            if (!(this.u == null || this.s == null || TextUtils.isEmpty(this.s.getUid()))) {
                this.u.a((Context) c(), this.s.getUid(), this.s.getSecUid());
            }
        }
    }

    public StoryAuthorWidget(Fragment fragment) {
        this.t = fragment;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72900a, false, 84257, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72900a, false, 84257, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i == f72901b) {
            this.n.setBackgroundResource(2130837786);
            this.n.setText("关注");
            this.n.setTextColor(this.f2709d.getResources().getColor(C0906R.color.hs));
        } else {
            this.n.setBackgroundResource(2130837730);
            this.n.setText("已关注");
            this.n.setTextColor(this.f2709d.getResources().getColor(C0906R.color.ao4));
        }
        this.s.setFollowStatus(i);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f72900a, false, 84250, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f72900a, false, 84250, new Class[]{View.class}, Void.TYPE);
            return;
        }
        super.a(view);
        LayoutInflater.from(this.f2709d).inflate(C0906R.layout.asr, (ViewGroup) view);
        this.v = (LinearLayout) view.findViewById(C0906R.id.gv);
        this.l = (AvatarImageView) view.findViewById(C0906R.id.ih);
        this.m = (DmtTextView) view.findViewById(C0906R.id.gw);
        this.w = (DmtTextView) view.findViewById(C0906R.id.c8w);
        this.n = (DmtTextView) view.findViewById(C0906R.id.ah5);
        this.x = (ImageView) view.findViewById(C0906R.id.cb9);
        this.o = (DmtTextView) view.findViewById(C0906R.id.cbc);
        this.p = (ImageView) view.findViewById(C0906R.id.azy);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.m);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.p);
        com.ss.android.ugc.aweme.story.feed.view.ui.a.a(this.n);
        this.u = (d) ServiceManager.get().getService(d.class);
    }
}
