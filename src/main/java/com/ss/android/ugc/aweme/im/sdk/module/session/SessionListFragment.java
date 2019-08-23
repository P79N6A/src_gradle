package com.ss.android.ugc.aweme.im.sdk.module.session;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.im.core.b.e.l;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.d.i;
import com.ss.android.ugc.aweme.im.sdk.d.k;
import com.ss.android.ugc.aweme.im.sdk.model.XPlanAwemeBannerConfig;
import com.ss.android.ugc.aweme.im.sdk.module.session.a.e;
import com.ss.android.ugc.aweme.im.sdk.module.session.b.b;
import com.ss.android.ugc.aweme.im.sdk.story.d;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.bc;
import com.ss.android.ugc.aweme.im.sdk.utils.g;
import com.ss.android.ugc.aweme.im.sdk.utils.m;
import com.ss.android.ugc.aweme.im.sdk.utils.o;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.c.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.c;

public class SessionListFragment extends AmeBaseFragment implements l.a, LoadMoreRecyclerViewAdapter.a, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51853a;

    /* renamed from: b  reason: collision with root package name */
    public View f51854b;

    /* renamed from: c  reason: collision with root package name */
    public SessionListAdapter f51855c;

    /* renamed from: d  reason: collision with root package name */
    public DmtStatusView f51856d;

    /* renamed from: e  reason: collision with root package name */
    public int f51857e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f51858f = -1;
    private View g;
    private RecyclerView h;
    private RecyclerView i;
    private LinearLayoutManager j;
    private b k;
    private boolean l;
    private boolean m = true;
    private View n;
    private DmtButton o;
    private RemoteImageView p;
    private RemoteImageView q;
    private View r;
    private TextView s;
    private ImageView t;
    private RemoteImageView[] u = new RemoteImageView[3];
    private l v = new l(this);
    private Boolean w = Boolean.TRUE;
    private RecyclerView.OnScrollListener x = new RecyclerView.OnScrollListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51861a;

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f51861a, false, 52434, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f51861a, false, 52434, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (SessionListFragment.this.f51857e == -1 || SessionListFragment.this.f51858f == -1) {
                    SessionListFragment.this.f51857e = findFirstVisibleItemPosition;
                    SessionListFragment.this.f51858f = findLastVisibleItemPosition;
                    return;
                }
                if (SessionListFragment.this.f51857e < findFirstVisibleItemPosition) {
                    SessionListFragment.this.a(linearLayoutManager, SessionListFragment.this.f51857e, findFirstVisibleItemPosition - 1);
                }
                if (SessionListFragment.this.f51858f > findLastVisibleItemPosition) {
                    SessionListFragment.this.a(linearLayoutManager, findLastVisibleItemPosition + 1, SessionListFragment.this.f51858f);
                }
                SessionListFragment.this.f51857e = findFirstVisibleItemPosition;
                SessionListFragment.this.f51858f = findLastVisibleItemPosition;
            }
        }
    };

    private static int a(int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 >= 0) {
            return i4;
        }
        return 0;
    }

    public final Fragment b() {
        return this;
    }

    public final void c() {
    }

    public final void d() {
    }

    public void loadMore() {
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52416, new Class[0], Void.TYPE);
            return;
        }
        if (this.l) {
            this.v.sendEmptyMessageDelayed(221, 600000);
        }
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52422, new Class[0], Void.TYPE);
            return;
        }
        this.f51854b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51865a;

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f51865a, false, 52436, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f51865a, false, 52436, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) SessionListFragment.this.f51856d.getLayoutParams();
                layoutParams.topMargin = SessionListFragment.this.f51854b.getHeight();
                SessionListFragment.this.f51856d.setLayoutParams(layoutParams);
            }
        });
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52414, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.l = false;
        this.k.a(false);
        this.v.removeMessages(221);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52417, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52417, new Class[0], Void.TYPE);
            return;
        }
        if (!m.a() && this.f51855c != null && this.f51855c.getData() != null && this.f51855c.getData().size() > 0) {
            try {
                int a2 = this.f51855c.a();
                d.a(this.f51855c.getData().subList(a(this.j.findFirstVisibleItemPosition(), a2), Math.min(a(this.j.findLastVisibleItemPosition(), a2) + 1, this.f51855c.getData().size())));
            } catch (Exception unused) {
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52425, new Class[0], Void.TYPE);
        } else if (NetworkUtils.isNetworkAvailable(getActivity())) {
            if (this.f51855c.b()) {
                this.f51856d.d();
            }
            ad.b();
            c.a().d("sessionListFragment-onMain");
        } else {
            if (this.f51855c.b()) {
                com.ss.android.b.a.a.a.a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51871a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f51871a, false, 52439, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f51871a, false, 52439, new Class[0], Void.TYPE);
                        } else if (SessionListFragment.this.isViewValid() && SessionListFragment.this.f51855c.getItemCount() <= 0) {
                            SessionListFragment.this.f51856d.f();
                            com.bytedance.ies.dmt.ui.d.a.b((Context) SessionListFragment.this.getActivity(), (int) C0906R.string.bgf).a();
                        }
                    }
                }, 100);
            }
        }
    }

    public final void e() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52431, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52431, new Class[0], Void.TYPE);
            return;
        }
        RecyclerView recyclerView = this.i;
        SessionListAdapter sessionListAdapter = this.f51855c;
        if (PatchProxy.isSupport(new Object[]{recyclerView, sessionListAdapter}, null, b.f51931a, true, 52385, new Class[]{RecyclerView.class, SessionListAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, sessionListAdapter}, null, b.f51931a, true, 52385, new Class[]{RecyclerView.class, SessionListAdapter.class}, Void.TYPE);
            return;
        }
        List data = sessionListAdapter.getData();
        if (data != null && data.size() != 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            if (linearLayoutManager != null) {
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                int a2 = sessionListAdapter.a();
                int i2 = (findFirstVisibleItemPosition + 1) - a2;
                int i3 = -1;
                while (true) {
                    if (i2 < 0 || i2 >= data.size()) {
                        break;
                    }
                    com.ss.android.ugc.aweme.im.service.session.a aVar = (com.ss.android.ugc.aweme.im.service.session.a) data.get(i2);
                    com.bytedance.im.core.d.b a3 = com.bytedance.im.core.d.d.a().a(aVar.O_());
                    int i4 = aVar.m;
                    int b2 = aVar.b();
                    if (a3 == null || !a3.isMute()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean a4 = b.a(i4, b2, z);
                    if (i3 == -1) {
                        if (aVar.b() == 10) {
                            int f2 = ((e) aVar).f();
                            int b3 = aVar.b();
                            if (a3 == null || !a3.isMute()) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            z2 = b.b(f2, b3, z5);
                        } else if (aVar.b() == 17) {
                            int i5 = ((com.ss.android.ugc.aweme.im.sdk.module.session.a.b) aVar).f51902b;
                            int b4 = aVar.b();
                            if (a3 == null || !a3.isMute()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            z2 = b.b(i5, b4, z4);
                        } else {
                            int i6 = aVar.m;
                            int b5 = aVar.b();
                            if (a3 == null || !a3.isMute()) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            z2 = b.b(i6, b5, z3);
                        }
                        if (z2) {
                            i3 = i2;
                        }
                    }
                    if (!a4) {
                        int i7 = findFirstVisibleItemPosition - a2;
                        if (i2 == i7 || (i2 == data.size() - 1 && i7 == -1)) {
                            break;
                        } else if (i2 == data.size() - 1) {
                            i2 = 0;
                        } else {
                            i2++;
                        }
                    } else {
                        break;
                    }
                }
                i2 = -1;
                int i8 = findLastVisibleItemPosition - findFirstVisibleItemPosition;
                if ((i2 == -1 || i2 + a2 > findFirstVisibleItemPosition) && !(recyclerView.getChildAt(i8) != null && recyclerView.getHeight() == recyclerView.getChildAt(i8).getBottom() && findLastVisibleItemPosition - a2 == data.size())) {
                    int i9 = i2 + a2;
                    if (i9 > findFirstVisibleItemPosition) {
                        b.a(recyclerView, a2, findFirstVisibleItemPosition, findLastVisibleItemPosition, i9);
                    } else if ((i3 == -1 || i3 + a2 > findFirstVisibleItemPosition) && !(recyclerView.getChildAt(i8) != null && recyclerView.getHeight() == recyclerView.getChildAt(i8).getBottom() && findLastVisibleItemPosition - a2 == data.size())) {
                        int i10 = i3 + a2;
                        if (i10 > findFirstVisibleItemPosition) {
                            b.a(recyclerView, a2, findFirstVisibleItemPosition, findLastVisibleItemPosition, i10);
                            return;
                        }
                        b.a(recyclerView, a2, findFirstVisibleItemPosition, findLastVisibleItemPosition, 0);
                    } else {
                        b.a(recyclerView, a2, findFirstVisibleItemPosition, findLastVisibleItemPosition, 0);
                    }
                } else {
                    b.a(recyclerView, a2, findFirstVisibleItemPosition, findLastVisibleItemPosition, 0);
                }
            }
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52418, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52418, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (PatchProxy.isSupport(new Object[0], null, i.f51262a, true, 51771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, i.f51262a, true, 51771, new Class[0], Void.TYPE);
        } else {
            if (i.f51263b != null) {
                Handler handler = i.f51263b;
                if (handler == null) {
                    Intrinsics.throwNpe();
                }
                handler.removeMessages(220);
                i.f51263b = null;
            }
            if (i.f51264c != null) {
                i.f51264c = null;
            }
        }
        if (PatchProxy.isSupport(new Object[0], null, d.f52436a, true, 53291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, d.f52436a, true, 53291, new Class[0], Void.TYPE);
        } else {
            com.ss.android.ugc.aweme.story.api.i iVar = d.f52439d;
            if (iVar != null) {
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.api.b.d> b2 = iVar.b();
                if (b2 != null) {
                    b2.removeObserver(d.f52440e);
                }
            }
            d.f52439d = null;
            Handler handler2 = d.f52438c;
            if (handler2 != null) {
                handler2.removeMessages(220);
            }
            d.f52438c = null;
            if (d.f52437b != null) {
                d.f52437b = null;
            }
        }
        if (this.k != null) {
            b bVar = this.k;
            if (PatchProxy.isSupport(new Object[0], bVar, b.f3391a, false, 52509, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], bVar, b.f3391a, false, 52509, new Class[0], Void.TYPE);
            } else {
                if (c.a().b((Object) bVar)) {
                    c.a().c(bVar);
                }
                com.ss.android.ugc.aweme.im.sdk.module.stranger.b.a().f51960c = null;
            }
        }
        k.a().b(this.k);
        if (this.i != null) {
            this.i.setAdapter(null);
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52415, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (bc.b() && !this.w.booleanValue()) {
            a(o.a().k());
        }
        this.w = Boolean.FALSE;
        this.k.a(true);
        ad.b();
        if (!this.m) {
            SessionListAdapter sessionListAdapter = this.f51855c;
            if (PatchProxy.isSupport(new Object[0], sessionListAdapter, SessionListAdapter.f51842a, false, 52404, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], sessionListAdapter, SessionListAdapter.f51842a, false, 52404, new Class[0], Void.TYPE);
            } else if (!(sessionListAdapter.mItems == null || sessionListAdapter.mItems.size() == 0)) {
                for (com.ss.android.ugc.aweme.im.service.session.a aVar : sessionListAdapter.mItems) {
                    aVar.s = false;
                }
                sessionListAdapter.notifyDataSetChanged();
            }
            g();
        }
        k a2 = k.a();
        if (PatchProxy.isSupport(new Object[0], a2, k.f51273a, false, 51809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a2, k.f51273a, false, 51809, new Class[0], Void.TYPE);
        } else if (bc.a()) {
            o a3 = o.a();
            int i2 = a2.f51278f;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, a3, o.f52605a, false, 53405, new Class[]{Integer.TYPE}, Void.TYPE)) {
                o oVar = a3;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, oVar, o.f52605a, false, 53405, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                a3.f52608b.edit().putInt("last_xcard_unread_dot", i2).commit();
            }
            if (a2.f51277e > 0 || a2.f51278f > 0) {
                a2.e();
            }
        }
        this.m = false;
        this.l = true;
        f();
    }

    public final RecyclerView a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f51853a, false, 52429, new Class[]{Context.class}, RecyclerView.class)) {
            return (RecyclerView) PatchProxy.accessDispatch(new Object[]{context}, this, f51853a, false, 52429, new Class[]{Context.class}, RecyclerView.class);
        }
        c(context);
        return this.h;
    }

    public final View b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f51853a, false, 52430, new Class[]{Context.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context}, this, f51853a, false, 52430, new Class[]{Context.class}, View.class);
        }
        c(context);
        return this.g;
    }

    public final void a(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f51853a, false, 52432, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f51853a, false, 52432, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message2.what == 221) {
            this.v.removeMessages(221);
            g();
            f();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51853a, false, 52411, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51853a, false, 52411, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], null, i.f51262a, true, 51770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, i.f51262a, true, 51770, new Class[0], Void.TYPE);
        } else {
            if (i.f51264c == null) {
                i.f51264c = new CopyOnWriteArrayList();
            }
            if (i.f51263b == null) {
                i.f51263b = new i.a();
            }
        }
        FragmentActivity activity = getActivity();
        if (PatchProxy.isSupport(new Object[]{activity}, null, d.f52436a, true, 53290, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, d.f52436a, true, 53290, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity, "context");
        if (d.f52437b == null) {
            d.f52437b = new CopyOnWriteArrayList();
        }
        if (d.f52438c == null) {
            d.f52438c = new d.a();
        }
        Activity a2 = com.ss.android.ugc.aweme.im.sdk.story.e.a(activity);
        if (d.f52439d == null && a2 != null) {
            com.ss.android.ugc.aweme.story.api.i iVar = (com.ss.android.ugc.aweme.story.api.i) ServiceManager.get().getService(com.ss.android.ugc.aweme.story.api.i.class);
            d.f52439d = iVar;
            if (iVar != null) {
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.story.api.b.d> b2 = iVar.b();
                if (b2 != null) {
                    b2.observe((LifecycleOwner) a2, d.f52440e);
                }
            }
        }
    }

    private void c(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f51853a, false, 52421, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f51853a, false, 52421, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f51854b == null) {
            this.f51854b = LayoutInflater.from(context).inflate(C0906R.layout.a6d, null);
            h();
            this.h = (RecyclerView) this.f51854b.findViewById(C0906R.id.cib);
            if (bc.b()) {
                this.n = this.f51854b.findViewById(C0906R.id.cgt);
                this.n.setVisibility(0);
                this.o = (DmtButton) this.n.findViewById(C0906R.id.a71);
                this.p = (RemoteImageView) this.n.findViewById(C0906R.id.c7);
                this.r = this.n.findViewById(C0906R.id.m_);
                this.s = (TextView) this.n.findViewById(C0906R.id.a3s);
                this.t = (ImageView) this.n.findViewById(C0906R.id.d38);
                this.q = (RemoteImageView) this.n.findViewById(C0906R.id.az1);
                this.u[0] = (RemoteImageView) this.n.findViewById(C0906R.id.amt);
                this.u[1] = (RemoteImageView) this.n.findViewById(C0906R.id.amu);
                this.u[2] = (RemoteImageView) this.n.findViewById(C0906R.id.amv);
            }
            this.g = this.f51854b.findViewById(C0906R.id.b8p);
            this.f51854b.findViewById(C0906R.id.dbw).setTag("tag_msg_follow_request_count");
            this.f51854b.findViewById(C0906R.id.ah4).setTag("tag_msg_follow_request_unread_dot");
        }
    }

    public final void a(final XPlanAwemeBannerConfig xPlanAwemeBannerConfig) {
        if (PatchProxy.isSupport(new Object[]{xPlanAwemeBannerConfig}, this, f51853a, false, 52426, new Class[]{XPlanAwemeBannerConfig.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xPlanAwemeBannerConfig}, this, f51853a, false, 52426, new Class[]{XPlanAwemeBannerConfig.class}, Void.TYPE);
        } else if (this.n != null) {
            if (!(xPlanAwemeBannerConfig == null || xPlanAwemeBannerConfig.getBackgroundIcon() == null)) {
                ((GenericDraweeHierarchy) this.q.getHierarchy()).setActualImageFocusPoint(new PointF(0.5f, 0.0f));
                com.ss.android.ugc.aweme.base.c.b(this.q, xPlanAwemeBannerConfig.getBackgroundIcon().f52891b);
            }
            if (xPlanAwemeBannerConfig == null || xPlanAwemeBannerConfig.getLogoIcon() == null) {
                com.ss.android.ugc.aweme.base.c.a(this.p, 2130840155);
            } else {
                com.ss.android.ugc.aweme.base.c.b(this.p, xPlanAwemeBannerConfig.getLogoIcon().f52891b);
            }
            if (bc.a(getContext())) {
                this.o.setText(C0906R.string.b06);
            } else if (bc.d()) {
                this.o.setText(C0906R.string.b00);
            } else {
                this.o.setText(C0906R.string.aqx);
            }
            if (xPlanAwemeBannerConfig == null || CollectionUtils.isEmpty(xPlanAwemeBannerConfig.getSubHeadList()) || TextUtils.isEmpty(xPlanAwemeBannerConfig.getBodyText())) {
                this.r.setVisibility(8);
            } else {
                this.r.setVisibility(0);
                for (int i2 = 0; i2 < this.u.length; i2++) {
                    if (i2 < xPlanAwemeBannerConfig.getSubHeadList().size()) {
                        com.ss.android.ugc.aweme.base.c.b(this.u[i2], xPlanAwemeBannerConfig.getSubHeadList().get(i2));
                    }
                }
                this.s.setText(xPlanAwemeBannerConfig.getBodyText());
            }
            this.o.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51873a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51873a, false, 52440, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51873a, false, 52440, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (xPlanAwemeBannerConfig != null) {
                        bc.a((Activity) SessionListFragment.this.getActivity(), 1, (Object) xPlanAwemeBannerConfig.getOpenSchema());
                    } else {
                        bc.a((Activity) SessionListFragment.this.getActivity(), 1);
                    }
                }
            });
            this.t.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51876a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51876a, false, 52441, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51876a, false, 52441, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    FragmentActivity activity = SessionListFragment.this.getActivity();
                    if (PatchProxy.isSupport(new Object[]{activity}, null, bc.f52548a, true, 53824, new Class[]{Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{activity}, null, bc.f52548a, true, 53824, new Class[]{Context.class}, Void.TYPE);
                        return;
                    }
                    com.ss.android.ugc.aweme.im.sdk.d.a.a().e().openUrl(activity, Uri.parse(g.f52589e), false);
                }
            });
            this.n.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51878a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f51878a, false, 52442, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f51878a, false, 52442, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (xPlanAwemeBannerConfig != null) {
                        bc.a((Activity) SessionListFragment.this.getActivity(), 1, (Object) xPlanAwemeBannerConfig.getOpenSchema());
                    } else {
                        bc.a((Activity) SessionListFragment.this.getActivity(), 1);
                    }
                }
            });
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        long j2;
        View view2;
        View view3 = view;
        if (PatchProxy.isSupport(new Object[]{view3, bundle}, this, f51853a, false, 52413, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, bundle}, this, f51853a, false, 52413, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view3}, this, f51853a, false, 52419, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3}, this, f51853a, false, 52419, new Class[]{View.class}, Void.TYPE);
        } else {
            this.i = (RecyclerView) view3.findViewById(C0906R.id.co5);
            this.f51856d = (DmtStatusView) view3.findViewById(C0906R.id.cvd);
            this.j = new LinearLayoutManager(getActivity());
            this.i.setLayoutManager(this.j);
            this.i.setItemViewCacheSize(4);
            this.f51855c = new SessionListAdapter();
            this.i.setAdapter(this.f51855c);
            this.i.addOnScrollListener(new FrescoRecycleViewScrollListener(getActivity()));
            this.i.addOnScrollListener(this.x);
            this.f51855c.setLoadMoreListener(this);
            this.f51855c.setShowFooter(com.ss.android.ugc.aweme.im.sdk.d.a.b().needSessionListShowMore());
            this.f51855c.showLoadMoreEmpty();
            c(getContext());
            if (this.f51854b != null) {
                this.f51855c.a(this.f51854b);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52420, new Class[0], Void.TYPE);
        } else {
            this.i.addOnScrollListener(new RecyclerView.OnScrollListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51863a;

                public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                    if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f51863a, false, 52435, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f51863a, false, 52435, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        d.a();
                        i.a();
                    }
                }
            });
        }
        if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52423, new Class[0], Void.TYPE);
        } else {
            if (m.b()) {
                MtEmptyView a2 = MtEmptyView.a(getActivity());
                a2.setStatus(new c.a(getActivity()).a(2130839717).b((int) C0906R.string.bdk).c(C0906R.string.bdj).f20493a);
                this.f51856d.setBuilder(DmtStatusView.a.a((Context) getActivity()).b((View) a2).a().a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51867a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f51867a, false, 52437, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f51867a, false, 52437, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        SessionListFragment.this.a();
                    }
                }));
            } else {
                c.a c2 = new c.a(getActivity()).b((int) C0906R.string.axt).c(C0906R.string.axs);
                if (m.c()) {
                    view2 = MtEmptyView.a(getActivity());
                    ((MtEmptyView) view2).setStatus(c2.a(2130839717).f20493a);
                } else {
                    view2 = new DmtDefaultView(getActivity());
                    ((DmtDefaultView) view2).setStatus(c2.f20493a);
                }
                this.f51856d.setBuilder(DmtStatusView.a.a((Context) getActivity()).b(view2).a().a(2130840142, C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f51869a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f51869a, false, 52438, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f51869a, false, 52438, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        SessionListFragment.this.a();
                    }
                }));
                ViewGroup.LayoutParams layoutParams = this.f51856d.getLayoutParams();
                layoutParams.height = (int) UIUtils.dip2Px(getActivity(), 404.0f);
                this.f51856d.setLayoutParams(layoutParams);
            }
            this.k = new b(this.f51855c, this.f51856d);
            k.a().a((com.ss.android.ugc.aweme.im.sdk.module.session.b.a<com.ss.android.ugc.aweme.im.service.session.a>) this.k);
            if (PatchProxy.isSupport(new Object[0], this, f51853a, false, 52424, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f51853a, false, 52424, new Class[0], Void.TYPE);
            } else if (!m.a()) {
                com.ss.android.ugc.aweme.im.service.c e2 = com.ss.android.ugc.aweme.im.sdk.d.a.a().e();
                IIMService iIMService = (IIMService) ServiceManager.get().getService(IIMService.class);
                if (!(e2 == null || e2.isFFSDKBind() || iIMService == null)) {
                    o a3 = o.a();
                    if (PatchProxy.isSupport(new Object[0], a3, o.f52605a, false, 53424, new Class[0], Boolean.TYPE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a3, o.f52605a, false, 53424, new Class[0], Boolean.TYPE)).booleanValue();
                    } else {
                        z = a3.f52608b.getBoolean("flip_chat_push_click_show_state", false);
                    }
                    if (z) {
                        o a4 = o.a();
                        if (PatchProxy.isSupport(new Object[0], a4, o.f52605a, false, 53426, new Class[0], String.class)) {
                            str = (String) PatchProxy.accessDispatch(new Object[0], a4, o.f52605a, false, 53426, new Class[0], String.class);
                        } else {
                            str = a4.f52608b.getString("flip_chat_push_click_show_desc", "");
                        }
                        o a5 = o.a();
                        if (PatchProxy.isSupport(new Object[0], a5, o.f52605a, false, 53428, new Class[0], Long.TYPE)) {
                            j2 = ((Long) PatchProxy.accessDispatch(new Object[0], a5, o.f52605a, false, 53428, new Class[0], Long.TYPE)).longValue();
                        } else {
                            j2 = a5.f52608b.getLong("flip_chat_push_click_show_time", 0);
                        }
                        iIMService.onFlipChatPushMsgUpdate(str, j2);
                    }
                }
            }
            a();
        }
        if (bc.b()) {
            AnonymousClass1 r0 = new com.ss.android.ugc.aweme.base.a<XPlanAwemeBannerConfig>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f51859a;

                public final /* synthetic */ void run(Object obj) {
                    XPlanAwemeBannerConfig xPlanAwemeBannerConfig = (XPlanAwemeBannerConfig) obj;
                    if (PatchProxy.isSupport(new Object[]{xPlanAwemeBannerConfig}, this, f51859a, false, 52433, new Class[]{XPlanAwemeBannerConfig.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{xPlanAwemeBannerConfig}, this, f51859a, false, 52433, new Class[]{XPlanAwemeBannerConfig.class}, Void.TYPE);
                        return;
                    }
                    String str = "";
                    if (xPlanAwemeBannerConfig != null) {
                        SessionListFragment.this.a(xPlanAwemeBannerConfig);
                        str = xPlanAwemeBannerConfig.getBodyText();
                    } else {
                        XPlanAwemeBannerConfig k = o.a().k();
                        SessionListFragment.this.a(k);
                        if (k != null) {
                            str = k.getBodyText();
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (PatchProxy.isSupport(new Object[]{str}, null, z.f52670a, true, 53632, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, null, z.f52670a, true, 53632, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from", "message");
                        hashMap.put("banner_content", str);
                        r.a("duoshan_banner_content_show", (Map) hashMap);
                    }
                }
            };
            if (PatchProxy.isSupport(new Object[]{r0}, null, com.ss.android.ugc.aweme.im.sdk.utils.r.f52611a, true, 53462, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r0}, null, com.ss.android.ugc.aweme.im.sdk.utils.r.f52611a, true, 53462, new Class[]{com.ss.android.ugc.aweme.base.a.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.im.sdk.utils.r.f52612b.fetchXPlanAwemeBannerConfig().a((a.g<TResult, TContinuationResult>) new a.g<XPlanAwemeBannerConfig, XPlanAwemeBannerConfig>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52623a;

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public XPlanAwemeBannerConfig then(a.i<XPlanAwemeBannerConfig> iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f52623a, false, 53491, new Class[]{a.i.class}, XPlanAwemeBannerConfig.class)) {
                            return (XPlanAwemeBannerConfig) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52623a, false, 53491, new Class[]{a.i.class}, XPlanAwemeBannerConfig.class);
                        } else if (!iVar.b() || iVar.e() == null) {
                            return null;
                        } else {
                            XPlanAwemeBannerConfig xPlanAwemeBannerConfig = (XPlanAwemeBannerConfig) iVar.e();
                            if (xPlanAwemeBannerConfig != null) {
                                o a2 = o.a();
                                if (PatchProxy.isSupport(new Object[]{xPlanAwemeBannerConfig}, a2, o.f52605a, false, 53438, new Class[]{XPlanAwemeBannerConfig.class}, Void.TYPE)) {
                                    o oVar = a2;
                                    PatchProxy.accessDispatch(new Object[]{xPlanAwemeBannerConfig}, oVar, o.f52605a, false, 53438, new Class[]{XPlanAwemeBannerConfig.class}, Void.TYPE);
                                } else {
                                    try {
                                        a2.f52608b.edit().putString("banner_config", l.a(xPlanAwemeBannerConfig)).commit();
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            return xPlanAwemeBannerConfig;
                        }
                    }
                }).a((a.g<TResult, TContinuationResult>) new a.g<XPlanAwemeBannerConfig, Void>(r0) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f52621a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ com.ss.android.ugc.aweme.base.a f52622b;

                    {
                        this.f52622b = r1;
                    }

                    public final /* synthetic */ Object then(a.i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f52621a, false, 53490, new Class[]{a.i.class}, Void.class)) {
                            return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f52621a, false, 53490, new Class[]{a.i.class}, Void.class);
                        }
                        if (this.f52622b != null) {
                            this.f52622b.run(iVar.e());
                        }
                        return null;
                    }
                }, a.i.f1052b);
            }
        }
        com.ss.android.ugc.aweme.im.sdk.d.a a6 = com.ss.android.ugc.aweme.im.sdk.d.a.a();
        if (PatchProxy.isSupport(new Object[0], a6, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], a6, com.ss.android.ugc.aweme.im.sdk.d.a.f3370a, false, 51699, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.resources.b.a().b();
        com.ss.android.ugc.aweme.im.sdk.resources.k.a().d();
        if (a6.e().showNewStyle()) {
            com.ss.android.ugc.aweme.im.sdk.feedupdate.a.a().b();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f51853a, false, 52412, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.oe, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f51853a, false, 52412, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public final void a(LinearLayoutManager linearLayoutManager, int i2, int i3) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{linearLayoutManager, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51853a, false, 52428, new Class[]{LinearLayoutManager.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{linearLayoutManager, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f51853a, false, 52428, new Class[]{LinearLayoutManager.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (linearLayoutManager != null) {
            int i5 = i2;
            if (i5 < i4) {
                while (i5 <= i4) {
                    try {
                        com.ss.android.ugc.aweme.im.service.session.a aVar = (com.ss.android.ugc.aweme.im.service.session.a) this.f51855c.getData().get(i5);
                        if (aVar != null && aVar.s) {
                            aVar.s = false;
                        }
                        i5++;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            }
        }
    }
}
