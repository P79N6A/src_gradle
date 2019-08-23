package com.sina.weibo.sdk.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import org.apache.http.HttpHost;

public class NetStateManager {
    public static NetState CUR_NETSTATE = NetState.Mobile;
    public static Context mContext;

    public enum NetState {
        Mobile,
        WIFI,
        NOWAY
    }

    public class NetStateReceive extends BroadcastReceiver {
        public NetStateReceive() {
        }

        public void onReceive(Context context, Intent intent) {
            NetStateManager.mContext = context;
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                if (!wifiManager.isWifiEnabled() || -1 == connectionInfo.getNetworkId()) {
                    NetStateManager.CUR_NETSTATE = NetState.Mobile;
                }
            }
        }
    }

    public static HttpHost getAPN() {
        Cursor cursor;
        Uri parse = Uri.parse("content://telephony/carriers/preferapn");
        HttpHost httpHost = null;
        if (mContext != null) {
            cursor = mContext.getContentResolver().query(parse, null, null, null, null);
        } else {
            cursor = null;
        }
        if (cursor != null && cursor.moveToFirst()) {
            String string = cursor.getString(cursor.getColumnIndex("proxy"));
            if (string != null && string.trim().length() > 0) {
                httpHost = new HttpHost(string, 80);
            }
            cursor.close();
        }
        return httpHost;
    }
}
