package com.ss.android.pushmanager.setting;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.message.a;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.Map;
import org.json.JSONObject;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2543a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f2544b = "b";

    /* renamed from: d  reason: collision with root package name */
    private static b f2545d;

    /* renamed from: c  reason: collision with root package name */
    public PushMultiProcessSharedProvider.b f2546c = PushMultiProcessSharedProvider.a((Context) a.a());

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f2543a, true, 19182, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f2543a, true, 19182, new Class[0], b.class);
        }
        if (f2545d == null) {
            synchronized (b.class) {
                if (f2545d == null) {
                    f2545d = new b();
                }
            }
        }
        return f2545d;
    }

    private boolean w() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19259, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("key_is_miui_close_daemon", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19259, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean b() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19184, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("shut_push_on_stop_service", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19184, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f2543a, false, 19187, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19187, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!this.f2546c.a("push_notify_enable", true) || !p()) {
            return false;
        } else {
            return true;
        }
    }

    public final String d() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19189, new Class[0], String.class)) {
            return this.f2546c.a("loc", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19189, new Class[0], String.class);
    }

    public final boolean f() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19192, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("allow_network", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19192, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final String g() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19194, new Class[0], String.class)) {
            return this.f2546c.a("uninstall_question_url", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19194, new Class[0], String.class);
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19196, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("allow_push_job_service", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19196, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean j() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19210, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("allow_close_boot_receiver", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19210, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2543a, false, 19211, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19211, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!c() && b()) {
            z = true;
        }
        return z;
    }

    public final boolean l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2543a, false, 19213, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19213, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f2546c.a("allow_self_push_enable", false) && c()) {
            z = true;
        }
        return z;
    }

    public final String m() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19217, new Class[0], String.class)) {
            return this.f2546c.a("push_channels_json_array", "");
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19217, new Class[0], String.class);
    }

    public final String n() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19221, new Class[0], String.class)) {
            return a.a().b();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19221, new Class[0], String.class);
    }

    public final boolean o() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19223, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("allow_off_alive", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19223, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean p() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19229, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("allow_settings_notify_enable", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19229, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean q() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19243, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("is_receiver_message_wakeup_screen", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19243, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int r() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19245, new Class[0], Integer.TYPE)) {
            return this.f2546c.a("receiver_message_wakeup_screen_time", 5000);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19245, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean s() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19247, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("is_use_start_foreground_notification", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19247, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final int t() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19249, new Class[0], Integer.TYPE)) {
            return this.f2546c.a("job_schedule_wake_up_interval_second", 3600);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19249, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean u() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19251, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("is_use_c_native_process_keep_alive", true);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19251, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final boolean v() {
        if (!PatchProxy.isSupport(new Object[0], this, f2543a, false, 19261, new Class[0], Boolean.TYPE)) {
            return this.f2546c.a("is_upload_push_log_2_applog", false);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19261, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final Pair<Double, Double> e() {
        if (PatchProxy.isSupport(new Object[0], this, f2543a, false, 19190, new Class[0], Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19190, new Class[0], Pair.class);
        }
        Logger.debug();
        try {
            String d2 = d();
            Logger.debug();
            if (StringUtils.isEmpty(d2)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(d2);
            Double.valueOf(0.0d);
            Double.valueOf(0.0d);
            return new Pair<>(Double.valueOf(jSONObject.optDouble("lon")), Double.valueOf(jSONObject.optDouble("lat")));
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f2543a, false, 19198, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2543a, false, 19198, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!ToolUtils.isMiui() || !w()) {
            return this.f2546c.a("allow_push_daemon_monitor", true);
        } else {
            return false;
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2543a, false, 19230, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2543a, false, 19230, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f2546c.a().a("last_send_notify_enable_is_succ", z).a();
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2543a, false, 19201, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2543a, false, 19201, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f2546c.a().a("push_daemon_monitor_result", str2).a();
    }

    public final void a(Map<String, String> map) {
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{map2}, this, f2543a, false, 19220, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map2}, this, f2543a, false, 19220, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        a.a().b(map2);
    }

    public final void b(Map<String, ?> map) {
        if (PatchProxy.isSupport(new Object[]{map}, this, f2543a, false, 19266, new Class[]{Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map}, this, f2543a, false, 19266, new Class[]{Map.class}, Void.TYPE);
            return;
        }
        try {
            PushMultiProcessSharedProvider.a a2 = this.f2546c.a();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    Object value = next.getValue();
                    if (value instanceof Integer) {
                        a2.a((String) next.getKey(), ((Integer) value).intValue());
                    } else if (value instanceof Long) {
                        a2.a((String) next.getKey(), ((Long) value).longValue());
                    } else if (value instanceof Float) {
                        String str = (String) next.getKey();
                        float floatValue = ((Float) value).floatValue();
                        if (PatchProxy.isSupport(new Object[]{str, Float.valueOf(floatValue)}, a2, PushMultiProcessSharedProvider.a.f30578a, false, 19168, new Class[]{String.class, Float.TYPE}, PushMultiProcessSharedProvider.a.class)) {
                            PushMultiProcessSharedProvider.a aVar = a2;
                            PushMultiProcessSharedProvider.a aVar2 = (PushMultiProcessSharedProvider.a) PatchProxy.accessDispatch(new Object[]{str, Float.valueOf(floatValue)}, aVar, PushMultiProcessSharedProvider.a.f30578a, false, 19168, new Class[]{String.class, Float.TYPE}, PushMultiProcessSharedProvider.a.class);
                        } else {
                            a2.f30580c.put(str, Float.valueOf(floatValue));
                        }
                    } else if (value instanceof Boolean) {
                        a2.a((String) next.getKey(), ((Boolean) value).booleanValue());
                    } else if (value instanceof String) {
                        a2.a((String) next.getKey(), (String) value);
                    }
                }
                a2.b();
            }
        } catch (Throwable unused) {
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2543a, false, 19222, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2543a, false, 19222, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f2546c.a().a("allow_off_alive", z).a();
    }

    public final String a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.isSupport(new Object[]{str3, str4}, this, f2543a, false, 19269, new Class[]{String.class, String.class}, String.class)) {
            return this.f2546c.a(str3, str4);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f2543a, false, 19269, new Class[]{String.class, String.class}, String.class);
    }
}
