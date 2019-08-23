package com.ss.android.ugc.aweme.port.in;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.af;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"removeLegacyEffectModelFiles", "", "context", "Landroid/content/Context;", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class ar {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61125a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
    @DebugMetadata(b = "LegacyEffectModels.kt", c = {}, d = "invokeSuspend", e = "com.ss.android.ugc.aweme.port.in.LegacyEffectModels$removeLegacyEffectModelFiles$1")
    static final class a extends k implements Function2<af, c<? super Unit>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ File $oldEffectModelFilesDir;
        int label;
        private af p$;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(File file, c cVar) {
            super(2, cVar);
            this.$oldEffectModelFilesDir = file;
        }

        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            c<?> cVar2 = cVar;
            if (PatchProxy.isSupport(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 67162, new Class[]{Object.class, c.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{obj, cVar2}, this, changeQuickRedirect, false, 67162, new Class[]{Object.class, c.class}, c.class);
            }
            Intrinsics.checkParameterIsNotNull(cVar2, "completion");
            a aVar = new a(this.$oldEffectModelFilesDir, cVar2);
            aVar.p$ = (af) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            Object obj3 = obj;
            if (PatchProxy.isSupport(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 67163, new Class[]{Object.class, Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj3, obj2}, this, changeQuickRedirect, false, 67163, new Class[]{Object.class, Object.class}, Object.class);
            }
            return ((a) create(obj3, (c) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 67161, new Class[]{Object.class}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 67161, new Class[]{Object.class}, Object.class);
            } else if (this.label == 0) {
                FilesKt.deleteRecursively(this.$oldEffectModelFilesDir);
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
