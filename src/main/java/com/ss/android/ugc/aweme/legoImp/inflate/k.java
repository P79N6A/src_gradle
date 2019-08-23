package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.x2c.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.lego.c;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class k implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53104a;

    /* renamed from: b  reason: collision with root package name */
    private int f53105b = -1;

    /* renamed from: c  reason: collision with root package name */
    private List<SparseArray<View>> f53106c = new ArrayList();

    /* access modifiers changed from: package-private */
    public abstract int[] b();

    public int c() {
        return 1;
    }

    public final Class<? extends Activity> a() {
        return MainActivity.class;
    }

    private boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f53104a, false, 55198, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53104a, false, 55198, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f53105b == -1) {
            this.f53105b = ((Integer) SharePrefCache.inst().getX2cSwitch().c()).intValue();
        }
        if (this.f53105b == 1) {
            return true;
        }
        return false;
    }

    private boolean e() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f53104a, false, 55199, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53104a, false, 55199, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f53105b == -1) {
            this.f53105b = ((Integer) SharePrefCache.inst().getX2cSwitch().c()).intValue();
        }
        if (this.f53105b == 2) {
            z = true;
        }
        return z;
    }

    public final View a(Context context, int i) {
        Context context2 = context;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{context2, Integer.valueOf(i)}, this, f53104a, false, 55197, new Class[]{Context.class, Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, Integer.valueOf(i)}, this, f53104a, false, 55197, new Class[]{Context.class, Integer.TYPE}, View.class);
        } else if (e()) {
            for (SparseArray next : this.f53106c) {
                View view = (View) next.get(i2);
                if (view != null) {
                    next.remove(i2);
                    return view;
                }
            }
            return d.a(context2, i2, new FrameLayout(context2), false);
        } else {
            if (d()) {
                return d.a(context2, i2, new FrameLayout(context2), false);
            }
            return LayoutInflater.from(context).inflate(i2, new FrameLayout(context2), false);
        }
    }

    @MeasureFunction
    public final void a(@NotNull Context context, @Nullable Activity activity) {
        if (PatchProxy.isSupport(new Object[]{context, activity}, this, f53104a, false, 55196, new Class[]{Context.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, activity}, this, f53104a, false, 55196, new Class[]{Context.class, Activity.class}, Void.TYPE);
            return;
        }
        if (activity != null && e()) {
            for (int i = 0; i < c(); i++) {
                this.f53106c.add(new SparseArray());
            }
            for (SparseArray next : this.f53106c) {
                for (int i2 : b()) {
                    next.put(i2, d.a(activity, i2, new FrameLayout(activity), false));
                }
            }
        }
    }
}
