package com.ss.android.ugc.aweme.miniapp.e;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.NativeModule;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends NativeModule {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55749a;

    public final String getName() {
        return "previewImage";
    }

    public b(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    public final String invoke(String str, NativeModule.NativeModuleCallback nativeModuleCallback) throws Exception {
        String str2 = str;
        NativeModule.NativeModuleCallback nativeModuleCallback2 = nativeModuleCallback;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str2, nativeModuleCallback2}, this, f55749a, false, 59411, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, nativeModuleCallback2}, this, f55749a, false, 59411, new Class[]{String.class, NativeModule.NativeModuleCallback.class}, String.class);
        }
        JSONObject jSONObject = new JSONObject(str2);
        String optString = jSONObject.optString("current");
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("urls");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String string = optJSONArray.getString(i2);
                if (string.contains("file://")) {
                    if (new File(string.substring(7)).exists()) {
                        arrayList.add(optJSONArray.getString(i2));
                    }
                } else if (string.contains("http://")) {
                    arrayList.add(string);
                }
            }
        }
        if (arrayList.size() <= 0) {
            if (nativeModuleCallback2 != null) {
                nativeModuleCallback2.onNativeModuleCall(Boolean.FALSE);
            }
            return null;
        }
        if (!arrayList.contains(optString)) {
            optString = (String) arrayList.get(0);
        }
        int size = arrayList.size();
        while (i < size && !TextUtils.equals(optString, (CharSequence) arrayList.get(i))) {
            i++;
        }
        new ArrayList();
        if (nativeModuleCallback2 != null) {
            nativeModuleCallback2.onNativeModuleCall(Boolean.TRUE);
        }
        return null;
    }
}
