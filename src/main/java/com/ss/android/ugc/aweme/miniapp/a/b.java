package com.ss.android.ugc.aweme.miniapp.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.IAdEventListener;
import com.ss.android.ugc.aweme.miniapp.c.a.c;
import org.json.JSONObject;

public final class b implements IAdEventListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55412a;

    public final void onAdEvent(Context context, String str, String str2, long j, long j2, String str3, JSONObject jSONObject, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{context, str, str2, new Long(j3), new Long(j4), str3, jSONObject, Integer.valueOf(i)}, this, f55412a, false, 59123, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, String.class, JSONObject.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, str, str2, new Long(j3), new Long(j4), str3, jSONObject, Integer.valueOf(i)}, this, f55412a, false, 59123, new Class[]{Context.class, String.class, String.class, Long.TYPE, Long.TYPE, String.class, JSONObject.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c.a("umeng", str, str2, j, j2, jSONObject);
    }
}
