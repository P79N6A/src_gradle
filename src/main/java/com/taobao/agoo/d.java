package com.taobao.agoo;

import android.content.Intent;
import com.taobao.accs.utl.ALog;
import com.taobao.agoo.BaseNotifyClickActivity;

public class d implements BaseNotifyClickActivity.INotifyListener {
    public String getMsgSource() {
        return "huawei";
    }

    public String parseMsgFromIntent(Intent intent) {
        String str;
        if (intent == null) {
            ALog.e("DefaultHuaweiMsgParseImpl", "parseMsgFromIntent null", new Object[0]);
            return null;
        }
        try {
            str = intent.getStringExtra("extras");
        } catch (Throwable th) {
            ALog.e("DefaultHuaweiMsgParseImpl", "parseMsgFromIntent", th, new Object[0]);
            str = null;
        }
        return str;
    }
}
