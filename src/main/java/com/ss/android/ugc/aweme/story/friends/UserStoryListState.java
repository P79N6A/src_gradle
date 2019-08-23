package com.ss.android.ugc.aweme.story.friends;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.api.model.c;
import com.ss.android.ugc.aweme.story.api.model.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B/\u0012\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\u001e\b\u0002\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/story/friends/UserStoryListState;", "Lcom/bytedance/jedi/arch/State;", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListState;", "param", "Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "(Lcom/bytedance/jedi/arch/ext/list/ListState;Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;)V", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getParam", "()Lcom/ss/android/ugc/aweme/story/api/model/StoryHeaderParams;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserStoryListState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<c, k> listState;
    @NotNull
    private final h param;

    public UserStoryListState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ UserStoryListState copy$default(UserStoryListState userStoryListState, ListState<c, k> listState2, h hVar, int i, Object obj) {
        if ((i & 1) != 0) {
            listState2 = userStoryListState.listState;
        }
        if ((i & 2) != 0) {
            hVar = userStoryListState.param;
        }
        return userStoryListState.copy(listState2, hVar);
    }

    @NotNull
    public final ListState<c, k> component1() {
        return this.listState;
    }

    @NotNull
    public final h component2() {
        return this.param;
    }

    @NotNull
    public final UserStoryListState copy(@NotNull ListState<c, k> listState2, @NotNull h hVar) {
        ListState<c, k> listState3 = listState2;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{listState3, hVar2}, this, changeQuickRedirect, false, 84451, new Class[]{ListState.class, h.class}, UserStoryListState.class)) {
            return (UserStoryListState) PatchProxy.accessDispatch(new Object[]{listState3, hVar2}, this, changeQuickRedirect, false, 84451, new Class[]{ListState.class, h.class}, UserStoryListState.class);
        }
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        Intrinsics.checkParameterIsNotNull(hVar2, "param");
        return new UserStoryListState(listState3, hVar2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 84454, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 84454, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof UserStoryListState) {
                UserStoryListState userStoryListState = (UserStoryListState) obj;
                if (!Intrinsics.areEqual((Object) this.listState, (Object) userStoryListState.listState) || !Intrinsics.areEqual((Object) this.param, (Object) userStoryListState.param)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84453, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84453, new Class[0], Integer.TYPE)).intValue();
        }
        ListState<c, k> listState2 = this.listState;
        int hashCode = (listState2 != null ? listState2.hashCode() : 0) * 31;
        h hVar = this.param;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 84452, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 84452, new Class[0], String.class);
        }
        return "UserStoryListState(listState=" + this.listState + ", param=" + this.param + ")";
    }

    @NotNull
    public final ListState<c, k> getListState() {
        return this.listState;
    }

    @NotNull
    public final h getParam() {
        return this.param;
    }

    public UserStoryListState(@NotNull ListState<c, k> listState2, @NotNull h hVar) {
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        Intrinsics.checkParameterIsNotNull(hVar, "param");
        this.listState = listState2;
        this.param = hVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UserStoryListState(com.bytedance.jedi.arch.ext.list.ListState r9, com.ss.android.ugc.aweme.story.api.model.h r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r8 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0018
            com.bytedance.jedi.arch.ext.list.k r1 = new com.bytedance.jedi.arch.ext.list.k
            r9 = 3
            r12 = 0
            r1.<init>(r12, r12, r9)
            com.bytedance.jedi.arch.ext.list.ListState r9 = new com.bytedance.jedi.arch.ext.list.ListState
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x0018:
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.story.api.model.h r10 = new com.ss.android.ugc.aweme.story.api.model.h
            r10.<init>()
        L_0x0021:
            r8.<init>(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.friends.UserStoryListState.<init>(com.bytedance.jedi.arch.ext.list.ListState, com.ss.android.ugc.aweme.story.api.model.h, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
