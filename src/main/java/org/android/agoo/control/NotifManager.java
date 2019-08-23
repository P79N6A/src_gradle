package org.android.agoo.control;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.a;
import com.taobao.accs.utl.b;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.android.agoo.common.Config;
import org.android.agoo.common.MsgDO;
import org.json.JSONObject;

public class NotifManager {
    public static Context mContext;

    public void pingApp(String str, String str2, String str3, int i) {
    }

    public void init(Context context) {
        mContext = context;
    }

    private String getVersion(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "null";
            }
            String str2 = mContext.getPackageManager().getPackageInfo(str, 0).versionName;
            ALog.d("NotifManager", "getVersion###版本号为 : " + str2, new Object[0]);
            return str2;
        } catch (Throwable unused) {
            return "null";
        }
    }

    private boolean isAppInstalled(String str) {
        PackageInfo packageInfo;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            packageInfo = mContext.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return false;
            }
            ALog.i("NotifManager", "isAppInstalled true..", new Object[0]);
            return true;
        } catch (Throwable unused) {
            packageInfo = null;
        }
    }

    private byte[] convertMsgToBytes(MsgDO msgDO) throws UnsupportedEncodingException {
        HashMap hashMap = new HashMap();
        hashMap.put("api", "agooReport");
        hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
        hashMap.put("ext", msgDO.extData);
        hashMap.put("status", msgDO.msgStatus);
        if (!TextUtils.isEmpty(msgDO.errorCode)) {
            hashMap.put("ec", msgDO.errorCode);
        }
        if (!TextUtils.isEmpty(msgDO.type)) {
            hashMap.put("type", msgDO.type);
        }
        if (!TextUtils.isEmpty(msgDO.fromPkg)) {
            hashMap.put("fromPkg", msgDO.fromPkg);
        }
        if (!TextUtils.isEmpty(msgDO.fromAppkey)) {
            hashMap.put("fromAppkey", msgDO.fromAppkey);
        }
        if (!TextUtils.isEmpty(msgDO.notifyEnable)) {
            hashMap.put("notifyEnable", msgDO.notifyEnable);
        }
        if (!TextUtils.isEmpty(msgDO.extData)) {
            hashMap.put("ext", msgDO.extData);
        }
        hashMap.put("isStartProc", Boolean.toString(msgDO.isStartProc));
        hashMap.put("appkey", Config.a(mContext));
        hashMap.put("utdid", a.b(mContext));
        return new JSONObject(hashMap).toString().getBytes("UTF-8");
    }

    public void reportNotifyMessage(MsgDO msgDO) {
        if (msgDO != null) {
            try {
                b.a("accs", "agoo_report_id", msgDO.msgIds, 0.0d);
                ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooAck", convertMsgToBytes(msgDO), null, null, null, null);
                Context context = mContext;
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, Config.a(context), Config.b(mContext));
                String b2 = accsInstance.b(mContext, accsRequest);
                accsInstance.a(mContext, accsRequest, (TaoBaseService.ExtraInfo) null);
                if (ALog.isPrintLog(ALog.Level.E)) {
                    ALog.e("NotifManager", "reportNotifyMessage", "dataId", b2, "status", msgDO.msgStatus);
                }
                b.a("accs", "agoo_click", msgDO.msgStatus, 0.0d);
                b.a("accs", "agoo_ack", msgDO.msgStatus, 0.0d);
            } catch (Throwable th) {
                ALog.e("NotifManager", "[reportNotifyMessage] is error", th, new Object[0]);
                b.a("accs", "error", th.toString(), 0.0d);
            }
        }
    }

    public void reportThirdPushToken(String str, String str2) {
        reportThirdPushToken(str, str2, true);
    }

    public void report(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (!TextUtils.isEmpty(msgDO.reportStr)) {
            try {
                if (Integer.parseInt(msgDO.reportStr) >= -1) {
                    reportMethod(msgDO, extraInfo);
                    if (!msgDO.isFromCache) {
                        b.a("accs", "agoo_ack", msgDO.msgStatus, 0.0d);
                    }
                }
            } catch (Throwable th) {
                ALog.e("NotifManager", "[report] is error", th, new Object[0]);
            }
        }
    }

    private void reportMethod(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO == null) {
            try {
                ALog.e("NotifManager", "reportMethod msg null", new Object[0]);
            } catch (Throwable th) {
                b.a("accs", "error", th.toString(), 0.0d);
            }
        } else {
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooAck", convertMsgToBytes(msgDO), null, null, null, null);
            accsRequest.setTag(msgDO.msgIds);
            Context context = mContext;
            String a2 = ACCSManager.getAccsInstance(context, Config.a(context), Config.b(mContext)).a(mContext, accsRequest, extraInfo);
            if (ALog.isPrintLog(ALog.Level.E)) {
                ALog.e("NotifManager", "report", "dataId", a2, "status", msgDO.msgStatus, "errorcode", msgDO.errorCode);
            }
        }
    }

    public void doUninstall(String str, boolean z) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("pack", str);
            hashMap.put("appkey", Config.a(mContext));
            hashMap.put("utdid", a.b(mContext));
            ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooKick", new JSONObject(hashMap).toString().getBytes("UTF-8"), null, null, null, null);
            Context context = mContext;
            ACCSManager.getAccsInstance(context, Config.a(context), Config.b(mContext)).a(mContext, accsRequest, new TaoBaseService.ExtraInfo());
        } catch (Throwable th) {
            ALog.e("NotifManager", "[doUninstall] is error", th, new Object[0]);
        }
    }

    public void handlerACKMessage(MsgDO msgDO, TaoBaseService.ExtraInfo extraInfo) {
        if (msgDO != null) {
            if (!TextUtils.isEmpty(msgDO.msgIds) || !TextUtils.isEmpty(msgDO.removePacks) || !TextUtils.isEmpty(msgDO.errorCode)) {
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("api", "agooAck");
                    hashMap.put("id", msgDO.msgIds + "@" + msgDO.messageSource);
                    if (!TextUtils.isEmpty(msgDO.removePacks)) {
                        hashMap.put("del_pack", msgDO.removePacks);
                    }
                    if (!TextUtils.isEmpty(msgDO.errorCode)) {
                        hashMap.put("ec", msgDO.errorCode);
                    }
                    if (!TextUtils.isEmpty(msgDO.type)) {
                        hashMap.put("type", msgDO.type);
                    }
                    if (!TextUtils.isEmpty(msgDO.extData)) {
                        hashMap.put("ext", msgDO.extData);
                    }
                    hashMap.put("appkey", Config.a(mContext));
                    hashMap.put("utdid", a.b(mContext));
                    byte[] bytes = new JSONObject(hashMap).toString().getBytes("UTF-8");
                    UTMini.getInstance().commitEvent(66002, "accs.ackMessage", a.b(mContext), "handlerACKMessageSendData", msgDO.msgIds);
                    b.a("accs", "agoo_ack", "handlerACKMessage", 0.0d);
                    ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(null, "agooAck", bytes, null, null, null, null);
                    if (msgDO != null) {
                        accsRequest.setTag(msgDO.msgIds);
                    }
                    Context context = mContext;
                    String a2 = ACCSManager.getAccsInstance(context, Config.a(context), Config.b(mContext)).a(mContext, accsRequest, extraInfo);
                    ALog.i("NotifManager", "handlerACKMessage,endRequest,dataId=" + a2, new Object[0]);
                } catch (Throwable th) {
                    if (ALog.isPrintLog(ALog.Level.E)) {
                        ALog.e("NotifManager", "handlerACKMessage Throwable,msgIds=" + msgDO.msgIds + ",type=" + msgDO.type + ",e=" + th.toString(), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(66002, "accs.ackMessage", a.b(mContext), "handlerACKMessageExceptionFailed", th.toString());
                }
            } else {
                UTMini instance = UTMini.getInstance();
                String b2 = a.b(mContext);
                instance.commitEvent(66002, "accs.ackMessage", b2, "handlerACKMessageRetuen", "msgids=" + msgDO.msgIds + ",removePacks=" + msgDO.removePacks + ",errorCode=" + msgDO.errorCode);
            }
        }
    }

    public void reportThirdPushToken(String str, String str2, boolean z) {
        ThreadPoolExecutorFactory.schedule(new l(this, str2, str, z), 10, TimeUnit.SECONDS);
    }

    public void reportThirdPushToken(String str, String str2, String str3, boolean z) {
        m mVar = new m(this, str2, str, str3, z);
        ThreadPoolExecutorFactory.schedule(mVar, 10, TimeUnit.SECONDS);
    }
}
