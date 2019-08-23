package com.ss.android.ugc.aweme.friends.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "call"}, k = 3, mv = {1, 1, 15})
final class AtFriendsViewModel$searchKeyWord$1<V> implements Callable<TResult> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ List $data;
    final /* synthetic */ String $keyWord;
    final /* synthetic */ AtFriendsViewModel this$0;

    AtFriendsViewModel$searchKeyWord$1(AtFriendsViewModel atFriendsViewModel, List list, String str) {
        this.this$0 = atFriendsViewModel;
        this.$data = list;
        this.$keyWord = str;
    }

    @NotNull
    public final List<IMUser> call() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46589, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46589, new Class[0], List.class);
        }
        Set emptySet = SetsKt.emptySet();
        Collection arrayList = new ArrayList();
        for (Object next : this.this$0.searchFollowIMUser(this.$data, this.$keyWord)) {
            IMUser iMUser = (IMUser) next;
            if (emptySet.contains(iMUser.getUid())) {
                z = false;
            } else {
                emptySet = SetsKt.plus(emptySet, iMUser.getUid());
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }
}
