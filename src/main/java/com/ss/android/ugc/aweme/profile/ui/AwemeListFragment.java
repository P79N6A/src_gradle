package com.ss.android.ugc.aweme.profile.ui;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.challenge.d;
import com.ss.android.ugc.aweme.challenge.ui.OnAnimatedScrollListener;
import com.ss.android.ugc.aweme.commercialize.log.ab;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.d.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.b;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.feed.f.ad;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.ss.android.ugc.aweme.profile.adapter.AwemeAdapter;
import com.ss.android.ugc.aweme.profile.adapter.AwemeViewHolder;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.o;
import com.ss.android.ugc.aweme.profile.presenter.v;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.f;
import com.ss.android.ugc.aweme.setting.ui.af;
import com.ss.android.ugc.aweme.shortvideo.f.e;
import com.ss.android.ugc.aweme.u.an;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.br;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.ex;
import com.ss.android.ugc.aweme.views.FpsRecyclerView;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.aweme.views.j;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

public class AwemeListFragment extends ProfileListFragment implements d, LoadMoreRecyclerViewAdapter.a, b<AwemeViewHolder>, c<Aweme>, com.ss.android.ugc.aweme.common.f.d, b.a, m, z {
    public static long B = -1;
    public static String C = null;
    public static String D = "";

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3784a;
    protected boolean A;
    View E;
    public String F;
    public String G;
    public String H;
    protected com.ss.android.ugc.aweme.common.d.a I;
    private String J;
    private String K;
    private boolean L;
    private boolean M;
    private boolean N;
    private String O;
    private boolean P;
    private IDraftService.DraftListener Q = new IDraftService.DraftListenerAdapter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61731a;

        public final void onDraftClean() {
            if (PatchProxy.isSupport(new Object[0], this, f61731a, false, 67817, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61731a, false, 67817, new Class[0], Void.TYPE);
            } else if (AwemeListFragment.this.f3788e && AwemeListFragment.this.f3787d == 0) {
                AwemeListFragment.this.n();
                if (AwemeListFragment.this.n.getItemCount() == 0) {
                    AwemeListFragment.this.q.setVisibility(4);
                    if (AwemeListFragment.this.r != null) {
                        AwemeListFragment.this.r.a(AwemeListFragment.this.f3788e, AwemeListFragment.this.f3787d);
                    }
                }
            }
        }

        public final void onDraftDelete(@Nullable com.ss.android.ugc.aweme.draft.a.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f61731a, false, 67816, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f61731a, false, 67816, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
            } else if (AwemeListFragment.this.f3788e && AwemeListFragment.this.f3787d == 0) {
                IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
                i.a((Callable<TResult>) new h<TResult>(this, draftService), (Executor) draftService.getDraftExecutor());
            }
        }

        public final void onDraftUpdate(@NonNull com.ss.android.ugc.aweme.draft.a.c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f61731a, false, 67815, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f61731a, false, 67815, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
            } else if (AwemeListFragment.this.f3788e && AwemeListFragment.this.f3787d == 0) {
                AwemeListFragment.this.a(cVar);
                if (AwemeListFragment.this.r != null) {
                    AwemeListFragment.this.r.b(AwemeListFragment.this.f3788e, AwemeListFragment.this.f3787d);
                }
                AwemeListFragment.this.q.setVisibility(4);
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    protected String f3785b;

    /* renamed from: c  reason: collision with root package name */
    protected String f3786c;

    /* renamed from: d  reason: collision with root package name */
    public int f3787d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f3788e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3789f;
    public boolean g;
    protected int h = -1;
    protected int l;
    protected RecyclerView m;
    protected AwemeAdapter n;
    protected WrapGridLayoutManager o;
    public com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.common.f.a> p;
    protected DmtStatusView q;
    public a r;
    protected boolean s = true;
    protected DmtStatusView.a t;
    public boolean u;
    protected boolean v = true;
    public String w;
    public String x;
    protected ViewStub y;
    protected View z;

    public interface a {
        void a(boolean z, int i);

        void b(boolean z, int i);
    }

    public int b() {
        return C0906R.layout.my;
    }

    public final void c(List<Aweme> list, boolean z2) {
    }

    public final void d(Exception exc) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public final void z_() {
    }

    public final void a(List<Aweme> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3784a, false, 67769, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3784a, false, 67769, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            if (com.ss.android.g.a.a()) {
                this.n.setShowFooter(true);
            }
            if (getTag() != null && this.f3785b != null && this.f3785b.equals(C) && getTag().endsWith(Integer.toString(0)) && B > 0) {
                i.a((Callable<TResult>) new g<TResult>(D, B));
                B = 0;
                C = null;
                D = "";
            }
            this.v = true;
            this.q.b(true);
            this.n.resetLoadMoreState();
            this.n.q = z2;
            this.n.setData(list);
            if (this.f3788e && TextUtils.equals(this.k, eg.a(1)) && !((Boolean) x.a().h().c()).booleanValue() && !((Boolean) x.a().d().c()).booleanValue() && this.E != null && this.n.getBasicItemCount() != 0 && !this.M) {
                this.E.setVisibility(0);
            }
            if (!(list == null || list.isEmpty() || this.r == null)) {
                this.r.b(this.f3788e, this.f3787d);
            }
            this.P = z2;
            b(z2);
        }
    }

    public final void a(boolean z2, boolean z3) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f3784a, false, 67781, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Byte.valueOf(z3)}, this, f3784a, false, 67781, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (ao.b(getView()) && this.I != null) {
            this.I.a(z2, z3);
        }
    }

    public final void a(List list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f3784a, false, 67788, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f3784a, false, 67788, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && !CollectionUtils.isEmpty(list)) {
            int i2 = this.n.g ? i + 1 : i;
            if (this.n.a() == 0) {
                this.n.setData(list);
                this.q.setVisibility(4);
            } else {
                if (AbTestManager.a().d().useRecyclerPartialUpdate) {
                    this.n.notifyItemInserted(i2);
                } else {
                    this.n.setData(list);
                }
                if (this.m != null) {
                    this.m.post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f61736a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f61736a, false, 67820, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f61736a, false, 67820, new Class[0], Void.TYPE);
                                return;
                            }
                            AwemeListFragment.this.m.scrollToPosition(0);
                            if (AwemeListFragment.this.I != null) {
                                AwemeListFragment.this.I.a(false, false);
                            }
                        }
                    });
                }
            }
            if (this.r != null) {
                this.r.b(this.f3788e, this.f3787d);
            }
        }
    }

    public final void a(Boolean bool) {
        if (PatchProxy.isSupport(new Object[]{bool}, this, f3784a, false, 67790, new Class[]{Boolean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool}, this, f3784a, false, 67790, new Class[]{Boolean.class}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.i = bool.booleanValue();
        }
    }

    public final boolean d() {
        return this.P;
    }

    private boolean K() {
        if (this.f3787d == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if (!this.s || this.N || this.L) {
            return false;
        }
        return true;
    }

    private boolean H() {
        if (!this.f3788e || this.f3787d != 0 || !this.n.g) {
            return true;
        }
        return false;
    }

    private void G() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67763, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67763, new Class[0], Void.TYPE);
            return;
        }
        if (I()) {
            this.q.d();
        }
    }

    private boolean I() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67765, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67765, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.n.getItemCount() == 0 && !this.n.g) {
            z2 = true;
        }
        return z2;
    }

    public final void A() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67783, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null && this.q.g()) {
            this.q.setVisibility(4);
        }
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67775, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67775, new Class[0], Void.TYPE);
            return;
        }
        loadMore();
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67761, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67761, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.m.getChildCount() > 0) {
            this.m.smoothScrollToPosition(0);
        }
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67760, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67760, new Class[0], View.class);
        } else if (!isViewValid()) {
            return null;
        } else {
            return this.m;
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67762, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67762, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.z.setVisibility(4);
            G();
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67739, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67739, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (getUserVisibleHint()) {
            y();
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67752, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67752, new Class[0], Void.TYPE);
            return;
        }
        this.o = new WrapGridLayoutManager((Context) getActivity(), 3, 1, false);
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67770, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.n.showLoadMoreLoading();
        }
    }

    public final RecyclerView.ItemDecoration t() {
        if (!PatchProxy.isSupport(new Object[0], this, f3784a, false, 67753, new Class[0], RecyclerView.ItemDecoration.class)) {
            return new AmeDecoration((int) UIUtils.dip2Px(getContext(), 1.0f));
        }
        return (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67753, new Class[0], RecyclerView.ItemDecoration.class);
    }

    public final void y() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67780, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67780, new Class[0], Void.TYPE);
            return;
        }
        if (this.I != null) {
            this.I.a();
        }
    }

    public final void z() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67782, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67782, new Class[0], Void.TYPE);
            return;
        }
        if (this.q != null && !this.q.g()) {
            this.q.setVisibility(0);
        }
    }

    private void F() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67757, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3788e && this.f3787d == 0) {
            IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
            i.a((Callable<TResult>) new f<TResult>(this, draftService), (Executor) draftService.getDraftExecutor());
        }
    }

    private void J() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67767, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67767, new Class[0], Void.TYPE);
            return;
        }
        int E2 = E();
        if (!(E2 == 0 || this.t == null || this.q == null)) {
            this.q.b();
            this.t.b((View) c(E2));
            this.q.setBuilder(this.t);
        }
    }

    public final boolean B() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67786, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67786, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (isViewValid() && k() && this.f3788e && this.f3787d == 0 && this.q.f20470b) {
            return true;
        } else {
            return false;
        }
    }

    public final void C() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67792, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67792, new Class[0], Void.TYPE);
        } else if (this.n != null) {
            this.n.resetLoadMoreState();
            this.n.clearData();
            if (this.p.i() != null) {
                FeedItemList feedItemList = (FeedItemList) ((com.ss.android.ugc.aweme.profile.presenter.b) this.p.i()).getData();
                if (feedItemList != null) {
                    feedItemList.maxCursor = 0;
                    feedItemList.items = null;
                    feedItemList.hasMore = 0;
                }
            }
        }
    }

    public final ArrayList<Aweme> D() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67802, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67802, new Class[0], ArrayList.class);
        } else if (this.n == null || this.n.mItems == null || this.n.mItems.size() < 3) {
            return null;
        } else {
            ArrayList<Aweme> arrayList = new ArrayList<>();
            for (Aweme aweme : this.n.mItems) {
                if (aweme.getStatus() != null && aweme.getStatus().getPrivateStatus() == 0) {
                    arrayList.add(aweme);
                    if (arrayList.size() >= 3) {
                        break;
                    }
                }
            }
            return arrayList;
        }
    }

    public void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67749, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67749, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (this.L || this.N) {
                y_();
            } else if (this.q == null || (!this.A && !TimeLockRuler.isTeenModeON())) {
                w();
            } else {
                this.q.setVisibility(4);
                this.z.setVisibility(0);
            }
        }
    }

    public final boolean k() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67785, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67785, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || this.n == null) {
            return false;
        } else {
            if (this.n.getItemCount() == 0) {
                z2 = true;
            }
            return z2;
        }
    }

    public void loadMore() {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67776, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67776, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3788e) {
            int i3 = this.f3787d;
            if (this.n == null || this.n.getData() == null) {
                i2 = 0;
            } else {
                i2 = this.n.getData().size();
            }
            com.ss.android.ugc.aweme.profile.d.a.a(i3, true, i2);
        }
        com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.common.f.a> bVar = this.p;
        Object[] objArr = new Object[6];
        objArr[0] = 4;
        objArr[1] = Boolean.TRUE;
        objArr[2] = this.f3785b;
        objArr[3] = Integer.valueOf(this.f3787d);
        if (this.f3788e) {
            i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
        } else {
            i = 2000;
        }
        objArr[4] = Integer.valueOf(i);
        objArr[5] = this.f3786c;
        bVar.a(objArr);
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67734, new Class[0], Void.TYPE);
        } else if (!this.L && !this.N && isViewValid()) {
            this.q.setVisibility(4);
            this.z.setVisibility(0);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67743, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            AwemeAdapter awemeAdapter = this.n;
            if (PatchProxy.isSupport(new Object[0], awemeAdapter, AwemeAdapter.f61233f, false, 67353, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], awemeAdapter, AwemeAdapter.f61233f, false, 67353, new Class[0], Void.TYPE);
                return;
            }
            awemeAdapter.g = false;
            awemeAdapter.l = null;
            awemeAdapter.notifyDataSetChanged();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67746, new Class[0], Void.TYPE);
        } else if (isViewValid() && this.m != null && this.n != null && !this.n.j) {
            this.n.j = true;
            int childCount = this.m.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.m.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition instanceof AwemeViewHolder) {
                    AwemeViewHolder awemeViewHolder = (AwemeViewHolder) findViewHolderForAdapterPosition;
                    awemeViewHolder.b();
                    a(awemeViewHolder);
                }
            }
        }
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67737, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        try {
            if (this.n != null) {
                this.n.notifyDataSetChanged();
                if (K()) {
                    if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67738, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67738, new Class[0], Void.TYPE);
                    } else if (this.m != null) {
                        com.ss.android.ugc.aweme.favorites.d.a.a(true);
                        this.m.post(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f61726a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f61726a, false, 67813, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f61726a, false, 67813, new Class[0], Void.TYPE);
                                    return;
                                }
                                com.ss.android.ugc.aweme.favorites.d.a.a(false);
                            }
                        });
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void u() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67754, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67754, new Class[0], Void.TYPE);
            return;
        }
        FragmentActivity activity = getActivity();
        if (this.f3788e || this.f3787d == 4) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        AwemeAdapter awemeAdapter = new AwemeAdapter(activity, str, this.f3788e, this.f3787d, this, this);
        this.n = awemeAdapter;
        this.n.setLoadMoreListener(this);
        this.n.j = this.f3789f;
    }

    public final void v() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67755, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3787d != 0 || this.f3788e) {
            this.p = new com.ss.android.ugc.aweme.common.f.b<>();
        } else {
            this.p = new v();
            ((v) this.p).f61655b = this.f3785b;
        }
        this.p.a(this);
        this.p.a((com.ss.android.ugc.aweme.common.f.d) this);
        this.p.a(new com.ss.android.ugc.aweme.profile.presenter.b());
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67756, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67756, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f3788e || this.f3787d != 0) {
            x();
        } else {
            if (TextUtils.isEmpty(this.f3785b)) {
                this.f3785b = com.ss.android.ugc.aweme.account.d.a().getCurUserId();
            }
            if (TextUtils.isEmpty(this.f3786c)) {
                this.f3786c = com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid();
            }
            ((com.ss.android.ugc.aweme.profile.presenter.b) this.p.i()).a(this.f3785b).subscribe(new d(this), new e(this));
        }
        F();
    }

    private int E() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67730, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67730, new Class[0], Integer.TYPE)).intValue();
        }
        if (com.ss.android.g.a.a() || ((!this.L && !this.N) || this.f3788e)) {
            if (this.f3788e) {
                if (this.f3787d == 0) {
                    i = C0906R.string.aaw;
                } else if (this.f3787d != 1 || ex.b()) {
                    i = C0906R.string.bfp;
                } else if (!((Boolean) x.a().h().c()).booleanValue()) {
                    i = C0906R.string.al_;
                } else if (((Integer) x.a().g().c()).intValue() == 0) {
                    i = C0906R.string.b5h;
                } else {
                    i = C0906R.string.b5i;
                }
            } else if (this.f3787d == 0) {
                i = C0906R.string.dqb;
            } else if (this.f3787d == 4) {
                i = C0906R.string.aaf;
            } else {
                i = C0906R.string.dq0;
            }
        } else if (this.f3787d == 0) {
            if (this.N) {
                i = C0906R.string.o1;
            }
            if (this.L) {
                i = C0906R.string.nk;
            }
        } else if (this.f3787d == 1) {
            if (this.N) {
                i = C0906R.string.o3;
            }
            if (this.L) {
                i = C0906R.string.no;
            }
        }
        return i;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67778, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67778, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (!getUserVisibleHint() || !f.a(getContext()) || !NetworkUtils.isNetworkAvailable(getActivity())) {
                y();
            } else {
                a(false, false);
            }
            if (getUserVisibleHint()) {
                if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67747, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67747, new Class[0], Void.TYPE);
                } else if (this.m != null) {
                    int childCount = this.m.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.m.findViewHolderForAdapterPosition(i);
                        if (findViewHolderForAdapterPosition instanceof AwemeViewHolder) {
                            ((AwemeViewHolder) findViewHolderForAdapterPosition).i();
                        }
                    }
                }
                if (K()) {
                    if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67779, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67779, new Class[0], Void.TYPE);
                    } else if (this.m != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.m.getLayoutManager();
                        if (linearLayoutManager != null) {
                            List data = this.n.getData();
                            if (!CollectionUtils.isEmpty(data)) {
                                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                                for (int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
                                    if (findFirstVisibleItemPosition >= 0 && findFirstVisibleItemPosition < data.size()) {
                                        com.ss.android.ugc.aweme.favorites.d.a.a(1, (Aweme) data.get(findFirstVisibleItemPosition));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67742, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67742, new Class[0], Void.TYPE);
            return;
        }
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.Q);
        super.onDestroyView();
        if (this.p != null) {
            this.p.k();
        }
        ab a2 = ab.a();
        if (PatchProxy.isSupport(new Object[0], a2, ab.f39287a, false, 31869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, ab.f39287a, false, 31869, new Class[0], Void.TYPE);
        } else {
            a2.f39290c.clear();
        }
        ab.a().f39291d = false;
        if (this.n != null) {
            this.n.clearData();
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67733, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.f3788e && TextUtils.equals(this.k, eg.a(1)) && ((((Boolean) x.a().h().c()).booleanValue() || this.n.getBasicItemCount() == 0 || ((Boolean) x.a().d().c()).booleanValue()) && this.E != null && this.E.getVisibility() == 0)) {
            this.E.setVisibility(8);
            this.M = true;
        }
        if (getUserVisibleHint() && !AbTestManager.a().an()) {
            a(false, true);
        }
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67736, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint()) {
            y();
        }
        try {
            if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67740, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67740, new Class[0], Void.TYPE);
            } else if (this.m != null && isViewValid()) {
                int childCount = this.m.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.m.getChildAt(i);
                    if (childAt != null) {
                        RecyclerView.ViewHolder childViewHolder = this.m.getChildViewHolder(childAt);
                        if (childViewHolder != null && childViewHolder.getItemViewType() == 0) {
                            ((AnimatedViewHolder) childViewHolder).h();
                        }
                    }
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
        }
        super.onStop();
    }

    public void p() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67750, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67750, new Class[0], Void.TYPE);
            return;
        }
        this.m.setOverScrollMode(2);
        q();
        this.m.setLayoutManager(this.o);
        this.m.addItemDecoration(t());
        OnAnimatedScrollListener onAnimatedScrollListener = null;
        if (!com.ss.android.ugc.aweme.common.h.c.a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.m.addOnScrollListener(onAnimatedScrollListener);
        }
        this.I = new com.ss.android.ugc.aweme.common.d.a(this.m, onAnimatedScrollListener);
        this.m = df.a(this.m, this);
        if (this.f3788e) {
            str = "my_profile";
        } else {
            str = "user_profile";
        }
        br.a(str).a(this.m);
        u();
        this.m.setAdapter(this.n);
        v();
        if (((this.f3788e && this.f3787d == 0) || this.u || this.j) && !TimeLockRuler.isTeenModeON()) {
            w();
        }
        if (this.f3787d == 0) {
            this.l = 1;
        }
        if (this.h > 0) {
            this.m.setPadding(0, 0, 0, this.h);
        }
    }

    public final void r() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67741, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67741, new Class[0], Void.TYPE);
        } else if (this.p != null && this.p.i() != null && !TimeLockRuler.isTeenModeON()) {
            List items = ((com.ss.android.ugc.aweme.common.f.a) this.p.i()).getItems();
            if (items != null && items.size() > 0) {
                Iterator it2 = items.iterator();
                while (it2.hasNext()) {
                    Aweme aweme = (Aweme) it2.next();
                    int i = this.f3787d;
                    if (i != 1) {
                        if (i == 4 && (aweme == null || !aweme.isCollected())) {
                            it2.remove();
                        }
                    } else if (aweme == null || !aweme.isLike()) {
                        it2.remove();
                    }
                    z2 = true;
                }
            }
            if (z2 && this.n != null) {
                this.n.notifyDataSetChanged();
            }
            if (!this.q.i()) {
                if (k()) {
                    y_();
                }
                this.p.b();
            }
        }
    }

    public final boolean x() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67758, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67758, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || TimeLockRuler.isTeenModeON()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                if (H()) {
                    this.q.f();
                } else {
                    this.q.b();
                }
                this.s = true;
                return false;
            }
            G();
            boolean z2 = !this.p.m();
            if (this.f3788e && TextUtils.isEmpty(this.f3785b)) {
                this.f3785b = com.ss.android.ugc.aweme.account.d.a().getCurUserId();
            }
            if (this.f3788e && TextUtils.isEmpty(this.f3786c)) {
                this.f3786c = com.ss.android.ugc.aweme.account.c.d().getCurUser().getSecUid();
            }
            if (!TextUtils.isEmpty(this.f3785b)) {
                if (this.f3788e) {
                    com.ss.android.ugc.aweme.profile.d.a.a(this.f3787d, false, 0);
                }
                com.ss.android.ugc.aweme.profile.d.a.a(this.f3787d, this.f3785b);
                com.ss.android.ugc.aweme.common.f.b<com.ss.android.ugc.aweme.common.f.a> bVar = this.p;
                Object[] objArr = new Object[6];
                objArr[0] = 1;
                objArr[1] = Boolean.TRUE;
                objArr[2] = this.f3785b;
                objArr[3] = Integer.valueOf(this.f3787d);
                if (this.f3788e) {
                    i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                } else {
                    i = 2000;
                }
                objArr[4] = Integer.valueOf(i);
                objArr[5] = this.f3786c;
                bVar.a(objArr);
                this.s = false;
            }
            return z2;
        }
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67766, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67766, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            if (((com.ss.android.ugc.aweme.common.f.a) this.p.i()).isHasMore() && !this.N && !this.L) {
                loadMore();
            }
            this.q.k();
            if (this.f3788e && this.f3787d == 0) {
                if (!CollectionUtils.isEmpty(this.n.getData())) {
                    this.n.clearData();
                }
                if (this.n.getItemCount() == 0 && !this.n.g && this.r != null) {
                    this.r.a(this.f3788e, this.f3787d);
                }
                this.q.setVisibility(4);
            } else if (this.n.d()) {
                this.q.setVisibility(4);
            } else {
                this.z.setVisibility(4);
                if (!((com.ss.android.ugc.aweme.common.f.a) this.p.i()).isHasMore()) {
                    this.q.e();
                }
                if (this.r != null) {
                    this.r.a(this.f3788e, this.f3787d);
                }
            }
        }
    }

    public void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67729, new Class[0], Void.TYPE);
            return;
        }
        int E2 = E();
        this.t = DmtStatusView.a.a(getContext());
        DmtTextView c2 = c((int) C0906R.string.b6z);
        c2.setOnClickListener(new c(this));
        this.t.c((View) c2);
        if (this.f3787d == 4) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(E2)}, this, f3784a, false, 67732, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(E2)}, this, f3784a, false, 67732, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (this.q != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.q.getLayoutParams();
                layoutParams.topMargin = 0;
                layoutParams.width = -1;
                layoutParams.height = -1;
                this.q.setLayoutParams(layoutParams);
                if (com.ss.android.g.a.a()) {
                    MtEmptyView a2 = MtEmptyView.a(getContext());
                    a2.setStatus(new c.a(getContext()).b((int) C0906R.string.adz).c(C0906R.string.ady).a(2130839715).f20493a);
                    this.t.b((View) a2);
                } else {
                    DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
                    dmtDefaultView.setStatus(new c.a(getContext()).c(E2).f20493a);
                    this.t.b((View) dmtDefaultView);
                }
            }
        } else {
            try {
                this.t.b((View) c(E2));
            } catch (Exception unused) {
            }
        }
        this.q.setBuilder(this.t);
    }

    public final AwemeListFragment a(String str) {
        this.K = str;
        return this;
    }

    @Subscribe
    public void onMobRequestIdEvent(com.ss.android.ugc.aweme.feed.f.x xVar) {
        if (xVar != null) {
            this.J = xVar.f45320a;
        }
    }

    public final void a(boolean z2) {
        this.A = z2;
    }

    /* access modifiers changed from: private */
    public void a(final AwemeViewHolder awemeViewHolder) {
        if (PatchProxy.isSupport(new Object[]{awemeViewHolder}, this, f3784a, false, 67789, new Class[]{AwemeViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{awemeViewHolder}, this, f3784a, false, 67789, new Class[]{AwemeViewHolder.class}, Void.TYPE);
            return;
        }
        if (awemeViewHolder.c() != null) {
            if (this.v && this.I != null) {
                this.v = false;
                a(false, false);
            }
            com.ss.android.b.a.a.a.a(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61738a;

                public final void run() {
                    String str;
                    int i;
                    boolean z;
                    if (PatchProxy.isSupport(new Object[0], this, f61738a, false, 67821, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61738a, false, 67821, new Class[0], Void.TYPE);
                        return;
                    }
                    if (AwemeListFragment.this.f3788e) {
                        str = "personal_homepage";
                    } else {
                        str = "others_homepage";
                    }
                    if (AwemeListFragment.this.f3788e) {
                        i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                    } else {
                        i = 2000;
                    }
                    int i2 = i + AwemeListFragment.this.f3787d;
                    if (awemeViewHolder.getAdapterPosition() != -1) {
                        try {
                            AwemeListFragment awemeListFragment = AwemeListFragment.this;
                            View view = awemeViewHolder.itemView;
                            if (PatchProxy.isSupport(new Object[]{view}, awemeListFragment, AwemeListFragment.f3784a, false, 67791, new Class[]{View.class}, Boolean.TYPE)) {
                                AwemeListFragment awemeListFragment2 = awemeListFragment;
                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, awemeListFragment2, AwemeListFragment.f3784a, false, 67791, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                            } else {
                                Point point = new Point();
                                awemeListFragment.getActivity().getWindowManager().getDefaultDisplay().getSize(point);
                                Rect rect = new Rect(0, 0, point.x, point.y);
                                view.getLocationInWindow(new int[2]);
                                z = view.getLocalVisibleRect(rect);
                            }
                            if (z) {
                                new an().a(str).b(awemeViewHolder.c(), i2).e();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
        }
    }

    private DmtTextView c(@StringRes int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3784a, false, 67731, new Class[]{Integer.TYPE}, DmtTextView.class)) {
            return (DmtTextView) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3784a, false, 67731, new Class[]{Integer.TYPE}, DmtTextView.class);
        }
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
        dmtTextView.setTextColor(getResources().getColor(C0906R.color.zv));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{12}, this, f3784a, false, 67803, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{12}, this, f3784a, false, 67803, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.getRecycledViewPool().setMaxRecycledViews(0, 12);
        }
    }

    public void d(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3784a, false, 67759, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3784a, false, 67759, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.N != z2) {
            this.N = z2;
            J();
            this.q.e();
        }
    }

    @Subscribe
    public void onDynamicEvent(com.ss.android.ugc.aweme.challenge.a.c cVar) {
        com.ss.android.ugc.aweme.challenge.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3784a, false, 67795, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3784a, false, 67795, new Class[]{com.ss.android.ugc.aweme.challenge.a.c.class}, Void.TYPE);
        } else if (cVar2.f35317a == 0) {
            a(true, false);
        } else {
            y();
        }
    }

    @Subscribe
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (PatchProxy.isSupport(new Object[]{followStatus}, this, f3784a, false, 67794, new Class[]{FollowStatus.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followStatus}, this, f3784a, false, 67794, new Class[]{FollowStatus.class}, Void.TYPE);
        } else if (isViewValid() && this.n != null) {
            this.n.a(followStatus);
        }
    }

    @Subscribe
    public void onPrivateModelEvent(ad adVar) {
        if (PatchProxy.isSupport(new Object[]{adVar}, this, f3784a, false, 67796, new Class[]{ad.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adVar}, this, f3784a, false, 67796, new Class[]{ad.class}, Void.TYPE);
        } else if (adVar.f45279b != null && this.n != null) {
            for (int i = 0; i < this.n.getData().size(); i++) {
                Aweme aweme = (Aweme) this.n.getData().get(i);
                if (aweme.getAid().equals(adVar.f45279b.getAid())) {
                    aweme.setStatus(adVar.f45279b.getStatus());
                    this.n.notifyItemChanged(i);
                    return;
                }
            }
        }
    }

    @Subscribe
    public void onPublishStatusUpdate(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f3784a, false, 67798, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f3784a, false, 67798, new Class[]{e.class}, Void.TYPE);
            return;
        }
        if (eVar2.f67642c == 9 && !TimeLockRuler.isTeenModeON()) {
            F();
        }
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onUpdateWhoCanSeeMyLikeListModeEvent(af afVar) {
        if (PatchProxy.isSupport(new Object[]{afVar}, this, f3784a, false, 67797, new Class[]{af.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{afVar}, this, f3784a, false, 67797, new Class[]{af.class}, Void.TYPE);
            return;
        }
        if (this.f3788e && TextUtils.equals(this.k, eg.a(1))) {
            J();
        }
    }

    public void setUserVisibleHint(boolean z2) {
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3784a, false, 67745, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3784a, false, 67745, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z2);
        if (z2) {
            if (this.f3788e && TextUtils.equals(this.k, eg.a(1))) {
                x.a().f().a(Boolean.FALSE);
            }
            o();
        } else {
            y();
        }
        ab a2 = ab.a();
        if (this.f3787d != 0) {
            z3 = false;
        }
        a2.f39291d = z3;
        if (K() && this.n != null) {
            this.n.p = z2;
        }
    }

    public final void a_(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3784a, false, 67787, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3784a, false, 67787, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (this.n.g) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            if (i2 < this.n.getItemCount() || i2 == 0) {
                this.n.notifyItemRemoved(i2);
                if (this.n.getBasicItemCount() == 0) {
                    if (this.f3787d == 1) {
                        J();
                        this.q.e();
                    } else {
                        this.q.setVisibility(4);
                    }
                    if (this.r != null) {
                        this.r.a(this.f3788e, this.f3787d);
                    }
                }
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3784a, false, 67764, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3784a, false, 67764, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (H()) {
                this.q.f();
            } else {
                this.q.b();
            }
            if (!CollectionUtils.isEmpty(this.n.getData())) {
                this.n.clearData();
            }
            this.s = true;
            if (this.f3788e && (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                com.ss.android.ugc.aweme.profile.d.a.a(this.f3787d, false, ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse());
            }
        }
    }

    public final void c(Exception exc) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3784a, false, 67771, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3784a, false, 67771, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.n.showPullUpLoadMore();
            if (this.f3788e) {
                if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67772, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67772, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (this.n == null || CollectionUtils.isEmpty(this.n.getData()) || this.n.getData().size() > 20) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2 && (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
                    com.ss.android.ugc.aweme.profile.d.a.a(this.f3787d, true, ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getResponse());
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3784a, false, 67726, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3784a, false, 67726, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67751, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67751, new Class[0], Void.TYPE);
            return;
        }
        Bundle arguments = getArguments();
        this.f3787d = arguments.getInt("type");
        String string = arguments.getString("uid");
        String string2 = arguments.getString("sec_user_id");
        if (!TextUtils.isEmpty(string)) {
            this.f3785b = string;
        }
        if (!TextUtils.isEmpty(string2)) {
            this.f3786c = string2;
        }
        this.f3788e = arguments.getBoolean("is_my_profile");
        this.h = arguments.getInt("bottom_bar_height");
        this.u = arguments.getBoolean("should_refresh_on_init_data", false);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(IDraftService iDraftService) throws Exception {
        try {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkToTransformMusDraft();
            final List queryList = iDraftService.queryList();
            com.ss.android.b.a.a.a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f61728a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f61728a, false, 67814, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f61728a, false, 67814, new Class[0], Void.TYPE);
                    } else if (CollectionUtils.isEmpty(queryList)) {
                        AwemeListFragment.this.n();
                    } else {
                        AwemeListFragment.this.a((com.ss.android.ugc.aweme.draft.a.c) queryList.get(queryList.size() - 1));
                    }
                }
            });
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.framework.a.a.a(th);
        }
        return null;
    }

    public void c(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3784a, false, 67735, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3784a, false, 67735, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.L != z2) {
            this.L = z2;
            J();
            this.q.e();
        }
    }

    public final void b(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3784a, false, 67774, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3784a, false, 67774, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z2) {
            this.n.setLoadMoreListener(null);
            if (com.ss.android.g.a.a()) {
                this.n.setShowFooter(false);
            } else {
                this.n.showLoadMoreEmpty();
                this.n.setShowFooter(true);
            }
        }
    }

    @Subscribe
    public void onVideoEvent(ar arVar) {
        int i;
        ar arVar2 = arVar;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{arVar2}, this, f3784a, false, 67799, new Class[]{ar.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arVar2}, this, f3784a, false, 67799, new Class[]{ar.class}, Void.TYPE);
        } else if (isViewValid() && !TimeLockRuler.isTeenModeON()) {
            int i2 = arVar2.f45292b;
            if (i2 != 2) {
                if (i2 != 13) {
                    if (i2 != 15) {
                        if (i2 == 21) {
                            Aweme aweme = (Aweme) arVar2.f45293c;
                            if (aweme != null && this.f3787d == arVar2.h) {
                                int a2 = this.n.a(aweme.getAid());
                                if (a2 != -1 && (this.m.getLayoutManager() instanceof j)) {
                                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(a2)}, this, f3784a, false, 67800, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
                                        z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(a2)}, this, f3784a, false, 67800, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
                                    } else {
                                        View findViewByPosition = this.m.getLayoutManager().findViewByPosition(a2);
                                        if (findViewByPosition != null) {
                                            int[] iArr = new int[2];
                                            findViewByPosition.getLocationOnScreen(iArr);
                                            if (PatchProxy.isSupport(new Object[0], this, f3784a, false, 67801, new Class[0], Integer.TYPE)) {
                                                i = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3784a, false, 67801, new Class[0], Integer.TYPE)).intValue();
                                            } else if (Build.VERSION.SDK_INT < 17 || getActivity() == null) {
                                                i = UIUtils.getScreenHeight(GlobalContext.getContext());
                                            } else {
                                                Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
                                                DisplayMetrics displayMetrics = new DisplayMetrics();
                                                defaultDisplay.getRealMetrics(displayMetrics);
                                                i = displayMetrics.heightPixels;
                                            }
                                            int i3 = i - iArr[1];
                                            if (findViewByPosition.getHeight() > 0 && (((float) i3) * 1.0f) / ((float) findViewByPosition.getHeight()) > 0.4f) {
                                                z2 = false;
                                            }
                                        }
                                    }
                                    if (z2) {
                                        bg.a(new dh(this.f3788e));
                                        ((j) this.m.getLayoutManager()).scrollToPositionWithOffset(a2, 0);
                                    }
                                }
                            }
                        }
                    } else if (this.f3788e && this.f3787d == 0) {
                        Aweme a3 = com.ss.android.ugc.aweme.feed.a.a().a((Aweme) arVar2.f45293c);
                        if (a3 != null && this.p.a((Object) a3, 0)) {
                            com.ss.android.ugc.aweme.profile.presenter.b bVar = (com.ss.android.ugc.aweme.profile.presenter.b) this.p.i();
                            String str = this.f3785b;
                            if (PatchProxy.isSupport(new Object[]{a3, str}, bVar, com.ss.android.ugc.aweme.profile.presenter.b.f61591a, false, 67553, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
                                com.ss.android.ugc.aweme.profile.presenter.b bVar2 = bVar;
                                PatchProxy.accessDispatch(new Object[]{a3, str}, bVar2, com.ss.android.ugc.aweme.profile.presenter.b.f61591a, false, 67553, new Class[]{Aweme.class, String.class}, Void.TYPE);
                            } else {
                                Observable.create(new com.ss.android.ugc.aweme.profile.presenter.e(bVar, str, a3)).subscribeOn(Schedulers.io()).subscribe();
                            }
                            a(false, true);
                            this.q.setVisibility(4);
                            if (this.r != null) {
                                this.r.b(this.f3788e, this.f3787d);
                            }
                        }
                    }
                } else if (this.f3788e && this.f3787d == 1) {
                    String str2 = (String) arVar2.f45293c;
                    Aweme b2 = com.ss.android.ugc.aweme.feed.a.a().b(str2);
                    if (b2 == null) {
                        b2 = com.ss.android.ugc.aweme.feed.a.a().a(str2, this.f3787d);
                    }
                    Aweme aweme2 = b2;
                    if (!(aweme2 == null || aweme2.getAwemeType() == 13 || aweme2.getUserDigg() == 0)) {
                        if (PatchProxy.isSupport(new Object[]{aweme2}, this, f3784a, false, 67777, new Class[]{Aweme.class}, Boolean.TYPE)) {
                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme2}, this, f3784a, false, 67777, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                        } else {
                            List list = this.n.mItems;
                            if (list != null) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    Aweme aweme3 = (Aweme) it2.next();
                                    if (aweme3 != null && TextUtils.equals(aweme2.getAid(), aweme3.getAid())) {
                                        break;
                                    }
                                }
                            }
                            z2 = false;
                        }
                        if (z2 || !this.p.a((Object) aweme2, 0)) {
                        }
                    }
                }
            } else if (this.f3788e && this.f3787d == 0) {
                String str3 = (String) arVar2.f45293c;
                if (isViewValid() && !TextUtils.isEmpty(str3)) {
                    Aweme b3 = com.ss.android.ugc.aweme.feed.a.a().b(str3);
                    if (b3 == null) {
                        b3 = com.ss.android.ugc.aweme.feed.a.a().a(str3);
                    }
                    if (this.p.a((Object) b3)) {
                        com.ss.android.ugc.aweme.profile.presenter.b bVar3 = (com.ss.android.ugc.aweme.profile.presenter.b) this.p.i();
                        String str4 = this.f3785b;
                        if (PatchProxy.isSupport(new Object[]{b3, str4}, bVar3, com.ss.android.ugc.aweme.profile.presenter.b.f61591a, false, 67552, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
                            com.ss.android.ugc.aweme.profile.presenter.b bVar4 = bVar3;
                            PatchProxy.accessDispatch(new Object[]{b3, str4}, bVar4, com.ss.android.ugc.aweme.profile.presenter.b.f61591a, false, 67552, new Class[]{Aweme.class, String.class}, Void.TYPE);
                        } else {
                            Observable.create(new com.ss.android.ugc.aweme.profile.presenter.d(bVar3, str4, b3)).subscribeOn(Schedulers.io()).subscribe();
                        }
                        this.n.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.draft.a.c cVar) {
        com.ss.android.ugc.aweme.draft.a.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f3784a, false, 67744, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f3784a, false, 67744, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            AwemeAdapter awemeAdapter = this.n;
            if (PatchProxy.isSupport(new Object[]{cVar2}, awemeAdapter, AwemeAdapter.f61233f, false, 67354, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE)) {
                AwemeAdapter awemeAdapter2 = awemeAdapter;
                PatchProxy.accessDispatch(new Object[]{cVar2}, awemeAdapter2, AwemeAdapter.f61233f, false, 67354, new Class[]{com.ss.android.ugc.aweme.draft.a.c.class}, Void.TYPE);
                return;
            }
            awemeAdapter.l = cVar2;
            awemeAdapter.g = true;
            awemeAdapter.notifyDataSetChanged();
        }
    }

    public final void a(@Nullable RoomStruct roomStruct) {
        boolean z2;
        RoomStruct roomStruct2 = roomStruct;
        if (PatchProxy.isSupport(new Object[]{roomStruct2}, this, f3784a, false, 67804, new Class[]{RoomStruct.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{roomStruct2}, this, f3784a, false, 67804, new Class[]{RoomStruct.class}, Void.TYPE);
            return;
        }
        if (this.n != null) {
            if (!this.n.d() || roomStruct2 != null) {
                z2 = false;
            } else {
                z2 = true;
            }
            AwemeAdapter awemeAdapter = this.n;
            if (PatchProxy.isSupport(new Object[]{roomStruct2}, awemeAdapter, AwemeAdapter.f61233f, false, 67369, new Class[]{RoomStruct.class}, Void.TYPE)) {
                AwemeAdapter awemeAdapter2 = awemeAdapter;
                PatchProxy.accessDispatch(new Object[]{roomStruct2}, awemeAdapter2, AwemeAdapter.f61233f, false, 67369, new Class[]{RoomStruct.class}, Void.TYPE);
            } else if (roomStruct2 != awemeAdapter.m) {
                awemeAdapter.m = roomStruct2;
                awemeAdapter.notifyDataSetChanged();
            }
            if (this.q.f20470b && z2 && k()) {
                y_();
            }
        }
    }

    public final void b(String str, String str2) {
        this.O = str;
        this.G = str2;
    }

    public final void a(String str, String str2) {
        this.f3785b = str;
        this.f3786c = str2;
        if (this.f3787d == 0 && !this.f3788e && this.p != null) {
            ((v) this.p).f61655b = this.f3785b;
        }
        this.s = true;
    }

    static final /* synthetic */ Object a(String str, long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        if (str == null) {
            str = "";
        }
        try {
            jSONObject.put("group_id", str);
            com.ss.android.ugc.aweme.store.a.f71743b = SystemClock.uptimeMillis() - j;
            jSONObject.put("duration", String.valueOf(com.ss.android.ugc.aweme.store.a.f71743b));
        } catch (JSONException unused) {
        }
        AppLogNewUtils.onEventV3("post_list", jSONObject);
        return null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3784a, false, 67748, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3784a, false, 67748, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.Q);
        p();
    }

    public final void b(List<Aweme> list, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3784a, false, 67773, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z2)}, this, f3784a, false, 67773, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.n.resetLoadMoreState();
            this.n.q = z2;
            if (AbTestManager.a().d().useRecyclerPartialUpdate) {
                this.n.setDataAfterLoadMore(list);
            } else {
                this.n.setData(list);
            }
            this.P = z2;
            if (CollectionUtils.isEmpty(list) && z2 && !this.N && !this.L) {
                loadMore();
            } else if (!CollectionUtils.isEmpty(list)) {
                this.q.b(true);
            }
            b(z2);
        }
    }

    public final void a(View view, Aweme aweme, String str) {
        String str2;
        View view2 = view;
        Aweme aweme2 = aweme;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{view2, aweme2, str3}, this, f3784a, false, 67784, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aweme2, str3}, this, f3784a, false, 67784, new Class[]{View.class, Aweme.class, String.class}, Void.TYPE);
            return;
        }
        if (!(com.ss.android.ugc.aweme.c.a.a.a(view) || aweme2 == null || getActivity() == null)) {
            com.ss.android.ugc.aweme.feed.a.a().f44610c = (com.ss.android.ugc.aweme.common.f.a) this.p.i();
            if (!NetworkUtils.isNetworkAvailable(getContext())) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.bgf).a();
                return;
            }
            o.a(this);
            Bundle bundle = new Bundle();
            bundle.putString("id", aweme.getAid());
            if (this.f3788e) {
                str2 = "from_profile_self";
            } else {
                str2 = "from_profile_other";
            }
            bundle.putString("video_from", str2);
            bundle.putInt("video_type", this.f3787d);
            bundle.putString("userid", this.f3785b);
            bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
            bundle.putString("enter_method", this.K);
            bundle.putString("like_enter_method", this.w);
            bundle.putString("content_source", this.x);
            bundle.putString("refer", str3);
            bundle.putString("previous_page", this.G);
            bundle.putString("extra_previous_page_position", this.H);
            bundle.putString("tab_name", this.k);
            bundle.putString("enter_from_request_id", this.O);
            bundle.putString("feeds_aweme_id", this.F);
            bundle.putInt("from_post_list", this.l);
            DetailActivity.a((Activity) getActivity(), bundle, view2);
            com.ss.android.ugc.aweme.feed.b.b.a(aweme);
            if (K()) {
                com.ss.android.ugc.aweme.favorites.d.a.a(2, aweme2);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3784a, false, 67727, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3784a, false, 67727, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(b(), viewGroup2, false);
        this.m = (RecyclerView) inflate.findViewById(C0906R.id.acu);
        this.q = (DmtStatusView) inflate.findViewById(C0906R.id.cvd);
        this.y = (ViewStub) inflate.findViewById(C0906R.id.cx0);
        this.z = this.y.inflate();
        if (TimeLockRuler.isTeenModeON()) {
            ((TextView) this.z.findViewById(C0906R.id.title)).setText(C0906R.string.cit);
            ((TextView) this.z.findViewById(C0906R.id.yp)).setText(C0906R.string.cii);
        }
        this.z.setVisibility(4);
        if (this.m instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.m).setLabel("profile_list");
        }
        if (AbTestManager.a().d().useRecyclerPartialUpdate && this.m.getItemAnimator() != null) {
            this.m.getItemAnimator().setAddDuration(0);
        }
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f3784a, false, 67728, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f3784a, false, 67728, new Class[]{View.class}, Void.TYPE);
        } else if (this.f3788e && TextUtils.equals(this.k, eg.a(1)) && !ex.b() && ((Boolean) x.a().f().c()).booleanValue() && !((Boolean) x.a().h().c()).booleanValue() && !((Boolean) x.a().d().c()).booleanValue() && !TimeLockRuler.isTeenModeON()) {
            this.E = inflate.findViewById(C0906R.id.amf);
            TextView textView = (TextView) inflate.findViewById(C0906R.id.bbh);
            ImageView imageView = (ImageView) inflate.findViewById(C0906R.id.azy);
            if (com.ss.android.g.a.c()) {
                imageView.setImageResource(2130838836);
                textView.setTextColor(getResources().getColor(C0906R.color.ou));
                this.E.setBackgroundColor(getResources().getColor(C0906R.color.h));
            }
            String string = getString(C0906R.string.al_);
            String string2 = getString(C0906R.string.c58);
            SpannableString spannableString = new SpannableString(string);
            int indexOf = string.indexOf(string2);
            int length = string2.length() + indexOf;
            if (indexOf >= 0 && length >= 0) {
                i.a(spannableString, new ClickableSpan() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f61724a;

                    public final void updateDrawState(@NonNull TextPaint textPaint) {
                        TextPaint textPaint2 = textPaint;
                        if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f61724a, false, 67812, new Class[]{TextPaint.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f61724a, false, 67812, new Class[]{TextPaint.class}, Void.TYPE);
                            return;
                        }
                        textPaint2.setUnderlineText(false);
                    }

                    public final void onClick(@NonNull View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f61724a, false, 67811, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f61724a, false, 67811, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).goToPrivacyActivity(AwemeListFragment.this.getContext());
                    }
                }, indexOf, length, 18);
                i.a(spannableString, new ForegroundColorSpan(getResources().getColor(C0906R.color.zm)), indexOf, length, 18);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setText(spannableString);
            }
            imageView.setOnClickListener(new b(this));
        }
        g();
        return inflate;
    }

    public static AwemeListFragment a(int i, int i2, String str, String str2, boolean z2, boolean z3) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str3, str4, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, null, f3784a, true, 67725, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, AwemeListFragment.class)) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str3, str4, Byte.valueOf(z2), Byte.valueOf(z3)};
            return (AwemeListFragment) PatchProxy.accessDispatch(objArr, null, f3784a, true, 67725, new Class[]{Integer.TYPE, Integer.TYPE, String.class, String.class, Boolean.TYPE, Boolean.TYPE}, AwemeListFragment.class);
        }
        AwemeListFragment awemeListFragment = new AwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i2);
        bundle.putString("uid", str3);
        bundle.putString("sec_user_id", str4);
        bundle.putBoolean("is_my_profile", z2);
        bundle.putInt("bottom_bar_height", i);
        bundle.putBoolean("should_refresh_on_init_data", z3);
        awemeListFragment.setArguments(bundle);
        return awemeListFragment;
    }
}
