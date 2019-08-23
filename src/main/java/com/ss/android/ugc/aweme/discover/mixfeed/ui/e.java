package com.ss.android.ugc.aweme.discover.mixfeed.ui;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.d.f;
import com.ss.android.ugc.aweme.base.widget.BaseRecyclerView;
import com.ss.android.ugc.aweme.commercialize.k;
import com.ss.android.ugc.aweme.commercialize.model.o;
import com.ss.android.ugc.aweme.commercialize.utils.p;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.discover.mixfeed.a;
import com.ss.android.ugc.aweme.discover.mob.j;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchResultParam;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.ui.SearchFragment;
import com.ss.android.ugc.aweme.discover.ui.a.c;
import com.ss.android.ugc.aweme.discover.ui.aw;
import com.ss.android.ugc.aweme.discover.widget.b;
import com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter;
import com.ss.android.ugc.aweme.newfollow.vh.FlowFeedViewHolder;
import java.util.List;

public final class e extends FlowFeedViewHolder<SearchMixFeedAdapter, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42575a;

    /* renamed from: b  reason: collision with root package name */
    public String f42576b;

    /* renamed from: c  reason: collision with root package name */
    public SearchMixFeedFragment f42577c;

    /* renamed from: d  reason: collision with root package name */
    public o f42578d;

    /* renamed from: e  reason: collision with root package name */
    private c f42579e;

    /* renamed from: f  reason: collision with root package name */
    private double f42580f;
    private double g;
    private c h;
    private com.bytedance.ies.dmt.ui.widget.e p;
    private b q;

    public final void a(List<a> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42575a, false, 36868, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f42575a, false, 36868, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, z);
        if (!(this.f42578d == null || this.f42578d.getEasterEggInfo() == null)) {
            k kVar = new k();
            kVar.setEasterEggInfo(this.f42578d.getEasterEggInfo());
            kVar.setEnterFrom(this.f42579e.a(true));
            kVar.setKeyWords(this.f42576b);
            Context context = getContext();
            if (PatchProxy.isSupport(new Object[]{context, kVar}, null, p.f39810a, true, 32412, new Class[]{Context.class, k.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, kVar}, null, p.f39810a, true, 32412, new Class[]{Context.class, k.class}, Void.TYPE);
            } else {
                p.a(context, kVar, -1);
            }
        }
        this.f42577c.a_(true);
    }

    public final boolean a(SearchApiResult searchApiResult, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{searchApiResult, exc}, this, f42575a, false, 36870, new Class[]{SearchApiResult.class, Exception.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{searchApiResult, exc}, this, f42575a, false, 36870, new Class[]{SearchApiResult.class, Exception.class}, Boolean.TYPE)).booleanValue();
        }
        com.bytedance.ies.dmt.ui.widget.c a2 = this.h.a(searchApiResult, exc);
        if (a2 != null) {
            this.f42578d = null;
            a((List<a>) null);
            a(a2);
            this.f42577c.a_(false);
            return true;
        }
        a(3);
        return false;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42575a, false, 36879, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f42575a, false, 36879, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int c2 = ((SearchMixFeedAdapter) this.j).c(str);
        if (c2 >= 0) {
            ((SearchMixFeedAdapter) this.j).b(c2);
            if (((SearchMixFeedAdapter) this.j).a()) {
                a(3);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.newfollow.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f42575a, false, 36880, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f42575a, false, 36880, new Class[]{com.ss.android.ugc.aweme.newfollow.c.a.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            if (aVar.f57079a == 1) {
                ((SearchMixFeedAdapter) this.j).b(aVar.f57080b);
            }
            if (((SearchMixFeedAdapter) this.j).a()) {
                a(3);
            }
        }
    }

    public final void a(List<a> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f42575a, false, 36884, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f42575a, false, 36884, new Class[]{List.class}, Void.TYPE);
            return;
        }
        super.a(list);
    }

    public final com.ss.android.ugc.aweme.forward.a.a b() {
        if (!PatchProxy.isSupport(new Object[0], this, f42575a, false, 36866, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class)) {
            return new com.ss.android.ugc.aweme.forward.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f42583a;

                public final Object a() {
                    if (!PatchProxy.isSupport(new Object[0], this, f42583a, false, 36890, new Class[0], Object.class)) {
                        return null;
                    }
                    return PatchProxy.accessDispatch(new Object[0], this, f42583a, false, 36890, new Class[0], Object.class);
                }

                public final String e() {
                    return "key_container_search_mix";
                }

                public final Context d() {
                    if (PatchProxy.isSupport(new Object[0], this, f42583a, false, 36889, new Class[0], Context.class)) {
                        return (Context) PatchProxy.accessDispatch(new Object[0], this, f42583a, false, 36889, new Class[0], Context.class);
                    } else if (e.this.f42577c != null) {
                        return e.this.f42577c.getActivity();
                    } else {
                        return e.this.mRecyclerView.getContext();
                    }
                }

                public final boolean b() {
                    boolean z = false;
                    if (PatchProxy.isSupport(new Object[0], this, f42583a, false, 36887, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42583a, false, 36887, new Class[0], Boolean.TYPE)).booleanValue();
                    }
                    if (!(e.this.f42577c == null || e.this.f42577c.getActivity() == null || !e.this.f42577c.isViewValid() || e.this.f42577c.getActivity() == null)) {
                        Integer num = (Integer) ((SearchStateViewModel) ViewModelProviders.of(e.this.f42577c.getActivity()).get(SearchStateViewModel.class)).searchState.getValue();
                        if (num != null) {
                            if (num.intValue() == 2) {
                                z = true;
                            }
                            return z;
                        }
                    }
                    return false;
                }

                public final boolean c() {
                    if (PatchProxy.isSupport(new Object[0], this, f42583a, false, 36888, new Class[0], Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f42583a, false, 36888, new Class[0], Boolean.TYPE)).booleanValue();
                    } else if (e.this.f42577c == null || !e.this.f42577c.getLifecycle().getCurrentState().equals(Lifecycle.State.RESUMED) || !e.this.f42577c.getUserVisibleHint()) {
                        return false;
                    } else {
                        return true;
                    }
                }
            };
        }
        return (com.ss.android.ugc.aweme.forward.a.a) PatchProxy.accessDispatch(new Object[0], this, f42575a, false, 36866, new Class[0], com.ss.android.ugc.aweme.forward.a.a.class);
    }

    public final /* synthetic */ FeedAdapter d() {
        if (!PatchProxy.isSupport(new Object[0], this, f42575a, false, 36864, new Class[0], SearchMixFeedAdapter.class)) {
            return new SearchMixFeedAdapter(this.mRecyclerView, this.f42579e.g, new SearchResultParam().setKeyword(this.f42576b));
        }
        return (SearchMixFeedAdapter) PatchProxy.accessDispatch(new Object[0], this, f42575a, false, 36864, new Class[0], SearchMixFeedAdapter.class);
    }

    public final void R_() {
        if (PatchProxy.isSupport(new Object[0], this, f42575a, false, 36875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42575a, false, 36875, new Class[0], Void.TYPE);
        } else if (this.f42579e != null) {
            j.f42669b.a("general_search", this.f42576b);
            this.f42578d = null;
            this.f42579e.a(1, this.f42576b, 1, Double.valueOf(this.f42580f), Double.valueOf(this.g), Integer.valueOf(this.f42577c.o));
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42575a, false, 36882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42575a, false, 36882, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f42577c.y();
    }

    public final void c() {
        c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f42575a, false, 36863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42575a, false, 36863, new Class[0], Void.TYPE);
            return;
        }
        Context context = getContext();
        SearchMixFeedFragment searchMixFeedFragment = this.f42577c;
        if (PatchProxy.isSupport(new Object[]{context, searchMixFeedFragment}, null, c.f43080a, true, 38141, new Class[]{Context.class, SearchFragment.class}, c.class)) {
            cVar = (c) PatchProxy.accessDispatch(new Object[]{context, searchMixFeedFragment}, null, c.f43080a, true, 38141, new Class[]{Context.class, SearchFragment.class}, c.class);
        } else {
            cVar = c.f43081c.a(context, searchMixFeedFragment);
        }
        this.h = cVar;
        this.p = new com.ss.android.ugc.aweme.discover.widget.c(getContext(), aw.f43134b);
        this.mLoadingStatusView.setBuilder(DmtStatusView.a.a(getContext()).b((View) this.p).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42581a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f42581a, false, 36886, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f42581a, false, 36886, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                e.this.b(0);
            }
        }));
        com.ss.android.ugc.aweme.poi.a a2 = af.a(getContext()).a((f) null);
        if (a2 != null) {
            this.f42580f = a2.latitude;
            this.g = a2.longitude;
        }
    }

    public final void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f42575a, false, 36878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42575a, false, 36878, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && !this.f42579e.i().isDataEmpty() && this.f42579e.i().isHasMore() && this.f42579e != null) {
            this.f42579e.a(4, this.f42576b, 0, Double.valueOf(this.f42580f), Double.valueOf(this.g), Integer.valueOf(this.f42577c.o));
        }
    }

    private void a(com.bytedance.ies.dmt.ui.widget.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f42575a, false, 36873, new Class[]{com.bytedance.ies.dmt.ui.widget.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f42575a, false, 36873, new Class[]{com.bytedance.ies.dmt.ui.widget.c.class}, Void.TYPE);
            return;
        }
        if (this.mLoadingStatusView != null) {
            com.ss.android.ugc.aweme.discover.ui.a.b.a(this.mLoadingStatusView, cVar);
        }
    }

    public final int b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f42575a, false, 36883, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f42575a, false, 36883, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.j != null) {
            return ((SearchMixFeedAdapter) this.j).c(str);
        } else {
            return -1;
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f42575a, false, 36871, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f42575a, false, 36871, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            switch (i) {
                case 1:
                case 3:
                    this.f42578d = null;
                    a((List<a>) null);
                    this.f42577c.a_(false);
                    this.f42577c.b("");
                    a(this.h.a());
                    if (this.j != null) {
                        ((SearchMixFeedAdapter) this.j).showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 2:
                    if (this.j == null || ((SearchMixFeedAdapter) this.j).getItemCount() != 0 || this.mLoadingStatusView == null) {
                        b(true);
                        return;
                    }
                    this.mLoadingStatusView.setVisibility(0);
                    this.mLoadingStatusView.d();
                    return;
                default:
                    super.a(i);
                    break;
            }
        }
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{0}, this, f42575a, false, 36876, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0}, this, f42575a, false, 36876, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (!NetworkUtils.isNetworkAvailable(this.f42577c.getContext())) {
                b(false);
                com.bytedance.ies.dmt.ui.d.a.b(this.f42577c.getContext(), (int) C0906R.string.bgf).a();
                return;
            }
            if (this.f42579e != null) {
                if (PatchProxy.isSupport(new Object[]{0}, this, f42575a, false, 36877, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{0}, this, f42575a, false, 36877, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                this.f42578d = null;
                this.f42579e.a(1, this.f42576b, 0, Double.valueOf(this.f42580f), Double.valueOf(this.g), Integer.valueOf(this.f42577c.o));
            }
        }
    }

    public final void a(QueryCorrectInfo queryCorrectInfo) {
        if (PatchProxy.isSupport(new Object[]{queryCorrectInfo}, this, f42575a, false, 36867, new Class[]{QueryCorrectInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{queryCorrectInfo}, this, f42575a, false, 36867, new Class[]{QueryCorrectInfo.class}, Void.TYPE);
        } else if (this.f42577c.isViewValid() && com.ss.android.ugc.aweme.hotsearch.d.a.a(this.f42576b) <= 0) {
            this.o.b((View) this.q);
            if (queryCorrectInfo != null) {
                this.q = new b(getContext());
                this.o.a((View) this.q);
                this.q.a(queryCorrectInfo, this.f42576b);
            }
        }
    }

    public final void a(SearchResultParam searchResultParam) {
        SearchResultParam searchResultParam2 = searchResultParam;
        if (PatchProxy.isSupport(new Object[]{searchResultParam2}, this, f42575a, false, 36881, new Class[]{SearchResultParam.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchResultParam2}, this, f42575a, false, 36881, new Class[]{SearchResultParam.class}, Void.TYPE);
            return;
        }
        this.f42576b = searchResultParam.getKeyword();
        if (this.j != null) {
            ((SearchMixFeedAdapter) this.j).g = searchResultParam2;
        }
        if (this.mRecyclerView != null) {
            NestedScrollingRecyclerView nestedScrollingRecyclerView = this.mRecyclerView;
            if (PatchProxy.isSupport(new Object[0], nestedScrollingRecyclerView, BaseRecyclerView.f35064a, false, 25380, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], nestedScrollingRecyclerView, BaseRecyclerView.f35064a, false, 25380, new Class[0], Void.TYPE);
            } else if (nestedScrollingRecyclerView.getChildCount() > 0) {
                nestedScrollingRecyclerView.scrollToPosition(0);
            }
        }
    }

    public final void b(List<a> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f42575a, false, 36869, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f42575a, false, 36869, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.b(list, z);
    }

    public final void a(SearchMixFeedFragment searchMixFeedFragment, View view, c cVar, com.ss.android.ugc.aweme.newfollow.b.a aVar, String str) {
        SearchMixFeedFragment searchMixFeedFragment2 = searchMixFeedFragment;
        c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{searchMixFeedFragment2, view, cVar2, aVar, str2}, this, f42575a, false, 36865, new Class[]{SearchMixFeedFragment.class, View.class, c.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{searchMixFeedFragment2, view, cVar2, aVar, str2}, this, f42575a, false, 36865, new Class[]{SearchMixFeedFragment.class, View.class, c.class, com.ss.android.ugc.aweme.newfollow.b.a.class, String.class}, Void.TYPE);
            return;
        }
        this.f42577c = searchMixFeedFragment2;
        this.f42579e = cVar2;
        this.f42576b = str2;
        a(searchMixFeedFragment, view, cVar, aVar, searchMixFeedFragment.i(), 9, "");
    }
}
