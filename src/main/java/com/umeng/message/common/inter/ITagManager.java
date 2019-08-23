package com.umeng.message.common.inter;

import com.umeng.commonsdk.debug.UMLog;
import java.util.Hashtable;
import java.util.List;
import org.json.JSONObject;

public interface ITagManager {

    public static class Result {

        /* renamed from: a  reason: collision with root package name */
        private int f81165a;
        public String errors = "";
        public long interval;
        public String jsonString = "";
        public long last_requestTime;
        public String msg = "";
        public int remain;
        public String status = "fail";

        public String toString() {
            return this.jsonString;
        }

        public Result() {
        }

        public void setErrors(String str) {
            this.errors = str;
        }

        public void setInterval(long j) {
            this.interval = j;
        }

        public void setLast_requestTime(long j) {
            this.last_requestTime = j;
        }

        public void setRemain(int i) {
            this.remain = i;
        }

        public void setStatus(String str) {
            this.status = str;
        }

        public Result(JSONObject jSONObject, boolean z) {
            if (!z) {
                try {
                    this.status = jSONObject.optString("success", "fail");
                    this.remain = jSONObject.optInt("remain", 0);
                    this.interval = jSONObject.optLong("interval", 0);
                    this.errors = jSONObject.optString("errors");
                    if (!jSONObject.has("last_requestTime")) {
                        jSONObject.put("last_requestTime", System.currentTimeMillis());
                    } else {
                        this.last_requestTime = jSONObject.optLong("last_requestTime", 0);
                    }
                } catch (Exception unused) {
                    UMLog.mutlInfo("com.umeng.message.common.inter.ITagManager.Result", 0, "Json error");
                    return;
                }
            } else {
                this.f81165a = jSONObject.optInt("code");
                this.msg = jSONObject.optString("msg", "");
                this.status = jSONObject.optString("status", "false");
                this.interval = jSONObject.optLong("interval", 0);
                this.last_requestTime = jSONObject.optLong("timestamp", System.currentTimeMillis());
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    this.remain = optJSONObject.optInt("remain", 0);
                }
            }
            this.jsonString = jSONObject.toString();
        }
    }

    Result addTags(JSONObject jSONObject, String... strArr) throws Exception;

    Result addWeightedTags(JSONObject jSONObject, Hashtable<String, Integer> hashtable) throws Exception;

    Result deleteTags(JSONObject jSONObject, String... strArr) throws Exception;

    Result deleteWeightedTags(JSONObject jSONObject, String... strArr) throws Exception;

    List<String> getTags(JSONObject jSONObject) throws Exception;

    Hashtable<String, Integer> getWeightedTags(JSONObject jSONObject) throws Exception;

    Result reset(JSONObject jSONObject) throws Exception;

    Result update(JSONObject jSONObject, String... strArr) throws Exception;
}
