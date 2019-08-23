package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.d.b;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.story.live.a;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53083a;

    /* renamed from: b  reason: collision with root package name */
    private b f53084b;

    @Nullable
    public final Class<? extends Activity> a() {
        return MainActivity.class;
    }

    public final b a(Context context) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{context}, this, f53083a, false, 55177, new Class[]{Context.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{context}, this, f53083a, false, 55177, new Class[]{Context.class}, b.class);
        }
        if (this.f53084b != null) {
            bVar = this.f53084b;
            this.f53084b = null;
        } else {
            bVar = b.a(context);
        }
        return bVar;
    }

    public final a a(Context context, boolean z) {
        if (!PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0)}, this, f53083a, false, 55176, new Class[]{Context.class, Boolean.TYPE}, a.class)) {
            return com.ss.android.ugc.aweme.main.story.live.b.a(context, z);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z)}, this, f53083a, false, 55176, new Class[]{Context.class, Boolean.TYPE}, a.class);
    }

    @MeasureFunction
    public final void a(@NotNull Context context, @Nullable Activity activity) {
        if (PatchProxy.isSupport(new Object[]{context, activity}, this, f53083a, false, 55175, new Class[]{Context.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, activity}, this, f53083a, false, 55175, new Class[]{Context.class, Activity.class}, Void.TYPE);
            return;
        }
        if (activity != null) {
            try {
                try {
                    this.f53084b = b.a((Context) activity);
                    return;
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
            }
        }
    }
}
