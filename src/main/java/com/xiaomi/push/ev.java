package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Set;
import org.json.JSONObject;

public class ev extends ex {
    public ev(Context context, int i) {
        super(context, i);
    }

    private String b() {
        StringBuilder sb = new StringBuilder();
        try {
            Intent registerReceiver = this.f321a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                Bundle extras = registerReceiver.getExtras();
                if (extras != null) {
                    Set<String> keySet = extras.keySet();
                    JSONObject jSONObject = new JSONObject();
                    if (keySet != null && keySet.size() > 0) {
                        for (String str : keySet) {
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    jSONObject.put(str, String.valueOf(extras.get(str)));
                                } catch (Exception unused) {
                                }
                            }
                        }
                        sb.append(jSONObject);
                    }
                }
            }
        } catch (Exception unused2) {
        }
        return sb.toString();
    }

    public int a() {
        return 20;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m209a() {
        return im.Battery;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m210a() {
        return b();
    }
}
