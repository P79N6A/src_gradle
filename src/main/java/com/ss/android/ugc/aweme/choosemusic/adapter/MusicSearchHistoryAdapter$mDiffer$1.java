package com.ss.android.ugc.aweme.choosemusic.adapter;

import android.support.v7.util.DiffUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/ss/android/ugc/aweme/choosemusic/adapter/MusicSearchHistoryAdapter$mDiffer$1", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/ss/android/ugc/aweme/music/model/MusicSearchHistory;", "areContentsTheSame", "", "p0", "p1", "areItemsTheSame", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class MusicSearchHistoryAdapter$mDiffer$1 extends DiffUtil.ItemCallback<MusicSearchHistory> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35777a;

    MusicSearchHistoryAdapter$mDiffer$1() {
    }

    public final /* synthetic */ boolean areContentsTheSame(Object obj, Object obj2) {
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) obj;
        MusicSearchHistory musicSearchHistory2 = (MusicSearchHistory) obj2;
        if (PatchProxy.isSupport(new Object[]{musicSearchHistory, musicSearchHistory2}, this, f35777a, false, 26491, new Class[]{MusicSearchHistory.class, MusicSearchHistory.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{musicSearchHistory, musicSearchHistory2}, this, f35777a, false, 26491, new Class[]{MusicSearchHistory.class, MusicSearchHistory.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(musicSearchHistory, "p0");
        Intrinsics.checkParameterIsNotNull(musicSearchHistory2, "p1");
        return false;
    }

    public final /* synthetic */ boolean areItemsTheSame(Object obj, Object obj2) {
        MusicSearchHistory musicSearchHistory = (MusicSearchHistory) obj;
        MusicSearchHistory musicSearchHistory2 = (MusicSearchHistory) obj2;
        if (PatchProxy.isSupport(new Object[]{musicSearchHistory, musicSearchHistory2}, this, f35777a, false, 26490, new Class[]{MusicSearchHistory.class, MusicSearchHistory.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{musicSearchHistory, musicSearchHistory2}, this, f35777a, false, 26490, new Class[]{MusicSearchHistory.class, MusicSearchHistory.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(musicSearchHistory, "p0");
        Intrinsics.checkParameterIsNotNull(musicSearchHistory2, "p1");
        return false;
    }
}
