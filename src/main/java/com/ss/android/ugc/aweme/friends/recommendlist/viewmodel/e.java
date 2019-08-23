package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Resp;", "", "type", "", "state", "Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "recentFanList", "Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "recommendList", "(ILcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;Lcom/ss/android/ugc/aweme/friends/model/RecommendList;Lcom/ss/android/ugc/aweme/friends/model/RecommendList;)V", "getRecentFanList", "()Lcom/ss/android/ugc/aweme/friends/model/RecommendList;", "getRecommendList", "getState", "()Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendListState;", "getType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49058a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49059b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final RecommendListState f49060c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final RecommendList f49061d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final RecommendList f49062e;

    public e() {
        this(0, null, null, null, 15);
    }

    @NotNull
    public final e a(int i, @NotNull RecommendListState recommendListState, @NotNull RecommendList recommendList, @NotNull RecommendList recommendList2) {
        RecommendListState recommendListState2 = recommendListState;
        RecommendList recommendList3 = recommendList;
        RecommendList recommendList4 = recommendList2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recommendListState2, recommendList3, recommendList4}, this, f49058a, false, 46865, new Class[]{Integer.TYPE, RecommendListState.class, RecommendList.class, RecommendList.class}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recommendListState2, recommendList3, recommendList4}, this, f49058a, false, 46865, new Class[]{Integer.TYPE, RecommendListState.class, RecommendList.class, RecommendList.class}, e.class);
        }
        Intrinsics.checkParameterIsNotNull(recommendListState2, "state");
        Intrinsics.checkParameterIsNotNull(recommendList3, "recentFanList");
        Intrinsics.checkParameterIsNotNull(recommendList4, "recommendList");
        return new e(i, recommendListState2, recommendList3, recommendList4);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49058a, false, 46868, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f49058a, false, 46868, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!(this.f49059b == eVar.f49059b) || !Intrinsics.areEqual((Object) this.f49060c, (Object) eVar.f49060c) || !Intrinsics.areEqual((Object) this.f49061d, (Object) eVar.f49061d) || !Intrinsics.areEqual((Object) this.f49062e, (Object) eVar.f49062e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f49058a, false, 46867, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49058a, false, 46867, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f49059b * 31;
        RecommendListState recommendListState = this.f49060c;
        int hashCode = (i2 + (recommendListState != null ? recommendListState.hashCode() : 0)) * 31;
        RecommendList recommendList = this.f49061d;
        int hashCode2 = (hashCode + (recommendList != null ? recommendList.hashCode() : 0)) * 31;
        RecommendList recommendList2 = this.f49062e;
        if (recommendList2 != null) {
            i = recommendList2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f49058a, false, 46866, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49058a, false, 46866, new Class[0], String.class);
        }
        return "Resp(type=" + this.f49059b + ", state=" + this.f49060c + ", recentFanList=" + this.f49061d + ", recommendList=" + this.f49062e + ")";
    }

    private e(int i, @NotNull RecommendListState recommendListState, @NotNull RecommendList recommendList, @NotNull RecommendList recommendList2) {
        Intrinsics.checkParameterIsNotNull(recommendListState, "state");
        Intrinsics.checkParameterIsNotNull(recommendList, "recentFanList");
        Intrinsics.checkParameterIsNotNull(recommendList2, "recommendList");
        this.f49059b = i;
        this.f49060c = recommendListState;
        this.f49061d = recommendList;
        this.f49062e = recommendList2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ e(int r19, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState r20, com.ss.android.ugc.aweme.friends.model.RecommendList r21, com.ss.android.ugc.aweme.friends.model.RecommendList r22, int r23) {
        /*
            r18 = this;
            com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState r15 = new com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 8191(0x1fff, float:1.1478E-41)
            r16 = 0
            r0 = r15
            r17 = r15
            r15 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = new com.ss.android.ugc.aweme.friends.model.RecommendList
            r0.<init>()
            com.ss.android.ugc.aweme.friends.model.RecommendList r1 = new com.ss.android.ugc.aweme.friends.model.RecommendList
            r1.<init>()
            r2 = 8
            r3 = r18
            r4 = r17
            r3.<init>(r2, r4, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.e.<init>(int, com.ss.android.ugc.aweme.friends.recommendlist.viewmodel.RecommendListState, com.ss.android.ugc.aweme.friends.model.RecommendList, com.ss.android.ugc.aweme.friends.model.RecommendList, int):void");
    }
}
