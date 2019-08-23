package com.ss.android.ugc.aweme.discover.adapter;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.CardType;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u0018\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/adapter/SearchMusicClusterDelegate;", "", "()V", "rawMusicList", "", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "clusterLoadMoreMusicList", "", "origin", "loadMore", "clusterRefreshedMusicList", "list", "expandMusicList", "cluster", "Lcom/ss/android/ugc/aweme/discover/adapter/ClusterButtonData;", "isClusterButton", "", "searchMusic", "setRawMusicList", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42001a;

    /* renamed from: b  reason: collision with root package name */
    final List<SearchMusic> f42002b = new ArrayList();

    public final boolean a(@NotNull SearchMusic searchMusic) {
        SearchMusic searchMusic2 = searchMusic;
        if (PatchProxy.isSupport(new Object[]{searchMusic2}, this, f42001a, false, 35837, new Class[]{SearchMusic.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{searchMusic2}, this, f42001a, false, 35837, new Class[]{SearchMusic.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(searchMusic2, "searchMusic");
        return searchMusic2 instanceof d;
    }

    /* access modifiers changed from: package-private */
    public final void b(List<? extends SearchMusic> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f42001a, false, 35838, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f42001a, false, 35838, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (list != null) {
            this.f42002b.clear();
            this.f42002b.addAll(list);
        }
    }

    @NotNull
    public final List<SearchMusic> a(@Nullable List<? extends SearchMusic> list) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{list}, this, f42001a, false, 35834, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, this, f42001a, false, 35834, new Class[]{List.class}, List.class);
        }
        Collection collection = list;
        if (CollectionUtils.isEmpty(collection)) {
            return new ArrayList<>();
        }
        b(list);
        if (list == null) {
            Intrinsics.throwNpe();
        }
        List mutableList = CollectionsKt.toMutableList(collection);
        ListIterator listIterator = mutableList.listIterator();
        while (listIterator.hasNext()) {
            SearchMusic searchMusic = (SearchMusic) listIterator.next();
            if (searchMusic.getCardType() == CardType.TYPE_CLUSTER.getValue() && !CollectionUtils.isEmpty(searchMusic.getMusicList())) {
                listIterator.remove();
                SearchMusic searchMusic2 = new SearchMusic();
                searchMusic2.setCardType(CardType.TYPE_NORMAL.getValue());
                List musicList = searchMusic.getMusicList();
                if (musicList == null) {
                    Intrinsics.throwNpe();
                }
                searchMusic2.setMusic((Music) CollectionsKt.first(musicList));
                listIterator.add(searchMusic2);
                d dVar = new d(false, null, 3, null);
                List<Music> clusterList = dVar.getClusterList();
                List musicList2 = searchMusic.getMusicList();
                if (musicList2 == null) {
                    Intrinsics.throwNpe();
                }
                List musicList3 = searchMusic.getMusicList();
                if (musicList3 == null) {
                    Intrinsics.throwNpe();
                }
                clusterList.addAll(musicList2.subList(1, musicList3.size()));
                listIterator.add(dVar);
            }
        }
        Collection arrayList = new ArrayList();
        for (Object next : mutableList) {
            SearchMusic searchMusic3 = (SearchMusic) next;
            if (!(searchMusic3 instanceof d) || ((d) searchMusic3).getClusterList().size() > 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        return CollectionsKt.toMutableList((Collection<? extends T>) (List) arrayList);
    }
}
