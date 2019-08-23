package com.umeng.message.common.impl.json;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.message.MessageSharedPrefs;
import com.umeng.message.MsgConstant;
import com.umeng.message.UTrack;
import com.umeng.message.UmengMessageCallbackHandlerService;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.inter.IUtrack;
import com.umeng.message.entity.Alias;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.m;
import com.umeng.message.provider.a;
import com.umeng.message.service.UMJobIntentService;
import com.umeng.message.util.HttpRequest;
import com.umeng.message.util.b;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class JUtrack implements IUtrack {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81163a = "JUtrack";

    /* renamed from: b  reason: collision with root package name */
    private Context f81164b;

    public JUtrack(Context context) {
        this.f81164b = context.getApplicationContext();
    }

    public void sendRegisterLog(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.ALIAS_LOG);
        } catch (Exception e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("java.net.UnknownHostException") || !UmengMessageDeviceConfig.isOnline(this.f81164b)) {
                throw new Exception(e2);
            }
            jSONObject2 = sendRequest(this.f81164b, jSONObject, MsgConstant.ALIAS_LOG);
        }
        if (jSONObject2 != null && TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
            int parseInt = Integer.parseInt(jSONObject2.getString("da_register_policy"));
            if (parseInt > 0) {
                MessageSharedPrefs.getInstance(this.f81164b).setDaRegisterSendPolicy(parseInt);
            }
        }
    }

    public void trackLocation(JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.LBS_ENDPOINT);
        } catch (Exception e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("java.net.UnknownHostException") || !UmengMessageDeviceConfig.isOnline(this.f81164b)) {
                throw new Exception(e2);
            }
            jSONObject2 = sendRequest(this.f81164b, jSONObject, MsgConstant.LBS_ENDPOINT);
        } catch (Exception unused) {
            return;
        }
        if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("success"), "ok")) {
            UMLog.mutlInfo(f81163a, 2, "location track success");
        }
    }

    public void sendAliasFailLog(JSONObject jSONObject) {
        if (MessageSharedPrefs.getInstance(this.f81164b).getDaRegisterSendPolicy() == 1) {
            UMLog.mutlInfo(f81163a, 2, "da_register_policy=1, skip sending da_register info.");
            return;
        }
        try {
            String[] strArr = {PushConstants.PUSH_TYPE_THROUGH_MESSAGE};
            ContentResolver contentResolver = this.f81164b.getContentResolver();
            a.a(this.f81164b);
            Cursor query = contentResolver.query(a.f81330d, new String[]{"message", "time"}, "error=?", strArr, null);
            if (query != null) {
                ArrayList<Alias> arrayList = new ArrayList<>();
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(query.getColumnIndex("message"));
                    long j = query.getLong(query.getColumnIndex("time"));
                    Alias alias = new Alias();
                    alias.aliasMessage = string;
                    alias.aliasTime = j;
                    arrayList.add(alias);
                    query.moveToNext();
                }
                if (query != null) {
                    query.close();
                }
                for (Alias alias2 : arrayList) {
                    a(jSONObject, alias2.aliasMessage, alias2.aliasTime);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void trackRegister(JSONObject jSONObject) throws Exception {
        UMSLEnvelopeBuild.mContext = this.f81164b;
        UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
        JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(this.f81164b);
        JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
        jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(this.f81164b));
        jSONObject2.put("p_sdk_v", "6.0.0.001");
        jSONObject2.put("push_switch", UmengMessageDeviceConfig.isNotificationEnabled(this.f81164b));
        buildSLBaseHeader.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_token", MessageSharedPrefs.getInstance(this.f81164b).getDeviceToken());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONObject3);
        if (h.d(this.f81164b)) {
            JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(this.f81164b, buildSLBaseHeader, jSONObject4, "umpx_push_register");
            if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                MessageSharedPrefs.getInstance(this.f81164b).setHasResgister(true);
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(this.f81164b).getDeviceToken())) {
                    UMLog.mutlInfo(f81163a, 0, "setRegisteredToUmeng: device token为空");
                }
            }
        }
    }

    public void trackAppLaunch(JSONObject jSONObject) throws Exception {
        UMSLEnvelopeBuild.mContext = this.f81164b;
        UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
        JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(this.f81164b);
        JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
        jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(this.f81164b));
        jSONObject2.put("p_sdk_v", "6.0.0.001");
        jSONObject2.put("push_switch", UmengMessageDeviceConfig.isNotificationEnabled(this.f81164b));
        buildSLBaseHeader.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("device_token", MessageSharedPrefs.getInstance(this.f81164b).getDeviceToken());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONObject3);
        if (h.d(this.f81164b)) {
            JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(this.f81164b, buildSLBaseHeader, jSONObject4, "umpx_push_launch");
            if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                m.a(this.f81164b).a(System.currentTimeMillis());
                int parseInt = Integer.parseInt(UMEnvelopeBuild.imprintProperty(this.f81164b, "launch_policy", "-1"));
                String str = f81163a;
                UMLog.mutlInfo(str, 2, "launch_policy:" + parseInt);
                int parseInt2 = Integer.parseInt(UMEnvelopeBuild.imprintProperty(this.f81164b, "tag_policy", "-1"));
                String str2 = f81163a;
                UMLog.mutlInfo(str2, 2, "tag_policy:" + parseInt2);
                if (parseInt > 0) {
                    MessageSharedPrefs.getInstance(this.f81164b).setAppLaunchLogSendPolicy(parseInt);
                }
                if (parseInt2 > 0) {
                    MessageSharedPrefs.getInstance(this.f81164b).setTagSendPolicy(parseInt2);
                }
            }
            return;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("jsonHeader", buildSLBaseHeader);
        jSONObject5.put("jsonBody", jSONObject4);
        Intent intent = new Intent();
        intent.setPackage(this.f81164b.getPackageName());
        intent.setAction("com.umeng.message.message.sendmessage.action");
        intent.putExtra("KEY_UMPX_PATH", "umpx_push_launch");
        intent.putExtra("KEY_SENDMESSAGE", jSONObject5.toString());
        UMJobIntentService.enqueueWork(this.f81164b, UmengMessageCallbackHandlerService.class, intent);
    }

    public static JSONObject sendRequest(JSONObject jSONObject, String str) throws Exception {
        String body = HttpRequest.post((CharSequence) str).acceptJson().contentType("application/json").send((CharSequence) jSONObject.toString()).body("UTF-8");
        String str2 = f81163a;
        UMLog.mutlInfo(str2, 2, "sendRequest() url=" + str + "\n request = " + jSONObject + "\n response = " + body);
        return new JSONObject(body);
    }

    private void a(JSONObject jSONObject, String str, long j) throws Exception {
        JSONObject jSONObject2;
        if (!str.equals("")) {
            jSONObject.put("aliasFail", str);
            try {
                jSONObject2 = sendRequest(jSONObject, MsgConstant.ALIAS_LOG);
            } catch (Exception e2) {
                if (e2.getMessage() == null || !e2.getMessage().contains("java.net.UnknownHostException") || !UmengMessageDeviceConfig.isOnline(this.f81164b)) {
                    throw new Exception(e2);
                }
                jSONObject2 = sendRequest(this.f81164b, jSONObject, MsgConstant.ALIAS_LOG);
            }
            if (jSONObject2 != null && TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("error", "3");
                String[] strArr = {j};
                ContentResolver contentResolver = this.f81164b.getContentResolver();
                a.a(this.f81164b);
                contentResolver.update(a.f81330d, contentValues, "time=?", strArr);
                int parseInt = Integer.parseInt(jSONObject2.optString("da_register_policy"));
                if (parseInt > 0) {
                    MessageSharedPrefs.getInstance(this.f81164b).setDaRegisterSendPolicy(parseInt);
                }
            }
        }
    }

    public static JSONObject sendRequest(Context context, JSONObject jSONObject, String str) throws Exception {
        String host = new URL(str).getHost();
        String a2 = b.a(context, host);
        String str2 = f81163a;
        UMLog.mutlInfo(str2, 2, "ip:" + a2);
        if (a2 == null) {
            return null;
        }
        URL url = new URL(str.replaceFirst(host, a2));
        String body = HttpRequest.post(url).acceptJson().contentType("application/json").header("Host", host).trustHosts().send((CharSequence) jSONObject.toString()).body("UTF-8");
        String str3 = f81163a;
        UMLog.mutlInfo(str3, 2, "dns-->sendRequest() url=" + url.toString() + "\n request = " + jSONObject + "\n response = " + body);
        return new JSONObject(body);
    }

    public void sendMsgLog(JSONObject jSONObject, String str, int i) throws Exception {
        UMSLEnvelopeBuild.mContext = this.f81164b;
        UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
        JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(this.f81164b);
        JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
        jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(this.f81164b));
        jSONObject2.put("p_sdk_v", "6.0.0.001");
        jSONObject2.put("push_switch", UmengMessageDeviceConfig.isNotificationEnabled(this.f81164b));
        buildSLBaseHeader.put("header", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, jSONObject.getLong(TimeDisplaySetting.TIME_DISPLAY_SETTING));
        jSONObject3.put("pa", jSONObject.getString("pa"));
        jSONObject3.put("device_token", MessageSharedPrefs.getInstance(this.f81164b).getDeviceToken());
        jSONObject3.put("msg_id", jSONObject.getString("msg_id"));
        jSONObject3.put("action_type", jSONObject.getInt("action_type"));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("push", jSONArray);
        if (h.d(this.f81164b)) {
            JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(this.f81164b, buildSLBaseHeader, jSONObject4, "umpx_push_logs");
            if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                m.a(this.f81164b).a(str, i);
                if (i != 0) {
                    m.a(this.f81164b).b(str);
                }
            }
            return;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("jsonHeader", buildSLBaseHeader);
        jSONObject5.put("jsonBody", jSONObject4);
        jSONObject5.put("msgId", str);
        jSONObject5.put("actionType", i);
        Intent intent = new Intent();
        intent.setPackage(this.f81164b.getPackageName());
        intent.setAction("com.umeng.message.message.sendmessage.action");
        intent.putExtra("KEY_UMPX_PATH", "umpx_push_logs");
        intent.putExtra("KEY_SENDMESSAGE", jSONObject5.toString());
        UMJobIntentService.enqueueWork(this.f81164b, UmengMessageCallbackHandlerService.class, intent);
    }

    public void deleteAlias(String str, String str2, JSONObject jSONObject, UTrack.ICallBack iCallBack) throws Exception {
        JSONObject jSONObject2;
        try {
            jSONObject2 = sendRequest(jSONObject, MsgConstant.DELETE_ALIAS_ENDPOINT);
        } catch (Exception e2) {
            if (e2.getMessage() == null || !e2.getMessage().contains("java.net.UnknownHostException") || !UmengMessageDeviceConfig.isOnline(this.f81164b)) {
                throw new Exception(e2);
            }
            jSONObject2 = sendRequest(this.f81164b, jSONObject, MsgConstant.DELETE_ALIAS_ENDPOINT);
        }
        if (jSONObject2 != null && TextUtils.equals(jSONObject2.getString("success"), "ok")) {
            MessageSharedPrefs.getInstance(this.f81164b).removeAlias(0, str, str2);
            MessageSharedPrefs.getInstance(this.f81164b).removeAlias(1, str, str2);
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("interval", jSONObject2.optLong("interval", 0));
                jSONObject3.put("last_requestTime", System.currentTimeMillis());
                MessageSharedPrefs.getInstance(this.f81164b).add_deleteAliasInterval(jSONObject3.toString());
            } catch (Exception unused) {
            }
            iCallBack.onMessage(true, "alias:" + str + ",type:" + str2 + "删除成功");
        }
    }

    public void addAlias(String str, String str2, JSONObject jSONObject, UTrack.ICallBack iCallBack) throws Exception {
        JSONObject jSONObject2;
        String str3 = str;
        JSONObject jSONObject3 = jSONObject;
        UTrack.ICallBack iCallBack2 = iCallBack;
        String optString = jSONObject3.optString("fail", "");
        String optString2 = jSONObject3.optString("success", "");
        String str4 = f81163a;
        UMLog.mutlInfo(str4, 2, "keyfail:" + optString + ",keysuccess:" + optString2);
        if (!optString.equals("") || !optString2.equals("")) {
            String str5 = str2;
            if (!optString.equals("")) {
                iCallBack2.onMessage(false, "alias:" + str + "添加失败");
                MessageSharedPrefs.getInstance(this.f81164b).addAlias(str, str2, 0, 1, optString);
            }
            if (!optString2.equals("")) {
                iCallBack2.onMessage(true, "alias:" + str + "已经添加");
                MessageSharedPrefs.getInstance(this.f81164b).addAlias(str, str2, 0, 2, optString2);
            }
        } else {
            try {
                jSONObject2 = sendRequest(jSONObject3, MsgConstant.ALIAS_ENDPOINT);
            } catch (Exception e2) {
                if (e2.getMessage() == null || !e2.getMessage().contains("java.net.UnknownHostException") || !UmengMessageDeviceConfig.isOnline(this.f81164b)) {
                    throw new Exception(e2);
                }
                jSONObject2 = sendRequest(this.f81164b, jSONObject3, MsgConstant.ALIAS_ENDPOINT);
            }
            if (jSONObject2 == null || !TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
                MessageSharedPrefs instance = MessageSharedPrefs.getInstance(this.f81164b);
                StringBuilder sb = new StringBuilder("网络请求失败alias:");
                sb.append(str);
                sb.append(",type:");
                String str6 = str2;
                sb.append(str2);
                sb.append(",devicetoken:");
                sb.append(MessageSharedPrefs.getInstance(this.f81164b).getDeviceToken());
                instance.addAlias(str, str2, 0, 1, sb.toString());
                iCallBack2.onMessage(false, "alias:" + str + "添加失败");
                return;
            }
            MessageSharedPrefs.getInstance(this.f81164b).addAlias(str, str2, 0, 0, "");
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("interval", jSONObject2.optLong("interval", 0));
                jSONObject4.put("last_requestTime", System.currentTimeMillis());
                MessageSharedPrefs.getInstance(this.f81164b).add_addAliasInterval(jSONObject4.toString());
            } catch (Exception unused) {
            }
            iCallBack2.onMessage(true, "alias:" + str + "添加成功");
        }
    }

    public void setAlias(String str, String str2, JSONObject jSONObject, UTrack.ICallBack iCallBack) throws Exception {
        JSONObject jSONObject2;
        String str3 = str;
        JSONObject jSONObject3 = jSONObject;
        UTrack.ICallBack iCallBack2 = iCallBack;
        String optString = jSONObject3.optString("fail", "");
        String optString2 = jSONObject3.optString("success", "");
        String str4 = f81163a;
        UMLog.mutlInfo(str4, 2, "keyfail:" + optString + ",keysuccess:" + optString2);
        if (!optString.equals("") || !optString2.equals("")) {
            String str5 = str2;
            if (!optString.equals("")) {
                iCallBack2.onMessage(false, "alias:" + str + "添加失败");
                MessageSharedPrefs.getInstance(this.f81164b).addAlias(str, str2, 1, 1, optString);
            }
            if (!optString2.equals("")) {
                iCallBack2.onMessage(true, "alias:" + str + "已经添加");
                MessageSharedPrefs.getInstance(this.f81164b).addAlias(str, str2, 1, 2, optString2);
            }
        } else {
            try {
                jSONObject2 = sendRequest(jSONObject3, MsgConstant.ALIAS_EXCLUSIVE_ENDPOINT);
            } catch (Exception e2) {
                if (e2.getMessage() == null || !e2.getMessage().contains("java.net.UnknownHostException") || !UmengMessageDeviceConfig.isOnline(this.f81164b)) {
                    throw new Exception(e2);
                }
                jSONObject2 = sendRequest(this.f81164b, jSONObject3, MsgConstant.ALIAS_EXCLUSIVE_ENDPOINT);
            }
            if (jSONObject2 == null || !TextUtils.equals(jSONObject2.optString("success", ""), "ok")) {
                MessageSharedPrefs instance = MessageSharedPrefs.getInstance(this.f81164b);
                StringBuilder sb = new StringBuilder("网络请求失败alias:");
                sb.append(str);
                sb.append(",type:");
                String str6 = str2;
                sb.append(str2);
                sb.append(",devicetoken:");
                sb.append(MessageSharedPrefs.getInstance(this.f81164b).getDeviceToken());
                instance.addAlias(str, str2, 1, 1, sb.toString());
                iCallBack2.onMessage(false, "alias:" + str + "添加失败");
                return;
            }
            MessageSharedPrefs.getInstance(this.f81164b).addAlias(str, str2, 1, 0, "");
            try {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("interval", jSONObject2.optLong("interval", 0));
                jSONObject4.put("last_requestTime", System.currentTimeMillis());
                MessageSharedPrefs.getInstance(this.f81164b).add_setAliasInterval(jSONObject4.toString());
            } catch (Exception unused) {
            }
            iCallBack2.onMessage(true, "alias:" + str + "添加成功");
        }
    }
}
