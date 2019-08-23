package com.ss.android.ugc.aweme.commerce.service.models;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PromotionVisitor;", "Ljava/io/Serializable;", "avatars", "", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "count", "", "(Ljava/util/List;J)V", "getAvatars", "()Ljava/util/List;", "setAvatars", "(Ljava/util/List;)V", "getCount", "()J", "setCount", "(J)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class PromotionVisitor implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("avatar")
    @NotNull
    private List<? extends UrlModel> avatars;
    @SerializedName("count")
    private long count;

    public PromotionVisitor() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ PromotionVisitor copy$default(PromotionVisitor promotionVisitor, List<? extends UrlModel> list, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = promotionVisitor.avatars;
        }
        if ((i & 2) != 0) {
            j = promotionVisitor.count;
        }
        return promotionVisitor.copy(list, j);
    }

    @NotNull
    public final List<UrlModel> component1() {
        return this.avatars;
    }

    public final long component2() {
        return this.count;
    }

    @NotNull
    public final PromotionVisitor copy(@NotNull List<? extends UrlModel> list, long j) {
        List<? extends UrlModel> list2 = list;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{list2, new Long(j2)}, this, changeQuickRedirect, false, 29873, new Class[]{List.class, Long.TYPE}, PromotionVisitor.class)) {
            return (PromotionVisitor) PatchProxy.accessDispatch(new Object[]{list2, new Long(j2)}, this, changeQuickRedirect, false, 29873, new Class[]{List.class, Long.TYPE}, PromotionVisitor.class);
        }
        Intrinsics.checkParameterIsNotNull(list2, "avatars");
        return new PromotionVisitor(list2, j2);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 29876, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 29876, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof PromotionVisitor) {
                PromotionVisitor promotionVisitor = (PromotionVisitor) obj;
                if (Intrinsics.areEqual((Object) this.avatars, (Object) promotionVisitor.avatars)) {
                    if (this.count == promotionVisitor.count) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29875, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29875, new Class[0], Integer.TYPE)).intValue();
        }
        List<? extends UrlModel> list = this.avatars;
        if (list != null) {
            i = list.hashCode();
        }
        long j = this.count;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 29874, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 29874, new Class[0], String.class);
        }
        return "PromotionVisitor(avatars=" + this.avatars + ", count=" + this.count + ")";
    }

    @NotNull
    public final List<UrlModel> getAvatars() {
        return this.avatars;
    }

    public final long getCount() {
        return this.count;
    }

    public final void setCount(long j) {
        this.count = j;
    }

    public final void setAvatars(@NotNull List<? extends UrlModel> list) {
        List<? extends UrlModel> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, changeQuickRedirect, false, 29872, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, changeQuickRedirect, false, 29872, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "<set-?>");
        this.avatars = list2;
    }

    public PromotionVisitor(@NotNull List<? extends UrlModel> list, long j) {
        Intrinsics.checkParameterIsNotNull(list, "avatars");
        this.avatars = list;
        this.count = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PromotionVisitor(List list, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? 0 : j);
    }
}
