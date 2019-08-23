package anet.channel;

import android.text.TextUtils;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import anet.channel.strategy.utils.c;
import org.json.JSONArray;
import org.json.JSONObject;

public class AwcnConfig {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f1102a = false;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f1103b = true;

    /* renamed from: c  reason: collision with root package name */
    private static volatile boolean f1104c = true;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f1105d = true;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f1106e = false;

    /* renamed from: f  reason: collision with root package name */
    private static volatile boolean f1107f = false;
    private static volatile long g = 43200000;
    private static volatile boolean h = true;
    private static volatile boolean i = true;
    private static boolean j = true;
    private static boolean k;

    public static long getIpv6BlackListTtl() {
        return g;
    }

    public static boolean isAccsSessionCreateForbiddenInBg() {
        return f1102a;
    }

    public static boolean isAppLifeCycleListenerEnable() {
        return j;
    }

    public static boolean isAsyncLoadStrategyEnable() {
        return k;
    }

    public static boolean isHorseRaceEnable() {
        return f1104c;
    }

    public static boolean isHttpsSniEnable() {
        return f1103b;
    }

    public static boolean isIdleSessionCloseEnable() {
        return f1107f;
    }

    public static boolean isIpv6BlackListEnable() {
        return i;
    }

    public static boolean isIpv6Enable() {
        return h;
    }

    public static boolean isQuicEnable() {
        return f1106e;
    }

    public static boolean isTnetHeaderCacheEnable() {
        return f1105d;
    }

    public static void setAccsSessionCreateForbiddenInBg(boolean z) {
        f1102a = z;
    }

    public static void setAppLifeCycleListenerEnable(boolean z) {
        j = z;
    }

    public static void setAsyncLoadStrategyEnable(boolean z) {
        k = z;
    }

    public static void setHorseRaceEnable(boolean z) {
        f1104c = z;
    }

    public static void setHttpsSniEnable(boolean z) {
        f1103b = z;
    }

    public static void setIdleSessionCloseEnable(boolean z) {
        f1107f = z;
    }

    public static void setIpv6BlackListEnable(boolean z) {
        i = z;
    }

    public static void setIpv6BlackListTtl(long j2) {
        g = j2;
    }

    public static void setIpv6Enable(boolean z) {
        h = z;
    }

    public static void setQuicEnable(boolean z) {
        f1106e = z;
    }

    public static void setTnetHeaderCacheEnable(boolean z) {
        f1105d = z;
    }

    public static void registerPresetSessions(String str) {
        if (GlobalAppRuntimeInfo.isTargetProcess() && !TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String string = jSONObject.getString("host");
                    if (!c.c(string)) {
                        break;
                    }
                    StrategyTemplate.getInstance().registerConnProtocol(string, ConnProtocol.valueOf(jSONObject.getString("protocol"), jSONObject.getString("rtt"), jSONObject.getString("publicKey")));
                    if (jSONObject.getBoolean("isKeepAlive")) {
                        SessionCenter.getInstance().registerSessionInfo(SessionInfo.create(string, true, false, null, null, null));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
