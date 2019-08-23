package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.List;

public class SearchInfoStickerFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69790a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f69791b;

    /* renamed from: c  reason: collision with root package name */
    public a f69792c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f69793d;

    /* renamed from: e  reason: collision with root package name */
    public LoadMoreRecyclerViewAdapter.a f69794e;

    /* renamed from: f  reason: collision with root package name */
    private AbstractInfoStickerAdapter<p> f69795f;
    private List<p> g;
    private RecyclerView h;
    private GridLayoutManager i;

    interface a {
        void a(int i);
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69790a, false, 79421, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69790a, false, 79421, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f69790a, false, 79423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69790a, false, 79423, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f69790a, false, 79422, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f69790a, false, 79422, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69790a, false, 79424, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69790a, false, 79424, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f69790a, false, 79420, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f69790a, false, 79420, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f69795f != null) {
            switch (i2) {
                case -1:
                    this.f69795f.resetLoadMoreState();
                    return;
                case 0:
                    this.f69795f.showLoadMoreLoading();
                    break;
                case 1:
                    this.f69795f.showLoadMoreEmpty();
                    return;
                case 2:
                    this.f69795f.showLoadMoreError();
                    return;
            }
        }
    }

    public final void b(List<p> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f69790a, false, 79415, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f69790a, false, 79415, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (!(Lists.isEmpty(list) || this.g == null || this.f69795f == null)) {
            int itemCount = this.f69795f.getItemCount();
            this.g.addAll(list);
            this.f69795f.mItems = this.g;
            this.f69795f.notifyItemRangeInserted(itemCount, list.size());
        }
    }

    public final void a(List<p> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f69790a, false, 79414, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f69790a, false, 79414, new Class[]{List.class}, Void.TYPE);
        } else if (!Lists.isEmpty(list)) {
            this.g = list;
            if (this.f69795f != null) {
                this.f69795f.setData(this.g);
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        AbstractInfoStickerAdapter<p> abstractInfoStickerAdapter;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f69790a, false, 79417, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f69790a, false, 79417, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.i = new WrapGridLayoutManager(getContext(), 3, 1, false);
        this.h.setItemViewCacheSize(3);
        this.h.setLayoutManager(this.i);
        if (this.h.getAdapter() == null) {
            if (PatchProxy.isSupport(new Object[]{"Search"}, this, f69790a, false, 79418, new Class[]{String.class}, AbstractInfoStickerAdapter.class)) {
                abstractInfoStickerAdapter = (AbstractInfoStickerAdapter) PatchProxy.accessDispatch(new Object[]{"Search"}, this, f69790a, false, 79418, new Class[]{String.class}, AbstractInfoStickerAdapter.class);
            } else {
                abstractInfoStickerAdapter = new SearchInfoStickerAdapter<>(getActivity());
            }
            this.f69795f = abstractInfoStickerAdapter;
            this.h.setAdapter(this.f69795f);
        } else {
            this.f69795f = (SearchInfoStickerAdapter) this.h.getAdapter();
        }
        this.f69795f.setShowFooter(true);
        this.f69795f.f69673c = this.f69791b;
        if (!Lists.isEmpty(this.g)) {
            this.f69795f.setData(this.g);
        }
        this.f69795f.setLoadMoreListener(this.f69794e);
        this.h.addOnScrollListener(new RecyclerView.OnScrollListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69796a;

            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69796a, false, 79425, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f69796a, false, 79425, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrollStateChanged(recyclerView, i);
                if (SearchInfoStickerFragment.this.f69792c != null) {
                    SearchInfoStickerFragment.this.f69792c.a(i);
                }
                SearchInfoStickerFragment searchInfoStickerFragment = SearchInfoStickerFragment.this;
                if (i == 0) {
                    z = true;
                }
                searchInfoStickerFragment.f69793d = z;
                SearchInfoStickerFragment.this.a(SearchInfoStickerFragment.this.f69793d);
            }

            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69796a, false, 79426, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f69796a, false, 79426, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                SearchInfoStickerFragment.this.a(SearchInfoStickerFragment.this.f69793d);
            }
        });
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69790a, false, 79419, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69790a, false, 79419, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        int findLastVisibleItemPosition = this.i.findLastVisibleItemPosition();
        for (int findFirstVisibleItemPosition = this.i.findFirstVisibleItemPosition(); findFirstVisibleItemPosition <= findLastVisibleItemPosition; findFirstVisibleItemPosition++) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.h.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
            if (findViewHolderForAdapterPosition instanceof SearchInfoStickerHolder) {
                SearchInfoStickerHolder searchInfoStickerHolder = (SearchInfoStickerHolder) findViewHolderForAdapterPosition;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z)}, searchInfoStickerHolder, SearchInfoStickerHolder.f69799a, false, 79429, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    SearchInfoStickerHolder searchInfoStickerHolder2 = searchInfoStickerHolder;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, searchInfoStickerHolder2, SearchInfoStickerHolder.f69799a, false, 79429, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    searchInfoStickerHolder.f69800b.a(z);
                }
            }
            boolean z2 = z;
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69790a, false, 79416, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f69790a, false, 79416, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.w3, viewGroup2, false);
        this.h = (RecyclerView) inflate.findViewById(C0906R.id.cvl);
        return inflate;
    }
}
