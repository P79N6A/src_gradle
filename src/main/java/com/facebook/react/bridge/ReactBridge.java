package com.facebook.react.bridge;

import org.json.JSONObject;

public class ReactBridge {
    private static JSExceptionListener mJSExceptionListener;
    private static PageFinishedListener mPageFinishListener;
    public static volatile boolean sDidInit = false;

    public interface JSExceptionListener {
        void upLoad(JSONObject jSONObject);
    }

    static {
        try {
            staticInit();
        } catch (Throwable unused) {
        }
    }

    private static synchronized void staticInit() {
        synchronized (ReactBridge.class) {
            if (!sDidInit) {
                System.loadLibrary("reactnativejni");
                sDidInit = true;
            }
        }
    }

    public static void setJSExceptionListener(JSExceptionListener jSExceptionListener) {
        mJSExceptionListener = jSExceptionListener;
    }

    public static void setPageFinishListener(PageFinishedListener pageFinishedListener) {
        mPageFinishListener = pageFinishedListener;
    }

    public static boolean isSupportRN(OnRNLoadExceptionListener onRNLoadExceptionListener) {
        staticInit(onRNLoadExceptionListener);
        return sDidInit;
    }

    public static void uploadJSException(JSONObject jSONObject) {
        if (mJSExceptionListener != null) {
            mJSExceptionListener.upLoad(jSONObject);
        }
    }

    public static void uploadPageFinishPerf(JSONObject jSONObject) {
        if (mPageFinishListener != null) {
            mPageFinishListener.upLoad(jSONObject);
        }
    }

    public static synchronized void staticInit(OnRNLoadExceptionListener onRNLoadExceptionListener) {
        synchronized (ReactBridge.class) {
            try {
                staticInit();
            } catch (Throwable th) {
                if (onRNLoadExceptionListener != null) {
                    onRNLoadExceptionListener.onLoadError(th.toString());
                }
            }
        }
    }
}
