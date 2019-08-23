package com.taobao.accs.base;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.taobao.accs.utl.ALog;
import java.io.Serializable;
import java.util.Map;

public abstract class TaoBaseService extends Service implements AccsDataListener {
    private AccsAbstractDataListener mDefaultDataListener = new AccsAbstractDataListener() {
        public void onBind(String str, int i, ExtraInfo extraInfo) {
        }

        public void onData(String str, String str2, String str3, byte[] bArr, ExtraInfo extraInfo) {
        }

        public void onResponse(String str, String str2, int i, byte[] bArr, ExtraInfo extraInfo) {
        }

        public void onSendData(String str, String str2, int i, ExtraInfo extraInfo) {
        }

        public void onUnbind(String str, int i, ExtraInfo extraInfo) {
        }
    };
    private Messenger messenger = new Messenger(new Handler() {
        public void handleMessage(Message message) {
            if (message != null) {
                ALog.i("TaoBaseService", "handleMessage on receive msg", "msg", message.toString());
                Intent intent = (Intent) message.getData().getParcelable("intent");
                if (intent != null) {
                    ALog.i("TaoBaseService", "handleMessage get intent success", "intent", intent.toString());
                    TaoBaseService.this.onStartCommand(intent, 0, 0);
                }
            }
        }
    });

    public static class ConnectInfo implements Serializable {
        private static final long serialVersionUID = 8974674111758240362L;
        public boolean connected;
        public int errorCode;
        public String errordetail;
        public String host;
        public boolean isCenterHost;
        public boolean isInapp;

        public String toString() {
            return "ConnectInfo{" + "host='" + this.host + '\'' + ", isInapp=" + this.isInapp + ", isCenterHost=" + this.isCenterHost + ", connected=" + this.connected + ", errorCode=" + this.errorCode + ", errorDetail='" + this.errordetail + '\'' + '}';
        }

        public ConnectInfo(String str, boolean z, boolean z2) {
            this.host = str;
            this.isInapp = z;
            this.isCenterHost = z2;
        }

        public ConnectInfo(String str, boolean z, boolean z2, int i, String str2) {
            this.host = str;
            this.isInapp = z;
            this.isCenterHost = z2;
            this.errorCode = i;
            this.errordetail = str2;
        }
    }

    public enum ExtHeaderType {
        TYPE_BUSINESS,
        TYPE_SID,
        TYPE_USERID,
        TYPE_COOKIE,
        TYPE_TAG,
        TYPE_STATUS,
        TYPE_DELAY,
        TYPE_EXPIRE,
        TYPE_LOCATION,
        TYPE_UNIT,
        TYPE_NEED_BUSINESS_ACK;

        public static ExtHeaderType valueOf(int i) {
            switch (i) {
                case 0:
                    return TYPE_BUSINESS;
                case 1:
                    return TYPE_SID;
                case 2:
                    return TYPE_USERID;
                case 3:
                    return TYPE_COOKIE;
                case 4:
                    return TYPE_TAG;
                case 5:
                    return TYPE_STATUS;
                case 6:
                    return TYPE_DELAY;
                case e.l:
                    return TYPE_EXPIRE;
                case 8:
                    return TYPE_LOCATION;
                case 9:
                    return TYPE_UNIT;
                case 10:
                    return TYPE_NEED_BUSINESS_ACK;
                default:
                    return null;
            }
        }
    }

    public static class ExtraInfo implements Serializable {
        public int connType;
        public Map<ExtHeaderType, String> extHeader;
        public String fromHost;
        public String fromPackage;
        public Map<Integer, String> oriExtHeader;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public IBinder onBind(Intent intent) {
        return this.messenger.getBinder();
    }

    public void onConnected(ConnectInfo connectInfo) {
        this.mDefaultDataListener.onConnected(connectInfo);
    }

    public void onDisconnected(ConnectInfo connectInfo) {
        this.mDefaultDataListener.onDisconnected(connectInfo);
    }

    public void onAntiBrush(boolean z, ExtraInfo extraInfo) {
        this.mDefaultDataListener.onAntiBrush(z, extraInfo);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("TaoBaseService", "onStartCommand", "className", getClass().getSimpleName());
        }
        return AccsAbstractDataListener.onReceiveData(this, intent, this);
    }
}
