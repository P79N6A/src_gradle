package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.f.d;
import com.ss.android.ugc.aweme.favorites.d.a;
import com.ss.android.ugc.aweme.feed.listener.m;
import com.ss.android.ugc.aweme.music.util.ProfileListFragment;
import com.ss.android.ugc.aweme.utils.df;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.aweme.views.e;
import java.util.List;

public abstract class BaseCollectListFragment extends ProfileListFragment implements c, d, m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3115a;

    /* renamed from: b  reason: collision with root package name */
    BaseAdapter f3116b;

    /* renamed from: c  reason: collision with root package name */
    protected String f3117c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f3118d = true;

    /* renamed from: e  reason: collision with root package name */
    protected DmtStatusView.a f3119e;

    /* renamed from: f  reason: collision with root package name */
    public b<a> f3120f;
    private boolean g = true;
    @BindView(2131493599)
    RecyclerView mListView;
    @BindView(2131497340)
    DmtStatusView mStatusView;

    public class ItemDecorationSpace extends RecyclerView.ItemDecoration {

        /* renamed from: b  reason: collision with root package name */
        private int f44317b = 1;

        public ItemDecorationSpace(int i) {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            rect.bottom = this.f44317b;
        }
    }

    public abstract void b();

    public final void c(List list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public abstract void m();

    public abstract void n();

    public abstract BaseAdapter o();

    public final void z_() {
    }

    public final boolean j() {
        return this.f3118d;
    }

    public final boolean d() {
        return this.g;
    }

    public final void H_() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39532, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39532, new Class[0], Void.TYPE);
            return;
        }
        p();
    }

    public final void I_() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39531, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39531, new Class[0], Void.TYPE);
            return;
        }
        m();
    }

    public final void J_() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39535, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.smoothScrollToPosition(0);
        }
    }

    public final View f() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39533, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39533, new Class[0], View.class);
        } else if (!isViewValid()) {
            return null;
        } else {
            return this.mListView;
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39537, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.d();
        }
    }

    public void r() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39547, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39547, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f3120f == null || this.f3120f.i() == null)) {
            this.f3120f.b();
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39541, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f3116b.showLoadMoreLoading();
        }
    }

    public void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39539, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39539, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.setVisibility(0);
            this.mStatusView.e();
            this.mListView.setVisibility(4);
        }
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39534, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39534, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid() || this.f3116b == null) {
            return false;
        } else {
            if (this.f3116b.getItemCount() == 0) {
                z = true;
            }
            return z;
        }
    }

    public final boolean p() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39521, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39521, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!isViewValid()) {
            return false;
        } else {
            if (!NetworkUtils.isNetworkAvailable(getActivity())) {
                if (!this.f3118d) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
                }
                this.f3118d = true;
                return false;
            }
            this.f3118d = false;
            this.mStatusView.d();
            boolean z = !this.f3120f.m();
            if (TextUtils.isEmpty(this.f3117c)) {
                this.f3117c = com.ss.android.ugc.aweme.account.d.a().getCurUserId();
            }
            if (!TextUtils.isEmpty(this.f3117c)) {
                b();
            }
            return z;
        }
    }

    public View q() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39528, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39528, new Class[0], View.class);
        }
        TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.aqm, null);
        textView.setGravity(1);
        textView.setText(C0906R.string.aaf);
        return textView;
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39536, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39536, new Class[0], Void.TYPE);
            return;
        }
        if (getUserVisibleHint()) {
            if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39548, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39548, new Class[0], Void.TYPE);
            } else if (this.mListView != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.mListView.getLayoutManager();
                if (linearLayoutManager != null) {
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    for (int i = findFirstVisibleItemPosition; i <= findLastVisibleItemPosition; i++) {
                        if (i >= 0 && i < linearLayoutManager.getItemCount()) {
                            View childAt = this.mListView.getChildAt(i - findFirstVisibleItemPosition);
                            if (!(childAt == null || this.mListView.getChildViewHolder(childAt) == null || !(this.mListView.getChildViewHolder(childAt) instanceof a.C0553a))) {
                                ((a.C0553a) this.mListView.getChildViewHolder(childAt)).a();
                            }
                        }
                    }
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3115a, false, 39522, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3115a, false, 39522, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
    }

    public final void a_(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f3115a, false, 39545, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f3115a, false, 39545, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f3116b.notifyItemRemoved(i);
            if (this.f3116b.getBasicItemCount() == 0) {
                this.mStatusView.e();
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3115a, false, 39538, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3115a, false, 39538, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.mStatusView.f();
            this.f3118d = true;
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f3115a, false, 39542, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f3115a, false, 39542, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f3116b.showLoadMoreError();
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3115a, false, 39544, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3115a, false, 39544, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!z) {
            this.f3116b.setLoadMoreListener(null);
            this.f3116b.setLoadEmptyTextResId(C0906R.string.a3f);
            if (com.ss.android.g.a.a()) {
                this.f3116b.setShowFooter(false);
            } else {
                this.f3116b.setShowFooter(true);
                this.f3116b.showLoadMoreEmpty();
            }
        }
    }

    public final void a(List list, int i) {
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f3115a, false, 39546, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f3115a, false, 39546, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
        } else if (!isViewValid() || CollectionUtils.isEmpty(list)) {
        } else {
            if (this.f3116b.getBasicItemCount() == 0) {
                this.f3116b.setData(list);
                return;
            }
            this.f3116b.notifyItemInserted(i);
            if (this.mListView != null) {
                this.mListView.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f44314a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f44314a, false, 39550, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f44314a, false, 39550, new Class[0], Void.TYPE);
                            return;
                        }
                        BaseCollectListFragment.this.mListView.scrollToPosition(0);
                        BaseCollectListFragment.this.mListView.requestFocus();
                    }
                });
            }
        }
    }

    public final void a(List list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3115a, false, 39540, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3115a, false, 39540, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.f3116b.resetLoadMoreState();
            if (com.ss.android.g.a.a()) {
                this.f3116b.setShowFooter(true);
            }
            this.f3116b.setData(list);
            this.g = z;
            this.mStatusView.setVisibility(4);
            if (this.mListView.getVisibility() == 4) {
                this.mListView.setVisibility(0);
            }
            b(z);
        }
    }

    public final void b(List list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f3115a, false, 39543, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f3115a, false, 39543, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.f3116b.resetLoadMoreState();
            this.f3116b.setDataAfterLoadMore(list);
            this.mStatusView.setVisibility(4);
            if (this.mListView.getVisibility() == 4) {
                this.mListView.setVisibility(0);
            }
            this.g = z;
            b(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView.ItemDecoration itemDecoration;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f3115a, false, 39524, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f3115a, false, 39524, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39525, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39527, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39527, new Class[0], Void.TYPE);
        } else {
            this.mListView.setOverScrollMode(2);
            WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
            wrapLinearLayoutManager.setOrientation(1);
            this.mListView.setLayoutManager(wrapLinearLayoutManager);
            RecyclerView recyclerView = this.mListView;
            if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39529, new Class[0], RecyclerView.ItemDecoration.class)) {
                itemDecoration = (RecyclerView.ItemDecoration) PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39529, new Class[0], RecyclerView.ItemDecoration.class);
            } else {
                itemDecoration = new ItemDecorationSpace(1);
            }
            recyclerView.addItemDecoration(itemDecoration);
            this.mListView = df.a(this.mListView, this);
            if (this.f3119e == null) {
                this.f3119e = new DmtStatusView.a(getContext()).a().b(q()).b(e.a(getContext(), new a(this)));
                this.mStatusView.setBuilder(this.f3119e);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39526, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39526, new Class[0], Void.TYPE);
        } else {
            this.f3116b = o();
            this.mListView.setAdapter(this.f3116b);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3115a, false, 39530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3115a, false, 39530, new Class[0], Void.TYPE);
        } else {
            this.f3120f = new b<>();
            this.f3120f.a(this);
            this.f3120f.a((d) this);
            n();
        }
        if (this.j) {
            p();
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3115a, false, 39523, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.n8, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f3115a, false, 39523, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
