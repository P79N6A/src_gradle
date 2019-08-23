package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.c;
import com.ss.android.ugc.aweme.choosemusic.a.b;
import com.ss.android.ugc.aweme.choosemusic.b.a;
import com.ss.android.ugc.aweme.choosemusic.view.PreloadRecyclerViewConverter;
import com.ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import java.util.List;

public abstract class BaseMusicListView<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36002a;

    /* renamed from: b  reason: collision with root package name */
    protected BaseAdapter f36003b;

    /* renamed from: c  reason: collision with root package name */
    protected a f36004c;

    /* renamed from: d  reason: collision with root package name */
    f<b> f36005d;

    /* renamed from: e  reason: collision with root package name */
    protected int f36006e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f36007f;
    private Context g;
    private LoadMoreRecyclerViewAdapter.a h;
    private int i;
    @BindView(2131495821)
    public RecyclerView mRecyclerView;
    @BindView(2131495831)
    public DmtStatusView mStatusView;
    @BindView(2131497604)
    public TextTitleBar mTitleBar;

    public abstract BaseAdapter e();

    public final BaseAdapter d() {
        return this.f36003b;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        g();
        if (this.f36004c != null) {
            this.f36004c.n();
        }
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26811, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusView != null) {
            this.mStatusView.b();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26814, new Class[0], Void.TYPE);
            return;
        }
        if (this.f36003b != null) {
            this.f36003b.showLoadMoreLoading();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26809, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26809, new Class[0], Void.TYPE);
            return;
        }
        if (this.mStatusView != null) {
            this.mStatusView.f();
        }
        if (this.f36003b != null) {
            this.f36003b.setData(null);
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26808, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26808, new Class[0], Void.TYPE);
            return;
        }
        if (this.f36003b.mShowFooter) {
            this.f36003b.setShowFooter(false);
            this.f36003b.setData(null);
            this.f36003b.showLoadMoreEmpty();
        }
        if (this.mStatusView != null) {
            this.mStatusView.e();
        }
    }

    public final void a(PreloadRecyclerViewConverter.a aVar, int i2) {
        PreloadRecyclerViewConverter.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, 10}, this, f36002a, false, 26816, new Class[]{PreloadRecyclerViewConverter.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, 10}, this, f36002a, false, 26816, new Class[]{PreloadRecyclerViewConverter.a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        new PreloadRecyclerViewConverter(aVar2, 10).a(this.mRecyclerView);
    }

    public final void b(List<T> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36002a, false, 26815, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f36002a, false, 26815, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (this.f36003b != null) {
            this.f36007f = z;
            if (z) {
                this.f36003b.resetLoadMoreState();
            } else if (com.ss.android.g.a.a()) {
                this.f36003b.setShowFooter(false);
            } else {
                this.f36003b.showLoadMoreEmpty();
            }
            if (!CollectionUtils.isEmpty(list)) {
                this.f36003b.setDataAfterLoadMore(list);
            }
        }
    }

    public final void a(List<T> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36002a, false, 26813, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f36002a, false, 26813, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        g();
        if (this.f36003b != null) {
            if (CollectionUtils.isEmpty(list)) {
                c();
                return;
            }
            this.f36003b.setShowFooter(true);
            this.f36007f = z;
            if (z) {
                this.f36003b.resetLoadMoreState();
            } else if (com.ss.android.g.a.a()) {
                this.f36003b.setShowFooter(false);
            } else {
                this.f36003b.showLoadMoreEmpty();
            }
            this.f36003b.setData(list);
        }
    }

    BaseMusicListView(Context context, View view, a aVar, int i2, LoadMoreRecyclerViewAdapter.a aVar2, f<b> fVar, int i3) {
        ButterKnife.bind((Object) this, view);
        this.g = context;
        this.f36004c = aVar;
        this.h = aVar2;
        this.f36005d = fVar;
        this.i = i2;
        this.f36006e = i3;
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26803, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26803, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26804, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26804, new Class[0], Void.TYPE);
        } else {
            this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36008a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f36008a, false, 26818, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f36008a, false, 26818, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (BaseMusicListView.this.f36004c != null) {
                        BaseMusicListView.this.f36004c.o();
                    }
                }
            });
            this.mTitleBar.setColorMode(0);
        }
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26806, new Class[0], Void.TYPE);
        } else {
            DmtStatusView.a c2 = DmtStatusView.a.a(this.g).a(C0906R.string.dmm, C0906R.string.dml, C0906R.string.dms, new a(this)).c(0);
            if (this.i != 0) {
                c2.a(this.i);
            }
            this.mStatusView.setBuilder(c2);
            if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26807, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26807, new Class[0], Void.TYPE);
            } else if (this.mStatusView != null) {
                this.mStatusView.d();
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f36002a, false, 26805, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36002a, false, 26805, new Class[0], Void.TYPE);
            return;
        }
        this.f36003b = e();
        this.f36003b.mTextColor = this.mRecyclerView.getResources().getColor(C0906R.color.i3);
        this.f36003b.setLoadMoreListener(this.h);
        this.mRecyclerView.setAdapter(this.f36003b);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this.g, 1, false));
    }
}
