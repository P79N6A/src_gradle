package com.ss.android.ugc.aweme.discover.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0006H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"DELAYED_MILLI_SECOND", "", "lazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class an {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43125a;

    public static final <T> Lazy<T> a(Function0<? extends T> function0) {
        Function0<? extends T> function02 = function0;
        if (!PatchProxy.isSupport(new Object[]{function02}, null, f43125a, true, 37916, new Class[]{Function0.class}, Lazy.class)) {
            return LazyKt.lazy(LazyThreadSafetyMode.NONE, function02);
        }
        return (Lazy) PatchProxy.accessDispatch(new Object[]{function02}, null, f43125a, true, 37916, new Class[]{Function0.class}, Lazy.class);
    }
}