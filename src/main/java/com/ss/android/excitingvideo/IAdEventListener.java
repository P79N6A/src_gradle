package com.ss.android.excitingvideo;

import android.content.Context;
import org.json.JSONObject;

public interface IAdEventListener {
    void onAdEvent(Context context, String str, String str2, long j, long j2, String str3, JSONObject jSONObject, int i);
}
