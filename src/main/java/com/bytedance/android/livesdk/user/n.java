package com.bytedance.android.livesdk.user;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17487a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17488b;

    /* renamed from: c  reason: collision with root package name */
    private final long f17489c;

    /* renamed from: d  reason: collision with root package name */
    private final String f17490d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f17491e;

    /* renamed from: f  reason: collision with root package name */
    private final String f17492f;
    private final String g;
    private final DialogInterface.OnClickListener h;

    n(String str, long j, String str2, boolean z, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.f17488b = str;
        this.f17489c = j;
        this.f17490d = str2;
        this.f17491e = z;
        this.f17492f = str3;
        this.g = str4;
        this.h = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17487a, false, 13572, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f17487a, false, 13572, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = this.f17488b;
        long j = this.f17489c;
        String str2 = this.f17490d;
        boolean z = this.f17491e;
        String str3 = this.f17492f;
        String str4 = this.g;
        DialogInterface.OnClickListener onClickListener = this.h;
        try {
            new JSONObject().put("source", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_source", str);
        hashMap.put("user_id", String.valueOf(j));
        hashMap.put("enter_from", str2);
        hashMap.put("source", str2);
        if (z) {
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "video");
            hashMap.put("event_module", "toast");
            if (!StringUtils.isEmpty(str3)) {
                hashMap.put("event_page", str3);
            }
            if (!StringUtils.isEmpty(str4)) {
                hashMap.put("enter_from", str4);
            }
        }
        TTLiveSDKContext.getHostService().d().a("unfollow_popup_confirm", hashMap);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
