package com.taobao.agoo;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.b;
import com.taobao.agoo.BaseNotifyClickActivity;
import java.util.Iterator;
import org.android.agoo.common.MsgDO;
import org.android.agoo.control.AgooFactory;
import org.android.agoo.control.NotifManager;

public abstract class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f79109a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public AgooFactory f79110b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public NotifManager f79111c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Context f79112d;

    public abstract void a(Intent intent);

    private void c(Intent intent) {
        ThreadPoolExecutorFactory.execute(new b(this, intent));
    }

    public void b(Intent intent) {
        ALog.i("accs.BaseNotifyClick", "onNewIntent", new Object[0]);
        c(intent);
    }

    /* access modifiers changed from: private */
    public void e(Intent intent) {
        try {
            String stringExtra = intent.getStringExtra("id");
            String stringExtra2 = intent.getStringExtra("message_source");
            String stringExtra3 = intent.getStringExtra("report");
            String stringExtra4 = intent.getStringExtra("extData");
            MsgDO msgDO = new MsgDO();
            msgDO.msgIds = stringExtra;
            msgDO.extData = stringExtra4;
            msgDO.messageSource = stringExtra2;
            msgDO.reportStr = stringExtra3;
            msgDO.msgStatus = "8";
            ALog.i("accs.BaseNotifyClick", "reportClickNotifyMsg messageId:" + stringExtra + " source:" + stringExtra2 + " reportStr:" + stringExtra3 + " status:" + msgDO.msgStatus, new Object[0]);
            this.f79111c.report(msgDO, null);
        } catch (Exception e2) {
            ALog.e("accs.BaseNotifyClick", "reportClickNotifyMsg exception: " + e2, new Object[0]);
        }
    }

    /* access modifiers changed from: private */
    public String d(Intent intent) {
        String str;
        if (BaseNotifyClickActivity.notifyListeners != null && BaseNotifyClickActivity.notifyListeners.size() > 0) {
            Iterator<BaseNotifyClickActivity.INotifyListener> it2 = BaseNotifyClickActivity.notifyListeners.iterator();
            str = null;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BaseNotifyClickActivity.INotifyListener next = it2.next();
                String parseMsgFromIntent = next.parseMsgFromIntent(intent);
                if (!TextUtils.isEmpty(parseMsgFromIntent)) {
                    this.f79109a = next.getMsgSource();
                    str = parseMsgFromIntent;
                    break;
                }
                str = parseMsgFromIntent;
            }
        } else {
            ALog.e("accs.BaseNotifyClick", "no impl, try use default impl to parse intent!", new Object[0]);
            BaseNotifyClickActivity.INotifyListener dVar = new d();
            String parseMsgFromIntent2 = dVar.parseMsgFromIntent(intent);
            if (TextUtils.isEmpty(parseMsgFromIntent2)) {
                dVar = new h();
                parseMsgFromIntent2 = dVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent2)) {
                dVar = new f();
                parseMsgFromIntent2 = dVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent2)) {
                dVar = new g();
                parseMsgFromIntent2 = dVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(parseMsgFromIntent2)) {
                dVar = new e();
                parseMsgFromIntent2 = dVar.parseMsgFromIntent(intent);
            }
            if (TextUtils.isEmpty(str)) {
                b.a("accs", "error", "parse 3push error", 0.0d);
            } else {
                this.f79109a = dVar.getMsgSource();
                b.a("accs", "error", "parse 3push default " + this.f79109a, 0.0d);
            }
        }
        ALog.i("accs.BaseNotifyClick", "parseMsgByThirdPush", "result", str, "msgSource", this.f79109a);
        return str;
    }

    public void a(Context context, Intent intent) {
        ALog.i("accs.BaseNotifyClick", "onCreate", new Object[0]);
        this.f79112d = context;
        c(intent);
    }
}
