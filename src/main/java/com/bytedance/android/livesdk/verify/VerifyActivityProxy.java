package com.bytedance.android.livesdk.verify;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdkapi.LiveActivityProxy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class VerifyActivityProxy extends LiveActivityProxy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17682a;

    /* renamed from: b  reason: collision with root package name */
    VerifyBrowserFragment f17683b;

    /* renamed from: c  reason: collision with root package name */
    String f17684c;

    /* renamed from: d  reason: collision with root package name */
    String f17685d;
    private CompositeDisposable g = new CompositeDisposable();

    public final boolean c_() {
        if (PatchProxy.isSupport(new Object[0], this, f17682a, false, 13833, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f17682a, false, 13833, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f17683b == null || this.f17683b.getActivity() == null) {
            return false;
        } else {
            this.f17683b.c();
            return true;
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f17682a, false, 13832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17682a, false, 13832, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.g.clear();
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f17682a, false, 13828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17682a, false, 13828, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.f1870f.setContentView(C0906R.layout.aen);
        this.f17683b = new VerifyBrowserFragment();
        if (PatchProxy.isSupport(new Object[0], this, f17682a, false, 13829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f17682a, false, 13829, new Class[0], Void.TYPE);
            return;
        }
        this.g.add(((ZhimaVerifyApi) j.q().d().a(ZhimaVerifyApi.class)).getCertificationEntrance().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new a<Object>(this)));
    }

    public VerifyActivityProxy(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
}
