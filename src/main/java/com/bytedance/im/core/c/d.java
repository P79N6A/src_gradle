package com.bytedance.im.core.c;

import android.os.SystemClock;
import com.bytedance.im.core.b.c.f;
import com.bytedance.im.core.proto.IMCMD;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static b f21249a;

    /* renamed from: com.bytedance.im.core.c.d$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21250a = new int[IMCMD.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00ce */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00da */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fe */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.bytedance.im.core.proto.IMCMD[] r0 = com.bytedance.im.core.proto.IMCMD.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21250a = r0
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.ADD_CONVERSATION_PARTICIPANTS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.CREATE_CONVERSATION_V2     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_CONVERSATION_INFO_V2     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_CONVERSATION_INFO_LIST_V2     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_CONVERSATION_INFO_LIST_BY_FAVORITE_V2     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_CONVERSATION_INFO_LIST_BY_TOP_V2     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_MESSAGES_BY_USER     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_STRANGER_CONVERSATION_LIST     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_STRANGER_MESSAGES_IN_CONVERSATION     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_MESSAGES_BY_USER_INIT_V2     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.LEAVE_CONVERSATION     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.GET_MESSAGES_BY_CONVERSATION     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x009e }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.CONVERSATION_PARTICIPANTS_LIST     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00aa }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.REMOVE_CONVERSATION_PARTICIPANTS     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.SEND_MESSAGE     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00c2 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.SET_CONVERSATION_CORE_INFO     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00ce }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.SET_CONVERSATION_SETTING_INFO     // Catch:{ NoSuchFieldError -> 0x00ce }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ce }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ce }
            L_0x00ce:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00da }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.UPDATE_CONVERSATION_PARTICIPANT     // Catch:{ NoSuchFieldError -> 0x00da }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00da }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00da }
            L_0x00da:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00e6 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.UPSERT_CONVERSATION_CORE_EXT_INFO     // Catch:{ NoSuchFieldError -> 0x00e6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e6 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e6 }
            L_0x00e6:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00f2 }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.UPSERT_CONVERSATION_SETTING_EXT_INFO     // Catch:{ NoSuchFieldError -> 0x00f2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f2 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f2 }
            L_0x00f2:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x00fe }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.DISSOLVE_CONVERSATION     // Catch:{ NoSuchFieldError -> 0x00fe }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fe }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fe }
            L_0x00fe:
                int[] r0 = f21250a     // Catch:{ NoSuchFieldError -> 0x010a }
                com.bytedance.im.core.proto.IMCMD r1 = com.bytedance.im.core.proto.IMCMD.SYNC_MESSAGE     // Catch:{ NoSuchFieldError -> 0x010a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x010a }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x010a }
            L_0x010a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.c.d.AnonymousClass1.<clinit>():void");
        }
    }

    public static void a(Exception exc) {
        c.a().a("core").b("task_exception").a("error", exc.toString()).a("error_stack", b(exc)).b();
    }

    public static String b(Exception exc) {
        if (exc == null) {
            return "";
        }
        StackTraceElement[] stackTrace = exc.getStackTrace();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (stackTrace != null && i < stackTrace.length) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(stackTrace[i].getClassName());
            sb.append(":");
            sb.append(stackTrace[i].getMethodName());
            sb.append(":");
            sb.append(stackTrace[i].getLineNumber());
            i++;
        }
        if (sb.length() > 1000) {
            sb.substring(0, 999);
        }
        return sb.toString();
    }

    public static c a(f fVar, boolean z) {
        c a2 = c.a().a("duration", Long.valueOf(SystemClock.uptimeMillis() - fVar.j));
        IMCMD fromValue = IMCMD.fromValue(fVar.d());
        if (fromValue == null) {
            fromValue = IMCMD.IMCMD_NOT_USED;
        }
        switch (AnonymousClass1.f21250a[fromValue.ordinal()]) {
            case 1:
                a2.a("conversation").b("add_participants");
                break;
            case 2:
                a2.a("core").b("create_conversation");
                break;
            case 3:
                a2.a("core").b("get_conversation_info");
                break;
            case 4:
                a2.a("core").b("get_conversation_info_list");
                break;
            case 5:
                a2.a("core").b("get_favorite_conversation_list");
                break;
            case 6:
                a2.a("core").b("get_top_conversation_list");
                break;
            case e.l /*?: ONE_ARG  (7 int)*/:
                a2.a("core").b("get_msg_by_user");
                break;
            case 8:
                a2.a("core").b("get_stranger_conversation_list");
                break;
            case 9:
                a2.a("core").b("get_stranger_msg_list");
                break;
            case 10:
                a2.a("core").b("install_init");
                break;
            case 11:
                a2.a("conversation").b("leave");
                break;
            case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                a2.a("core").b("load_history");
                break;
            case 13:
                a2.a("core").b("load_member");
                break;
            case 14:
                a2.a("conversation").b("remove_member");
                break;
            case 15:
                a2.a("core").b("message_send");
                break;
            case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                a2.a("conversation").b("update_core");
                break;
            case 17:
                a2.a("conversation").b("update_setting");
                break;
            case 18:
                a2.a("conversation").b("update_member");
                break;
            case 19:
                a2.a("conversation").b("update_core_ext");
                break;
            case 20:
                a2.a("conversation").b("update_setting_ext");
                break;
            case 21:
                a2.a("conversation").b("dissolve");
                break;
            case 22:
                a2.a("core").b("property_msg_send");
                break;
        }
        a2.a("unknown").b("not_use");
        if (z) {
            a2.a("success", 1);
        } else {
            a2.a("error", Integer.valueOf(fVar.i));
            a2.a("success", 0);
            if (fVar.f21167f != null) {
                a2.b("origin_request", fVar.f21167f);
            }
            if (fVar.g != null) {
                a2.b("origin_response", fVar.g);
            }
        }
        return a2;
    }

    public static void a(String str, String str2, Throwable th) {
        if (f21249a != null) {
            f21249a.a(str, str2, th);
        }
    }

    public static void a(String str, String str2, float f2) {
        if (f21249a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str2, 1.0d);
                jSONObject.put("service", str);
            } catch (JSONException unused) {
            }
            f21249a.a("service_monitor", str, jSONObject);
        }
        com.bytedance.im.core.b.e.d.a("monitor", "serviceName=" + str + " key=" + str2 + " value=1.0");
    }

    public static void a(String str, String str2, JSONObject jSONObject) {
        if (f21249a != null) {
            f21249a.a(str, str2, jSONObject);
        }
        com.bytedance.im.core.b.e.d.a("monitor", "log_type=" + str + " serviceName=" + str2 + " logExtra=" + jSONObject);
    }

    public static void a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (f21249a != null) {
            f21249a.a(str, jSONObject, (JSONObject) null);
        }
        com.bytedance.im.core.b.e.d.a("monitor", "serviceName=" + str + " duration=" + jSONObject + " logExtra=" + null);
    }

    public static void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        if (f21249a != null) {
            f21249a.a(str, str2, map, map2);
        }
    }

    public static void a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        com.bytedance.im.core.b.e.d.a("monitor", "sendDuration=" + j + " sendTime=" + j2 + " sendUrl=" + str + " sendIp=" + str2 + " traceCode=" + str3 + " status=" + i + " extJson=" + null);
    }

    public static void b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
        com.bytedance.im.core.b.e.d.a("monitor", "duration=" + j + " sendTime=" + j2 + " sendUrl=" + str + " sendIp=" + str2 + " traceCode=" + str3 + " status=" + i + " extJson=" + null);
    }
}
