package com.ss.android.ugc.aweme.friends.ui;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;
import butterknife.Unbinder;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.fragment.AmePresenterFragment;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.adapter.FriendListAdapter;
import com.ss.android.ugc.aweme.friends.d.b;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.bogut.library.factory.PresenterClass;
import java.util.List;
import java.util.Map;

@PresenterClass(a = b.class)
public class FriendListFragment extends AmePresenterFragment<b> implements LoadMoreRecyclerViewAdapter.a, c<com.ss.android.ugc.aweme.friends.adapter.c> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f49279b;

    /* renamed from: c  reason: collision with root package name */
    public FriendListAdapter f49280c;

    /* renamed from: d  reason: collision with root package name */
    private Unbinder f49281d;

    /* renamed from: e  reason: collision with root package name */
    private DataCenter f49282e;
    @BindView(2131495526)
    LinearLayout mContent;
    @BindView(2131496871)
    RecyclerView mRecyclerView;
    @BindView(2131495588)
    LinearLayout mSetDone;
    @BindView(2131495587)
    LinearLayout mSetNickName;
    @BindView(2131497340)
    public DmtStatusView mStatusView;

    public final void c(List<com.ss.android.ugc.aweme.friends.adapter.c> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void z_() {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47302, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47302, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f49280c.resetLoadMoreState();
        }
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f49279b, false, 47305, new Class[0], Boolean.TYPE)) {
            return CollectionUtils.isEmpty(this.f49280c.getData());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47305, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47292, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47292, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.d();
        }
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47288, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f49281d.unbind();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47296, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47296, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            this.f49280c.showLoadMoreLoading();
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47291, new Class[0], Void.TYPE);
            return;
        }
        b bVar = (b) a();
        if (PatchProxy.isSupport(new Object[0], bVar, b.f48847a, false, 46680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], bVar, b.f48847a, false, 46680, new Class[0], Void.TYPE);
            return;
        }
        if (bVar.f48849c) {
            bVar.a(bVar.f48848b);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47294, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47294, new Class[0], Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.e();
        }
        if (!CollectionUtils.isEmpty(this.f49280c.getData())) {
            this.mContent.setVisibility(0);
        } else {
            this.mContent.setVisibility(4);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f49279b, false, 47293, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f49279b, false, 47293, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (isViewValid()) {
            this.mStatusView.f();
        }
        if (!CollectionUtils.isEmpty(this.f49280c.getData())) {
            this.mContent.setVisibility(0);
        } else {
            this.mContent.setVisibility(4);
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f49279b, false, 47297, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f49279b, false, 47297, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f49280c.showLoadMoreError();
        }
    }

    @OnClick({2131495587, 2131495588})
    public void onViewClicked(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f49279b, false, 47289, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f49279b, false, 47289, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.bhu) {
            r.a("edit_remarks", (Map) new d().a("enter_from", "friends_list").f34114b);
            this.mSetNickName.animate().alpha(0.0f).setDuration(100).start();
            this.mSetNickName.setVisibility(8);
            this.mSetDone.setVisibility(0);
            this.mSetDone.animate().alpha(1.0f).setDuration(200).start();
            this.f49280c.f48715b = true;
            this.f49280c.notifyDataSetChanged();
            return;
        }
        if (id == C0906R.id.bhv) {
            this.mSetDone.animate().alpha(0.0f).setDuration(100).start();
            this.mSetDone.setVisibility(8);
            this.mSetNickName.setVisibility(0);
            this.mSetNickName.animate().alpha(1.0f).setDuration(200).start();
            this.f49280c.f48715b = false;
            this.f49280c.notifyDataSetChanged();
        }
    }

    @OnTouch({2131495587, 2131495588})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, motionEvent}, this, f49279b, false, 47290, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, motionEvent}, this, f49279b, false, 47290, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int id = view.getId();
        if (id != C0906R.id.bhu && id != C0906R.id.bhv) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            an.a(view2, 1.0f, 0.5f);
        } else if (motionEvent.getAction() == 3) {
            an.a(view2, 0.5f, 1.0f);
        } else if (motionEvent.getAction() == 1) {
            an.a(view2, 0.5f, 1.0f);
        }
        return false;
    }

    public final void a(List<com.ss.android.ugc.aweme.friends.adapter.c> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49279b, false, 47295, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49279b, false, 47295, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.f49280c.setShowFooter(true);
            if (!z) {
                this.f49280c.showLoadMoreEmpty();
            } else {
                this.f49280c.resetLoadMoreState();
            }
            this.mStatusView.b();
            this.f49280c.setData(list);
            if (!CollectionUtils.isEmpty(this.f49280c.getData())) {
                this.mContent.setVisibility(0);
            } else {
                this.mContent.setVisibility(4);
            }
        }
    }

    public final void b(List<com.ss.android.ugc.aweme.friends.adapter.c> list, boolean z) {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f49279b, false, 47298, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f49279b, false, 47298, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (list != null && !list.isEmpty()) {
                z2 = z;
            }
            if (!z2) {
                this.f49280c.showLoadMoreEmpty();
            } else {
                this.f49280c.resetLoadMoreState();
            }
            this.f49280c.setDataAfterLoadMore(list);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49279b, false, 47285, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f49279b, false, 47285, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.o1, viewGroup2, false);
        this.f49281d = ButterKnife.bind((Object) this, inflate);
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47286, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47286, new Class[0], Void.TYPE);
        } else {
            this.f49282e = DataCenter.a(ViewModelProviders.of(getActivity()), (LifecycleOwner) this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f49279b, false, 47287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49279b, false, 47287, new Class[0], Void.TYPE);
        } else {
            this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(getActivity(), 1, false));
            this.f49280c = new FriendListAdapter(this);
            this.f49280c.setShowFooter(false);
            this.f49280c.setLoadMoreListener(this);
            this.mRecyclerView.setAdapter(this.f49280c);
            this.mStatusView.setBuilder(DmtStatusView.a.a(getContext()).a().a(new c.a(getActivity()).a(2130840140).b((int) C0906R.string.aam).c(C0906R.string.aal).f20493a).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new z(this)));
            this.mStatusView.d();
        }
        return inflate;
    }
}
