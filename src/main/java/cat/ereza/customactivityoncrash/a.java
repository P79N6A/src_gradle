package cat.ereza.customactivityoncrash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.ss.android.ugc.aweme.q.c;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;

@SuppressLint({"NewApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Application f1628a;

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<Activity> f1629b = new WeakReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1630c = false;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f1631d = true;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f1632e = true;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1633f = true;
    public static int g = 2130838555;
    public static Class<? extends Activity> h = null;
    public static Class<? extends Activity> i = null;
    public static C0004a j = null;

    /* renamed from: cat.ereza.customactivityoncrash.a$a  reason: collision with other inner class name */
    public interface C0004a extends Serializable {
        void onCloseAppFromErrorActivity();

        void onLaunchErrorActivity();

        void onRestartAppFromErrorActivity();
    }

    public static void a() {
        b.a(Process.myPid());
        b.b(10);
    }

    public static void a(Class<? extends Activity> cls) {
        h = cls;
    }

    public static String a(Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
    }

    public static Class<? extends Activity> b(Intent intent) {
        Serializable serializableExtra = intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS");
        if (serializableExtra == null || !(serializableExtra instanceof Class)) {
            return null;
        }
        return (Class) serializableExtra;
    }

    static Class<? extends Activity> c(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            try {
                return Class.forName(launchIntentForPackage.getComponent().getClassName());
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    private static String e(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    static Class<? extends Activity> b(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(queryIntentActivities.get(0).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    static Class<? extends Activity> d(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(context.getPackageName()), 64);
        if (queryIntentActivities != null && queryIntentActivities.size() > 0) {
            try {
                return Class.forName(queryIntentActivities.get(0).activityInfo.name);
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    private static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char charAt = str.charAt(0);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        return Character.toUpperCase(charAt) + str.substring(1);
    }

    public static void a(Context context) {
        if (context != null) {
            try {
                final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                    if (defaultUncaughtExceptionHandler != null) {
                        defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os");
                    }
                    f1628a = (Application) context.getApplicationContext();
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                        public final void uncaughtException(Thread thread, Throwable th) {
                            boolean z;
                            long j = c.a(a.f1628a, "custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1);
                            long time = new Date().getTime();
                            if (j > time || time - j >= 2000) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (!z) {
                                c.a(a.f1628a, "custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", new Date().getTime()).commit();
                                if (a.h == null) {
                                    Class d2 = a.d(a.f1628a);
                                    if (d2 == null) {
                                        d2 = DefaultErrorActivity.class;
                                    }
                                    a.h = d2;
                                }
                                if (a.a(th, a.h)) {
                                    if (defaultUncaughtExceptionHandler != null) {
                                        defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                                        return;
                                    }
                                } else if (a.f1631d || !a.f1630c) {
                                    Intent intent = new Intent(a.f1628a, a.h);
                                    StringWriter stringWriter = new StringWriter();
                                    com.google.a.a.a.a.a.a.a(th, new PrintWriter(stringWriter));
                                    String stringWriter2 = stringWriter.toString();
                                    if (stringWriter2.length() > 131071) {
                                        stringWriter2 = stringWriter2.substring(0, 131071 - " [stack trace too large]".length()) + " [stack trace too large]";
                                    }
                                    if (a.f1633f && a.i == null) {
                                        Application application = a.f1628a;
                                        Class<? extends Activity> b2 = a.b((Context) application);
                                        if (b2 == null) {
                                            b2 = a.c(application);
                                        }
                                        a.i = b2;
                                    } else if (!a.f1633f) {
                                        a.i = null;
                                    }
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", stringWriter2);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_RESTART_ACTIVITY_CLASS", a.i);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_SHOW_ERROR_DETAILS", a.f1632e);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_EVENT_LISTENER", a.j);
                                    intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_IMAGE_DRAWABLE_ID", a.g);
                                    intent.setFlags(268468224);
                                    if (a.j != null) {
                                        a.j.onLaunchErrorActivity();
                                    }
                                    a.f1628a.startActivity(intent);
                                }
                            } else if (defaultUncaughtExceptionHandler != null) {
                                defaultUncaughtExceptionHandler.uncaughtException(thread, th);
                                return;
                            }
                            Activity activity = (Activity) a.f1629b.get();
                            if (activity != null) {
                                activity.finish();
                                a.f1629b.clear();
                            }
                            a.a();
                        }
                    });
                    if (Build.VERSION.SDK_INT >= 14) {
                        f1628a.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() {

                            /* renamed from: a  reason: collision with root package name */
                            int f1635a;

                            public final void onActivityDestroyed(Activity activity) {
                            }

                            public final void onActivityPaused(Activity activity) {
                            }

                            public final void onActivityResumed(Activity activity) {
                            }

                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            public final void onActivityStarted(Activity activity) {
                                boolean z = true;
                                this.f1635a++;
                                if (this.f1635a != 0) {
                                    z = false;
                                }
                                a.f1630c = z;
                            }

                            public final void onActivityStopped(Activity activity) {
                                boolean z = true;
                                this.f1635a--;
                                if (this.f1635a != 0) {
                                    z = false;
                                }
                                a.f1630c = z;
                            }

                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                                if (activity.getClass() != a.h) {
                                    a.f1629b = new WeakReference<>(activity);
                                }
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String a(Context context, DateFormat dateFormat) {
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            String format = dateFormat.format(new Date(zipFile.getEntry("classes.dex").getTime()));
            zipFile.close();
            return format;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static String a(Context context, Intent intent) {
        String str;
        new Date();
        String a2 = a(context, (DateFormat) new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US));
        String e2 = e(context);
        String str2 = "" + "Build version: " + e2 + " \n";
        String str3 = str2 + "Build date: " + a2 + " \n";
        String str4 = str3 + "Current date: " + r1.format(r0) + " \n";
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        sb.append("Device: ");
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        if (str6.startsWith(str5)) {
            str = a(str6);
        } else {
            str = a(str5) + " " + str6;
        }
        sb.append(str);
        sb.append(" \n \n");
        String sb2 = sb.toString();
        String str7 = sb2 + "Stack trace:  \n";
        return str7 + a(intent);
    }

    public static void a(Activity activity, C0004a aVar) {
        if (aVar != null) {
            aVar.onCloseAppFromErrorActivity();
        }
        activity.finish();
        a();
    }

    public static boolean a(Throwable th, Class<? extends Activity> cls) {
        do {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ((stackTraceElement.getClassName().equals("android.app.ActivityThread") && stackTraceElement.getMethodName().equals("handleBindApplication")) || stackTraceElement.getClassName().equals(cls.getName())) {
                    return true;
                }
            }
            th = th.getCause();
        } while (th != null);
        return false;
    }

    public static void a(Activity activity, Intent intent, C0004a aVar) {
        intent.addFlags(268468224);
        if (aVar != null) {
            aVar.onRestartAppFromErrorActivity();
        }
        activity.finish();
        activity.startActivity(intent);
        a();
    }
}
