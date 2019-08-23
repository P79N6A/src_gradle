package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.bytedance.jedi.arch.ext.list.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/RecommendPayload;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "recommendList", "", "Lcom/ss/android/ugc/aweme/profile/model/User;", "hasMore", "", "cursor", "", "(Ljava/util/List;ZI)V", "getRecommendList", "()Ljava/util/List;", "equals", "other", "", "hashCode", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class d extends k {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f49056c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final List<User> f49057d;

    public d() {
        this(null, false, 0, 7);
    }

    public final int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f49056c, false, 46864, new Class[0], Integer.TYPE)) {
            return (this.f21387a.hashCode() * 31) + this.f21388b + this.f49057d.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49056c, false, 46864, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49056c, false, 46863, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f49056c, false, 46863, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!(!Intrinsics.areEqual((Object) this.f21387a, (Object) dVar.f21387a)) && this.f21388b == dVar.f21388b && !(!Intrinsics.areEqual((Object) this.f49057d, (Object) dVar.f49057d))) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(@NotNull List<? extends User> list, boolean z, int i) {
        super(z, i);
        Intrinsics.checkParameterIsNotNull(list, "recommendList");
        this.f49057d = list;
    }

    public /* synthetic */ d(List list, boolean z, int i, int i2) {
        this(CollectionsKt.emptyList(), true, 0);
    }
}
