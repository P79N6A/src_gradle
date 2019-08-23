package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001!B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0000H\u0002J\u0013\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J5\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u00102\u0006\u0010\u0011\u001a\u0002H\u00102\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016¢\u0006\u0002\u0010\u0014J(\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0018H\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "contains", "", "containsAll", "context", "equals", "other", "", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "hashCode", "", "minusKey", "size", "toString", "", "writeReplace", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public final class b implements Serializable, e {
    private final e.b element;
    private final e left;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
    static final class a implements Serializable {
        public static final C0890a Companion = new C0890a((byte) 0);
        private static final long serialVersionUID = 0;
        @NotNull
        private final e[] elements;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/CombinedContext$Serialized$Companion;", "", "()V", "serialVersionUID", "", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
        /* renamed from: kotlin.coroutines.b$a$a  reason: collision with other inner class name */
        public static final class C0890a {
            private C0890a() {
            }

            public /* synthetic */ C0890a(byte b2) {
                this();
            }
        }

        @NotNull
        public final e[] getElements() {
            return this.elements;
        }

        private final Object readResolve() {
            e[] eVarArr = this.elements;
            e eVar = f.INSTANCE;
            for (e plus : eVarArr) {
                eVar = eVar.plus(plus);
            }
            return eVar;
        }

        public a(@NotNull e[] eVarArr) {
            Intrinsics.checkParameterIsNotNull(eVarArr, "elements");
            this.elements = eVarArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: kotlin.coroutines.b$b  reason: collision with other inner class name */
    static final class C0891b extends Lambda implements Function2<String, e.b, String> {
        public static final C0891b INSTANCE = new C0891b();

        C0891b() {
            super(2);
        }

        @NotNull
        public final String invoke(@NotNull String str, @NotNull e.b bVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(str, "acc");
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function2<Unit, e.b, Unit> {
        final /* synthetic */ e[] $elements;
        final /* synthetic */ Ref.IntRef $index;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e[] eVarArr, Ref.IntRef intRef) {
            super(2);
            this.$elements = eVarArr;
            this.$index = intRef;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Unit) obj, (e.b) obj2);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Unit unit, @NotNull e.b bVar) {
            Intrinsics.checkParameterIsNotNull(unit, "<anonymous parameter 0>");
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            e[] eVarArr = this.$elements;
            Ref.IntRef intRef = this.$index;
            int i = intRef.element;
            intRef.element = i + 1;
            eVarArr[i] = bVar;
        }
    }

    public final int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    private final int a() {
        b bVar = this;
        int i = 2;
        while (true) {
            e eVar = bVar.left;
            if (!(eVar instanceof b)) {
                eVar = null;
            }
            bVar = (b) eVar;
            if (bVar == null) {
                return i;
            }
            i++;
        }
    }

    @NotNull
    public final String toString() {
        return "[" + ((String) fold("", C0891b.INSTANCE)) + "]";
    }

    private final Object writeReplace() {
        int a2 = a();
        e[] eVarArr = new e[a2];
        Ref.IntRef intRef = new Ref.IntRef();
        boolean z = false;
        intRef.element = 0;
        fold(Unit.INSTANCE, new c(eVarArr, intRef));
        if (intRef.element == a2) {
            z = true;
        }
        if (z) {
            return new a(eVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final boolean a(e.b bVar) {
        return Intrinsics.areEqual((Object) get(bVar.getKey()), (Object) bVar);
    }

    @NotNull
    public final e plus(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        return e.a.a(this, eVar);
    }

    @Nullable
    public final <E extends e.b> E get(@NotNull e.c<E> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        e eVar = this;
        while (true) {
            b bVar = (b) eVar;
            E e2 = bVar.element.get(cVar);
            if (e2 != null) {
                return e2;
            }
            eVar = bVar.left;
            if (!(eVar instanceof b)) {
                return eVar.get(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r4 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = r3
            kotlin.coroutines.b r0 = (kotlin.coroutines.b) r0
            if (r0 == r4) goto L_0x003e
            boolean r0 = r4 instanceof kotlin.coroutines.b
            r1 = 0
            if (r0 == 0) goto L_0x003d
            kotlin.coroutines.b r4 = (kotlin.coroutines.b) r4
            int r0 = r4.a()
            int r2 = r3.a()
            if (r0 != r2) goto L_0x003d
            r0 = r3
        L_0x0017:
            kotlin.coroutines.e$b r2 = r0.element
            boolean r2 = r4.a(r2)
            if (r2 != 0) goto L_0x0021
            r4 = 0
            goto L_0x0032
        L_0x0021:
            kotlin.coroutines.e r0 = r0.left
            boolean r2 = r0 instanceof kotlin.coroutines.b
            if (r2 == 0) goto L_0x002a
            kotlin.coroutines.b r0 = (kotlin.coroutines.b) r0
            goto L_0x0017
        L_0x002a:
            if (r0 == 0) goto L_0x0035
            kotlin.coroutines.e$b r0 = (kotlin.coroutines.e.b) r0
            boolean r4 = r4.a(r0)
        L_0x0032:
            if (r4 == 0) goto L_0x003d
            goto L_0x003e
        L_0x0035:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            r4.<init>(r0)
            throw r4
        L_0x003d:
            return r1
        L_0x003e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.b.equals(java.lang.Object):boolean");
    }

    @NotNull
    public final e minusKey(@NotNull e.c<?> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "key");
        if (this.element.get(cVar) != null) {
            return this.left;
        }
        e minusKey = this.left.minusKey(cVar);
        if (minusKey == this.left) {
            return this;
        }
        if (minusKey == f.INSTANCE) {
            return this.element;
        }
        return new b(minusKey, this.element);
    }

    public b(@NotNull e eVar, @NotNull e.b bVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "left");
        Intrinsics.checkParameterIsNotNull(bVar, "element");
        this.left = eVar;
        this.element = bVar;
    }

    public final <R> R fold(R r, @NotNull Function2<? super R, ? super e.b, ? extends R> function2) {
        Intrinsics.checkParameterIsNotNull(function2, "operation");
        return function2.invoke(this.left.fold(r, function2), this.element);
    }
}
