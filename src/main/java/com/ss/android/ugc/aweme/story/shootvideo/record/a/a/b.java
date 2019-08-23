package com.ss.android.ugc.aweme.story.shootvideo.record.a.a;

import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.property.e;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004J\u0014\u0010\u001b\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ*\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0016\u0010!\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0019R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\f8BX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00108BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0013\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0016\u0010\u000e¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectDataCenter;", "", "()V", "SP_FILE_NAME", "", "cacheSp", "Landroid/content/SharedPreferences;", "getCacheSp", "()Landroid/content/SharedPreferences;", "cacheSp$delegate", "Lkotlin/Lazy;", "effectCacheStrategy", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;", "getEffectCacheStrategy", "()Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;", "isSpringEffectCacheControllerEnable", "", "()Z", "normalCacheStrategyImpl", "getNormalCacheStrategyImpl", "normalCacheStrategyImpl$delegate", "springCacheStrategyImpl", "getSpringCacheStrategyImpl", "springCacheStrategyImpl$delegate", "getCacheUpdateTimestamp", "", "key", "requestDataOnAppStart", "onRequestNetWork", "Lkotlin/Function0;", "", "requestDataOnRecord", "onRequestCache", "updateCacheTimestamp", "timestamp", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73854a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f73855b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "springCacheStrategyImpl", "getSpringCacheStrategyImpl()Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "normalCacheStrategyImpl", "getNormalCacheStrategyImpl()Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/EffectCacheStrategy;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "cacheSp", "getCacheSp()Landroid/content/SharedPreferences;"))};

    /* renamed from: c  reason: collision with root package name */
    public static final b f73856c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f73857d = true;

    /* renamed from: e  reason: collision with root package name */
    private static final Lazy f73858e = LazyKt.lazy(c.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f73859f = LazyKt.lazy(C0766b.INSTANCE);
    private static final Lazy g = LazyKt.lazy(a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<SharedPreferences> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final SharedPreferences invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85907, new Class[0], SharedPreferences.class)) {
                return com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "effect_cache_settings", 0);
            }
            return (SharedPreferences) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85907, new Class[0], SharedPreferences.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/NormalCacheStrategyImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.record.a.a.b$b  reason: collision with other inner class name */
    static final class C0766b extends Lambda implements Function0<c> {
        public static final C0766b INSTANCE = new C0766b();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0766b() {
            super(0);
        }

        @NotNull
        public final c invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85908, new Class[0], c.class)) {
                return new c();
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85908, new Class[0], c.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/shootvideo/record/festival/effect/SpringCacheStrategyImpl;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<d> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        @NotNull
        public final d invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 85909, new Class[0], d.class)) {
                return new d();
            }
            return (d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 85909, new Class[0], d.class);
        }
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f73854a, false, 85902, new Class[0], SharedPreferences.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f73854a, false, 85902, new Class[0], SharedPreferences.class);
        } else {
            value = g.getValue();
        }
        return (SharedPreferences) value;
    }

    private b() {
    }

    private final a b() {
        boolean z;
        a aVar;
        if (PatchProxy.isSupport(new Object[0], this, f73854a, false, 85901, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f73854a, false, 85901, new Class[0], a.class);
        }
        if (PatchProxy.isSupport(new Object[0], this, f73854a, false, 85898, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73854a, false, 85898, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            z = com.ss.android.ugc.aweme.port.in.a.L.a(e.a.SpringEffectCacheController);
        }
        if (z) {
            if (!PatchProxy.isSupport(new Object[0], this, f73854a, false, 85899, new Class[0], a.class)) {
                return (a) f73858e.getValue();
            }
            aVar = (a) PatchProxy.accessDispatch(new Object[0], this, f73854a, false, 85899, new Class[0], a.class);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f73854a, false, 85900, new Class[0], a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[0], this, f73854a, false, 85900, new Class[0], a.class);
            }
            aVar = (a) f73859f.getValue();
        }
        return aVar;
    }

    public final boolean a(@NotNull Function0<Unit> function0) {
        Function0<Unit> function02 = function0;
        if (PatchProxy.isSupport(new Object[]{function02}, this, f73854a, false, 85903, new Class[]{Function0.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{function02}, this, f73854a, false, 85903, new Class[]{Function0.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(function02, "onRequestNetWork");
        if (!b().a()) {
            return false;
        }
        function0.invoke();
        return true;
    }

    public final void a(@NotNull String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f73854a, false, 85905, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f73854a, false, 85905, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "key");
        a().edit().putLong(str2, j2).apply();
    }

    public final boolean a(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        String str2 = str;
        Function0<Unit> function03 = function0;
        Function0<Unit> function04 = function02;
        if (PatchProxy.isSupport(new Object[]{str2, function03, function04}, this, f73854a, false, 85904, new Class[]{String.class, Function0.class, Function0.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, function03, function04}, this, f73854a, false, 85904, new Class[]{String.class, Function0.class, Function0.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "key");
        Intrinsics.checkParameterIsNotNull(function03, "onRequestNetWork");
        Intrinsics.checkParameterIsNotNull(function04, "onRequestCache");
        if (!b().a(str2)) {
            function02.invoke();
            return false;
        }
        function0.invoke();
        return true;
    }
}
