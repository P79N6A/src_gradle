package com.ss.android.ugc.aweme.following.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/following/repository/ConnectedRelationQueryParam;", "", "uid", "", "cursor", "", "count", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCursor", "getUid", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/ss/android/ugc/aweme/following/repository/ConnectedRelationQueryParam;", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47916a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f47917b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Integer f47918c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Integer f47919d;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f47916a, false, 44795, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f47916a, false, 44795, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!Intrinsics.areEqual((Object) this.f47917b, (Object) aVar.f47917b) || !Intrinsics.areEqual((Object) this.f47918c, (Object) aVar.f47918c) || !Intrinsics.areEqual((Object) this.f47919d, (Object) aVar.f47919d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f47916a, false, 44794, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47916a, false, 44794, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f47917b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.f47918c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f47919d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f47916a, false, 44793, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f47916a, false, 44793, new Class[0], String.class);
        }
        return "ConnectedRelationQueryParam(uid=" + this.f47917b + ", cursor=" + this.f47918c + ", count=" + this.f47919d + ")";
    }

    public a(@NotNull String str, @Nullable Integer num, @Nullable Integer num2) {
        Intrinsics.checkParameterIsNotNull(str, "uid");
        this.f47917b = str;
        this.f47918c = num;
        this.f47919d = num2;
    }
}
