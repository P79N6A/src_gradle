package org.android.agoo.control;

import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.ALog;
import org.android.agoo.common.Config;
import org.json.JSONArray;
import org.json.JSONObject;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte[] f83999a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f84000b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AgooFactory f84001c;

    public void run() {
        try {
            String str = new String(this.f83999a, "utf-8");
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 1) {
                String str2 = null;
                String str3 = null;
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (jSONObject != null) {
                        str2 = jSONObject.getString("i");
                        str3 = jSONObject.getString("p");
                    }
                }
                if (ALog.isPrintLog(ALog.Level.I)) {
                    ALog.i("AgooFactory", "saveMsg msgId:" + str2 + ",message=" + str + ",currentPack=" + str3 + ",reportTimes=" + Config.e(AgooFactory.mContext), new Object[0]);
                }
                if (!TextUtils.isEmpty(str3) && TextUtils.equals(str3, AgooFactory.mContext.getPackageName())) {
                    if (TextUtils.isEmpty(this.f84000b)) {
                        AgooFactory.access$100(this.f84001c).a(str2, str, PushConstants.PUSH_TYPE_NOTIFY);
                        return;
                    }
                    AgooFactory.access$100(this.f84001c).a(str2, str, this.f84000b);
                }
            }
        } catch (Throwable th) {
            ALog.e("AgooFactory", "saveMsg fail:" + th.toString(), new Object[0]);
        }
    }

    a(AgooFactory agooFactory, byte[] bArr, String str) {
        this.f84001c = agooFactory;
        this.f83999a = bArr;
        this.f84000b = str;
    }
}
