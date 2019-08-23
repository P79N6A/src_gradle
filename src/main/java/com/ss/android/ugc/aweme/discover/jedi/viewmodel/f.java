package com.ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;", "", "keyword", "", "refreshType", "", "searchSource", "hotSearch", "correctType", "searchId", "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V", "getCorrectType", "()I", "getHotSearch", "getKeyword", "()Ljava/lang/String;", "getRefreshType", "getSearchId", "setSearchId", "(Ljava/lang/String;)V", "getSearchSource", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42534a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f42535b;

    /* renamed from: c  reason: collision with root package name */
    public final int f42536c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final String f42537d;

    /* renamed from: e  reason: collision with root package name */
    public final int f42538e;

    /* renamed from: f  reason: collision with root package name */
    public final int f42539f;
    @Nullable
    public String g;

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f42534a, false, 36772, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f42534a, false, 36772, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (Intrinsics.areEqual((Object) this.f42535b, (Object) fVar.f42535b)) {
                    if ((this.f42536c == fVar.f42536c) && Intrinsics.areEqual((Object) this.f42537d, (Object) fVar.f42537d)) {
                        if (this.f42538e == fVar.f42538e) {
                            if (!(this.f42539f == fVar.f42539f) || !Intrinsics.areEqual((Object) this.g, (Object) fVar.g)) {
                                return false;
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
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42534a, false, 36771, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42534a, false, 36771, new Class[0], Integer.TYPE)).intValue();
        }
        String str = this.f42535b;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f42536c) * 31;
        String str2 = this.f42537d;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f42538e) * 31) + this.f42539f) * 31;
        String str3 = this.g;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f42534a, false, 36770, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f42534a, false, 36770, new Class[0], String.class);
        }
        return "SearchRequestParam(keyword=" + this.f42535b + ", refreshType=" + this.f42536c + ", searchSource=" + this.f42537d + ", hotSearch=" + this.f42538e + ", correctType=" + this.f42539f + ", searchId=" + this.g + ")";
    }

    private f(@NotNull String str, int i, @Nullable String str2, int i2, int i3, @Nullable String str3) {
        Intrinsics.checkParameterIsNotNull(str, "keyword");
        this.f42535b = str;
        this.f42536c = i;
        this.f42537d = str2;
        this.f42538e = i2;
        this.f42539f = i3;
        this.g = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ f(java.lang.String r9, int r10, java.lang.String r11, int r12, int r13, java.lang.String r14, int r15) {
        /*
            r8 = this;
            r14 = r15 & 2
            r0 = 0
            if (r14 == 0) goto L_0x0007
            r3 = 0
            goto L_0x0008
        L_0x0007:
            r3 = r10
        L_0x0008:
            r10 = r15 & 4
            if (r10 == 0) goto L_0x000d
            r11 = 0
        L_0x000d:
            r4 = r11
            r10 = r15 & 8
            if (r10 == 0) goto L_0x0014
            r5 = 0
            goto L_0x0015
        L_0x0014:
            r5 = r12
        L_0x0015:
            r10 = r15 & 16
            if (r10 == 0) goto L_0x001b
            r6 = 0
            goto L_0x001c
        L_0x001b:
            r6 = r13
        L_0x001c:
            r7 = 0
            r1 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.jedi.viewmodel.f.<init>(java.lang.String, int, java.lang.String, int, int, java.lang.String, int):void");
    }
}
