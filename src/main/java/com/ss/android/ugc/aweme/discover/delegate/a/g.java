package com.ss.android.ugc.aweme.discover.delegate.a;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.adapter.SearchMusicViewHolder;
import com.ss.android.ugc.aweme.discover.adapter.SearchSquareAdapter;
import com.ss.android.ugc.aweme.discover.delegate.a.h;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J4\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchMusicSuggestDelegate;", "Lcom/ss/android/ugc/aweme/discover/delegate/intermedaite/SearchSuggestDelegate$SubSuggestDelegate;", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicViewHolder$MusicItemListener;", "adapter", "Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;", "(Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter;)V", "onBindViewHolder", "", "items", "", "", "position", "", "holder", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "payloads", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "sendEnterMusicDetail", "music", "Lcom/ss/android/ugc/aweme/music/model/Music;", "order", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g extends h.a implements SearchMusicViewHolder.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42257a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(@NotNull SearchSquareAdapter<?> searchSquareAdapter) {
        super(searchSquareAdapter);
        Intrinsics.checkParameterIsNotNull(searchSquareAdapter, "adapter");
    }

    @NotNull
    public final RecyclerView.ViewHolder a(@NotNull ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2}, this, f42257a, false, 36255, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2}, this, f42257a, false, 36255, new Class[]{ViewGroup.class}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewGroup2, "parent");
        SearchMusicViewHolder a2 = SearchMusicViewHolder.j.a(viewGroup2, "", this, null);
        a2.a("search_for_you_list");
        return a2;
    }

    public final void a(@NotNull Music music, int i) {
        Music music2 = music;
        if (PatchProxy.isSupport(new Object[]{music2, Integer.valueOf(i)}, this, f42257a, false, 36257, new Class[]{Music.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{music2, Integer.valueOf(i)}, this, f42257a, false, 36257, new Class[]{Music.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(music2, "music");
        r.a("enter_music_detail", (Map) d.a().a("enter_from", "search_for_you_list").a("music_id", music.getMid()).a("log_pb", ai.a().a(music.getRequestId())).a("order", a((Object) music)).f34114b);
    }

    public final void a(@NotNull List<? extends Object> list, int i, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull List<Object> list2) {
        List<? extends Object> list3 = list;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        List<Object> list4 = list2;
        if (PatchProxy.isSupport(new Object[]{list3, Integer.valueOf(i), viewHolder2, list4}, this, f42257a, false, 36256, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list3, Integer.valueOf(i), viewHolder2, list4}, this, f42257a, false, 36256, new Class[]{List.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list3, "items");
        Intrinsics.checkParameterIsNotNull(viewHolder2, "holder");
        Intrinsics.checkParameterIsNotNull(list4, "payloads");
        Object obj = list.get(i);
        if (obj != null) {
            SuggestMusic suggestMusic = (SuggestMusic) obj;
            SearchMusicViewHolder searchMusicViewHolder = (SearchMusicViewHolder) viewHolder2;
            if (PatchProxy.isSupport(new Object[]{suggestMusic, ""}, searchMusicViewHolder, SearchMusicViewHolder.f41842c, false, 35847, new Class[]{SuggestMusic.class, String.class}, Void.TYPE)) {
                SearchMusicViewHolder searchMusicViewHolder2 = searchMusicViewHolder;
                PatchProxy.accessDispatch(new Object[]{suggestMusic, ""}, searchMusicViewHolder2, SearchMusicViewHolder.f41842c, false, 35847, new Class[]{SuggestMusic.class, String.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull("", "keyword");
            if (suggestMusic != null) {
                searchMusicViewHolder.a(suggestMusic.music, "");
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.SuggestMusic");
    }
}
