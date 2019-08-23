package com.ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lego.c;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.bytex.a.a.a;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53099a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Object> f53100b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Integer, Drawable> f53101c = new ConcurrentHashMap();

    @Nullable
    public final Class<? extends Activity> a() {
        return MainActivity.class;
    }

    public final int a(Context context) {
        int i;
        if (PatchProxy.isSupport(new Object[]{context}, this, f53099a, false, 55191, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f53099a, false, 55191, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Object obj = this.f53100b.get("status_bar_height");
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else {
            i = StatusBarUtils.getStatusBarHeight(context);
            this.f53100b.put("status_bar_height", Integer.valueOf(i));
        }
        return i;
    }

    @MeasureFunction
    public final void a(@NotNull Context context, @Nullable Activity activity) {
        if (PatchProxy.isSupport(new Object[]{context, activity}, this, f53099a, false, 55189, new Class[]{Context.class, Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, activity}, this, f53099a, false, 55189, new Class[]{Context.class, Activity.class}, Void.TYPE);
            return;
        }
        a(2130839858, context, false);
        a(2130838968, context, false);
        Integer valueOf = Integer.valueOf(context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android")));
        if (PatchProxy.isSupport(new Object[]{"status_bar_height", valueOf}, this, f53099a, false, 55193, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"status_bar_height", valueOf}, this, f53099a, false, 55193, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.f53100b.put("status_bar_height", valueOf);
    }

    private void a(int i, Context context, boolean z) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), context, (byte) 0}, this, f53099a, false, 55192, new Class[]{Integer.TYPE, Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), context, (byte) 0}, this, f53099a, false, 55192, new Class[]{Integer.TYPE, Context.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        try {
            a.a(context.getResources(), i);
        } catch (Exception unused) {
        }
    }
}
