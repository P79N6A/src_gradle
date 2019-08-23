package com.bytedance.jedi.model.i;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0010R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/bytedance/jedi/model/util/Schedulers;", "", "()V", "CORE_POOL_SIZE", "", "getCORE_POOL_SIZE", "()I", "CORE_POOL_SIZE$delegate", "Lkotlin/Lazy;", "CPU_COUNT", "getCPU_COUNT", "CPU_COUNT$delegate", "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE", "MAXIMUM_POOL_SIZE$delegate", "defaultScheduler", "Lio/reactivex/Scheduler;", "getDefaultScheduler", "()Lio/reactivex/Scheduler;", "defaultScheduler$delegate", "sync", "model_release"}, k = 1, mv = {1, 1, 15})
public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f21733a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "CPU_COUNT", "getCPU_COUNT()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "CORE_POOL_SIZE", "getCORE_POOL_SIZE()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE()I")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(i.class), "defaultScheduler", "getDefaultScheduler()Lio/reactivex/Scheduler;"))};

    /* renamed from: b  reason: collision with root package name */
    static final Lazy f21734b = LazyKt.lazy(a.INSTANCE);

    /* renamed from: c  reason: collision with root package name */
    static final Lazy f21735c = LazyKt.lazy(c.INSTANCE);

    /* renamed from: d  reason: collision with root package name */
    public static final Lazy f21736d = LazyKt.lazy(d.INSTANCE);

    /* renamed from: e  reason: collision with root package name */
    public static final i f21737e = new i();

    /* renamed from: f  reason: collision with root package name */
    private static final Lazy f21738f = LazyKt.lazy(b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<Integer> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        public final int invoke() {
            return Math.max(2, Math.min(i.f21737e.a() - 1, 4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Integer> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        public final int invoke() {
            return Runtime.getRuntime().availableProcessors();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<Integer> {
        public static final c INSTANCE = new c();

        c() {
            super(0);
        }

        public final int invoke() {
            return (i.f21737e.a() * 2) + 1;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/Scheduler;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class d extends Lambda implements Function0<Scheduler> {
        public static final d INSTANCE = new d();

        d() {
            super(0);
        }

        @NotNull
        public final Scheduler invoke() {
            i iVar = i.f21737e;
            int intValue = ((Number) i.f21734b.getValue()).intValue();
            i iVar2 = i.f21737e;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(intValue, ((Number) i.f21735c.getValue()).intValue(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            return Schedulers.from(threadPoolExecutor);
        }
    }

    public final int a() {
        return ((Number) f21738f.getValue()).intValue();
    }

    private i() {
    }
}
