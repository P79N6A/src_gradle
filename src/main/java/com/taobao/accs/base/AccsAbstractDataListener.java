package com.taobao.accs.base;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.b;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.accs.AgooService;

public abstract class AccsAbstractDataListener implements AccsDataListener {
    public void onAntiBrush(boolean z, TaoBaseService.ExtraInfo extraInfo) {
    }

    public void onConnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    public void onDisconnected(TaoBaseService.ConnectInfo connectInfo) {
    }

    private static Map<TaoBaseService.ExtHeaderType, String> getExtHeader(Map<Integer, String> map) {
        HashMap hashMap;
        if (map == null) {
            return null;
        }
        try {
            hashMap = new HashMap();
            try {
                for (TaoBaseService.ExtHeaderType extHeaderType : TaoBaseService.ExtHeaderType.values()) {
                    String str = map.get(Integer.valueOf(extHeaderType.ordinal()));
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put(extHeaderType, str);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                ALog.e("AccsAbstractDataListener", "getExtHeader", e, new Object[0]);
                return hashMap;
            }
        } catch (Exception e3) {
            e = e3;
            hashMap = null;
            ALog.e("AccsAbstractDataListener", "getExtHeader", e, new Object[0]);
            return hashMap;
        }
        return hashMap;
    }

    private static TaoBaseService.ExtraInfo getExtraInfo(Intent intent) {
        TaoBaseService.ExtraInfo extraInfo = new TaoBaseService.ExtraInfo();
        try {
            HashMap hashMap = (HashMap) intent.getSerializableExtra("ext_header");
            Map<TaoBaseService.ExtHeaderType, String> extHeader = getExtHeader(hashMap);
            String stringExtra = intent.getStringExtra("packageName");
            String stringExtra2 = intent.getStringExtra("host");
            extraInfo.connType = intent.getIntExtra("conn_type", 0);
            extraInfo.extHeader = extHeader;
            extraInfo.oriExtHeader = hashMap;
            extraInfo.fromPackage = stringExtra;
            extraInfo.fromHost = stringExtra2;
        } catch (Throwable th) {
            ALog.e("AccsAbstractDataListener", "getExtraInfo", th, new Object[0]);
        }
        return extraInfo;
    }

    public static int onReceiveData(Context context, Intent intent, AccsDataListener accsDataListener) {
        String str;
        boolean booleanExtra;
        Context context2 = context;
        Intent intent2 = intent;
        AccsDataListener accsDataListener2 = accsDataListener;
        if (accsDataListener2 == null || context2 == null) {
            ALog.e("AccsAbstractDataListener", "onReceiveData listener or context null", new Object[0]);
            return 2;
        }
        if (intent2 != null) {
            try {
                int intExtra = intent2.getIntExtra("command", -1);
                int intExtra2 = intent2.getIntExtra("errorCode", 0);
                String stringExtra = intent2.getStringExtra("userInfo");
                String stringExtra2 = intent2.getStringExtra("dataId");
                str = intent2.getStringExtra("serviceId");
                try {
                    if (ALog.isPrintLog(ALog.Level.I)) {
                        ALog.i("AccsAbstractDataListener", "onReceiveData", "dataId", stringExtra2, "serviceId", str, "command", Integer.valueOf(intExtra), "className", accsDataListener.getClass().getName());
                    }
                    if (intExtra > 0) {
                        UTMini.getInstance().commitEvent(66001, "MsgToBuss5", "commandId=" + intExtra, "serviceId=" + str + " dataId=" + stringExtra2, 221);
                        b.a("accs", "to_buss", "3commandId=" + intExtra + "serviceId=" + str, 0.0d);
                        switch (intExtra) {
                            case 5:
                                accsDataListener2.onBind(str, intExtra2, getExtraInfo(intent));
                                break;
                            case 6:
                                accsDataListener2.onUnbind(str, intExtra2, getExtraInfo(intent));
                                break;
                            case 100:
                                String stringExtra3 = intent2.getStringExtra("dataId");
                                if (!TextUtils.equals("res", intent2.getStringExtra("send_type"))) {
                                    accsDataListener2.onSendData(str, stringExtra3, intExtra2, getExtraInfo(intent));
                                    break;
                                } else {
                                    accsDataListener.onResponse(str, stringExtra3, intExtra2, intent2.getByteArrayExtra("data"), getExtraInfo(intent));
                                    break;
                                }
                            case BaseLoginOrRegisterActivity.o:
                                byte[] byteArrayExtra = intent2.getByteArrayExtra("data");
                                boolean booleanExtra2 = intent2.getBooleanExtra("bizAck", false);
                                if (byteArrayExtra == null) {
                                    ALog.e("AccsAbstractDataListener", "onReceiveData COMMAND_RECEIVE_DATA msg null", new Object[0]);
                                    b.a("accs", "send_fail", str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "COMMAND_RECEIVE_DATA msg null");
                                    break;
                                } else {
                                    String stringExtra4 = intent2.getStringExtra("dataId");
                                    if (ALog.isPrintLog(ALog.Level.D)) {
                                        ALog.d("AccsAbstractDataListener", "onReceiveData COMMAND_RECEIVE_DATA onData dataId:" + stringExtra4 + " serviceId:" + str, new Object[0]);
                                    }
                                    TaoBaseService.ExtraInfo extraInfo = getExtraInfo(intent);
                                    if (booleanExtra2) {
                                        ALog.i("AccsAbstractDataListener", "onReceiveData try to send biz ack dataId " + stringExtra4, new Object[0]);
                                        sendBusinessAck(context2, intent2, stringExtra4, extraInfo.oriExtHeader);
                                    }
                                    NetPerformanceMonitor netPerformanceMonitor = (NetPerformanceMonitor) intent2.getSerializableExtra("monitor");
                                    if (netPerformanceMonitor != null) {
                                        netPerformanceMonitor.onToAccsTime();
                                        if (!(context2 instanceof AgooService)) {
                                            AppMonitor.getInstance().commitStat(netPerformanceMonitor);
                                        }
                                    }
                                    b.a("accs", "to_buss_success", "1commandId=101serviceId=" + str, 0.0d);
                                    accsDataListener.onData(str, stringExtra, stringExtra4, byteArrayExtra, extraInfo);
                                    break;
                                }
                            case 103:
                                boolean booleanExtra3 = intent2.getBooleanExtra("connect_avail", false);
                                String stringExtra5 = intent2.getStringExtra("host");
                                String stringExtra6 = intent2.getStringExtra("errorDetail");
                                boolean booleanExtra4 = intent2.getBooleanExtra("type_inapp", false);
                                boolean booleanExtra5 = intent2.getBooleanExtra("is_center_host", false);
                                if (!TextUtils.isEmpty(stringExtra5)) {
                                    if (!booleanExtra3) {
                                        TaoBaseService.ConnectInfo connectInfo = new TaoBaseService.ConnectInfo(stringExtra5, booleanExtra4, booleanExtra5, intExtra2, stringExtra6);
                                        accsDataListener2.onDisconnected(connectInfo);
                                        break;
                                    } else {
                                        accsDataListener2.onConnected(new TaoBaseService.ConnectInfo(stringExtra5, booleanExtra4, booleanExtra5));
                                        break;
                                    }
                                }
                                break;
                            case 104:
                                ALog.e("AccsAbstractDataListener", "onReceiveData anti brush result:" + booleanExtra, new Object[0]);
                                accsDataListener2.onAntiBrush(booleanExtra, null);
                                break;
                            default:
                                ALog.w("AccsAbstractDataListener", "onReceiveData command not handled", new Object[0]);
                                break;
                        }
                    } else {
                        ALog.w("AccsAbstractDataListener", "onReceiveData command not handled", new Object[0]);
                    }
                } catch (Exception e2) {
                    e = e2;
                    b.a("accs", "send_fail", str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "callback error" + e.toString());
                    ALog.e("AccsAbstractDataListener", "onReceiveData", e, new Object[0]);
                    return 2;
                }
            } catch (Exception e3) {
                e = e3;
                str = "";
                b.a("accs", "send_fail", str, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "callback error" + e.toString());
                ALog.e("AccsAbstractDataListener", "onReceiveData", e, new Object[0]);
                return 2;
            }
        }
        return 2;
    }

    private static void sendBusinessAck(Context context, Intent intent, String str, Map<Integer, String> map) {
        try {
            ALog.i("AccsAbstractDataListener", "sendBusinessAck", "dataId", str);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("host");
                String stringExtra2 = intent.getStringExtra("source");
                String stringExtra3 = intent.getStringExtra("target");
                String stringExtra4 = intent.getStringExtra("appKey");
                String stringExtra5 = intent.getStringExtra("configTag");
                short shortExtra = intent.getShortExtra("flags", 0);
                com.taobao.accs.b accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
                if (accsInstance != null) {
                    accsInstance.a(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                    b.a("accs", "bizAckSucc", "", 0.0d);
                    return;
                }
                b.a("accs", "bizAckFail", "no acsmgr", 0.0d);
            }
        } catch (Throwable th) {
            ALog.e("AccsAbstractDataListener", "sendBusinessAck", th, new Object[0]);
            b.a("accs", "bizAckFail", th.toString(), 0.0d);
        }
    }
}
