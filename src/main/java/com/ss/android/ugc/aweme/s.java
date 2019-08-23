package com.ss.android.ugc.aweme;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public interface s {
    Map<String, d> getJavaMethods(@NonNull WeakReference<Context> weakReference, @NonNull a aVar);

    void notifyFromRnAndH5(JSONObject jSONObject);
}
