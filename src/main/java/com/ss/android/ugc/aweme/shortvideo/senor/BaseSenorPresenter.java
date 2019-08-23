package com.ss.android.ugc.aweme.shortvideo.senor;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.hardware.SensorManager;
import android.util.SparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class BaseSenorPresenter implements ISenorPresenter {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f3965b;

    /* renamed from: a  reason: collision with root package name */
    private SensorManager f3966a;

    /* renamed from: c  reason: collision with root package name */
    protected SparseArray<Integer> f3967c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private List<a> f3968d;

    /* renamed from: e  reason: collision with root package name */
    private Context f3969e;

    public final SensorManager b() {
        return this.f3966a;
    }

    public final Context c() {
        return this.f3969e;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void unRegister() {
        if (PatchProxy.isSupport(new Object[0], this, f3965b, false, 78485, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3965b, false, 78485, new Class[0], Void.TYPE);
            return;
        }
        for (a unregisterListener : this.f3968d) {
            this.f3966a.unregisterListener(unregisterListener);
        }
    }

    public final void a(a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f3965b, false, 78488, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f3965b, false, 78488, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f3968d.add(aVar2);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3965b, false, 78489, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3965b, false, 78489, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (a aVar : this.f3968d) {
            aVar.f69162d = z;
        }
    }

    public BaseSenorPresenter(Context context, final LifecycleOwner lifecycleOwner) {
        this.f3969e = context;
        this.f3968d = new CopyOnWriteArrayList();
        this.f3966a = (SensorManager) context.getSystemService("sensor");
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69157a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f69157a, false, 78490, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f69157a, false, 78490, new Class[0], Void.TYPE);
                    return;
                }
                lifecycleOwner.getLifecycle().addObserver(BaseSenorPresenter.this);
            }
        });
    }

    public final void a(int i, int i2) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), 0}, this, f3965b, false, 78486, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), 0}, this, f3965b, false, 78486, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (i3 != 0) {
            this.f3967c.put(i3, 0);
        }
    }

    public final int b(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f3965b, false, 78487, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f3965b, false, 78487, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        Integer num = this.f3967c.get(i);
        if (num == null) {
            return i2;
        }
        return num.intValue();
    }
}
