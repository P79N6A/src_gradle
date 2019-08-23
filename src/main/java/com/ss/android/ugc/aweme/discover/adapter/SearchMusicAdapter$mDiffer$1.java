package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchMusic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/discover/adapter/SearchMusicAdapter$mDiffer$1", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusic;", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchMusicAdapter$mDiffer$1 extends DiffUtil.ItemCallback<SearchMusic> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41832a;

    SearchMusicAdapter$mDiffer$1() {
    }

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        SearchMusic searchMusic = (SearchMusic) obj;
        SearchMusic searchMusic2 = (SearchMusic) obj2;
        if (PatchProxy.isSupport(new Object[]{searchMusic, searchMusic2}, this, f41832a, false, 35831, new Class[]{SearchMusic.class, SearchMusic.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{searchMusic, searchMusic2}, this, f41832a, false, 35831, new Class[]{SearchMusic.class, SearchMusic.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(searchMusic, "p0");
        Intrinsics.checkParameterIsNotNull(searchMusic2, "p1");
        return false;
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        SearchMusic searchMusic = (SearchMusic) obj;
        SearchMusic searchMusic2 = (SearchMusic) obj2;
        if (PatchProxy.isSupport(new Object[]{searchMusic, searchMusic2}, this, f41832a, false, 35830, new Class[]{SearchMusic.class, SearchMusic.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{searchMusic, searchMusic2}, this, f41832a, false, 35830, new Class[]{SearchMusic.class, SearchMusic.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(searchMusic, "p0");
        Intrinsics.checkParameterIsNotNull(searchMusic2, "p1");
        return false;
    }
}
