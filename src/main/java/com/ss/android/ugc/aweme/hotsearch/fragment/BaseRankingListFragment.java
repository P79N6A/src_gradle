package com.ss.android.ugc.aweme.hotsearch.fragment;

import android.arch.lifecycle.LifecycleOwner;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.a;
import com.ss.android.ugc.aweme.arch.b;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.hotsearch.b.c;
import com.ss.android.ugc.aweme.utils.dq;

public abstract class BaseRankingListFragment<T> extends AmeBaseFragment implements a.C0022a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49752a;

    /* renamed from: b  reason: collision with root package name */
    public int f49753b;

    /* renamed from: c  reason: collision with root package name */
    public DataCenter f49754c;

    /* renamed from: d  reason: collision with root package name */
    c f49755d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f49756e;

    /* renamed from: f  reason: collision with root package name */
    a f49757f;
    protected com.ss.android.ugc.aweme.hotsearch.view.a<T> g;

    /* access modifiers changed from: package-private */
    public abstract com.ss.android.ugc.aweme.hotsearch.view.a<T> b(View view);

    public final String b() {
        return "hot_search_data";
    }

    public final String c() {
        return "hot_search_status";
    }

    public final String d() {
        return null;
    }

    public abstract void j();

    public final RecyclerView h() {
        return this.g.f49869d;
    }

    public DataCenter e() {
        if (PatchProxy.isSupport(new Object[0], this, f49752a, false, 49648, new Class[0], DataCenter.class)) {
            return (DataCenter) PatchProxy.accessDispatch(new Object[0], this, f49752a, false, 49648, new Class[0], DataCenter.class);
        }
        if (this.f49754c == null) {
            this.f49754c = DataCenter.a(com.ss.android.ugc.aweme.arch.widgets.base.c.a((Fragment) this), (LifecycleOwner) this);
        }
        return this.f49754c;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f49752a, false, 49644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49752a, false, 49644, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (getUserVisibleHint() && !dq.a()) {
            i();
        }
    }

    public ShareInfo f() {
        if (PatchProxy.isSupport(new Object[0], this, f49752a, false, 49641, new Class[0], ShareInfo.class)) {
            return (ShareInfo) PatchProxy.accessDispatch(new Object[0], this, f49752a, false, 49641, new Class[0], ShareInfo.class);
        } else if (this.f49754c == null || this.f49754c.a("hot_search_data") == null) {
            return null;
        } else {
            return (ShareInfo) ((b) this.f49754c.a("hot_search_data")).a("hot_search_share_info");
        }
    }

    public String g() {
        if (PatchProxy.isSupport(new Object[0], this, f49752a, false, 49642, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49752a, false, 49642, new Class[0], String.class);
        } else if (this.f49754c.a("hot_search_data") == null) {
            return null;
        } else {
            return (String) ((b) this.f49754c.a("hot_search_data")).a("hot_search_last_update_time");
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f49752a, false, 49645, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49752a, false, 49645, new Class[0], Void.TYPE);
        } else if (this.g != null && this.g.f49869d != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.g.f49869d.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            for (int i = findFirstVisibleItemPosition; i < findLastVisibleItemPosition; i++) {
                if (i > 0 && i <= linearLayoutManager.getItemCount() - 2) {
                    View childAt = this.g.f49869d.getChildAt(i - findFirstVisibleItemPosition);
                    if (!(childAt == null || this.g.f49869d.getChildViewHolder(childAt) == null)) {
                        ((com.ss.android.ugc.aweme.hotsearch.viewholder.a) this.g.f49869d.getChildViewHolder(childAt)).a(i);
                    }
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49752a, false, 49646, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49752a, false, 49646, new Class[0], Void.TYPE);
            return;
        }
        this.f49755d = new c(this.f49754c);
    }

    public final com.ss.android.ugc.aweme.arch.c<T> a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49752a, false, 49647, new Class[]{View.class}, com.ss.android.ugc.aweme.arch.c.class)) {
            return (com.ss.android.ugc.aweme.arch.c) PatchProxy.accessDispatch(new Object[]{view}, this, f49752a, false, 49647, new Class[]{View.class}, com.ss.android.ugc.aweme.arch.c.class);
        }
        this.g = b(view);
        return this.g;
    }

    @NonNull
    public static Bundle a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f49752a, true, 49638, new Class[]{Integer.TYPE}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f49752a, true, 49638, new Class[]{Integer.TYPE}, Bundle.class);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        return bundle;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49752a, false, 49637, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49752a, false, 49637, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f49753b = arguments.getInt("type");
        }
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49752a, false, 49643, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49752a, false, 49643, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        if (z) {
            i();
        }
        if (this.g != null) {
            this.g.a(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f49752a, false, 49639, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f49752a, false, 49639, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.f49757f == null) {
            this.f49757f = new a(this);
        }
        this.f49757f.a(view, bundle);
        j();
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49752a, false, 49640, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.o7, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49752a, false, 49640, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
