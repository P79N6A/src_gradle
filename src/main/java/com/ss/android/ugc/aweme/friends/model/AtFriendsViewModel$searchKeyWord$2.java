package com.ss.android.ugc.aweme.friends.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012B\u0010\u0005\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lbolts/Task;", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "kotlin.jvm.PlatformType", "task", "then"}, k = 3, mv = {1, 1, 15})
final class AtFriendsViewModel$searchKeyWord$2<TTaskResult, TContinuationResult> implements g<List<? extends IMUser>, i<List<? extends IMUser>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ AtFriendsViewModel this$0;

    AtFriendsViewModel$searchKeyWord$2(AtFriendsViewModel atFriendsViewModel) {
        this.this$0 = atFriendsViewModel;
    }

    public final i<List<IMUser>> then(i<List<IMUser>> iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, changeQuickRedirect, false, 46590, new Class[]{i.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{iVar}, this, changeQuickRedirect, false, 46590, new Class[]{i.class}, i.class);
        }
        Intrinsics.checkExpressionValueIsNotNull(iVar, "task");
        if (!iVar.d() && !iVar.c()) {
            List list = (List) iVar.e();
            if (list != null) {
                this.this$0.latestSearchUsers.clear();
                this.this$0.latestSearchUsers.addAll(list);
            }
        }
        return iVar;
    }
}
