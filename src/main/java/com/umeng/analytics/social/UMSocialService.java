package com.umeng.analytics.social;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import org.json.JSONObject;

public abstract class UMSocialService {

    static class a extends AsyncTask<Void, Void, c> {

        /* renamed from: a  reason: collision with root package name */
        String f80715a;

        /* renamed from: b  reason: collision with root package name */
        String f80716b;

        /* renamed from: c  reason: collision with root package name */
        b f80717c;

        /* renamed from: d  reason: collision with root package name */
        UMPlatformData[] f80718d;

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (this.f80717c != null) {
                this.f80717c.a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(c cVar) {
            if (this.f80717c != null) {
                this.f80717c.a(cVar, this.f80718d);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public c doInBackground(Void... voidArr) {
            String str;
            if (TextUtils.isEmpty(this.f80716b)) {
                str = b.a(this.f80715a);
            } else {
                str = b.a(this.f80715a, this.f80716b);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt(TimeDisplaySetting.START_SHOW_TIME);
                if (optInt == 0) {
                    optInt = -404;
                }
                c cVar = new c(optInt);
                String optString = jSONObject.optString("msg");
                if (!TextUtils.isEmpty(optString)) {
                    cVar.a(optString);
                }
                String optString2 = jSONObject.optString("data");
                if (!TextUtils.isEmpty(optString2)) {
                    cVar.b(optString2);
                }
                return cVar;
            } catch (Exception e2) {
                return new c(-99, e2);
            }
        }

        public a(String[] strArr, b bVar, UMPlatformData[] uMPlatformDataArr) {
            this.f80715a = strArr[0];
            this.f80716b = strArr[1];
            this.f80717c = bVar;
            this.f80718d = uMPlatformDataArr;
        }
    }

    public interface b {
        void a();

        void a(c cVar, UMPlatformData... uMPlatformDataArr);
    }

    public static void share(Context context, UMPlatformData... uMPlatformDataArr) {
        a(context, null, null, uMPlatformDataArr);
    }

    public static void share(Context context, String str, UMPlatformData... uMPlatformDataArr) {
        a(context, null, str, uMPlatformDataArr);
    }

    private static void a(Context context, b bVar, String str, UMPlatformData... uMPlatformDataArr) {
        if (uMPlatformDataArr != null) {
            try {
                int length = uMPlatformDataArr.length;
                int i = 0;
                while (i < length) {
                    if (uMPlatformDataArr[i].isValid()) {
                        i++;
                    } else {
                        throw new a("parameter is not valid.");
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
        new a(e.a(context, str, uMPlatformDataArr), bVar, uMPlatformDataArr).execute(new Void[0]);
    }
}
