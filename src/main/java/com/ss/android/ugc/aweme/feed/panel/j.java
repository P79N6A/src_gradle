package com.ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.guide.b;
import com.ss.android.ugc.aweme.feed.listener.e;
import com.ss.android.ugc.aweme.feed.listener.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.follow.FollowFeedTriggerViewModel;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.message.c.c;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class j extends FullFeedFragmentPanel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3175a;

    /* renamed from: b  reason: collision with root package name */
    public b f3176b;

    /* renamed from: c  reason: collision with root package name */
    public e f3177c;

    /* renamed from: d  reason: collision with root package name */
    public n f3178d;
    private boolean t = true;

    public final void au() {
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f3175a, false, 41796, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3175a, false, 41796, new Class[0], Void.TYPE);
            return;
        }
        if (c.a().d(50)) {
            c.a().a(50);
            bg.a(new com.ss.android.ugc.aweme.message.b.c(50, -1));
        }
    }

    public final boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f3175a, false, 41799, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3175a, false, 41799, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.a()) {
            return super.b();
        } else {
            if (!MainPageExperimentHelper.b()) {
                return super.b();
            }
            if (PatchProxy.isSupport(new Object[0], this, f3175a, false, 41800, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3175a, false, 41800, new Class[0], Boolean.TYPE)).booleanValue();
            }
            Activity activity = this.ar;
            if (activity instanceof MainActivity) {
                return ((MainActivity) activity).isUnderSecondTab();
            }
            return false;
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3175a, false, 41802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3175a, false, 41802, new Class[0], Void.TYPE);
            return;
        }
        super.y_();
        if (MainPageExperimentHelper.b()) {
            s();
        }
        if (!(this.as == null || this.as.getActivity() == null)) {
            FollowFeedTriggerViewModel.a(this.as.getActivity()).a(true, true);
        }
        if (a.a() && this.aq) {
            r(false);
        }
        if (this.A != null && this.A.getCount() > 0) {
            if (this.aq) {
                ax();
            }
            this.A.a(Collections.emptyList());
            this.A.i = false;
        }
        g();
        b bVar = this.f3176b;
        if (bVar != null) {
            bVar.b();
        }
        if (this.f3178d != null) {
            this.f3178d.p();
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3175a, false, 41797, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3175a, false, 41797, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        FollowFeedTriggerViewModel.a(this.as.getActivity()).a(false, true);
        super.b(exc);
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3175a, false, 41801, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3175a, false, 41801, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.c(exc);
        com.bytedance.ies.dmt.ui.d.a.b((Context) this.ar, (int) C0906R.string.cac).a();
    }

    @Subscribe
    public void onFollowCleanModeChangedEvent(com.ss.android.ugc.aweme.main.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3175a, false, 41808, new Class[]{com.ss.android.ugc.aweme.main.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3175a, false, 41808, new Class[]{com.ss.android.ugc.aweme.main.b.b.class}, Void.TYPE);
            return;
        }
        boolean z = com.ss.android.ugc.aweme.main.a.a().f54287c;
        for (int i = 0; i < this.mViewPager.getChildCount(); i++) {
            IFeedViewHolder g = g(i);
            if (g != null) {
                g.a(z);
            }
        }
    }

    @Subscribe
    public void onMaskLayerCancelFollowEvent(com.ss.android.ugc.aweme.follow.b.a aVar) {
        com.ss.android.ugc.aweme.follow.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3175a, false, 41807, new Class[]{com.ss.android.ugc.aweme.follow.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3175a, false, 41807, new Class[]{com.ss.android.ugc.aweme.follow.b.a.class}, Void.TYPE);
        } else if (aVar2.f47750a != null) {
            b(aVar2.f47750a, aVar2.f47751b);
            com.ss.android.ugc.aweme.main.d.a.a(aVar2.f47750a, "long_press");
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        boolean z;
        FollowStatus followStatus2 = followStatus;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{followStatus2}, this, f3175a, false, 41805, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus2}, this, f3175a, false, 41805, new Class[]{FollowStatus.class}, Void.TYPE);
            return;
        }
        super.onFollowSuccess(followStatus);
        if (followStatus2 != null && followStatus2.followStatus == 0) {
            String str = followStatus2.userId;
            if (PatchProxy.isSupport(new Object[]{str}, this, f3175a, false, 41806, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str}, this, f3175a, false, 41806, new Class[]{String.class}, Void.TYPE);
            } else if (!CollectionUtils.isEmpty(this.A.h) && !TextUtils.isEmpty(str)) {
                FeedPagerAdapter feedPagerAdapter = this.A;
                if (PatchProxy.isSupport(new Object[]{str}, feedPagerAdapter, FeedPagerAdapter.g, false, 40502, new Class[]{String.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, feedPagerAdapter, FeedPagerAdapter.g, false, 40502, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                } else {
                    for (int size = feedPagerAdapter.h.size() - 1; size >= 0; size--) {
                        Aweme aweme = feedPagerAdapter.h.get(size);
                        if (aweme != null && TextUtils.equals(str, aweme.getAuthorUid())) {
                            feedPagerAdapter.h.remove(size);
                            z2 = true;
                        }
                    }
                    if (z2) {
                        feedPagerAdapter.notifyDataSetChanged();
                    }
                    z = z2;
                }
                if (z) {
                    aB();
                    aO();
                    p();
                    e(this.mViewPager.getCurrentItem());
                }
            }
        }
    }

    public j(String str, int i) {
        super(str, 1);
    }

    public final void a(List list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f3175a, false, 41804, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f3175a, false, 41804, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.A.getCount() == 0) {
            this.A.a(list);
        } else {
            this.A.a(list, i);
        }
        if (i >= 0 && i < this.A.getCount()) {
            this.mViewPager.setCurrentItem(i);
        }
    }

    public final void a(List<Aweme> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3175a, false, 41798, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3175a, false, 41798, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.ar instanceof FragmentActivity) {
            FollowPageFirstFrameViewModel.a((FragmentActivity) this.ar).c();
        }
        super.a(list, z);
        FollowFeedTriggerViewModel.a(this.as.getActivity()).a(true, false);
        if (!this.t) {
            if (!CollectionUtils.isEmpty(list)) {
                i(list.get(0));
            }
            this.t = false;
        }
        if (a.a() && this.aq) {
            r(!CollectionUtils.isEmpty(this.A.h));
        }
        if (MainPageExperimentHelper.b()) {
            s();
        }
        if (this.f3177c == null || !this.f3177c.b()) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) this.ar, (int) C0906R.string.a3f).a();
            if (this.f3178d != null) {
                this.f3178d.p();
            }
            return;
        }
        final int currentItem = this.mViewPager.getCurrentItem();
        final Aweme c2 = this.A.c(currentItem);
        this.mViewPager.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f45731a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f45731a, false, 41809, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f45731a, false, 41809, new Class[0], Void.TYPE);
                    return;
                }
                if (j.this.mViewPager != null) {
                    j.this.B = 0;
                    if (currentItem == 0) {
                        j.this.e(c2);
                        j.this.D = false;
                    } else {
                        j.this.D = true;
                        j.this.mViewPager.a(j.this.B, true);
                    }
                    if (j.this.f3178d != null) {
                        j.this.f3178d.p();
                    }
                }
            }
        });
    }
}
