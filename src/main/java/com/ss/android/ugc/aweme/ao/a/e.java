package com.ss.android.ugc.aweme.ao.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "", "isCancelCurrentMusic", "", "musicOrigin", "", "music", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "musicLocalPath", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMusic", "()Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "getMusicLocalPath", "()Ljava/lang/String;", "getMusicOrigin", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "equals", "other", "hashCode", "", "toString", "Companion", "tools.service_release"}, k = 1, mv = {1, 1, 15})
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33631a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f33632f = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f33633b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f33634c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.e f33635d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f33636e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean$Companion;", "", "()V", "of", "Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "isCancelCurrentMusic", "", "musicOrigin", "", "music", "Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;", "musicLocalPath", "(Ljava/lang/Boolean;Ljava/lang/String;Lcom/ss/android/ugc/aweme/shortvideo/AVMusic;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/toolsport/model/ChooseMusicResultBean;", "tools.service_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33637a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final e a(@Nullable Boolean bool, @Nullable String str, @Nullable com.ss.android.ugc.aweme.shortvideo.e eVar, @Nullable String str2) {
            Boolean bool2 = bool;
            String str3 = str;
            com.ss.android.ugc.aweme.shortvideo.e eVar2 = eVar;
            String str4 = str2;
            if (!PatchProxy.isSupport(new Object[]{bool2, str3, eVar2, str4}, this, f33637a, false, 87279, new Class[]{Boolean.class, String.class, com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, e.class)) {
                return new e(bool2, str3, eVar2, str4);
            }
            Object[] objArr = {bool2, str3, eVar2, str4};
            return (e) PatchProxy.accessDispatch(objArr, this, f33637a, false, 87279, new Class[]{Boolean.class, String.class, com.ss.android.ugc.aweme.shortvideo.e.class, String.class}, e.class);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f33631a, false, 87278, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f33631a, false, 87278, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!Intrinsics.areEqual((Object) this.f33633b, (Object) eVar.f33633b) || !Intrinsics.areEqual((Object) this.f33634c, (Object) eVar.f33634c) || !Intrinsics.areEqual((Object) this.f33635d, (Object) eVar.f33635d) || !Intrinsics.areEqual((Object) this.f33636e, (Object) eVar.f33636e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f33631a, false, 87277, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33631a, false, 87277, new Class[0], Integer.TYPE)).intValue();
        }
        Boolean bool = this.f33633b;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        String str = this.f33634c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        com.ss.android.ugc.aweme.shortvideo.e eVar = this.f33635d;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str2 = this.f33636e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f33631a, false, 87276, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f33631a, false, 87276, new Class[0], String.class);
        }
        return "ChooseMusicResultBean(isCancelCurrentMusic=" + this.f33633b + ", musicOrigin=" + this.f33634c + ", music=" + this.f33635d + ", musicLocalPath=" + this.f33636e + ")";
    }

    public e(@Nullable Boolean bool, @Nullable String str, @Nullable com.ss.android.ugc.aweme.shortvideo.e eVar, @Nullable String str2) {
        this.f33633b = bool;
        this.f33634c = str;
        this.f33635d = eVar;
        this.f33636e = str2;
    }
}
