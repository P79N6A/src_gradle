package com.ss.avframework.livestreamv2.interact.controller;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.ss.avframework.livestreamv2.interact.LogUtil;
import com.ss.avframework.livestreamv2.interact.model.Region;
import com.ss.avframework.livestreamv2.interact.model.SEI;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SEIHelper {
    private Callback mCallback;
    private long mSeiTimestamp;

    public interface Callback {
        boolean isVersionSupported(int i);

        void onSeiUpdated(SEI sei);

        void onTalkStateUpdated(String[] strArr, boolean[] zArr);
    }

    public SEIHelper(Callback callback) {
        this.mCallback = callback;
    }

    private SEI getSeiFromCommon(JSONObject jSONObject) throws JSONException {
        SEI createSeiFromCommon = createSeiFromCommon(new JSONObject(jSONObject.getString("app_data").replaceAll("\\\\", "")));
        if (createSeiFromCommon == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("canvas");
        createSeiFromCommon.setWidth(jSONObject2.optInt("w"));
        createSeiFromCommon.setHeight(jSONObject2.optInt("h"));
        createSeiFromCommon.setBackground(jSONObject2.optString("bgnd"));
        return createSeiFromCommon;
    }

    private SEI getSeiFromZego(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("info");
        if (!jSONObject2.has("app_data")) {
            return null;
        }
        JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("app_data").replaceAll("\\\\", ""));
        SEI createSeiFromCommon = createSeiFromCommon(jSONObject3);
        if (createSeiFromCommon == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject3.optJSONObject("canvas");
        createSeiFromCommon.setWidth(optJSONObject.optInt("width"));
        createSeiFromCommon.setHeight(optJSONObject.optInt("height"));
        createSeiFromCommon.setBackground(optJSONObject.optString("background"));
        return createSeiFromCommon;
    }

    public void updateSei(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                SEI sei = null;
                if (jSONObject.has("source") && TextUtils.equals(jSONObject.optString("source"), "zego")) {
                    sei = getSeiFromZego(jSONObject);
                } else if (jSONObject.has("canvas")) {
                    sei = getSeiFromCommon(jSONObject);
                }
                if (sei != null) {
                    this.mCallback.onSeiUpdated(sei);
                }
            } catch (JSONException e2) {
                LogUtil.e(e2.toString());
            }
        }
    }

    private SEI createSeiFromCommon(JSONObject jSONObject) throws JSONException {
        long optLong = jSONObject.optLong("timestamp");
        if (optLong == this.mSeiTimestamp || !jSONObject.has("ver")) {
            return null;
        }
        int optInt = jSONObject.optInt("ver");
        if (!this.mCallback.isVersionSupported(optInt)) {
            return null;
        }
        this.mSeiTimestamp = optLong;
        SEI sei = new SEI();
        sei.setTimestamp(optLong);
        sei.setVersion(optInt);
        sei.setVendor(jSONObject.optString("vendor"));
        JSONArray jSONArray = new JSONArray(jSONObject.optString("grids"));
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.opt(i);
            Region size = new Region().mediaType(jSONObject2.optInt("type")).position(jSONObject2.optDouble("x"), jSONObject2.optDouble("y")).size(jSONObject2.optDouble("w"), jSONObject2.optDouble("h"));
            try {
                size.userId(jSONObject2.optLong("account"));
            } catch (Exception unused) {
                size.userId(0);
            }
            if (jSONObject2.has("uid")) {
                size.interactId(jSONObject2.optInt("uid"));
            }
            if (jSONObject2.has("talk")) {
                boolean z = true;
                if (jSONObject2.optInt("talk") != 1) {
                    z = false;
                }
                size.talking(z);
            }
            try {
                size.status(jSONObject2.optInt("stat"));
            } catch (Exception unused2) {
                size.status(0);
            }
            sei.addGrid(size);
        }
        return sei;
    }

    public static FrameLayout.LayoutParams getSeiLayoutParams(int i, int i2, int i3, int i4, Region region) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        float f2 = (float) i;
        float f3 = (float) i3;
        float f4 = f2 / f3;
        float f5 = (float) i2;
        float f6 = (float) i4;
        float f7 = f5 / f6;
        if (f4 <= f7) {
            f4 = f7;
        }
        float f8 = f3 * f4;
        float f9 = f6 * f4;
        double d2 = (double) f8;
        double x = region.getX();
        Double.isNaN(d2);
        double d3 = (double) ((f8 - f2) / 2.0f);
        Double.isNaN(d3);
        int i5 = (int) (((x * d2) + 0.5d) - d3);
        double d4 = (double) f9;
        double y = region.getY();
        Double.isNaN(d4);
        double d5 = (double) ((f9 - f5) / 2.0f);
        Double.isNaN(d5);
        int i6 = (int) (((y * d4) + 0.5d) - d5);
        double width = region.getWidth();
        Double.isNaN(d2);
        double height = region.getHeight();
        Double.isNaN(d4);
        layoutParams.width = (int) ((d2 * width) + 0.5d);
        layoutParams.height = (int) ((d4 * height) + 0.5d);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        return layoutParams;
    }
}
