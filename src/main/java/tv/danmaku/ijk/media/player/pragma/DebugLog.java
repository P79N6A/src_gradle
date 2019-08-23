package tv.danmaku.ijk.media.player.pragma;

import java.util.Locale;

public class DebugLog {
    public static void d(String str, String str2) {
    }

    public static void d(String str, String str2, Throwable th) {
    }

    public static void e(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
    }

    public static void i(String str, String str2) {
    }

    public static void i(String str, String str2, Throwable th) {
    }

    public static void printStackTrace(Throwable th) {
    }

    public static void v(String str, String str2) {
    }

    public static void v(String str, String str2, Throwable th) {
    }

    public static void w(String str, String str2) {
    }

    public static void w(String str, String str2, Throwable th) {
    }

    public static void printCause(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            th = cause;
        }
        printStackTrace(th);
    }

    public static void dfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    public static void efmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    public static void ifmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    public static void vfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }

    public static void wfmt(String str, String str2, Object... objArr) {
        String.format(Locale.US, str2, objArr);
    }
}
