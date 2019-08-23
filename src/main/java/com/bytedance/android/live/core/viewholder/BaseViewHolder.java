package com.bytedance.android.live.core.viewholder;

import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f8335b;

    /* renamed from: a  reason: collision with root package name */
    private final CompositeDisposable f8336a = new CompositeDisposable();

    /* renamed from: c  reason: collision with root package name */
    public boolean f8337c;

    public static T a(Object obj) {
        return obj;
    }

    public abstract void a(T t, int i);

    public boolean b() {
        return false;
    }

    @CallSuper
    public void c() {
        this.f8337c = true;
    }

    @CallSuper
    public void d() {
        this.f8337c = false;
    }

    @CallSuper
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8335b, false, 1454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8335b, false, 1454, new Class[0], Void.TYPE);
            return;
        }
        this.f8336a.clear();
    }

    public BaseViewHolder(View view) {
        super(view);
    }

    public final void a(Disposable disposable) {
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{disposable2}, this, f8335b, false, 1453, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable2}, this, f8335b, false, 1453, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.f8336a.add(disposable2);
    }
}
