package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationState;", "Lcom/bytedance/jedi/arch/State;", "userId", "", "reportId", "listState", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "", "Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationPayload;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/jedi/arch/ext/list/ListState;)V", "getListState", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getReportId", "()Ljava/lang/String;", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ConnectedRelationState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final ListState<Object, b> listState;
    @NotNull
    private final String reportId;
    @NotNull
    private final String userId;

    public ConnectedRelationState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ConnectedRelationState copy$default(ConnectedRelationState connectedRelationState, String str, String str2, ListState<Object, b> listState2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = connectedRelationState.userId;
        }
        if ((i & 2) != 0) {
            str2 = connectedRelationState.reportId;
        }
        if ((i & 4) != 0) {
            listState2 = connectedRelationState.listState;
        }
        return connectedRelationState.copy(str, str2, listState2);
    }

    @NotNull
    public final String component1() {
        return this.userId;
    }

    @NotNull
    public final String component2() {
        return this.reportId;
    }

    @NotNull
    public final ListState<Object, b> component3() {
        return this.listState;
    }

    @NotNull
    public final ConnectedRelationState copy(@NotNull String str, @NotNull String str2, @NotNull ListState<Object, b> listState2) {
        String str3 = str;
        String str4 = str2;
        ListState<Object, b> listState3 = listState2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, listState3}, this, changeQuickRedirect, false, 45213, new Class[]{String.class, String.class, ListState.class}, ConnectedRelationState.class)) {
            return (ConnectedRelationState) PatchProxy.accessDispatch(new Object[]{str3, str4, listState3}, this, changeQuickRedirect, false, 45213, new Class[]{String.class, String.class, ListState.class}, ConnectedRelationState.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "userId");
        Intrinsics.checkParameterIsNotNull(str4, "reportId");
        Intrinsics.checkParameterIsNotNull(listState3, "listState");
        return new ConnectedRelationState(str3, str4, listState3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 45216, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 45216, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof ConnectedRelationState) {
                ConnectedRelationState connectedRelationState = (ConnectedRelationState) obj;
                if (!Intrinsics.areEqual((Object) this.userId, (Object) connectedRelationState.userId) || !Intrinsics.areEqual((Object) this.reportId, (Object) connectedRelationState.reportId) || !Intrinsics.areEqual((Object) this.listState, (Object) connectedRelationState.listState)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45215, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45215, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.userId;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.reportId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ListState<Object, b> listState2 = this.listState;
        if (listState2 != null) {
            i = listState2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 45214, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 45214, new Class[0], String.class);
        }
        return "ConnectedRelationState(userId=" + this.userId + ", reportId=" + this.reportId + ", listState=" + this.listState + ")";
    }

    @NotNull
    public final ListState<Object, b> getListState() {
        return this.listState;
    }

    @NotNull
    public final String getReportId() {
        return this.reportId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public ConnectedRelationState(@NotNull String str, @NotNull String str2, @NotNull ListState<Object, b> listState2) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "reportId");
        Intrinsics.checkParameterIsNotNull(listState2, "listState");
        this.userId = str;
        this.reportId = str2;
        this.listState = listState2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConnectedRelationState(java.lang.String r9, java.lang.String r10, com.bytedance.jedi.arch.ext.list.ListState r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r8 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L_0x0006
            java.lang.String r9 = ""
        L_0x0006:
            r13 = r12 & 2
            if (r13 == 0) goto L_0x000c
            java.lang.String r10 = ""
        L_0x000c:
            r12 = r12 & 4
            if (r12 == 0) goto L_0x002c
            com.bytedance.jedi.arch.ext.list.ListState r11 = new com.bytedance.jedi.arch.ext.list.ListState
            com.ss.android.ugc.aweme.following.ui.viewmodel.b r12 = new com.ss.android.ugc.aweme.following.ui.viewmodel.b
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 15
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r12
            com.bytedance.jedi.arch.ext.list.k r1 = (com.bytedance.jedi.arch.ext.list.k) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 30
            r7 = 0
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L_0x002c:
            r8.<init>(r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState.<init>(java.lang.String, java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
