package com.ss.ttvideoengine.log;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class VideoEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int accuErrCount = 0;
    public int asyncCodecId = Integer.MIN_VALUE;
    public int asyncInit = Integer.MIN_VALUE;
    public long at;
    public long audioBufferLength = 0;
    public int audioCodecNameId = -1;
    public long audioDeviceOpenedTime = 0;
    public long audioDeviceStartTime = 0;
    public int bc;
    public long bft;
    public int br;
    public long bufferAccuT = 0;
    public int bufferSeconds = 0;
    public int cacheFile = 0;
    public String chipBoardName = "";
    public String chipHardwareName = "";
    public long clockDiff = 0;
    public String codec_type = "";
    public float containerFps = 0.0f;
    public long curPlayBackTime = -1;
    public int curVideoDecoderFps = 0;
    public float curVideoOutputFps = 0.0f;
    public int dbc;
    public long decodeFirstAudioFrameT = 0;
    public long decodeFirstVideoFrameT = 0;
    public long decodeSecondVideoFrameT = 0;
    public long decoderBufferAccuT = 0;
    public int decoderType = 0;
    public String df = "";
    public long dnsT = 0;
    public long download_speed = -1;
    public int dropCount = -1;
    public int enableMDL = -1;
    public int errCount = 0;
    public int errc = 0;
    public int errt = 0;
    public long et;
    public Map ex = new HashMap();
    public String externLogFromApp = "";
    public int finish = 0;
    public long firstBufferEndT = 0;
    public long firstBufferStartT = 0;
    public long height = 0;
    public int hijack = 0;
    public int hw = 0;
    public int hwCodecException = 0;
    public String hwCodecName = "";
    public String internalIP = "";
    public int isStartPlayAutomatically = 0;
    public String lf = "";
    public int loadState = -1;
    public long loopCount = 0;
    public long lt;
    public Map mFeedInfo = null;
    public int mFramesSetDropNum = -1;
    public String mInitialIP = "";
    public String mInitialURL = "";
    public Map mPlayItem = null;
    public Map mPreloadInfo = null;
    public int mediaCodecRender = -1;
    public Map merror = new HashMap();
    public String ownPlayerCreateException = "";
    public long pauseAccuT = 0;
    public String pc = "";
    public int playBackState = -1;
    public Map playbackparams = null;
    public int pluginException = 0;
    public int preload = 0;
    public long prepareStartT = 0;
    public long prepare_end_time;
    public long prepare_start_time;
    public String proxy_url = "";
    public long pt;
    public String pv = "";
    public long receiveFirstAudioFrameT = 0;
    public long receiveFirstVideoFrameT = 0;
    public String sdk_version = "";
    public long st;
    public int superRes = 0;
    public long surfaceSetTime = 0;
    public String sv = "";
    public String tag = "";
    public long tranConnectT = 0;
    public long tranFirstPacketT = 0;
    public int type;
    public String v = "";
    public int vd = 0;
    public long vds = 0;
    public long videoBufferLength = 0;
    public int videoCodecNameId = -1;
    public long videoDeviceOpenedTime = 0;
    public long videoDeviceStartTime = 0;
    public int video_preload_size = 0;
    public long vps = 0;
    public long vs = 0;
    public int vsc = 0;
    public long vt;
    public ArrayList vu = new ArrayList();
    public int watchduration = -1;
    public long width = 0;
    public String wifiIdentify = "";

    public JSONObject toJsonObject() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91495, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91495, new Class[0], JSONObject.class);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("log_type", "video_playq");
        hashMap.put("vsc", Integer.valueOf(this.vsc));
        hashMap.put("sdk_version", this.sdk_version);
        if (!TextUtils.isEmpty(this.wifiIdentify)) {
            hashMap.put("wifi_identify", this.wifiIdentify);
        }
        hashMap.put("plugin_exception", Integer.valueOf(this.pluginException));
        hashMap.put("bfds", Integer.valueOf(this.bufferSeconds));
        hashMap.put("sv", this.sv);
        hashMap.put("pv", this.pv);
        hashMap.put("pc", this.pc);
        hashMap.put(NotifyType.VIBRATE, this.v);
        hashMap.put("play_type", Integer.valueOf(this.type));
        hashMap.put("pt", Long.valueOf(this.pt));
        hashMap.put("at", Long.valueOf(this.at));
        hashMap.put("prepare_start_time", Long.valueOf(this.prepare_start_time));
        hashMap.put("prepare_end_time", Long.valueOf(this.prepare_end_time));
        hashMap.put("vt", Long.valueOf(this.vt));
        hashMap.put("et", Long.valueOf(this.et));
        hashMap.put("lt", Long.valueOf(this.lt));
        hashMap.put(TimeDisplaySetting.START_SHOW_TIME, Long.valueOf(this.st));
        hashMap.put("bft", Long.valueOf(this.bft));
        hashMap.put("bc", Integer.valueOf(this.bc));
        hashMap.put("dbc", Integer.valueOf(this.dbc));
        hashMap.put("br", Integer.valueOf(this.br));
        hashMap.put("vu", this.vu);
        hashMap.put("vd", Integer.valueOf(this.vd));
        hashMap.put("vs", Long.valueOf(this.vs));
        hashMap.put("vps", Long.valueOf(this.vps));
        hashMap.put("vds", Long.valueOf(this.vds));
        hashMap.put("width", Long.valueOf(this.width));
        hashMap.put("height", Long.valueOf(this.height));
        hashMap.put("super_res", Integer.valueOf(this.superRes));
        hashMap.put("async_init", Integer.valueOf(this.asyncInit));
        hashMap.put("async_codec_id", Integer.valueOf(this.asyncCodecId));
        hashMap.put("download_speed", Long.valueOf(this.download_speed));
        hashMap.put("video_preload_size", Integer.valueOf(this.video_preload_size));
        hashMap.put("errt", Integer.valueOf(this.errt));
        hashMap.put("errc", Integer.valueOf(this.errc));
        hashMap.put("df", this.df);
        hashMap.put("lf", this.lf);
        hashMap.put("codec", this.codec_type);
        hashMap.put("merror", this.merror);
        hashMap.put("hijack", Integer.valueOf(this.hijack));
        hashMap.put("hw", Integer.valueOf(this.hw));
        hashMap.put("cache_file", Integer.valueOf(this.cacheFile));
        hashMap.put("decoder_type", Integer.valueOf(this.decoderType));
        hashMap.put("use_preload", Integer.valueOf(this.preload));
        hashMap.put("dns_t", Long.valueOf(this.dnsT));
        hashMap.put("tran_ct", Long.valueOf(this.tranConnectT));
        hashMap.put("tran_ft", Long.valueOf(this.tranFirstPacketT));
        hashMap.put("re_f_videoframet", Long.valueOf(this.receiveFirstVideoFrameT));
        hashMap.put("de_f_videoframet", Long.valueOf(this.decodeFirstVideoFrameT));
        hashMap.put("re_f_audioframet", Long.valueOf(this.receiveFirstAudioFrameT));
        hashMap.put("de_f_audioframet", Long.valueOf(this.decodeFirstAudioFrameT));
        hashMap.put("bu_acu_t", Long.valueOf(this.bufferAccuT));
        hashMap.put("de_bu_acu_t", Long.valueOf(this.decoderBufferAccuT));
        hashMap.put("pause_acu_t", Long.valueOf(this.pauseAccuT));
        hashMap.put("internal_ip", this.internalIP);
        hashMap.put("accu_errc", Integer.valueOf(this.accuErrCount));
        hashMap.put("try_err_c", Integer.valueOf(this.errCount));
        hashMap.put("tag", this.tag);
        hashMap.put("ex", this.ex);
        hashMap.put("first_buf_startt", Long.valueOf(this.firstBufferStartT));
        hashMap.put("first_buf_endt", Long.valueOf(this.firstBufferEndT));
        hashMap.put("cur_play_pos", Long.valueOf(this.curPlayBackTime));
        hashMap.put("lc", Long.valueOf(this.loopCount));
        hashMap.put("play_back_state", Integer.valueOf(this.playBackState));
        hashMap.put("load_state", Integer.valueOf(this.loadState));
        hashMap.put("video_out_fps", Float.valueOf(this.curVideoOutputFps));
        hashMap.put("container_fps", Float.valueOf(this.containerFps));
        hashMap.put("video_decoder_fps", Integer.valueOf(this.curVideoDecoderFps));
        hashMap.put("clock_diff", Long.valueOf(this.clockDiff));
        hashMap.put("drop_count", Integer.valueOf(this.dropCount));
        hashMap.put("video_device_opened_t", Long.valueOf(this.videoDeviceOpenedTime));
        hashMap.put("audio_device_opened_t", Long.valueOf(this.audioDeviceOpenedTime));
        hashMap.put("finish", Integer.valueOf(this.finish));
        hashMap.put("is_start_play_automatically", Integer.valueOf(this.isStartPlayAutomatically));
        hashMap.put("prepare_call_t", Long.valueOf(this.prepareStartT));
        if (this.ownPlayerCreateException != null) {
            hashMap.put("player_create_exception", this.ownPlayerCreateException);
        }
        if (this.mPreloadInfo != null) {
            hashMap.put("preload", this.mPreloadInfo);
        }
        if (this.mPlayItem != null) {
            hashMap.put("playitem", this.mPlayItem);
        }
        if (this.mFeedInfo != null) {
            hashMap.put("feed", this.mFeedInfo);
        }
        hashMap.put("initial_url", this.mInitialURL);
        hashMap.put("initial_ip", this.mInitialIP);
        if (this.externLogFromApp != null) {
            hashMap.put("extern_log_from_app", this.externLogFromApp);
        }
        if (this.playbackparams != null) {
            hashMap.put("playparam", this.playbackparams);
        }
        hashMap.put("audio_codec_nameId", Integer.valueOf(this.audioCodecNameId));
        hashMap.put("video_codec_nameId", Integer.valueOf(this.videoCodecNameId));
        hashMap.put("surface_set_time", Long.valueOf(this.surfaceSetTime));
        hashMap.put("frames_drop_set_num", Integer.valueOf(this.mFramesSetDropNum));
        hashMap.put("video_device_start_t", Long.valueOf(this.videoDeviceStartTime));
        hashMap.put("audio_device_start_t", Long.valueOf(this.audioDeviceStartTime));
        hashMap.put("video_length", Long.valueOf(this.videoBufferLength));
        hashMap.put("audio_length", Long.valueOf(this.audioBufferLength));
        hashMap.put("de_s_videoframet", Long.valueOf(this.decodeSecondVideoFrameT));
        hashMap.put("enable_mdl", Integer.valueOf(this.enableMDL));
        if (this.proxy_url != null) {
            hashMap.put("proxy_url", this.proxy_url);
        }
        if (this.watchduration >= 0) {
            hashMap.put("watch_dur", Integer.valueOf(this.watchduration));
        }
        if (this.hw > 0) {
            hashMap.put("mediacodec_render", Integer.valueOf(this.mediaCodecRender));
            hashMap.put("hw_codec_name", this.hwCodecName);
            hashMap.put("hw_codec_exception", Integer.valueOf(this.hwCodecException));
            hashMap.put("chipboard", this.chipBoardName);
            hashMap.put("chiphardware", this.chipHardwareName);
        }
        return new JSONObject(hashMap);
    }
}
