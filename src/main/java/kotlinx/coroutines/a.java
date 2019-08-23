package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.c;
import kotlin.coroutines.e;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\u0019H\u0000¢\u0006\u0002\b\u001eJ\r\u0010\u001f\u001a\u00020 H\u0010¢\u0006\u0002\b!J\u0012\u0010\"\u001a\u00020\u00192\b\u0010#\u001a\u0004\u0018\u00010\u001bH\u0014J\u0015\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0014J'\u0010(\u001a\u00020\u00192\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\tH\u0010¢\u0006\u0002\b-J\b\u0010.\u001a\u00020\u0019H\u0014J\r\u0010/\u001a\u00020\u0019H\u0000¢\u0006\u0002\b0J\u001c\u00101\u001a\u00020\u00192\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000003ø\u0001\u0000¢\u0006\u0002\u0010&JM\u00104\u001a\u00020\u0019\"\u0004\b\u0001\u001052\u0006\u00104\u001a\u0002062\u0006\u00107\u001a\u0002H52'\u00108\u001a#\b\u0001\u0012\u0004\u0012\u0002H5\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010*09¢\u0006\u0002\b:ø\u0001\u0000¢\u0006\u0002\u0010;J4\u00104\u001a\u00020\u00192\u0006\u00104\u001a\u0002062\u001c\u00108\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010*0<ø\u0001\u0000¢\u0006\u0002\u0010=R\u0017\u0010\u000b\u001a\u00020\u0007¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00138PX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0006\u001a\u00020\u00078\u0004X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", "T", "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "active", "", "(Lkotlin/coroutines/CoroutineContext;Z)V", "context", "context$annotations", "()V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "getCoroutineContext", "defaultResumeMode", "", "getDefaultResumeMode$kotlinx_coroutines_core", "()I", "isActive", "()Z", "handleOnCompletionException", "", "exception", "", "handleOnCompletionException$kotlinx_coroutines_core", "initParentJob", "initParentJob$kotlinx_coroutines_core", "nameString", "", "nameString$kotlinx_coroutines_core", "onCancellation", "cause", "onCompleted", "value", "(Ljava/lang/Object;)V", "onCompletedExceptionally", "onCompletionInternal", "state", "", "mode", "suppressed", "onCompletionInternal$kotlinx_coroutines_core", "onStart", "onStartInternal", "onStartInternal$kotlinx_coroutines_core", "resumeWith", "result", "Lkotlin/Result;", "start", "R", "Lkotlinx/coroutines/CoroutineStart;", "receiver", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineStart;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "(Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
@InternalCoroutinesApi
public abstract class a<T> extends bo implements c<T>, af, bk {
    @NotNull
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    protected final e f83786a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final e f83787b = this.f83786a.plus(this);

    /* access modifiers changed from: protected */
    public void d() {
    }

    public int f() {
        return 0;
    }

    @NotNull
    public final e a() {
        return this.f83787b;
    }

    public final void e() {
        d();
    }

    @NotNull
    public final e getContext() {
        return this.f83787b;
    }

    public final boolean b() {
        return super.b();
    }

    public final void c() {
        boolean z;
        bk bkVar = (bk) this.f83786a.get(bk.f4367c);
        if (this.parentHandle == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (bkVar == null) {
            this.parentHandle = bu.f83898a;
        } else {
            bkVar.l();
            p a2 = bkVar.a(this);
            this.parentHandle = a2;
            if (i()) {
                a2.a();
                this.parentHandle = bu.f83898a;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r0 == null) goto L_0x002a;
     */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String g() {
        /*
            r3 = this;
            kotlin.coroutines.e r0 = r3.f83787b
            java.lang.String r1 = "receiver$0"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            boolean r1 = kotlinx.coroutines.ai.f83795a
            r2 = 0
            if (r1 != 0) goto L_0x000d
            goto L_0x0042
        L_0x000d:
            kotlinx.coroutines.ad$a r1 = kotlinx.coroutines.ad.f83789b
            kotlin.coroutines.e$c r1 = (kotlin.coroutines.e.c) r1
            kotlin.coroutines.e$b r1 = r0.get(r1)
            kotlinx.coroutines.ad r1 = (kotlinx.coroutines.ad) r1
            if (r1 != 0) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            kotlinx.coroutines.ae$a r2 = kotlinx.coroutines.ae.f83791b
            kotlin.coroutines.e$c r2 = (kotlin.coroutines.e.c) r2
            kotlin.coroutines.e$b r0 = r0.get(r2)
            kotlinx.coroutines.ae r0 = (kotlinx.coroutines.ae) r0
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r0.f83792a
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            java.lang.String r0 = "coroutine"
        L_0x002c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r0 = 35
            r2.append(r0)
            long r0 = r1.f83790a
            r2.append(r0)
            java.lang.String r2 = r2.toString()
        L_0x0042:
            if (r2 != 0) goto L_0x0049
            java.lang.String r0 = super.g()
            return r0
        L_0x0049:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\""
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = "\":"
            r0.append(r1)
            java.lang.String r1 = super.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.a.g():java.lang.String");
    }

    public final void resumeWith(@NotNull Object obj) {
        a(v.a(obj), f());
    }

    public final void a(@NotNull Throwable th) {
        Intrinsics.checkParameterIsNotNull(th, "exception");
        ac.a(this.f83786a, th, this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(@NotNull e eVar, boolean z) {
        super(z);
        Intrinsics.checkParameterIsNotNull(eVar, "parentContext");
        this.f83786a = eVar;
    }

    public void a(@Nullable Object obj, int i, boolean z) {
        if (obj instanceof u) {
            Intrinsics.checkParameterIsNotNull(((u) obj).f83971b, "exception");
        }
    }

    public final <R> void a(@NotNull ag agVar, R r, @NotNull Function2<? super R, ? super c<? super T>, ? extends Object> function2) {
        Intrinsics.checkParameterIsNotNull(agVar, "start");
        Intrinsics.checkParameterIsNotNull(function2, "block");
        c();
        agVar.invoke(function2, r, this);
    }
}
