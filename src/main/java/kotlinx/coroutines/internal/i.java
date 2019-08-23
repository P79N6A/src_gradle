package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.TypeCastException;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InternalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0004BCDEB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0019\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\bJ-\u0010\u001c\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u000f\u0012\u0004\u0012\u00020\t0\u001eH\bJ=\u0010\u001f\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u0016\u0010\u001d\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u000f\u0012\u0004\u0012\u00020\t0\u001e2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\bJ \u0010 \u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010!\u001a\u00020\t2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000fJ&\u0010\"\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\n\u0010\u0005\u001a\u00060\u0000j\u0002`\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002J'\u0010%\u001a\b\u0012\u0004\u0012\u0002H'0&\"\f\b\u0000\u0010'*\u00060\u0000j\u0002`\u000f2\u0006\u0010\u0018\u001a\u0002H'¢\u0006\u0002\u0010(J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000f0,J\f\u0010-\u001a\u00060\u0000j\u0002`\u000fH\u0002J\u0014\u0010.\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J\u0014\u0010/\u001a\u00020\u00172\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J\b\u00100\u001a\u00020\u0017H\u0001J\u0006\u00101\u001a\u00020\u0017J%\u00102\u001a\u0002032\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u001bH\bJ\f\u00104\u001a\u00060\u0000j\u0002`\u000fH\u0002J\b\u00105\u001a\u00020\tH\u0016J\u0018\u00106\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u0001H\b¢\u0006\u0002\u0010\rJ,\u00107\u001a\u0004\u0018\u0001H'\"\u0006\b\u0000\u0010'\u0018\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H'\u0012\u0004\u0012\u00020\t0\u001eH\b¢\u0006\u0002\u00108J\u000e\u00109\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fJ\b\u0010:\u001a\u00020\u0007H\u0002J\b\u0010;\u001a\u00020<H\u0016J(\u0010=\u001a\u00020>2\n\u0010\u0018\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010?\u001a\u000203H\u0001J%\u0010@\u001a\u00020\u00172\n\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\bAR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0015\u0010\u0014\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006F"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "", "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", "", "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prev", "getPrev", "prevNode", "getPrevNode", "addLast", "", "node", "addLastIf", "condition", "Lkotlin/Function0;", "addLastIfPrev", "predicate", "Lkotlin/Function1;", "addLastIfPrevAndIf", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "describeAddLast", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "T", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "describeRemove", "Lkotlinx/coroutines/internal/AtomicDesc;", "describeRemoveFirst", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "findHead", "finishAdd", "finishRemove", "helpDelete", "helpRemove", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "markPrev", "remove", "removeFirstIfIsInstanceOf", "removeFirstIfIsInstanceOfOrPeekIf", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "removeFirstOrNull", "removed", "toString", "", "tryCondAddNext", "", "condAdd", "validateNode", "validateNode$kotlinx_coroutines_core", "AbstractAtomicDesc", "AddLastDesc", "CondAddOp", "RemoveFirstDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
@InternalCoroutinesApi
public class i {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f83928a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef");

    /* renamed from: c  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f83929c = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next");

    /* renamed from: d  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f83930d = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef;

    @PublishedApi
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", "", "affected", "failure", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
    public static abstract class a extends d<i> {
        @Nullable
        @JvmField

        /* renamed from: d  reason: collision with root package name */
        public i f83931d;
        @NotNull
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public final i f83932e;

        public a(@NotNull i iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "newNode");
            this.f83932e = iVar;
        }

        public final /* synthetic */ void a(Object obj, Object obj2) {
            boolean z;
            i iVar;
            i iVar2 = (i) obj;
            Intrinsics.checkParameterIsNotNull(iVar2, "affected");
            if (obj2 == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                iVar = this.f83932e;
            } else {
                iVar = this.f83931d;
            }
            if (iVar != null && i.f83929c.compareAndSet(iVar2, this, iVar) && z) {
                i iVar3 = this.f83932e;
                i iVar4 = this.f83931d;
                if (iVar4 == null) {
                    Intrinsics.throwNpe();
                }
                iVar3.b(iVar4);
            }
        }
    }

    public final boolean d() {
        return e() instanceof q;
    }

    @NotNull
    public final Object e() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).b(this);
        }
    }

    @NotNull
    public final i f() {
        return h.a(e());
    }

    @NotNull
    public final i h() {
        return h.a(g());
    }

    private q i() {
        q qVar = (q) this._removedRef;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this);
        f83928a.lazySet(this, qVar2);
        return qVar2;
    }

    private final i j() {
        Object obj;
        i iVar;
        do {
            obj = this._prev;
            if (obj instanceof q) {
                return ((q) obj).f83945a;
            }
            if (obj == this) {
                iVar = k();
            } else if (obj != null) {
                iVar = (i) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f83930d.compareAndSet(this, obj, iVar.i()));
        return (i) obj;
    }

    private final i k() {
        boolean z;
        i iVar = this;
        i iVar2 = iVar;
        while (!(iVar2 instanceof g)) {
            iVar2 = iVar2.f();
            if (iVar2 != iVar) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                throw new IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return iVar2;
    }

    @NotNull
    public final Object g() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof q) {
                return obj;
            }
            if (obj != null) {
                i iVar = (i) obj;
                if (iVar.e() == this) {
                    return obj;
                }
                a(iVar, null);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public boolean c() {
        Object e2;
        i iVar;
        i iVar2;
        Object e3;
        do {
            e2 = e();
            if (e2 instanceof q) {
                return false;
            }
            iVar = this;
            if (e2 == iVar) {
                return false;
            }
            if (e2 != null) {
                iVar2 = (i) e2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f83929c.compareAndSet(this, e2, iVar2.i()));
        i j = j();
        Object obj = this._next;
        if (obj != null) {
            i iVar3 = j;
            i iVar4 = null;
            loop1:
            while (true) {
                i iVar5 = ((q) obj).f83945a;
                while (true) {
                    e3 = iVar5.e();
                    if (!(e3 instanceof q)) {
                        Object e4 = iVar3.e();
                        if (!(e4 instanceof q)) {
                            if (e4 == iVar) {
                                if (f83929c.compareAndSet(iVar3, this, iVar5)) {
                                    break loop1;
                                }
                            } else if (e4 != null) {
                                i iVar6 = (i) e4;
                                if (iVar6 == iVar5) {
                                    break loop1;
                                }
                                i iVar7 = iVar3;
                                iVar3 = iVar6;
                                iVar4 = iVar7;
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                            }
                        } else if (iVar4 != null) {
                            iVar3.j();
                            f83929c.compareAndSet(iVar4, iVar3, ((q) e4).f83945a);
                            iVar3 = iVar4;
                            iVar4 = null;
                        } else {
                            iVar3 = h.a(iVar3._prev);
                        }
                    } else {
                        break;
                    }
                }
                iVar5.j();
                obj = e3;
            }
            iVar2.a(h.a(this._prev), null);
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
    }

    public final void b(i iVar) {
        Object obj;
        do {
            obj = iVar._prev;
            if ((obj instanceof q) || e() != iVar) {
                return;
            }
        } while (!f83930d.compareAndSet(iVar, obj, this));
        if (e() instanceof q) {
            if (obj != null) {
                iVar.a((i) obj, null);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public final boolean a(@NotNull i iVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "node");
        f83930d.lazySet(iVar, this);
        f83929c.lazySet(iVar, this);
        while (e() == this) {
            if (f83929c.compareAndSet(this, this, iVar)) {
                iVar.b(this);
                return true;
            }
        }
        return false;
    }

    private i a(i iVar, p pVar) {
        Object obj;
        while (true) {
            i iVar2 = null;
            while (true) {
                obj = iVar._next;
                if (obj == null) {
                    return iVar;
                }
                if (obj instanceof p) {
                    ((p) obj).b(iVar);
                } else if (!(obj instanceof q)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof q) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            iVar2 = iVar;
                            iVar = (i) obj;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == iVar) {
                        return null;
                    } else {
                        if (f83930d.compareAndSet(this, obj2, iVar) && !(iVar._prev instanceof q)) {
                            return null;
                        }
                    }
                } else if (iVar2 != null) {
                    break;
                } else {
                    iVar = h.a(iVar._prev);
                }
            }
            iVar.j();
            f83929c.compareAndSet(iVar2, iVar, ((q) obj).f83945a);
            iVar = iVar2;
        }
    }

    @PublishedApi
    public final int a(@NotNull i iVar, @NotNull i iVar2, @NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(iVar, "node");
        Intrinsics.checkParameterIsNotNull(iVar2, "next");
        Intrinsics.checkParameterIsNotNull(aVar, "condAdd");
        f83930d.lazySet(iVar, this);
        f83929c.lazySet(iVar, iVar2);
        aVar.f83931d = iVar2;
        if (!f83929c.compareAndSet(this, iVar2, aVar)) {
            return 0;
        }
        if (aVar.b(this) == null) {
            return 1;
        }
        return 2;
    }
}
