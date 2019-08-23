package com.ss.android.ugc.aweme.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONObject;

public final class en {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75828a;

    /* renamed from: b  reason: collision with root package name */
    private long f75829b = -1;

    /* renamed from: c  reason: collision with root package name */
    private String f75830c;

    /* renamed from: d  reason: collision with root package name */
    private String f75831d;

    /* renamed from: e  reason: collision with root package name */
    private JSONObject f75832e;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f75828a, false, 88619, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f75828a, false, 88619, new Class[0], Void.TYPE);
            return;
        }
        r.onEvent(MobClick.obtain().setEventName(this.f75830c).setLabelName(this.f75831d).setValue(String.valueOf(System.currentTimeMillis() - this.f75829b)).setJsonObject(this.f75832e));
    }

    public final void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f75828a, false, 88617, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f75828a, false, 88617, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str3, str4, null);
    }

    private void a(String str, String str2, JSONObject jSONObject) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, null}, this, f75828a, false, 88618, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, null}, this, f75828a, false, 88618, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        this.f75829b = System.currentTimeMillis();
        this.f75830c = str3;
        this.f75831d = str4;
        this.f75832e = null;
    }
}
