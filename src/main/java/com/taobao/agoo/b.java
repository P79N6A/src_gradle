package com.taobao.agoo;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.ALog;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Intent f79132a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f79133b;

    public void run() {
        Intent intent = null;
        try {
            if (this.f79132a != null) {
                String a2 = this.f79133b.d(this.f79132a);
                if (TextUtils.isEmpty(a2) || TextUtils.isEmpty(this.f79133b.f79109a)) {
                    ALog.e("accs.BaseNotifyClick", "parseMsgFromNotifyListener null!!", "source", this.f79133b.f79109a);
                } else {
                    if (this.f79133b.f79111c == null) {
                        NotifManager unused = this.f79133b.f79111c = new NotifManager();
                    }
                    if (this.f79133b.f79110b == null) {
                        AgooFactory unused2 = this.f79133b.f79110b = new AgooFactory();
                        this.f79133b.f79110b.init(this.f79133b.f79112d, this.f79133b.f79111c, null);
                    }
                    Bundle msgReceiverPreHandler = this.f79133b.f79110b.msgReceiverPreHandler(a2.getBytes("UTF-8"), this.f79133b.f79109a, null, false);
                    String string = msgReceiverPreHandler.getString("body");
                    ALog.i("accs.BaseNotifyClick", "begin parse EncryptedMsg", new Object[0]);
                    String parseEncryptedMsg = AgooFactory.parseEncryptedMsg(string);
                    if (!TextUtils.isEmpty(parseEncryptedMsg)) {
                        msgReceiverPreHandler.putString("body", parseEncryptedMsg);
                    } else {
                        ALog.e("accs.BaseNotifyClick", "parse EncryptedMsg fail, empty", new Object[0]);
                    }
                    Intent intent2 = new Intent();
                    try {
                        intent2.putExtras(msgReceiverPreHandler);
                        this.f79133b.f79110b.saveMsg(a2.getBytes("UTF-8"), PushConstants.PUSH_TYPE_UPLOAD_LOG);
                        this.f79133b.e(intent2);
                        intent = intent2;
                    } catch (Throwable th) {
                        th = th;
                        intent = intent2;
                        this.f79133b.a(intent);
                        throw th;
                    }
                }
            }
            try {
                this.f79133b.a(intent);
            } catch (Throwable th2) {
                ALog.e("accs.BaseNotifyClick", "onMessage", th2, new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            ALog.e("accs.BaseNotifyClick", "buildMessage", th, new Object[0]);
            this.f79133b.a(intent);
        }
    }

    b(a aVar, Intent intent) {
        this.f79133b = aVar;
        this.f79132a = intent;
    }
}
