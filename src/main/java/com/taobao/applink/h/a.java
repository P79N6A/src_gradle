package com.taobao.applink.h;

import android.text.TextUtils;
import com.taobao.applink.util.e;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Map f79198a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private String f79199b;

    private a() {
    }

    public static a a() {
        return new a();
    }

    public a a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f79199b = str;
        }
        return this;
    }

    public a a(Map map) {
        if (map != null) {
            this.f79198a.putAll(map);
        }
        return this;
    }

    public void b() {
        if (!TextUtils.isEmpty(this.f79199b)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.format("https://wgo.mmstat.com%s?", new Object[]{this.f79199b}));
            stringBuffer.append(e.a(this.f79198a));
            if (stringBuffer.toString().length() > 8000) {
                if (this.f79198a.containsKey("param")) {
                    this.f79198a.remove("param");
                }
                stringBuffer = new StringBuffer();
                stringBuffer.append(String.format("https://wgo.mmstat.com%s?", new Object[]{this.f79199b}));
                stringBuffer.append(e.a(this.f79198a));
            }
            new b(this, stringBuffer.toString()).execute(new Void[0]);
            return;
        }
        throw new IllegalArgumentException("spm is null");
    }
}
