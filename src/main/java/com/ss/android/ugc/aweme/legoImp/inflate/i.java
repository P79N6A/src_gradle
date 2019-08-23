package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.c;
import com.ss.android.ugc.bytex.a.a.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53102a;

    /* renamed from: b  reason: collision with root package name */
    private Drawable f53103b;

    @Nullable
    public final Class<? extends Activity> a() {
        return null;
    }

    public final Drawable a(Context context) {
        Drawable drawable;
        if (PatchProxy.isSupport(new Object[]{context}, this, f53102a, false, 55195, new Class[]{Context.class}, Drawable.class)) {
            return (Drawable) PatchProxy.accessDispatch(new Object[]{context}, this, f53102a, false, 55195, new Class[]{Context.class}, Drawable.class);
        }
        if (this.f53103b != null) {
            drawable = this.f53103b;
            this.f53103b = null;
        } else {
            try {
                drawable = a.a(context.getResources(), 2130840559);
            } catch (Exception unused) {
                drawable = null;
            }
        }
        return drawable;
    }

    public final void a(@NotNull Context context, @Nullable Activity activity) {
        if (PatchProxy.isSupport(new Object[]{context, activity}, this, f53102a, false, 55194, new Class[]{Context.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, activity}, this, f53102a, false, 55194, new Class[]{Context.class, Activity.class}, Void.TYPE);
            return;
        }
        try {
            try {
                this.f53103b = a.a(context.getResources(), 2130840559);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
