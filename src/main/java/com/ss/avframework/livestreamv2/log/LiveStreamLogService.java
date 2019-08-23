package com.ss.avframework.livestreamv2.log;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.avframework.livestreamv2.LiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.LiveStreamReport;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TimeUtils;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public class LiveStreamLogService implements Handler.Callback {
    private boolean mDebug;
    private double mEncodeFps;
    private Handler mHandler;
    private final long mInterval;
    private long mLastBitRate;
    private LiveStream mLiveStream;
    private ILogUploader mLogUploader;
    private String mLogVersion;
    private int mLongerPackageDelayTimes;
    private double mPreviewFps;
    private String mProjectKey;
    private long mPushStartTime;
    private int mRateAdjustTimes;
    private double mRealBitrate;
    private double mRealFps;
    private int mReconnectTimes;
    private String mRemoteIP;
    private long mRtmpConnectingTime;
    private boolean mStarted;
    private LiveStreamReport mStaticsReport;
    private StringBuffer mTransportStats;

    static class LiveStreamLogFilter implements AVLog.ILogFilter {
        private final WeakReference<LiveStreamLogService> mLogService;

        LiveStreamLogFilter(LiveStreamLogService liveStreamLogService) {
            this.mLogService = new WeakReference<>(liveStreamLogService);
        }

        public void print(int i, String str, String str2, Throwable th) {
            if (th != null) {
                str2 = str2 + " Cause:" + Log.getStackTraceString(th);
            }
            LiveStreamLogService liveStreamLogService = (LiveStreamLogService) this.mLogService.get();
            if (liveStreamLogService != null) {
                liveStreamLogService.uploadSDKLog(i, str, str2);
            }
        }
    }

    public void onRTMPConnecting() {
        this.mRtmpConnectingTime = System.currentTimeMillis();
    }

    public void onReconnect() {
        this.mReconnectTimes++;
    }

    public void close() {
        if (this.mStarted) {
            this.mStarted = false;
            this.mHandler.removeCallbacksAndMessages(null);
        }
    }

    public void manualReport() {
        this.mHandler.removeMessages(BaseLoginOrRegisterActivity.o);
        report();
    }

    public void reset() {
        this.mLastBitRate = 0;
        this.mRateAdjustTimes = 0;
        this.mLongerPackageDelayTimes = 0;
        this.mReconnectTimes = 0;
        this.mRtmpConnectingTime = 0;
    }

    private void setupSDKLogServer() {
        if (AVLog.setupLogIODevice(new LiveStreamLogFilter(this)) != null) {
            new Exception("Log filter conver!");
        }
    }

    public void start() {
        if (!this.mStarted) {
            this.mHandler.sendEmptyMessageDelayed(BaseLoginOrRegisterActivity.o, this.mInterval);
            this.mStarted = true;
        }
    }

    private void report() {
        if (this.mLiveStream != null && this.mLogUploader != null && this.mStaticsReport != null) {
            try {
                this.mLiveStream.getLiveStreamInfo(this.mStaticsReport);
                this.mLogUploader.uploadLog(createLog(this.mStaticsReport));
            } catch (JSONException unused) {
            }
            if (this.mStarted) {
                this.mHandler.sendEmptyMessageDelayed(BaseLoginOrRegisterActivity.o, this.mInterval);
            }
        }
    }

    public String getPushType() {
        LiveStreamBuilder liveStreamBuilder;
        if (this.mLiveStream != null) {
            liveStreamBuilder = this.mLiveStream.getLiveStreamBuilder();
        } else {
            liveStreamBuilder = null;
        }
        if (liveStreamBuilder.getVideoCaptureDevice() == 0 && liveStreamBuilder.getAudioCaptureDevice() != 0) {
            return "audio";
        }
        if (liveStreamBuilder.getVideoCaptureDevice() != 0 && liveStreamBuilder.getAudioCaptureDevice() != 0) {
            return "avo";
        }
        if (liveStreamBuilder.getVideoCaptureDevice() == 0 || liveStreamBuilder.getAudioCaptureDevice() != 0) {
            return "none";
        }
        return "video";
    }

    public JSONObject createCommonLog() {
        String str = "";
        String str2 = "";
        String str3 = "";
        boolean z = false;
        if (this.mLiveStream != null) {
            str = this.mLiveStream.getVersion();
            str2 = this.mLiveStream.getOriginUrl();
            if (this.mLiveStream.isDnsOptOpen()) {
                z = this.mLiveStream.isDnsOptHit();
                str3 = this.mLiveStream.getEvaluatorSymbol();
            }
        }
        try {
            return new JSONObject().put("version", this.mLogVersion).put("live_sdk_version", str).put("report_version", 5).put("product_line", "live").put("timestamp", System.currentTimeMillis()).put("mode", "push").put("project_key", this.mProjectKey).put("cdn_ip", this.mRemoteIP).put(PushConstants.WEB_URL, str2).put("hit_node_optimize", z).put("evaluator_symbol", str3);
        } catch (JSONException unused) {
            return null;
        }
    }

    public void staticAverageLog() {
        if (this.mLiveStream != null && this.mLogUploader != null && this.mStaticsReport != null) {
            this.mLiveStream.getLiveStreamInfo(this.mStaticsReport);
            if (isZero(this.mRealFps)) {
                this.mRealFps = this.mStaticsReport.getVideoTransportRealFps();
            } else {
                this.mRealFps = (this.mRealFps + this.mStaticsReport.getVideoTransportRealFps()) / 2.0d;
            }
            if (isZero(this.mPreviewFps)) {
                this.mPreviewFps = this.mStaticsReport.getVideoSourceDeliverFps();
            } else {
                this.mPreviewFps = (this.mPreviewFps + this.mStaticsReport.getVideoSourceDeliverFps()) / 2.0d;
            }
            if (isZero(this.mEncodeFps)) {
                this.mEncodeFps = this.mStaticsReport.getVideoEncodeRealFps();
            } else {
                this.mEncodeFps = (this.mEncodeFps + this.mStaticsReport.getVideoEncodeRealFps()) / 2.0d;
            }
            if (isZero(this.mRealBitrate)) {
                this.mRealBitrate = this.mStaticsReport.getVideoTransportRealBps();
            } else {
                this.mRealBitrate = (this.mRealBitrate + this.mStaticsReport.getVideoTransportRealBps()) / 2.0d;
            }
            if (this.mStarted) {
                this.mHandler.sendEmptyMessageDelayed(102, 1000);
            }
        }
    }

    public void setProjectKey(String str) {
        this.mProjectKey = str;
    }

    public boolean handleMessage(Message message) {
        if (101 == message.what) {
            report();
        }
        return true;
    }

    public boolean isZero(double d2) {
        return String.valueOf(d2).equals("0.0");
    }

    public void onKCPMessage(String str) {
        StringBuffer stringBuffer = this.mTransportStats;
        stringBuffer.append(str + "\n");
    }

    public void onSendPktSlow(int i) {
        this.mLongerPackageDelayTimes++;
        JSONObject createCommonLog = createCommonLog();
        if (createCommonLog != null) {
            try {
                createCommonLog.put("event_key", "send_package_slow").put("send_package_duration", i);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public void onConnectEnd(int i) {
        if (this.mPushStartTime != 0) {
            JSONObject createCommonLog = createCommonLog();
            if (createCommonLog != null) {
                try {
                    createCommonLog.put("event_key", "connect_end").put("state", i).put("reconnect_count", this.mReconnectTimes).put("rate_adjust_times", this.mRateAdjustTimes).put("send_package_slow_times", this.mLongerPackageDelayTimes).put("push_duration", System.currentTimeMillis() - this.mPushStartTime);
                    this.mLogUploader.uploadLog(createCommonLog);
                } catch (JSONException unused) {
                }
            }
            this.mPushStartTime = 0;
        }
    }

    private JSONObject createLog(LiveStreamReport liveStreamReport) throws JSONException {
        String str;
        int i;
        LiveStreamBuilder liveStreamBuilder = null;
        if (liveStreamReport == null || this.mLiveStream == null) {
            return null;
        }
        if (this.mLiveStream != null) {
            liveStreamBuilder = this.mLiveStream.getLiveStreamBuilder();
        }
        JSONObject createCommonLog = createCommonLog();
        if (createCommonLog == null) {
            return createCommonLog;
        }
        String pushType = getPushType();
        int videoDropCount = ((int) liveStreamReport.getVideoDropCount()) + ((int) liveStreamReport.getTransportDropCount());
        long int64Value = this.mLiveStream.getInt64Value(1);
        String str2 = "";
        String str3 = "";
        if (liveStreamBuilder.getVideoEncoder() == 1) {
            str2 = "h264";
            if (liveStreamBuilder.getVideoProfile() == 1) {
                str3 = "base";
            } else if (liveStreamBuilder.getVideoProfile() == 2) {
                str3 = "main";
            } else if (liveStreamBuilder.getVideoProfile() == 3) {
                str3 = "high";
            }
        } else if (liveStreamBuilder.getVideoEncoder() == 2) {
            str2 = "h265";
            if (liveStreamBuilder.getVideoProfile() == 1) {
                str3 = "main";
            } else if (liveStreamBuilder.getVideoProfile() == 2) {
                str3 = "main10";
            }
        }
        String str4 = "";
        String str5 = "";
        if (liveStreamBuilder.getAudioEncoder() == 1) {
            str4 = "aac";
            if (liveStreamBuilder.getAudioProfile() == 1) {
                str5 = "LC";
            } else if (liveStreamBuilder.getAudioProfile() == 2) {
                str5 = "HE";
            } else if (liveStreamBuilder.getAudioProfile() == 3) {
                str5 = "HEv2";
            }
        }
        JSONObject put = createCommonLog.put("event_key", "push_stream");
        if (this.mTransportStats == null || this.mTransportStats.length() == 0) {
            str = "null";
        } else {
            str = this.mTransportStats.toString();
        }
        JSONObject put2 = put.put("transport_layer_status", str).put("meta_video_bitrate", this.mLiveStream.getVideoMetaBitRate() / 1000).put("meta_audio_bitrate", liveStreamBuilder.getAudioBitrate() / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).put("audio_channel", liveStreamBuilder.getAudioChannel()).put("audio_sample_rate", liveStreamBuilder.getAudioSampleHZ()).put("audio_encode_rate", ((int) liveStreamReport.getAudioEncodeRealBps()) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).put("audio_capture_type", liveStreamBuilder.getAudioCaptureDevice()).put("is_live_audio_capture", liveStreamBuilder.isUsingLiveStreamAudioCapture()).put("audio_codec", str4).put("audio_profile", str5).put("video_capture_type", liveStreamBuilder.getVideoCaptureDevice()).put("real_video_framerate", (int) liveStreamReport.getVideoTransportRealFps()).put("meta_video_framerate", liveStreamBuilder.getVideoFps());
        if (liveStreamBuilder.getVideoFps() != 0) {
            i = this.mLiveStream.getVideoGop() / liveStreamBuilder.getVideoFps();
        } else {
            i = 0;
        }
        JSONObject put3 = put2.put("i_key_frame_max", i).put("encode_fps", (int) liveStreamReport.getVideoEncodeRealFps()).put("preview_fps", (int) liveStreamReport.getVideoSourceDeliverFps()).put("drop_source_fps", (int) liveStreamReport.getVideoSourceDropFps()).put("video_source_live", this.mLiveStream.isVideoLive() ? 1 : 0).put("audio_source_live", this.mLiveStream.isAudioLive() ? 1 : 0).put("width", liveStreamBuilder.getVideoWidth()).put("height", liveStreamBuilder.getVideoHeight()).put(PushConstants.PUSH_TYPE, pushType).put("video_codec", str2).put("video_profile", str3).put("hardware", liveStreamBuilder.isEnableVideoEncodeAccelera() ? 1 : 0).put("real_bitrate", ((int) liveStreamReport.getVideoTransportRealBps()) / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).put("duration", liveStreamReport.getTransportDuration()).put("rtmp_buffer_time", int64Value).put("package_delay", (int) (liveStreamReport.getTransportPackageAverageDelay() + 0.5d)).put("drop_count", videoDropCount).put("live_status", this.mLiveStream.status());
        this.mTransportStats.setLength(0);
        return put3;
    }

    public LiveStreamLogService(LiveStream liveStream, ILogUploader iLogUploader) {
        this(liveStream, iLogUploader, 0);
    }

    public void onBitrateAdjust(long j, String str) {
        this.mRateAdjustTimes++;
        JSONObject createCommonLog = createCommonLog();
        if (createCommonLog != null) {
            try {
                createCommonLog.put("event_key", "bitrate_adjust").put("bitrate_beforeadjust", this.mLastBitRate).put("bitrate_afteradjust", j).put("adjustment", str);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
        this.mLastBitRate = j;
    }

    public void onPushStreamFail(int i, String str) {
        JSONObject createCommonLog = createCommonLog();
        if (createCommonLog != null) {
            boolean z = false;
            if (this.mLiveStream != null) {
                z = this.mLiveStream.getLiveStreamBuilder().isEnableVideoEncodeAccelera();
            }
            try {
                createCommonLog.put("event_key", "push_stream_fail").put("message", str).put("error_code", i).put("hardware", z ? 1 : 0);
                this.mLogUploader.uploadLog(createCommonLog);
            } catch (JSONException unused) {
            }
        }
    }

    public LiveStreamLogService(LiveStream liveStream, ILogUploader iLogUploader, long j) {
        this.mDebug = true;
        this.mLogVersion = "2.0.0";
        this.mProjectKey = "";
        this.mRemoteIP = "";
        this.mTransportStats = new StringBuffer();
        this.mRtmpConnectingTime = 0;
        this.mHandler = new Handler(this);
        this.mInterval = j <= 0 ? 5000 : j;
        this.mLiveStream = liveStream;
        this.mLogUploader = iLogUploader;
        this.mStaticsReport = new LiveStreamReport();
        setupSDKLogServer();
    }

    public void uploadSDKLog(int i, String str, String str2) {
        JSONObject createCommonLog = createCommonLog();
        try {
            createCommonLog.put("event_key", "live_sdk_log").put("clockMs", TimeUtils.nanoTime() / 1000000).put("level", i).put("tag", str).put("message", str2);
            if (this.mLogUploader != null) {
                this.mLogUploader.uploadLog(createCommonLog);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRTMPEnd(int r14, int r15, boolean r16, java.lang.String r17, long r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r17
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 != r5) goto L_0x000e
            r0.mPushStartTime = r3
        L_0x000e:
            long r6 = r0.mRtmpConnectingTime
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x001a
            long r6 = r0.mRtmpConnectingTime
            long r8 = r3 - r6
        L_0x001a:
            if (r2 == 0) goto L_0x001e
            r0.mRemoteIP = r2
        L_0x001e:
            com.ss.avframework.livestreamv2.LiveStream r2 = r0.mLiveStream
            r3 = 0
            if (r2 == 0) goto L_0x003e
            com.ss.avframework.livestreamv2.LiveStream r2 = r0.mLiveStream
            com.ss.avframework.livestreamv2.LiveStreamBuilder r2 = r2.getLiveStreamBuilder()
            if (r2 == 0) goto L_0x003e
            int r4 = r2.getVideoBitrate()
            int r4 = r4 / 1000
            int r6 = r2.getVideoMinBitrate()
            int r6 = r6 / 1000
            int r2 = r2.getVideoMaxBitrate()
            int r2 = r2 / 1000
            goto L_0x0041
        L_0x003e:
            r2 = 0
            r4 = 0
            r6 = 0
        L_0x0041:
            org.json.JSONObject r7 = r13.createCommonLog()
            if (r7 == 0) goto L_0x009c
            java.lang.String r10 = r13.getPushType()
            java.lang.String r11 = "event_key"
            java.lang.String r12 = "connect_start"
            org.json.JSONObject r11 = r7.put(r11, r12)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r12 = "connect_status"
            if (r1 != r5) goto L_0x0058
            r3 = 1
        L_0x0058:
            org.json.JSONObject r3 = r11.put(r12, r3)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r5 = "connect_elapse"
            org.json.JSONObject r3 = r3.put(r5, r8)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r5 = "error_code"
            org.json.JSONObject r1 = r3.put(r5, r14)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "error_count"
            r5 = r15
            org.json.JSONObject r1 = r1.put(r3, r15)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "first_connect"
            r5 = r16
            org.json.JSONObject r1 = r1.put(r3, r5)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "dns_parse_time"
            r8 = r18
            org.json.JSONObject r1 = r1.put(r3, r8)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "push_type"
            org.json.JSONObject r1 = r1.put(r3, r10)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "default_bitrate"
            org.json.JSONObject r1 = r1.put(r3, r4)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "min_bitrate"
            org.json.JSONObject r1 = r1.put(r3, r6)     // Catch:{ JSONException -> 0x009c }
            java.lang.String r3 = "max_bitrate"
            r1.put(r3, r2)     // Catch:{ JSONException -> 0x009c }
            com.ss.avframework.livestreamv2.log.ILogUploader r1 = r0.mLogUploader     // Catch:{ JSONException -> 0x009c }
            r1.uploadLog(r7)     // Catch:{ JSONException -> 0x009c }
            return
        L_0x009c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.log.LiveStreamLogService.onRTMPEnd(int, int, boolean, java.lang.String, long):void");
    }
}
