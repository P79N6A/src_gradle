package io.agora.rtc.internal;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;

public class AudioRoutingController {
    private final Runnable bluetoothTimeoutRunnable = new Runnable() {
        public void run() {
            AudioRoutingController.this.bluetoothTimeout();
        }
    };
    public BluetoothAdapter mBTAdapter;
    public BluetoothHeadset mBTHeadset;
    private BluetoothProfile.ServiceListener mBTHeadsetListener;
    private BTHeadsetBroadcastReceiver mBTHeadsetReceiver;
    public int mBtScoState = 3;
    public int mChannelProfile = 1;
    private WeakReference<Context> mContext;
    public int mCurrentRouting = -1;
    public int mDefaultRouting = -1;
    public int mEngineRole = -1;
    private EventHandler mEventHandler;
    public int mForceSpeakerphone = -1;
    private HeadsetBroadcastReceiver mHeadsetReceiver;
    public int mHeadsetType = -1;
    public boolean mIsBTHeadsetPlugged;
    public boolean mIsBTScoStarted;
    public boolean mIsWiredHeadsetPlugged;
    private WeakReference<AudioRoutingListener> mListener;
    public boolean mMuteLocal;
    public boolean mMuteRemotes;
    public boolean mPhoneInCall;
    public int mScoConnectionAttemps;
    private int mSpeakerCommVolume = -1;
    public ControllerState mState;
    public boolean mVideoDisabled = true;

    public interface AudioRoutingListener {
        void onAudioRoutingChanged(int i);

        void onAudioRoutingError(int i);
    }

    class BTHeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        public boolean getRegistered() {
            return this.isRegistered;
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }

        private BTHeadsetBroadcastReceiver() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00f0, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                r9 = this;
                java.lang.String r10 = r11.getAction()
                java.lang.String r0 = "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED"
                boolean r0 = r10.equals(r0)
                r1 = 4194304(0x400000, float:5.877472E-39)
                r2 = 2097152(0x200000, float:2.938736E-39)
                r3 = 1
                r4 = 0
                r5 = 2
                r6 = -99
                if (r0 == 0) goto L_0x00f1
                java.lang.String r10 = "android.bluetooth.profile.extra.STATE"
                int r10 = r11.getIntExtra(r10, r6)
                java.lang.String r0 = "android.bluetooth.profile.extra.PREVIOUS_STATE"
                int r0 = r11.getIntExtra(r0, r6)
                java.lang.String r6 = "AudioRoute"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                java.lang.String r8 = "BT ACTION_CONNECTION_STATE_CHANGED prev "
                r7.<init>(r8)
                r7.append(r0)
                java.lang.String r0 = ", "
                r7.append(r0)
                r7.append(r10)
                java.lang.String r0 = r7.toString()
                io.agora.rtc.internal.Logging.d(r6, r0)
                java.lang.String r0 = "android.bluetooth.device.extra.DEVICE"
                android.os.Parcelable r11 = r11.getParcelableExtra(r0)
                android.bluetooth.BluetoothDevice r11 = (android.bluetooth.BluetoothDevice) r11
                switch(r10) {
                    case 0: goto L_0x00d1;
                    case 1: goto L_0x00b7;
                    case 2: goto L_0x007e;
                    case 3: goto L_0x0064;
                    default: goto L_0x0047;
                }
            L_0x0047:
                java.lang.String r0 = "AudioRoute"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Bluetooth device "
                r1.<init>(r2)
                r1.append(r11)
                java.lang.String r11 = " unknown event, state="
                r1.append(r11)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                io.agora.rtc.internal.Logging.i(r0, r10)
                goto L_0x00f0
            L_0x0064:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " disconnecting"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                goto L_0x027c
            L_0x007e:
                if (r11 == 0) goto L_0x00f0
                android.bluetooth.BluetoothClass r10 = r11.getBluetoothClass()
                boolean r10 = r10.hasService(r2)
                if (r10 != 0) goto L_0x0094
                android.bluetooth.BluetoothClass r10 = r11.getBluetoothClass()
                boolean r10 = r10.hasService(r1)
                if (r10 == 0) goto L_0x00f0
            L_0x0094:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " connected"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.mScoConnectionAttemps = r4
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.sendEvent(r5, r3)
                goto L_0x027c
            L_0x00b7:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " connecting"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                goto L_0x027c
            L_0x00d1:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " disconnected"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.sendEvent(r5, r4)
                goto L_0x027c
            L_0x00f0:
                return
            L_0x00f1:
                java.lang.String r0 = "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED"
                boolean r0 = r10.equals(r0)
                if (r0 == 0) goto L_0x0195
                java.lang.String r10 = "android.bluetooth.profile.extra.STATE"
                int r10 = r11.getIntExtra(r10, r6)
                java.lang.String r0 = "android.bluetooth.profile.extra.PREVIOUS_STATE"
                int r0 = r11.getIntExtra(r0, r6)
                java.lang.String r1 = "AudioRoute"
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "BT ACTION_AUDIO_STATE_CHANGED prev "
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r0 = ", "
                r2.append(r0)
                r2.append(r10)
                java.lang.String r0 = r2.toString()
                io.agora.rtc.internal.Logging.d(r1, r0)
                java.lang.String r0 = "android.bluetooth.device.extra.DEVICE"
                android.os.Parcelable r11 = r11.getParcelableExtra(r0)
                android.bluetooth.BluetoothDevice r11 = (android.bluetooth.BluetoothDevice) r11
                switch(r10) {
                    case 10: goto L_0x017b;
                    case 11: goto L_0x0161;
                    case 12: goto L_0x0147;
                    default: goto L_0x012b;
                }
            L_0x012b:
                java.lang.String r0 = "AudioRoute"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Bluetooth audio device "
                r1.<init>(r2)
                r1.append(r11)
                java.lang.String r11 = " event, state="
                r1.append(r11)
                r1.append(r10)
                java.lang.String r10 = r1.toString()
                io.agora.rtc.internal.Logging.i(r0, r10)
                return
            L_0x0147:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth audio device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " connected"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                goto L_0x027c
            L_0x0161:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth audio device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " connecting"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                goto L_0x027c
            L_0x017b:
                java.lang.String r10 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth audio device "
                r0.<init>(r1)
                r0.append(r11)
                java.lang.String r11 = " disconnected"
                r0.append(r11)
                java.lang.String r11 = r0.toString()
                io.agora.rtc.internal.Logging.i(r10, r11)
                goto L_0x027c
            L_0x0195:
                java.lang.String r0 = "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"
                boolean r0 = r10.equals(r0)
                if (r0 == 0) goto L_0x0238
                java.lang.String r10 = "android.media.extra.SCO_AUDIO_STATE"
                int r10 = r11.getIntExtra(r10, r6)
                java.lang.String r0 = "android.media.extra.SCO_AUDIO_PREVIOUS_STATE"
                int r11 = r11.getIntExtra(r0, r6)
                java.lang.String r0 = "AudioRoute"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                java.lang.String r6 = "BT ACTION_SCO_AUDIO_STATE_UPDATED prev "
                r5.<init>(r6)
                r5.append(r11)
                java.lang.String r11 = ", "
                r5.append(r11)
                r5.append(r10)
                java.lang.String r11 = r5.toString()
                io.agora.rtc.internal.Logging.d(r0, r11)
                r11 = 3
                switch(r10) {
                    case -1: goto L_0x0230;
                    case 0: goto L_0x0223;
                    case 1: goto L_0x01e4;
                    case 2: goto L_0x01dc;
                    default: goto L_0x01c8;
                }
            L_0x01c8:
                java.lang.String r11 = "AudioRoute"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bluetooth SCO device unknown event, state="
                r0.<init>(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                io.agora.rtc.internal.Logging.i(r11, r10)
                return
            L_0x01dc:
                java.lang.String r10 = "AudioRoute"
                java.lang.String r11 = "Bluetooth SCO device connecting"
                io.agora.rtc.internal.Logging.i(r10, r11)
                return
            L_0x01e4:
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                android.bluetooth.BluetoothAdapter r10 = r10.mBTAdapter
                java.util.Set r10 = r10.getBondedDevices()
                java.util.Iterator r10 = r10.iterator()
            L_0x01f0:
                boolean r0 = r10.hasNext()
                if (r0 == 0) goto L_0x0222
                java.lang.Object r0 = r10.next()
                android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
                android.bluetooth.BluetoothClass r4 = r0.getBluetoothClass()
                boolean r4 = r4.hasService(r2)
                if (r4 != 0) goto L_0x0210
                android.bluetooth.BluetoothClass r0 = r0.getBluetoothClass()
                boolean r0 = r0.hasService(r1)
                if (r0 == 0) goto L_0x01f0
            L_0x0210:
                java.lang.String r10 = "AudioRoute"
                java.lang.String r0 = "Bluetooth SCO device connected"
                io.agora.rtc.internal.Logging.i(r10, r0)
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.cancelTimer()
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.sendEvent(r11, r3)
                goto L_0x027c
            L_0x0222:
                return
            L_0x0223:
                java.lang.String r10 = "AudioRoute"
                java.lang.String r0 = "Bluetooth SCO device disconnected"
                io.agora.rtc.internal.Logging.i(r10, r0)
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.sendEvent(r11, r4)
                return
            L_0x0230:
                java.lang.String r10 = "AudioRoute"
                java.lang.String r11 = "Bluetooth SCO device error"
                io.agora.rtc.internal.Logging.i(r10, r11)
                return
            L_0x0238:
                java.lang.String r0 = "android.bluetooth.adapter.action.STATE_CHANGED"
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L_0x027c
                java.lang.String r10 = "android.bluetooth.adapter.extra.STATE"
                int r10 = r11.getIntExtra(r10, r6)
                java.lang.String r0 = "android.bluetooth.adapter.extra.PREVIOUS_STATE"
                int r11 = r11.getIntExtra(r0, r6)
                java.lang.String r0 = "AudioRoute"
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "BluetoothAdapter.ACTION_STATE_CHANGED prev "
                r1.<init>(r2)
                r1.append(r11)
                java.lang.String r11 = ", "
                r1.append(r11)
                r1.append(r10)
                java.lang.String r11 = r1.toString()
                io.agora.rtc.internal.Logging.d(r0, r11)
                r11 = 10
                if (r10 == r11) goto L_0x0276
                r11 = 12
                if (r10 == r11) goto L_0x0270
                goto L_0x027c
            L_0x0270:
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.sendEvent(r5, r3)
                goto L_0x027c
            L_0x0276:
                io.agora.rtc.internal.AudioRoutingController r10 = io.agora.rtc.internal.AudioRoutingController.this
                r10.sendEvent(r5, r4)
                return
            L_0x027c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.AudioRoutingController.BTHeadsetBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    abstract class ControllerBaseState implements ControllerState {
        public int getState() {
            return 0;
        }

        private ControllerBaseState() {
        }

        public void setState(int i) {
            if (i == getState()) {
                Logging.i("AudioRoute", "setState: state not changed!");
                return;
            }
            AudioRoutingController.this.mState = AudioRoutingController.this.changeState(i);
        }

        public void onEvent(int i, int i2) {
            boolean z = false;
            switch (i) {
                case 1:
                    AudioRoutingController.this.mHeadsetType = i2;
                    AudioRoutingController audioRoutingController = AudioRoutingController.this;
                    if (i2 >= 0) {
                        z = true;
                    }
                    audioRoutingController.mIsWiredHeadsetPlugged = z;
                    return;
                case 2:
                    AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                    if (i2 == 1) {
                        z = true;
                    }
                    audioRoutingController2.mIsBTHeadsetPlugged = z;
                    return;
                case 10:
                    AudioRoutingController.this.mDefaultRouting = i2;
                    Logging.i("AudioRoute", "User set default routing to:" + AudioRoutingController.this.getAudioRouteDesc(AudioRoutingController.this.mDefaultRouting));
                    return;
                case SearchNilInfo.HIT_TYPE_SENSITIVE:
                    AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                    if (i2 > 0) {
                        z = true;
                    }
                    audioRoutingController3.mMuteLocal = z;
                    return;
                case 13:
                    AudioRoutingController audioRoutingController4 = AudioRoutingController.this;
                    if (i2 > 0) {
                        z = true;
                    }
                    audioRoutingController4.mMuteRemotes = z;
                    return;
                case 14:
                    AudioRoutingController audioRoutingController5 = AudioRoutingController.this;
                    if (i2 > 0) {
                        z = true;
                    }
                    audioRoutingController5.mVideoDisabled = z;
                    return;
                case 20:
                    AudioRoutingController.this.mChannelProfile = i2;
                    return;
                case 21:
                    AudioRoutingController.this.mEngineRole = i2;
                    return;
                case 22:
                    AudioRoutingController audioRoutingController6 = AudioRoutingController.this;
                    if (i2 > 0) {
                        z = true;
                    }
                    audioRoutingController6.mPhoneInCall = z;
                    break;
            }
        }
    }

    class ControllerErrorState extends ControllerBaseState {
        public int getState() {
            return 4;
        }

        private ControllerErrorState() {
            super();
        }
    }

    class ControllerStartState extends ControllerBaseState {
        public int getState() {
            return 1;
        }

        public ControllerStartState() {
            super();
            if (AudioRoutingController.this.mDefaultRouting == -1) {
                if (AudioRoutingController.this.mChannelProfile != 0 || !AudioRoutingController.this.isAudioOnly()) {
                    AudioRoutingController.this.mDefaultRouting = 3;
                } else {
                    AudioRoutingController.this.mDefaultRouting = 1;
                }
            }
            AudioRoutingController.this.resetAudioRouting();
            Logging.i("AudioRoute", "Monitor start: default routing: " + r4.getAudioRouteDesc(r4.mDefaultRouting) + ", current routing: " + r4.getAudioRouteDesc(r4.mCurrentRouting));
        }

        public void onEvent(int i, int i2) {
            int i3;
            Logging.d("AudioRoute", "StartState: onEvent: " + i + ", info: " + i2);
            if (i != 11) {
                boolean z = false;
                switch (i) {
                    case 1:
                        AudioRoutingController.this.mHeadsetType = i2;
                        AudioRoutingController audioRoutingController = AudioRoutingController.this;
                        if (i2 >= 0) {
                            z = true;
                        }
                        audioRoutingController.mIsWiredHeadsetPlugged = z;
                        if (!AudioRoutingController.this.mPhoneInCall && !AudioRoutingController.this.mIsBTHeadsetPlugged) {
                            if (!AudioRoutingController.this.mIsWiredHeadsetPlugged || AudioRoutingController.this.mCurrentRouting == i2) {
                                AudioRoutingController.this.resetAudioRouting();
                                return;
                            } else {
                                AudioRoutingController.this.doSetAudioOutputRouting(i2);
                                return;
                            }
                        } else {
                            return;
                        }
                    case 2:
                        if (i2 != 0 || AudioRoutingController.this.mIsBTHeadsetPlugged) {
                            AudioRoutingController audioRoutingController2 = AudioRoutingController.this;
                            if (i2 == 1) {
                                z = true;
                            }
                            audioRoutingController2.mIsBTHeadsetPlugged = z;
                            if (!AudioRoutingController.this.mPhoneInCall) {
                                if (AudioRoutingController.this.mIsBTHeadsetPlugged) {
                                    AudioRoutingController.this.doSetAudioOutputRouting(5);
                                    return;
                                } else {
                                    AudioRoutingController.this.resetAudioRouting();
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 3:
                        AudioRoutingController audioRoutingController3 = AudioRoutingController.this;
                        if (i2 == 1) {
                            i3 = 1;
                        } else {
                            i3 = 2;
                        }
                        audioRoutingController3.mBtScoState = i3;
                        if (!AudioRoutingController.this.mPhoneInCall) {
                            AudioRoutingController.this.getAudioManager();
                            AudioRoutingController audioRoutingController4 = AudioRoutingController.this;
                            if (i2 == 1) {
                                z = true;
                            }
                            audioRoutingController4.checkBtScoState(z);
                            return;
                        }
                        return;
                    default:
                        switch (i) {
                            case 21:
                                AudioRoutingController.this.mEngineRole = i2;
                                if (!AudioRoutingController.this.mPhoneInCall) {
                                    AudioRoutingController.this.updateBluetoothSco(AudioRoutingController.this.mCurrentRouting);
                                    return;
                                }
                                break;
                            case 22:
                                Logging.i("AudioRoute", "phone state changed: " + i2);
                                AudioRoutingController audioRoutingController5 = AudioRoutingController.this;
                                if (i2 > 0) {
                                    z = true;
                                }
                                audioRoutingController5.mPhoneInCall = z;
                                if (i2 == 0) {
                                    AudioRoutingController.this.resetAudioRouting();
                                    return;
                                } else {
                                    AudioRoutingController.this.mCurrentRouting = -1;
                                    return;
                                }
                            default:
                                super.onEvent(i, i2);
                                break;
                        }
                }
            } else {
                AudioRoutingController.this.mForceSpeakerphone = i2;
                if (!AudioRoutingController.this.mPhoneInCall) {
                    AudioRoutingController.this.resetAudioRouting();
                }
            }
        }
    }

    interface ControllerState {
        int getState();

        void onEvent(int i, int i2);

        void setState(int i);
    }

    class ControllerStopState extends ControllerBaseState {
        public int getState() {
            return 2;
        }

        public ControllerStopState() {
            super();
            AudioRoutingController.this.cancelTimer();
            if (AudioRoutingController.this.mIsBTScoStarted) {
                AudioRoutingController.this.mIsBTScoStarted = false;
                AudioRoutingController.this.stopBtSco();
            }
            AudioRoutingController.this.mForceSpeakerphone = -1;
            AudioRoutingController.this.mCurrentRouting = -1;
            AudioRoutingController.this.mDefaultRouting = -1;
            AudioRoutingController.this.mScoConnectionAttemps = 0;
            Logging.i("AudioRoute", "Monitor stopped");
        }

        public void onEvent(int i, int i2) {
            boolean z;
            int i3;
            Logging.d("AudioRoute", "StopState: onEvent: " + i + ", info: " + i2);
            try {
                AudioManager audioManager = AudioRoutingController.this.getAudioManager();
                if (i != 11) {
                    super.onEvent(i, i2);
                    return;
                }
                if (i2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                audioManager.setSpeakerphoneOn(z);
                AudioRoutingController audioRoutingController = AudioRoutingController.this;
                if (i2 == 1) {
                    i3 = 3;
                } else {
                    i3 = -1;
                }
                audioRoutingController.mCurrentRouting = i3;
                AudioRoutingController.this.mForceSpeakerphone = i2;
                AudioRoutingController.this.notifyAudioRoutingChanged(AudioRoutingController.this.queryCurrentAudioRouting());
            } catch (Exception e2) {
                Logging.e("AudioRoute", "onEvent: Exception ", e2);
            }
        }
    }

    class EventHandler extends Handler {
        public void handleMessage(Message message) {
            AudioRoutingController.this.mState.onEvent(message.what, message.arg1);
        }

        public EventHandler(Looper looper) {
            super(looper);
        }
    }

    class HeadsetBroadcastReceiver extends BroadcastReceiver {
        private boolean isRegistered;

        public boolean getRegistered() {
            return this.isRegistered;
        }

        public void setRegistered(boolean z) {
            this.isRegistered = z;
        }

        private HeadsetBroadcastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equalsIgnoreCase("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                int intExtra = intent.getIntExtra("state", -1);
                if (intExtra == 1) {
                    if (intent.getIntExtra("microphone", -1) == 1) {
                        Logging.i("AudioRoute", "Headset w/ mic connected");
                        AudioRoutingController.this.sendEvent(1, 0);
                    } else {
                        Logging.i("AudioRoute", "Headset w/o mic connected");
                        AudioRoutingController.this.sendEvent(1, 2);
                    }
                } else if (intExtra == 0) {
                    Logging.i("AudioRoute", "Headset disconnected");
                    AudioRoutingController.this.sendEvent(1, -1);
                } else {
                    Logging.i("AudioRoute", "Headset unknown event detected, state=" + intExtra);
                }
            }
        }
    }

    public String getAudioRouteDesc(int i) {
        switch (i) {
            case -1:
                return "Default";
            case 0:
                return "Headset";
            case 1:
                return "Earpiece";
            case 2:
                return "HeadsetOnly";
            case 3:
                return "Speakerphone";
            case 4:
                return "Loudspeaker";
            case 5:
                return "HeadsetBluetooth";
            default:
                return "Unknown";
        }
    }

    public void startMonitoring() {
        this.mState.setState(1);
    }

    public void stopMonitoring() {
        this.mState.setState(2);
    }

    public void cancelTimer() {
        Logging.d("AudioRoute", "cancel bluetooth timer");
        this.mEventHandler.removeCallbacks(this.bluetoothTimeoutRunnable);
    }

    private void clearBTResource() {
        if (this.mBTAdapter != null) {
            this.mBTAdapter.closeProfileProxy(1, this.mBTHeadset);
            this.mBTAdapter = null;
        }
        if (this.mBTHeadsetListener != null) {
            this.mBTHeadsetListener = null;
        }
    }

    private void startTimer() {
        Logging.d("AudioRoute", "start bluetooth timer");
        this.mEventHandler.postDelayed(this.bluetoothTimeoutRunnable, 20000);
    }

    public AudioManager getAudioManager() {
        Context context = (Context) this.mContext.get();
        if (context == null) {
            return null;
        }
        return (AudioManager) context.getSystemService("audio");
    }

    public boolean isAudioOnly() {
        if (this.mVideoDisabled || (this.mMuteLocal && this.mMuteRemotes)) {
            return true;
        }
        return false;
    }

    public int queryCurrentAudioRouting() {
        AudioManager audioManager = getAudioManager();
        if (audioManager.isSpeakerphoneOn()) {
            return 3;
        }
        if (audioManager.isBluetoothScoOn() || audioManager.isBluetoothA2dpOn()) {
            return 5;
        }
        if (audioManager.isWiredHeadsetOn()) {
            return 0;
        }
        return 1;
    }

    private void startBtSco() {
        AudioManager audioManager = getAudioManager();
        int mode = audioManager.getMode();
        Logging.i("AudioRoute", "try to opening bt sco " + this.mScoConnectionAttemps + " " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
        if (!audioManager.isBluetoothScoOn()) {
            Logging.d("AudioRoute", "Off call sco support = " + audioManager.isBluetoothScoAvailableOffCall());
            this.mBtScoState = 0;
            this.mScoConnectionAttemps = this.mScoConnectionAttemps + 1;
            doStartBTSco(audioManager);
        }
    }

    public void stopBtSco() {
        AudioManager audioManager = getAudioManager();
        int mode = audioManager.getMode();
        Logging.i("AudioRoute", "try to stopping bt sco " + mode + "[" + modeAsString(mode) + "] " + this.mBtScoState + "[" + btStateAsString(this.mBtScoState) + "] sco on: " + audioManager.isBluetoothScoOn());
        if (!audioManager.isBluetoothScoOn()) {
            this.mBtScoState = 3;
        } else {
            this.mBtScoState = 2;
        }
        doStopBTSco(audioManager);
    }

    public void uninitialize() {
        Logging.d("AudioRoute", "uninitialize");
        try {
            clearBTResource();
            Context context = (Context) this.mContext.get();
            if (context != null) {
                if (this.mHeadsetReceiver != null && this.mHeadsetReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mHeadsetReceiver);
                    this.mHeadsetReceiver.setRegistered(false);
                }
                if (this.mBTHeadsetReceiver != null && this.mBTHeadsetReceiver.getRegistered()) {
                    context.unregisterReceiver(this.mBTHeadsetReceiver);
                    this.mBTHeadsetReceiver.setRegistered(false);
                }
            }
        } catch (Exception e2) {
            Logging.e("AudioRoute", "fatal error: ", e2);
        }
        this.mHeadsetReceiver = null;
        this.mBTHeadsetReceiver = null;
    }

    public void resetAudioRouting() {
        int i = 1;
        if (this.mForceSpeakerphone == 1) {
            Logging.i("AudioRoute", "reset(force) audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(3) + ", actual system routing:" + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (!(this.mCurrentRouting == 3 && queryCurrentAudioRouting() == 3)) {
                doSetAudioOutputRouting(3);
            }
        } else {
            if (this.mIsBTHeadsetPlugged) {
                i = 5;
            } else if (this.mIsWiredHeadsetPlugged) {
                i = this.mHeadsetType;
            } else if (this.mForceSpeakerphone != 0) {
                i = this.mDefaultRouting;
            }
            Logging.i("AudioRoute", "reset audio routing, default routing: " + getAudioRouteDesc(this.mDefaultRouting) + ", current routing: " + getAudioRouteDesc(this.mCurrentRouting) + ", target routing: " + getAudioRouteDesc(i) + ", actual system routing: " + getAudioRouteDesc(queryCurrentAudioRouting()));
            if (!(this.mCurrentRouting == i && queryCurrentAudioRouting() == this.mCurrentRouting)) {
                doSetAudioOutputRouting(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void bluetoothTimeout() {
        /*
            r8 = this;
            android.media.AudioManager r0 = r8.getAudioManager()
            android.bluetooth.BluetoothHeadset r1 = r8.mBTHeadset
            if (r1 != 0) goto L_0x0010
            java.lang.String r0 = "AudioRoute"
            java.lang.String r1 = "no bluetooth profile connected"
            io.agora.rtc.internal.Logging.w(r0, r1)
            return
        L_0x0010:
            android.bluetooth.BluetoothHeadset r1 = r8.mBTHeadset
            java.util.List r1 = r1.getConnectedDevices()
            int r2 = r1.size()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x0080
            java.lang.Object r1 = r1.get(r4)
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            r2 = 0
            android.bluetooth.BluetoothHeadset r5 = r8.mBTHeadset     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.Class r5 = r5.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.String r6 = "isAudioOn"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.reflect.Method r5 = r5.getMethod(r6, r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            android.bluetooth.BluetoothHeadset r6 = r8.mBTHeadset     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            java.lang.Object r5 = r5.invoke(r6, r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x003c }
            r2 = r5
        L_0x003c:
            android.bluetooth.BluetoothHeadset r5 = r8.mBTHeadset
            boolean r5 = r5.isAudioConnected(r1)
            if (r5 != 0) goto L_0x0067
            if (r2 == 0) goto L_0x004f
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x004f
            goto L_0x0067
        L_0x004f:
            java.lang.String r2 = "AudioRoute"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "SCO is not connected with "
            r5.<init>(r6)
            java.lang.String r1 = r1.getName()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            io.agora.rtc.internal.Logging.d(r2, r1)
            goto L_0x0087
        L_0x0067:
            java.lang.String r2 = "AudioRoute"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "SCO connected with "
            r5.<init>(r6)
            java.lang.String r1 = r1.getName()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            io.agora.rtc.internal.Logging.d(r2, r1)
            r1 = 1
            goto L_0x0088
        L_0x0080:
            java.lang.String r1 = "AudioRoute"
            java.lang.String r2 = "no bluetooth device connected."
            io.agora.rtc.internal.Logging.w(r1, r2)
        L_0x0087:
            r1 = 0
        L_0x0088:
            int r2 = r8.mScoConnectionAttemps
            if (r2 > 0) goto L_0x00e2
            java.lang.String r2 = "AudioRoute"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "attemps trying, bt sco started: "
            r4.<init>(r5)
            boolean r5 = r8.mIsBTScoStarted
            r4.append(r5)
            java.lang.String r5 = " sco connected: "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = " "
            r4.append(r5)
            int r5 = r8.mScoConnectionAttemps
            r4.append(r5)
            java.lang.String r5 = " times "
            r4.append(r5)
            int r5 = r8.mBtScoState
            r4.append(r5)
            java.lang.String r5 = "["
            r4.append(r5)
            int r5 = r8.mBtScoState
            java.lang.String r5 = r8.btStateAsString(r5)
            r4.append(r5)
            java.lang.String r5 = "]"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            io.agora.rtc.internal.Logging.d(r2, r4)
            boolean r2 = r8.mIsBTScoStarted
            if (r2 == 0) goto L_0x0113
            if (r1 != 0) goto L_0x0113
            r8.startTimer()
            int r1 = r8.mScoConnectionAttemps
            int r1 = r1 + r3
            r8.mScoConnectionAttemps = r1
            r8.doStartBTSco(r0)
            return
        L_0x00e2:
            java.lang.String r0 = "AudioRoute"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "start bluetooth sco timeout, actual routing: "
            r1.<init>(r2)
            int r2 = r8.queryCurrentAudioRouting()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            io.agora.rtc.internal.Logging.e(r0, r1)
            r8.mScoConnectionAttemps = r4
            java.lang.ref.WeakReference<io.agora.rtc.internal.AudioRoutingController$AudioRoutingListener> r0 = r8.mListener
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x0110
            java.lang.ref.WeakReference<io.agora.rtc.internal.AudioRoutingController$AudioRoutingListener> r0 = r8.mListener
            java.lang.Object r0 = r0.get()
            io.agora.rtc.internal.AudioRoutingController$AudioRoutingListener r0 = (io.agora.rtc.internal.AudioRoutingController.AudioRoutingListener) r0
            r1 = 1030(0x406, float:1.443E-42)
            r0.onAudioRoutingError(r1)
        L_0x0110:
            r8.resetAudioRouting()
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.internal.AudioRoutingController.bluetoothTimeout():void");
    }

    public int initialize() {
        Logging.i("AudioRoute", "initialize +");
        Context context = (Context) this.mContext.get();
        if (context == null) {
            Logging.e("AudioRoute", "context has been GCed");
            return -1;
        }
        AudioManager audioManager = getAudioManager();
        if (audioManager == null) {
            Logging.e("AudioRoute", "invalid context: can't get AudioManager");
            return -1;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new EventHandler(myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        if (this.mHeadsetReceiver == null) {
            this.mHeadsetReceiver = new HeadsetBroadcastReceiver();
        }
        this.mIsWiredHeadsetPlugged = audioManager.isWiredHeadsetOn();
        this.mState = changeState(2);
        Logging.i("AudioRoute", "Headset setup: Plugged = " + this.mIsWiredHeadsetPlugged);
        if (!this.mHeadsetReceiver.getRegistered()) {
            context.registerReceiver(this.mHeadsetReceiver, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.mHeadsetReceiver.setRegistered(true);
        }
        if (Build.VERSION.SDK_INT >= 11 || context.checkCallingOrSelfPermission("android.permission.BLUETOOTH") == 0) {
            if (this.mBTHeadsetListener != null) {
                Logging.w("AudioRoute", "Bluetooth service Listener already been initialized");
            } else {
                try {
                    this.mBTHeadsetListener = new BluetoothProfile.ServiceListener() {
                        public void onServiceDisconnected(int i) {
                            Logging.i("AudioRoute", "onServiceDisconnected " + i + " =? headset(1" + ")");
                            if (i == 1) {
                                Logging.i("AudioRoute", "on BT service disconnected: " + i);
                                AudioRoutingController.this.cancelTimer();
                                AudioRoutingController.this.mBTHeadset = null;
                            }
                        }

                        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                            Logging.i("AudioRoute", "onServiceConnected " + i + " =? headset(1" + ")");
                            if (i == 1) {
                                Logging.i("AudioRoute", "on BT service connected: " + i + " " + bluetoothProfile);
                                AudioRoutingController.this.mBTHeadset = (BluetoothHeadset) bluetoothProfile;
                            }
                        }
                    };
                } catch (Exception e2) {
                    Logging.e("AudioRoute", "initialize failed: unable to create BluetoothProfile.ServiceListener, err=" + e2.getMessage());
                }
            }
            if (!hasPermission(context, "android.permission.BLUETOOTH")) {
                Logging.w("AudioRoute", "lacks BLUETOOTH permission");
                return 0;
            }
            try {
                if (this.mBTHeadsetReceiver == null) {
                    this.mBTHeadsetReceiver = new BTHeadsetBroadcastReceiver();
                }
                this.mBTAdapter = BluetoothAdapter.getDefaultAdapter();
                if (this.mBTAdapter != null) {
                    this.mBTAdapter.getProfileProxy(context, this.mBTHeadsetListener, 1);
                    if (2 == this.mBTAdapter.getProfileConnectionState(1)) {
                        this.mIsBTHeadsetPlugged = true;
                    }
                    Logging.i("AudioRoute", "BT headset setup: BTHeadsetPlugged = " + this.mIsBTHeadsetPlugged + " " + this.mBTHeadset);
                    IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
                    intentFilter.addAction("android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED");
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                    intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                    if (!this.mBTHeadsetReceiver.getRegistered()) {
                        Intent registerReceiver = context.registerReceiver(this.mBTHeadsetReceiver, intentFilter);
                        this.mBTHeadsetReceiver.setRegistered(true);
                        if (registerReceiver != null && TextUtils.equals(registerReceiver.getAction(), "android.media.ACTION_SCO_AUDIO_STATE_UPDATED")) {
                            if (registerReceiver.getIntExtra("android.media.extra.SCO_AUDIO_STATE", 0) != 1) {
                                Logging.i("AudioRoute", "initial Bluetooth SCO device unconnected");
                                this.mBtScoState = 3;
                            } else {
                                Logging.i("AudioRoute", "initial Bluetooth SCO device connected");
                                this.mBtScoState = 1;
                            }
                        }
                    }
                    Logging.i("AudioRoute", "initialize -");
                    return 0;
                }
                Logging.e("AudioRoute", "initialize: failed to get bluetooth adapter!!");
                return 0;
            } catch (Exception e3) {
                Logging.e("AudioRoute", "unable to create BluetoothHeadsetBroadcastReceiver, err:" + e3.getMessage());
            }
        } else {
            Logging.w("AudioRoute", "do not support BT monitoring on this device");
            return 0;
        }
    }

    public void checkBtScoState(boolean z) {
        this.mScoConnectionAttemps = 0;
    }

    public ControllerState changeState(int i) {
        if (i == 2) {
            return new ControllerStopState();
        }
        if (i == 1) {
            return new ControllerStartState();
        }
        return new ControllerErrorState();
    }

    public void notifyAudioRoutingChanged(int i) {
        AudioRoutingListener audioRoutingListener = (AudioRoutingListener) this.mListener.get();
        if (audioRoutingListener != null) {
            audioRoutingListener.onAudioRoutingChanged(i);
        } else {
            Logging.w("AudioRoute", "failed to get audio routing listener");
        }
    }

    private String btStateAsString(int i) {
        switch (i) {
            case 0:
                return "SCO_CONNECTING";
            case 1:
                return "SCO_CONNECTED";
            case 2:
                return "SCO_DISCONNECTING";
            case 3:
                return "SCO_DISCONNECTED";
            default:
                return "Unknown " + i;
        }
    }

    private String modeAsString(int i) {
        switch (i) {
            case 0:
                return "MODE_NORMAL";
            case 1:
                return "MODE_RINGTONE";
            case 2:
                return "MODE_IN_CALL";
            case 3:
                return "MODE_IN_COMMUNICATION";
            default:
                return "Unknown " + i;
        }
    }

    private void doStopBTSco(AudioManager audioManager) {
        Logging.i("AudioRoute", "doStopBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn());
        audioManager.setBluetoothScoOn(false);
        audioManager.stopBluetoothSco();
        if (this.mBTHeadset != null) {
            try {
                this.mBTHeadset.getClass().getMethod("disconnectAudio", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, false);
        }
    }

    public int updateBluetoothSco(int i) {
        Logging.d("AudioRoute", "updateBluetoothSco sco started: " + this.mIsBTScoStarted + ", audio route target: " + i + "[" + getAudioRouteDesc(i) + "] current: " + this.mCurrentRouting + "[" + getAudioRouteDesc(this.mCurrentRouting) + "], engine role: " + this.mEngineRole);
        if (i == 5) {
            if (this.mEngineRole == 22) {
                this.mIsBTScoStarted = false;
                cancelTimer();
                stopBtSco();
            } else {
                this.mIsBTScoStarted = true;
                startTimer();
                startBtSco();
            }
        } else if (this.mCurrentRouting == 5 && this.mIsBTScoStarted) {
            this.mIsBTScoStarted = false;
            cancelTimer();
            stopBtSco();
        }
        return 0;
    }

    private void doStartBTSco(AudioManager audioManager) {
        int mode = audioManager.getMode();
        Logging.i("AudioRoute", "doStartBTSco " + Build.VERSION.SDK_INT + " sco on: " + audioManager.isBluetoothScoOn() + " " + mode + "[" + modeAsString(mode) + "]");
        if (Build.VERSION.SDK_INT < 22) {
            audioManager.setStreamMute(0, true);
        }
        audioManager.setMode(2);
        audioManager.setSpeakerphoneOn(false);
        audioManager.setBluetoothScoOn(true);
        audioManager.startBluetoothSco();
        if (this.mBTHeadset != null) {
            try {
                this.mBTHeadset.getClass().getMethod("connectAudio", new Class[0]).invoke(this.mBTHeadset, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        audioManager.setMode(mode);
        Logging.d("AudioRoute", "doStartBTSco done sco on: " + audioManager.isBluetoothScoOn() + " " + audioManager.getMode() + "[" + modeAsString(audioManager.getMode()) + "]");
    }

    public int doSetAudioOutputRouting(int i) {
        boolean z;
        Logging.i("AudioRoute", "set audio output routing from " + getAudioRouteDesc(this.mCurrentRouting) + " to " + getAudioRouteDesc(i));
        try {
            AudioManager audioManager = getAudioManager();
            if (i != 5) {
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                audioManager.setSpeakerphoneOn(z);
            }
            if (queryCurrentAudioRouting() != i) {
                int queryCurrentAudioRouting = queryCurrentAudioRouting();
                Logging.i("AudioRoute", "different audio routing from target " + i + ", actual routing: " + queryCurrentAudioRouting + "[" + getAudioRouteDesc(queryCurrentAudioRouting) + "]");
            }
            updateBluetoothSco(i);
            this.mCurrentRouting = i;
            notifyAudioRoutingChanged(i);
            Logging.i("AudioRoute", "audio routing changed to " + getAudioRouteDesc(this.mCurrentRouting));
        } catch (Exception e2) {
            Logging.e("AudioRoute", "set audio output routing failed:", e2);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean hasPermission(Context context, String str) {
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    public AudioRoutingController(Context context, AudioRoutingListener audioRoutingListener) {
        this.mContext = new WeakReference<>(context);
        this.mListener = new WeakReference<>(audioRoutingListener);
    }

    public void sendEvent(int i, int i2) {
        Logging.d("AudioRoute", "sendEvent: [" + i + "], extra arg: " + i2 + "... " + this.mEventHandler);
        if (this.mEventHandler != null) {
            this.mEventHandler.sendMessage(this.mEventHandler.obtainMessage(i, i2, 0));
        }
    }
}
