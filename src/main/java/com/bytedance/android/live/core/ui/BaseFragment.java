package com.bytedance.android.live.core.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class BaseFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f8190d;

    /* renamed from: a  reason: collision with root package name */
    private final CompositeDisposable f8191a = new CompositeDisposable();

    /* renamed from: e  reason: collision with root package name */
    public boolean f8192e;

    /* renamed from: f  reason: collision with root package name */
    protected boolean f8193f;
    public boolean g;

    public boolean b_() {
        return this.f8193f;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f8190d, false, 951, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8190d, false, 951, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.f8193f = false;
        this.g = true;
        this.f8191a.clear();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f8190d, false, 950, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8190d, false, 950, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.f8193f = false;
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f8190d, false, 949, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8190d, false, 949, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.f8192e = false;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f8190d, false, 948, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8190d, false, 948, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        this.f8192e = true;
    }

    public void a(Disposable disposable) {
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{disposable2}, this, f8190d, false, 945, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable2}, this, f8190d, false, 945, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.f8191a.add(disposable2);
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f8190d, false, 946, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f8190d, false, 946, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        this.f8192e = false;
        this.f8193f = false;
        this.g = false;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f8190d, false, 947, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f8190d, false, 947, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f8193f = true;
    }
}
