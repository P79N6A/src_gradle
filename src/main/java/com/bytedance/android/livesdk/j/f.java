package com.bytedance.android.livesdk.j;

import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

@Deprecated
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15714a;

    /* renamed from: b  reason: collision with root package name */
    private Context f15715b;

    private void a(String str, String str2, String str3, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, new Long(j3), new Long(j4)}, this, f15714a, false, 10879, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, str3, new Long(j3), new Long(j4)}, this, f15714a, false, 10879, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
        }
    }

    public final void a(String str, String str2, long j, long j2, JSONObject jSONObject) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j3), new Long(j4), jSONObject}, this, f15714a, false, 10880, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j3), new Long(j4), jSONObject}, this, f15714a, false, 10880, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
        }
    }

    private f(Context context) {
        this.f15715b = context;
    }

    public static f a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f15714a, true, 10876, new Class[]{Context.class}, f.class)) {
            return new f(context2);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{context2}, null, f15714a, true, 10876, new Class[]{Context.class}, f.class);
    }

    public static f a(View view) {
        if (!PatchProxy.isSupport(new Object[]{view}, null, f15714a, true, 10877, new Class[]{View.class}, f.class)) {
            return a(view.getContext());
        }
        return (f) PatchProxy.accessDispatch(new Object[]{view}, null, f15714a, true, 10877, new Class[]{View.class}, f.class);
    }

    public final void a(String str, String str2, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j3), new Long(j4)}, this, f15714a, false, 10878, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {str, str2, new Long(j3), new Long(j4)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f15714a, false, 10878, new Class[]{String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a("umeng", str, str2, j, j2);
    }
}
