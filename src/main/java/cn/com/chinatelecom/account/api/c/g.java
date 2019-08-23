package cn.com.chinatelecom.account.api.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import cn.com.chinatelecom.account.api.CtAuth;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.lang.reflect.Method;

public class g {
    private static int a(int i) {
        int i2 = -101;
        if (i != -101) {
            i2 = -1;
            if (i != -1) {
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case e.l /*7*/:
                    case 11:
                    case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                    case 14:
                    case 15:
                    case 17:
                        return 2;
                    case 13:
                    case 18:
                    case 19:
                        return 3;
                    default:
                        return i;
                }
            }
        }
        return i2;
    }

    public static NetworkInfo a(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static boolean b(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.isAvailable();
    }

    public static boolean c(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.getType() == 1;
    }

    public static boolean d(Context context) {
        NetworkInfo a2 = a(context);
        return a2 != null && a2.getType() == 0;
    }

    public static boolean e(Context context) {
        if (context == null) {
            return true;
        }
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
        } catch (Throwable th) {
            CtAuth.warn("NetUtil", "isMobileEnable error ", th);
            return true;
        }
    }

    public static String f(Context context) {
        boolean c2 = c(context);
        boolean e2 = e(context);
        if (c2 && !e2) {
            return PushConstants.PUSH_TYPE_UPLOAD_LOG;
        }
        if (!e2 || c2) {
            if (c2 && e2) {
                return PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            }
            if (c2 || e2 || !d(context)) {
                return "";
            }
        }
        return PushConstants.PUSH_TYPE_NOTIFY;
    }

    public static String g(Context context) {
        int i = i(context);
        if (i == -101) {
            return "wifi";
        }
        switch (i) {
            case -1:
                return "unnet";
            case 0:
                return "-1";
            case 1:
                return "2g";
            case 2:
                return "3g";
            case 3:
                return "4g";
            default:
                return Integer.toString(i);
        }
    }

    public static String h(Context context) {
        int i = i(context);
        if (i == -101) {
            return "WIFI";
        }
        switch (i) {
            case -1:
            case 0:
                return "null";
            case 1:
                return "2G";
            case 2:
                return "3G";
            case 3:
                return "4G";
            default:
                return Integer.toString(i);
        }
    }

    private static int i(Context context) {
        int i = 0;
        try {
            NetworkInfo a2 = a(context);
            if (a2 == null || !a2.isAvailable() || !a2.isConnected()) {
                i = -1;
                return a(i);
            }
            int type = a2.getType();
            if (type == 1) {
                i = -101;
            } else if (type == 0) {
                try {
                    i = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                } catch (Exception unused) {
                }
                if (i == 0) {
                    i = a2.getSubtype();
                }
            }
            return a(i);
        } catch (Exception | NullPointerException unused2) {
        }
    }
}
