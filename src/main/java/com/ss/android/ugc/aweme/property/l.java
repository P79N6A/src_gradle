package com.ss.android.ugc.aweme.property;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;
import com.ss.android.ugc.aweme.property.g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u0002H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"getProperty", "T", "Lcom/ss/android/ugc/aweme/property/AVSettings$Property;", "(Lcom/ss/android/ugc/aweme/property/AVSettings$Property;)Ljava/lang/Object;", "setProperty", "", "value", "(Lcom/ss/android/ugc/aweme/property/AVSettings$Property;Ljava/lang/Object;)V", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63300a;

    public static final <T> T a(@NotNull e.a aVar) {
        e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f63300a, true, 70309, new Class[]{e.a.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{aVar2}, null, f63300a, true, 70309, new Class[]{e.a.class}, Object.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "$this$getProperty");
        g.b type = aVar.type();
        if (type != null) {
            switch (m.f63301a[type.ordinal()]) {
                case 1:
                    return Integer.valueOf(a.L.b(aVar2));
                case 2:
                    return Long.valueOf(a.L.c(aVar2));
                case 3:
                    return Float.valueOf(a.L.d(aVar2));
                case 4:
                    return a.L.e(aVar2);
                case 5:
                    return Boolean.valueOf(a.L.a(aVar2));
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new AssertionError();
        }
    }

    public static final <T> void a(@NotNull e.a aVar, T t) {
        e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2, t}, null, f63300a, true, 70310, new Class[]{e.a.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, t}, null, f63300a, true, 70310, new Class[]{e.a.class, Object.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "$this$setProperty");
        g.b type = aVar.type();
        if (type != null) {
            switch (m.f63302b[type.ordinal()]) {
                case 1:
                    e eVar = a.L;
                    if (t != null) {
                        eVar.a(aVar2, ((Integer) t).intValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                case 2:
                    e eVar2 = a.L;
                    if (t != null) {
                        eVar2.a(aVar2, ((Long) t).longValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
                case 3:
                    e eVar3 = a.L;
                    if (t != null) {
                        eVar3.a(aVar2, ((Float) t).floatValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
                case 4:
                    e eVar4 = a.L;
                    if (t != null) {
                        eVar4.a(aVar2, (String) t);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                case 5:
                    e eVar5 = a.L;
                    if (t != null) {
                        eVar5.a(aVar2, ((Boolean) t).booleanValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
                default:
                    return;
            }
        } else {
            throw new AssertionError();
        }
    }
}
