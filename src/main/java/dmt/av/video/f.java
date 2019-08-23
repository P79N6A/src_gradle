package dmt.av.video;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Observer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;

public class f<T> extends MutableLiveData<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f82989a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<T> f82990b = new ArrayList<>();

    public void setValue(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f82989a, false, 91953, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2}, this, f82989a, false, 91953, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        super.setValue(t);
        this.f82990b.add(t2);
    }

    public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull final Observer<T> observer) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner, observer}, this, f82989a, false, 91952, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner, observer}, this, f82989a, false, 91952, new Class[]{LifecycleOwner.class, Observer.class}, Void.TYPE);
            return;
        }
        super.observe(lifecycleOwner, new Observer<T>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f82991a;

            /* renamed from: b  reason: collision with root package name */
            boolean f82992b;

            public final void onChanged(@Nullable T t) {
                if (PatchProxy.isSupport(new Object[]{t}, this, f82991a, false, 91954, new Class[]{Object.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{t}, this, f82991a, false, 91954, new Class[]{Object.class}, Void.TYPE);
                    return;
                }
                if (this.f82992b || f.this.f82990b.isEmpty()) {
                    observer.onChanged(t);
                } else {
                    for (int i = 0; i < f.this.f82990b.size(); i++) {
                        observer.onChanged(f.this.f82990b.get(i));
                    }
                }
                this.f82992b = true;
            }
        });
    }
}
