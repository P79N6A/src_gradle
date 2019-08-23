package com.ss.android.ugc.aweme.favorites.a;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ss/android/ugc/aweme/favorites/bean/UserWillingCollectionStruct;", "", "count", "", "willingList", "", "Lcom/ss/android/ugc/aweme/favorites/bean/WillingListItem;", "(JLjava/util/List;)V", "getCount", "()J", "getWillingList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44226a;
    @SerializedName("count")

    /* renamed from: b  reason: collision with root package name */
    public final long f44227b;
    @SerializedName("willing_list")
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final List<k> f44228c;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f44226a, false, 39462, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f44226a, false, 39462, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (!(this.f44227b == jVar.f44227b) || !Intrinsics.areEqual((Object) this.f44228c, (Object) jVar.f44228c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f44226a, false, 39461, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f44226a, false, 39461, new Class[0], Integer.TYPE)).intValue();
        }
        long j = this.f44227b;
        int i2 = ((int) (j ^ (j >>> 32))) * 31;
        List<k> list = this.f44228c;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f44226a, false, 39460, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f44226a, false, 39460, new Class[0], String.class);
        }
        return "UserWillingCollectionStruct(count=" + this.f44227b + ", willingList=" + this.f44228c + ")";
    }
}
