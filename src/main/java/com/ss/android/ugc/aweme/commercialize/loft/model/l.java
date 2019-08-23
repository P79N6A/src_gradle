package com.ss.android.ugc.aweme.commercialize.loft.model;

import android.arch.lifecycle.LiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/loft/model/PullGuide;", "", "imageUrl", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "guideText", "", "totalConsume", "Landroid/arch/lifecycle/LiveData;", "", "refreshLayoutHeight", "(Lcom/ss/android/ugc/aweme/base/model/UrlModel;Ljava/lang/String;Landroid/arch/lifecycle/LiveData;F)V", "getGuideText", "()Ljava/lang/String;", "getImageUrl", "()Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "getRefreshLayoutHeight", "()F", "getTotalConsume", "()Landroid/arch/lifecycle/LiveData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39275a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final UrlModel f39276b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f39277c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final LiveData<Float> f39278d;

    /* renamed from: e  reason: collision with root package name */
    public final float f39279e;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f39275a, false, 31350, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f39275a, false, 31350, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!Intrinsics.areEqual((Object) this.f39276b, (Object) lVar.f39276b) || !Intrinsics.areEqual((Object) this.f39277c, (Object) lVar.f39277c) || !Intrinsics.areEqual((Object) this.f39278d, (Object) lVar.f39278d) || Float.compare(this.f39279e, lVar.f39279e) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f39275a, false, 31349, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39275a, false, 31349, new Class[0], Integer.TYPE)).intValue();
        }
        UrlModel urlModel = this.f39276b;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.f39277c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        LiveData<Float> liveData = this.f39278d;
        if (liveData != null) {
            i = liveData.hashCode();
        }
        return ((hashCode2 + i) * 31) + Float.floatToIntBits(this.f39279e);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f39275a, false, 31348, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f39275a, false, 31348, new Class[0], String.class);
        }
        return "PullGuide(imageUrl=" + this.f39276b + ", guideText=" + this.f39277c + ", totalConsume=" + this.f39278d + ", refreshLayoutHeight=" + this.f39279e + ")";
    }

    public l(@Nullable UrlModel urlModel, @NotNull String str, @NotNull LiveData<Float> liveData, float f2) {
        Intrinsics.checkParameterIsNotNull(str, "guideText");
        Intrinsics.checkParameterIsNotNull(liveData, "totalConsume");
        this.f39276b = urlModel;
        this.f39277c = str;
        this.f39278d = liveData;
        this.f39279e = f2;
    }
}
