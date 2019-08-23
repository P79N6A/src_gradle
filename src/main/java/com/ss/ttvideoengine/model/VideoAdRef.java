package com.ss.ttvideoengine.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoAdRef {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<String> action_track_url_list;
    public int duration;
    public String external_url;
    public long id;
    public String log_extra;
    public VideoInfo mVideo1;
    public VideoInfo mVideo2;
    public VideoInfo mVideo3;
    public int patch_position;
    public List<String> play_track_url_list;
    public List<String> playover_track_url_list;
    public int skip_time;

    public void extractFields(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91539, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, changeQuickRedirect, false, 91539, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video_list");
        try {
            if (optJSONObject.has("video_1")) {
                this.mVideo1 = new VideoInfo();
                this.mVideo1.extractFields(optJSONObject.getJSONObject("video_1"));
            }
            if (optJSONObject.has("video_2")) {
                this.mVideo2 = new VideoInfo();
                this.mVideo2.extractFields(optJSONObject.getJSONObject("video_2"));
            }
            if (optJSONObject.has("video_3")) {
                this.mVideo3 = new VideoInfo();
                this.mVideo3.extractFields(optJSONObject.getJSONObject("video_3"));
            }
        } catch (JSONException unused) {
        }
        this.id = jSONObject.optLong("id");
        this.log_extra = jSONObject.optString("log_extra");
        this.skip_time = jSONObject.optInt("skip_time");
        this.patch_position = jSONObject.optInt("patch_position");
        this.duration = jSONObject.optInt("duration");
        this.external_url = jSONObject.optString("external_url");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("play_track_url_list");
            if (jSONArray != null) {
                this.play_track_url_list = parseTrackUrl(jSONArray, new String[1]);
            }
        } catch (JSONException unused2) {
        }
        try {
            JSONArray jSONArray2 = jSONObject.getJSONArray("playover_track_url_list");
            if (jSONArray2 != null) {
                this.playover_track_url_list = parseTrackUrl(jSONArray2, new String[1]);
            }
        } catch (JSONException unused3) {
        }
        try {
            JSONArray jSONArray3 = jSONObject.getJSONArray("action_track_url_list");
            if (jSONArray3 != null) {
                this.action_track_url_list = parseTrackUrl(jSONArray3, new String[1]);
            }
        } catch (JSONException unused4) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> parseTrackUrl(java.lang.Object r19, java.lang.String[] r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 91540(0x16594, float:1.28275E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 91540(0x16594, float:1.28275E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0048:
            r2 = 0
            if (r1 == 0) goto L_0x0050
            int r3 = r1.length
            if (r3 <= 0) goto L_0x0050
            r1[r10] = r2
        L_0x0050:
            if (r0 != 0) goto L_0x0053
            return r2
        L_0x0053:
            boolean r3 = r0 instanceof java.lang.String     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x0069
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a1 }
            r3.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00a1 }
            r3.add(r0)     // Catch:{ Exception -> 0x00a1 }
            if (r1 == 0) goto L_0x0068
            int r4 = r1.length     // Catch:{ Exception -> 0x00a1 }
            if (r4 <= 0) goto L_0x0068
            r1[r10] = r0     // Catch:{ Exception -> 0x00a1 }
        L_0x0068:
            return r3
        L_0x0069:
            boolean r3 = r0 instanceof org.json.JSONArray     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x00a1
            org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ Exception -> 0x00a1 }
            int r3 = r0.length()     // Catch:{ Exception -> 0x00a1 }
            if (r3 != 0) goto L_0x0076
            return r2
        L_0x0076:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a1 }
            r4.<init>()     // Catch:{ Exception -> 0x00a1 }
            r5 = 0
        L_0x007c:
            if (r5 >= r3) goto L_0x008e
            java.lang.String r6 = r0.getString(r5)     // Catch:{ Exception -> 0x00a1 }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00a1 }
            if (r7 != 0) goto L_0x008b
            r4.add(r6)     // Catch:{ Exception -> 0x00a1 }
        L_0x008b:
            int r5 = r5 + 1
            goto L_0x007c
        L_0x008e:
            boolean r3 = r4.isEmpty()     // Catch:{ Exception -> 0x00a1 }
            if (r3 == 0) goto L_0x0095
            return r2
        L_0x0095:
            if (r1 == 0) goto L_0x00a0
            int r3 = r1.length     // Catch:{ Exception -> 0x00a1 }
            if (r3 <= 0) goto L_0x00a0
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00a1 }
            r1[r10] = r0     // Catch:{ Exception -> 0x00a1 }
        L_0x00a0:
            return r4
        L_0x00a1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttvideoengine.model.VideoAdRef.parseTrackUrl(java.lang.Object, java.lang.String[]):java.util.List");
    }
}
