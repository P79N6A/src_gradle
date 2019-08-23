package cn.com.chinatelecom.account.api;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.a.d;
import cn.com.chinatelecom.account.api.c.b;
import cn.com.chinatelecom.account.api.c.f;
import cn.com.chinatelecom.account.api.c.g;

public class CtAuth {
    public static final String TAG = "CtAuth";
    private static volatile CtAuth instance = null;
    public static boolean isInit = false;
    public static String mAppKey = "";
    public static String mAppSecret = "";
    public static Context mContext;
    public static Handler mHandler = new Handler(Looper.getMainLooper());
    public static TraceLogger mTraceLogger;

    public static CtAuth getInstance() {
        if (instance == null) {
            synchronized (CtAuth.class) {
                if (instance == null) {
                    instance = new CtAuth();
                }
            }
        }
        return instance;
    }

    public static void info(String str, String str2) {
        if (mTraceLogger != null) {
            mTraceLogger.info("CT_" + str, str2);
        }
    }

    public static void postResultOnMainThread(final Context context, final String str, final String str2, final ResultListener resultListener) {
        mHandler.post(new Runnable() {
            public final void run() {
                if (resultListener != null) {
                    String str = CtAuth.TAG;
                    CtAuth.info(str, "callback result : " + str2);
                    resultListener.onResult(str2);
                    f.a(context, str);
                }
            }
        });
    }

    public static void warn(String str, String str2, Throwable th) {
        if (mTraceLogger != null) {
            mTraceLogger.warn("CT_" + str, str2, th);
        }
    }

    public void init(Context context, String str, String str2, TraceLogger traceLogger) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null!");
        } else if (str == null) {
            throw new IllegalArgumentException("appKey must not be null!");
        } else if (str2 != null) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            mContext = context;
            mAppKey = str;
            mAppSecret = str2;
            mTraceLogger = traceLogger;
        } else {
            throw new IllegalArgumentException("appSecret must not be null!");
        }
    }

    public void requestLogin(String str, CtSetting ctSetting, ResultListener resultListener) {
        String str2 = TAG;
        info(str2, "call requestNetworkAuth()   accessCode：" + str);
        if (resultListener != null) {
            if (mContext == null || TextUtils.isEmpty(mAppKey) || TextUtils.isEmpty(mAppSecret)) {
                resultListener.onResult("{\"result\":\"-8005\",\"msg\":\"请先初始化SDK\"}");
            } else if (!g.b(mContext)) {
                resultListener.onResult("{\"result\":\"-8100\",\"msg\":\"网络无连接\"}");
            } else {
                new a().c(mContext, mAppKey, mAppSecret, str, ctSetting, resultListener);
            }
        }
    }

    @Deprecated
    public void requestNetworkAuth(String str, CtSetting ctSetting, ResultListener resultListener) {
        requestLogin(str, ctSetting, resultListener);
    }

    @Deprecated
    public void requestPreCode(CtSetting ctSetting, ResultListener resultListener) {
        requestPreLogin(ctSetting, resultListener);
    }

    public void requestPreLogin(CtSetting ctSetting, ResultListener resultListener) {
        info(TAG, "call requestPreCode()");
        if (resultListener != null) {
            if (mContext == null || TextUtils.isEmpty(mAppKey) || TextUtils.isEmpty(mAppSecret)) {
                resultListener.onResult("{\"result\":\"-8005\",\"msg\":\"请先初始化SDK\"}");
            } else if (!g.b(mContext)) {
                resultListener.onResult("{\"result\":\"-8100\",\"msg\":\"网络无连接\"}");
            } else if (g.d(mContext)) {
                new a().a(mContext, mAppKey, mAppSecret, d.a(b.f1788a), ctSetting, resultListener);
            } else if (g.e(mContext)) {
                new a().b(mContext, mAppKey, mAppSecret, d.a(b.f1788a), ctSetting, resultListener);
            } else {
                resultListener.onResult("{\"result\":-8004,\"msg\":\"移动网络未开启\"}");
            }
        }
    }
}
