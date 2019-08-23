package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.cc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"$\u0010\u0002\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0004¢\u0006\u0002\n\u0000\",\u0010\u0006\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000\" \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"ZERO", "Lkotlinx/coroutines/internal/Symbol;", "countAll", "Lkotlin/Function2;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "findOne", "Lkotlinx/coroutines/ThreadContextElement;", "restoreState", "Lkotlinx/coroutines/internal/ThreadState;", "updateState", "restoreThreadContext", "", "context", "Lkotlin/coroutines/CoroutineContext;", "oldState", "threadContextElements", "updateThreadContext", "countOrElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 1, 13})
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private static final t f83949a = new t("ZERO");

    /* renamed from: b  reason: collision with root package name */
    private static final Function2<Object, e.b, Object> f83950b = a.INSTANCE;

    /* renamed from: c  reason: collision with root package name */
    private static final Function2<cc<?>, e.b, cc<?>> f83951c = b.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    private static final Function2<y, e.b, y> f83952d = d.INSTANCE;

    /* renamed from: e  reason: collision with root package name */
    private static final Function2<y, e.b, y> f83953e = c.INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "", "countOrElement", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class a extends Lambda implements Function2<Object, e.b, Object> {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Nullable
        public final Object invoke(@Nullable Object obj, @NotNull e.b bVar) {
            int i;
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            if (!(bVar instanceof cc)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/ThreadContextElement;", "found", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class b extends Lambda implements Function2<cc<?>, e.b, cc<?>> {
        public static final b INSTANCE = new b();

        b() {
            super(2);
        }

        @Nullable
        public final cc<?> invoke(@Nullable cc<?> ccVar, @NotNull e.b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            if (ccVar != null) {
                return ccVar;
            }
            if (!(bVar instanceof cc)) {
                bVar = null;
            }
            return (cc) bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class c extends Lambda implements Function2<y, e.b, y> {
        public static final c INSTANCE = new c();

        c() {
            super(2);
        }

        @NotNull
        public final y invoke(@NotNull y yVar, @NotNull e.b bVar) {
            Intrinsics.checkParameterIsNotNull(yVar, "state");
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            if (bVar instanceof cc) {
                e eVar = yVar.f83957c;
                Object[] objArr = yVar.f83955a;
                int i = yVar.f83956b;
                yVar.f83956b = i + 1;
                ((cc) bVar).a(eVar, objArr[i]);
            }
            return yVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<no name provided>", "Lkotlinx/coroutines/internal/ThreadState;", "state", "element", "Lkotlin/coroutines/CoroutineContext$Element;", "invoke"}, k = 3, mv = {1, 1, 13})
    static final class d extends Lambda implements Function2<y, e.b, y> {
        public static final d INSTANCE = new d();

        d() {
            super(2);
        }

        @NotNull
        public final y invoke(@NotNull y yVar, @NotNull e.b bVar) {
            Intrinsics.checkParameterIsNotNull(yVar, "state");
            Intrinsics.checkParameterIsNotNull(bVar, "element");
            if (bVar instanceof cc) {
                Object a2 = ((cc) bVar).a(yVar.f83957c);
                Object[] objArr = yVar.f83955a;
                int i = yVar.f83956b;
                yVar.f83956b = i + 1;
                objArr[i] = a2;
            }
            return yVar;
        }
    }

    @NotNull
    public static final Object a(@NotNull e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        Object fold = eVar.fold(0, f83950b);
        if (fold == null) {
            Intrinsics.throwNpe();
        }
        return fold;
    }

    @Nullable
    public static final Object a(@NotNull e eVar, @Nullable Object obj) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        if (obj == null) {
            obj = a(eVar);
        }
        if (obj == 0) {
            return f83949a;
        }
        if (obj instanceof Integer) {
            return eVar.fold(new y(eVar, ((Number) obj).intValue()), f83952d);
        }
        if (obj != null) {
            return ((cc) obj).a(eVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    public static final void b(@NotNull e eVar, @Nullable Object obj) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        if (obj != f83949a) {
            if (obj instanceof y) {
                ((y) obj).a();
                eVar.fold(obj, f83953e);
                return;
            }
            Object fold = eVar.fold(null, f83951c);
            if (fold != null) {
                ((cc) fold).a(eVar, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
