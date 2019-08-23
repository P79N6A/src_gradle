package com.bytedance.jedi.model.e;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u00042\u00020\u0005:\u0004\u0007\b\t\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0006\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/bytedance/jedi/model/merge/MergeStrategy;", "K", "V", "K1", "V1", "", "()V", "BatchMerge", "Companion", "KeyMerge", "PredicatedMerge", "Lcom/bytedance/jedi/model/merge/MergeStrategy$KeyMerge;", "Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "Lcom/bytedance/jedi/model/merge/MergeStrategy$BatchMerge;", "model_release"}, k = 1, mv = {1, 1, 15})
public abstract class a<K, V, K1, V1> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f21573a = new b((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0004\u0010\u0001*\u0004\b\u0005\u0010\u0002*\u0004\b\u0006\u0010\u0003*\u0004\b\u0007\u0010\u00042\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005Bz\b\u0000\u00125\b\u0002\u0010\u0006\u001a/\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\f0\u000b0\u0007\u0012:\b\u0002\u0010\r\u001a4\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00018\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00070\u000e¢\u0006\u0002\u0010\u0010J;\u0010\u0006\u001a\u00020\u001923\u0010\u001a\u001a/\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\f0\u000b0\u0007J@\u0010\r\u001a\u00020\u001928\u0010\u001a\u001a4\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00018\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00070\u000eRG\u0010\u0006\u001a/\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\f0\u000b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014RL\u0010\r\u001a4\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000f\u0012\u0015\u0012\u0013\u0018\u00018\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00028\u00070\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bytedance/jedi/model/merge/MergeStrategy$BatchMerge;", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "batch", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "curV", "", "Lkotlin/Pair;", "merge", "Lkotlin/Function2;", "newV", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getBatch$model_release", "()Lkotlin/jvm/functions/Function1;", "setBatch$model_release", "(Lkotlin/jvm/functions/Function1;)V", "getMerge$model_release", "()Lkotlin/jvm/functions/Function2;", "setMerge$model_release", "(Lkotlin/jvm/functions/Function2;)V", "", "block", "model_release"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.jedi.model.e.a$a  reason: collision with other inner class name */
    public static final class C0213a<K, V, K1, V1> extends a<K, V, K1, V1> {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public Function1<? super V, ? extends List<? extends Pair<? extends K1, ? extends V1>>> f21574b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public Function2<? super V1, ? super V1, ? extends V1> f21575c;

        public C0213a() {
            this(null, null, 3);
        }

        public final void a(@NotNull Function1<? super V, ? extends List<? extends Pair<? extends K1, ? extends V1>>> function1) {
            Intrinsics.checkParameterIsNotNull(function1, "block");
            this.f21574b = function1;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private C0213a(@NotNull Function1<? super V, ? extends List<? extends Pair<? extends K1, ? extends V1>>> function1, @NotNull Function2<? super V1, ? super V1, ? extends V1> function2) {
            super((byte) 0);
            Intrinsics.checkParameterIsNotNull(function1, "batch");
            Intrinsics.checkParameterIsNotNull(function2, "merge");
            this.f21574b = function1;
            this.f21575c = function2;
        }

        public /* synthetic */ C0213a(Function1 function1, Function2 function2, int i) {
            this(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J§\u0001\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u0007\"\u0004\b\u0007\u0010\b2:\b\u0002\u0010\t\u001a4\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u0001H\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\b0\n23\u0010\u000f\u001a/\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u00120\u00110\u0010JÇ\u0001\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u0007\"\u0004\b\u0007\u0010\b2:\b\u0002\u0010\u0014\u001a4\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u0001H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00070\n2S\b\u0002\u0010\t\u001aM\u0012\u0013\u0012\u0011H\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u0001H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u0001H\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\b0\u0016Jª\u0001\u0010\u0017\u001a\u001a\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u0002H\b0\u0004\"\u0004\b\u0004\u0010\u0005\"\u0004\b\u0005\u0010\u0006\"\u0004\b\u0006\u0010\u0007\"\u0004\b\u0007\u0010\b28\b\u0002\u0010\u0018\u001a2\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00190\n28\b\u0002\u0010\t\u001a2\u0012\u0013\u0012\u0011H\u0006¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\b¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u0002H\b0\n¨\u0006\u001a"}, d2 = {"Lcom/bytedance/jedi/model/merge/MergeStrategy$Companion;", "", "()V", "batchMerge", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "K", "V", "K1", "V1", "merge", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "newV", "curV", "batch", "Lkotlin/Function1;", "", "Lkotlin/Pair;", "keyMerge", "key", "newK", "Lkotlin/Function3;", "predicatedMerge", "predicate", "", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class b {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0004\n\u0002\b\t\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010\u0004\"\u0004\b\u0004\u0010\u0002\"\u0004\b\u0005\u0010\u0003\"\u0004\b\u0006\u0010\u0001\"\u0004\b\u0007\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u00022\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "K1", "K", "V", "V1", "k", "<anonymous parameter 1>", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.jedi.model.e.a$b$a  reason: collision with other inner class name */
        static final class C0214a extends Lambda implements Function2<K, V, K1> {
            public static final C0214a INSTANCE = new C0214a();

            C0214a() {
                super(2);
            }

            public final K1 invoke(K k, @Nullable V v) {
                boolean z = k instanceof Object;
                Object obj = k;
                if (!z) {
                    obj = null;
                }
                if (obj != null) {
                    return obj;
                }
                throw new RuntimeException();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }

        @NotNull
        public static <K, V, K1, V1> a<K, V, K1, V1> a(@NotNull Function2<? super K, ? super V, ? extends K1> function2, @NotNull Function3<? super K, ? super V, ? super V1, ? extends V1> function3) {
            Intrinsics.checkParameterIsNotNull(function2, "key");
            Intrinsics.checkParameterIsNotNull(function3, "merge");
            return new c<>(function2, function3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0004\u0010\u0001*\u0004\b\u0005\u0010\u0002*\u0004\b\u0006\u0010\u0003*\u0004\b\u0007\u0010\u00042\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B\u0001\b\u0000\u0012:\b\u0002\u0010\u0006\u001a4\u0012\u0013\u0012\u00118\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00060\u0007\u0012S\b\u0002\u0010\f\u001aM\u0012\u0013\u0012\u00118\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00018\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00070\r¢\u0006\u0002\u0010\u000fJ@\u0010\u0006\u001a\u00020\u001828\u0010\u0019\u001a4\u0012\u0013\u0012\u00118\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00060\u0007JY\u0010\f\u001a\u00020\u00182Q\u0010\u0019\u001aM\u0012\u0013\u0012\u00118\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00018\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00070\rRL\u0010\u0006\u001a4\u0012\u0013\u0012\u00118\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00060\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013Re\u0010\f\u001aM\u0012\u0013\u0012\u00118\u0004¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0015\u0012\u0013\u0018\u00018\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0015\u0012\u0013\u0018\u00018\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000e\u0012\u0006\u0012\u0004\u0018\u00018\u00070\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/bytedance/jedi/model/merge/MergeStrategy$KeyMerge;", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "key", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "newK", "newV", "merge", "Lkotlin/Function3;", "curV", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;)V", "getKey$model_release", "()Lkotlin/jvm/functions/Function2;", "setKey$model_release", "(Lkotlin/jvm/functions/Function2;)V", "getMerge$model_release", "()Lkotlin/jvm/functions/Function3;", "setMerge$model_release", "(Lkotlin/jvm/functions/Function3;)V", "", "block", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class c<K, V, K1, V1> extends a<K, V, K1, V1> {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public Function2<? super K, ? super V, ? extends K1> f21576b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public Function3<? super K, ? super V, ? super V1, ? extends V1> f21577c;

        public c() {
            this(null, null, 3);
        }

        public final void a(@NotNull Function2<? super K, ? super V, ? extends K1> function2) {
            Intrinsics.checkParameterIsNotNull(function2, "block");
            this.f21576b = function2;
        }

        public final void a(@NotNull Function3<? super K, ? super V, ? super V1, ? extends V1> function3) {
            Intrinsics.checkParameterIsNotNull(function3, "block");
            this.f21577c = function3;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(@NotNull Function2<? super K, ? super V, ? extends K1> function2, @NotNull Function3<? super K, ? super V, ? super V1, ? extends V1> function3) {
            super((byte) 0);
            Intrinsics.checkParameterIsNotNull(function2, "key");
            Intrinsics.checkParameterIsNotNull(function3, "merge");
            this.f21576b = function2;
            this.f21577c = function3;
        }

        public /* synthetic */ c(Function2 function2, Function3 function3, int i) {
            this(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0004\u0010\u0001*\u0004\b\u0005\u0010\u0002*\u0004\b\u0006\u0010\u0003*\u0004\b\u0007\u0010\u00042\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0005B{\b\u0000\u00128\b\u0002\u0010\u0006\u001a2\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007\u00128\b\u0002\u0010\r\u001a2\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00070\u0007¢\u0006\u0002\u0010\u000eJ>\u0010\r\u001a\u00020\u001526\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00070\u0007J>\u0010\u0006\u001a\u00020\u001526\u0010\u0016\u001a2\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007RJ\u0010\r\u001a2\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00028\u00070\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012RJ\u0010\u0006\u001a2\u0012\u0013\u0012\u00118\u0005¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00118\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/bytedance/jedi/model/merge/MergeStrategy$PredicatedMerge;", "K", "V", "K1", "V1", "Lcom/bytedance/jedi/model/merge/MergeStrategy;", "predicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "newV", "curV", "", "merge", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getMerge$model_release", "()Lkotlin/jvm/functions/Function2;", "setMerge$model_release", "(Lkotlin/jvm/functions/Function2;)V", "getPredicate$model_release", "setPredicate$model_release", "", "block", "model_release"}, k = 1, mv = {1, 1, 15})
    public static final class d<K, V, K1, V1> extends a<K, V, K1, V1> {
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        public Function2<? super V, ? super V1, Boolean> f21578b;
        @NotNull

        /* renamed from: c  reason: collision with root package name */
        public Function2<? super V, ? super V1, ? extends V1> f21579c;

        public d() {
            this(null, null, 3);
        }

        public final void a(@NotNull Function2<? super V, ? super V1, Boolean> function2) {
            Intrinsics.checkParameterIsNotNull(function2, "block");
            this.f21578b = function2;
        }

        public final void b(@NotNull Function2<? super V, ? super V1, ? extends V1> function2) {
            Intrinsics.checkParameterIsNotNull(function2, "block");
            this.f21579c = function2;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private d(@NotNull Function2<? super V, ? super V1, Boolean> function2, @NotNull Function2<? super V, ? super V1, ? extends V1> function22) {
            super((byte) 0);
            Intrinsics.checkParameterIsNotNull(function2, "predicate");
            Intrinsics.checkParameterIsNotNull(function22, "merge");
            this.f21578b = function2;
            this.f21579c = function22;
        }

        public /* synthetic */ d(Function2 function2, Function2 function22, int i) {
            this(AnonymousClass1.INSTANCE, AnonymousClass2.INSTANCE);
        }
    }

    private a() {
    }

    public /* synthetic */ a(byte b2) {
        this();
    }
}
