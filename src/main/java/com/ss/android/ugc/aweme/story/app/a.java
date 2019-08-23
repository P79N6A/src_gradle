package com.ss.android.ugc.aweme.story.app;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.story.api.h;
import com.ss.android.ugc.aweme.story.api.i;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u000b\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/story/app/StoryPro;", "", "()V", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "setApplication", "(Landroid/app/Application;)V", "init", "", "initServices", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71863a;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static final Lazy f71864c = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0<? extends T>) b.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    public static final C0748a f71865d = new C0748a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public Application f71866b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/story/app/StoryPro$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/story/app/StoryPro;", "instance$annotations", "getInstance", "()Lcom/ss/android/ugc/aweme/story/app/StoryPro;", "instance$delegate", "Lkotlin/Lazy;", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.story.app.a$a  reason: collision with other inner class name */
    public static final class C0748a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71867a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f71868b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(C0748a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/story/app/StoryPro;"))};

        @NotNull
        public final a a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f71867a, false, 82163, new Class[0], a.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f71867a, false, 82163, new Class[0], a.class);
            } else {
                value = a.f71864c.getValue();
            }
            return (a) value;
        }

        private C0748a() {
        }

        public /* synthetic */ C0748a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/app/StoryPro;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<a> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 82164, new Class[0], a.class)) {
                return new a();
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 82164, new Class[0], a.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/services/StoryService;", "get"}, k = 3, mv = {1, 1, 15})
    static final class c<T> implements ServiceProvider<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71869a;

        /* renamed from: b  reason: collision with root package name */
        public static final c f71870b = new c();

        c() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f71869a, false, 82165, new Class[0], com.ss.android.ugc.aweme.story.b.b.class)) {
                return new com.ss.android.ugc.aweme.story.b.b();
            }
            return (com.ss.android.ugc.aweme.story.b.b) PatchProxy.accessDispatch(new Object[0], this, f71869a, false, 82165, new Class[0], com.ss.android.ugc.aweme.story.b.b.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/story/services/StoryRingService;", "get"}, k = 3, mv = {1, 1, 15})
    static final class d<T> implements ServiceProvider<h> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71871a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f71872b = new d();

        d() {
        }

        public final /* synthetic */ Object get() {
            if (!PatchProxy.isSupport(new Object[0], this, f71871a, false, 82166, new Class[0], com.ss.android.ugc.aweme.story.b.a.class)) {
                return new com.ss.android.ugc.aweme.story.b.a();
            }
            return (com.ss.android.ugc.aweme.story.b.a) PatchProxy.accessDispatch(new Object[0], this, f71871a, false, 82166, new Class[0], com.ss.android.ugc.aweme.story.b.a.class);
        }
    }

    @NotNull
    public static final a a() {
        return PatchProxy.isSupport(new Object[0], null, f71863a, true, 82162, new Class[0], a.class) ? (a) PatchProxy.accessDispatch(new Object[0], null, f71863a, true, 82162, new Class[0], a.class) : f71865d.a();
    }
}
