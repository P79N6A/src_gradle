package com.ss.android.ugc.aweme.challenge.singlelinestyle;

import android.arch.lifecycle.Lifecycle;
import android.content.Context;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.challenge.model.mixfeed.ChallengeMixFeed;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fragment.a;
import com.ss.android.ugc.aweme.main.story.e;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder;
import java.util.List;

public final class b extends FlowFeedViewHolder<FeedAdapter, ChallengeMixFeed> implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35425a;

    /* renamed from: b  reason: collision with root package name */
    public SingleLineChallengeFeedFragment f35426b;

    /* renamed from: c  reason: collision with root package name */
    public String f35427c;

    /* renamed from: d  reason: collision with root package name */
    public a f35428d;

    /* renamed from: e  reason: collision with root package name */
    boolean f35429e;

    /* renamed from: f  reason: collision with root package name */
    int f35430f;
    String g;
    private a h;
    private DmtStatusView.a p;
    private boolean q = true;

    public final void b_(boolean z) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        if (this.h != null) {
            R_();
        }
    }

    public final com.ss.android.ugc.aweme.forward.a.a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f35425a, false, 25930, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class)) {
            return new com.ss.android.ugc.aweme.forward.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f35431a;

                public final String e() {
                    return "key_container_challenge";
                }

                public final Object a() {
                    return b.this.j;
                }

                public final boolean b() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f35431a, false, 25941, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35431a, false, 25941, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (b.this.f35426b != null && b.this.f35426b.isViewValid()) {
                        z = true;
                    }
                    return z;
                }

                public final Context d() {
                    if (PatchProxy.isSupport(new Object[0], this, f35431a, false, 25943, new Class[0], Context.class)) {
                        return (Context) PatchProxy.accessDispatch(new Object[0], this, f35431a, false, 25943, new Class[0], Context.class);
                    } else if (b.this.f35426b != null) {
                        return b.this.f35426b.getActivity();
                    } else {
                        return b.this.mRecyclerView.getContext();
                    }
                }

                public final boolean c() {
                    if (PatchProxy.isSupport(new Object[0], this, f35431a, false, 25942, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f35431a, false, 25942, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (b.this.f35426b == null || !b.this.f35426b.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED) || !b.this.f35426b.getUserVisibleHint()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
        }
        return (com.ss.android.ugc.aweme.forward.a.a) PatchProxy.accessDispatch(new Object[0], this, f35425a, false, 25930, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class);
    }

    public final FeedAdapter d() {
        if (!PatchProxy.isSupport(new Object[0], this, f35425a, false, 25934, new Class[0], FeedAdapter.class)) {
            return new FeedAdapter(this.mRecyclerView, this.h.g);
        }
        return (FeedAdapter) PatchProxy.accessDispatch(new Object[0], this, f35425a, false, 25934, new Class[0], FeedAdapter.class);
    }

    public final void R_() {
        if (PatchProxy.isSupport(new Object[0], this, f35425a, false, 25935, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35425a, false, 25935, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null && !TextUtils.isEmpty(this.f35427c)) {
            this.h.a(1, Integer.valueOf(this.f35430f), this.f35427c, Boolean.valueOf(this.f35429e));
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f35425a, false, 25933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35425a, false, 25933, new Class[0], Void.TYPE);
            return;
        }
        if (this.p == null) {
            this.p = DmtStatusView.a.a(getContext());
            DmtTextView b2 = b(C0906R.string.b6z);
            DmtTextView b3 = b(C0906R.string.aat);
            b2.setOnClickListener(new c(this));
            this.p.b((View) b3).c((View) b2);
        }
        this.mLoadingStatusView.setBuilder(this.p);
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f35425a, false, 25936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f35425a, false, 25936, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null && !TextUtils.isEmpty(this.f35427c)) {
            this.h.a(4, Integer.valueOf(this.f35430f), this.f35427c, Boolean.valueOf(this.f35429e));
        }
    }

    private DmtTextView b(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35425a, false, 25932, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35425a, false, 25932, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        if (this.f35426b != null) {
            dmtTextView.setTextColor(this.f35426b.getResources().getColor(C0906R.color.zv));
            dmtTextView.setText(i);
        }
        return dmtTextView;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f35425a, false, 25931, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f35425a, false, 25931, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.a(i);
        if (isViewValid()) {
            if (i == 1 || i == 3) {
                if (this.q) {
                    this.q = false;
                }
                if (this.f35428d != null) {
                    this.f35428d.a(this.q, false);
                }
            }
        }
    }

    public final void a(List<ChallengeMixFeed> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f35425a, false, 25929, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f35425a, false, 25929, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, z);
        if (this.q) {
            this.q = false;
        }
        if (this.f35428d != null) {
            this.f35428d.a(this.q, true);
        }
    }

    public final void a(boolean z, Aweme aweme) {
        Aweme aweme2 = aweme;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), aweme2}, this, f35425a, false, 25937, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), aweme2}, this, f35425a, false, 25937, new Class[]{Boolean.TYPE, Aweme.class}, Void.TYPE);
            return;
        }
        this.j.a(z, aweme2);
    }

    public final void a(SingleLineChallengeFeedFragment singleLineChallengeFeedFragment, View view, a aVar, com.ss.android.ugc.aweme.newfollow.b.a aVar2, String str, String str2, int i, boolean z, String str3, int i2) {
        SingleLineChallengeFeedFragment singleLineChallengeFeedFragment2 = singleLineChallengeFeedFragment;
        a aVar3 = aVar;
        String str4 = str;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{singleLineChallengeFeedFragment2, view, aVar3, aVar2, str4, str2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str5, Integer.valueOf(i2)}, this, f35425a, false, 25928, new Class[]{SingleLineChallengeFeedFragment.class, View.class, a.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{singleLineChallengeFeedFragment2, view, aVar3, aVar2, str4, str2, Integer.valueOf(i), Byte.valueOf(z), str5, Integer.valueOf(i2)}, this, f35425a, false, 25928, new Class[]{SingleLineChallengeFeedFragment.class, View.class, a.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class, String.class, Integer.TYPE, Boolean.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.h = aVar3;
        super.a(singleLineChallengeFeedFragment, view, aVar, aVar2, str2, i, "");
        this.f35427c = str4;
        this.f35426b = singleLineChallengeFeedFragment2;
        this.f35429e = z;
        this.g = str5;
        this.f35430f = i2;
    }
}
