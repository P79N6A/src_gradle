package com.taobao.accs.init;

import android.app.Application;
import com.taobao.accs.client.a;
import java.util.HashMap;

public class Launcher_InitAccsHTao extends Launcher_InitAccs {
    public void init(Application application, HashMap<String, Object> hashMap) {
        defaultAppkey = "";
        super.init(application, hashMap);
        a.f78910b = "com.taobao.taobao.TaobaoIntentService";
    }
}
