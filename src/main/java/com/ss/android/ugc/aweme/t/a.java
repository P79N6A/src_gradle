package com.ss.android.ugc.aweme.t;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements com.ss.android.ugc.playerkit.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74530a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f74531b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f74532c = com.ss.android.ugc.aweme.g.a.a();

    public final void a(String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str3}, this, f74530a, false, 56298, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str3}, this, f74530a, false, 56298, new Class[]{String.class, String.class, String.class}, Void.TYPE);
        } else if (f74531b) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt_video_uid", d.a().getCurUserId());
                jSONObject.put("dmt_video_log_tag", str5);
                jSONObject.put("dmt_video_log_type", "Debug");
                jSONObject.put("dmt_video_log_msg", str6);
                if (str3 == null) {
                    str4 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                } else {
                    str4 = str3;
                }
                jSONObject.put("dmt_video_log_vid", str4);
                n.a("dmt_video_log", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str3}, this, f74530a, false, 56303, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str3}, this, f74530a, false, 56303, new Class[]{String.class, String.class, String.class}, Void.TYPE);
        } else if (f74531b) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt_video_uid", d.a().getCurUserId());
                jSONObject.put("dmt_video_log_tag", str5);
                jSONObject.put("dmt_video_log_type", "Info");
                jSONObject.put("dmt_video_log_msg", str6);
                if (str3 == null) {
                    str4 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                } else {
                    str4 = str3;
                }
                jSONObject.put("dmt_video_log_vid", str4);
                n.a("dmt_video_log", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final void c(String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str3}, this, f74530a, false, 56305, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str3}, this, f74530a, false, 56305, new Class[]{String.class, String.class, String.class}, Void.TYPE);
        } else if (f74531b) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt_video_uid", d.a().getCurUserId());
                jSONObject.put("dmt_video_log_tag", str5);
                jSONObject.put("dmt_video_log_type", "Warn");
                jSONObject.put("dmt_video_log_msg", str6);
                if (str3 == null) {
                    str4 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                } else {
                    str4 = str3;
                }
                jSONObject.put("dmt_video_log_vid", str4);
                n.a("dmt_video_log", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public final void d(String str, String str2, String str3) {
        String str4;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str3}, this, f74530a, false, 56307, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str3}, this, f74530a, false, 56307, new Class[]{String.class, String.class, String.class}, Void.TYPE);
        } else if (f74531b) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt_video_uid", d.a().getCurUserId());
                jSONObject.put("dmt_video_log_tag", str5);
                jSONObject.put("dmt_video_log_type", "Error");
                jSONObject.put("dmt_video_log_msg", str6);
                if (str3 == null) {
                    str4 = com.ss.android.ugc.playerkit.session.a.a().b().uri;
                } else {
                    str4 = str3;
                }
                jSONObject.put("dmt_video_log_vid", str4);
                n.a("dmt_video_log", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
