package com.ss.android.excitingvideo.model;

import android.text.TextUtils;
import com.ss.android.excitingvideo.utils.JsonUtils;
import com.ss.android.excitingvideo.utils.SSLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class VideoAd extends BaseAd {
    private int duration;
    private final List<String> effectPlayTrackUrl = new ArrayList();
    private int effectivePlayTime = -1;
    private int height;
    private int inspireTime;
    private final List<String> playOverTrackUrl = new ArrayList();
    private final List<String> playTrackUrl = new ArrayList();
    private String quitText;
    private String videoGroupId;
    private String videoId;
    private String videoType;
    private int width;

    public int getDuration() {
        return this.duration;
    }

    public List<String> getEffectPlayTrackUrl() {
        return this.effectPlayTrackUrl;
    }

    public int getEffectivePlayTime() {
        return this.effectivePlayTime;
    }

    public int getHeight() {
        return this.height;
    }

    public int getInspireTime() {
        return this.inspireTime;
    }

    public List<String> getPlayOverTrackUrl() {
        return this.playOverTrackUrl;
    }

    public List<String> getPlayTrackUrl() {
        return this.playTrackUrl;
    }

    public String getQuitText() {
        return this.quitText;
    }

    public String getVideoGroupId() {
        return this.videoGroupId;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public String getVideoType() {
        return this.videoType;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isHorizonVideo() {
        return "origin".equals(this.videoType);
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(this.videoId)) {
            return false;
        }
        return super.isValid();
    }

    public VideoAd(JSONObject jSONObject) {
        super(jSONObject);
        if (jSONObject == null) {
            SSLog.error("VideoAd,jsonObject is null");
            return;
        }
        this.quitText = jSONObject.optString("quit_text");
        JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
        if (optJSONObject == null) {
            SSLog.error("VideoAd, video_info is empty");
            return;
        }
        this.videoId = optJSONObject.optString("video_id");
        this.videoGroupId = optJSONObject.optString("video_group_id");
        this.inspireTime = optJSONObject.optInt("effective_inspire_time");
        this.effectivePlayTime = optJSONObject.optInt("effective_play_time");
        this.videoType = optJSONObject.optString("type");
        this.duration = optJSONObject.optInt("duration");
        this.width = optJSONObject.optInt("width");
        this.height = optJSONObject.optInt("height");
        this.playTrackUrl.addAll(JsonUtils.jsonArrayToList(optJSONObject.optJSONArray("play_track_url_list")));
        this.playOverTrackUrl.addAll(JsonUtils.jsonArrayToList(optJSONObject.optJSONArray("playover_track_url_list")));
        this.effectPlayTrackUrl.addAll(JsonUtils.jsonArrayToList(optJSONObject.optJSONArray("effective_play_track_url_list")));
    }
}
