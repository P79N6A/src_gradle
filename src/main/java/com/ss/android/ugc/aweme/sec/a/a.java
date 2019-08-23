package com.ss.android.ugc.aweme.sec.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003JY\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0005HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/sec/captcha/CaptchaParams;", "", "language", "", "aid", "", "appName", "iid", "did", "channel", "session", "errorCode", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAid", "()I", "setAid", "(I)V", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "getChannel", "setChannel", "getDid", "setDid", "getErrorCode", "setErrorCode", "getIid", "setIid", "getLanguage", "setLanguage", "getSession", "setSession", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63731a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public String f63732b;

    /* renamed from: c  reason: collision with root package name */
    public int f63733c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public String f63734d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public String f63735e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public String f63736f;
    @NotNull
    public String g;
    @NotNull
    public String h;
    public int i;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f63731a, false, 71130, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f63731a, false, 71130, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (Intrinsics.areEqual((Object) this.f63732b, (Object) aVar.f63732b)) {
                    if ((this.f63733c == aVar.f63733c) && Intrinsics.areEqual((Object) this.f63734d, (Object) aVar.f63734d) && Intrinsics.areEqual((Object) this.f63735e, (Object) aVar.f63735e) && Intrinsics.areEqual((Object) this.f63736f, (Object) aVar.f63736f) && Intrinsics.areEqual((Object) this.g, (Object) aVar.g) && Intrinsics.areEqual((Object) this.h, (Object) aVar.h)) {
                        if (this.i == aVar.i) {
                            return true;
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
        if (PatchProxy.isSupport(new Object[0], this, f63731a, false, 71129, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f63731a, false, 71129, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f63732b;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f63733c) * 31;
        String str2 = this.f63734d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f63735e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f63736f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.h;
        if (str6 != null) {
            i2 = str6.hashCode();
        }
        return ((hashCode5 + i2) * 31) + this.i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f63731a, false, 71128, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63731a, false, 71128, new Class[0], String.class);
        }
        return "CaptchaParams(language=" + this.f63732b + ", aid=" + this.f63733c + ", appName=" + this.f63734d + ", iid=" + this.f63735e + ", did=" + this.f63736f + ", channel=" + this.g + ", session=" + this.h + ", errorCode=" + this.i + ")";
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63731a, false, 71123, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63731a, false, 71123, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f63735e = str2;
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f63731a, false, 71124, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f63731a, false, 71124, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "<set-?>");
        this.f63736f = str2;
    }

    private a(@NotNull String str, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i3) {
        Intrinsics.checkParameterIsNotNull(str, "language");
        Intrinsics.checkParameterIsNotNull(str2, "appName");
        Intrinsics.checkParameterIsNotNull(str3, "iid");
        Intrinsics.checkParameterIsNotNull(str4, "did");
        Intrinsics.checkParameterIsNotNull(str5, "channel");
        Intrinsics.checkParameterIsNotNull(str6, "session");
        this.f63732b = str;
        this.f63733c = i2;
        this.f63734d = str2;
        this.f63735e = str3;
        this.f63736f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i3;
    }

    public /* synthetic */ a(String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4) {
        this(str, i2, str2, str3, str4, str5, str6, 3058);
    }
}
