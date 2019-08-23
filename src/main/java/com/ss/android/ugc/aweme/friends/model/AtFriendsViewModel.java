package com.ss.android.ugc.aweme.friends.model;

import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0004J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J$\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001a2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J(\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u00172\u0006\u0010\u0013\u001a\u00020\u00042\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aJ\b\u0010\u001d\u001a\u00020\u0018H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel;", "", "()V", "latestSearchKey", "", "getLatestSearchKey", "()Ljava/lang/String;", "setLatestSearchKey", "(Ljava/lang/String;)V", "latestSearchUsers", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "getLatestSearchUsers", "()Ljava/util/List;", "setLatestSearchUsers", "(Ljava/util/List;)V", "containKeyWord", "", "str", "keyWord", "latestSearchUsersContain", "uid", "loadAllFriends", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;", "searchFollowIMUser", "", "data", "searchKeyWord", "testData", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AtFriendsViewModel {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    @NotNull
    public String latestSearchKey = "";
    @NotNull
    public List<IMUser> latestSearchUsers = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion;", "", "()V", "MAX_RECENT_FRIEND_COUNT", "", "MIN_FOLLOWER_MUTUAL_NEED", "AllFriends", "SearchResult", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JY\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$AllFriends;", "", "recentFriends", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "mutualFriends", "allFollowingFriends", "indexLabels", "", "indexLabelCount", "", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getAllFollowingFriends", "()Ljava/util/List;", "getIndexLabelCount", "getIndexLabels", "getMutualFriends", "getRecentFriends", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class AllFriends {
            public static ChangeQuickRedirect changeQuickRedirect;
            @NotNull
            public final List<IMUser> allFollowingFriends;
            @NotNull
            public final List<Integer> indexLabelCount;
            @NotNull
            public final List<String> indexLabels;
            @NotNull
            public final List<IMUser> mutualFriends;
            @NotNull
            public final List<IMUser> recentFriends;

            public static /* synthetic */ AllFriends copy$default(AllFriends allFriends, List<IMUser> list, List<IMUser> list2, List<IMUser> list3, List<String> list4, List<Integer> list5, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = allFriends.recentFriends;
                }
                if ((i & 2) != 0) {
                    list2 = allFriends.mutualFriends;
                }
                List<IMUser> list6 = list2;
                if ((i & 4) != 0) {
                    list3 = allFriends.allFollowingFriends;
                }
                List<IMUser> list7 = list3;
                if ((i & 8) != 0) {
                    list4 = allFriends.indexLabels;
                }
                List<String> list8 = list4;
                if ((i & 16) != 0) {
                    list5 = allFriends.indexLabelCount;
                }
                return allFriends.copy(list, list6, list7, list8, list5);
            }

            @NotNull
            public final AllFriends copy(@NotNull List<? extends IMUser> list, @NotNull List<? extends IMUser> list2, @NotNull List<? extends IMUser> list3, @NotNull List<String> list4, @NotNull List<Integer> list5) {
                List<? extends IMUser> list6 = list;
                List<? extends IMUser> list7 = list2;
                List<? extends IMUser> list8 = list3;
                List<String> list9 = list4;
                List<Integer> list10 = list5;
                if (PatchProxy.isSupport(new Object[]{list6, list7, list8, list9, list10}, this, changeQuickRedirect, false, 46580, new Class[]{List.class, List.class, List.class, List.class, List.class}, AllFriends.class)) {
                    return (AllFriends) PatchProxy.accessDispatch(new Object[]{list6, list7, list8, list9, list10}, this, changeQuickRedirect, false, 46580, new Class[]{List.class, List.class, List.class, List.class, List.class}, AllFriends.class);
                }
                Intrinsics.checkParameterIsNotNull(list6, "recentFriends");
                Intrinsics.checkParameterIsNotNull(list7, "mutualFriends");
                Intrinsics.checkParameterIsNotNull(list8, "allFollowingFriends");
                Intrinsics.checkParameterIsNotNull(list9, "indexLabels");
                Intrinsics.checkParameterIsNotNull(list10, "indexLabelCount");
                AllFriends allFriends = new AllFriends(list, list2, list3, list4, list5);
                return allFriends;
            }

            public final boolean equals(@Nullable Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46583, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46583, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof AllFriends) {
                        AllFriends allFriends = (AllFriends) obj;
                        if (!Intrinsics.areEqual((Object) this.recentFriends, (Object) allFriends.recentFriends) || !Intrinsics.areEqual((Object) this.mutualFriends, (Object) allFriends.mutualFriends) || !Intrinsics.areEqual((Object) this.allFollowingFriends, (Object) allFriends.allFollowingFriends) || !Intrinsics.areEqual((Object) this.indexLabels, (Object) allFriends.indexLabels) || !Intrinsics.areEqual((Object) this.indexLabelCount, (Object) allFriends.indexLabelCount)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46582, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46582, new Class[0], Integer.TYPE)).intValue();
                }
                List<IMUser> list = this.recentFriends;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.mutualFriends;
                int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
                List<IMUser> list3 = this.allFollowingFriends;
                int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
                List<String> list4 = this.indexLabels;
                int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
                List<Integer> list5 = this.indexLabelCount;
                if (list5 != null) {
                    i = list5.hashCode();
                }
                return hashCode4 + i;
            }

            @NotNull
            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46581, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46581, new Class[0], String.class);
                }
                return "AllFriends(recentFriends=" + this.recentFriends + ", mutualFriends=" + this.mutualFriends + ", allFollowingFriends=" + this.allFollowingFriends + ", indexLabels=" + this.indexLabels + ", indexLabelCount=" + this.indexLabelCount + ")";
            }

            public AllFriends(@NotNull List<? extends IMUser> list, @NotNull List<? extends IMUser> list2, @NotNull List<? extends IMUser> list3, @NotNull List<String> list4, @NotNull List<Integer> list5) {
                Intrinsics.checkParameterIsNotNull(list, "recentFriends");
                Intrinsics.checkParameterIsNotNull(list2, "mutualFriends");
                Intrinsics.checkParameterIsNotNull(list3, "allFollowingFriends");
                Intrinsics.checkParameterIsNotNull(list4, "indexLabels");
                Intrinsics.checkParameterIsNotNull(list5, "indexLabelCount");
                this.recentFriends = list;
                this.mutualFriends = list2;
                this.allFollowingFriends = list3;
                this.indexLabels = list4;
                this.indexLabelCount = list5;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/model/AtFriendsViewModel$Companion$SearchResult;", "", "followingFriends", "", "Lcom/ss/android/ugc/aweme/im/service/model/IMUser;", "allFriends", "(Ljava/util/List;Ljava/util/List;)V", "getAllFriends", "()Ljava/util/List;", "getFollowingFriends", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        public static final class SearchResult {
            public static ChangeQuickRedirect changeQuickRedirect;
            @NotNull
            public final List<IMUser> allFriends;
            @NotNull
            public final List<IMUser> followingFriends;

            public static /* synthetic */ SearchResult copy$default(SearchResult searchResult, List<IMUser> list, List<IMUser> list2, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = searchResult.followingFriends;
                }
                if ((i & 2) != 0) {
                    list2 = searchResult.allFriends;
                }
                return searchResult.copy(list, list2);
            }

            @NotNull
            public final SearchResult copy(@NotNull List<? extends IMUser> list, @NotNull List<? extends IMUser> list2) {
                List<? extends IMUser> list3 = list;
                List<? extends IMUser> list4 = list2;
                if (PatchProxy.isSupport(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46584, new Class[]{List.class, List.class}, SearchResult.class)) {
                    return (SearchResult) PatchProxy.accessDispatch(new Object[]{list3, list4}, this, changeQuickRedirect, false, 46584, new Class[]{List.class, List.class}, SearchResult.class);
                }
                Intrinsics.checkParameterIsNotNull(list3, "followingFriends");
                Intrinsics.checkParameterIsNotNull(list4, "allFriends");
                return new SearchResult(list3, list4);
            }

            public final boolean equals(@Nullable Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 46587, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 46587, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof SearchResult) {
                        SearchResult searchResult = (SearchResult) obj;
                        if (!Intrinsics.areEqual((Object) this.followingFriends, (Object) searchResult.followingFriends) || !Intrinsics.areEqual((Object) this.allFriends, (Object) searchResult.allFriends)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46586, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46586, new Class[0], Integer.TYPE)).intValue();
                }
                List<IMUser> list = this.followingFriends;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                List<IMUser> list2 = this.allFriends;
                if (list2 != null) {
                    i = list2.hashCode();
                }
                return hashCode + i;
            }

            @NotNull
            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46585, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46585, new Class[0], String.class);
                }
                return "SearchResult(followingFriends=" + this.followingFriends + ", allFriends=" + this.allFriends + ")";
            }

            public SearchResult(@NotNull List<? extends IMUser> list, @NotNull List<? extends IMUser> list2) {
                Intrinsics.checkParameterIsNotNull(list, "followingFriends");
                Intrinsics.checkParameterIsNotNull(list2, "allFriends");
                this.followingFriends = list;
                this.allFriends = list2;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @NotNull
    public final i<Companion.AllFriends> loadAllFriends() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46574, new Class[0], i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46574, new Class[0], i.class);
        }
        i<Companion.AllFriends> a2 = i.a((Callable<TResult>) AtFriendsViewModel$loadAllFriends$1.INSTANCE);
        Intrinsics.checkExpressionValueIsNotNull(a2, "bolts.Task.callInBackgro…s, indexLabelCount)\n    }");
        return a2;
    }

    private final Companion.AllFriends testData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46579, new Class[0], Companion.AllFriends.class)) {
            return (Companion.AllFriends) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46579, new Class[0], Companion.AllFriends.class);
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 10; i++) {
            IMUser iMUser = new IMUser();
            iMUser.setNickName("recent_nick_" + i);
            iMUser.setSignature("recent_signature_" + i);
            iMUser.setInitialLetter("R");
            arrayList.add(iMUser);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 1; i2 <= 10; i2++) {
            IMUser iMUser2 = new IMUser();
            iMUser2.setNickName("mutual_nick_" + i2);
            iMUser2.setSignature("mutual_signature_" + i2);
            iMUser2.setInitialLetter("m");
            arrayList2.add(iMUser2);
        }
        List mutableListOf = CollectionsKt.mutableListOf("Recent", "Friend");
        ArrayList arrayList3 = new ArrayList();
        List mutableListOf2 = CollectionsKt.mutableListOf(Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
        for (char c2 = 'A'; c2 <= 'Z'; c2 = (char) (c2 + 1)) {
            IMUser iMUser3 = new IMUser();
            iMUser3.setNickName("follow_nick");
            iMUser3.setSignature(c2 + "_follow_signature");
            iMUser3.setInitialLetter(String.valueOf(c2));
            arrayList3.add(iMUser3);
            String initialLetter = iMUser3.getInitialLetter();
            Intrinsics.checkExpressionValueIsNotNull(initialLetter, "user.initialLetter");
            mutableListOf.add(initialLetter);
            mutableListOf2.add(1);
        }
        Companion.AllFriends allFriends = new Companion.AllFriends(arrayList, arrayList2, arrayList3, mutableListOf, mutableListOf2);
        return allFriends;
    }

    public final void setLatestSearchKey(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46573, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46573, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.latestSearchKey = str2;
    }

    public final void setLatestSearchUsers(@NotNull List<IMUser> list) {
        List<IMUser> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 46572, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 46572, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.latestSearchUsers = list2;
    }

    public final boolean latestSearchUsersContain(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 46576, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 46576, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        for (IMUser uid : this.latestSearchUsers) {
            if (Intrinsics.areEqual((Object) uid.getUid(), (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean containKeyWord(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, changeQuickRedirect, false, 46578, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, changeQuickRedirect, false, 46578, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) str2, false, 2, (Object) null)) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }

    @NotNull
    public final i<List<IMUser>> searchKeyWord(@NotNull String str, @NotNull List<? extends IMUser> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, changeQuickRedirect, false, 46575, new Class[]{String.class, List.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, list}, this, changeQuickRedirect, false, 46575, new Class[]{String.class, List.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "keyWord");
        Intrinsics.checkParameterIsNotNull(list, "data");
        this.latestSearchKey = str;
        i<List<IMUser>> b2 = i.a((Callable<TResult>) new AtFriendsViewModel$searchKeyWord$1<TResult>(this, list, str)).b(new AtFriendsViewModel$searchKeyWord$2(this), i.f1052b);
        Intrinsics.checkExpressionValueIsNotNull(b2, "bolts.Task.callInBackgro….Task.UI_THREAD_EXECUTOR)");
        return b2;
    }

    public final List<IMUser> searchFollowIMUser(List<? extends IMUser> list, String str) {
        if (PatchProxy.isSupport(new Object[]{list, str}, this, changeQuickRedirect, false, 46577, new Class[]{List.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, str}, this, changeQuickRedirect, false, 46577, new Class[]{List.class, String.class}, List.class);
        }
        List<IMUser> searchFollowIMUser = b.a().searchFollowIMUser(list, str);
        if (a.b()) {
            if (str != null) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                for (IMUser iMUser : list) {
                    if (!TextUtils.isEmpty(iMUser.getUniqueId())) {
                        String uniqueId = iMUser.getUniqueId();
                        Intrinsics.checkExpressionValueIsNotNull(uniqueId, "it.uniqueId");
                        if (containKeyWord(uniqueId, lowerCase)) {
                            iMUser.setSearchType(1);
                            searchFollowIMUser.add(iMUser);
                        }
                    } else {
                        String shortId = iMUser.getShortId();
                        Intrinsics.checkExpressionValueIsNotNull(shortId, "it.shortId");
                        if (containKeyWord(shortId, lowerCase)) {
                            iMUser.setSearchType(1);
                            searchFollowIMUser.add(iMUser);
                        }
                    }
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(searchFollowIMUser, "result");
        return searchFollowIMUser;
    }
}
