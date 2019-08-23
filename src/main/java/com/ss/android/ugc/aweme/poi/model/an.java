package com.ss.android.ugc.aweme.poi.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010H\u0016¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\u000e\u0010\u0019\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eJ\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/model/PoiQRDetailStruct;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "Ljava/io/Serializable;", "activity", "Lcom/ss/android/ugc/aweme/poi/model/PoiCouponActivityStruct;", "challenge", "Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "(Lcom/ss/android/ugc/aweme/poi/model/PoiCouponActivityStruct;Lcom/ss/android/ugc/aweme/discover/model/Challenge;)V", "getActivity", "()Lcom/ss/android/ugc/aweme/poi/model/PoiCouponActivityStruct;", "getChallenge", "()Lcom/ss/android/ugc/aweme/discover/model/Challenge;", "poiActivityException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "checkValid", "T", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "", "getException", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class an extends BaseResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("coupon_activity")
    @Nullable
    private final t activity;
    @SerializedName("challenge")
    @Nullable
    private final Challenge challenge;
    private Exception poiActivityException;

    public static /* synthetic */ an copy$default(an anVar, t tVar, Challenge challenge2, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = anVar.activity;
        }
        if ((i & 2) != 0) {
            challenge2 = anVar.challenge;
        }
        return anVar.copy(tVar, challenge2);
    }

    @Nullable
    public final t component1() {
        return this.activity;
    }

    @Nullable
    public final Challenge component2() {
        return this.challenge;
    }

    @NotNull
    public final an copy(@Nullable t tVar, @Nullable Challenge challenge2) {
        t tVar2 = tVar;
        Challenge challenge3 = challenge2;
        if (!PatchProxy.isSupport(new Object[]{tVar2, challenge3}, this, changeQuickRedirect, false, 65140, new Class[]{t.class, Challenge.class}, an.class)) {
            return new an(tVar2, challenge3);
        }
        return (an) PatchProxy.accessDispatch(new Object[]{tVar2, challenge3}, this, changeQuickRedirect, false, 65140, new Class[]{t.class, Challenge.class}, an.class);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 65143, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 65143, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof an) {
                an anVar = (an) obj;
                if (!Intrinsics.areEqual((Object) this.activity, (Object) anVar.activity) || !Intrinsics.areEqual((Object) this.challenge, (Object) anVar.challenge)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65142, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65142, new Class[0], Integer.TYPE)).intValue();
        }
        t tVar = this.activity;
        int hashCode = (tVar != null ? tVar.hashCode() : 0) * 31;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            i = challenge2.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65141, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65141, new Class[0], String.class);
        }
        return "PoiQRDetailStruct(activity=" + this.activity + ", challenge=" + this.challenge + ")";
    }

    @Nullable
    public final t getActivity() {
        return this.activity;
    }

    @Nullable
    public final Challenge getChallenge() {
        return this.challenge;
    }

    @Nullable
    public final Exception getException() {
        return this.poiActivityException;
    }

    public final <T> T checkValid() throws Throwable {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 65139, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 65139, new Class[0], Object.class);
        }
        try {
            super.checkValid();
        } catch (Exception e2) {
            this.poiActivityException = e2;
        }
        return this;
    }

    public an(@Nullable t tVar, @Nullable Challenge challenge2) {
        this.activity = tVar;
        this.challenge = challenge2;
    }
}
