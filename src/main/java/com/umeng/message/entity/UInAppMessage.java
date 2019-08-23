package com.umeng.message.entity;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class UInAppMessage {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f81166a;
    public String action_activity;
    public String action_type;
    public String action_url;
    public String bottom_action_activity;
    public String bottom_action_type;
    public String bottom_action_url;
    public int bottom_height;
    public String bottom_image_url;
    public int bottom_width;
    public String button_text;
    public String check_num;
    public String content;
    public String customButtonActionType;
    public String customButtonActivity;
    public String customButtonUrl;
    public boolean display_button;
    public String display_name;
    public int display_time;
    public String expire_time;
    public int height;
    public String image_url;
    public String msg_id;
    public int msg_type;
    public int pduration;
    public String plainTextActionType;
    public String plainTextActivity;
    public String plainTextUrl;
    public int sduration;
    public int show_times;
    public int show_type;
    public String start_time;
    public String title;
    public int width;

    public JSONObject getRaw() {
        return this.f81166a;
    }

    public UInAppMessage(JSONObject jSONObject) throws JSONException {
        this.f81166a = jSONObject;
        this.msg_id = jSONObject.getString("msg_id");
        this.msg_type = jSONObject.getInt("msg_type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("msg_info");
        this.display_button = jSONObject2.optBoolean("display_button");
        this.display_name = jSONObject2.optString("display_name", "");
        this.display_time = jSONObject2.optInt("display_time", 5);
        if (this.msg_type == 5 || this.msg_type == 6) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("plain_text");
            this.title = jSONObject3.getString(PushConstants.TITLE);
            this.content = jSONObject3.getString(PushConstants.CONTENT);
            this.button_text = jSONObject3.getString("button_text");
            this.plainTextActionType = jSONObject3.getString("action_type");
            this.plainTextActivity = jSONObject3.optString(PushConstants.INTENT_ACTIVITY_NAME, "");
            this.plainTextUrl = jSONObject3.optString(PushConstants.WEB_URL, "");
        }
        if (jSONObject2.has("image")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("image");
            this.image_url = jSONObject4.getString("imageurl");
            this.width = jSONObject4.getInt("width");
            this.height = jSONObject4.getInt("height");
            this.action_type = jSONObject4.getString("action_type");
            this.action_activity = jSONObject4.optString(PushConstants.INTENT_ACTIVITY_NAME, "");
            this.action_url = jSONObject4.optString(PushConstants.WEB_URL, "");
        }
        if (jSONObject2.has("bottom_image")) {
            JSONObject jSONObject5 = jSONObject2.getJSONObject("bottom_image");
            this.bottom_image_url = jSONObject5.getString("imageurl");
            this.bottom_width = jSONObject5.getInt("width");
            this.bottom_height = jSONObject5.getInt("height");
            this.bottom_action_type = jSONObject5.getString("action_type");
            this.bottom_action_activity = jSONObject5.optString(PushConstants.INTENT_ACTIVITY_NAME, "");
            this.bottom_action_url = jSONObject5.optString(PushConstants.WEB_URL, "");
        }
        if (jSONObject2.has("custom_button")) {
            JSONObject jSONObject6 = jSONObject2.getJSONObject("custom_button");
            this.customButtonActionType = jSONObject6.getString("action_type");
            this.customButtonActivity = jSONObject6.optString(PushConstants.INTENT_ACTIVITY_NAME, "");
            this.customButtonUrl = jSONObject6.optString(PushConstants.WEB_URL, "");
        }
        JSONObject jSONObject7 = jSONObject.getJSONObject("policy");
        this.show_type = jSONObject7.getInt("show_type");
        this.show_times = jSONObject7.getInt("show_times");
        this.start_time = jSONObject7.getString("start_time");
        this.expire_time = jSONObject7.getString("expire_time");
    }
}
