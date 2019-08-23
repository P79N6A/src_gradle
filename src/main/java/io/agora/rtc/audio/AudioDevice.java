package io.agora.rtc.audio;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTrack;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import android.os.Process;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.agora.rtc.internal.Logging;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantLock;

public class AudioDevice {
    final String TAG = "AudioDevice Java";
    private final int _MaxRecPlay10msBlocks = 1;
    private AudioManager _audioManager;
    private AudioRecord _audioRecord;
    private AudioTrack _audioTrack;
    private int _bufferedPlaySamples = 0;
    private int _bufferedRecSamples = 0;
    private Context _context;
    private boolean _doPlayInit = true;
    private boolean _doRecInit = true;
    private boolean _isPlaying = false;
    private boolean _isRecording = false;
    private int _playBufSize = 0;
    private ByteBuffer _playBuffer;
    private int _playChannel = 0;
    private final ReentrantLock _playLock = new ReentrantLock();
    private int _playPosition = 0;
    private int _playPreviousUnderrun = 0;
    private int _playbackRestartCount = 0;
    private int _playbackSampleRate = 0;
    private ByteBuffer _recBuffer;
    private final ReentrantLock _recLock = new ReentrantLock();
    private int _recordBufSize = 0;
    private int _recordChannel = 0;
    private int _recordRestartCount = 0;
    private int _recordSampleRate = 0;
    private int _recordSource = 0;
    private int _streamType = 0;
    private byte[] _tempBufPlay;
    private byte[] _tempBufRec;
    private AcousticEchoCanceler aec = null;
    private boolean useBuiltInAEC = false;

    private int GetUnderrunCountOnLowerThanNougat() {
        return -1;
    }

    private boolean BuiltInAECIsEnabled() {
        return this.useBuiltInAEC;
    }

    private int GetUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            return GetUnderrunCountOnNougatOrHigher();
        }
        return GetUnderrunCountOnLowerThanNougat();
    }

    private int StartPlayback() {
        try {
            this._audioTrack.play();
            this._isPlaying = true;
            return 0;
        } catch (IllegalStateException unused) {
            return -1;
        }
    }

    private boolean BuiltInAECIsAvailable() {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                return AcousticEchoCanceler.isAvailable();
            }
        } catch (ExceptionInInitializerError e2) {
            Logging.e("AudioDevice Java", "Unable to create AEC object ", e2);
        } catch (Exception unused) {
            Logging.e("AudioDevice Java", "Unable to query Audio Effect: Acoustic Echo Cancellation");
        }
        return false;
    }

    private int StartRecording() {
        try {
            this._audioRecord.startRecording();
            this._isRecording = true;
            return 0;
        } catch (IllegalStateException e2) {
            Logging.e("AudioDevice Java", "failed to startRecording", e2);
            return -1;
        } catch (Exception e3) {
            Logging.e("AudioDevice Java", "failed to startRecording Exception", e3);
            return -2;
        }
    }

    private int GetAudioMode() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            return this._audioManager.getMode();
        }
        Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
        return -1;
    }

    private int GetNativeSampleRate() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        int i = 44100;
        if (this._audioManager == null) {
            Logging.w("AudioDevice Java", "Could not set audio mode - no audio manager");
            return 44100;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            String property = this._audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            if (property != null) {
                i = Integer.parseInt(property);
            }
        }
        return i;
    }

    private int GetPlayoutMaxVolume() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            return this._audioManager.getStreamMaxVolume(this._streamType);
        }
        return -1;
    }

    private int GetPlayoutVolume() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager != null) {
            return this._audioManager.getStreamVolume(this._streamType);
        }
        return -1;
    }

    @TargetApi(24)
    private int GetUnderrunCountOnNougatOrHigher() {
        int i = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            int underrunCount = this._audioTrack.getUnderrunCount();
            int i2 = underrunCount - this._playPreviousUnderrun;
            if (i2 >= 0) {
                i = i2;
            }
            this._playPreviousUnderrun = underrunCount;
            if (i > 0) {
                Logging.d("AudioDevice Java", "Android AudioTrack underrun count: " + i);
            }
        }
        return i;
    }

    AudioDevice() {
        try {
            this._playBuffer = ByteBuffer.allocateDirect(1920);
            this._recBuffer = ByteBuffer.allocateDirect(1920);
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "failed to allocate bytebuffer", e2);
        }
        this._tempBufPlay = new byte[1920];
        this._tempBufRec = new byte[1920];
    }

    private int QuerySpeakerStatus() {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            Logging.e("AudioDevice Java", "Could not get audio routing - no audio manager");
            return -1;
        } else if (this._audioManager.isSpeakerphoneOn()) {
            return 3;
        } else {
            if (this._audioManager.isBluetoothScoOn()) {
                return 5;
            }
            if (this._audioManager.isWiredHeadsetOn()) {
                return 0;
            }
            return 1;
        }
    }

    private int StopPlayback() {
        this._playLock.lock();
        try {
            if (this._audioTrack.getPlayState() == 3) {
                this._audioTrack.stop();
                this._audioTrack.flush();
            }
            this._audioTrack.release();
            this._audioTrack = null;
            this._doPlayInit = true;
            this._playLock.unlock();
            this._isPlaying = false;
            return 0;
        } catch (IllegalStateException e2) {
            Logging.e("AudioDevice Java", "Unable to stop playback: ", e2);
            this._doPlayInit = true;
            this._playLock.unlock();
            return -1;
        } catch (Throwable th) {
            this._doPlayInit = true;
            this._playLock.unlock();
            throw th;
        }
    }

    private int StopRecording() {
        this._recLock.lock();
        try {
            if (this._audioRecord.getRecordingState() == 3) {
                this._audioRecord.stop();
            }
            if (this.aec != null) {
                this.aec.release();
                this.aec = null;
            }
            this._audioRecord.release();
            this._audioRecord = null;
            this._doRecInit = true;
            this._recLock.unlock();
            this._isRecording = false;
            return 0;
        } catch (IllegalStateException e2) {
            Logging.e("AudioDevice Java", "Unable to stop recording: ", e2);
            this._doRecInit = true;
            this._recLock.unlock();
            return -1;
        } catch (Throwable th) {
            this._doRecInit = true;
            this._recLock.unlock();
            throw th;
        }
    }

    private boolean EnableBuiltInAEC(boolean z) {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        this.useBuiltInAEC = z;
        if (this.aec != null) {
            if (this.aec.setEnabled(z) != 0) {
                Logging.e("AudioDevice Java", "AcousticEchoCanceler.setEnabled failed");
                return false;
            }
            Logging.e("AudioDevice Java", "AcousticEchoCanceler.getEnabled: " + this.aec.getEnabled());
        }
        return true;
    }

    private int SetPlayoutSpeaker(boolean z) {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
            return -1;
        }
        this._audioManager.setSpeakerphoneOn(z);
        return 0;
    }

    private int SetPlayoutVolume(int i) {
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            return -1;
        }
        int streamMaxVolume = this._audioManager.getStreamMaxVolume(this._streamType);
        if (i < 255) {
            streamMaxVolume = (i * streamMaxVolume) / 255;
        }
        this._audioManager.setStreamVolume(this._streamType, streamMaxVolume, 0);
        return 0;
    }

    private int CheckAudioStatus(int i) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 24) {
            int i3 = -1;
            if (this._audioManager == null) {
                if (this._context != null) {
                    this._audioManager = (AudioManager) this._context.getSystemService("audio");
                } else {
                    Logging.e("AudioDevice Java", "CheckAudioStatus error");
                    return -1;
                }
            }
            if (i == 0) {
                if (this._audioManager != null) {
                    if (this._audioRecord != null) {
                        i3 = this._audioRecord.getAudioSessionId();
                    }
                    for (AudioRecordingConfiguration clientAudioSessionId : this._audioManager.getActiveRecordingConfigurations()) {
                        if (clientAudioSessionId.getClientAudioSessionId() != i3) {
                            i2 = 1033;
                        }
                    }
                } else {
                    Logging.e("AudioDevice Java", "CheckAudioStatus unkonwn error");
                    return -1;
                }
            }
        }
        return i2;
    }

    private int PlayAudio(int i) {
        int i2;
        this._playLock.lock();
        try {
            if (this._audioTrack == null) {
                this._playLock.unlock();
                return -2;
            }
            int i3 = 0;
            if (this._doPlayInit) {
                Process.setThreadPriority(-19);
                this._doPlayInit = false;
            }
            this._playBuffer.get(this._tempBufPlay);
            int write = this._audioTrack.write(this._tempBufPlay, 0, i);
            this._playBuffer.rewind();
            this._bufferedPlaySamples += write >> 1;
            int playbackHeadPosition = this._audioTrack.getPlaybackHeadPosition() * this._playChannel;
            if (playbackHeadPosition < this._playPosition) {
                this._playPosition = 0;
            }
            this._bufferedPlaySamples -= playbackHeadPosition - this._playPosition;
            this._playPosition = playbackHeadPosition;
            if (!this._isRecording) {
                i3 = this._bufferedPlaySamples;
            }
            if (write == i) {
                this._playLock.unlock();
                return i3;
            } else if (this._playbackRestartCount > 20) {
                this._playLock.unlock();
                return write;
            } else {
                Logging.e("AudioDevice Java", "Error writing AudioTrack! Restart AudioTrack " + this._playbackRestartCount);
                this._playbackRestartCount = this._playbackRestartCount + 1;
                this._audioTrack.stop();
                this._audioTrack.release();
                this._audioTrack = null;
                int i4 = this._streamType;
                int i5 = this._playbackSampleRate;
                if (this._playChannel == 2) {
                    i2 = 12;
                } else {
                    i2 = 4;
                }
                AudioTrack audioTrack = new AudioTrack(i4, i5, i2, 2, this._playBufSize, 1);
                this._audioTrack = audioTrack;
                this._audioTrack.play();
                this._playLock.unlock();
                return write;
            }
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "Set play thread priority failed: ", e2);
        } catch (Throwable th) {
            this._playLock.unlock();
            throw th;
        }
    }

    private int RecordAudio(int i) {
        int i2;
        this._recLock.lock();
        int i3 = this._bufferedPlaySamples;
        try {
            if (this._audioRecord == null) {
                this._recLock.unlock();
                return -4;
            }
            if (this._doRecInit) {
                try {
                    Process.setThreadPriority(-19);
                } catch (Exception e2) {
                    Logging.e("AudioDevice Java", "Set rec thread priority failed: ", e2);
                }
                this._doRecInit = false;
            }
            this._recBuffer.rewind();
            int read = this._audioRecord.read(this._tempBufRec, 0, i);
            this._recBuffer.put(this._tempBufRec);
            if (read != i) {
                if (this._recordRestartCount % 10 == 0) {
                    Logging.e("AudioDevice Java", "Error reading AudioRecord! AudioRecord.read returns " + read);
                }
                this._recordRestartCount++;
                this._audioRecord.stop();
                this._audioRecord.release();
                this._audioRecord = null;
                int i4 = this._recordSource;
                int i5 = this._recordSampleRate;
                if (this._recordChannel == 2) {
                    i2 = 12;
                } else {
                    i2 = 16;
                }
                AudioRecord audioRecord = new AudioRecord(i4, i5, i2, 2, this._recordBufSize);
                this._audioRecord = audioRecord;
                this._audioRecord.startRecording();
                this._recLock.unlock();
                return read;
            }
            this._recLock.unlock();
            return i3;
        } catch (Exception e3) {
            i3 = -10;
            Logging.e("AudioDevice Java", "RecordAudio try failed: ", e3);
        } catch (Throwable th) {
            this._recLock.unlock();
            throw th;
        }
    }

    private int SetAudioMode(int i) {
        int i2;
        if (this._audioManager == null && this._context != null) {
            this._audioManager = (AudioManager) this._context.getSystemService("audio");
        }
        if (this._audioManager == null) {
            Logging.e("AudioDevice Java", "Could not change audio routing - no audio manager");
            return -1;
        }
        int streamMaxVolume = this._audioManager.getStreamMaxVolume(3);
        int streamVolume = this._audioManager.getStreamVolume(3);
        int streamMaxVolume2 = this._audioManager.getStreamMaxVolume(0);
        int streamVolume2 = this._audioManager.getStreamVolume(0);
        int i3 = streamMaxVolume - streamMaxVolume2;
        double d2 = (double) streamMaxVolume2;
        double d3 = (double) streamMaxVolume;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        if (this._audioManager.getMode() == i) {
            return 0;
        }
        if (this._isPlaying) {
            Logging.e("AudioDevice Java", "_audioManager.getMode() = " + this._audioManager.getMode() + " target mode = " + i + "factorX = " + i3 + "mMediaMaxVolume=" + streamMaxVolume + "mCommMaxVolume=" + streamMaxVolume2 + "mCurrMediaVolume=" + streamVolume + "mCurrCommVolume=" + streamVolume2 + "delta" + d4);
            if (i == 3) {
                if (i3 < 12) {
                    i2 = streamVolume - i3;
                    if (i2 <= 0) {
                        i2 = 1;
                    }
                } else {
                    double d5 = (double) streamVolume;
                    Double.isNaN(d5);
                    i2 = (int) ((d5 * d4) + 0.5d);
                }
                if (i2 <= 0) {
                    i2 = 1;
                }
                Logging.d("[Java AudioDevice] set voice call vol = " + i2);
                this._audioManager.setStreamVolume(0, i2, 0);
            } else if (i == 0) {
                if (i3 < 12) {
                    int i4 = streamVolume2 + i3;
                    if (i4 < streamMaxVolume) {
                        streamMaxVolume = i4;
                    }
                } else {
                    double d6 = (double) streamVolume2;
                    Double.isNaN(d6);
                    streamMaxVolume = (int) ((d6 / d4) + 0.5d);
                }
                if (streamMaxVolume <= 0) {
                    streamMaxVolume = 1;
                }
                this._audioManager.setStreamVolume(3, streamMaxVolume, 0);
                Logging.d("[Java AudioDevice] set music vol = " + streamMaxVolume);
            }
        }
        switch (i) {
            case 0:
                this._audioManager.setMode(0);
                break;
            case 1:
                this._audioManager.setMode(1);
                break;
            case 2:
                this._audioManager.setMode(2);
                break;
            case 3:
                this._audioManager.setMode(3);
                break;
            default:
                try {
                    this._audioManager.setMode(0);
                    break;
                } catch (Exception unused) {
                    Logging.e("AudioDevice Java", "set audio mode failed! ");
                    break;
                }
        }
        return 0;
    }

    private int InitRecording(int i, int i2, int i3) {
        int i4;
        int i5;
        if (i3 == 2) {
            i4 = 12;
        } else {
            i4 = 16;
        }
        int minBufferSize = AudioRecord.getMinBufferSize(i2, i4, 2);
        Logging.d("AudioDevice Java", "Java minimum recording buffer size is " + minBufferSize);
        int i6 = minBufferSize * 2;
        this._bufferedRecSamples = (i2 * 5) / 200;
        if (this.aec != null) {
            this.aec.release();
            this.aec = null;
        }
        if (this._audioRecord != null) {
            this._audioRecord.release();
            this._audioRecord = null;
        }
        try {
            if (i3 == 2) {
                i5 = 12;
            } else {
                i5 = 16;
            }
            AudioRecord audioRecord = new AudioRecord(i, i2, i5, 2, i6);
            this._audioRecord = audioRecord;
            if (this._audioRecord.getState() != 1) {
                Logging.e("AudioDevice Java", "Java recording not initialized " + i2);
                return -2;
            }
            this._recordSampleRate = i2;
            this._recordChannel = i3;
            this._recordSource = i;
            this._recordBufSize = i6;
            this._recordRestartCount = 0;
            Logging.d("AudioDevice Java", "Java recording sample rate set to " + i2);
            Logging.d("AudioDevice Java", "AcousticEchoCanceler.isAvailable: " + BuiltInAECIsAvailable());
            if (!BuiltInAECIsAvailable()) {
                return this._bufferedRecSamples;
            }
            this.aec = AcousticEchoCanceler.create(this._audioRecord.getAudioSessionId());
            if (this.aec == null) {
                Logging.e("AudioDevice Java", "AcousticEchoCanceler.create failed");
            } else {
                AudioEffect.Descriptor descriptor = this.aec.getDescriptor();
                Logging.d("AudioDevice Java", "AcousticEchoCanceler name: " + descriptor.name + ", implementor: " + descriptor.implementor + ", uuid: " + descriptor.uuid);
                EnableBuiltInAEC(this.useBuiltInAEC);
            }
            return this._bufferedRecSamples;
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "Unable to new AudioRecord: ", e2);
            return -1;
        }
    }

    private int InitPlayback(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        int i10 = i4;
        this._streamType = i3;
        if (i9 == 2) {
            i5 = 12;
        } else {
            i5 = 4;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i, i5, 2);
        Logging.d("AudioDevice Java", "Java minimum playback buffer size is " + minBufferSize + ", profiledMiniOutBufferSize is " + i10);
        if (minBufferSize < 6000) {
            minBufferSize *= 2;
        }
        if (minBufferSize < i10) {
            i6 = i10;
        } else {
            i6 = minBufferSize;
        }
        this._bufferedPlaySamples = 0;
        Logging.d("AudioDevice Java", "Java playback buffer size is " + i6 + ", duration is " + (i6 / (((i8 / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) * i9) * 2)) + " ms");
        if (this._audioTrack != null) {
            this._audioTrack.release();
            this._audioTrack = null;
        }
        try {
            int i11 = this._streamType;
            if (i9 == 2) {
                i7 = 12;
            } else {
                i7 = 4;
            }
            AudioTrack audioTrack = new AudioTrack(i11, i, i7, 2, i6, 1);
            this._audioTrack = audioTrack;
            this._playbackSampleRate = i8;
            this._playChannel = i9;
            this._playBufSize = i6;
            this._playbackRestartCount = 0;
            if (this._audioTrack.getState() != 1) {
                Logging.e("AudioDevice Java", "Java playback not initialized " + i);
                return -1;
            }
            Logging.d("AudioDevice Java", "Java play sample rate is set to " + i);
            if (this._audioManager == null && this._context != null) {
                this._audioManager = (AudioManager) this._context.getSystemService("audio");
            }
            if (this._audioManager == null) {
                return 0;
            }
            return this._audioManager.getStreamMaxVolume(this._streamType);
        } catch (Exception e2) {
            Logging.e("AudioDevice Java", "Unable to new AudioTrack: ", e2);
            return -1;
        }
    }
}
