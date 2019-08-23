package com.bytedance.jedi.arch;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u001c\u001a\u00020\u001d2L\u0010\u001e\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\tj\b\u0012\u0004\u0012\u00020\u000b`\u0011J\u0018\u0010\u001f\u001a\u00020\u001d2\u0010\u0010\u001e\u001a\f\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007RW\u0010\b\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\tj\b\u0012\u0004\u0012\u00020\u000b`\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013RT\u0010\u0014\u001aH\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\tj\b\u0012\u0004\u0012\u00020\u000b`\u0011X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\f\u0012\u0004\u0012\u00020\u00170\u0016j\u0002`\u0018X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/jedi/arch/JediArchPlugins;", "", "()V", "isLoggable", "", "()Z", "setLoggable", "(Z)V", "storeFactory", "Lkotlin/Function2;", "Lcom/bytedance/jedi/arch/JediViewModel;", "Lcom/bytedance/jedi/arch/State;", "Lkotlin/ParameterName;", "name", "vm", "state", "Lcom/bytedance/jedi/arch/Store;", "Lcom/bytedance/jedi/arch/StoreFactory;", "getStoreFactory", "()Lkotlin/jvm/functions/Function2;", "storeFactoryInternal", "storeSchedulerFactory", "Lkotlin/Function0;", "Lio/reactivex/Scheduler;", "Lcom/bytedance/jedi/arch/SchedulerFactory;", "getStoreSchedulerFactory", "()Lkotlin/jvm/functions/Function0;", "storeSchedulerInternal", "setGlobalStoreFactory", "", "factory", "setGlobalStoreSchedulerFactory", "arch_release"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    static Function2<? super JediViewModel<x>, ? super x, ? extends y<x>> f21389a = a.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    static Function0<? extends Scheduler> f21390b = b.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    public static final g f21391c = new g();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lcom/bytedance/jedi/arch/RxStore;", "Lcom/bytedance/jedi/arch/State;", "<anonymous parameter 0>", "Lcom/bytedance/jedi/arch/JediViewModel;", "state", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<JediViewModel<x>, x, s<x>> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @NotNull
        public final s<x> invoke(@NotNull JediViewModel<x> jediViewModel, @NotNull x xVar) {
            Intrinsics.checkParameterIsNotNull(jediViewModel, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(xVar, "state");
            return new s<>(xVar, (Scheduler) g.f21390b.invoke());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/Scheduler;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Scheduler> {
        public static final b INSTANCE = new b();

        b() {
            super(0);
        }

        @NotNull
        public final Scheduler invoke() {
            Scheduler from = Schedulers.from(new u());
            Intrinsics.checkExpressionValueIsNotNull(from, "Schedulers.from(SerialExecutor())");
            return from;
        }
    }

    private g() {
    }
}
