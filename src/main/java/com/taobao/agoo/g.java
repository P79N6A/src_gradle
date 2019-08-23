package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;

public class g implements BaseNotifyClickActivity.INotifyListener {
    public String getMsgSource() {
        return "vivo";
    }

    public String parseMsgFromIntent(Intent intent) {
        String str;
        Throwable th;
        if (intent == null) {
            ALog.e("DefaultVivoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra("vivo_payload");
            try {
                ALog.i("DefaultVivoMsgParseImpl", "parseMsgFromIntent", "msg", str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            ALog.e("DefaultVivoMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
        return str;
    }
}
