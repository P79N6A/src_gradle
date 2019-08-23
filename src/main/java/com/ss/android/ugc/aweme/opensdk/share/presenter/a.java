package com.ss.android.ugc.aweme.opensdk.share.presenter;

import android.arch.lifecycle.LifecycleOwner;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.opensdk.share.api.ClientScopesApi;
import com.ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse;
import io.reactivex.disposables.CompositeDisposable;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58399a;

    /* renamed from: b  reason: collision with root package name */
    ClientScopesApi f58400b;

    /* renamed from: c  reason: collision with root package name */
    public CompositeDisposable f58401c;

    /* renamed from: d  reason: collision with root package name */
    public ClientKeyScopesResponse f58402d;

    /* renamed from: com.ss.android.ugc.aweme.opensdk.share.presenter.a$a  reason: collision with other inner class name */
    public interface C0658a {
        void a();

        void a(String str);

        void b();
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f58399a, false, 63430, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58399a, false, 63430, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f58402d == null || this.f58402d.getData() == null || this.f58402d.getData().getScopes() == null) {
            return false;
        } else {
            for (ClientKeyScopesResponse.DataBean.ScopesBean name : this.f58402d.getData().getScopes()) {
                if (TextUtils.equals(name.getName(), "hashtag")) {
                    return true;
                }
            }
            return false;
        }
    }

    public a(LifecycleOwner lifecycleOwner) {
        ClientScopesApi clientScopesApi;
        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.opensdk.share.api.a.f58389a, true, 63407, new Class[0], ClientScopesApi.class)) {
            clientScopesApi = (ClientScopesApi) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.opensdk.share.api.a.f58389a, true, 63407, new Class[0], ClientScopesApi.class);
        } else {
            clientScopesApi = (ClientScopesApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://open.douyin.com").create(ClientScopesApi.class);
        }
        this.f58400b = clientScopesApi;
        this.f58401c = new CompositeDisposable();
        lifecycleOwner.getLifecycle().addObserver(new ClientKeyScopesPresenter$1(this));
    }
}
