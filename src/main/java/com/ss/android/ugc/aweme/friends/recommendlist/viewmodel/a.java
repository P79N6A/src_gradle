package com.ss.android.ugc.aweme.friends.recommendlist.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/viewmodel/Header;", "", "type", "", "data", "", "Lcom/ss/android/ugc/aweme/friends/recommendlist/adapter/HeaderIconState;", "(ILjava/util/List;)V", "getData", "()Ljava/util/List;", "getType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49052a;

    /* renamed from: b  reason: collision with root package name */
    public final int f49053b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.friends.recommendlist.adapter.a> f49054c;

    public a() {
        this(0, null, 3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f49052a, false, 46797, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f49052a, false, 46797, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!(this.f49053b == aVar.f49053b) || !Intrinsics.areEqual((Object) this.f49054c, (Object) aVar.f49054c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f49052a, false, 46796, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49052a, false, 46796, new Class[0], Integer.TYPE)).intValue();
        }
        int i2 = this.f49053b * 31;
        List<com.ss.android.ugc.aweme.friends.recommendlist.adapter.a> list = this.f49054c;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f49052a, false, 46795, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f49052a, false, 46795, new Class[0], String.class);
        }
        return "Header(type=" + this.f49053b + ", data=" + this.f49054c + ")";
    }

    public a(int i, @NotNull List<com.ss.android.ugc.aweme.friends.recommendlist.adapter.a> list) {
        Intrinsics.checkParameterIsNotNull(list, "data");
        this.f49053b = i;
        this.f49054c = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, List list, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
