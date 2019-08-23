package org.android.spdy;

public class spduLog {
    private static long savedTraffic;

    public static void Logd(String str, String str2) {
    }

    public static void Logd(String str, String str2, long j) {
    }

    public static void Loge(String str, String str2) {
    }

    public static void Logf(String str, String str2) {
    }

    public static void Logi(String str, String str2) {
    }

    public static void Logv(String str, String str2) {
    }

    public static void Logw(String str, String str2) {
    }

    public static long getSavedTraffic() {
        return savedTraffic;
    }

    public static long now() {
        if (SpdyAgent.enableDebug) {
            return System.nanoTime();
        }
        return 0;
    }

    public static void addTraffic(long j) {
        savedTraffic += j;
    }
}
