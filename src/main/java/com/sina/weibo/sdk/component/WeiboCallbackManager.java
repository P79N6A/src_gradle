package com.sina.weibo.sdk.component;

import android.content.Context;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.component.WidgetRequestParam;
import java.util.HashMap;
import java.util.Map;

public class WeiboCallbackManager {
    private static WeiboCallbackManager sInstance;
    private Context mContext;
    private Map<String, WeiboAuthListener> mWeiboAuthListenerMap = new HashMap();
    private Map<String, WidgetRequestParam.WidgetRequestCallback> mWidgetRequestCallbackMap = new HashMap();

    public String genCallbackKey() {
        return String.valueOf(System.currentTimeMillis());
    }

    private WeiboCallbackManager(Context context) {
        this.mContext = context;
    }

    public static synchronized WeiboCallbackManager getInstance(Context context) {
        WeiboCallbackManager weiboCallbackManager;
        synchronized (WeiboCallbackManager.class) {
            if (sInstance == null) {
                sInstance = new WeiboCallbackManager(context);
            }
            weiboCallbackManager = sInstance;
        }
        return weiboCallbackManager;
    }

    public synchronized WeiboAuthListener getWeiboAuthListener(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mWeiboAuthListenerMap.get(str);
    }

    public synchronized WidgetRequestParam.WidgetRequestCallback getWidgetRequestCallback(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mWidgetRequestCallbackMap.get(str);
    }

    public synchronized void removeWeiboAuthListener(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mWeiboAuthListenerMap.remove(str);
        }
    }

    public synchronized void removeWidgetRequestCallback(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mWidgetRequestCallbackMap.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setWeiboAuthListener(java.lang.String r2, com.sina.weibo.sdk.auth.WeiboAuthListener r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0011
            if (r3 != 0) goto L_0x000a
            goto L_0x0011
        L_0x000a:
            java.util.Map<java.lang.String, com.sina.weibo.sdk.auth.WeiboAuthListener> r0 = r1.mWeiboAuthListenerMap     // Catch:{ all -> 0x0013 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.component.WeiboCallbackManager.setWeiboAuthListener(java.lang.String, com.sina.weibo.sdk.auth.WeiboAuthListener):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void setWidgetRequestCallback(java.lang.String r2, com.sina.weibo.sdk.component.WidgetRequestParam.WidgetRequestCallback r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0013 }
            if (r0 != 0) goto L_0x0011
            if (r3 != 0) goto L_0x000a
            goto L_0x0011
        L_0x000a:
            java.util.Map<java.lang.String, com.sina.weibo.sdk.component.WidgetRequestParam$WidgetRequestCallback> r0 = r1.mWidgetRequestCallbackMap     // Catch:{ all -> 0x0013 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0013 }
            monitor-exit(r1)
            return
        L_0x0011:
            monitor-exit(r1)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.component.WeiboCallbackManager.setWidgetRequestCallback(java.lang.String, com.sina.weibo.sdk.component.WidgetRequestParam$WidgetRequestCallback):void");
    }
}
