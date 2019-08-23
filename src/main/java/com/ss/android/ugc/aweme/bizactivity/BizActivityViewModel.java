package com.ss.android.ugc.aweme.bizactivity;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import com.bytedance.android.live.base.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bizactivity.h;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.Subscribe;

public class BizActivityViewModel extends ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2797a;

    /* renamed from: b  reason: collision with root package name */
    h.a f2798b;

    /* renamed from: c  reason: collision with root package name */
    BizActivityApi f2799c;

    /* renamed from: d  reason: collision with root package name */
    private MutableLiveData<g> f2800d;

    public final MutableLiveData<g> a() {
        if (PatchProxy.isSupport(new Object[0], this, f2797a, false, 25697, new Class[0], MutableLiveData.class)) {
            return (MutableLiveData) PatchProxy.accessDispatch(new Object[0], this, f2797a, false, 25697, new Class[0], MutableLiveData.class);
        }
        if (this.f2800d == null) {
            this.f2800d = new MutableLiveData<>();
        }
        return this.f2800d;
    }

    public void onCleared() {
        if (PatchProxy.isSupport(new Object[0], this, f2797a, false, 25702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2797a, false, 25702, new Class[0], Void.TYPE);
            return;
        }
        super.onCleared();
        bg.d(this);
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f2797a, false, 25699, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f2797a, false, 25699, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new i<TResult>(this)).a((g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(this, i), i.f1052b);
    }

    @Subscribe
    public void onEvent(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2797a, false, 25700, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2797a, false, 25700, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (this.f2798b != null && this.f2798b.f35234b == aVar.f7685b) {
            bg.d(this);
            a().postValue(new g(-1, null));
        }
    }
}
