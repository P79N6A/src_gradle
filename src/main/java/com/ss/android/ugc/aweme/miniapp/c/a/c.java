package com.ss.android.ugc.aweme.miniapp.c.a;

import a.i;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.miniapp.a.g;
import com.ss.android.ugc.aweme.miniapp.a.h;
import com.ss.android.ugc.aweme.miniapp.a.j;
import com.ss.android.ugc.aweme.miniapp.b;
import com.ss.android.ugc.aweme.miniapp.q;
import com.ss.android.ugc.aweme.miniapp_api.a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.process.HostProcessBridge;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.handler.ISyncHostDataHandler;
import com.tt.miniapphost.util.DebugUtil;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements ISyncHostDataHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55605a;

    /* renamed from: b  reason: collision with root package name */
    private a f55606b = new a();

    @NonNull
    public final String getType() {
        return "hostActionSync";
    }

    public final CrossProcessDataEntity action(@Nullable CrossProcessDataEntity crossProcessDataEntity) {
        CrossProcessDataEntity crossProcessDataEntity2;
        boolean z;
        CrossProcessDataEntity crossProcessDataEntity3 = crossProcessDataEntity;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{crossProcessDataEntity3}, this, f55605a, false, 59360, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class)) {
            return (CrossProcessDataEntity) PatchProxy.accessDispatch(new Object[]{crossProcessDataEntity3}, this, f55605a, false, 59360, new Class[]{CrossProcessDataEntity.class}, CrossProcessDataEntity.class);
        } else if (crossProcessDataEntity3 == null) {
            DebugUtil.outputError("HostActionSyncHandler", "callData == null");
            return null;
        } else {
            String string = crossProcessDataEntity3.getString("hostActionType");
            CrossProcessDataEntity crossProcessDataEntity4 = crossProcessDataEntity3.getCrossProcessDataEntity("hostActionData");
            if (TextUtils.isEmpty(string)) {
                DebugUtil.outputError("HostActionSyncHandler", "TextUtils.isEmpty(hostCallType)");
                return null;
            }
            char c2 = 65535;
            switch (string.hashCode()) {
                case -1801325650:
                    if (string.equals("mini_app_ad_web_url")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 41118167:
                    if (string.equals("share_info_params")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1270009270:
                    if (string.equals("exciting_video_open_url")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 1574122267:
                    if (string.equals("actionVILog")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1657545787:
                    if (string.equals("login_state")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return this.f55606b.a(crossProcessDataEntity4);
                case 1:
                    try {
                        JSONObject jSONObject = new JSONObject(crossProcessDataEntity4.getString("hostActionData"));
                        String optString = jSONObject.optString(f.f34168b);
                        String optString2 = jSONObject.optString("web_url");
                        String optString3 = jSONObject.optString("web_title");
                        String optString4 = jSONObject.optString("log_extra");
                        long optLong = jSONObject.optLong("creative_id");
                        String optString5 = jSONObject.optString("target_class");
                        if (!TextUtils.isEmpty(optString5)) {
                            a.a().f55980e = optString5;
                        }
                        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
                        if (PatchProxy.isSupport(new Object[]{applicationContext, optString, optString2, optString3, optString4, new Long(optLong)}, null, g.f55437a, true, 59143, new Class[]{Context.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{applicationContext, optString, optString2, optString3, optString4, new Long(optLong)}, null, g.f55437a, true, 59143, new Class[]{Context.class, String.class, String.class, String.class, String.class, Long.TYPE}, Void.TYPE);
                        } else if (applicationContext != null) {
                            if (PatchProxy.isSupport(new Object[]{applicationContext, optString, optString4, new Long(optLong)}, null, g.f55437a, true, 59145, new Class[]{Context.class, String.class, String.class, Long.TYPE}, Boolean.TYPE)) {
                                z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{applicationContext, optString, optString4, new Long(optLong)}, null, g.f55437a, true, 59145, new Class[]{Context.class, String.class, String.class, Long.TYPE}, Boolean.TYPE)).booleanValue();
                            } else if (!TextUtils.isEmpty(optString)) {
                                Uri parse = Uri.parse(optString);
                                if (!TextUtils.isEmpty(parse.getScheme())) {
                                    String lowerCase = parse.getScheme().toLowerCase();
                                    if (!TextUtils.isEmpty(lowerCase)) {
                                        if (!q.a().i.a((Context) applicationContext, optString, lowerCase)) {
                                            if (PatchProxy.isSupport(new Object[]{applicationContext, optString, optString4, new Long(optLong), parse}, null, g.f55437a, true, 59146, new Class[]{Context.class, String.class, String.class, Long.TYPE, Uri.class}, Boolean.TYPE)) {
                                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{applicationContext, optString, optString4, new Long(optLong), parse}, null, g.f55437a, true, 59146, new Class[]{Context.class, String.class, String.class, Long.TYPE, Uri.class}, Boolean.TYPE)).booleanValue();
                                            } else {
                                                Intent intent = new Intent("android.intent.action.VIEW");
                                                intent.setData(parse);
                                                if (!ToolUtils.isInstalledApp((Context) applicationContext, intent)) {
                                                    z = false;
                                                } else {
                                                    if (optString.contains("__back_url__")) {
                                                        optString = optString.replace("__back_url__", Uri.encode(g.f55439c));
                                                        intent.setData(Uri.parse(optString));
                                                        i.a((Callable<TResult>) new h<TResult>(optLong, optString4));
                                                    }
                                                    intent.putExtra(f.f34168b, optString);
                                                    applicationContext.startActivity(intent);
                                                    z = true;
                                                }
                                            }
                                            if (z) {
                                                g.a(applicationContext, "open_url_app", optLong, optString4);
                                                if (PatchProxy.isSupport(new Object[]{applicationContext, new Long(optLong), optString4}, null, g.f55437a, true, 59147, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{applicationContext, new Long(optLong), optString4}, null, g.f55437a, true, 59147, new Class[]{Context.class, Long.TYPE, String.class}, Void.TYPE);
                                                } else {
                                                    com.ss.android.ugc.aweme.miniapp.a.i iVar = new com.ss.android.ugc.aweme.miniapp.a.i(applicationContext, optLong, optString4);
                                                    if (PatchProxy.isSupport(new Object[]{iVar}, null, g.f55437a, true, 59151, new Class[]{g.a.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{iVar}, null, g.f55437a, true, 59151, new Class[]{g.a.class}, Void.TYPE);
                                                    } else {
                                                        i.a(5000).a((a.g<TResult, TContinuationResult>) new j<TResult,TContinuationResult>(iVar));
                                                    }
                                                }
                                            }
                                        }
                                        z2 = true;
                                    }
                                }
                            }
                            if (!z2) {
                                q.a().i.b((Context) applicationContext, optString2, optString3);
                                g.a(applicationContext, "open_url_h5", optLong, optString4);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                    crossProcessDataEntity2 = null;
                    break;
                case 2:
                    try {
                        JSONObject jSONObject2 = new JSONObject(crossProcessDataEntity4.getString("hostActionData"));
                        String optString6 = jSONObject2.optString("web_url");
                        String optString7 = jSONObject2.optString("web_title");
                        String optString8 = jSONObject2.optString("target_class");
                        if (!TextUtils.isEmpty(optString8)) {
                            a.a().f55980e = optString8;
                        }
                        g.a(AppbrandContext.getInst().getApplicationContext(), optString6, optString7);
                        break;
                    } catch (JSONException unused2) {
                        break;
                    }
                case 3:
                    return CrossProcessDataEntity.Builder.create().put("share_info_value", a.a().f55979d).build();
                case 4:
                    String string2 = crossProcessDataEntity4.getString("login_state_value");
                    if (!PatchProxy.isSupport(new Object[]{string2}, null, b.f55477a, true, 58993, new Class[]{String.class}, Void.TYPE)) {
                        b.a aVar = b.f55479c;
                        if (!PatchProxy.isSupport(new Object[]{string2}, aVar, b.a.f55484a, false, 58995, new Class[]{String.class}, Void.TYPE)) {
                            if (!TextUtils.equals(string2, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                                if (TextUtils.equals(string2, PushConstants.PUSH_TYPE_NOTIFY)) {
                                    aVar.f55485b = false;
                                    break;
                                }
                            } else {
                                aVar.f55485b = true;
                                break;
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{string2}, aVar, b.a.f55484a, false, 58995, new Class[]{String.class}, Void.TYPE);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[]{string2}, null, b.f55477a, true, 58993, new Class[]{String.class}, Void.TYPE);
                        break;
                    }
                    break;
            }
            crossProcessDataEntity2 = null;
            return crossProcessDataEntity2;
        }
    }

    @MiniAppProcess
    public static void a(String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j3 = j;
        long j4 = j2;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, new Long(j3), new Long(j4), jSONObject2}, null, f55605a, true, 59361, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6, new Long(j3), new Long(j4), jSONObject2}, null, f55605a, true, 59361, new Class[]{String.class, String.class, String.class, Long.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        HostProcessBridge.hostActionSync("actionVILog", CrossProcessDataEntity.Builder.create().put("category", str4).put("logEventName", str5).put("labelName", str6).put("logVIValue", Long.valueOf(j)).put("logVIExtValue", Long.valueOf(j2)).put("logEventData", jSONObject2).build());
    }
}
