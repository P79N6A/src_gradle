package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.ext.list.differ.e;
import com.bytedance.jedi.arch.ext.list.k;
import com.bytedance.jedi.arch.x;
import com.bytedance.jedi.codegen.anno.OutService;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.aa;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u0003*\b\b\u0002\u0010\u0004*\u00020\u00052\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00070\u00062\u00020\bBÕ\u0001\u0012,\u0010\t\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b0\n\u00120\b\u0002\u0010\u000e\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b\u0018\u00010\n\u00126\b\u0002\u0010\u000f\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011\u00126\b\u0002\u0010\u0012\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011¢\u0006\u0002\u0010\u0013J6\u0010\u0017\u001a\u00020\u00182,\u0010\u000e\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b0\nH\u0002J\u001a\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J6\u0010\u001e\u001a\u00020\u00182,\u0010\t\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b0\nH\u0002J\u001b\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00028\u0001¢\u0006\u0002\u0010\"J\u001c\u0010#\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\rJ\b\u0010$\u001a\u00020\u0018H\u0007J4\u0010%\u001a\u00020\u00182,\u0010%\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b0\nJ4\u0010&\u001a\u00020\u00182,\u0010&\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b0\nJ\u001b\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00028\u0001¢\u0006\u0002\u0010\"J/\u0010(\u001a\u00020\u00182'\u0010)\u001a#\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0010J'\u0010-\u001a\u00020\u00182\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020/0\n2\u0006\u0010!\u001a\u00028\u0001¢\u0006\u0002\u00100J \u00101\u001a\u00020\u00182\u0018\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00010\f0\rJ\b\u00103\u001a\u00020\u0018H\u0007J\u000e\u00104\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001bJ\u001a\u00105\u001a\u00020\u00182\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020/0\nJ\u001a\u00106\u001a\u00020\u00182\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020/0\nJ\u0016\u00107\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u001bJ\u0001\u00109\u001a\u00020\u00182\u001c\b\u0002\u0010:\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020=\u0018\u00010<2\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0018\u00010\n2\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0018\u00010\nJ¼\u0001\u00109\u001a\u00020\u0018\"\b\b\u0003\u0010A*\u00020B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HA0D2\u0010\b\u0002\u0010E\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010F2\b\b\u0002\u0010G\u001a\u00020/2\b\b\u0002\u0010H\u001a\u00020/2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002HA\u0018\u00010<2\u0016\b\u0002\u0010>\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002HA\u0018\u00010<2!\b\u0002\u0010?\u001a\u001b\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010¢\u0006\u0002\bI2!\b\u0002\u0010@\u001a\u001b\u0012\u0004\u0012\u0002HA\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010¢\u0006\u0002\bIH\u0007J\u0010\u0010J\u001a\u00020\u00182\u0006\u0010K\u001a\u00020\u001bH\u0016J\u0014\u0010L\u001a\u00020\u00182\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00010\rR6\u0010\u000e\u001a*\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R4\u0010\t\u001a(\u0012\u0004\u0012\u00028\u0000\u0012\u001e\u0012\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\u0006\u0012\u0004\u0018\u00018\u00020\f0\u000b0\nX\u0004¢\u0006\u0002\n\u0000R<\u0010\u0012\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00160\u0015X\u0004¢\u0006\u0002\n\u0000R<\u0010\u000f\u001a0\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006N"}, d2 = {"Lcom/bytedance/jedi/arch/ext/list/ListMiddleware;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "Lcom/bytedance/jedi/arch/Middleware;", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "Lcom/bytedance/jedi/arch/ext/list/differ/JediListPrefetcher$Fetcher;", "actualRefresh", "Lkotlin/Function1;", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "", "actualLoadMore", "refreshStrategy", "Lkotlin/Function2;", "Lcom/bytedance/jedi/arch/ext/list/LoadStrategy;", "loadMoreStrategy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "prefetcher", "Lkotlin/Lazy;", "com/bytedance/jedi/arch/ext/list/ListMiddleware$prefetcher$1$1", "doLoadMore", "", "doOnLoadNextResult", "loadedSize", "", "error", "", "doRefresh", "insert", "position", "data", "(ILjava/lang/Object;)V", "insertMultiple", "loadMore", "manualLoadMore", "manualRefresh", "modify", "modifyAll", "mapper", "Lkotlin/ParameterName;", "name", "index", "modifyFirst", "predicate", "", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "modifyMultiple", "pairs", "refresh", "remove", "removeAll", "removeFirst", "removeMultiple", "count", "subscribe", "onData", "refreshListener", "Lcom/bytedance/jedi/arch/ext/list/ListListener;", "Lcom/bytedance/jedi/arch/ext/list/EmptyReceiver;", "loadMoreListener", "onHasMore", "onEmpty", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "subscriber", "Lcom/bytedance/jedi/arch/ISubscriber;", "adapter", "Lcom/bytedance/jedi/arch/ext/list/DiffableAdapter;", "force", "uniqueOnly", "Lkotlin/ExtensionFunctionType;", "tryPrefetch", "indexToPrefetch", "updateList", "newList", "ext_list_release"}, k = 1, mv = {1, 1, 15})
public final class ListMiddleware<S extends x, T, P extends k> extends com.bytedance.jedi.arch.m<S, ListState<T, P>> implements e.b {

    /* renamed from: e  reason: collision with root package name */
    public final Function2<List<? extends T>, List<? extends T>, List<T>> f21348e;

    /* renamed from: f  reason: collision with root package name */
    public final Function2<List<? extends T>, List<? extends T>, List<T>> f21349f;
    private final Lazy<c.AnonymousClass1> g;
    private final Function1<S, Observable<Pair<List<T>, P>>> h;
    private final Function1<S, Observable<Pair<List<T>, P>>> i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "state", "substate", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "invoke", "(Lcom/bytedance/jedi/arch/State;Lcom/bytedance/jedi/arch/ext/list/ListState;)V"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function2<S, ListState<T, P>, Unit> {
        final /* synthetic */ Function1 $actualLoadMore;
        final /* synthetic */ ListMiddleware this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ListMiddleware listMiddleware, Function1 function1) {
            super(2);
            this.this$0 = listMiddleware;
            this.$actualLoadMore = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((S) (x) obj, (ListState) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull S s, @NotNull final ListState<T, P> listState) {
            Intrinsics.checkParameterIsNotNull(s, "state");
            Intrinsics.checkParameterIsNotNull(listState, "substate");
            if (i.a(listState).f21351a && !(listState.getLoadMore() instanceof com.bytedance.jedi.arch.l)) {
                this.this$0.a((Observable) this.$actualLoadMore.invoke(s), (Function2<? super PROP, ? super com.bytedance.jedi.arch.a<? extends T>, ? extends PROP>) new Function2<ListState<T, P>, com.bytedance.jedi.arch.a<? extends Pair<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {
                    final /* synthetic */ a this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0057, code lost:
                        if (r2 == null) goto L_0x0059;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0074, code lost:
                        if (r2 == null) goto L_0x0076;
                     */
                    @org.jetbrains.annotations.NotNull
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final com.bytedance.jedi.arch.ext.list.ListState<T, P> invoke(@org.jetbrains.annotations.NotNull com.bytedance.jedi.arch.ext.list.ListState<T, P> r13, @org.jetbrains.annotations.NotNull com.bytedance.jedi.arch.a<? extends kotlin.Pair<? extends java.util.List<? extends T>, ? extends P>> r14) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "$receiver"
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
                            java.lang.String r0 = "loadMore"
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
                            java.lang.Object r0 = r14.a()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            if (r0 == 0) goto L_0x0076
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.k r3 = (com.bytedance.jedi.arch.ext.list.k) r3
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r12.this$0
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.this$0
                            int r2 = r1.size()
                            r4 = 0
                            r0.a(r2, r4)
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r12.this$0
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.this$0
                            kotlin.jvm.functions.Function2<java.util.List<? extends T>, java.util.List<? extends T>, java.util.List<T>> r0 = r0.f21349f
                            java.util.List r2 = r13.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            if (r3 == 0) goto L_0x0059
                            com.bytedance.jedi.arch.aa r2 = new com.bytedance.jedi.arch.aa
                            r2.<init>(r1)
                            r6 = r2
                            com.bytedance.jedi.arch.a r6 = (com.bytedance.jedi.arch.a) r6
                            com.bytedance.jedi.arch.ext.list.b r7 = new com.bytedance.jedi.arch.ext.list.b
                            boolean r2 = r0.isEmpty()
                            r7.<init>(r2)
                            r5 = 0
                            r8 = 4
                            r9 = 0
                            r2 = r13
                            r4 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            if (r2 != 0) goto L_0x0074
                        L_0x0059:
                            r5 = 0
                            r7 = 0
                            com.bytedance.jedi.arch.aa r2 = new com.bytedance.jedi.arch.aa
                            r2.<init>(r1)
                            r8 = r2
                            com.bytedance.jedi.arch.a r8 = (com.bytedance.jedi.arch.a) r8
                            com.bytedance.jedi.arch.ext.list.b r9 = new com.bytedance.jedi.arch.ext.list.b
                            boolean r1 = r0.isEmpty()
                            r9.<init>(r1)
                            r10 = 5
                            r11 = 0
                            r4 = r13
                            r6 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                        L_0x0074:
                            if (r2 != 0) goto L_0x00be
                        L_0x0076:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.c
                            if (r0 == 0) goto L_0x00aa
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r12.this$0
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.this$0
                            r1 = 0
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.c) r14
                            java.lang.Throwable r2 = r14.f21347a
                            r0.a(r1, r2)
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            java.lang.Throwable r14 = r14.f21347a
                            r0.<init>(r14)
                            r7 = r0
                            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.a) r7
                            com.bytedance.jedi.arch.ext.list.b r8 = new com.bytedance.jedi.arch.ext.list.b
                            com.bytedance.jedi.arch.ext.list.ListState r14 = r4
                            java.util.List r14 = r14.getList()
                            boolean r14 = r14.isEmpty()
                            r8.<init>(r14)
                            r9 = 7
                            r10 = 0
                            r3 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r13 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
                            return r13
                        L_0x00aa:
                            r1 = 0
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.l r14 = new com.bytedance.jedi.arch.l
                            r14.<init>()
                            r4 = r14
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.a) r4
                            r5 = 0
                            r6 = 23
                            r7 = 0
                            r0 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x00be:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListMiddleware.a.AnonymousClass1.invoke(com.bytedance.jedi.arch.ext.list.ListState, com.bytedance.jedi.arch.a):com.bytedance.jedi.arch.ext.list.ListState");
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u00022\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\tH\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "state", "substate", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "invoke", "(Lcom/bytedance/jedi/arch/State;Lcom/bytedance/jedi/arch/ext/list/ListState;)V"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function2<S, ListState<T, P>, Unit> {
        final /* synthetic */ Function1 $actualRefresh;
        final /* synthetic */ ListMiddleware this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ListMiddleware listMiddleware, Function1 function1) {
            super(2);
            this.this$0 = listMiddleware;
            this.$actualRefresh = function1;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((S) (x) obj, (ListState) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull S s, @NotNull final ListState<T, P> listState) {
            Intrinsics.checkParameterIsNotNull(s, "state");
            Intrinsics.checkParameterIsNotNull(listState, "substate");
            if (!(listState.getRefresh() instanceof com.bytedance.jedi.arch.l)) {
                this.this$0.a((Observable) this.$actualRefresh.invoke(s), (Function2<? super PROP, ? super com.bytedance.jedi.arch.a<? extends T>, ? extends PROP>) new Function2<ListState<T, P>, com.bytedance.jedi.arch.a<? extends Pair<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {
                    final /* synthetic */ b this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004c, code lost:
                        if (r2 == null) goto L_0x004e;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006a, code lost:
                        if (r2 == null) goto L_0x006c;
                     */
                    @org.jetbrains.annotations.NotNull
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final com.bytedance.jedi.arch.ext.list.ListState<T, P> invoke(@org.jetbrains.annotations.NotNull com.bytedance.jedi.arch.ext.list.ListState<T, P> r13, @org.jetbrains.annotations.NotNull com.bytedance.jedi.arch.a<? extends kotlin.Pair<? extends java.util.List<? extends T>, ? extends P>> r14) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "$receiver"
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r13, r0)
                            java.lang.String r0 = "refresh"
                            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r14, r0)
                            java.lang.Object r0 = r14.a()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            if (r0 == 0) goto L_0x006c
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.k r3 = (com.bytedance.jedi.arch.ext.list.k) r3
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$b r0 = r12.this$0
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.this$0
                            kotlin.jvm.functions.Function2<java.util.List<? extends T>, java.util.List<? extends T>, java.util.List<T>> r0 = r0.f21348e
                            java.util.List r2 = r13.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            if (r3 == 0) goto L_0x004e
                            com.bytedance.jedi.arch.aa r2 = new com.bytedance.jedi.arch.aa
                            r2.<init>(r1)
                            r5 = r2
                            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.a) r5
                            com.bytedance.jedi.arch.ext.list.b r7 = new com.bytedance.jedi.arch.ext.list.b
                            boolean r2 = r0.isEmpty()
                            r7.<init>(r2)
                            r6 = 0
                            r8 = 8
                            r9 = 0
                            r2 = r13
                            r4 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            if (r2 != 0) goto L_0x006a
                        L_0x004e:
                            r5 = 0
                            com.bytedance.jedi.arch.aa r2 = new com.bytedance.jedi.arch.aa
                            r2.<init>(r1)
                            r7 = r2
                            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.a) r7
                            r8 = 0
                            com.bytedance.jedi.arch.ext.list.b r9 = new com.bytedance.jedi.arch.ext.list.b
                            boolean r1 = r0.isEmpty()
                            r9.<init>(r1)
                            r10 = 9
                            r11 = 0
                            r4 = r13
                            r6 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                        L_0x006a:
                            if (r2 != 0) goto L_0x00ab
                        L_0x006c:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.c
                            if (r0 == 0) goto L_0x0097
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.c) r14
                            java.lang.Throwable r14 = r14.f21347a
                            r0.<init>(r14)
                            r4 = r0
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.a) r4
                            r5 = 0
                            com.bytedance.jedi.arch.ext.list.b r6 = new com.bytedance.jedi.arch.ext.list.b
                            com.bytedance.jedi.arch.ext.list.ListState r14 = r4
                            java.util.List r14 = r14.getList()
                            boolean r14 = r14.isEmpty()
                            r6.<init>(r14)
                            r7 = 11
                            r8 = 0
                            r1 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r13 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            return r13
                        L_0x0097:
                            r1 = 0
                            r2 = 0
                            com.bytedance.jedi.arch.l r14 = new com.bytedance.jedi.arch.l
                            r14.<init>()
                            r3 = r14
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.a) r3
                            r4 = 0
                            r5 = 0
                            r6 = 27
                            r7 = 0
                            r0 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x00ab:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListMiddleware.b.AnonymousClass1.invoke(com.bytedance.jedi.arch.ext.list.ListState, com.bytedance.jedi.arch.a):com.bytedance.jedi.arch.ext.list.ListState");
                    }
                });
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0015\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0001\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0005\"\u0004\b\u0001\u0010\u0003\"\b\b\u0002\u0010\u0004*\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "com/bytedance/jedi/arch/ext/list/ListMiddleware$prefetcher$1$1", "S", "T", "P", "Lcom/bytedance/jedi/arch/State;", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke", "()Lcom/bytedance/jedi/arch/ext/list/ListMiddleware$prefetcher$1$1;"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<AnonymousClass1> {
        final /* synthetic */ ListMiddleware this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ListMiddleware listMiddleware) {
            super(0);
            this.this$0 = listMiddleware;
        }

        @NotNull
        public final AnonymousClass1 invoke() {
            return new com.bytedance.jedi.arch.ext.list.differ.a(this) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f21350a;

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "invoke"}, k = 3, mv = {1, 1, 15})
                /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$c$1$a */
                static final class a extends Lambda implements Function1<ListState<T, P>, Unit> {
                    final /* synthetic */ Function1 $itemCountSupplier;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    a(Function1 function1) {
                        super(1);
                        this.$itemCountSupplier = function1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((ListState) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull ListState<T, P> listState) {
                        Intrinsics.checkParameterIsNotNull(listState, AdvanceSetting.NETWORK_TYPE);
                        if (i.a(listState).f21351a) {
                            this.$itemCountSupplier.invoke(Integer.valueOf(listState.getList().size()));
                        }
                    }
                }

                public final void a() {
                    this.f21350a.this$0.loadMore();
                }

                {
                    this.f21350a = r1;
                }

                public final void a(@NotNull Function1<? super Integer, Unit> function1) {
                    Intrinsics.checkParameterIsNotNull(function1, "itemCountSupplier");
                    this.f21350a.this$0.a((Function1<? super PROP, Unit>) new a<Object,Unit>(function1));
                }
            };
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\b\b\u0002\u0010\u0005*\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/bytedance/jedi/arch/ext/list/ListState;", "invoke"}, k = 3, mv = {1, 1, 15})
    public static final class d extends Lambda implements Function1<ListState<T, P>, Unit> {
        final /* synthetic */ int $position;
        final /* synthetic */ ListMiddleware this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(ListMiddleware listMiddleware, int i) {
            super(1);
            this.this$0 = listMiddleware;
            this.$position = i;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ListState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ListState<T, P> listState) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(listState, AdvanceSetting.NETWORK_TYPE);
            if (this.$position < 0 || this.$position >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!aa.f83419a || z) {
                final List mutableList = CollectionsKt.toMutableList((Collection<? extends T>) listState.getList());
                mutableList.remove(this.$position);
                this.this$0.b(new Function1<ListState<T, P>, ListState<T, P>>() {
                    @NotNull
                    public final ListState<T, P> invoke(@NotNull ListState<T, P> listState) {
                        Intrinsics.checkParameterIsNotNull(listState, "$receiver");
                        return ListState.copy$default(listState, null, mutableList, null, null, null, 29, null);
                    }
                });
                return;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class e extends Lambda implements Function2<RECEIVER, b, Unit> {
        final /* synthetic */ Function2 $hasMore;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Function2 function2) {
            super(2);
            this.$hasMore = function2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (b) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull b bVar) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
            this.$hasMore.invoke(receiver, Boolean.valueOf(bVar.f21351a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;)V"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function2<RECEIVER, b, Unit> {
        final /* synthetic */ Function2 $empty;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Function2 function2) {
            super(2);
            this.$empty = function2;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (b) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull b bVar) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
            this.$empty.invoke(receiver, Boolean.valueOf(bVar.f21351a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 1, 15})
    static final class g extends Lambda implements Function2<RECEIVER, Throwable, Unit> {
        final /* synthetic */ c $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            this.$listener.b().invoke(receiver, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;)V"}, k = 3, mv = {1, 1, 15})
    static final class h extends Lambda implements Function1<RECEIVER, Unit> {
        final /* synthetic */ c $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(c cVar) {
            super(1);
            this.$listener = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            this.$listener.a().invoke(receiver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Ljava/util/List;)V"}, k = 3, mv = {1, 1, 15})
    static final class i extends Lambda implements Function2<RECEIVER, List<? extends T>, Unit> {
        final /* synthetic */ c $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull List<? extends T> list) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            this.$listener.c().invoke(receiver, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 1, 15})
    static final class j extends Lambda implements Function2<RECEIVER, Throwable, Unit> {
        final /* synthetic */ c $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (Throwable) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull Throwable th) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(th, AdvanceSetting.NETWORK_TYPE);
            this.$listener.b().invoke(receiver, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u0002H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;)V"}, k = 3, mv = {1, 1, 15})
    static final class k extends Lambda implements Function1<RECEIVER, Unit> {
        final /* synthetic */ c $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(c cVar) {
            super(1);
            this.$listener = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            this.$listener.a().invoke(receiver);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Ljava/util/List;)V"}, k = 3, mv = {1, 1, 15})
    static final class l extends Lambda implements Function2<RECEIVER, List<? extends T>, Unit> {
        final /* synthetic */ c $listener;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(c cVar) {
            super(2);
            this.$listener = cVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull List<? extends T> list) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            this.$listener.c().invoke(receiver, list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0005\"\u0004\b\u0002\u0010\u0006\"\b\b\u0003\u0010\u0007*\u00020\b*\u0002H\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\nH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"<anonymous>", "", "RECEIVER", "Lcom/bytedance/jedi/arch/IReceiver;", "S", "Lcom/bytedance/jedi/arch/State;", "T", "P", "Lcom/bytedance/jedi/arch/ext/list/Payload;", "it", "", "invoke", "(Lcom/bytedance/jedi/arch/IReceiver;Ljava/util/List;)V"}, k = 3, mv = {1, 1, 15})
    static final class m extends Lambda implements Function2<RECEIVER, List<? extends T>, Unit> {
        final /* synthetic */ a $realAdapter;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(2);
            this.$realAdapter = aVar;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((RECEIVER) (com.bytedance.jedi.arch.d) obj, (List) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull RECEIVER receiver, @NotNull List<? extends T> list) {
            Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
            Intrinsics.checkParameterIsNotNull(list, AdvanceSetting.NETWORK_TYPE);
            this.$realAdapter.a(list);
        }
    }

    @OutService
    public final void loadMore() {
        Function1<S, Observable<Pair<List<T>, P>>> function1 = this.i;
        if (function1 != null) {
            a((Function2<? super S, ? super PROP, Unit>) new a<Object,Object,Unit>(this, function1));
        }
    }

    @OutService
    public final void refresh() {
        a((Function2<? super S, ? super PROP, Unit>) new b<Object,Object,Unit>(this, this.h));
    }

    public final void a(int i2) {
        ((c.AnonymousClass1) this.g.getValue()).a(i2);
    }

    public final void a(int i2, Throwable th) {
        Lazy<c.AnonymousClass1> lazy = this.g;
        if (lazy.isInitialized()) {
            c.AnonymousClass1 r0 = (c.AnonymousClass1) lazy.getValue();
            if (r0.f21354c) {
                r0.f21353b = false;
                if (th == null && i2 != 0) {
                    r0.f21355d -= i2;
                    if (r0.f21355d > 0) {
                        r0.b();
                    }
                }
            }
        }
    }

    public ListMiddleware(@NotNull Function1<? super S, ? extends Observable<Pair<List<T>, P>>> function1, @Nullable Function1<? super S, ? extends Observable<Pair<List<T>, P>>> function12, @NotNull Function2<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> function2, @NotNull Function2<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> function22) {
        Intrinsics.checkParameterIsNotNull(function1, "actualRefresh");
        Intrinsics.checkParameterIsNotNull(function2, "refreshStrategy");
        Intrinsics.checkParameterIsNotNull(function22, "loadMoreStrategy");
        this.h = function1;
        this.i = function12;
        this.f21348e = function2;
        this.f21349f = function22;
        this.g = LazyKt.lazy(new c(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListMiddleware(Function1 function1, Function1 function12, Function2 function2, Function2 function22, int i2) {
        this(function1, (i2 & 2) != 0 ? null : function12, (i2 & 4) != 0 ? j.a() : function2, (i2 & 8) != 0 ? j.b() : function22);
    }

    @OutService
    public final <RECEIVER extends com.bytedance.jedi.arch.d> void subscribe(@NotNull com.bytedance.jedi.arch.e<? extends RECEIVER> eVar, @Nullable a<T> aVar, boolean z, boolean z2, @Nullable c<T, RECEIVER> cVar, @Nullable c<T, RECEIVER> cVar2, @Nullable Function2<? super RECEIVER, ? super Boolean, Unit> function2, @Nullable Function2<? super RECEIVER, ? super Boolean, Unit> function22) {
        a<T> aVar2 = aVar;
        c<T, RECEIVER> cVar3 = cVar;
        c<T, RECEIVER> cVar4 = cVar2;
        Function2<? super RECEIVER, ? super Boolean, Unit> function23 = function2;
        Function2<? super RECEIVER, ? super Boolean, Unit> function24 = function22;
        Intrinsics.checkParameterIsNotNull(eVar, "subscriber");
        if (function23 != null) {
            a(eVar, d.INSTANCE, z2, z, new e(function23));
        }
        if (function24 != null) {
            a(eVar, e.INSTANCE, z2, z, new f(function24));
        }
        if (cVar3 != null) {
            a(eVar, f.INSTANCE, z2, z, new g(cVar3), new h(cVar3), new i(cVar3));
        }
        if (cVar4 != null) {
            a(eVar, g.INSTANCE, z2, z, new j(cVar4), new k(cVar4), new l(cVar4));
        }
        if (aVar2 != null) {
            a(eVar, h.INSTANCE, z2, z, new m(aVar2));
        }
    }

    public static /* synthetic */ void a(ListMiddleware listMiddleware, com.bytedance.jedi.arch.e eVar, a aVar, boolean z, boolean z2, c cVar, c cVar2, Function2 function2, Function2 function22, int i2) {
        a aVar2;
        boolean z3;
        c cVar3;
        c cVar4;
        Function2 function23;
        if ((i2 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 8) != 0) {
            z3 = eVar.c();
        } else {
            z3 = z2;
        }
        if ((i2 & 16) != 0) {
            cVar3 = null;
        } else {
            cVar3 = cVar;
        }
        if ((i2 & 32) != 0) {
            cVar4 = null;
        } else {
            cVar4 = cVar2;
        }
        if ((i2 & 64) != 0) {
            function23 = null;
        } else {
            function23 = function2;
        }
        listMiddleware.subscribe(eVar, aVar2, false, z3, cVar3, cVar4, function23, null);
    }
}
