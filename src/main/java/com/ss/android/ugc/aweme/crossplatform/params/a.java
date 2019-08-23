package com.ss.android.ugc.aweme.crossplatform.params;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.params.base.CrossPlatformConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b=\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t¢\u0006\u0002\u0010\u0012J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010:\u001a\u00020\tHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\tHÆ\u0003J\u0001\u0010@\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0003HÖ\u0001J\t\u0010E\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0010\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001a¨\u0006F"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/params/BaseInfo;", "", "platform", "", "rawBundle", "Landroid/os/Bundle;", "url", "", "safeTemplate", "", "groupId", "enterFrom", "autoPlayAudio", "forbidJump", "fromNotification", "awemeId", "controlRequestUrl", "noHardware", "(Ljava/lang/Integer;Landroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZ)V", "getAutoPlayAudio", "()Z", "setAutoPlayAudio", "(Z)V", "getAwemeId", "()Ljava/lang/String;", "setAwemeId", "(Ljava/lang/String;)V", "getControlRequestUrl", "setControlRequestUrl", "getEnterFrom", "setEnterFrom", "getForbidJump", "setForbidJump", "getFromNotification", "setFromNotification", "getGroupId", "setGroupId", "getNoHardware", "setNoHardware", "getPlatform", "()Ljava/lang/Integer;", "setPlatform", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRawBundle", "()Landroid/os/Bundle;", "setRawBundle", "(Landroid/os/Bundle;)V", "getSafeTemplate", "setSafeTemplate", "getUrl", "setUrl", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Landroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZZ)Lcom/ss/android/ugc/aweme/crossplatform/params/BaseInfo;", "equals", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
@SuppressLint({"TooManyMethodParam"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40793a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Integer f40794b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public Bundle f40795c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public String f40796d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f40797e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public String f40798f;
    @Nullable
    public String g;
    public boolean h;
    public boolean i;
    public boolean j;
    @Nullable
    public String k;
    public boolean l;
    public boolean m;

    public a() {
        this(null, null, null, false, null, null, false, false, false, null, false, false, 4095);
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f40793a, false, 34297, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40793a, false, 34297, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.areEqual((Object) this.f40794b, (Object) aVar.f40794b) && Intrinsics.areEqual((Object) this.f40795c, (Object) aVar.f40795c) && Intrinsics.areEqual((Object) this.f40796d, (Object) aVar.f40796d)) {
                    if ((this.f40797e == aVar.f40797e) && Intrinsics.areEqual((Object) this.f40798f, (Object) aVar.f40798f) && Intrinsics.areEqual((Object) this.g, (Object) aVar.g)) {
                        if (this.h == aVar.h) {
                            if (this.i == aVar.i) {
                                if ((this.j == aVar.j) && Intrinsics.areEqual((Object) this.k, (Object) aVar.k)) {
                                    if (this.l == aVar.l) {
                                        if (this.m == aVar.m) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f40793a, false, 34296, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40793a, false, 34296, new Class[0], Integer.TYPE)).intValue();
        }
        Integer num = this.f40794b;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Bundle bundle = this.f40795c;
        int hashCode2 = (hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str = this.f40796d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f40797e;
        if (z) {
            z = true;
        }
        int i3 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.f40798f;
        int hashCode4 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.h;
        if (z2) {
            z2 = true;
        }
        int i4 = (hashCode5 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.i;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.j;
        if (z4) {
            z4 = true;
        }
        int i6 = (i5 + (z4 ? 1 : 0)) * 31;
        String str4 = this.k;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i7 = (i6 + i2) * 31;
        boolean z5 = this.l;
        if (z5) {
            z5 = true;
        }
        int i8 = (i7 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.m;
        if (z6) {
            z6 = true;
        }
        return i8 + (z6 ? 1 : 0);
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f40793a, false, 34295, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f40793a, false, 34295, new Class[0], String.class);
        }
        return "BaseInfo(platform=" + this.f40794b + ", rawBundle=" + this.f40795c + ", url=" + this.f40796d + ", safeTemplate=" + this.f40797e + ", groupId=" + this.f40798f + ", enterFrom=" + this.g + ", autoPlayAudio=" + this.h + ", forbidJump=" + this.i + ", fromNotification=" + this.j + ", awemeId=" + this.k + ", controlRequestUrl=" + this.l + ", noHardware=" + this.m + ")";
    }

    private a(@CrossPlatformConstants.Platform @Nullable Integer num, @Nullable Bundle bundle, @Nullable String str, boolean z, @Nullable String str2, @Nullable String str3, boolean z2, boolean z3, boolean z4, @Nullable String str4, boolean z5, boolean z6) {
        this.f40794b = num;
        this.f40795c = bundle;
        this.f40796d = str;
        this.f40797e = z;
        this.f40798f = str2;
        this.g = str3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = str4;
        this.l = z5;
        this.m = z6;
    }

    private /* synthetic */ a(Integer num, Bundle bundle, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, int i2) {
        this(null, null, null, false, null, null, false, false, false, null, false, false);
    }
}
