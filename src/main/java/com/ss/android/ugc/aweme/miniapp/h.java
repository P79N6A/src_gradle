package com.ss.android.ugc.aweme.miniapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.e.d;
import com.ss.android.ugc.aweme.miniapp.views.MainProcessProxyActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.q;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.callback.IpcCallback;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.option.share.OnShareEventListener;
import com.tt.option.share.ShareInfoModel;
import java.io.IOException;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55769a;

    static void a(OnShareEventListener onShareEventListener, Intent intent) {
        final OnShareEventListener onShareEventListener2 = onShareEventListener;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{onShareEventListener2, intent2}, null, f55769a, true, 59019, new Class[]{OnShareEventListener.class, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onShareEventListener2, intent2}, null, f55769a, true, 59019, new Class[]{OnShareEventListener.class, Intent.class}, Void.TYPE);
            return;
        }
        ProcessUtil.fillCrossProcessCallbackIntent(intent2, new IpcCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55770a;

            public final void onIpcCallback(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
                if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity}, this, f55770a, false, 59025, new Class[]{CrossProcessDataEntity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity}, this, f55770a, false, 59025, new Class[]{CrossProcessDataEntity.class}, Void.TYPE);
                    return;
                }
                if (onShareEventListener2 != null) {
                    if (crossProcessDataEntity == null) {
                        onShareEventListener2.onFail(null);
                    } else if (crossProcessDataEntity.getBoolean("proxy_result")) {
                        onShareEventListener2.onSuccess(null);
                    } else {
                        onShareEventListener2.onCancel(null);
                    }
                }
            }
        });
    }

    static boolean a(@NonNull Activity activity, String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, null, f55769a, true, 59020, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, null, f55769a, true, 59020, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(str2);
            mediaPlayer.prepare();
            if (((long) mediaPlayer.getDuration()) < 3000) {
                d dVar = new d(activity2);
                String string = activity2.getString(C0906R.string.dr6);
                if (PatchProxy.isSupport(new Object[]{string}, dVar, d.f48498a, false, 45963, new Class[]{String.class}, Void.TYPE)) {
                    d dVar2 = dVar;
                    PatchProxy.accessDispatch(new Object[]{string}, dVar2, d.f48498a, false, 45963, new Class[]{String.class}, Void.TYPE);
                } else {
                    dVar.a(null, 0, 0, string, 3500, 17);
                }
                return true;
            }
        } catch (IOException unused) {
        }
        return false;
    }

    public static void a(@NonNull Activity activity, ShareInfoModel shareInfoModel, OnShareEventListener onShareEventListener) {
        Activity activity2 = activity;
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        OnShareEventListener onShareEventListener2 = onShareEventListener;
        if (PatchProxy.isSupport(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, null, f55769a, true, 59015, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, shareInfoModel2, onShareEventListener2}, null, f55769a, true, 59015, new Class[]{Activity.class, ShareInfoModel.class, OnShareEventListener.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("video", shareInfoModel2.channel)) {
            Intent intent = new Intent(activity2, MainProcessProxyActivity.class);
            q qVar = new q();
            qVar.setAppId(shareInfoModel2.appInfo.appId);
            qVar.setAppTitle(shareInfoModel2.title);
            qVar.setAppUrl(shareInfoModel2.queryString);
            qVar.setCardImage(shareInfoModel2.imageUrl);
            intent.putExtra("micro_app_info", qVar);
            intent.putExtra("micro_app_class", activity.getClass());
            intent.putExtra("translation_type", 3);
            String uuid = UUID.randomUUID().toString();
            intent.putExtra("creation_id", uuid);
            intent.putExtra("shoot_way", "mp_record");
            a(onShareEventListener2, intent);
            a(shareInfoModel2, intent, qVar, 2);
            intent.putExtra("proxy_type", 1);
            activity2.startActivity(intent);
            HostProcessBridge.logEvent("shoot", new JSONObject(com.ss.android.ugc.aweme.app.d.d.a().a("shoot_way", "mp_record").a("creation_id", uuid).f34114b));
        }
    }

    static void a(ShareInfoModel shareInfoModel, Intent intent, q qVar, int i) {
        JSONObject jSONObject;
        ShareInfoModel shareInfoModel2 = shareInfoModel;
        Intent intent2 = intent;
        q qVar2 = qVar;
        if (PatchProxy.isSupport(new Object[]{shareInfoModel2, intent2, qVar2, Integer.valueOf(i)}, null, f55769a, true, 59018, new Class[]{ShareInfoModel.class, Intent.class, q.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareInfoModel2, intent2, qVar2, Integer.valueOf(i)}, null, f55769a, true, 59018, new Class[]{ShareInfoModel.class, Intent.class, q.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (shareInfoModel2 == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException unused) {
                return;
            }
        } else if (TextUtils.isEmpty(shareInfoModel2.extra)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(shareInfoModel2.extra);
        }
        String optString = jSONObject.optString("sticker_id");
        if (!TextUtils.isEmpty(optString)) {
            intent2.putExtra("sticker_id", optString);
        }
        jSONObject.put("timor_video_source", i);
        qVar2.setExtra(jSONObject.toString());
    }
}
