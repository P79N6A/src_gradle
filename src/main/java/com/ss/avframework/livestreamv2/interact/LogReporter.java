package com.ss.avframework.livestreamv2.interact;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.avframework.livestreamv2.interact.callback.EngineCallback;
import com.ss.avframework.livestreamv2.interact.model.Config;
import com.ss.ugc.live.sdk.message.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

public class LogReporter {
    private Config mConfig;
    private EngineCallback mLogReportCallback;
    private long mStartJoiningTs;
    private long mStartReconnectTs;
    private String mThirdPartySdkVersion = "";

    public void onConnectionLost() {
        JSONObject createCommonLog = createCommonLog("rtc_connect_lost");
        if (createCommonLog != null) {
            reportLog(createCommonLog);
        }
    }

    public void onLeavingChannel() {
        JSONObject createCommonLog = createCommonLog("rtc_leave_channel");
        if (createCommonLog != null) {
            reportLog(createCommonLog);
        }
    }

    public void onReconnecting() {
        this.mStartReconnectTs = System.currentTimeMillis();
        JSONObject createCommonLog = createCommonLog("rtc_reconnect");
        if (createCommonLog != null) {
            reportLog(createCommonLog);
        }
    }

    public void onLeaveChannelReturn() {
        long j;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
            this.mStartJoiningTs = 0;
        } else {
            j = 0;
        }
        JSONObject createCommonLog = createCommonLog("rtc_leave_channel_callback");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("elapsed", j);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onReconnected() {
        long j = 0;
        if (this.mStartReconnectTs != 0) {
            j = System.currentTimeMillis() - this.mStartReconnectTs;
        }
        JSONObject createCommonLog = createCommonLog("rtc_reconnected");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("delay", j);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void setThirdPartyRtcVersion(String str) {
        this.mThirdPartySdkVersion = str;
    }

    private void reportLog(JSONObject jSONObject) {
        if (this.mLogReportCallback != null) {
            this.mLogReportCallback.onLogReport("live_client_monitor_log", jSONObject);
        }
    }

    private String getAudioProfile(Config.AudioProfile audioProfile) {
        switch (audioProfile) {
            case LC:
                return "LC";
            case HE:
                return "HE";
            default:
                return "";
        }
    }

    private String getCharacterName(Config.Character character) {
        switch (character) {
            case ANCHOR:
                return "host";
            case GUEST:
                return "guest";
            default:
                return "";
        }
    }

    private String getInteractType(Config.InteractMode interactMode) {
        switch (interactMode) {
            case PK:
                return PushConstants.URI_PACKAGE_NAME;
            case NORMAL:
                return "normal";
            default:
                return "";
        }
    }

    private String getVideoCodec(Config.VideoCodec videoCodec) {
        switch (videoCodec) {
            case H264:
                return "h264";
            case H265:
                return "h265";
            default:
                return "";
        }
    }

    public void onErrorOccurs(int i) {
        JSONObject createCommonLog = createCommonLog("rtc_occur_error");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onNetworkChanged(String str) {
        JSONObject createCommonLog = createCommonLog("rtc_network_changed");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("net_type", str);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    private String getVendorName(Config.Vendor vendor) {
        switch (vendor) {
            case AGORA:
                return "agora";
            case ZEGO:
                return "zego";
            case BYTE:
                return "byte";
            default:
                return "";
        }
    }

    private String getVideoQuality(Config.VideoQuality videoQuality) {
        return videoQuality.getWidth() + "x" + videoQuality.getHeight() + "x" + videoQuality.getFps() + "x" + videoQuality.getBitrate();
    }

    public void onJoinChannelSuccess(boolean z) {
        long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        JSONObject createCommonLog = createCommonLog("rtc_join_channel_success");
        if (createCommonLog != null) {
            try {
                JSONObject put = createCommonLog.put("elapsed", j);
                JSONObject put2 = put.put("link_id", this.mConfig.getInteractId());
                put2.put("account", this.mConfig.getUserId()).put("first_joined", z);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onJoiningChannel(int i) {
        this.mStartJoiningTs = System.currentTimeMillis();
        JSONObject createCommonLog = createCommonLog("rtc_join_channel");
        if (createCommonLog != null) {
            try {
                JSONObject put = createCommonLog.put("api_call_result", i).put("rtc_video_profile", getVideoQuality(this.mConfig.getVideoQuality()));
                JSONObject put2 = put.put("link_id", this.mConfig.getInteractId());
                put2.put("account", this.mConfig.getUserId());
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    private JSONObject createCommonLog(String str) {
        try {
            return new JSONObject().put("version", BuildConfig.VERSION_NAME).put("event_key", str).put("mode", "rtc").put("timestamp", System.currentTimeMillis()).put("project_key", this.mConfig.getProjectKey()).put("report_version", 5).put("product_line", "live").put("rtc_channel_id", this.mConfig.getChannelName()).put("rtc_type", getInteractType(this.mConfig.getInteractMode())).put("rtc_vendor", getVendorName(this.mConfig.getVendor())).put("rtc_role", getCharacterName(this.mConfig.getCharacter())).put("rtc_version", this.mThirdPartySdkVersion).put("rtc_sdk_version", "4.9.0.11");
        } catch (JSONException unused) {
            return null;
        }
    }

    public void onPublishStream(int i) {
        String str;
        JSONObject createCommonLog = createCommonLog("rtc_publish_stream");
        if (createCommonLog != null) {
            try {
                if (this.mConfig.isClientMixStream()) {
                    str = "client";
                } else {
                    str = "server";
                }
                createCommonLog.put("mix_type", str).put("error_code", i);
                if (!this.mConfig.isClientMixStream() && this.mConfig.getMixStreamConfig() != null) {
                    Config.MixStreamConfig mixStreamConfig = this.mConfig.getMixStreamConfig();
                    createCommonLog.put(PushConstants.WEB_URL, mixStreamConfig.getStreamUrl()).put("audio_profile", getAudioProfile(mixStreamConfig.getAudioProfile())).put("meta_video_bitrate", mixStreamConfig.getVideoBitrate()).put("meta_video_framerate", mixStreamConfig.getVideoFrameRate()).put("width", mixStreamConfig.getVideoWidth()).put("height", mixStreamConfig.getVideoHeight()).put("video_codec", getVideoCodec(mixStreamConfig.getVideoCodec()));
                }
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public LogReporter(EngineCallback engineCallback, Config config) {
        this.mLogReportCallback = engineCallback;
        this.mConfig = config;
    }

    public void onConnectFailed(int i, String str) {
        JSONObject createCommonLog = createCommonLog("rtc_connect_fail");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i).put("message", str);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onRemoteVideoFrozen(String str, int i) {
        JSONObject createCommonLog = createCommonLog("rtc_remote_video_frozen");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("link_id", str).put("elapsed", i);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onFirstRemoteFrame(boolean z, String str) {
        String str2;
        long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        if (z) {
            str2 = "rtc_first_remote_audio";
        } else {
            str2 = "rtc_first_remote_video";
        }
        JSONObject createCommonLog = createCommonLog(str2);
        if (createCommonLog != null) {
            try {
                createCommonLog.put("link_id", str).put("elapsed", j);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onRemoteUserOnlineOffline(boolean z, String str) {
        String str2;
        long j = 0;
        if (this.mStartJoiningTs != 0) {
            j = System.currentTimeMillis() - this.mStartJoiningTs;
        }
        if (z) {
            str2 = "rtc_remote_user_joined";
        } else {
            str2 = "rtc_remote_user_offline";
        }
        JSONObject createCommonLog = createCommonLog(str2);
        if (createCommonLog != null) {
            try {
                createCommonLog.put("link_id", str).put("elapsed", j);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onStreamStateChange(int i, String str, int i2) {
        JSONObject createCommonLog = createCommonLog("rtc_stream_state_changed");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("error_code", i).put("message", str).put("state", i2);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onInteractStatus(int i, int i2, int i3, int i4, int i5, int i6, String str) {
        JSONObject createCommonLog = createCommonLog("rtc_push_stream");
        if (createCommonLog != null) {
            try {
                createCommonLog.put("send_audio_bitrate", i).put("receive_audio_bitrate", i2).put("send_video_bitrate", i3).put("receive_video_bitrate", i4).put("user_count", i6).put("real_video_framerate", i5).put("link_id", str);
                reportLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }
}
