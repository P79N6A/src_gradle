package com.ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.port.in.r;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J \u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/RawAdLogUtils;", "", "()V", "TAG", "", "effectData", "Lcom/ss/android/ugc/aweme/utils/RawAdLogUtils$EffectData;", "checkBusiStickerValid", "", "effect", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "finishUseEffect", "", "logBusiStickerClick", "logBusiStickerShow", "startUseEffect", "creationId", "shootWay", "propId", "EffectData", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class de {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75735a;

    /* renamed from: b  reason: collision with root package name */
    public static final de f75736b = new de();

    /* renamed from: c  reason: collision with root package name */
    private static a f75737c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/utils/RawAdLogUtils$EffectData;", "", "creationId", "", "shootWay", "propId", "startUseTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getCreationId", "()Ljava/lang/String;", "getPropId", "getShootWay", "getStartUseTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75738a;
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public final String f75739b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public final String f75740c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        public final String f75741d;

        /* renamed from: e  reason: collision with root package name */
        public final long f75742e;

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f75738a, false, 88504, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f75738a, false, 88504, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (Intrinsics.areEqual((Object) this.f75739b, (Object) aVar.f75739b) && Intrinsics.areEqual((Object) this.f75740c, (Object) aVar.f75740c) && Intrinsics.areEqual((Object) this.f75741d, (Object) aVar.f75741d)) {
                        if (this.f75742e == aVar.f75742e) {
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
            if (PatchProxy.isSupport(new Object[0], this, f75738a, false, 88503, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f75738a, false, 88503, new Class[0], Integer.TYPE)).intValue();
            }
            String str = this.f75739b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f75740c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f75741d;
            if (str3 != null) {
                i = str3.hashCode();
            }
            long j = this.f75742e;
            return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f75738a, false, 88502, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f75738a, false, 88502, new Class[0], String.class);
            }
            return "EffectData(creationId=" + this.f75739b + ", shootWay=" + this.f75740c + ", propId=" + this.f75741d + ", startUseTime=" + this.f75742e + ")";
        }

        public a(@NotNull String str, @NotNull String str2, @NotNull String str3, long j) {
            Intrinsics.checkParameterIsNotNull(str, "creationId");
            Intrinsics.checkParameterIsNotNull(str2, "shootWay");
            Intrinsics.checkParameterIsNotNull(str3, "propId");
            this.f75739b = str;
            this.f75740c = str2;
            this.f75741d = str3;
            this.f75742e = j;
        }
    }

    private de() {
    }

    @JvmStatic
    public static final void a() {
        Long l;
        String str;
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[0], null, f75735a, true, 88497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75735a, true, 88497, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a() && f75737c != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a aVar = f75737c;
            if (aVar != null) {
                l = Long.valueOf(aVar.f75742e);
            } else {
                l = null;
            }
            if (l == null) {
                Intrinsics.throwNpe();
            }
            long longValue = elapsedRealtime - l.longValue();
            a aVar2 = a.f75468b;
            d a2 = d.a();
            a aVar3 = f75737c;
            if (aVar3 != null) {
                str = aVar3.f75739b;
            } else {
                str = null;
            }
            d a3 = a2.a("creation_id", str);
            a aVar4 = f75737c;
            if (aVar4 != null) {
                str2 = aVar4.f75740c;
            } else {
                str2 = null;
            }
            d a4 = a3.a("shoot_way", str2).a("enter_from", "video_shoot_page");
            a aVar5 = f75737c;
            if (aVar5 != null) {
                str3 = aVar5.f75741d;
            } else {
                str3 = null;
            }
            aVar2.a("prop_click_time", a4.a("prop_id", str3).a("duration", longValue).f34114b);
            f75737c = null;
        }
    }

    @JvmStatic
    public static final void a(@Nullable Effect effect) {
        String str;
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, null, f75735a, true, 88499, new Class[]{Effect.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{effect2}, null, f75735a, true, 88499, new Class[]{Effect.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a() && f75736b.b(effect2)) {
            r rVar = com.ss.android.ugc.aweme.port.in.a.n;
            if (effect2 != null) {
                str = effect2.ad_raw_data;
            } else {
                str = null;
            }
            rVar.a("camera_ad", "show", "sticker", str, null);
        }
    }

    public final boolean b(Effect effect) {
        Effect effect2 = effect;
        if (PatchProxy.isSupport(new Object[]{effect2}, this, f75735a, false, 88500, new Class[]{Effect.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{effect2}, this, f75735a, false, 88500, new Class[]{Effect.class}, Boolean.TYPE)).booleanValue();
        } else if (effect2 != null && !TextUtils.isEmpty(effect2.ad_raw_data)) {
            return true;
        } else {
            return false;
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, null, f75735a, true, 88496, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, null, f75735a, true, 88496, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str4, "creationId");
        Intrinsics.checkParameterIsNotNull(str5, "shootWay");
        Intrinsics.checkParameterIsNotNull(str6, "propId");
        if (com.ss.android.g.a.a()) {
            a aVar = new a(str, str2, str3, SystemClock.elapsedRealtime());
            f75737c = aVar;
        }
    }
}
