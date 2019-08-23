package io.agora.rtc.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.AudioManager;
import android.net.DhcpInfo;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.OrientationEventListener;
import android.view.SurfaceView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import io.agora.rtc.IAudioEffectManager;
import io.agora.rtc.IAudioFrameObserver;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.IRtcEngineEventHandlerEx;
import io.agora.rtc.PublisherConfiguration;
import io.agora.rtc.RtcEngineEx;
import io.agora.rtc.internal.AudioRoutingController;
import io.agora.rtc.internal.RtcEngineMessage;
import io.agora.rtc.video.AGLThread;
import io.agora.rtc.video.AgoraVideoFrame;
import io.agora.rtc.video.CameraHelper;
import io.agora.rtc.video.VideoCanvas;
import io.agora.rtc.video.VideoCompositingLayout;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.microedition.khronos.egl.EGLContext;

public class RtcEngineImpl extends RtcEngineEx implements IAudioEffectManager, AudioRoutingController.AudioRoutingListener {
    private static boolean sLibLoaded;
    static float[] sMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private long lastOrientationTs;
    public AGLThread mAGLThread;
    public AudioRoutingController mAudioRoutingController;
    private int mCameraIndex;
    private int mChannelProfile;
    private int mClientRole = 2;
    private PublisherConfiguration mConfiguration;
    private ConnectionChangeBroadcastReceiver mConnectionBroadcastReceiver;
    private WeakReference<Context> mContext;
    private int mCurrentDeviceOrientation;
    private String mDeviceId;
    private int mExAudioChannels;
    private int mExAudioSampleRate;
    private IRtcEngineEventHandler mHandler;
    private int mMobileType = -1;
    private boolean mMonitorAudioRouting = true;
    private long mNativeHandle;
    private int mOrientation = -1;
    private OrientationEventListener mOrientationListener;
    private AgoraPhoneStateListener mPhoneStateLinstner;
    public boolean mRequestSoftwareEncoder;
    private IRtcEngineEventHandler.RtcStats mRtcStats;
    private int mTotalRotation = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    private boolean mUseExternalAudioSource;
    private boolean mUseExternalVideoSource;
    public boolean mUseLocalView;
    private boolean mUsingFrontCamera;
    public boolean mVideoEnabled;
    private WifiManager.WifiLock mWifiLock;

    class AgoraPhoneStateListener extends PhoneStateListener {
        private SignalStrength mSignalStrenth;

        public int getAsuLevel() {
            return invokeMethod("getAsuLevel");
        }

        public int getLevel() {
            return invokeMethod("getLevel");
        }

        public int getRssi() {
            return invokeMethod("getDbm");
        }

        private AgoraPhoneStateListener() {
        }

        public void onSignalStrengthsChanged(SignalStrength signalStrength) {
            super.onSignalStrengthsChanged(signalStrength);
            this.mSignalStrenth = signalStrength;
        }

        private int invokeMethod(String str) {
            try {
                if (this.mSignalStrenth != null) {
                    Method declaredMethod = this.mSignalStrenth.getClass().getDeclaredMethod(str, new Class[0]);
                    if (declaredMethod != null) {
                        return ((Integer) declaredMethod.invoke(this.mSignalStrenth, new Object[0])).intValue();
                    }
                }
            } catch (Exception unused) {
            }
            return 0;
        }

        public void onCallStateChanged(int i, String str) {
            super.onCallStateChanged(i, str);
            if (RtcEngineImpl.this.mAudioRoutingController != null) {
                switch (i) {
                    case 0:
                        Logging.i("RtcEngine", "system phone call end delay 1000ms");
                        new Handler().postDelayed(new Runnable() {
                            public void run() {
                                try {
                                    RtcEngineImpl.this.enableAudio();
                                    RtcEngineImpl.this.mAudioRoutingController.sendEvent(22, 0);
                                } catch (Exception e2) {
                                    Logging.e("RtcEngine", "fail to resume ", e2);
                                }
                            }
                        }, 1000);
                        return;
                    case 1:
                        Logging.i("RtcEngine", "system phone call ring");
                        RtcEngineImpl.this.disableAudio();
                        RtcEngineImpl.this.mAudioRoutingController.sendEvent(22, 1);
                        return;
                    case 2:
                        Logging.i("RtcEngine", "system phone call start");
                        RtcEngineImpl.this.disableAudio();
                        RtcEngineImpl.this.mAudioRoutingController.sendEvent(22, 2);
                        break;
                }
            }
        }
    }

    public static class MobileType {
    }

    private native int deliverFrame(long j, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8);

    private static native int nativeClassInit();

    private native int nativeComplain(long j, String str, String str2);

    private native int nativeCreateDataStream(long j, boolean z, boolean z2);

    private native int nativeDestroy(long j);

    private native String nativeGetCallId(long j);

    public static native String nativeGetChatEngineVersion();

    public static native String nativeGetErrorDescription(int i);

    private native long nativeGetHandle(long j);

    private native int nativeGetIntParameter(long j, String str, String str2);

    private static native byte[] nativeGetOptionsByVideoProfile(long j, int i);

    private native String nativeGetParameter(long j, String str, String str2);

    private native String nativeGetParameters(long j, String str);

    private native String nativeGetProfile(long j);

    public static native String nativeGetSdkVersion();

    private native int nativeJoinChannel(long j, byte[] bArr, String str, String str2, String str3, int i);

    private native int nativeLeaveChannel(long j);

    static native int nativeLog(int i, String str);

    private native String nativeMakeQualityReportUrl(long j, String str, int i, int i2, int i3);

    private native int nativeNotifyNetworkChange(long j, byte[] bArr);

    private native long nativeObjectInit(Object obj, String str, String str2, String str3, String str4, String str5);

    private native int nativePushExternalAudioFrameRawData(long j, byte[] bArr, long j2, int i, int i2);

    private native int nativeRate(long j, String str, int i, String str2);

    private native int nativeRegisterAudioFrameObserver(long j, Object obj);

    private native int nativeSendStreamMessage(long j, int i, byte[] bArr);

    private native int nativeSetApiCallMode(long j, int i);

    private native int nativeSetEGL10Context(long j, EGLContext eGLContext);

    private native int nativeSetEGL10TextureId(long j, int i, EGLContext eGLContext, int i2, int i3, int i4, long j2, float[] fArr);

    private native int nativeSetEGL14Context(long j, android.opengl.EGLContext eGLContext);

    private native int nativeSetEGL14TextureId(long j, int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j2, float[] fArr);

    private native int nativeSetEncryptionSecret(long j, String str);

    private native int nativeSetParameters(long j, String str);

    private native int nativeSetProfile(long j, String str, boolean z);

    private native int nativeSetVideoCompositingLayout(long j, byte[] bArr);

    private native int nativeSetVideoProfileEx(long j, int i, int i2, int i3, int i4);

    private native int nativeSetupVideoLocal(long j, SurfaceView surfaceView, int i);

    private native int nativeSetupVideoRemote(long j, SurfaceView surfaceView, int i, int i2);

    private native int nativeStartEchoTest(long j, byte[] bArr);

    private native int nativeStopEchoTest(long j);

    private void onLogEvent(int i, String str) {
    }

    private native int setExtVideoSource(long j, int i, int i2);

    public IAudioEffectManager getAudioEffectManager() {
        return this;
    }

    @Deprecated
    public void setPreferHeadset(boolean z) {
    }

    private IRtcEngineEventHandlerEx getExHandler() {
        return (IRtcEngineEventHandlerEx) this.mHandler;
    }

    public int clearVideoCompositingLayout() {
        return setParameter("rtc.api.clear_video_compositing_layout", true);
    }

    public int disableAudio() {
        return setParameter("rtc.audio.enabled", false);
    }

    public int disableLastmileTest() {
        return setParameter("rtc.lastmile_test", false);
    }

    public int enableAudio() {
        return setParameter("rtc.audio.enabled", true);
    }

    public int enableLastmileTest() {
        return setParameter("rtc.lastmile_test", true);
    }

    public String getCallId() {
        return nativeGetCallId(this.mNativeHandle);
    }

    public long getNativeHandle() {
        return nativeGetHandle(this.mNativeHandle);
    }

    public String getProfile() {
        return nativeGetProfile(this.mNativeHandle);
    }

    public int pauseAllEffects() {
        return setParameter("che.audio.game_pause_all_effects", true);
    }

    public int pauseAudio() {
        return setParameter("rtc.audio.paused", true);
    }

    public int pauseAudioMixing() {
        return setParameter("che.audio.pause_file_as_playout", true);
    }

    public int playRecap() {
        return setParameter("che.audio.recap.start_play", true);
    }

    public int refreshRecordingServiceStatus() {
        return setParameter("rtc.api.query_recording_service_status", true);
    }

    public int resumeAllEffects() {
        return setParameter("che.audio.game_resume_all_effects", true);
    }

    public int resumeAudio() {
        return setParameter("rtc.audio.paused", false);
    }

    public int resumeAudioMixing() {
        return setParameter("che.audio.pause_file_as_playout", false);
    }

    public int stopAllEffects() {
        return setParameter("che.audio.game_stop_all_effects", true);
    }

    public int stopAudioMixing() {
        return setParameter("che.audio.stop_file_as_playout", true);
    }

    public int stopAudioRecording() {
        return setParameter("che.audio.stop_recording", true);
    }

    public int stopEchoTest() {
        return nativeStopEchoTest(this.mNativeHandle);
    }

    public int stopPlayingStream() {
        return setParameter("rtc.api.video.stop_play_stream", true);
    }

    public int stopPreview() {
        return setParameter("rtc.video.preview", false);
    }

    public int useExternalAudioDevice() {
        return setParameters("{\"che.audio.audioSampleRate\":32000, \"che.audio.external_device\":true}");
    }

    private int monitorAudioRouting() {
        if (this.mMonitorAudioRouting && this.mAudioRoutingController != null) {
            this.mAudioRoutingController.startMonitoring();
        }
        return 0;
    }

    private int selectFrontCamera() {
        if (Camera.getNumberOfCameras() > 1) {
            return 1;
        }
        return 0;
    }

    public void destroyTexture() {
        if (this.mAGLThread != null) {
            this.mAGLThread.releaseAGLThread();
            this.mAGLThread = null;
        }
    }

    public int getAudioMixingCurrentPosition() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_mixing_file_played_ms", null);
    }

    public int getAudioMixingDuration() {
        return nativeGetIntParameter(this.mNativeHandle, "che.audio.get_mixing_file_length_ms", null);
    }

    public double getEffectsVolume() {
        return (double) nativeGetIntParameter(this.mNativeHandle, "che.audio.game_get_effects_volume", null);
    }

    public IRtcEngineEventHandler.RtcStats getRtcStats() {
        if (this.mRtcStats == null) {
            this.mRtcStats = new IRtcEngineEventHandler.RtcStats();
        }
        return this.mRtcStats;
    }

    public boolean isTextureEncodeSupported() {
        if (DeviceUtils.getRecommendedEncoderType() == 0) {
            return true;
        }
        return false;
    }

    public void notifyNetworkChange() {
        nativeNotifyNetworkChange(this.mNativeHandle, getNetworkInfo());
    }

    public int stopAllRemoteVideo() {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return setParameter("che.video.peer.stop_all_renders", true);
    }

    protected static String getRandomUUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    public static synchronized boolean initializeNativeLibs() {
        boolean z;
        boolean z2;
        synchronized (RtcEngineImpl.class) {
            if (!sLibLoaded) {
                System.loadLibrary("agora-rtc-sdk-jni");
                if (nativeClassInit() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sLibLoaded = z2;
            }
            z = sLibLoaded;
        }
        return z;
    }

    public static synchronized boolean loadNativeLibsExternal() {
        boolean z;
        boolean z2;
        synchronized (RtcEngineImpl.class) {
            if (!sLibLoaded) {
                if (nativeClassInit() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sLibLoaded = z2;
            }
            z = sLibLoaded;
        }
        return z;
    }

    public int disableVideo() {
        this.mVideoEnabled = false;
        if (this.mAudioRoutingController != null) {
            this.mAudioRoutingController.sendEvent(14, 1);
        }
        return setParameter("rtc.video.enabled", false);
    }

    public void finalize() {
        destroyTexture();
        if (this.mNativeHandle != 0) {
            nativeDestroy(this.mNativeHandle);
        }
    }

    public float getCameraMaxZoomFactor() {
        String nativeGetParameter = nativeGetParameter(this.mNativeHandle, "che.video.camera.get_max_zoom", null);
        if (nativeGetParameter == null) {
            return -1000.0f;
        }
        return Double.valueOf(nativeGetParameter).floatValue();
    }

    /* access modifiers changed from: protected */
    public byte[] getNetworkInfo() {
        RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo = doGetNetworkInfo((Context) this.mContext.get());
        if (doGetNetworkInfo != null) {
            return doGetNetworkInfo.marshall();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getNetworkType() {
        Context context = (Context) this.mContext.get();
        if (checkAccessNetworkState(context)) {
            return Connectivity.getNetworkType(context);
        }
        return -1;
    }

    public SurfaceTexture getSurfaceTexture() {
        if (this.mAGLThread != null) {
            if (this.mAGLThread.isReady()) {
                return this.mAGLThread.getSurfaceTexture();
            }
            Logging.e("not ready, call it later :-)");
        }
        return null;
    }

    public boolean isCameraAutoFocusFaceModeSupported() {
        if (!Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.face_focus_supported", null)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isCameraFocusSupported() {
        if (!Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.focus_supported", null)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isCameraTorchSupported() {
        if (!Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.torch_supported", null)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isCameraZoomSupported() {
        if (!Boolean.valueOf(nativeGetParameter(this.mNativeHandle, "che.video.camera.zoom_supported", null)).booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean isSpeakerphoneEnabled() {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return false;
        }
        return getAudioManager(context).isSpeakerphoneOn();
    }

    public int leaveChannel() {
        doStopMonitorSystemEvent();
        if (this.mAudioRoutingController != null) {
            this.mAudioRoutingController.stopMonitoring();
        }
        return nativeLeaveChannel(this.mNativeHandle);
    }

    public void requestSoftwareEncoder() {
        if (this.mUseExternalVideoSource) {
            setParameter("che.video.enable_external_texture_input", false);
            setExtVideoSource(this.mNativeHandle, 1, 1);
            this.mRequestSoftwareEncoder = true;
        }
        setParameters("{\"che.hardware_encoding\": 0}");
    }

    public int startEchoTest() {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return -7;
        }
        RtcEngineMessage.MediaAppContext createAppContext = createAppContext(context);
        doMonitorSystemEvent(context, createAppContext);
        return nativeStartEchoTest(this.mNativeHandle, createAppContext.marshall());
    }

    public int startPreview() {
        if (!this.mVideoEnabled || this.mUseExternalVideoSource) {
            return -4;
        }
        if (setParameter("che.video.local.camera_index", this.mCameraIndex) == 0) {
            return setParameter("rtc.video.preview", true);
        }
        return -7;
    }

    public int switchCamera() {
        if (!this.mVideoEnabled || this.mUseExternalVideoSource || Camera.getNumberOfCameras() <= 1) {
            return -1;
        }
        if (this.mCameraIndex == 0) {
            setVideoCamera(1);
        } else {
            setVideoCamera(0);
        }
        return 0;
    }

    private void doStopMonitorSystemEvent() {
        if (this.mOrientationListener != null) {
            this.mOrientationListener.disable();
            this.mOrientationListener = null;
        }
        if (this.mWifiLock != null && this.mWifiLock.isHeld()) {
            this.mWifiLock.release();
            Logging.i("RtcEngine", "hp connection mode ended");
        }
    }

    public void doDestroy() {
        setExternalVideoSource(false, false, true);
        destroyTexture();
        this.mAudioRoutingController.uninitialize();
        this.mAudioRoutingController = null;
        monitorConnectionEvent(false);
        this.mOrientationListener = null;
        this.mPhoneStateLinstner = null;
        nativeDestroy(this.mNativeHandle);
        this.mNativeHandle = 0;
    }

    public int enableVideo() {
        if (this.mUseExternalVideoSource) {
            this.mVideoEnabled = true;
        } else {
            this.mVideoEnabled = CameraHelper.checkPermission();
        }
        if (this.mAudioRoutingController != null) {
            this.mAudioRoutingController.sendEvent(14, 0);
        }
        if (this.mVideoEnabled) {
            return setParameter("rtc.video.enabled", true);
        }
        return -9;
    }

    /* access modifiers changed from: protected */
    public int getBatteryLifePercent() {
        Context context = (Context) this.mContext.get();
        if (context != null) {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra2 != 0) {
                    return (int) ((((float) intExtra) / ((float) intExtra2)) * 100.0f);
                }
            }
        }
        return 255;
    }

    protected static String getLocalHost() {
        try {
            for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (!t.getName().startsWith("usb")) {
                    for (T inetAddressToIpAddress : Collections.list(t.getInetAddresses())) {
                        String inetAddressToIpAddress2 = inetAddressToIpAddress(inetAddressToIpAddress);
                        if (inetAddressToIpAddress2 != null && !inetAddressToIpAddress2.isEmpty()) {
                            return inetAddressToIpAddress2;
                        }
                    }
                    continue;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    protected static String[] getLocalHostList() {
        try {
            ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList<String> arrayList = new ArrayList<>();
            for (T t : list) {
                if (!t.getName().startsWith("usb")) {
                    for (T inetAddressToIpAddress : Collections.list(t.getInetAddresses())) {
                        String inetAddressToIpAddress2 = inetAddressToIpAddress(inetAddressToIpAddress);
                        if (inetAddressToIpAddress2 != null) {
                            arrayList.add(inetAddressToIpAddress2);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                String[] strArr = new String[arrayList.size()];
                int i = 0;
                for (String str : arrayList) {
                    strArr[i] = str;
                    i++;
                }
                return strArr;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public int adjustAudioMixingVolume(int i) {
        return setParameter("che.audio.set_file_as_playout_volume", i);
    }

    public int enableAudioQualityIndication(boolean z) {
        return setParameter("rtc.audio_quality_indication", z);
    }

    public int enableInEarMonitoring(boolean z) {
        return setParameter("che.audio.headset.monitoring", z);
    }

    public int enableTransportQualityIndication(boolean z) {
        return setParameter("rtc.transport_quality_indication", z);
    }

    public String getParameters(String str) {
        return nativeGetParameters(this.mNativeHandle, str);
    }

    public int muteAllRemoteAudioStreams(boolean z) {
        return setParameter("rtc.audio.mute_peers", z);
    }

    public int pauseEffect(int i) {
        return setParameter("che.audio.game_pause_effect", i);
    }

    public int resumeEffect(int i) {
        return setParameter("che.audio.game_resume_effect", i);
    }

    public int setApiCallMode(int i) {
        return nativeSetApiCallMode(this.mNativeHandle, i);
    }

    public int setAudioMixingPosition(int i) {
        return setParameter("che.audio.mixing.file.position", i);
    }

    public int setCameraAutoFocusFaceModeEnabled(boolean z) {
        return setParameter("che.video.camera.face_detection", z);
    }

    public int setCameraTorchOn(boolean z) {
        return setParameter("che.video.camera.flash", z);
    }

    public int setCameraZoomFactor(float f2) {
        return setParameter("che.video.camera.zoom", (double) f2);
    }

    public int setEffectsVolume(double d2) {
        return setParameter("che.audio.game_set_effects_volume", d2);
    }

    public int setEncryptionMode(String str) {
        return setParameter("rtc.encryption.mode", str);
    }

    public int setEncryptionSecret(String str) {
        return nativeSetEncryptionSecret(this.mNativeHandle, str);
    }

    public int setInEarMonitoringVolume(int i) {
        return setParameter("che.audio.headset.monitoring.parameter", i);
    }

    public int setLocalRenderMode(int i) {
        return setRemoteRenderMode(0, i);
    }

    public int setLogFile(String str) {
        return setParameter("rtc.log_file", str);
    }

    public int setParameters(String str) {
        return nativeSetParameters(this.mNativeHandle, str);
    }

    public int setRemoteDefaultVideoStreamType(int i) {
        return setParameter("rtc.video.set_remote_default_video_stream_type", i);
    }

    public int setSpeakerphoneVolume(int i) {
        return setParameter("che.audio.output.volume", i);
    }

    public int startPlayingStream(String str) {
        return setParameter("rtc.api.video.start_play_stream", str);
    }

    public int stopEffect(int i) {
        return setParameter("che.audio.game_stop_effect", i);
    }

    public int unloadEffect(int i) {
        return setParameter("che.audio.game_unload_effect", i);
    }

    private boolean checkAccessNetworkState(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            return true;
        }
        return false;
    }

    private boolean checkAccessWifiState(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0) {
            return true;
        }
        return false;
    }

    private RtcEngineMessage.MediaAppContext createAppContext(Context context) {
        RtcEngineMessage.MediaAppContext mediaAppContext = new RtcEngineMessage.MediaAppContext();
        mediaAppContext.networkInfo = doGetNetworkInfo(context);
        return mediaAppContext;
    }

    private void onFirstLocalAudioFrame(byte[] bArr) {
        RtcEngineMessage.PFirstLocalAudioFrame pFirstLocalAudioFrame = new RtcEngineMessage.PFirstLocalAudioFrame();
        pFirstLocalAudioFrame.unmarshall(bArr);
        this.mHandler.onFirstLocalAudioFrame(pFirstLocalAudioFrame.elapsed);
    }

    private void onLocalVideoStat(byte[] bArr) {
        RtcEngineMessage.PLocalVideoStat pLocalVideoStat = new RtcEngineMessage.PLocalVideoStat();
        pLocalVideoStat.unmarshall(bArr);
        this.mHandler.onLocalVideoStats(pLocalVideoStat.stats);
    }

    private void sendLogEvent(byte[] bArr) {
        try {
            onLogEvent(0, new String(bArr, "ISO-8859-1"));
        } catch (UnsupportedEncodingException unused) {
        }
    }

    public int configPublisher(PublisherConfiguration publisherConfiguration) {
        if (!publisherConfiguration.validate()) {
            return -2;
        }
        this.mConfiguration = publisherConfiguration;
        return 0;
    }

    public int enableLocalVideoSend(boolean z) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return muteLocalVideoStream(!z);
    }

    public int enableRecap(int i) {
        if (i < 0) {
            i = 0;
        }
        return setParameter("che.audio.recap.interval", i);
    }

    /* access modifiers changed from: protected */
    public ActivityManager getActivityManager(Context context) {
        if (context == null) {
            return null;
        }
        return (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
    }

    /* access modifiers changed from: protected */
    public AudioManager getAudioManager(Context context) {
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public void onAudioRoutingChanged(int i) {
        setParameter("che.audio.output.routing", i);
        if (this.mHandler != null) {
            this.mHandler.onAudioRouteChanged(i);
        }
    }

    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        if (iAudioFrameObserver == null) {
            this.mUseExternalAudioSource = false;
        } else {
            this.mUseExternalAudioSource = true;
        }
        return nativeRegisterAudioFrameObserver(this.mNativeHandle, iAudioFrameObserver);
    }

    public int renewChannelKey(String str) {
        if (str == null) {
            return -2;
        }
        return setParameter("rtc.renew_channel_key", str);
    }

    public int setLocalVoicePitch(double d2) {
        return setParameter("che.audio.game_local_pitch_shift", (int) (d2 * 100.0d));
    }

    public int setLogFilter(int i) {
        return setParameter("rtc.log_filter", i & 2063);
    }

    public int startRecordingService(String str) {
        if (str == null) {
            return -2;
        }
        return setParameter("rtc.api.start_recording_service", str);
    }

    public int stopRecordingService(String str) {
        if (str == null) {
            return -2;
        }
        return setParameter("rtc.api.stop_recording_service", str);
    }

    public int updateSharedContext(android.opengl.EGLContext eGLContext) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return nativeSetEGL14Context(this.mNativeHandle, eGLContext);
    }

    private void checkVoipPermissions(Context context) throws SecurityException {
        checkVoipPermissions(context, "android.permission.INTERNET");
        checkVoipPermissions(context, "android.permission.RECORD_AUDIO");
        checkVoipPermissions(context, "android.permission.MODIFY_AUDIO_SETTINGS");
        if (this.mVideoEnabled && !this.mUseExternalVideoSource) {
            checkVoipPermissions(context, "android.permission.CAMERA");
        }
    }

    private int doCheckPermission(Context context) {
        int i = 1;
        if (this.mChannelProfile == 1) {
            i = this.mClientRole;
        }
        if (checkVoipPermissions(context, i) == 0) {
            return 0;
        }
        Logging.e("RtcEngine", "can't join channel because no permission");
        return -9;
    }

    private RtcEngineMessage.PVideoNetOptions getOptionsByVideoProfile(int i) {
        try {
            byte[] nativeGetOptionsByVideoProfile = nativeGetOptionsByVideoProfile(this.mNativeHandle, i);
            if (nativeGetOptionsByVideoProfile != null) {
                RtcEngineMessage.PVideoNetOptions pVideoNetOptions = new RtcEngineMessage.PVideoNetOptions();
                pVideoNetOptions.unmarshall(nativeGetOptionsByVideoProfile);
                return pVideoNetOptions;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String getSystemProperty(String str) throws Exception {
        Class<?> cls = Class.forName("android.os.SystemProperties");
        return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
    }

    private static String inetAddressToIpAddress(InetAddress inetAddress) {
        if (inetAddress.isLoopbackAddress() || !(inetAddress instanceof Inet4Address)) {
            return null;
        }
        return ((Inet4Address) inetAddress).getHostAddress();
    }

    private void onApiCallExecuted(byte[] bArr) {
        RtcEngineMessage.PApiCallExecuted pApiCallExecuted = new RtcEngineMessage.PApiCallExecuted();
        pApiCallExecuted.unmarshall(bArr);
        this.mHandler.onApiCallExecuted(pApiCallExecuted.api, pApiCallExecuted.error);
    }

    private void onFirstLocalVideoFrame(byte[] bArr) {
        RtcEngineMessage.PFirstLocalVideoFrame pFirstLocalVideoFrame = new RtcEngineMessage.PFirstLocalVideoFrame();
        pFirstLocalVideoFrame.unmarshall(bArr);
        this.mHandler.onFirstLocalVideoFrame(pFirstLocalVideoFrame.width, pFirstLocalVideoFrame.height, pFirstLocalVideoFrame.elapsed);
    }

    private void onFirstRemoteAudioFrame(byte[] bArr) {
        RtcEngineMessage.PFirstRemoteAudioFrame pFirstRemoteAudioFrame = new RtcEngineMessage.PFirstRemoteAudioFrame();
        pFirstRemoteAudioFrame.unmarshall(bArr);
        this.mHandler.onFirstRemoteAudioFrame(pFirstRemoteAudioFrame.uid, pFirstRemoteAudioFrame.elapsed);
    }

    private void onFirstRemoteVideoDecoded(byte[] bArr) {
        RtcEngineMessage.PFirstRemoteVideoDecoded pFirstRemoteVideoDecoded = new RtcEngineMessage.PFirstRemoteVideoDecoded();
        pFirstRemoteVideoDecoded.unmarshall(bArr);
        this.mHandler.onFirstRemoteVideoDecoded(pFirstRemoteVideoDecoded.uid, pFirstRemoteVideoDecoded.width, pFirstRemoteVideoDecoded.height, pFirstRemoteVideoDecoded.elapsed);
    }

    private void onFirstRemoteVideoFrame(byte[] bArr) {
        RtcEngineMessage.PFirstRemoteVideoFrame pFirstRemoteVideoFrame = new RtcEngineMessage.PFirstRemoteVideoFrame();
        pFirstRemoteVideoFrame.unmarshall(bArr);
        this.mHandler.onFirstRemoteVideoFrame(pFirstRemoteVideoFrame.uid, pFirstRemoteVideoFrame.width, pFirstRemoteVideoFrame.height, pFirstRemoteVideoFrame.elapsed);
    }

    private void onRemoteVideoStat(byte[] bArr) {
        RtcEngineMessage.PRemoteVideoStat pRemoteVideoStat = new RtcEngineMessage.PRemoteVideoStat();
        pRemoteVideoStat.unmarshall(bArr);
        if (pRemoteVideoStat.stats.uid != 0) {
            this.mHandler.onRemoteVideoStats(pRemoteVideoStat.stats);
        }
    }

    private void onStreamMessage(byte[] bArr) {
        RtcEngineMessage.PStreamMessage pStreamMessage = new RtcEngineMessage.PStreamMessage();
        pStreamMessage.unmarshall(bArr);
        this.mHandler.onStreamMessage(pStreamMessage.uid, pStreamMessage.streamId, pStreamMessage.payload);
    }

    private void onStreamMessageError(byte[] bArr) {
        RtcEngineMessage.PStreamMessageError pStreamMessageError = new RtcEngineMessage.PStreamMessageError();
        pStreamMessageError.unmarshall(bArr);
        this.mHandler.onStreamMessageError(pStreamMessageError.uid, pStreamMessageError.streamId, pStreamMessageError.error, pStreamMessageError.missed, pStreamMessageError.cached);
    }

    private void onVideoSizeChanged(byte[] bArr) {
        RtcEngineMessage.PVideoSizeChanged pVideoSizeChanged = new RtcEngineMessage.PVideoSizeChanged();
        pVideoSizeChanged.unmarshall(bArr);
        this.mHandler.onVideoSizeChanged(pVideoSizeChanged.uid, pVideoSizeChanged.width, pVideoSizeChanged.height, pVideoSizeChanged.rotation);
    }

    public int adjustPlaybackSignalVolume(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 400) {
            i = 400;
        }
        return setParameter("che.audio.playout.signal.volume", i);
    }

    public int adjustRecordingSignalVolume(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 400) {
            i = 400;
        }
        return setParameter("che.audio.record.signal.volume", i);
    }

    public int enableDualStreamMode(boolean z) {
        return setParameters(String.format("{\"rtc.dual_stream_mode\":%b,\"che.video.enableLowBitRateStream\":%d}", new Object[]{Boolean.valueOf(z), Integer.valueOf(z ? 1 : 0)}));
    }

    public int enableLocalVideoCapture(boolean z) {
        if (!this.mVideoEnabled || this.mUseExternalVideoSource) {
            return -1;
        }
        return setParameter("che.video.local.capture", z);
    }

    public int enableLocalVideoRender(boolean z) {
        if (!this.mVideoEnabled || this.mUseExternalVideoSource) {
            return -1;
        }
        return setParameter("che.video.local.render", z);
    }

    public int enableWebSdkInteroperability(boolean z) {
        return setParameters(String.format("{\"rtc.video.web_h264_interop_enable\":%b,\"che.video.web_h264_interop_enable\":%b}", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z)}));
    }

    public int monitorAudioRouteChange(boolean z) {
        Logging.i("API call monitorAudioRouteChange:" + z);
        this.mMonitorAudioRouting = z;
        return 0;
    }

    @TargetApi(11)
    @Deprecated
    public void monitorBluetoothHeadsetEvent(boolean z) {
        Logging.i("RtcEngine", "enter monitorBluetoothHeadsetEvent:" + z);
    }

    @Deprecated
    public void monitorHeadsetEvent(boolean z) {
        Logging.i("RtcEngine", "enter monitorHeadsetEvent:" + z);
    }

    public int muteAllRemoteVideoStreams(boolean z) {
        if (this.mAudioRoutingController != null) {
            this.mAudioRoutingController.sendEvent(13, z ? 1 : 0);
        }
        return setParameter("rtc.video.mute_peers", z);
    }

    public int muteLocalAudioStream(boolean z) {
        return setParameters(formatString("{\"rtc.audio.mute_me\":%b, \"che.audio.mute_me\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    public void onAudioRoutingError(int i) {
        Logging.i("RtcEngine", "on Audio routing error:" + i);
        if (this.mHandler != null) {
            this.mHandler.onError(i);
        }
    }

    public int setChannelProfile(int i) {
        if (this.mAudioRoutingController == null) {
            return -7;
        }
        this.mChannelProfile = i;
        this.mAudioRoutingController.sendEvent(20, i);
        return setParameter("rtc.channel_profile", i);
    }

    public int setLocalVideoMirrorMode(int i) {
        String str;
        switch (i) {
            case 0:
                str = "default";
                break;
            case 1:
                str = "forceMirror";
                break;
            case 2:
                str = "disableMirror";
                break;
            default:
                return -2;
        }
        return setParameter("che.video.localViewMirrorSetting", str);
    }

    public int setVideoCamera(int i) {
        if (!this.mVideoEnabled || this.mUseExternalVideoSource) {
            return -1;
        }
        this.mCameraIndex = i;
        boolean z = true;
        if (this.mCameraIndex != 1) {
            z = false;
        }
        this.mUsingFrontCamera = z;
        return setParameter("che.video.local.camera_index", i);
    }

    public int setVideoQualityParameters(boolean z) {
        return setParameters(String.format("{\"rtc.video.prefer_frame_rate\":%b,\"che.video.prefer_frame_rate\":%b}", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z)}));
    }

    public int setupRemoteVideo(VideoCanvas videoCanvas) {
        if (!this.mVideoEnabled || videoCanvas == null) {
            return -1;
        }
        return nativeSetupVideoRemote(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode, videoCanvas.uid);
    }

    public int stopRemoteVideo(int i) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return setParameter("che.video.peer.stop_video", ((long) i) & 4294967295L);
    }

    public int updateSharedContext(EGLContext eGLContext) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return nativeSetEGL10Context(this.mNativeHandle, eGLContext);
    }

    private String getAppStorageDir(Context context) {
        if (context != null) {
            if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return "/sdcard/" + context.getApplicationInfo().packageName;
            }
            Logging.w("RtcEngine", "read external storage is not granted");
        }
        return null;
    }

    private static InetAddress intToInetAddress(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }

    public boolean enableHighPerfWifiMode(boolean z) {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return false;
        }
        if (!z) {
            this.mWifiLock = null;
        } else if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") != 0) {
            this.mWifiLock = null;
            return false;
        } else if (this.mWifiLock == null) {
            this.mWifiLock = ((WifiManager) context.getSystemService("wifi")).createWifiLock(3, "agora.voip.lock");
        }
        return true;
    }

    public int enableLocalVideo(boolean z) {
        if (!this.mVideoEnabled) {
            return -7;
        }
        return setParameters(String.format("{\"rtc.video.capture\":%b,\"che.video.local.capture\":%b,\"che.video.local.render\":%b,\"che.video.local.send\":%b}", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z), Boolean.valueOf(z)}));
    }

    public int muteLocalVideoStream(boolean z) {
        if (!this.mVideoEnabled) {
            return -7;
        }
        if (this.mAudioRoutingController != null) {
            this.mAudioRoutingController.sendEvent(12, z ? 1 : 0);
        }
        return setParameters(formatString("{\"rtc.video.mute_me\":%b, \"che.video.local.send\":%b}", Boolean.valueOf(z), Boolean.valueOf(!z)));
    }

    public int setDefaultAudioRoutetoSpeakerphone(boolean z) {
        int i = 1;
        Logging.i(String.format("API call to setDefaultAudioRoutetoSpeakerphone :%b", new Object[]{Boolean.valueOf(z)}));
        if (this.mAudioRoutingController == null) {
            return -7;
        }
        AudioRoutingController audioRoutingController = this.mAudioRoutingController;
        if (z) {
            i = 3;
        }
        audioRoutingController.sendEvent(10, i);
        return 0;
    }

    public int setEnableSpeakerphone(boolean z) {
        Logging.i(String.format("API call to setEnableSpeakerphone to %b", new Object[]{Boolean.valueOf(z)}));
        if (this.mAudioRoutingController == null) {
            return -7;
        }
        this.mAudioRoutingController.sendEvent(11, z ? 1 : 0);
        return 0;
    }

    public int setupLocalVideo(VideoCanvas videoCanvas) {
        if (!this.mVideoEnabled || this.mUseExternalVideoSource) {
            return -1;
        }
        if (videoCanvas != null) {
            this.mUseLocalView = true;
            nativeSetupVideoLocal(this.mNativeHandle, videoCanvas.view, videoCanvas.renderMode);
        } else {
            this.mUseLocalView = false;
            nativeSetupVideoLocal(this.mNativeHandle, null, 1);
        }
        return 0;
    }

    public void updateViewOrientation(int i) {
        int roundOrientation = roundOrientation(i, this.mOrientation);
        if (this.mOrientation != roundOrientation) {
            this.mOrientation = roundOrientation;
            int i2 = this.mOrientation;
            if ((i2 / 90) % 2 != 0) {
                i2 = (i2 + 180) % 360;
            }
            setParameterObject("che.video.view_orientation", formatString("{\"uid\":%d,\"orientation\":%d}", 0, Integer.valueOf(i2 / 90)));
        }
    }

    private void onSpeakersReport(byte[] bArr) {
        if (bArr != null) {
            RtcEngineMessage.PMediaResSpeakersReport pMediaResSpeakersReport = new RtcEngineMessage.PMediaResSpeakersReport();
            pMediaResSpeakersReport.unmarshall(bArr);
            if (pMediaResSpeakersReport.speakers == null || pMediaResSpeakersReport.speakers.length < 0) {
                this.mHandler.onAudioVolumeIndication(null, pMediaResSpeakersReport.mixVolume);
                return;
            }
            IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr = new IRtcEngineEventHandler.AudioVolumeInfo[pMediaResSpeakersReport.speakers.length];
            for (int i = 0; i < pMediaResSpeakersReport.speakers.length; i++) {
                audioVolumeInfoArr[i] = new IRtcEngineEventHandler.AudioVolumeInfo();
                audioVolumeInfoArr[i].uid = pMediaResSpeakersReport.speakers[i].uid;
                audioVolumeInfoArr[i].volume = pMediaResSpeakersReport.speakers[i].volume;
            }
            this.mHandler.onAudioVolumeIndication(audioVolumeInfoArr, pMediaResSpeakersReport.mixVolume);
        }
    }

    public void monitorConnectionEvent(boolean z) {
        if (!z) {
            try {
                Context context = (Context) this.mContext.get();
                if (!(context == null || this.mConnectionBroadcastReceiver == null)) {
                    context.unregisterReceiver(this.mConnectionBroadcastReceiver);
                }
            } catch (IllegalArgumentException unused) {
            }
            this.mConnectionBroadcastReceiver = null;
        } else if (this.mConnectionBroadcastReceiver == null) {
            try {
                this.mConnectionBroadcastReceiver = new ConnectionChangeBroadcastReceiver(this);
                Context context2 = (Context) this.mContext.get();
                if (!(context2 == null || this.mConnectionBroadcastReceiver == null)) {
                    context2.registerReceiver(this.mConnectionBroadcastReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            } catch (Exception e2) {
                Logging.e("RtcEngine", "Unable to create ConnectionChangeBroadcastReceiver, ", e2);
            }
        }
    }

    public int setVideoCompositingLayout(VideoCompositingLayout videoCompositingLayout) {
        if (videoCompositingLayout == null || videoCompositingLayout.regions == null) {
            return -2;
        }
        for (int i = 0; i < videoCompositingLayout.regions.length; i++) {
            if (videoCompositingLayout.regions[i] == null || videoCompositingLayout.regions[i].uid == 0 || videoCompositingLayout.regions[i].width <= 0.0d || videoCompositingLayout.regions[i].height <= 0.0d) {
                return -2;
            }
        }
        return nativeSetVideoCompositingLayout(this.mNativeHandle, new RtcEngineMessage.PVideoCompositingLayout().marshall(videoCompositingLayout));
    }

    public synchronized void udpateRtcStats(RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats) {
        IRtcEngineEventHandler.RtcStats rtcStats = getRtcStats();
        if (rtcStats != null) {
            rtcStats.totalDuration = pMediaResRtcStats.totalDuration;
            rtcStats.txBytes = pMediaResRtcStats.totalTxBytes;
            rtcStats.rxBytes = pMediaResRtcStats.totalRxBytes;
            rtcStats.txKBitRate = pMediaResRtcStats.txKBitRate;
            rtcStats.rxKBitRate = pMediaResRtcStats.rxKBitRate;
            rtcStats.txAudioKBitRate = pMediaResRtcStats.txAudioKBitRate;
            rtcStats.rxAudioKBitRate = pMediaResRtcStats.rxAudioKBitRate;
            rtcStats.txVideoKBitRate = pMediaResRtcStats.txVideoKBitRate;
            rtcStats.rxVideoKBitRate = pMediaResRtcStats.rxVideoKBitRate;
            rtcStats.users = pMediaResRtcStats.users;
            double d2 = (double) pMediaResRtcStats.cpuTotalUsage;
            Double.isNaN(d2);
            rtcStats.cpuTotalUsage = d2 / 100.0d;
            double d3 = (double) pMediaResRtcStats.cpuAppUsage;
            Double.isNaN(d3);
            rtcStats.cpuAppUsage = d3 / 100.0d;
        }
    }

    private void SetDeviceOrientation(int i) {
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastOrientationTs >= 100) {
            double d2 = (double) i;
            Double.isNaN(d2);
            int round = ((int) (Math.round(d2 / 90.0d) * 90)) % 360;
            char c2 = 0;
            int i3 = round - i;
            if (Math.abs(i3) < 20) {
                c2 = 1;
            } else if (Math.abs(i3) < 40) {
                c2 = 2;
            }
            if (round == 0 && i > 180) {
                int i4 = 360 - i;
                if (i4 < 20) {
                    c2 = 1;
                } else if (i4 < 40) {
                    c2 = 2;
                }
            }
            if (c2 > 0) {
                try {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(this.mCameraIndex, cameraInfo);
                    int i5 = cameraInfo.orientation;
                    if (c2 != 1) {
                        round += 5;
                    }
                    if (this.mUsingFrontCamera) {
                        i2 = (((360 - round) % 360) + i5) % 360;
                    } else {
                        i2 = (i5 + round) % 360;
                    }
                    if (i2 != this.mTotalRotation) {
                        setVideoRotateCapturedFrames(i2, round);
                    }
                    this.mTotalRotation = i2;
                } catch (Exception e2) {
                    Logging.e("RtcEngine", "Unable to get camera info, ", e2);
                }
            }
            this.lastOrientationTs = currentTimeMillis;
        }
    }

    private RtcEngineMessage.MediaNetworkInfo doGetNetworkInfo(Context context) {
        String str;
        RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo = new RtcEngineMessage.MediaNetworkInfo();
        if (!checkAccessNetworkState(context)) {
            mediaNetworkInfo.ssid = "";
            mediaNetworkInfo.bssid = "";
            mediaNetworkInfo.rssi = 0;
            mediaNetworkInfo.signalLevel = 0;
            return mediaNetworkInfo;
        }
        String localHost = getLocalHost();
        if (localHost != null) {
            mediaNetworkInfo.localIp4 = localHost;
        }
        NetworkInfo networkInfo = Connectivity.getNetworkInfo(context);
        mediaNetworkInfo.networkType = Connectivity.getNetworkType(networkInfo);
        if (networkInfo != null) {
            mediaNetworkInfo.networkSubtype = networkInfo.getSubtype();
        }
        mediaNetworkInfo.dnsList = Connectivity.getDnsList();
        if (mediaNetworkInfo.networkType == 2) {
            if (!checkAccessWifiState(context)) {
                mediaNetworkInfo.ssid = "";
                mediaNetworkInfo.bssid = "";
                mediaNetworkInfo.rssi = 0;
                mediaNetworkInfo.signalLevel = 0;
                return mediaNetworkInfo;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            DhcpInfo dhcpInfo = wifiManager.getDhcpInfo();
            if (dhcpInfo != null) {
                InetAddress intToInetAddress = intToInetAddress(dhcpInfo.gateway);
                if (intToInetAddress != null) {
                    mediaNetworkInfo.gatewayIp4 = intToInetAddress.getHostAddress();
                }
            }
            WifiInfo connectionInfo = wifiManager.getConnectionInfo();
            if (connectionInfo != null) {
                String bssid = connectionInfo.getBSSID();
                mediaNetworkInfo.ssid = connectionInfo.getSSID().replace("\"", "");
                if (bssid == null) {
                    str = "";
                } else {
                    str = bssid.replace("\"", "");
                }
                mediaNetworkInfo.bssid = str;
                mediaNetworkInfo.rssi = connectionInfo.getRssi();
                mediaNetworkInfo.signalLevel = WifiManager.calculateSignalLevel(mediaNetworkInfo.rssi, 5);
                if (Build.VERSION.SDK_INT >= 21) {
                    int frequency = connectionInfo.getFrequency();
                    if (frequency >= 5000) {
                        mediaNetworkInfo.networkSubtype = BaseLoginOrRegisterActivity.o;
                    } else if (frequency >= 2400) {
                        mediaNetworkInfo.networkSubtype = 100;
                    }
                }
            }
        } else if (this.mPhoneStateLinstner != null) {
            mediaNetworkInfo.rssi = this.mPhoneStateLinstner.getRssi();
            mediaNetworkInfo.signalLevel = this.mPhoneStateLinstner.getLevel();
            mediaNetworkInfo.asu = this.mPhoneStateLinstner.getAsuLevel();
        } else if (context.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            getSignalStrength(context, mediaNetworkInfo);
        }
        return mediaNetworkInfo;
    }

    public boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        AgoraVideoFrame agoraVideoFrame2 = agoraVideoFrame;
        if (agoraVideoFrame2 == null || agoraVideoFrame2.format == 12) {
            return false;
        }
        if (!this.mUseExternalVideoSource || !(agoraVideoFrame2.format == 10 || agoraVideoFrame2.format == 11)) {
            if (agoraVideoFrame2.format > 0 && agoraVideoFrame2.format <= 8) {
                if (deliverFrame(this.mNativeHandle, agoraVideoFrame2.buf, agoraVideoFrame2.stride, agoraVideoFrame2.height, agoraVideoFrame2.cropLeft, agoraVideoFrame2.cropTop, agoraVideoFrame2.cropRight, agoraVideoFrame2.cropBottom, agoraVideoFrame2.rotation, agoraVideoFrame2.timeStamp, agoraVideoFrame2.format) == 0) {
                    return true;
                }
                return false;
            }
        } else if (agoraVideoFrame2.eglContext14 != null) {
            if (updateSharedContext(agoraVideoFrame2.eglContext14) == 0) {
                if (setTextureIdWithMatrix(agoraVideoFrame2.textureID, agoraVideoFrame2.eglContext14, agoraVideoFrame2.format, agoraVideoFrame2.stride, agoraVideoFrame2.height, agoraVideoFrame2.timeStamp, agoraVideoFrame2.transform) == 0) {
                    return true;
                }
                return false;
            }
        } else if (agoraVideoFrame2.eglContext11 != null && updateSharedContext(agoraVideoFrame2.eglContext11) == 0) {
            if (setTextureIdWithMatrix(agoraVideoFrame2.textureID, agoraVideoFrame2.eglContext11, agoraVideoFrame2.format, agoraVideoFrame2.stride, agoraVideoFrame2.height, agoraVideoFrame2.timeStamp, agoraVideoFrame2.transform) == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public int complain(String str, String str2) {
        return nativeComplain(this.mNativeHandle, str, str2);
    }

    public int createDataStream(boolean z, boolean z2) {
        return nativeCreateDataStream(this.mNativeHandle, z, z2);
    }

    public String getParameter(String str, String str2) {
        return nativeGetParameter(this.mNativeHandle, str, str2);
    }

    /* access modifiers changed from: protected */
    public void onEvent(int i, byte[] bArr) {
        try {
            handleEvent(i, bArr);
        } catch (Exception unused) {
        }
    }

    public int sendStreamMessage(int i, byte[] bArr) {
        return nativeSendStreamMessage(this.mNativeHandle, i, bArr);
    }

    public int setProfile(String str, boolean z) {
        return nativeSetProfile(this.mNativeHandle, str, z);
    }

    public int pushExternalAudioFrame(byte[] bArr, long j) {
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, bArr, j, this.mExAudioSampleRate, this.mExAudioChannels);
    }

    private int setParameter(String str, double d2) {
        return setParameters(formatString("{\"%s\":%f}", str, Double.valueOf(d2)));
    }

    private int setParameterObject(String str, String str2) {
        return setParameters(formatString("{\"%s\":%s}", str, str2));
    }

    private int setVideoRotateCapturedFrames(int i, int i2) {
        return setParameterObject("che.video.local.rotate_video", formatString("{\"degree\":%d,\"rotation\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public int preloadEffect(int i, String str) {
        return setParameterObject("che.audio.game_preload_effect", formatString("{\"soundId\":%d,\"filePath\":\"%s\"}", Integer.valueOf(i), str));
    }

    public int setMixedAudioFrameParameters(int i, int i2) {
        return setParameterObject("che.audio.set_mixed_raw_audio_format", formatString("{\"sampleRate\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public int setVideoProfile(int i, boolean z) {
        if (i < 0) {
            return -2;
        }
        return setParameters(formatString("{\"rtc.video.profile\":[%d,%b]}", Integer.valueOf(i), Boolean.valueOf(z)));
    }

    public int setVolumeOfEffect(int i, double d2) {
        return setParameterObject("che.audio.game_adjust_effect_volume", formatString("{\"soundId\":%d,\"gain\":%f}", Integer.valueOf(i), Double.valueOf(d2)));
    }

    public int startAudioRecording(String str, int i) {
        return setParameterObject("che.audio.start_recording", formatString("{\"filePath\":\"%s\", \"quality\":%d}", str, Integer.valueOf(i)));
    }

    private int checkVoipPermissions(Context context, int i) {
        switch (i) {
            case 1:
                try {
                    checkVoipPermissions(context);
                    break;
                } catch (SecurityException e2) {
                    Logging.e("RtcEngine", "Do not have enough permission! ", e2);
                    return -9;
                }
            case 2:
                try {
                    checkVoipPermissions(context, "android.permission.INTERNET");
                    break;
                } catch (SecurityException unused) {
                    Logging.e("RtcEngine", "Do not have Internet permission!");
                    return -9;
                }
            default:
                return -2;
        }
        return 0;
    }

    private void doMonitorSystemEvent(Context context, RtcEngineMessage.MediaAppContext mediaAppContext) {
        if (context != null && mediaAppContext.networkInfo.networkType == 2 && context.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") == 0 && this.mWifiLock != null) {
            this.mWifiLock.acquire();
            Logging.i("RtcEngine", "hp connection mode detected");
        }
    }

    private static int roundOrientation(int i, int i2) {
        boolean z = true;
        if (i2 != -1) {
            int abs = Math.abs(i - i2);
            if (Math.min(abs, 360 - abs) < 45) {
                z = false;
            }
        }
        if (z) {
            return (((i + 45) / 90) * 90) % 360;
        }
        return i2;
    }

    private int setParameter(String str, int i) {
        return setParameters(formatString("{\"%s\":%d}", str, Integer.valueOf(i)));
    }

    public int enableAudioVolumeIndication(int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        return setParameterObject("che.audio.volume_indication", formatString("{\"interval\":%d,\"smooth\":%d}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public int enableRemoteVideo(boolean z, int i) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return setParameterObject("che.video.peer.receive", formatString("{\"enable\":%b, \"uid\":%d}", Boolean.valueOf(z), Long.valueOf(((long) i) & 4294967295L)));
    }

    public int muteRemoteAudioStream(int i, boolean z) {
        return setParameters(formatString("{\"rtc.audio.mute_peer\":{\"uid\":%d,\"mute\":%b}}", Long.valueOf(((long) i) & 4294967295L), Boolean.valueOf(z)));
    }

    public int muteRemoteVideoStream(int i, boolean z) {
        return setParameters(formatString("{\"rtc.video.mute_peer\":{\"uid\":%d,\"mute\":%b}}", Long.valueOf(((long) i) & 4294967295L), Boolean.valueOf(z)));
    }

    public int setAudioProfile(int i, int i2) {
        if (i < 0 || i >= 6 || i2 < 0 || i2 >= 5) {
            return -2;
        }
        return setParameters(formatString("{\"che.audio.profile\":{\"config\":%d,\"scenario\":%d}}", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public int setCameraFocusPointOfInterest(float f2, float f3) {
        return setParameterObject("che.video.camera.focus", formatString("{\"x\":%f,\"y\":%f,\"preview\":%b}", Float.valueOf(f2), Float.valueOf(f3), Boolean.TRUE));
    }

    public int setCameraFocusPositionInPreview(float f2, float f3) {
        return setParameterObject("che.video.camera.focus", formatString("{\"x\":%f,\"y\":%f,,\"preview\":%b}", Float.valueOf(f2), Float.valueOf(f3), Boolean.TRUE));
    }

    public int setRemoteRenderMode(int i, int i2) {
        return setParameterObject("che.video.render_mode", formatString("{\"uid\":%d,\"mode\":%d}", Long.valueOf(((long) i) & 4294967295L), Integer.valueOf(i2)));
    }

    public int setRemoteVideoStreamType(int i, int i2) {
        return setParameters(formatString("{\"rtc.video.set_remote_video_stream\":{\"uid\":%d,\"stream\":%d}}", Long.valueOf(((long) i) & 4294967295L), Integer.valueOf(i2)));
    }

    public void switchView(int i, int i2) {
        setParameterObject("che.video.switch_view_by_uid", formatString("{\"uid1\":%d, \"uid2\":%d}", Long.valueOf(((long) i) & 4294967295L), Long.valueOf(((long) i2) & 4294967295L)));
    }

    private void checkVoipPermissions(Context context, String str) throws SecurityException {
        if (context == null || context.checkCallingOrSelfPermission(str) != 0) {
            throw new SecurityException(str + " is not granted");
        }
    }

    private int setParameter(String str, long j) {
        return setParameters(formatString("{\"%s\":%d}", str, Long.valueOf(j)));
    }

    public int setClientRole(int i, String str) {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return -7;
        }
        if (checkVoipPermissions(context, i) != 0) {
            return -9;
        }
        switch (i) {
            case 1:
            case 2:
                this.mClientRole = i;
                if (str == null) {
                    str = "";
                }
                return setParameterObject("rtc.client_role", formatString("[%d,\"%s\"]", Integer.valueOf(i), str));
            default:
                return -2;
        }
    }

    @TargetApi(17)
    private boolean getSignalStrength(Context context, RtcEngineMessage.MediaNetworkInfo mediaNetworkInfo) {
        if (context == null || Build.VERSION.SDK_INT < 17) {
            this.mMobileType = -1;
            return false;
        }
        List<CellInfo> allCellInfo = ((TelephonyManager) context.getSystemService("phone")).getAllCellInfo();
        if (allCellInfo == null || allCellInfo.isEmpty()) {
            return false;
        }
        CellInfo cellInfo = allCellInfo.get(0);
        if (cellInfo == null) {
            return false;
        }
        try {
            if (this.mMobileType == -1 || this.mMobileType == 0) {
                CellSignalStrengthGsm cellSignalStrength = ((CellInfoGsm) cellInfo).getCellSignalStrength();
                if (cellSignalStrength != null) {
                    this.mMobileType = 0;
                    mediaNetworkInfo.rssi = cellSignalStrength.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength.getLevel();
                    mediaNetworkInfo.asu = cellSignalStrength.getAsuLevel();
                    return true;
                }
            }
        } catch (Exception unused) {
            this.mMobileType = -1;
        }
        try {
            if (this.mMobileType == -1 || this.mMobileType == 1) {
                CellSignalStrengthCdma cellSignalStrength2 = ((CellInfoCdma) cellInfo).getCellSignalStrength();
                if (cellSignalStrength2 != null) {
                    this.mMobileType = 1;
                    mediaNetworkInfo.rssi = cellSignalStrength2.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength2.getLevel();
                    mediaNetworkInfo.asu = cellSignalStrength2.getAsuLevel();
                    return true;
                }
            }
        } catch (Exception unused2) {
            this.mMobileType = -1;
        }
        try {
            if (this.mMobileType == -1 || this.mMobileType == 2) {
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                CellSignalStrengthWcdma cellSignalStrength3 = ((CellInfoWcdma) cellInfo).getCellSignalStrength();
                if (cellSignalStrength3 != null) {
                    this.mMobileType = 2;
                    mediaNetworkInfo.rssi = cellSignalStrength3.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength3.getLevel();
                    mediaNetworkInfo.asu = cellSignalStrength3.getAsuLevel();
                    return true;
                }
            }
        } catch (Exception unused3) {
            this.mMobileType = -1;
        }
        try {
            if (this.mMobileType == -1 || this.mMobileType == 3) {
                CellSignalStrengthLte cellSignalStrength4 = ((CellInfoLte) cellInfo).getCellSignalStrength();
                if (cellSignalStrength4 != null) {
                    this.mMobileType = 3;
                    mediaNetworkInfo.rssi = cellSignalStrength4.getDbm();
                    mediaNetworkInfo.signalLevel = cellSignalStrength4.getLevel();
                    mediaNetworkInfo.asu = cellSignalStrength4.getAsuLevel();
                    return true;
                }
            }
        } catch (Exception unused4) {
            this.mMobileType = -1;
        }
        return false;
    }

    private int setParameter(String str, String str2) {
        return setParameters(formatString("{\"%s\":\"%s\"}", str, str2));
    }

    private int setParameter(String str, boolean z) {
        return setParameters(formatString("{\"%s\":%b}", str, Boolean.valueOf(z)));
    }

    /* access modifiers changed from: protected */
    public void handleEvent(int i, byte[] bArr) {
        if (this.mHandler != null) {
            switch (i) {
                case 100:
                    sendLogEvent(bArr);
                    return;
                case BaseLoginOrRegisterActivity.o:
                    RtcEngineMessage.PError pError = new RtcEngineMessage.PError();
                    pError.unmarshall(bArr);
                    this.mHandler.onError(pError.err);
                    return;
                case 102:
                    RtcEngineMessage.PError pError2 = new RtcEngineMessage.PError();
                    pError2.unmarshall(bArr);
                    this.mHandler.onWarning(pError2.err);
                    return;
                default:
                    switch (i) {
                        case 1005:
                            this.mHandler.onCameraReady();
                            return;
                        case 1006:
                            monitorAudioRouting();
                            this.mHandler.onMediaEngineStartCallSuccess();
                            return;
                        case 1007:
                            this.mHandler.onVideoStopped();
                            return;
                        default:
                            switch (i) {
                                case 1101:
                                    RtcEngineMessage.PMediaResTransportQuality pMediaResTransportQuality = new RtcEngineMessage.PMediaResTransportQuality();
                                    pMediaResTransportQuality.unmarshall(bArr);
                                    if (pMediaResTransportQuality.isAudio) {
                                        getExHandler().onAudioTransportQuality(pMediaResTransportQuality.peer_uid, pMediaResTransportQuality.bitrate, pMediaResTransportQuality.delay, pMediaResTransportQuality.lost);
                                        return;
                                    } else {
                                        getExHandler().onVideoTransportQuality(pMediaResTransportQuality.peer_uid, pMediaResTransportQuality.bitrate, pMediaResTransportQuality.delay, pMediaResTransportQuality.lost);
                                        return;
                                    }
                                case 1102:
                                    RtcEngineMessage.PMediaResAudioQuality pMediaResAudioQuality = new RtcEngineMessage.PMediaResAudioQuality();
                                    pMediaResAudioQuality.unmarshall(bArr);
                                    this.mHandler.onAudioQuality(pMediaResAudioQuality.peer_uid, pMediaResAudioQuality.quality, pMediaResAudioQuality.delay, pMediaResAudioQuality.lost);
                                    return;
                                default:
                                    switch (i) {
                                        case 1108:
                                            this.mHandler.onRequestChannelKey();
                                            return;
                                        case 1109:
                                            RtcEngineMessage.PClientRoleChanged pClientRoleChanged = new RtcEngineMessage.PClientRoleChanged();
                                            pClientRoleChanged.unmarshall(bArr);
                                            this.mHandler.onClientRoleChanged(pClientRoleChanged.oldRole, pClientRoleChanged.newRole);
                                            return;
                                        default:
                                            switch (i) {
                                                case 13006:
                                                    Context context = (Context) this.mContext.get();
                                                    if (context != null) {
                                                        getAudioManager(context).setMode(0);
                                                    }
                                                    RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats = new RtcEngineMessage.PMediaResRtcStats();
                                                    pMediaResRtcStats.unmarshall(bArr);
                                                    udpateRtcStats(pMediaResRtcStats);
                                                    this.mHandler.onLeaveChannel(getRtcStats());
                                                    return;
                                                case 13007:
                                                    RtcEngineMessage.PMediaResNetworkQuality pMediaResNetworkQuality = new RtcEngineMessage.PMediaResNetworkQuality();
                                                    pMediaResNetworkQuality.unmarshall(bArr);
                                                    this.mHandler.onNetworkQuality(pMediaResNetworkQuality.uid, pMediaResNetworkQuality.txQuality, pMediaResNetworkQuality.rxQuality);
                                                    return;
                                                case 13008:
                                                    RtcEngineMessage.PMediaResUserOfflineEvent pMediaResUserOfflineEvent = new RtcEngineMessage.PMediaResUserOfflineEvent();
                                                    pMediaResUserOfflineEvent.unmarshall(bArr);
                                                    this.mHandler.onUserOffline(pMediaResUserOfflineEvent.uid, pMediaResUserOfflineEvent.reason);
                                                    return;
                                                default:
                                                    switch (i) {
                                                        case 13013:
                                                            RtcEngineMessage.PMediaResUserJoinedEvent pMediaResUserJoinedEvent = new RtcEngineMessage.PMediaResUserJoinedEvent();
                                                            pMediaResUserJoinedEvent.unmarshall(bArr);
                                                            this.mHandler.onUserJoined(pMediaResUserJoinedEvent.uid, pMediaResUserJoinedEvent.elapsed);
                                                            return;
                                                        case 13014:
                                                            RtcEngineMessage.PMediaResUserState pMediaResUserState = new RtcEngineMessage.PMediaResUserState();
                                                            pMediaResUserState.unmarshall(bArr);
                                                            this.mHandler.onUserMuteAudio(pMediaResUserState.uid, pMediaResUserState.state);
                                                            return;
                                                        case 13015:
                                                            RtcEngineMessage.PMediaResUserState pMediaResUserState2 = new RtcEngineMessage.PMediaResUserState();
                                                            pMediaResUserState2.unmarshall(bArr);
                                                            this.mHandler.onUserMuteVideo(pMediaResUserState2.uid, pMediaResUserState2.state);
                                                            return;
                                                        case 13016:
                                                            RtcEngineMessage.PMediaResUserState pMediaResUserState3 = new RtcEngineMessage.PMediaResUserState();
                                                            pMediaResUserState3.unmarshall(bArr);
                                                            this.mHandler.onUserEnableVideo(pMediaResUserState3.uid, pMediaResUserState3.state);
                                                            return;
                                                        case 13017:
                                                            RtcEngineMessage.PMediaResLastmileQuality pMediaResLastmileQuality = new RtcEngineMessage.PMediaResLastmileQuality();
                                                            pMediaResLastmileQuality.unmarshall(bArr);
                                                            this.mHandler.onLastmileQuality(pMediaResLastmileQuality.quality);
                                                            return;
                                                        case 13018:
                                                            RtcEngineMessage.PMediaResAudioEffectFinished pMediaResAudioEffectFinished = new RtcEngineMessage.PMediaResAudioEffectFinished();
                                                            pMediaResAudioEffectFinished.unmarshall(bArr);
                                                            this.mHandler.onAudioEffectFinished(pMediaResAudioEffectFinished.soundId);
                                                            break;
                                                        case 13019:
                                                            RtcEngineMessage.PMediaResUserState pMediaResUserState4 = new RtcEngineMessage.PMediaResUserState();
                                                            pMediaResUserState4.unmarshall(bArr);
                                                            this.mHandler.onUserEnableLocalVideo(pMediaResUserState4.uid, pMediaResUserState4.state);
                                                            return;
                                                        default:
                                                            switch (i) {
                                                                case 14000:
                                                                    getExHandler().onRecap(bArr);
                                                                    return;
                                                                case 14001:
                                                                    onSpeakersReport(bArr);
                                                                    return;
                                                                case 14002:
                                                                    onFirstRemoteVideoFrame(bArr);
                                                                    return;
                                                                case 14003:
                                                                    onLocalVideoStat(bArr);
                                                                    return;
                                                                case 14004:
                                                                    onRemoteVideoStat(bArr);
                                                                    return;
                                                                case 14005:
                                                                    onFirstLocalVideoFrame(bArr);
                                                                    return;
                                                                default:
                                                                    switch (i) {
                                                                        case 14007:
                                                                            onFirstRemoteVideoDecoded(bArr);
                                                                            return;
                                                                        case 14008:
                                                                            this.mHandler.onConnectionLost();
                                                                            return;
                                                                        case 14009:
                                                                            onStreamMessage(bArr);
                                                                            return;
                                                                        case 14010:
                                                                            this.mHandler.onConnectionInterrupted();
                                                                            return;
                                                                        case 14011:
                                                                            RtcEngineMessage.PRecordingServiceStatus pRecordingServiceStatus = new RtcEngineMessage.PRecordingServiceStatus();
                                                                            pRecordingServiceStatus.unmarshall(bArr);
                                                                            this.mHandler.onRefreshRecordingServiceStatus(pRecordingServiceStatus.status);
                                                                            return;
                                                                        case 14012:
                                                                            onStreamMessageError(bArr);
                                                                            return;
                                                                        case 14013:
                                                                            onVideoSizeChanged(bArr);
                                                                            return;
                                                                        case 14014:
                                                                            onFirstLocalAudioFrame(bArr);
                                                                            return;
                                                                        case 14015:
                                                                            onFirstRemoteAudioFrame(bArr);
                                                                            return;
                                                                        case 14016:
                                                                            RtcEngineMessage.PActiveSpeaker pActiveSpeaker = new RtcEngineMessage.PActiveSpeaker();
                                                                            pActiveSpeaker.unmarshall(bArr);
                                                                            this.mHandler.onActiveSpeaker(pActiveSpeaker.uid);
                                                                            return;
                                                                        default:
                                                                            switch (i) {
                                                                                case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR:
                                                                                    this.mHandler.onMediaEngineLoadSuccess();
                                                                                    return;
                                                                                case 1104:
                                                                                    RtcEngineMessage.PMediaEngineEvent pMediaEngineEvent = new RtcEngineMessage.PMediaEngineEvent();
                                                                                    pMediaEngineEvent.unmarshall(bArr);
                                                                                    int i2 = pMediaEngineEvent.code;
                                                                                    if (i2 == 10) {
                                                                                        this.mHandler.onAudioMixingFinished();
                                                                                        break;
                                                                                    } else {
                                                                                        switch (i2) {
                                                                                            case 20:
                                                                                            case 21:
                                                                                            case 22:
                                                                                            case 23:
                                                                                                if (this.mAudioRoutingController != null) {
                                                                                                    this.mAudioRoutingController.sendEvent(21, pMediaEngineEvent.code);
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                        }
                                                                                        return;
                                                                                    }
                                                                                case 1106:
                                                                                    onApiCallExecuted(bArr);
                                                                                    return;
                                                                                case 10001:
                                                                                    new RtcEngineMessage.MediaResSetupTime().unmarshall(bArr);
                                                                                    return;
                                                                                case 13001:
                                                                                    RtcEngineMessage.PMediaResJoinMedia pMediaResJoinMedia = new RtcEngineMessage.PMediaResJoinMedia();
                                                                                    pMediaResJoinMedia.unmarshall(bArr);
                                                                                    if (pMediaResJoinMedia.firstSuccess) {
                                                                                        this.mHandler.onJoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                                                                                        return;
                                                                                    } else {
                                                                                        this.mHandler.onRejoinChannelSuccess(pMediaResJoinMedia.channel, pMediaResJoinMedia.uid, pMediaResJoinMedia.elapsed);
                                                                                        return;
                                                                                    }
                                                                                case 13010:
                                                                                    RtcEngineMessage.PMediaResRtcStats pMediaResRtcStats2 = new RtcEngineMessage.PMediaResRtcStats();
                                                                                    pMediaResRtcStats2.unmarshall(bArr);
                                                                                    udpateRtcStats(pMediaResRtcStats2);
                                                                                    this.mHandler.onRtcStats(getRtcStats());
                                                                                    return;
                                                                                case 14019:
                                                                                    this.mHandler.onConnectionBanned();
                                                                                    return;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                    return;
                                            }
                                    }
                            }
                    }
            }
        }
    }

    public void reinitialize(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) {
        this.mHandler = iRtcEngineEventHandler;
    }

    public int rate(String str, int i, String str2) {
        return nativeRate(this.mNativeHandle, str, i, str2);
    }

    public int createTexture(int i, int i2, AGLThread.SurfaceTextureListener surfaceTextureListener) {
        if (this.mAGLThread != null) {
            return -19;
        }
        try {
            this.mAGLThread = new AGLThread(i, i2, surfaceTextureListener) {
                public void drawFrame(int i, float[] fArr) {
                    if (RtcEngineImpl.this.mRequestSoftwareEncoder) {
                        RtcEngineImpl.this.mAGLThread.switchToSoftware();
                        return;
                    }
                    if (i != 0) {
                        AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
                        agoraVideoFrame.timeStamp = System.currentTimeMillis();
                        agoraVideoFrame.stride = this.width;
                        agoraVideoFrame.height = this.height;
                        agoraVideoFrame.format = 11;
                        agoraVideoFrame.textureID = i;
                        agoraVideoFrame.eglContext14 = getEglContext();
                        agoraVideoFrame.transform = fArr;
                        RtcEngineImpl.this.pushExternalVideoFrame(agoraVideoFrame);
                    }
                }

                public void drawFrame(ByteBuffer byteBuffer, int i, float[] fArr) {
                    AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
                    agoraVideoFrame.timeStamp = System.currentTimeMillis();
                    agoraVideoFrame.stride = this.width;
                    agoraVideoFrame.height = this.height;
                    agoraVideoFrame.format = 4;
                    agoraVideoFrame.rotation = i;
                    agoraVideoFrame.transform = fArr;
                    agoraVideoFrame.buf = byteBuffer.array();
                    RtcEngineImpl.this.pushExternalVideoFrame(agoraVideoFrame);
                }
            };
            this.mAGLThread.start();
            return 0;
        } catch (Exception unused) {
            Logging.e("failed to create surfacetexture");
            return -1;
        }
    }

    public void setExternalVideoSource(boolean z, boolean z2, boolean z3) {
        this.mUseExternalVideoSource = z;
        if (z2) {
            if (z) {
                setParameter("che.video.enable_external_texture_input", true);
            } else {
                setParameter("che.video.enable_external_texture_input", false);
                Logging.w("setVideoSource: on Android, texture mode cannot be disabled once enabled.");
            }
            this.mRequestSoftwareEncoder = false;
            return;
        }
        setExtVideoSource(this.mNativeHandle, z ? 1 : 0, z3 ? 1 : 0);
    }

    public int setHighQualityAudioParameters(boolean z, boolean z2, boolean z3) {
        return setParameterObject("che.audio.codec.hq", formatString("{\"fullband\":%b,\"stereo\":%b,\"fullBitrate\":%b}", Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)));
    }

    public int setExternalAudioSource(boolean z, int i, int i2) {
        this.mExAudioSampleRate = i;
        this.mExAudioChannels = i2;
        if (z) {
            return setParameters(formatString("{\"che.audio.external_capture\":%b,\"che.audio.external_capture.push\":%b,\"che.audio.set_capture_raw_audio_format\":{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d}}", Boolean.valueOf(z), Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), 2));
        }
        return setParameters(formatString("{\"che.audio.external_capture\":%b,\"che.audio.external_capture\":%b}", Boolean.valueOf(z), Boolean.valueOf(z)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RtcEngineImpl(android.content.Context r10, java.lang.String r11, io.agora.rtc.IRtcEngineEventHandler r12) throws java.lang.Exception {
        /*
            r9 = this;
            r9.<init>()
            r0 = 1000(0x3e8, float:1.401E-42)
            r9.mTotalRotation = r0
            r0 = -1
            r9.mMobileType = r0
            r1 = 2
            r9.mClientRole = r1
            r1 = 1
            r9.mMonitorAudioRouting = r1
            r9.mOrientation = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r10)
            r9.mContext = r0
            r9.mHandler = r12
            int r12 = r9.selectFrontCamera()
            r9.mCameraIndex = r12
            java.lang.String r6 = r9.getAppStorageDir(r10)
            java.io.File r12 = r10.getCacheDir()
            java.lang.String r7 = r12.getAbsolutePath()
            android.content.pm.ApplicationInfo r12 = r10.getApplicationInfo()
            java.lang.String r8 = r12.nativeLibraryDir
            java.lang.String r5 = io.agora.rtc.internal.DeviceUtils.getDeviceId()
            java.lang.String r12 = "RtcEngine"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Initialize Agora Rtc Engine device '"
            r0.<init>(r2)
            r0.append(r5)
            java.lang.String r2 = "' dir '"
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            io.agora.rtc.internal.Logging.i(r12, r0)
            r2 = r9
            r3 = r10
            r4 = r11
            long r11 = r2.nativeObjectInit(r3, r4, r5, r6, r7, r8)
            r9.mNativeHandle = r11
            java.lang.String r11 = android.os.Build.SERIAL
            java.lang.String r12 = ""
            java.lang.String r0 = ""
            java.lang.String r2 = "ro.hardware"
            java.lang.String r2 = getSystemProperty(r2)     // Catch:{ Exception -> 0x006e }
            java.lang.String r12 = "os.arch"
            java.lang.String r12 = java.lang.System.getProperty(r12)     // Catch:{ Exception -> 0x006f }
            goto L_0x0070
        L_0x006e:
            r2 = r12
        L_0x006f:
            r12 = r0
        L_0x0070:
            java.lang.String r0 = "RtcEngine"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Device info: serial = "
            r3.<init>(r4)
            r3.append(r11)
            java.lang.String r4 = ", hardware = "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", arch = "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            io.agora.rtc.internal.Logging.i(r0, r3)
            java.lang.String r11 = r11.toLowerCase()
            java.lang.String r0 = "unknown"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x00b7
            java.lang.String r11 = r2.toLowerCase()
            java.lang.String r0 = "intel"
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x00b7
            java.lang.String r11 = r12.toLowerCase()
            java.lang.String r12 = "i686"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00bc
        L_0x00b7:
            java.lang.String r11 = "che.android_simulator"
            r9.setParameter((java.lang.String) r11, (boolean) r1)
        L_0x00bc:
            io.agora.rtc.internal.AudioRoutingController r11 = new io.agora.rtc.internal.AudioRoutingController
            r11.<init>(r10, r9)
            r9.mAudioRoutingController = r11
            io.agora.rtc.internal.AudioRoutingController r11 = r9.mAudioRoutingController
            int r11 = r11.initialize()
            if (r11 == 0) goto L_0x00d2
            java.lang.String r11 = "RtcEngine"
            java.lang.String r12 = "failed to init audio routing controller"
            io.agora.rtc.internal.Logging.e(r11, r12)
        L_0x00d2:
            r9.monitorConnectionEvent(r1)
            io.agora.rtc.internal.RtcEngineImpl$AgoraPhoneStateListener r11 = new io.agora.rtc.internal.RtcEngineImpl$AgoraPhoneStateListener     // Catch:{ Exception -> 0x00ed }
            r12 = 0
            r11.<init>()     // Catch:{ Exception -> 0x00ed }
            r9.mPhoneStateLinstner = r11     // Catch:{ Exception -> 0x00ed }
            java.lang.String r11 = "phone"
            java.lang.Object r10 = r10.getSystemService(r11)     // Catch:{ Exception -> 0x00ed }
            android.telephony.TelephonyManager r10 = (android.telephony.TelephonyManager) r10     // Catch:{ Exception -> 0x00ed }
            io.agora.rtc.internal.RtcEngineImpl$AgoraPhoneStateListener r11 = r9.mPhoneStateLinstner     // Catch:{ Exception -> 0x00ed }
            r12 = 288(0x120, float:4.04E-43)
            r10.listen(r11, r12)     // Catch:{ Exception -> 0x00ed }
            return
        L_0x00ed:
            r10 = move-exception
            java.lang.String r11 = "RtcEngine"
            java.lang.String r12 = "Unable to create PhoneStateListener, "
            io.agora.rtc.internal.Logging.e(r11, r12, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.RtcEngineImpl.<init>(android.content.Context, java.lang.String, io.agora.rtc.IRtcEngineEventHandler):void");
    }

    public String makeQualityReportUrl(String str, int i, int i2, int i3) {
        return nativeMakeQualityReportUrl(this.mNativeHandle, str, i, i2, i3);
    }

    public int setVideoProfileEx(int i, int i2, int i3, int i4) {
        return nativeSetVideoProfileEx(this.mNativeHandle, i, i2, i3, i4);
    }

    public int setPlaybackAudioFrameParameters(int i, int i2, int i3, int i4) {
        return setParameterObject("che.audio.set_render_raw_audio_format", formatString("{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public int setRecordingAudioFrameParameters(int i, int i2, int i3, int i4) {
        return setParameterObject("che.audio.set_capture_raw_audio_format", formatString("{\"sampleRate\":%d,\"channelCnt\":%d,\"mode\":%d,\"samplesPerCall\":%d}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        return setParameterObject("che.audio.start_file_as_playout", formatString("{\"filePath\":\"%s\", \"loopback\":%b, \"replace\":%b, \"cycle\":%d}", str, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i)));
    }

    public int joinChannel(String str, String str2, String str3, int i) {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return -7;
        }
        RtcEngineMessage.MediaAppContext createAppContext = createAppContext(context);
        doMonitorSystemEvent(context, createAppContext);
        doCheckPermission(context);
        if (this.mVideoEnabled && !this.mUseLocalView) {
            try {
                if (this.mOrientationListener == null) {
                    this.mOrientationListener = new OrientationEventListener(context, 2) {
                        public void onOrientationChanged(int i) {
                            if (RtcEngineImpl.this.mVideoEnabled && !RtcEngineImpl.this.mUseLocalView && i != -1) {
                                RtcEngineImpl.this.updateViewOrientation(i);
                            }
                        }
                    };
                }
                this.mOrientationListener.enable();
            } catch (Exception e2) {
                Logging.e("RtcEngine", "Unable to create OrientationEventListener, ", e2);
            }
            setVideoCamera(this.mCameraIndex);
        }
        if (this.mConfiguration != null && this.mConfiguration.validate()) {
            if (str3 != null) {
                Logging.w("RtcEngine", "override optionalInfo by publisherConfiguration");
            }
            str3 = this.mConfiguration.toJsonString();
        }
        return nativeJoinChannel(this.mNativeHandle, createAppContext.marshall(), str, str2, str3, i);
    }

    public int setTextureId(int i, android.opengl.EGLContext eGLContext, int i2, int i3, long j) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, 11, i2, i3, j, sMatrix);
    }

    public int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j) {
        if (!this.mVideoEnabled) {
            return -1;
        }
        return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, 10, i2, i3, j, sMatrix);
    }

    public int playEffect(int i, String str, boolean z, double d2, double d3, double d4) {
        Object[] objArr = new Object[6];
        objArr[0] = Integer.valueOf(i);
        int i2 = 1;
        objArr[1] = str;
        if (!z) {
            i2 = 0;
        }
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Double.valueOf(d2);
        objArr[4] = Double.valueOf(d3);
        objArr[5] = Double.valueOf(d4);
        return setParameterObject("che.audio.game_play_effect", formatString("{\"soundId\":%d,\"filePath\":\"%s\",\"loop\":%d,\"pitch\":%f,\"pan\":%f,\"gain\":%f}", objArr));
    }

    public int setTextureIdWithMatrix(int i, android.opengl.EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        float[] fArr2 = fArr;
        if (!this.mVideoEnabled) {
            return -1;
        }
        if (fArr2 == null) {
            return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, sMatrix);
        } else if (fArr2.length < 16) {
            return -2;
        } else {
            return nativeSetEGL14TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, fArr);
        }
    }

    public int setTextureIdWithMatrix(int i, EGLContext eGLContext, int i2, int i3, int i4, long j, float[] fArr) {
        float[] fArr2 = fArr;
        if (!this.mVideoEnabled) {
            return -1;
        }
        if (fArr2 == null) {
            return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, sMatrix);
        } else if (fArr2.length < 16) {
            return -2;
        } else {
            return nativeSetEGL10TextureId(this.mNativeHandle, i, eGLContext, i2, i3, i4, j, fArr);
        }
    }
}
