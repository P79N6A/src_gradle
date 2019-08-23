package com.bytedance.android.livesdk.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.chatroom.api.AssetAuthorizeApi;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AssetAuthorizeViewModel extends RxViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17717a;

    /* renamed from: b  reason: collision with root package name */
    public AssetAuthorizeApi f17718b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableLiveData<Boolean> f17719c = new MutableLiveData<>();

    public AssetAuthorizeViewModel() {
        AssetAuthorizeApi assetAuthorizeApi;
        y d2 = j.q().d();
        if (PatchProxy.isSupport(new Object[0], d2, y.f18599a, false, 2656, new Class[0], AssetAuthorizeApi.class)) {
            assetAuthorizeApi = (AssetAuthorizeApi) PatchProxy.accessDispatch(new Object[0], d2, y.f18599a, false, 2656, new Class[0], AssetAuthorizeApi.class);
        } else {
            assetAuthorizeApi = (AssetAuthorizeApi) d2.a(AssetAuthorizeApi.class);
        }
        this.f17718b = assetAuthorizeApi;
    }
}
