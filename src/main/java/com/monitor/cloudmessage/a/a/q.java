package com.monitor.cloudmessage.a.a;

import android.text.TextUtils;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.b.b.a.h;
import com.monitor.cloudmessage.callback.ITemplateConsumer;
import com.monitor.cloudmessage.entity.ConsumerResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class q extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    public ITemplateConsumer f27335a;

    /* renamed from: b  reason: collision with root package name */
    private File f27336b;

    public final String a() {
        return "custom";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27336b != null) {
            arrayList.add(this.f27336b.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        String str = aVar.f27359a;
        if (this.f27335a == null) {
            return false;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (a(jSONObject, aVar)) {
            return true;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("template");
        if (optJSONObject == null) {
            a("template字段异常", aVar);
            return true;
        }
        String handleTemplateMessage = this.f27335a.handleTemplateMessage(optJSONObject);
        ConsumerResult b2 = this.f27335a.b();
        if (b2.isSuccess()) {
            if (TextUtils.isEmpty(handleTemplateMessage)) {
                handleTemplateMessage = "{\"result\" : \"no one handle it.\"}";
            }
            com.monitor.cloudmessage.a.a();
            File a2 = h.a(com.monitor.cloudmessage.a.b(), handleTemplateMessage);
            if (a2 == null) {
                a("template文件生成异常", aVar);
                return true;
            }
            this.f27336b = a2;
            com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a(jSONObject.optString("fileContentType", "template_file_type"), 0, false, aVar.f27362d, this, b2.getSpecificParams());
            com.monitor.cloudmessage.d.a.a(aVar2);
        } else {
            a(b2.getErrMsg(), b2.getSpecificParams(), aVar);
        }
        return true;
    }
}
