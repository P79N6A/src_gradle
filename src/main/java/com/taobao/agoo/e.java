package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;

public class e implements BaseNotifyClickActivity.INotifyListener {
    public String getMsgSource() {
        return "meizu";
    }

    public String parseMsgFromIntent(Intent intent) {
        String str;
        Throwable th;
        if (intent == null) {
            ALog.e("DefaultMeizuMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra("meizu_payload");
            try {
                ALog.i("DefaultMeizuMsgParseImpl", "parseMsgFromIntent", "msg", str);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
            ALog.e("DefaultMeizuMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            return str;
        }
        return str;
    }
}
