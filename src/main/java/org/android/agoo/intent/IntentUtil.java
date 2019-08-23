package org.android.agoo.intent;

import android.content.Context;
import android.content.Intent;
import com.taobao.accs.utl.ALog;

public final class IntentUtil {
    public static final String getAgooCommand(Context context) {
        if (context != null) {
            try {
                return context.getPackageName() + ".intent.action.COMMAND";
            } catch (Throwable th) {
                ALog.w("IntentUtil", "getAgooCommand", th, new Object[0]);
            }
        }
        return null;
    }

    public static final String getThirdPushCommand(Context context) {
        if (context != null) {
            try {
                return context.getPackageName() + ".intent.thirdPush.action.COMMAND";
            } catch (Throwable th) {
                ALog.w("IntentUtil", "getAgooCommand", th, new Object[0]);
            }
        }
        return null;
    }

    public static final Intent createComandIntent(Context context, String str) {
        Intent intent;
        try {
            intent = new Intent();
            try {
                intent.setAction(context.getPackageName() + ".intent.action.COMMAND");
                intent.setPackage(context.getPackageName());
                intent.putExtra("command", str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            intent = null;
            ALog.e("IntentUtil", "createComandIntent", th, new Object[0]);
            return intent;
        }
        return intent;
    }

    public static final Intent createThirdpushComandIntent(Context context, String str) {
        Intent intent;
        try {
            intent = new Intent();
            try {
                intent.setAction(getThirdPushCommand(context));
                intent.setPackage(context.getPackageName());
                intent.putExtra("command", str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            intent = null;
            ALog.w("IntentUtil", "createComandIntent", th, new Object[0]);
            return intent;
        }
        return intent;
    }

    public static final Intent createActivityIntent(Context context, String str, Intent intent) {
        Intent intent2;
        try {
            intent2 = new Intent();
            try {
                intent2.setAction(context.getPackageName() + ".intent.action.startActivity.COMMAND");
                intent2.setPackage(context.getPackageName());
                intent2.setClassName(context, "com.taobao.agoo.AgooStartActivityService");
                intent2.putExtra("command", str);
                intent2.putExtras(intent.getExtras());
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            intent2 = null;
            ALog.w("IntentUtil", "createComandIntent", th, new Object[0]);
            return intent2;
        }
        return intent2;
    }
}
