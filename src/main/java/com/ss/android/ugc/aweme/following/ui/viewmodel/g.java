package com.ss.android.ugc.aweme.following.ui.viewmodel;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\nR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/SearchIMUserManager;", "", "()V", "mIMUserList", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "init", "", "searchUserList", "keyWord", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48219a;

    /* renamed from: b  reason: collision with root package name */
    public List<IMUser> f48220b = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48221a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f48222b;

        a(g gVar) {
            this.f48222b = gVar;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f48221a, false, 45281, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48221a, false, 45281, new Class[0], Void.TYPE);
            } else {
                g gVar = this.f48222b;
                IIMService a2 = b.a();
                Intrinsics.checkExpressionValueIsNotNull(a2, "IM.get()");
                List<IMUser> allFollowIMUsers = a2.getAllFollowIMUsers();
                Intrinsics.checkExpressionValueIsNotNull(allFollowIMUsers, "IM.get().allFollowIMUsers");
                gVar.f48220b = allFollowIMUsers;
            }
            return Unit.INSTANCE;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f48219a, false, 45279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48219a, false, 45279, new Class[0], Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new a<TResult>(this));
    }
}
