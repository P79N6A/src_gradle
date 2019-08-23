package com.ss.android.ugc.aweme.music.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0004"}, d2 = {"distinctByName", "", "Lcom/ss/android/ugc/aweme/music/model/MusicCollectionItem;", "src", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class MusicCollectionFilterKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    @NotNull
    public static final List<MusicCollectionItem> distinctByName(@NotNull List<? extends MusicCollectionItem> list) {
        List<? extends MusicCollectionItem> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, changeQuickRedirect, true, 60010, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list2}, null, changeQuickRedirect, true, 60010, new Class[]{List.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "src");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : list2) {
            if (hashSet.add(((MusicCollectionItem) next).mcName)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
