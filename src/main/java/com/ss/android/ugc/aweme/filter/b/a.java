package com.ss.android.ugc.aweme.filter.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.filter.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\u000b\u001a\u00020\f*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/filter/helper/PreparedFilterMerger;", "", "downloadedFilters", "", "Lcom/ss/android/ugc/aweme/filter/FilterBean;", "(Ljava/util/List;)V", "mergedFilters", "", "mergeWithFilter", "", "newFilter", "containsFilter", "", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47550a;

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f47551b = new ArrayList();

    public a(@Nullable List<? extends h> list) {
        boolean z;
        if (list != null) {
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((h) next).f47598b > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            this.f47551b.addAll((List) arrayList);
        }
    }
}
