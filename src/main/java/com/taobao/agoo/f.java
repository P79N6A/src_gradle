package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;

public class f implements BaseNotifyClickActivity.INotifyListener {
    public String getMsgSource() {
        return "oppo";
    }

    public String parseMsgFromIntent(Intent intent) {
        String str;
        Throwable th;
        if (intent == null) {
            ALog.e("DefaultOppoMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra("oppo_payload");
            try {
                ALog.i("DefaultOppoMsgParseImpl", "parseMsgFromIntent", "msg", str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            ALog.e("DefaultOppoMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
        return str;
    }
}
