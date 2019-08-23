package com.ss.android.ugc.aweme.story.feed.jedi;

import com.bytedance.jedi.arch.a;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.model.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/jedi/StoryMainHolderState;", "Lcom/bytedance/jedi/arch/State;", "queryType", "", "userStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "refresh", "Lcom/bytedance/jedi/arch/Async;", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeOneUserModel;", "loadMore", "preLoadMore", "(ILcom/ss/android/ugc/aweme/story/api/model/UserStory;Lcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/Async;Lcom/bytedance/jedi/arch/Async;)V", "list", "", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "getList", "()Ljava/util/List;", "getLoadMore", "()Lcom/bytedance/jedi/arch/Async;", "getPreLoadMore", "getQueryType", "()I", "getRefresh", "getUserStory", "()Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class StoryMainHolderState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final a<b> loadMore;
    @NotNull
    private final a<b> preLoadMore;
    private final int queryType;
    @NotNull
    private final a<b> refresh;
    @Nullable
    private final UserStory userStory;

    public StoryMainHolderState() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StoryMainHolderState copy$default(StoryMainHolderState storyMainHolderState, int i, UserStory userStory2, a<b> aVar, a<b> aVar2, a<b> aVar3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storyMainHolderState.queryType;
        }
        if ((i2 & 2) != 0) {
            userStory2 = storyMainHolderState.userStory;
        }
        UserStory userStory3 = userStory2;
        if ((i2 & 4) != 0) {
            aVar = storyMainHolderState.refresh;
        }
        a<b> aVar4 = aVar;
        if ((i2 & 8) != 0) {
            aVar2 = storyMainHolderState.loadMore;
        }
        a<b> aVar5 = aVar2;
        if ((i2 & 16) != 0) {
            aVar3 = storyMainHolderState.preLoadMore;
        }
        return storyMainHolderState.copy(i, userStory3, aVar4, aVar5, aVar3);
    }

    public final int component1() {
        return this.queryType;
    }

    @Nullable
    public final UserStory component2() {
        return this.userStory;
    }

    @NotNull
    public final a<b> component3() {
        return this.refresh;
    }

    @NotNull
    public final a<b> component4() {
        return this.loadMore;
    }

    @NotNull
    public final a<b> component5() {
        return this.preLoadMore;
    }

    @NotNull
    public final StoryMainHolderState copy(int i, @Nullable UserStory userStory2, @NotNull a<? extends b> aVar, @NotNull a<? extends b> aVar2, @NotNull a<? extends b> aVar3) {
        a<? extends b> aVar4 = aVar;
        a<? extends b> aVar5 = aVar2;
        a<? extends b> aVar6 = aVar3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), userStory2, aVar4, aVar5, aVar6}, this, changeQuickRedirect, false, 83419, new Class[]{Integer.TYPE, UserStory.class, a.class, a.class, a.class}, StoryMainHolderState.class)) {
            Object[] objArr = {Integer.valueOf(i), userStory2, aVar4, aVar5, aVar6};
            return (StoryMainHolderState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 83419, new Class[]{Integer.TYPE, UserStory.class, a.class, a.class, a.class}, StoryMainHolderState.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar4, "refresh");
        Intrinsics.checkParameterIsNotNull(aVar5, "loadMore");
        Intrinsics.checkParameterIsNotNull(aVar6, "preLoadMore");
        StoryMainHolderState storyMainHolderState = new StoryMainHolderState(i, userStory2, aVar, aVar2, aVar3);
        return storyMainHolderState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 83422, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 83422, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof StoryMainHolderState) {
                StoryMainHolderState storyMainHolderState = (StoryMainHolderState) obj;
                if (!(this.queryType == storyMainHolderState.queryType) || !Intrinsics.areEqual((Object) this.userStory, (Object) storyMainHolderState.userStory) || !Intrinsics.areEqual((Object) this.refresh, (Object) storyMainHolderState.refresh) || !Intrinsics.areEqual((Object) this.loadMore, (Object) storyMainHolderState.loadMore) || !Intrinsics.areEqual((Object) this.preLoadMore, (Object) storyMainHolderState.preLoadMore)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83421, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83421, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.queryType * 31;
        UserStory userStory2 = this.userStory;
        int hashCode = (i2 + (userStory2 != null ? userStory2.hashCode() : 0)) * 31;
        a<b> aVar = this.refresh;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<b> aVar2 = this.loadMore;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<b> aVar3 = this.preLoadMore;
        if (aVar3 != null) {
            i = aVar3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83420, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83420, new Class[0], String.class);
        }
        return "StoryMainHolderState(queryType=" + this.queryType + ", userStory=" + this.userStory + ", refresh=" + this.refresh + ", loadMore=" + this.loadMore + ", preLoadMore=" + this.preLoadMore + ")";
    }

    @NotNull
    public final a<b> getLoadMore() {
        return this.loadMore;
    }

    @NotNull
    public final a<b> getPreLoadMore() {
        return this.preLoadMore;
    }

    public final int getQueryType() {
        return this.queryType;
    }

    @NotNull
    public final a<b> getRefresh() {
        return this.refresh;
    }

    @Nullable
    public final UserStory getUserStory() {
        return this.userStory;
    }

    @Nullable
    public final List<com.ss.android.ugc.aweme.story.api.model.b> getList() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 83418, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 83418, new Class[0], List.class);
        }
        UserStory userStory2 = this.userStory;
        if (userStory2 != null) {
            return userStory2.getAwemeList();
        }
        return null;
    }

    public StoryMainHolderState(int i, @Nullable UserStory userStory2, @NotNull a<? extends b> aVar, @NotNull a<? extends b> aVar2, @NotNull a<? extends b> aVar3) {
        Intrinsics.checkParameterIsNotNull(aVar, "refresh");
        Intrinsics.checkParameterIsNotNull(aVar2, "loadMore");
        Intrinsics.checkParameterIsNotNull(aVar3, "preLoadMore");
        this.queryType = i;
        this.userStory = userStory2;
        this.refresh = aVar;
        this.loadMore = aVar2;
        this.preLoadMore = aVar3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoryMainHolderState(int r4, com.ss.android.ugc.aweme.story.api.model.UserStory r5, com.bytedance.jedi.arch.a r6, com.bytedance.jedi.arch.a r7, com.bytedance.jedi.arch.a r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0005
            r4 = 0
        L_0x0005:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000a
            r5 = 0
        L_0x000a:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0014
            com.bytedance.jedi.arch.ad r5 = com.bytedance.jedi.arch.ad.f21345a
            r6 = r5
            com.bytedance.jedi.arch.a r6 = (com.bytedance.jedi.arch.a) r6
        L_0x0014:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001e
            com.bytedance.jedi.arch.ad r5 = com.bytedance.jedi.arch.ad.f21345a
            r7 = r5
            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.a) r7
        L_0x001e:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0028
            com.bytedance.jedi.arch.ad r5 = com.bytedance.jedi.arch.ad.f21345a
            r8 = r5
            com.bytedance.jedi.arch.a r8 = (com.bytedance.jedi.arch.a) r8
        L_0x0028:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.jedi.StoryMainHolderState.<init>(int, com.ss.android.ugc.aweme.story.api.model.UserStory, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.a, com.bytedance.jedi.arch.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
