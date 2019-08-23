package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.choosemusic.c.a;
import com.ss.android.ugc.aweme.choosemusic.c.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.a.b;
import com.ss.android.ugc.aweme.discover.base.MultiTypeAdapter;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/adapter/MusicSearchHistoryAdapter;", "Lcom/ss/android/ugc/aweme/discover/base/MultiTypeAdapter;", "Lcom/ss/android/ugc/aweme/music/model/MusicSearchHistory;", "Lcom/ss/android/ugc/aweme/choosemusic/manager/BaseSearchHistoryManager$OnSearchHistoryChangeListener;", "()V", "mDiffer", "Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "getMDiffer", "()Lcom/bytedance/jedi/arch/ext/list/differ/JediAsyncListDiffer;", "mRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "onAttachedToRecyclerView", "", "recyclerView", "onChanged", "searchHistory", "", "onDetachedFromRecyclerView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicSearchHistoryAdapter extends MultiTypeAdapter<MusicSearchHistory> implements a.C0454a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35775a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView f35776b;

    public MusicSearchHistoryAdapter() {
        a(new b());
        a(new com.ss.android.ugc.aweme.choosemusic.viewholder.a.a());
    }

    public final void a(@NotNull List<MusicSearchHistory> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f35775a, false, 26489, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f35775a, false, 26489, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list, "searchHistory");
        this.n.clear();
        this.n.addAll(list);
        if (this.n.size() == 0) {
            RecyclerView recyclerView = this.f35776b;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        } else if (this.n.size() >= 3) {
            this.n.add(new MusicSearchHistory("", Integer.MAX_VALUE));
        }
        notifyDataSetChanged();
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35775a, false, 26487, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35775a, false, 26487, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f35776b = recyclerView;
        c.c().a((a.C0454a) this);
    }

    public final void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f35775a, false, 26488, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f35775a, false, 26488, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f35776b = null;
        c.c().b((a.C0454a) this);
    }
}
