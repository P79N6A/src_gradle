package com.ss.android.ugc.aweme.filter.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.h;
import com.ss.android.ugc.aweme.filter.o;
import com.ss.android.ugc.aweme.filter.v;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/merger/FilterBoxFilterMergeStrategy;", "Lcom/ss/android/ugc/aweme/filter/merger/IFilterMergeStrategy;", "()V", "isFilterAvailable", "", "filterBean", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47570a;

    public final boolean a(@Nullable h hVar) {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2}, this, f47570a, false, 44455, new Class[]{h.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{hVar2}, this, f47570a, false, 44455, new Class[]{h.class}, Boolean.TYPE)).booleanValue();
        } else if (hVar2 == null) {
            return false;
        } else {
            if (!(hVar2 instanceof o)) {
                return v.a().b(hVar2.f47598b);
            }
            o oVar = (o) hVar2;
            if (!oVar.l || !v.a().b(oVar.f47598b)) {
                return false;
            }
            return true;
        }
    }
}
