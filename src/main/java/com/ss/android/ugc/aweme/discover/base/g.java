package com.ss.android.ugc.aweme.discover.base;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.mob.e;
import com.ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/base/SearchCommonRequestId;", "Lcom/ss/android/ugc/aweme/discover/base/SearchCommonReducer;", "Lcom/ss/android/ugc/aweme/discover/model/SearchApiResult;", "searchType", "", "getSearchType", "()I", "process", "data", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface g {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42171a;

        @NotNull
        public static SearchApiResult a(g gVar, @NotNull SearchApiResult searchApiResult) {
            String str;
            SearchApiResult searchApiResult2 = searchApiResult;
            if (PatchProxy.isSupport(new Object[]{gVar, searchApiResult2}, null, f42171a, true, 36173, new Class[]{g.class, SearchApiResult.class}, SearchApiResult.class)) {
                return (SearchApiResult) PatchProxy.accessDispatch(new Object[]{gVar, searchApiResult2}, null, f42171a, true, 36173, new Class[]{g.class, SearchApiResult.class}, SearchApiResult.class);
            }
            Intrinsics.checkParameterIsNotNull(searchApiResult2, "data");
            if (TextUtils.isEmpty(searchApiResult.getRequestId())) {
                LogPbBean logPbBean = searchApiResult2.logPb;
                if (logPbBean != null) {
                    str = logPbBean.getImprId();
                } else {
                    str = null;
                }
                searchApiResult2.setRequestId(str);
            }
            e.a().a(gVar.a(), searchApiResult.getRequestId());
            ai.a().a(searchApiResult.getRequestId(), searchApiResult2.logPb);
            QueryCorrectInfo queryCorrectInfo = searchApiResult2.queryCorrectInfo;
            if (queryCorrectInfo != null) {
                queryCorrectInfo.setRequestId(searchApiResult.getRequestId());
            }
            return searchApiResult2;
        }
    }

    int a();
}
