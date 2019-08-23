package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/AdCardLogParams;", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "label", "", "refer", "showFailReason", "(Lcom/ss/android/ugc/aweme/feed/model/Aweme;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAweme", "()Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "getLabel", "()Ljava/lang/String;", "getRefer", "getShowFailReason", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Builder", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39746a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Aweme f39747b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final String f39748c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final String f39749d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public final String f39750e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/utils/AdCardLogParams$Builder;", "", "()V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "label", "", "refer", "showFailReason", "build", "Lcom/ss/android/ugc/aweme/commercialize/utils/AdCardLogParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39751a;

        /* renamed from: b  reason: collision with root package name */
        public Aweme f39752b;

        /* renamed from: c  reason: collision with root package name */
        public String f39753c = "";

        /* renamed from: d  reason: collision with root package name */
        public String f39754d = "";

        /* renamed from: e  reason: collision with root package name */
        public String f39755e = "";

        @NotNull
        public final a a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f39751a, false, 32215, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str2}, this, f39751a, false, 32215, new Class[]{String.class}, a.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "label");
            a aVar = this;
            aVar.f39753c = str2;
            return aVar;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f39746a, false, 32213, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f39746a, false, 32213, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!Intrinsics.areEqual((Object) this.f39747b, (Object) bVar.f39747b) || !Intrinsics.areEqual((Object) this.f39748c, (Object) bVar.f39748c) || !Intrinsics.areEqual((Object) this.f39749d, (Object) bVar.f39749d) || !Intrinsics.areEqual((Object) this.f39750e, (Object) bVar.f39750e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f39746a, false, 32212, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39746a, false, 32212, new Class[0], Integer.TYPE)).intValue();
        }
        Aweme aweme = this.f39747b;
        int hashCode = (aweme != null ? aweme.hashCode() : 0) * 31;
        String str = this.f39748c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f39749d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f39750e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f39746a, false, 32210, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f39746a, false, 32210, new Class[0], String.class);
        }
        return "label = " + this.f39748c + ", refer = " + this.f39749d + ", showFailReason = " + this.f39750e + ", aweme=[" + String.valueOf(this.f39747b) + ']';
    }

    private b(Aweme aweme, String str, String str2, String str3) {
        this.f39747b = aweme;
        this.f39748c = str;
        this.f39749d = str2;
        this.f39750e = str3;
    }

    public /* synthetic */ b(Aweme aweme, String str, String str2, String str3, byte b2) {
        this(aweme, str, str2, str3);
    }
}
