package com.ss.android.ugc.aweme.account.g;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/interfaces/TwoStepAuthResponse;", "", "successTicket", "", "profileKey", "errorCode", "", "errorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorMessage", "()Ljava/lang/String;", "getProfileKey", "getSuccessTicket", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/account/interfaces/TwoStepAuthResponse;", "equals", "", "other", "hashCode", "toString", "accountapi_release"}, k = 1, mv = {1, 1, 13})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31966a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f31967b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f31968c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Integer f31969d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f31970e;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f31966a, false, 20019, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f31966a, false, 20019, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!Intrinsics.areEqual((Object) this.f31967b, (Object) cVar.f31967b) || !Intrinsics.areEqual((Object) this.f31968c, (Object) cVar.f31968c) || !Intrinsics.areEqual((Object) this.f31969d, (Object) cVar.f31969d) || !Intrinsics.areEqual((Object) this.f31970e, (Object) cVar.f31970e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f31966a, false, 20018, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f31966a, false, 20018, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f31967b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f31968c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.f31969d;
        int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.f31970e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f31966a, false, 20017, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f31966a, false, 20017, new Class[0], String.class);
        }
        return "TwoStepAuthResponse(successTicket=" + this.f31967b + ", profileKey=" + this.f31968c + ", errorCode=" + this.f31969d + ", errorMessage=" + this.f31970e + ")";
    }

    public c(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3) {
        this.f31967b = str;
        this.f31968c = str2;
        this.f31969d = num;
        this.f31970e = str3;
    }
}
