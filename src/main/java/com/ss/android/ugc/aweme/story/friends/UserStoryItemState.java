package com.ss.android.ugc.aweme.story.friends;

import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.ad;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.model.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryItemState;", "Lcom/bytedance/jedi/arch/State;", "refresh", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "userStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "(Lcom/bytedance/jedi/arch/Async;Lcom/ss/android/ugc/aweme/story/api/model/UserStory;)V", "getRefresh", "()Lcom/bytedance/jedi/arch/Async;", "getUserStory", "()Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryItemState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final a<b> refresh;
    @Nullable
    private final UserStory userStory;

    public UserStoryItemState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ UserStoryItemState copy$default(UserStoryItemState userStoryItemState, a<b> aVar, UserStory userStory2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = userStoryItemState.refresh;
        }
        if ((i & 2) != 0) {
            userStory2 = userStoryItemState.userStory;
        }
        return userStoryItemState.copy(aVar, userStory2);
    }

    @NotNull
    public final a<b> component1() {
        return this.refresh;
    }

    @Nullable
    public final UserStory component2() {
        return this.userStory;
    }

    @NotNull
    public final UserStoryItemState copy(@NotNull a<? extends b> aVar, @Nullable UserStory userStory2) {
        a<? extends b> aVar2 = aVar;
        UserStory userStory3 = userStory2;
        if (PatchProxy.isSupport(new Object[]{aVar2, userStory3}, this, changeQuickRedirect, false, 84443, new Class[]{a.class, UserStory.class}, UserStoryItemState.class)) {
            return (UserStoryItemState) PatchProxy.accessDispatch(new Object[]{aVar2, userStory3}, this, changeQuickRedirect, false, 84443, new Class[]{a.class, UserStory.class}, UserStoryItemState.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "refresh");
        return new UserStoryItemState(aVar2, userStory3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 84446, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 84446, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof UserStoryItemState) {
                UserStoryItemState userStoryItemState = (UserStoryItemState) obj;
                if (!Intrinsics.areEqual((Object) this.refresh, (Object) userStoryItemState.refresh) || !Intrinsics.areEqual((Object) this.userStory, (Object) userStoryItemState.userStory)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84445, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84445, new Class[0], Integer.TYPE)).intValue();
        }
        a<b> aVar = this.refresh;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        UserStory userStory2 = this.userStory;
        if (userStory2 != null) {
            i = userStory2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84444, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84444, new Class[0], String.class);
        }
        return "UserStoryItemState(refresh=" + this.refresh + ", userStory=" + this.userStory + ")";
    }

    @NotNull
    public final a<b> getRefresh() {
        return this.refresh;
    }

    @Nullable
    public final UserStory getUserStory() {
        return this.userStory;
    }

    public UserStoryItemState(@NotNull a<? extends b> aVar, @Nullable UserStory userStory2) {
        Intrinsics.checkParameterIsNotNull(aVar, "refresh");
        this.refresh = aVar;
        this.userStory = userStory2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UserStoryItemState(a aVar, UserStory userStory2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ad.f21345a : aVar, (i & 2) != 0 ? null : userStory2);
    }
}
