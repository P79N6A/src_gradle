package com.ss.android.ugc.aweme.poi.ui.comment;

import android.support.v7.widget.LinearLayoutManager;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.common.widget.NestedScrollingRecyclerView;
import com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.ss.android.ugc.aweme.poi.c;
import com.ss.android.ugc.aweme.poi.model.q;
import java.util.List;

public class PoiCommentVH implements LoadMoreRecyclerViewAdapter.a, o {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60594a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayoutManager f60595b;

    /* renamed from: c  reason: collision with root package name */
    public PoiCommentListFragment f60596c;

    /* renamed from: d  reason: collision with root package name */
    PoiAwemeFeedAdapter f60597d;

    /* renamed from: e  reason: collision with root package name */
    b f60598e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f60599f;
    boolean g = true;
    String h;
    c i;
    private int j;
    @BindView(2131498525)
    NestedScrollingRecyclerView mRecyclerView;
    @BindView(2131497340)
    DmtStatusView mStatusView;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60594a, false, 66304, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60594a, false, 66304, new Class[0], Void.TYPE);
            return;
        }
        if (this.f60598e != null) {
            this.f60598e.a(1, this.h);
        }
    }

    public void loadMore() {
        if (PatchProxy.isSupport(new Object[0], this, f60594a, false, 66299, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60594a, false, 66299, new Class[0], Void.TYPE);
            return;
        }
        if (a() && this.g && this.f60598e.i() != null && ((!(this.f60598e.i() instanceof a) || !((q) this.f60598e.i()).isDataEmpty()) && ((q) this.f60598e.i()).isHasMore() && this.f60598e != null)) {
            this.f60598e.a(4, this.h);
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f60594a, false, 66303, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f60594a, false, 66303, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f60596c != null && this.f60596c.isViewValid()) {
            z = true;
        }
        return z;
    }

    public PoiCommentVH(int i2) {
        this.j = i2;
    }

    private void a(List<com.ss.android.ugc.aweme.poi.model.o> list) {
        if (PatchProxy.isSupport(new Object[]{null}, this, f60594a, false, 66296, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f60594a, false, 66296, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.f60597d != null) {
            this.f60597d.setData(null);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60594a, false, 66302, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60594a, false, 66302, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f60597d != null) {
            if (z) {
                this.f60597d.setShowFooter(true);
                if (z) {
                    this.f60597d.resetLoadMoreState();
                } else {
                    this.f60597d.showLoadMoreEmpty();
                }
            } else {
                this.f60597d.setShowFooter(false);
            }
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60594a, false, 66301, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60594a, false, 66301, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (a()) {
            switch (i2) {
                case 1:
                    if (this.f60597d != null) {
                        this.f60597d.showLoadMoreError();
                        return;
                    }
                    break;
                case 2:
                    if (this.f60597d != null) {
                        this.f60597d.showLoadMoreLoading();
                        return;
                    }
                    break;
                case 3:
                    if (this.f60597d != null) {
                        this.f60597d.showLoadMoreEmpty();
                        break;
                    }
                    break;
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60594a, false, 66298, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60594a, false, 66298, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (a()) {
            switch (i2) {
                case 1:
                    a((List<com.ss.android.ugc.aweme.poi.model.o>) null);
                    if (!this.f60599f) {
                        this.mStatusView.f();
                    } else {
                        this.mStatusView.b();
                    }
                    if (this.f60597d != null) {
                        this.f60597d.showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 2:
                    if (!this.f60599f) {
                        this.mStatusView.d();
                        return;
                    }
                    break;
                case 3:
                    if (!this.f60599f) {
                        this.mStatusView.e();
                    } else {
                        this.mStatusView.b();
                    }
                    a((List<com.ss.android.ugc.aweme.poi.model.o>) null);
                    if (this.f60597d != null) {
                        this.f60597d.showLoadMoreEmpty();
                        return;
                    }
                    break;
                case 4:
                    this.mStatusView.b();
                    break;
            }
        }
    }
}
