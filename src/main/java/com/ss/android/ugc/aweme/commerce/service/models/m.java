package com.ss.android.ugc.aweme.commerce.service.models;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\b\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010*\u001a\u00020\u000b2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/models/PortfolioParams;", "", "activity", "Landroid/app/Activity;", "verifyStatus", "", "user", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "referFrom", "", "isManager", "", "triggerAwemeId", "(Landroid/app/Activity;ILcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;Ljava/lang/String;ZLjava/lang/String;)V", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "()Z", "setManager", "(Z)V", "getReferFrom", "()Ljava/lang/String;", "setReferFrom", "(Ljava/lang/String;)V", "getTriggerAwemeId", "setTriggerAwemeId", "getUser", "()Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "setUser", "(Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;)V", "getVerifyStatus", "()I", "setVerifyStatus", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38213a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Activity f38214b;

    /* renamed from: c  reason: collision with root package name */
    public int f38215c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public CommerceUser f38216d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f38217e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f38218f;
    @Nullable
    public String g;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f38213a, false, 29846, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f38213a, false, 29846, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (Intrinsics.areEqual((Object) this.f38214b, (Object) mVar.f38214b)) {
                    if ((this.f38215c == mVar.f38215c) && Intrinsics.areEqual((Object) this.f38216d, (Object) mVar.f38216d) && Intrinsics.areEqual((Object) this.f38217e, (Object) mVar.f38217e)) {
                        if (!(this.f38218f == mVar.f38218f) || !Intrinsics.areEqual((Object) this.g, (Object) mVar.g)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f38213a, false, 29845, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38213a, false, 29845, new Class[0], Integer.TYPE)).intValue();
        }
        Activity activity = this.f38214b;
        int hashCode = (((activity != null ? activity.hashCode() : 0) * 31) + this.f38215c) * 31;
        CommerceUser commerceUser = this.f38216d;
        int hashCode2 = (hashCode + (commerceUser != null ? commerceUser.hashCode() : 0)) * 31;
        String str = this.f38217e;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f38218f;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.g;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f38213a, false, 29844, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f38213a, false, 29844, new Class[0], String.class);
        }
        return "PortfolioParams(activity=" + this.f38214b + ", verifyStatus=" + this.f38215c + ", user=" + this.f38216d + ", referFrom=" + this.f38217e + ", isManager=" + this.f38218f + ", triggerAwemeId=" + this.g + ")";
    }

    public m(@Nullable Activity activity, int i, @Nullable CommerceUser commerceUser, @NotNull String str, boolean z, @Nullable String str2) {
        Intrinsics.checkParameterIsNotNull(str, "referFrom");
        this.f38214b = activity;
        this.f38215c = i;
        this.f38216d = commerceUser;
        this.f38217e = str;
        this.f38218f = z;
        this.g = str2;
    }
}
