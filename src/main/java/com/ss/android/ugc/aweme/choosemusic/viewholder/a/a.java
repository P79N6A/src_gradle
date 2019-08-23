package com.ss.android.ugc.aweme.choosemusic.viewholder.a;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.choosemusic.viewholder.ClearHistoryViewHolder;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\tH\u0014J4\u0010\n\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0014¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/choosemusic/viewholder/delegate/ClearHistoryDelegate;", "Lcom/ss/android/ugc/aweme/common/adapter/AdapterDelegate;", "", "Lcom/ss/android/ugc/aweme/music/model/MusicSearchHistory;", "()V", "isForViewType", "", "items", "position", "", "onBindViewHolder", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.ss.android.ugc.aweme.common.adapter.a<List<? extends MusicSearchHistory>> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36161a;

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f36161a, false, 26969, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f36161a, false, 26969, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.sr, viewGroup2, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ClearHistoryViewHolder(inflate);
    }

    public final /* synthetic */ boolean a(Object obj, int i) {
        List list = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list, Integer.valueOf(i)}, this, f36161a, false, 26968, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{list, Integer.valueOf(i)}, this, f36161a, false, 26968, new Class[]{List.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(list, "items");
        if (((MusicSearchHistory) list.get(i)).type == Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void a(Object obj, int i, RecyclerView.ViewHolder viewHolder, List list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List list2 = list;
        List list3 = (List) obj;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f36161a, false, 26970, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list2}, this, f36161a, false, 26970, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list2, "payloads");
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) list3.get(i);
        ClearHistoryViewHolder clearHistoryViewHolder = (ClearHistoryViewHolder) viewHolder2;
        if (PatchProxy.isSupport(new Object[]{musicSearchHistory}, clearHistoryViewHolder, ClearHistoryViewHolder.f36059a, false, 26869, new Class[]{MusicSearchHistory.class}, Void.TYPE)) {
            ClearHistoryViewHolder clearHistoryViewHolder2 = clearHistoryViewHolder;
            PatchProxy.accessDispatch(new Object[]{musicSearchHistory}, clearHistoryViewHolder2, ClearHistoryViewHolder.f36059a, false, 26869, new Class[]{MusicSearchHistory.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(musicSearchHistory, "history");
        clearHistoryViewHolder.f36060b.setOnClickListener(ClearHistoryViewHolder.a.f36062b);
    }
}
