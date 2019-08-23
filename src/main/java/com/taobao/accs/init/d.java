package com.taobao.accs.init;

import android.text.TextUtils;
import com.alibaba.analytics.utils.AppInfoUtil;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.utl.ALog;
import java.util.Map;

public final class d implements IAppReceiver {
    d() {
    }

    public final Map<String, String> getAllServices() {
        return Launcher_InitAccs.SERVICES;
    }

    public final String getService(String str) {
        return Launcher_InitAccs.SERVICES.get(str);
    }

    public final void onUnbindApp(int i) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("Launcher_InitAccs", "onUnbindApp,  errorCode:" + i, new Object[0]);
        }
    }

    public final void onUnbindUser(int i) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("Launcher_InitAccs", "onUnbindUser, errorCode:" + i, new Object[0]);
        }
    }

    public final void onBindApp(int i) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("Launcher_InitAccs", "onBindApp,  errorCode:" + i, new Object[0]);
        }
        if (i == 200) {
            if (!TextUtils.isEmpty(Launcher_InitAccs.mUserId)) {
                ACCSManager.bindUser(Launcher_InitAccs.mContext, Launcher_InitAccs.mUserId, Launcher_InitAccs.mForceBindUser);
                Launcher_InitAccs.mForceBindUser = false;
            } else if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.d("Launcher_InitAccs", "onBindApp,  bindUser userid :" + Launcher_InitAccs.mUserId, new Object[0]);
            }
        }
    }

    public final void onBindUser(String str, int i) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("Launcher_InitAccs", "onBindUser, userId:" + str + " errorCode:" + i, new Object[0]);
        }
        if (i == 300) {
            ACCSManager.bindApp(Launcher_InitAccs.mContext, AppInfoUtil.getAppkey(), Launcher_InitAccs.mTtid, null);
        }
    }

    public final void onSendData(String str, int i) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("Launcher_InitAccs", "onSendData,  dataId:" + str + " errorCode:" + i, new Object[0]);
        }
    }

    public final void onData(String str, String str2, byte[] bArr) {
        int i;
        if (ALog.isPrintLog(ALog.Level.D)) {
            StringBuilder sb = new StringBuilder("onData,  userId:");
            sb.append(str);
            sb.append("dataId:");
            sb.append(str2);
            sb.append(" dataLen:");
            if (bArr == null) {
                i = 0;
            } else {
                i = bArr.length;
            }
            sb.append(i);
            ALog.d("Launcher_InitAccs", sb.toString(), new Object[0]);
        }
    }
}
