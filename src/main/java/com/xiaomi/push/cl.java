package com.xiaomi.push;

import android.os.AsyncTask;
import org.json.JSONException;
import org.json.JSONObject;

public class cl extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ co f81905a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f231a;

    private cl(co coVar) {
        this.f81905a = coVar;
        this.f231a = true;
    }

    /* synthetic */ cl(co coVar, cc ccVar) {
        this(coVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String onPostExecute(String str) {
        String a2 = bo.a(str, null);
        if (a2 == null) {
            return null;
        }
        try {
            return new JSONObject(a2).getString("real-ip");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(String... strArr) {
        if (this.f231a) {
            try {
                return onPostExecute(strArr[0]);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a  reason: collision with other method in class */
    public void m167a(String str) {
        if (this.f231a) {
            co.a(this.f81905a).sendMessage(co.a(this.f81905a).obtainMessage(3, str));
        }
    }

    /* access modifiers changed from: protected */
    public void onCancelled() {
        this.f231a = false;
    }
}
