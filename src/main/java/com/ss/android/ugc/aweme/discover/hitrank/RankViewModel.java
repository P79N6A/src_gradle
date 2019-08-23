package com.ss.android.ugc.aweme.discover.hitrank;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.concurrent.Callable;

public class RankViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42378a;

    /* renamed from: b  reason: collision with root package name */
    HitNotice f42379b;

    /* renamed from: c  reason: collision with root package name */
    RankApi f42380c;

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<d> f42381d;

    public final MutableLiveData<d> a() {
        if (PatchProxy.isSupport(new Object[0], this, f42378a, false, 36409, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f42378a, false, 36409, new Class[0], MutableLiveData.class);
        }
        if (this.f42381d == null) {
            this.f42381d = new MutableLiveData<>();
        }
        return this.f42381d;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f42378a, false, 36412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42378a, false, 36412, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        bg.d(this);
    }

    public final void a(String str, String str2) {
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f42378a, false, 36410, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f42378a, false, 36410, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f42380c == null) {
            this.f42380c = (RankApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RankApi.class);
        }
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f42378a, false, 36411, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, this, f42378a, false, 36411, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new g<TResult>(this, str, str2)).a((g<TResult, TContinuationResult>) new h<TResult,TContinuationResult>(this), i.f1052b);
    }
}
