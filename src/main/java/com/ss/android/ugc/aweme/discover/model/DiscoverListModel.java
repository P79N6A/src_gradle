package com.ss.android.ugc.aweme.discover.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.f.a;
import com.ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.net.m;
import java.util.List;

public class DiscoverListModel extends a<Aweme, DiscoverCellDetailResponse> {
    public static ChangeQuickRedirect changeQuickRedirect;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean isHasMore() {
        return false;
    }

    public void loadMoreList(Object... objArr) {
    }

    public List<Aweme> getItems() {
        if (this.mData == null || ((DiscoverCellDetailResponse) this.mData).cellInfo == null) {
            return null;
        }
        return ((DiscoverCellDetailResponse) this.mData).cellInfo.awemeList;
    }

    static final /* synthetic */ DiscoverCellDetailResponse lambda$loadList$0$DiscoverListModel(i iVar) throws Exception {
        if (iVar.c()) {
            return null;
        }
        if (!iVar.d()) {
            return (DiscoverCellDetailResponse) iVar.e();
        }
        throw iVar.f();
    }

    public void loadLatestList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 37027, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 37027, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        loadList(objArr);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 37028, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 37028, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        loadList(objArr);
    }

    private void loadList(Object[] objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 37029, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 37029, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        DiscoverApi.a().cellDetail(objArr[1].intValue(), objArr[2].booleanValue(), objArr[3]).a(DiscoverListModel$$Lambda$0.$instance).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
