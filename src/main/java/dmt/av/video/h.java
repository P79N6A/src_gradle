package dmt.av.video;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class h<T> extends MutableLiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82997a;

    /* renamed from: b  reason: collision with root package name */
    public T f82998b;

    public void setValue(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f82997a, false, 91956, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f82997a, false, 91956, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        super.setValue(t);
        this.f82998b = t2;
    }

    public final void a(LifecycleOwner lifecycleOwner, final b<T> bVar) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, bVar}, this, f82997a, false, 91955, new Class[]{LifecycleOwner.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, bVar}, this, f82997a, false, 91955, new Class[]{LifecycleOwner.class, b.class}, Void.TYPE);
            return;
        }
        super.observe(lifecycleOwner, new Observer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82999a;

            public final void onChanged(@Nullable T t) {
                if (PatchProxy.isSupport(new Object[]{t}, this, f82999a, false, 91957, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f82999a, false, 91957, new Class[]{Object.class}, Void.TYPE);
                    return;
                }
                bVar.a(h.this.f82998b, t);
            }
        });
    }
}
