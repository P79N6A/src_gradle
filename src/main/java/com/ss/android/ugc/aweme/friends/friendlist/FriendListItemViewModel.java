package com.ss.android.ugc.aweme.friends.friendlist;

import com.bytedance.jedi.arch.x;
import com.bytedance.jedi.model.c.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.arch.JediBaseViewModel;
import com.ss.android.ugc.aweme.base.arch.b;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.h;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0002H\u0014J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemViewModel;", "Lcom/ss/android/ugc/aweme/base/arch/JediBaseViewModel;", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "()V", "userRepo", "Lcom/ss/android/ugc/aweme/user/repository/UserRepository;", "defaultState", "observeUser", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FriendListItemViewModel extends JediBaseViewModel<FriendListItemState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48886d;

    /* renamed from: e  reason: collision with root package name */
    public final h f48887e = b.b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<FriendListItemState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ FriendListItemViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(FriendListItemViewModel friendListItemViewModel) {
            super(1);
            this.this$0 = friendListItemViewModel;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((FriendListItemState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull FriendListItemState friendListItemState) {
            if (PatchProxy.isSupport(new Object[]{friendListItemState}, this, changeQuickRedirect, false, 46398, new Class[]{FriendListItemState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{friendListItemState}, this, changeQuickRedirect, false, 46398, new Class[]{FriendListItemState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(friendListItemState, "state");
            FriendListItemViewModel friendListItemViewModel = this.this$0;
            h hVar = this.this$0.f48887e;
            String uid = friendListItemState.getUser().getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "state.user.uid");
            Disposable subscribe = hVar.a(uid).subscribe(new Consumer<f<? extends User>>(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48888a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f48889b;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/friendlist/FriendListItemState;", "invoke"}, k = 3, mv = {1, 1, 15})
                /* renamed from: com.ss.android.ugc.aweme.friends.friendlist.FriendListItemViewModel$a$1$a  reason: collision with other inner class name */
                static final class C0580a extends Lambda implements Function1<FriendListItemState, FriendListItemState> {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ User $it;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0580a(User user) {
                        super(1);
                        this.$it = user;
                    }

                    @NotNull
                    public final FriendListItemState invoke(@NotNull FriendListItemState friendListItemState) {
                        FriendListItemState friendListItemState2 = friendListItemState;
                        if (PatchProxy.isSupport(new Object[]{friendListItemState2}, this, changeQuickRedirect, false, 46400, new Class[]{FriendListItemState.class}, FriendListItemState.class)) {
                            return (FriendListItemState) PatchProxy.accessDispatch(new Object[]{friendListItemState2}, this, changeQuickRedirect, false, 46400, new Class[]{FriendListItemState.class}, FriendListItemState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(friendListItemState2, "$receiver");
                        return friendListItemState2.copy(this.$it);
                    }
                }

                {
                    this.f48889b = r1;
                }

                public final /* synthetic */ void accept(Object obj) {
                    f fVar = (f) obj;
                    if (PatchProxy.isSupport(new Object[]{fVar}, this, f48888a, false, 46399, new Class[]{f.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{fVar}, this, f48888a, false, 46399, new Class[]{f.class}, Void.TYPE);
                        return;
                    }
                    User user = (User) fVar.a();
                    if (user != null) {
                        this.f48889b.this$0.c(new C0580a(user));
                    }
                }
            }, AnonymousClass2.f48890a);
            Intrinsics.checkExpressionValueIsNotNull(subscribe, "userRepo.observeUser(sta…                      {})");
            friendListItemViewModel.a(subscribe);
        }
    }

    public final /* synthetic */ x c() {
        FriendListItemState friendListItemState;
        if (PatchProxy.isSupport(new Object[0], this, f48886d, false, 46396, new Class[0], FriendListItemState.class)) {
            friendListItemState = (FriendListItemState) PatchProxy.accessDispatch(new Object[0], this, f48886d, false, 46396, new Class[0], FriendListItemState.class);
        } else {
            friendListItemState = new FriendListItemState(null, 1, null);
        }
        return friendListItemState;
    }
}
