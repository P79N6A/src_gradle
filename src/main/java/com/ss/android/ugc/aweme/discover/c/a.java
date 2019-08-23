package com.ss.android.ugc.aweme.discover.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.discover.adapter.DiscoverDetailFeedPagerAdapter;
import com.ss.android.ugc.aweme.discover.ui.DiscoverDetailPageFragment;
import com.ss.android.ugc.aweme.feed.adapter.FeedPagerAdapter;
import com.ss.android.ugc.aweme.feed.adapter.IFeedViewHolder;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.profile.a;
import com.ss.android.ugc.aweme.u.ab;
import com.ss.android.ugc.aweme.u.s;
import java.util.List;

public final class a extends DetailFragmentPanel {
    public static ChangeQuickRedirect r;
    public DiscoverDetailPageFragment s;
    public boolean t = true;
    public C0023a u;

    /* renamed from: com.ss.android.ugc.aweme.discover.c.a$a  reason: collision with other inner class name */
    public interface C0023a {
        void a(int i);

        void a(List<Aweme> list);
    }

    public final void F() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37153, new Class[0], Void.TYPE);
            return;
        }
        VerticalViewPager verticalViewPager = this.mViewPager;
        View view = this.mBottomSpace;
        Activity activity = this.ar;
        if (this.t) {
            i = 47;
        } else {
            i = 64;
        }
        com.ss.android.ugc.aweme.profile.a.a(verticalViewPager, view, activity, i, new a.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42180a;

            public final void a() {
                DiscoverDetailFeedPagerAdapter discoverDetailFeedPagerAdapter;
                int i;
                int i2 = 0;
                if (PatchProxy.isSupport(new Object[0], this, f42180a, false, 37163, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f42180a, false, 37163, new Class[0], Void.TYPE);
                    return;
                }
                if (a.this.u != null) {
                    a.this.u.a(a.this.I());
                }
                if (a.this.z != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a.this.z.getLayoutParams();
                    if (a.this.t) {
                        i = (int) UIUtils.dip2Px(a.this.ar, 47.0f);
                    } else {
                        i = a.this.I();
                    }
                    marginLayoutParams.bottomMargin = i;
                    a.this.z.requestLayout();
                }
                if (a.this.t) {
                    discoverDetailFeedPagerAdapter = (DiscoverDetailFeedPagerAdapter) a.this.A;
                    i2 = (int) UIUtils.dip2Px(a.this.ar, 47.0f);
                } else {
                    int I = a.this.I();
                    discoverDetailFeedPagerAdapter = (DiscoverDetailFeedPagerAdapter) a.this.A;
                    if (I <= 0) {
                        i2 = (int) UIUtils.dip2Px(a.this.ar, 69.0f);
                    }
                }
                discoverDetailFeedPagerAdapter.b(i2);
            }
        });
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37156, new Class[0], Void.TYPE);
            return;
        }
        this.f3001d.e();
        this.t = true;
        F();
    }

    public final int I() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37157, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, r, false, 37157, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mBottomSpace == null) {
            return 0;
        } else {
            return this.mBottomSpace.getLayoutParams().height;
        }
    }

    public final String J() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37159, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 37159, new Class[0], String.class);
        } else if (this.s == null) {
            return "";
        } else {
            return this.s.getPlayListType();
        }
    }

    public final String K() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37160, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 37160, new Class[0], String.class);
        } else if (this.s == null) {
            return "";
        } else {
            return this.s.getPlayListIdKey();
        }
    }

    public final String L() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37161, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, r, false, 37161, new Class[0], String.class);
        } else if (this.s == null) {
            return "";
        } else {
            return this.s.getPlayListId();
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37162, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37162, new Class[0], Void.TYPE);
            return;
        }
        super.n();
        this.u = null;
        this.s = null;
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37149, new Class[0], Void.TYPE);
            return;
        }
        super.p();
        if (this.f3001d != null) {
            this.f3001d.d();
        }
    }

    public final void D() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37150, new Class[0], Void.TYPE);
        } else if (this.f3001d != null && this.t) {
            this.f3001d.d();
            Dialog dialog = this.f3001d.getDialog();
            if (dialog != null && dialog.getWindow() != null) {
                dialog.getWindow().addFlags(16);
            }
        }
    }

    public final void F_() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37151, new Class[0], Void.TYPE);
        } else if (this.f3001d != null && this.t) {
            this.f3001d.e();
            Dialog dialog = this.f3001d.getDialog();
            if (dialog != null && dialog.getWindow() != null) {
                dialog.getWindow().clearFlags(16);
            }
        }
    }

    public final void G() {
        if (PatchProxy.isSupport(new Object[0], this, r, false, 37155, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, r, false, 37155, new Class[0], Void.TYPE);
            return;
        }
        FragmentManager br = br();
        if (br != null) {
            Fragment findFragmentByTag = br.findFragmentByTag("detail");
            if (findFragmentByTag != null) {
                this.t = false;
                FragmentTransaction beginTransaction = br.beginTransaction();
                beginTransaction.remove(findFragmentByTag);
                beginTransaction.commitAllowingStateLoss();
                F();
            }
        }
    }

    public final void c(List<Aweme> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, r, false, 37148, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, r, false, 37148, new Class[]{List.class}, Void.TYPE);
        } else if (this.A != null) {
            if (!CollectionUtils.isEmpty(list)) {
                for (int i = 0; i < list.size(); i++) {
                    com.ss.android.ugc.aweme.feed.a.a().a(list.get(i));
                }
            }
            if (this.u != null) {
                this.u.a(list);
            }
            this.S.a(J(), K(), L());
            DiscoverDetailFeedPagerAdapter discoverDetailFeedPagerAdapter = (DiscoverDetailFeedPagerAdapter) this.A;
            String J = J();
            String K = K();
            discoverDetailFeedPagerAdapter.f41593f = L();
            discoverDetailFeedPagerAdapter.f41591d = J;
            discoverDetailFeedPagerAdapter.f41592e = K;
            this.A.a(list);
            this.mLoadMoreLayout.c();
        }
    }

    public final void a(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, r, false, 37146, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, r, false, 37146, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.a(view, bundle);
        this.mViewPager.setScroller(new b(view.getContext(), VerticalViewPager.f40483c));
    }

    public final void a(IFeedViewHolder iFeedViewHolder, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{iFeedViewHolder, str2}, this, r, false, 37154, new Class[]{IFeedViewHolder.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iFeedViewHolder, str2}, this, r, false, 37154, new Class[]{IFeedViewHolder.class, String.class}, Void.TYPE);
            return;
        }
        new ab().a(str2).b(str2).l(L()).k(K()).i(J()).f(iFeedViewHolder.d()).f(String.valueOf(this.n)).e();
    }

    public final void a(Aweme aweme, String str) {
        String str2;
        String str3;
        Aweme aweme2 = aweme;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{aweme2, str4}, this, r, false, 37158, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str4}, this, r, false, 37158, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        s b2 = new s().b(a(true));
        if (TextUtils.isEmpty(O())) {
            str2 = f();
        } else {
            str2 = O();
        }
        s f2 = b2.f(str2);
        if (TextUtils.isEmpty(O())) {
            str3 = "follow_button";
        } else {
            str3 = bf();
        }
        f2.g(str3).p(L()).o(K()).n(J()).c("follow_button").h(str4).b(aweme2, bh()).e();
    }

    public final FeedPagerAdapter a(Context context, LayoutInflater layoutInflater, int i, aa<ar> aaVar, Fragment fragment, View.OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams) {
        if (PatchProxy.isSupport(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, r, false, 37147, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class)) {
            return (FeedPagerAdapter) PatchProxy.accessDispatch(new Object[]{context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams}, this, r, false, 37147, new Class[]{Context.class, LayoutInflater.class, Integer.TYPE, aa.class, Fragment.class, View.OnTouchListener.class, BaseFeedPageParams.class}, FeedPagerAdapter.class);
        }
        DiscoverDetailFeedPagerAdapter discoverDetailFeedPagerAdapter = new DiscoverDetailFeedPagerAdapter(this.f3000c, context, layoutInflater, 4, aaVar, fragment, onTouchListener, baseFeedPageParams, this.mViewPager);
        return discoverDetailFeedPagerAdapter;
    }
}
