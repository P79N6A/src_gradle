package com.ss.android.ugc.aweme.miniapp.i;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.miniapp.q;
import com.tt.miniapphost.hostmethod.HostMethodManager;
import com.tt.miniapphost.hostmethod.IHostMethod;
import com.tt.miniapphost.process.bridge.ProcessCallControlBridge;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import org.json.JSONObject;

public class c implements IHostMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55784a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f55785b = "c";

    /* renamed from: c  reason: collision with root package name */
    private IpcCallback f55786c;

    public void call(Activity activity, JSONObject jSONObject, HostMethodManager.ResponseCallBack responseCallBack) throws Exception {
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public boolean shouldHandleActivityResult(JSONObject jSONObject) {
        return false;
    }

    public String callSync(Activity activity, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{activity, jSONObject}, this, f55784a, false, 59478, new Class[]{Activity.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{activity, jSONObject}, this, f55784a, false, 59478, new Class[]{Activity.class, JSONObject.class}, String.class);
        }
        final String optString = jSONObject.optString("micro_app_id");
        final String optString2 = jSONObject.optString("hashTagName");
        final int optInt = jSONObject.optInt("cursor");
        String optString3 = jSONObject.optString("type");
        if (!TextUtils.equals("fetch_video", optString3) && TextUtils.equals("open_video", optString3)) {
            final Activity activity2 = activity;
            AnonymousClass1 r0 = new IpcCallback() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f55787a;

                public final void onIpcCallback(@NonNull CrossProcessDataEntity crossProcessDataEntity) {
                    if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55787a, false, 59479, new Class[]{CrossProcessDataEntity.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55787a, false, 59479, new Class[]{CrossProcessDataEntity.class}, Void.TYPE);
                        return;
                    }
                    String crossProcessDataEntity2 = crossProcessDataEntity.toString();
                    Intent intent = new Intent();
                    intent.putExtra("micro_game_station_hashtag", optString2);
                    intent.putExtra("micro_game_station_id", optString);
                    intent.putExtra("micro_game_station_cursor", optInt);
                    intent.putExtra("micro_game_station_count", 10);
                    intent.putExtra("id", crossProcessDataEntity2);
                    intent.putExtra("video_from", "mp_page");
                    q.a().i.a(activity2, intent);
                }
            };
            this.f55786c = r0;
        }
        ProcessCallControlBridge.callHostProcessAsync("request_game_video", new CrossProcessDataEntity(jSONObject.toString()), this.f55786c);
        return null;
    }
}
