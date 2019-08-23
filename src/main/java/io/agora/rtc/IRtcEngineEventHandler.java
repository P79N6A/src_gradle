package io.agora.rtc;

public abstract class IRtcEngineEventHandler {

    public static class AudioVolumeInfo {
        public int uid;
        public int volume;
    }

    public static class ClientRole {
    }

    public static class ErrorCode {
    }

    public static class LocalVideoStats {
        public int sentBitrate;
        public int sentFrameRate;
    }

    public static class Quality {
    }

    public static class RemoteVideoStats {
        public int delay;
        public int height;
        public int receivedBitrate;
        public int receivedFrameRate;
        public int rxStreamType;
        public int uid;
        public int width;
    }

    public static class RtcStats {
        public double cpuAppUsage;
        public double cpuTotalUsage;
        public int rxAudioKBitRate;
        public int rxBytes;
        public int rxKBitRate;
        public int rxVideoKBitRate;
        public int totalDuration;
        public int txAudioKBitRate;
        public int txBytes;
        public int txKBitRate;
        public int txVideoKBitRate;
        public int users;
    }

    public static class UserOfflineReason {
    }

    public static class VideoProfile {
    }

    public static class WarnCode {
    }

    public void onActiveSpeaker(int i) {
    }

    public void onApiCallExecuted(String str, int i) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioQuality(int i, int i2, short s, short s2) {
    }

    public void onAudioRouteChanged(int i) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onCameraReady() {
    }

    public void onClientRoleChanged(int i, int i2) {
    }

    public void onConnectionBanned() {
    }

    public void onConnectionInterrupted() {
    }

    public void onConnectionLost() {
    }

    public void onError(int i) {
    }

    public void onFirstLocalAudioFrame(int i) {
    }

    public void onFirstLocalVideoFrame(int i, int i2, int i3) {
    }

    public void onFirstRemoteAudioFrame(int i, int i2) {
    }

    public void onFirstRemoteVideoDecoded(int i, int i2, int i3, int i4) {
    }

    public void onFirstRemoteVideoFrame(int i, int i2, int i3, int i4) {
    }

    public void onJoinChannelSuccess(String str, int i, int i2) {
    }

    public void onLastmileQuality(int i) {
    }

    public void onLeaveChannel(RtcStats rtcStats) {
    }

    @Deprecated
    public void onLocalVideoStat(int i, int i2) {
    }

    public void onLocalVideoStats(LocalVideoStats localVideoStats) {
    }

    public void onMediaEngineLoadSuccess() {
    }

    public void onMediaEngineStartCallSuccess() {
    }

    public void onNetworkQuality(int i, int i2, int i3) {
    }

    public void onRefreshRecordingServiceStatus(int i) {
    }

    public void onRejoinChannelSuccess(String str, int i, int i2) {
    }

    @Deprecated
    public void onRemoteVideoStat(int i, int i2, int i3, int i4) {
    }

    public void onRemoteVideoStats(RemoteVideoStats remoteVideoStats) {
    }

    public void onRequestChannelKey() {
    }

    public void onRtcStats(RtcStats rtcStats) {
    }

    public void onStreamMessage(int i, int i2, byte[] bArr) {
    }

    public void onStreamMessageError(int i, int i2, int i3, int i4, int i5) {
    }

    public void onUserEnableLocalVideo(int i, boolean z) {
    }

    public void onUserEnableVideo(int i, boolean z) {
    }

    public void onUserJoined(int i, int i2) {
    }

    public void onUserMuteAudio(int i, boolean z) {
    }

    public void onUserMuteVideo(int i, boolean z) {
    }

    public void onUserOffline(int i, int i2) {
    }

    public void onVideoSizeChanged(int i, int i2, int i3, int i4) {
    }

    public void onVideoStopped() {
    }

    public void onWarning(int i) {
    }
}
