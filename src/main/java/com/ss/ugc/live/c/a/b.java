package com.ss.ugc.live.c.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.avframework.engine.MediaEngineFactory;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.LiveStreamReport;
import com.ss.avframework.livestreamv2.log.ILogUploader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements ILiveStream.ILiveStreamErrorListener, ILiveStream.ILiveStreamInfoListener, a {
    private static final float[] i = {-1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    protected final e f78712a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f78713b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    protected Handler f78714c;

    /* renamed from: d  reason: collision with root package name */
    protected ILiveStream f78715d;

    /* renamed from: e  reason: collision with root package name */
    public d f78716e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f78717f;
    public long g;
    protected int h = -1;
    private com.ss.ugc.live.c.a.a.b j;
    private boolean k;
    private Runnable l = new Runnable() {
        public final void run() {
            b.this.h = 2;
            b.this.a();
        }
    };

    /* access modifiers changed from: protected */
    public void e() {
        this.f78715d.startCaptureSource();
    }

    public void a() {
        if (this.h != 2) {
            this.h = 0;
        }
        this.f78715d.stop();
        this.f78715d.stopCaptureSource();
    }

    public final void b() {
        this.f78715d.resume();
        this.f78715d.setAudioMute(this.k);
        this.f78714c.removeCallbacks(this.l);
    }

    public final void c() {
        this.f78714c.postDelayed(this.l, this.f78712a.o);
        this.f78715d.setAudioMute(true);
        this.f78715d.pause();
    }

    public final void d() {
        this.f78715d.stop();
        this.f78715d.release();
        this.f78714c.removeCallbacksAndMessages(this);
        this.f78714c = null;
        this.f78716e = null;
        this.j = null;
    }

    /* access modifiers changed from: protected */
    public LiveStreamBuilder f() {
        int i2;
        LiveStreamBuilder audioProfile = new LiveStreamBuilder().setEnableVideoEncodeAccelera(this.f78712a.l).setVideoProfile(this.f78712a.m).setLogUploader(new ILogUploader() {
            public final void uploadLog(JSONObject jSONObject) {
                for (String next : b.this.f78713b.keySet()) {
                    try {
                        jSONObject.put(next, b.this.f78713b.get(next));
                    } catch (JSONException unused) {
                    }
                }
                b.this.f78712a.r.a(jSONObject);
                if (b.this.f78716e != null) {
                    LiveStreamReport liveStreamReport = new LiveStreamReport();
                    if (b.this.f78715d.getLiveStreamInfo(liveStreamReport)) {
                        b.this.f78716e.a(((float) liveStreamReport.getVideoTransportRealBps()) / 1000.0f);
                    }
                    liveStreamReport.release();
                }
            }
        }).setContext(this.f78712a.f78728a).setProjectKey(this.f78712a.C).setUploadLogInterval(5000).setVideoCaptureWidth(this.f78712a.j).setVideoCaptureHeight(this.f78712a.k).setVideoCaptureFps(this.f78712a.g).setVideoFps(this.f78712a.g).setVideoBitrate(this.f78712a.f78731d * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).setVideoMaxBitrate(this.f78712a.f78733f * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).setVideoMinBitrate(this.f78712a.f78732e * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE).setVideoWidth(this.f78712a.j).setVideoHeight(this.f78712a.k).setVideoCaptureDevice(this.f78712a.v).setAudioChannel(2).setAudioProfile(this.f78712a.q);
        if (this.f78712a.q == 1) {
            i2 = 128000;
        } else {
            i2 = 64000;
        }
        LiveStreamBuilder liveStreamBuilder = audioProfile.setAudioBitrate(i2).setAudioCaptureChannel(2).setAudioSampleHZ(this.f78712a.p).setAudioCaptureDevice(2).setUsingLiveStreamAudioCapture(this.f78712a.B).setRtmpReconnectCounts(this.f78712a.n).setRtmpReconnectIntervalSeconds(5).setVideoEncoder(this.f78712a.z).setEnableVideoBFrame(this.f78712a.y).setVideoGopSec(this.f78712a.x).setBitrateAdaptStrategy(this.f78712a.w).setRoiOn(this.f78712a.A ? 1 : 0).setBgMode(2).setupSdkParams(this.f78712a.D);
        if (this.f78712a.u != null) {
            liveStreamBuilder.setScreenCaptureIntent(this.f78712a.u);
        }
        return liveStreamBuilder;
    }

    public final void a(d dVar) {
        this.f78716e = dVar;
    }

    public final void a(boolean z) {
        this.k = z;
        this.f78715d.setAudioMute(z);
    }

    public final void a(int i2) {
        if (this.f78714c != null) {
            this.f78714c.removeCallbacksAndMessages(this);
        }
        if (this.f78716e != null) {
            this.f78716e.a(i2);
        }
    }

    public b(e eVar) {
        this.f78712a = eVar;
        this.j = this.f78712a.t;
        this.f78714c = new Handler(Looper.getMainLooper());
        MediaEngineFactory.setLogLevel(6);
        this.f78715d = f().create();
        this.f78715d.setErrorListener(this);
        this.f78715d.setInfoListener(this);
        e();
        this.f78713b.put("rtmp_type", String.valueOf(eVar.f78730c));
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        String str2 = new String();
        if (split != null && split.length >= 2) {
            try {
                str2 = URLEncoder.encode(split[split.length - 1], "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < split.length - 1; i2++) {
            sb.append(split[i2]);
            sb.append("/");
        }
        sb.append(str2);
        return sb.toString();
    }

    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            str = this.f78712a.f78729b;
        }
        e();
        this.f78715d.start(b(str));
    }

    public final void a(List<String> list) {
        if (list == null || list.size() <= 0) {
            a(this.f78712a.f78729b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String b2 : list) {
            arrayList.add(b(b2));
        }
        e();
        this.f78715d.start((List<String>) arrayList);
    }

    public void onError(int i2, int i3, Exception exc) {
        if (this.f78714c != null) {
            this.f78714c.post(new Runnable() {
                public final void run() {
                    if (b.this.h == -1) {
                        b.this.h = 3;
                    }
                    if (b.this.f78716e != null) {
                        b.this.a(b.this.h);
                    }
                    b.this.h = -1;
                }
            });
            if (this.j != null) {
                com.ss.ugc.live.c.a.a.b bVar = this.j;
                bVar.a("code1:" + i2 + ",code2:" + i3, exc);
            }
        }
    }

    public void onInfo(final int i2, int i3, int i4) {
        if (this.f78714c != null) {
            this.f78714c.post(new Runnable() {
                public final void run() {
                    int i = i2;
                    if (i != 11) {
                        if (i != 13) {
                            if (i != 15) {
                                switch (i) {
                                    case 2:
                                        if (b.this.f78716e != null) {
                                            b.this.f78716e.d();
                                            return;
                                        }
                                        break;
                                    case 3:
                                        if (b.this.h != -1) {
                                            b.this.a(b.this.h);
                                            b.this.h = -1;
                                            return;
                                        }
                                        return;
                                }
                            } else {
                                b.this.f78717f = true;
                                if (b.this.f78716e != null) {
                                    b.this.f78716e.e();
                                    return;
                                }
                            }
                        }
                    } else if (b.this.f78717f) {
                        b.this.f78717f = false;
                        if (b.this.f78716e != null) {
                            b.this.f78716e.f();
                        }
                    }
                    if (System.currentTimeMillis() - b.this.g > 5000) {
                        b.this.g = System.currentTimeMillis();
                    }
                }
            });
            if (this.j != null) {
                String str = "INFO (" + i2 + "," + i3 + "," + i4 + ") ";
                switch (i2) {
                    case 1:
                        str + "starting_publish";
                        break;
                    case 2:
                        str + "started_publish";
                        break;
                    case 3:
                        str + "stoped_publish";
                        break;
                    case 4:
                        str + "video_starting_capture";
                        break;
                    case 5:
                        str + "video_started_capture";
                        break;
                    case 6:
                        str + "video_stoped_capture";
                        break;
                    case e.l:
                        str + "audio_starting_capture";
                        break;
                    case 8:
                        str + "audio_started_capture";
                        break;
                    case 9:
                        str + "audio_stoped_capture";
                        break;
                    case 10:
                        str + "rtmp_connecting";
                        break;
                    case 11:
                        str + "rtmp_connected";
                        break;
                    case SearchNilInfo.HIT_TYPE_SENSITIVE:
                        str + "rtmp_connect_fail";
                        break;
                    case 13:
                        str + "network too weak";
                        break;
                    case 14:
                        str + "rtmp_disconnected";
                        break;
                    case 15:
                        str + "rtmp_reconnecting";
                        break;
                    case SearchJediMixFeedAdapter.f42514c:
                        str + "video_encoder_format_changed";
                        break;
                    default:
                        str + "UNKONW???";
                        break;
                }
            }
        }
    }

    public final void a(int i2, int i3, int i4, long j2, Bundle bundle) {
        this.f78715d.pushVideoFrame(i2, false, i3, i4, 180, i, j2 * 1000, bundle);
    }
}
