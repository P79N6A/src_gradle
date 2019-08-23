package com.vivo.push.model;

import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.vivo.push.util.l;
import com.vivo.push.util.o;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UnvarnishedMessage {
    private String mMessage;
    private long mMsgId;
    private Map<String, String> mParams = new HashMap();
    private int mTargetType;
    private String mTragetContent;

    public String getMessage() {
        return this.mMessage;
    }

    public long getMsgId() {
        return this.mMsgId;
    }

    public Map<String, String> getParams() {
        return this.mParams;
    }

    public int getTargetType() {
        return this.mTargetType;
    }

    public String getTragetContent() {
        return this.mTragetContent;
    }

    public UnvarnishedMessage() {
    }

    public String unpackToJson() {
        Object obj;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.mTargetType);
        jSONArray.put(this.mTragetContent);
        jSONArray.put(this.mMessage);
        if (this.mParams == null) {
            obj = new HashMap();
        } else {
            obj = this.mParams;
        }
        jSONArray.put(obj);
        return jSONArray.toString();
    }

    public void setMessage(String str) {
        this.mMessage = str;
    }

    public void setMsgId(long j) {
        this.mMsgId = j;
    }

    public void setParams(Map<String, String> map) {
        this.mParams = map;
    }

    public void setTargetType(int i) {
        this.mTargetType = i;
    }

    public void setTragetContent(String str) {
        this.mTragetContent = str;
    }

    public UnvarnishedMessage(String str) {
        packToObj(str);
    }

    private void packToObj(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                o.a("UnvarnishedMessage", "unvarnishedMsg pack to obj is null");
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            this.mTargetType = jSONArray.optInt(0);
            this.mTragetContent = jSONArray.getString(1);
            this.mMessage = jSONArray.getString(2);
            this.mParams = l.a(new JSONObject(jSONArray.getString(3)));
        } catch (JSONException e2) {
            a.b(e2);
            o.a("UnvarnishedMessage", "unvarnishedMsg pack to obj error", e2);
        }
    }
}
