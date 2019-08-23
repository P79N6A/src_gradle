package com.bytedance.android.livesdk.viewmodel;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.model.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17744a;

    /* renamed from: b  reason: collision with root package name */
    private final AssetAuthorizeViewModel f17745b;

    public a(AssetAuthorizeViewModel assetAuthorizeViewModel) {
        this.f17745b = assetAuthorizeViewModel;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f17744a, false, 13854, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f17744a, false, 13854, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        AssetAuthorizeViewModel assetAuthorizeViewModel = this.f17745b;
        d dVar = (d) obj;
        if (!(dVar == null || dVar.f7871b == null)) {
            assetAuthorizeViewModel.f17719c.postValue(Boolean.valueOf(((c.a) dVar.f7871b).f11102a));
        }
    }
}
