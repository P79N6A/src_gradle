package com.bytedance.b.a.a.e;

import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.b.a.a.a;
import com.bytedance.b.a.a.f.a;
import com.bytedance.b.a.a.g.a;
import com.bytedance.b.a.a.g.b;
import com.bytedance.b.a.a.g.d;
import io.agora.rtc.IRtcEngineEventHandler;
import io.agora.rtc.RtcEngine;
import io.agora.rtc.RtcEngineEx;
import io.agora.rtc.internal.RtcEngineImpl;
import io.agora.rtc.video.AgoraVideoFrame;
import io.agora.rtc.video.VideoCanvas;
import io.agora.rtc.video.VideoCompositingLayout;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;

public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public RtcEngine f19181a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.b.a.a.g.a f19182b;
    private IRtcEngineEventHandler u = new IRtcEngineEventHandler() {
        public final void onConnectionBanned() {
            a.this.f19189d.b("agora onConnectionBanned");
        }

        public final void onConnectionInterrupted() {
            a.this.f19189d.a("agora onConnectionInterrupted");
        }

        public final void onConnectionLost() {
            a.this.f19189d.a("agora onConnectionLost");
        }

        public final void onLeaveChannel(IRtcEngineEventHandler.RtcStats rtcStats) {
            a.this.f19189d.c();
        }

        public final void onRtcStats(IRtcEngineEventHandler.RtcStats rtcStats) {
            a.this.f19189d.a((long) rtcStats.txVideoKBitRate, (long) rtcStats.txAudioKBitRate);
        }

        public final void onError(int i) {
            com.bytedance.b.a.a.b.a aVar = a.this.f19189d;
            aVar.b("agora onError, code: " + i);
            new StringBuilder("agora error: ").append(i);
        }

        public final void onWarning(int i) {
            com.bytedance.b.a.a.b.a aVar = a.this.f19189d;
            aVar.a("agora onWarning, code: " + i);
            new StringBuilder("agora warning: ").append(i);
        }

        public final void onFirstRemoteAudioFrame(int i, int i2) {
            new StringBuilder("onFirstRemoteAudioFrame: ").append(i);
            if (i != a.this.f19188c.f19197e) {
                a.this.f19189d.b(i);
            }
        }

        public final void onUserJoined(int i, int i2) {
            new StringBuilder("onUserJoined: ").append(i);
            if (i != a.this.f19188c.f19197e) {
                a.this.a(i);
                a.this.f19189d.a(i);
            }
        }

        public final void onUserOffline(int i, int i2) {
            new StringBuilder("onUserOffline: ").append(i);
            a.this.b(i);
            a.this.f19189d.c(i);
        }

        public final void onAudioVolumeIndication(IRtcEngineEventHandler.AudioVolumeInfo[] audioVolumeInfoArr, int i) {
            int i2;
            int length = audioVolumeInfoArr.length;
            String[] strArr = new String[length];
            boolean[] zArr = new boolean[length];
            com.bytedance.b.a.a.f.a aVar = a.this.f19188c;
            if (aVar.t > 0) {
                i2 = aVar.t;
            } else if (aVar.f19194b == a.e.ZEGO) {
                i2 = 11;
            } else {
                i2 = 30;
            }
            int i3 = 0;
            while (true) {
                boolean z = true;
                if (i3 >= length) {
                    break;
                }
                IRtcEngineEventHandler.AudioVolumeInfo audioVolumeInfo = audioVolumeInfoArr[i3];
                int i4 = audioVolumeInfo.uid;
                if (i4 == 0) {
                    i4 = a.this.f19188c.f19197e;
                }
                strArr[i3] = String.valueOf(i4);
                if (audioVolumeInfo.volume < i2) {
                    z = false;
                }
                zArr[i3] = z;
                i3++;
            }
            a aVar2 = a.this;
            aVar2.f19189d.a(strArr, zArr);
            if (aVar2.f19188c.p == a.b.ANCHOR && aVar2.f19188c.u) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - aVar2.n >= ((long) aVar2.o)) {
                    int length2 = strArr.length;
                    boolean z2 = false;
                    for (int i5 = 0; i5 < length2; i5++) {
                        String str = strArr[i5];
                        boolean z3 = zArr[i5];
                        if (!aVar2.m.containsKey(str) || aVar2.m.get(str).booleanValue() != z3) {
                            z2 = true;
                        }
                        aVar2.m.put(str, Boolean.valueOf(z3));
                    }
                    if (z2) {
                        aVar2.a(aVar2.l);
                        aVar2.n = currentTimeMillis;
                    }
                }
            }
        }

        public final void onJoinChannelSuccess(String str, int i, int i2) {
            a.this.f19189d.b();
            if (a.this.f19188c.y == a.d.VIDEO) {
                a.this.f19182b.f19217a.d();
            }
        }

        public final void onAudioQuality(int i, int i2, short s, short s2) {
            a.this.f19189d.d(s);
        }

        public final void onFirstRemoteVideoDecoded(final int i, int i2, int i3, int i4) {
            new StringBuilder("onFirstRemoteVideoDecoded: ").append(i);
            if (i != a.this.f19188c.f19197e) {
                a.this.k.post(new Runnable() {
                    public final void run() {
                        SurfaceView CreateRendererView = RtcEngine.CreateRendererView(a.this.f19190e);
                        a.this.f19181a.setupRemoteVideo(new VideoCanvas(CreateRendererView, 1, i));
                        a.this.f19189d.a(i, CreateRendererView);
                    }
                });
            }
        }
    };

    /* access modifiers changed from: protected */
    public final String e() {
        return "agora";
    }

    public final void d() {
        this.f19189d.d();
    }

    public final void c() {
        if (this.f19188c.y == a.d.VIDEO) {
            this.f19182b.f19217a.e();
            this.f19182b.f19217a.f();
        }
        if (this.j != null) {
            this.j = null;
        }
        int leaveChannel = this.f19181a.leaveChannel();
        if (leaveChannel < 0) {
            com.bytedance.b.a.a.b.a aVar = this.f19189d;
            aVar.c(10007, "result: " + leaveChannel);
        }
    }

    public final void a() {
        try {
            this.f19181a = RtcEngine.create(this.f19190e, this.f19188c.g, this.u);
            int channelProfile = this.f19181a.setChannelProfile(1);
            if (channelProfile < 0) {
                com.bytedance.b.a.a.b.a aVar = this.f19189d;
                aVar.a(10001, "result: " + channelProfile + ", channel profile: 1");
                return;
            }
            int clientRole = this.f19181a.setClientRole(1, null);
            if (clientRole < 0) {
                com.bytedance.b.a.a.b.a aVar2 = this.f19189d;
                aVar2.a(10002, "result: " + clientRole + ", role: 1");
                return;
            }
            a.f fVar = this.f19188c.f19195c;
            int videoProfileEx = ((RtcEngineEx) this.f19181a).setVideoProfileEx(fVar.f19204f, fVar.g, fVar.h, fVar.i);
            if (videoProfileEx < 0) {
                com.bytedance.b.a.a.b.a aVar3 = this.f19189d;
                aVar3.a(10003, "result: " + videoProfileEx);
                return;
            }
            if (this.f19188c.s > 0) {
                int enableAudioVolumeIndication = this.f19181a.enableAudioVolumeIndication(this.f19188c.s, 3);
                if (enableAudioVolumeIndication < 0) {
                    com.bytedance.b.a.a.b.a aVar4 = this.f19189d;
                    aVar4.a(10004, "result: " + enableAudioVolumeIndication + ", interval: " + this.f19188c.s);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.f19188c.w)) {
                this.f19181a.setLogFile(this.f19188c.w);
            }
            this.f19181a.setParameters("{\"che.video.moreFecSchemeEnable\":true}");
            this.f19189d.a();
        } catch (Exception e2) {
            this.f19189d.a(10000, e2.toString());
        }
    }

    public final void b() {
        int i;
        String str;
        this.f19181a.enableAudio();
        if (this.i != null) {
            this.j = this.i.a();
            this.f19181a.setExternalAudioSource(true, 44100, 2);
            new Object() {
            };
        }
        if (this.f19188c.y == a.d.VIDEO) {
            this.f19182b = new com.bytedance.b.a.a.g.a(this.h.a(), this.f19188c.n, new a.C0148a() {
                public final boolean a(AgoraVideoFrame agoraVideoFrame) {
                    if (!a.this.f19181a.pushExternalVideoFrame(agoraVideoFrame)) {
                        return false;
                    }
                    return true;
                }
            });
            this.f19181a.setExternalVideoSource(true, true, true);
            this.f19181a.enableVideo();
            com.bytedance.b.a.a.g.a aVar = this.f19182b;
            aVar.f19217a.a(new b() {
                public final boolean a(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j) {
                    int i4;
                    AgoraVideoFrame agoraVideoFrame = new AgoraVideoFrame();
                    switch (a.AnonymousClass2.f19139a[a.this.f19219c.getAgoraFormat().ordinal()]) {
                        case 1:
                            i4 = 11;
                            break;
                        case 2:
                            i4 = 10;
                            break;
                        default:
                            throw new IllegalArgumentException("Unsupported type of AgoraVideoFrame");
                    }
                    agoraVideoFrame.format = i4;
                    agoraVideoFrame.timeStamp = j;
                    agoraVideoFrame.stride = i2;
                    agoraVideoFrame.height = i3;
                    agoraVideoFrame.eglContext11 = eGLContext;
                    agoraVideoFrame.eglContext14 = null;
                    agoraVideoFrame.textureID = i;
                    agoraVideoFrame.syncMode = false;
                    agoraVideoFrame.transform = a.this.f19220d;
                    return a.this.f19218b.a(agoraVideoFrame);
                }
            });
        } else {
            this.f19181a.disableVideo();
        }
        if (this.t == a.C0147a.AUDIO_PROFILE_LC) {
            i = 128000;
        } else {
            i = 64000;
        }
        if (this.f19188c.p != a.b.ANCHOR) {
            str = null;
        } else {
            str = "{\"audiobitrate\":" + i + ",\"extraInfo\":\"{\\\"lowDelay\\\":true}\",\"defaultLayout\":" + this.f19188c.A + ",\"owner\":true,\"width\":" + this.r + ",\"bitrate\":" + this.q + ",\"audiochannels\":2,\"audiotype\":" + this.t.getAgoraAudioProfile() + ",\"height\":" + this.s + ",\"mosaicStream\":\"" + this.f19188c.m + "\",\"audiosamplerate\":44100,\"lifecycle\":" + this.f19188c.z + ",\"framerate\":" + this.p + "}";
        }
        this.f19181a.setAudioProfile(2, 1);
        if (this.f19181a.joinChannel(this.f19188c.h, this.f19188c.f19198f, str, this.f19188c.f19197e) < 0) {
            this.f19189d.b(10006, "result: " + r0);
            return;
        }
        new StringBuilder("agora start join channel: ").append(this.f19188c.f19198f);
    }

    public final void a(boolean z) {
        this.f19181a.muteLocalAudioStream(!z);
    }

    public final void a(List<com.bytedance.b.a.a.f.b> list) {
        this.f19181a.clearVideoCompositingLayout();
        VideoCompositingLayout.Builder builder = new VideoCompositingLayout.Builder();
        builder.setCanvas(this.r, this.s, this.f19188c.r);
        for (com.bytedance.b.a.a.f.b next : list) {
            builder.addWindow(new VideoCompositingLayout.Region().alpha(1.0d).position(next.f19208d, next.f19209e).renderMode(1).size(next.f19210f, next.g).uid(next.f19206b).zOrder(0));
        }
        builder.updateAppData(b(list));
        this.f19181a.setVideoCompositingLayout(builder.create());
    }

    public a(com.bytedance.b.a.a.f.a aVar, d dVar, com.bytedance.b.a.a.a.b bVar, com.bytedance.b.a.a.b.a aVar2) {
        super(aVar, dVar, bVar, aVar2);
        RtcEngineImpl.loadNativeLibsExternal();
    }
}
