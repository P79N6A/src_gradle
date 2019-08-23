package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\r\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013JH\u0010\u0014\u001a\u00020\u0015\"\u0004\b\u0001\u0010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u00182\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00160\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001aH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001dR\u0014\u0010\n\u001a\u00020\b8TX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DeferredCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "Lkotlinx/coroutines/Deferred;", "Lkotlinx/coroutines/selects/SelectClause1;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Z)V", "cancelsParent", "getCancelsParent", "()Z", "onAwait", "getOnAwait", "()Lkotlinx/coroutines/selects/SelectClause1;", "await", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompleted", "()Ljava/lang/Object;", "registerSelectClause1", "", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public class an<T> extends a<T> implements am<T> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H@ø\u0001\u0000"}, d2 = {"await", "", "T", "continuation", "Lkotlin/coroutines/Continuation;"}, k = 3, mv = {1, 1, 13})
    @DebugMetadata(b = "Builders.common.kt", c = {99}, d = "await$suspendImpl", e = "kotlinx.coroutines.DeferredCoroutine")
    static final class a extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ an this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(an anVar, c cVar) {
            super(cVar);
            this.this$0 = anVar;
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return an.a(this.this$0, this);
        }
    }

    @Nullable
    public final Object a(@NotNull c<? super T> cVar) {
        return a(this, cVar);
    }

    /* access modifiers changed from: protected */
    public final boolean h() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an(@NotNull e eVar, boolean z) {
        super(eVar, z);
        Intrinsics.checkParameterIsNotNull(eVar, "parentContext");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.lang.Object a(kotlinx.coroutines.an r6, kotlin.coroutines.c r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.an.a
            if (r0 == 0) goto L_0x0014
            r0 = r7
            kotlinx.coroutines.an$a r0 = (kotlinx.coroutines.an.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.an$a r0 = new kotlinx.coroutines.an$a
            r0.<init>(r6, r7)
        L_0x0019:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.a.b.a()
            int r2 = r0.label
            switch(r2) {
                case 0: goto L_0x0037;
                case 1: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002c:
            boolean r6 = r7 instanceof kotlin.l.b
            if (r6 != 0) goto L_0x0032
            goto L_0x00a6
        L_0x0032:
            kotlin.l$b r7 = (kotlin.l.b) r7
            java.lang.Throwable r6 = r7.exception
            throw r6
        L_0x0037:
            boolean r2 = r7 instanceof kotlin.l.b
            if (r2 != 0) goto L_0x00a7
            r0.L$0 = r6
            r7 = 1
            r0.label = r7
        L_0x0040:
            java.lang.Object r2 = r6.n()
            boolean r3 = r2 instanceof kotlinx.coroutines.bf
            if (r3 != 0) goto L_0x0069
            boolean r6 = r2 instanceof kotlinx.coroutines.u
            if (r6 == 0) goto L_0x0063
            kotlinx.coroutines.u r2 = (kotlinx.coroutines.u) r2
            java.lang.Throwable r6 = r2.f83971b
            boolean r7 = kotlinx.coroutines.internal.s.b(r6)
            if (r7 != 0) goto L_0x0062
            boolean r7 = r0 instanceof kotlin.coroutines.jvm.internal.e
            if (r7 != 0) goto L_0x005b
            throw r6
        L_0x005b:
            kotlin.coroutines.jvm.internal.e r0 = (kotlin.coroutines.jvm.internal.e) r0
            java.lang.Throwable r6 = kotlinx.coroutines.internal.s.a(r6, (kotlin.coroutines.jvm.internal.e) r0)
            throw r6
        L_0x0062:
            throw r6
        L_0x0063:
            java.lang.Object r6 = kotlinx.coroutines.bp.b(r2)
        L_0x0067:
            r7 = r6
            goto L_0x00a3
        L_0x0069:
            int r2 = super.a((java.lang.Object) r2)
            if (r2 >= 0) goto L_0x0070
            goto L_0x0040
        L_0x0070:
            kotlinx.coroutines.bo$a r2 = new kotlinx.coroutines.bo$a
            kotlin.coroutines.c r3 = kotlin.coroutines.a.b.a(r0)
            r2.<init>(r3, r6)
            r3 = r2
            kotlinx.coroutines.k r3 = (kotlinx.coroutines.k) r3
            kotlinx.coroutines.by r4 = new kotlinx.coroutines.by
            r5 = r2
            kotlinx.coroutines.l r5 = (kotlinx.coroutines.l) r5
            r4.<init>(r6, r5)
            kotlinx.coroutines.x r4 = (kotlinx.coroutines.x) r4
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.String r5 = "handler"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r5)
            r5 = 0
            kotlinx.coroutines.av r6 = r6.a((boolean) r5, (boolean) r7, (kotlin.jvm.functions.Function1) r4)
            kotlinx.coroutines.m.a(r3, r6)
            java.lang.Object r6 = r2.b()
            java.lang.Object r7 = kotlin.coroutines.a.b.a()
            if (r6 != r7) goto L_0x0067
            kotlin.coroutines.jvm.internal.g.b(r0)
            goto L_0x0067
        L_0x00a3:
            if (r7 != r1) goto L_0x00a6
            return r1
        L_0x00a6:
            return r7
        L_0x00a7:
            kotlin.l$b r7 = (kotlin.l.b) r7
            java.lang.Throwable r6 = r7.exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.an.a(kotlinx.coroutines.an, kotlin.coroutines.c):java.lang.Object");
    }
}
