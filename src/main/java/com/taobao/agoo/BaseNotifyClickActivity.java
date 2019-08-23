package com.taobao.agoo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.taobao.accs.utl.ALog;
import java.util.HashSet;
import java.util.Set;

public class BaseNotifyClickActivity extends Activity {
    public static Set<INotifyListener> notifyListeners;
    private a baseNotifyClick = new c(this);

    public interface INotifyListener {
        String getMsgSource();

        String parseMsgFromIntent(Intent intent);
    }

    public void onMessage(Intent intent) {
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    public static void addNotifyListener(INotifyListener iNotifyListener) {
        if (notifyListeners == null) {
            notifyListeners = new HashSet();
        }
        notifyListeners.add(iNotifyListener);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ALog.i("Naccs.BaseNotifyClickActivity", "onCreate", new Object[0]);
        this.baseNotifyClick.a((Context) this, getIntent());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ALog.i("Naccs.BaseNotifyClickActivity", "onNewIntent", new Object[0]);
        this.baseNotifyClick.b(intent);
    }
}
