package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u00020\t`\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u00020\t`\u000bHÆ\u0003JG\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u00020\t`\u000bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR'\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\b\u0012\u0004\u0012\u00020\t`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/SearchUserListState;", "Lcom/bytedance/jedi/arch/State;", "searchKeyWord", "", "startSearch", "", "enterFrom", "searchUserList", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/ss/android/ugc/aweme/discover/model/SearchUser;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/ext/list/CommonListState;", "(Ljava/lang/String;ZLjava/lang/String;Lcom/bytedance/jedi/arch/ext/list/ListState;)V", "getEnterFrom", "()Ljava/lang/String;", "getSearchKeyWord", "getSearchUserList", "()Lcom/bytedance/jedi/arch/ext/list/ListState;", "getStartSearch", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchUserListState implements x {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    private final String enterFrom;
    @NotNull
    private final String searchKeyWord;
    @NotNull
    private final ListState<SearchUser, k> searchUserList;
    private final boolean startSearch;

    public SearchUserListState() {
        this(null, false, null, null, 15, null);
    }

    public static /* synthetic */ SearchUserListState copy$default(SearchUserListState searchUserListState, String str, boolean z, String str2, ListState<SearchUser, k> listState, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchUserListState.searchKeyWord;
        }
        if ((i & 2) != 0) {
            z = searchUserListState.startSearch;
        }
        if ((i & 4) != 0) {
            str2 = searchUserListState.enterFrom;
        }
        if ((i & 8) != 0) {
            listState = searchUserListState.searchUserList;
        }
        return searchUserListState.copy(str, z, str2, listState);
    }

    @NotNull
    public final String component1() {
        return this.searchKeyWord;
    }

    public final boolean component2() {
        return this.startSearch;
    }

    @NotNull
    public final String component3() {
        return this.enterFrom;
    }

    @NotNull
    public final ListState<SearchUser, k> component4() {
        return this.searchUserList;
    }

    @NotNull
    public final SearchUserListState copy(@NotNull String str, boolean z, @NotNull String str2, @NotNull ListState<SearchUser, k> listState) {
        String str3 = str;
        String str4 = str2;
        ListState<SearchUser, k> listState2 = listState;
        if (PatchProxy.isSupport(new Object[]{str3, Byte.valueOf(z ? (byte) 1 : 0), str4, listState2}, this, changeQuickRedirect, false, 46869, new Class[]{String.class, Boolean.TYPE, String.class, ListState.class}, SearchUserListState.class)) {
            return (SearchUserListState) PatchProxy.accessDispatch(new Object[]{str3, Byte.valueOf(z), str4, listState2}, this, changeQuickRedirect, false, 46869, new Class[]{String.class, Boolean.TYPE, String.class, ListState.class}, SearchUserListState.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "searchKeyWord");
        Intrinsics.checkParameterIsNotNull(str4, "enterFrom");
        Intrinsics.checkParameterIsNotNull(listState2, "searchUserList");
        return new SearchUserListState(str3, z, str4, listState2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46872, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46872, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof SearchUserListState) {
                SearchUserListState searchUserListState = (SearchUserListState) obj;
                if (Intrinsics.areEqual((Object) this.searchKeyWord, (Object) searchUserListState.searchKeyWord)) {
                    if (!(this.startSearch == searchUserListState.startSearch) || !Intrinsics.areEqual((Object) this.enterFrom, (Object) searchUserListState.enterFrom) || !Intrinsics.areEqual((Object) this.searchUserList, (Object) searchUserListState.searchUserList)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46871, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46871, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.searchKeyWord;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.startSearch;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str2 = this.enterFrom;
        int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ListState<SearchUser, k> listState = this.searchUserList;
        if (listState != null) {
            i = listState.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46870, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46870, new Class[0], String.class);
        }
        return "SearchUserListState(searchKeyWord=" + this.searchKeyWord + ", startSearch=" + this.startSearch + ", enterFrom=" + this.enterFrom + ", searchUserList=" + this.searchUserList + ")";
    }

    @NotNull
    public final String getEnterFrom() {
        return this.enterFrom;
    }

    @NotNull
    public final String getSearchKeyWord() {
        return this.searchKeyWord;
    }

    @NotNull
    public final ListState<SearchUser, k> getSearchUserList() {
        return this.searchUserList;
    }

    public final boolean getStartSearch() {
        return this.startSearch;
    }

    public SearchUserListState(@NotNull String str, boolean z, @NotNull String str2, @NotNull ListState<SearchUser, k> listState) {
        Intrinsics.checkParameterIsNotNull(str, "searchKeyWord");
        Intrinsics.checkParameterIsNotNull(str2, "enterFrom");
        Intrinsics.checkParameterIsNotNull(listState, "searchUserList");
        this.searchKeyWord = str;
        this.startSearch = z;
        this.enterFrom = str2;
        this.searchUserList = listState;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SearchUserListState(java.lang.String r10, boolean r11, java.lang.String r12, com.bytedance.jedi.arch.ext.list.ListState r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r9 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L_0x0006
            java.lang.String r10 = ""
        L_0x0006:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto L_0x000c
            r11 = 0
        L_0x000c:
            r15 = r14 & 4
            if (r15 == 0) goto L_0x0012
            java.lang.String r12 = "search_result"
        L_0x0012:
            r14 = r14 & 8
            if (r14 == 0) goto L_0x0029
            com.bytedance.jedi.arch.ext.list.k r2 = new com.bytedance.jedi.arch.ext.list.k
            r13 = 3
            r2.<init>(r0, r0, r13)
            com.bytedance.jedi.arch.ext.list.ListState r13 = new com.bytedance.jedi.arch.ext.list.ListState
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 30
            r8 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
        L_0x0029:
            r9.<init>(r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.SearchUserListState.<init>(java.lang.String, boolean, java.lang.String, com.bytedance.jedi.arch.ext.list.ListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
