package com.ss.android.ugc.aweme.friends;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/AddFriendsViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "()V", "defaultState", "incrementEventActionUpCount", "", "setClickBackBtn", "clickBackBtn", "", "setCurrentIndex", "index", "", "setFirstEnter", "firstEnter", "setHadShowedFindFriend", "hadShowedFindFriend", "setHadShowedFriendList", "hadShowedFriendList", "setSearchState", "isSearching", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AddFriendsViewModel extends JediViewModel<AddFriendsState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48668d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<AddFriendsState, AddFriendsState> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(1);
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46203, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46203, new Class[]{AddFriendsState.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            return AddFriendsState.copy$default(addFriendsState, false, false, false, false, 0, false, addFriendsState.getEventActionUpCount() + 1, false, 191, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class b extends Lambda implements Function1<AddFriendsState, AddFriendsState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $clickBackBtn;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.$clickBackBtn = z;
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46204, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46204, new Class[]{AddFriendsState.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            return AddFriendsState.copy$default(addFriendsState, false, false, false, false, 0, this.$clickBackBtn, 0, false, 223, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<AddFriendsState, AddFriendsState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i) {
            super(1);
            this.$index = i;
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46205, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46205, new Class[]{AddFriendsState.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            return AddFriendsState.copy$default(addFriendsState, false, false, false, false, this.$index, false, 0, false, 239, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function1<AddFriendsState, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $firstEnter;
        final /* synthetic */ AddFriendsViewModel this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(AddFriendsViewModel addFriendsViewModel, boolean z) {
            super(1);
            this.this$0 = addFriendsViewModel;
            this.$firstEnter = z;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AddFriendsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AddFriendsState addFriendsState) {
            if (PatchProxy.isSupport(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 46206, new Class[]{AddFriendsState.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{addFriendsState}, this, changeQuickRedirect, false, 46206, new Class[]{AddFriendsState.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState, AdvanceSetting.NETWORK_TYPE);
            if (!addFriendsState.isFirstEnter()) {
                this.this$0.c(new Function1<AddFriendsState, AddFriendsState>(this) {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    final /* synthetic */ d this$0;

                    {
                        this.this$0 = r1;
                    }

                    @NotNull
                    public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
                        AddFriendsState addFriendsState2 = addFriendsState;
                        if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46207, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                            return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46207, new Class[]{AddFriendsState.class}, AddFriendsState.class);
                        }
                        Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
                        return AddFriendsState.copy$default(addFriendsState, this.this$0.$firstEnter, false, false, false, 0, false, 0, false, 254, null);
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class e extends Lambda implements Function1<AddFriendsState, AddFriendsState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $hadShowedFindFriend;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.$hadShowedFindFriend = z;
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46208, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46208, new Class[]{AddFriendsState.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            return AddFriendsState.copy$default(addFriendsState, false, false, false, this.$hadShowedFindFriend, 0, false, 0, false, 247, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class f extends Lambda implements Function1<AddFriendsState, AddFriendsState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $hadShowedFriendList;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(1);
            this.$hadShowedFriendList = z;
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46209, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46209, new Class[]{AddFriendsState.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            return AddFriendsState.copy$default(addFriendsState, false, false, this.$hadShowedFriendList, false, 0, false, 0, false, 251, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/friends/AddFriendsState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function1<AddFriendsState, AddFriendsState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $isSearching;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$isSearching = z;
        }

        @NotNull
        public final AddFriendsState invoke(@NotNull AddFriendsState addFriendsState) {
            AddFriendsState addFriendsState2 = addFriendsState;
            if (PatchProxy.isSupport(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46210, new Class[]{AddFriendsState.class}, AddFriendsState.class)) {
                return (AddFriendsState) PatchProxy.accessDispatch(new Object[]{addFriendsState2}, this, changeQuickRedirect, false, 46210, new Class[]{AddFriendsState.class}, AddFriendsState.class);
            }
            Intrinsics.checkParameterIsNotNull(addFriendsState2, "$receiver");
            return AddFriendsState.copy$default(addFriendsState, false, this.$isSearching, false, false, 0, false, 0, false, 253, null);
        }
    }

    public final /* synthetic */ x c() {
        AddFriendsState addFriendsState;
        if (PatchProxy.isSupport(new Object[0], this, f48668d, false, 46195, new Class[0], AddFriendsState.class)) {
            addFriendsState = (AddFriendsState) PatchProxy.accessDispatch(new Object[0], this, f48668d, false, 46195, new Class[0], AddFriendsState.class);
        } else {
            addFriendsState = new AddFriendsState(false, false, false, false, 0, false, 0, false, 255, null);
        }
        return addFriendsState;
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48668d, false, 46197, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48668d, false, 46197, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        c(new c(i));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48668d, false, 46196, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48668d, false, 46196, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new g(z));
    }
}
