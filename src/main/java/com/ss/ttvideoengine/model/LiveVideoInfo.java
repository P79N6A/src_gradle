package com.ss.ttvideoengine.model;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import org.json.JSONObject;

public class LiveVideoInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mBackupUrl;
    public String mMainUrl;
    public String[] mURLs;

    public void extractFields(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91537, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91537, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.mMainUrl = jSONObject.optString("main_play_url");
        if (!TextUtils.isEmpty(this.mMainUrl)) {
            arrayList.add(this.mMainUrl);
        }
        this.mBackupUrl = jSONObject.optString("backup_play_url");
        if (!TextUtils.isEmpty(this.mBackupUrl)) {
            arrayList.add(this.mBackupUrl);
        }
        this.mURLs = new String[arrayList.size()];
        arrayList.toArray(this.mURLs);
    }
}
