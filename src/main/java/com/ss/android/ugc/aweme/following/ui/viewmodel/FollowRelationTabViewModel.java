package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "()V", "defaultState", "setConnectedRelationCount", "", "count", "", "setIsFollowingTab", "isFollowingTab", "", "setIsSearching", "isSearching", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FollowRelationTabViewModel extends JediViewModel<FollowRelationState> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f48190d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class a extends Lambda implements Function1<FollowRelationState, FollowRelationState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $count;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.$count = i;
        }

        @NotNull
        public final FollowRelationState invoke(@NotNull FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            if (PatchProxy.isSupport(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45224, new Class[]{FollowRelationState.class}, FollowRelationState.class)) {
                return (FollowRelationState) PatchProxy.accessDispatch(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45224, new Class[]{FollowRelationState.class}, FollowRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followRelationState2, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, this.$count, false, 5, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<FollowRelationState, FollowRelationState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $isFollowingTab;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$isFollowingTab = z;
        }

        @NotNull
        public final FollowRelationState invoke(@NotNull FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            if (PatchProxy.isSupport(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45225, new Class[]{FollowRelationState.class}, FollowRelationState.class)) {
                return (FollowRelationState) PatchProxy.accessDispatch(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45225, new Class[]{FollowRelationState.class}, FollowRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followRelationState2, "$receiver");
            return FollowRelationState.copy$default(followRelationState, false, 0, this.$isFollowingTab, 3, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationState;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function1<FollowRelationState, FollowRelationState> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ boolean $isSearching;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$isSearching = z;
        }

        @NotNull
        public final FollowRelationState invoke(@NotNull FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            if (PatchProxy.isSupport(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45226, new Class[]{FollowRelationState.class}, FollowRelationState.class)) {
                return (FollowRelationState) PatchProxy.accessDispatch(new Object[]{followRelationState2}, this, changeQuickRedirect, false, 45226, new Class[]{FollowRelationState.class}, FollowRelationState.class);
            }
            Intrinsics.checkParameterIsNotNull(followRelationState2, "$receiver");
            return FollowRelationState.copy$default(followRelationState, this.$isSearching, 0, false, 6, null);
        }
    }

    public final /* synthetic */ x c() {
        FollowRelationState followRelationState;
        if (PatchProxy.isSupport(new Object[0], this, f48190d, false, 45221, new Class[0], FollowRelationState.class)) {
            followRelationState = (FollowRelationState) PatchProxy.accessDispatch(new Object[0], this, f48190d, false, 45221, new Class[0], FollowRelationState.class);
        } else {
            followRelationState = new FollowRelationState(false, 0, false, 7, null);
        }
        return followRelationState;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48190d, false, 45220, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48190d, false, 45220, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new c(z));
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f48190d, false, 45223, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f48190d, false, 45223, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        c(new b(z));
    }
}
