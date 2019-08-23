package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.c;
import kotlin.reflect.i;
import kotlin.reflect.j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", "other", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 1, 15})
@SinceKotlin
public final class y implements i {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final c f83604a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final List<j> f83605b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f83606c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KTypeProjection;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function1<j, String> {
        final /* synthetic */ y this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
            if (r0 == null) goto L_0x001d;
         */
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke(@org.jetbrains.annotations.NotNull kotlin.reflect.j r3) {
            /*
                r2 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
                kotlin.reflect.k r0 = r3.f83648a
                if (r0 != 0) goto L_0x000c
                java.lang.String r3 = "*"
                return r3
            L_0x000c:
                kotlin.reflect.i r0 = r3.f83649b
                boolean r1 = r0 instanceof kotlin.jvm.internal.y
                if (r1 != 0) goto L_0x0013
                r0 = 0
            L_0x0013:
                kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r0.a()
                if (r0 != 0) goto L_0x0023
            L_0x001d:
                kotlin.reflect.i r0 = r3.f83649b
                java.lang.String r0 = java.lang.String.valueOf(r0)
            L_0x0023:
                kotlin.reflect.k r3 = r3.f83648a
                if (r3 == 0) goto L_0x0052
                int[] r1 = kotlin.jvm.internal.z.f83607a
                int r3 = r3.ordinal()
                r3 = r1[r3]
                switch(r3) {
                    case 1: goto L_0x0051;
                    case 2: goto L_0x0042;
                    case 3: goto L_0x0033;
                    default: goto L_0x0032;
                }
            L_0x0032:
                goto L_0x0052
            L_0x0033:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "out "
                r3.<init>(r1)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                return r3
            L_0x0042:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r1 = "in "
                r3.<init>(r1)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                return r3
            L_0x0051:
                return r0
            L_0x0052:
                kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
                r3.<init>()
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.y.a.invoke(kotlin.reflect.j):java.lang.String");
        }
    }

    @NotNull
    private c b() {
        return this.f83604a;
    }

    @NotNull
    private List<j> c() {
        return this.f83605b;
    }

    private boolean d() {
        return this.f83606c;
    }

    @NotNull
    public final List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @NotNull
    public final String toString() {
        return a() + " (Kotlin reflection is not available)";
    }

    public final int hashCode() {
        return (((b().hashCode() * 31) + c().hashCode()) * 31) + Boolean.valueOf(d()).hashCode();
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        String str;
        String str2;
        String str3;
        c b2 = b();
        Class cls = null;
        if (!(b2 instanceof KClass)) {
            b2 = null;
        }
        KClass kClass = (KClass) b2;
        if (kClass != null) {
            cls = kotlin.jvm.a.a(kClass);
        }
        if (cls == null) {
            str = b().toString();
        } else if (cls.isArray()) {
            str = a(cls);
        } else {
            str = cls.getName();
        }
        if (c().isEmpty()) {
            str2 = "";
        } else {
            str2 = CollectionsKt.joinToString$default(c(), ", ", "<", ">", 0, null, new a(this), 24, null);
        }
        if (d()) {
            str3 = "?";
        } else {
            str3 = "";
        }
        return str + str2 + str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (Intrinsics.areEqual((Object) b(), (Object) yVar.b()) && Intrinsics.areEqual((Object) c(), (Object) yVar.c()) && d() == yVar.d()) {
                return true;
            }
        }
        return false;
    }

    private static String a(@NotNull Class<?> cls) {
        if (Intrinsics.areEqual((Object) cls, (Object) boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) char[].class)) {
            return "kotlin.CharArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) short[].class)) {
            return "kotlin.ShortArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) int[].class)) {
            return "kotlin.IntArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) float[].class)) {
            return "kotlin.FloatArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) long[].class)) {
            return "kotlin.LongArray";
        }
        if (Intrinsics.areEqual((Object) cls, (Object) double[].class)) {
            return "kotlin.DoubleArray";
        }
        return "kotlin.Array";
    }

    public y(@NotNull c cVar, @NotNull List<j> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(cVar, "classifier");
        Intrinsics.checkParameterIsNotNull(list, "arguments");
        this.f83604a = cVar;
        this.f83605b = list;
        this.f83606c = z;
    }
}
