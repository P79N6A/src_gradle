package com.ss.android.ugc.aweme.profile.model;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.profile.api.SelectCityApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class SelelctCityModel extends a<CityListBean> {
    private static final SelectCityApi S_API = ((SelectCityApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(SelectCityApi.class));
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<String> indexs = new ArrayList<>();

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public List<String> getCityIndexData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67504, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67504, new Class[0], List.class);
        } else if (this.mData == null || ((CityListBean) this.mData).data == null || ((CityListBean) this.mData).data.isEmpty()) {
            return null;
        } else {
            if (this.indexs.size() == 0) {
                this.indexs.add(0, k.a().getResources().getString(C0906R.string.bi0));
                for (CityBean cityBean : ((CityListBean) this.mData).data) {
                    this.indexs.add(cityBean.name);
                }
            }
            return this.indexs;
        }
    }

    static final /* synthetic */ Void lambda$uploadLocation$0$SelelctCityModel(boolean z) throws Exception {
        try {
            S_API.hideLocation(z ^ true ? 1 : 0);
        } catch (Exception unused) {
        }
        return null;
    }

    public static void uploadLocation(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, null, changeQuickRedirect, true, 67506, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, null, changeQuickRedirect, true, 67506, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new SelelctCityModel$$Lambda$0<TResult>(z), (Executor) i.f1051a);
    }

    public boolean sendRequest(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, changeQuickRedirect, false, 67503, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, changeQuickRedirect, false, 67503, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        S_API.queryCityList().a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0), i.f1052b);
        return true;
    }

    public List<String> getCityData(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 67505, new Class[]{Integer.TYPE}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 67505, new Class[]{Integer.TYPE}, List.class);
        } else if (i == 0) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(k.a().getResources().getString(C0906R.string.do1));
            return arrayList;
        } else if (this.mData == null || ((CityListBean) this.mData).data == null || ((CityListBean) this.mData).data.isEmpty()) {
            return null;
        } else {
            int i2 = i - 1;
            if (((CityListBean) this.mData).data.get(i2) != null) {
                return ((CityListBean) this.mData).data.get(i2).cities;
            }
            return null;
        }
    }
}
