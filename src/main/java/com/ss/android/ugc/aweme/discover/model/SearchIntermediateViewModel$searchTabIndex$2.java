package com.ss.android.ugc.aweme.discover.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/arch/widgets/base/NextLiveData;", "", "invoke"}, k = 3, mv = {1, 1, 15})
final class SearchIntermediateViewModel$searchTabIndex$2 extends Lambda implements Function0<b<Integer>> {
    public static final SearchIntermediateViewModel$searchTabIndex$2 INSTANCE = new SearchIntermediateViewModel$searchTabIndex$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    SearchIntermediateViewModel$searchTabIndex$2() {
        super(0);
    }

    @NotNull
    public final b<Integer> invoke() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 37102, new Class[0], b.class)) {
            return new b<>();
        }
        return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 37102, new Class[0], b.class);
    }
}
