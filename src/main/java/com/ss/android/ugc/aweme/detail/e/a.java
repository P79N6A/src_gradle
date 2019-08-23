package com.ss.android.ugc.aweme.detail.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.detail.model.BatchDetailList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.a<BatchDetailList> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41179a;

    /* renamed from: b  reason: collision with root package name */
    public int f41180b = 1;

    public a(int i) {
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        return true;
    }

    public final boolean sendRequest(final Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f41179a, false, 34992, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f41179a, false, 34992, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        } else if (!super.sendRequest(objArr)) {
            return false;
        } else {
            m.a().a(this.mHandler, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f41181a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f41181a, false, 34994, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f41181a, false, 34994, new Class[0], Object.class);
                    }
                    String str = "";
                    if (objArr.length > 1 && objArr[1] != null) {
                        str = (String) objArr[1];
                    }
                    String str2 = "";
                    if (objArr.length > 2 && objArr[2] != null) {
                        str2 = (String) objArr[2];
                    }
                    String str3 = (String) objArr[0];
                    if (!PatchProxy.isSupport(new Object[]{str3, str, str2}, null, DetailApi.f41156a, true, 34726, new Class[]{String.class, String.class, String.class}, BatchDetailList.class)) {
                        return (BatchDetailList) DetailApi.f41157b.queryBatchAweme(str3, str2, str).execute().body();
                    }
                    return (BatchDetailList) PatchProxy.accessDispatch(new Object[]{str3, str, str2}, null, DetailApi.f41156a, true, 34726, new Class[]{String.class, String.class, String.class}, BatchDetailList.class);
                }
            }, 0);
            return true;
        }
    }

    public final /* synthetic */ void handleData(Object obj) {
        BatchDetailList batchDetailList = (BatchDetailList) obj;
        if (PatchProxy.isSupport(new Object[]{batchDetailList}, this, f41179a, false, 34993, new Class[]{BatchDetailList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{batchDetailList}, this, f41179a, false, 34993, new Class[]{BatchDetailList.class}, Void.TYPE);
            return;
        }
        if (batchDetailList != null) {
            super.handleData(batchDetailList);
            int size = batchDetailList.getItems().size();
            for (int i = 0; i < size; i++) {
                Aweme a2 = com.ss.android.ugc.aweme.feed.a.a().a((Aweme) batchDetailList.getItems().get(i));
                com.ss.android.ugc.aweme.feed.a a3 = com.ss.android.ugc.aweme.feed.a.a();
                a3.a(a2.getAid() + this.f41180b, batchDetailList.getRequestId(), i);
                batchDetailList.getItems().set(i, a2);
            }
        }
    }
}
