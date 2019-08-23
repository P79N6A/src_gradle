package com.ss.android.ugc.aweme.im.sdk.chat.input.audio;

import android.os.CountDownTimer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.im.core.d.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordStateView;
import com.ss.android.ugc.aweme.im.sdk.chat.net.f;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class c implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50356a = null;

    /* renamed from: b  reason: collision with root package name */
    public static long f50357b = 60000;

    /* renamed from: c  reason: collision with root package name */
    public f f50358c;

    /* renamed from: d  reason: collision with root package name */
    public d f50359d;

    /* renamed from: e  reason: collision with root package name */
    public AudioRecordBar f50360e;

    /* renamed from: f  reason: collision with root package name */
    public AudioRecordStateView f50361f;
    public CopyOnWriteArrayList<i> g;
    public f.a h;
    public n i;
    public j j = new j() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50377a;

        public final void c() {
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50377a, false, 50700, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50377a, false, 50700, new Class[0], Void.TYPE);
                return;
            }
            if (c.this.f50358c != null) {
                c.this.f50358c.a(c.this.f50360e.f50421d);
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f50377a, false, 50699, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50377a, false, 50699, new Class[0], Void.TYPE);
                return;
            }
            if (c.this.f50358c != null) {
                c.this.f50359d.a();
                c.this.f50359d.c();
                c cVar = c.this;
                if (PatchProxy.isSupport(new Object[0], cVar, c.f50356a, false, 50683, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], cVar, c.f50356a, false, 50683, new Class[0], Void.TYPE);
                } else if (cVar.g != null) {
                    Iterator<i> it2 = cVar.g.iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                }
                f fVar = c.this.f50358c;
                if (PatchProxy.isSupport(new Object[0], fVar, f.f50399a, false, 50726, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], fVar, f.f50399a, false, 50726, new Class[0], Void.TYPE);
                } else if (!fVar.f50403e) {
                    fVar.f50403e = true;
                    if (fVar.f50404f != null) {
                        fVar.f50404f.a();
                    }
                    if (fVar.g == null || fVar.g.isShutdown() || fVar.g.isTerminated()) {
                        fVar.g = g.a();
                    }
                    fVar.g.submit(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50405a;

                        /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
                        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
                            r1.b(false);
                         */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00dc */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r9 = this;
                                r0 = 0
                                java.lang.Object[] r1 = new java.lang.Object[r0]
                                com.meituan.robust.ChangeQuickRedirect r3 = f50405a
                                java.lang.Class[] r6 = new java.lang.Class[r0]
                                java.lang.Class r7 = java.lang.Void.TYPE
                                r4 = 0
                                r5 = 50733(0xc62d, float:7.1092E-41)
                                r2 = r9
                                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                                if (r1 == 0) goto L_0x0025
                                java.lang.Object[] r2 = new java.lang.Object[r0]
                                com.meituan.robust.ChangeQuickRedirect r4 = f50405a
                                r5 = 0
                                r6 = 50733(0xc62d, float:7.1092E-41)
                                java.lang.Class[] r7 = new java.lang.Class[r0]
                                java.lang.Class r8 = java.lang.Void.TYPE
                                r3 = r9
                                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                                return
                            L_0x0025:
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f r1 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.this     // Catch:{ Exception -> 0x00f6 }
                                android.media.MediaRecorder r1 = r1.f50400b     // Catch:{ Exception -> 0x00f6 }
                                if (r1 == 0) goto L_0x0032
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f r1 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.this     // Catch:{ Exception -> 0x00f6 }
                                android.media.MediaRecorder r1 = r1.f50400b     // Catch:{ Exception -> 0x00f6 }
                                r1.reset()     // Catch:{ Exception -> 0x00f6 }
                            L_0x0032:
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f r1 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.this     // Catch:{ Exception -> 0x00f6 }
                                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00f6 }
                                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.f50399a     // Catch:{ Exception -> 0x00f6 }
                                r5 = 0
                                r6 = 50725(0xc625, float:7.1081E-41)
                                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00f6 }
                                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00f6 }
                                r3 = r1
                                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00f6 }
                                if (r2 == 0) goto L_0x0059
                                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00f6 }
                                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.f50399a     // Catch:{ Exception -> 0x00f6 }
                                r5 = 0
                                r6 = 50725(0xc625, float:7.1081E-41)
                                java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00f6 }
                                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00f6 }
                                r3 = r1
                                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00f6 }
                                goto L_0x00df
                            L_0x0059:
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                if (r2 != 0) goto L_0x0064
                                android.media.MediaRecorder r2 = new android.media.MediaRecorder     // Catch:{ Exception -> 0x00dc }
                                r2.<init>()     // Catch:{ Exception -> 0x00dc }
                                r1.f50400b = r2     // Catch:{ Exception -> 0x00dc }
                            L_0x0064:
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r3 = 1
                                r2.setAudioSource(r3)     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r3 = 2
                                r2.setOutputFormat(r3)     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r3 = 44100(0xac44, float:6.1797E-41)
                                r2.setAudioSamplingRate(r3)     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r3 = 3
                                r2.setAudioEncoder(r3)     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r3 = 96000(0x17700, float:1.34525E-40)
                                r2.setAudioEncodingBitRate(r3)     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r2.setOnErrorListener(r1)     // Catch:{ Exception -> 0x00dc }
                                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00dc }
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.b r3 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.b.a()     // Catch:{ Exception -> 0x00dc }
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.h r3 = r3.f50355b     // Catch:{ Exception -> 0x00dc }
                                java.io.File r3 = r3.a()     // Catch:{ Exception -> 0x00dc }
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
                                r4.<init>()     // Catch:{ Exception -> 0x00dc }
                                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00dc }
                                r4.append(r5)     // Catch:{ Exception -> 0x00dc }
                                java.lang.String r5 = ".m4a"
                                r4.append(r5)     // Catch:{ Exception -> 0x00dc }
                                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00dc }
                                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x00dc }
                                r1.i = r2     // Catch:{ Exception -> 0x00dc }
                                java.io.File r2 = r1.i     // Catch:{ Exception -> 0x00dc }
                                java.io.File r2 = r2.getParentFile()     // Catch:{ Exception -> 0x00dc }
                                boolean r2 = r2.exists()     // Catch:{ Exception -> 0x00dc }
                                if (r2 != 0) goto L_0x00c6
                                java.io.File r2 = r1.i     // Catch:{ Exception -> 0x00dc }
                                java.io.File r2 = r2.getParentFile()     // Catch:{ Exception -> 0x00dc }
                                r2.mkdirs()     // Catch:{ Exception -> 0x00dc }
                            L_0x00c6:
                                java.io.File r2 = r1.i     // Catch:{ Exception -> 0x00dc }
                                r2.createNewFile()     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                java.io.File r3 = r1.i     // Catch:{ Exception -> 0x00dc }
                                java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x00dc }
                                r2.setOutputFile(r3)     // Catch:{ Exception -> 0x00dc }
                                android.media.MediaRecorder r2 = r1.f50400b     // Catch:{ Exception -> 0x00dc }
                                r2.prepare()     // Catch:{ Exception -> 0x00dc }
                                goto L_0x00df
                            L_0x00dc:
                                r1.b(r0)     // Catch:{ Exception -> 0x00f6 }
                            L_0x00df:
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.this     // Catch:{ Exception -> 0x00f6 }
                                long r1 = android.os.SystemClock.uptimeMillis()     // Catch:{ Exception -> 0x00f6 }
                                r0.h = r1     // Catch:{ Exception -> 0x00f6 }
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.this     // Catch:{ Exception -> 0x00f6 }
                                android.media.MediaRecorder r0 = r0.f50400b     // Catch:{ Exception -> 0x00f6 }
                                r0.start()     // Catch:{ Exception -> 0x00f6 }
                                com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f r0 = com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.this     // Catch:{ Exception -> 0x00f6 }
                                android.os.CountDownTimer r0 = r0.f50401c     // Catch:{ Exception -> 0x00f6 }
                                r0.start()     // Catch:{ Exception -> 0x00f6 }
                                return
                            L_0x00f6:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.f.AnonymousClass1.run():void");
                        }
                    });
                }
            }
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50377a, false, 50701, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50377a, false, 50701, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            c.this.f();
        }
    };
    private HashMap<n, n> k;
    private n l;
    private n m;
    private CountDownTimer n;
    private j o = new j() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f50364a;

        public final void a() {
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f50364a, false, 50691, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50364a, false, 50691, new Class[0], Void.TYPE);
                return;
            }
            if (!(c.this.g == null || c.this.f50358c == null)) {
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50366a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50366a, false, 50694, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50366a, false, 50694, new Class[0], Void.TYPE);
                            return;
                        }
                        c cVar = c.this;
                        File file = c.this.f50358c.i;
                        long j = c.this.f50358c.j;
                        if (PatchProxy.isSupport(new Object[]{file, new Long(j)}, cVar, c.f50356a, false, 50682, new Class[]{File.class, Long.TYPE}, Void.TYPE)) {
                            c cVar2 = cVar;
                            PatchProxy.accessDispatch(new Object[]{file, new Long(j)}, cVar2, c.f50356a, false, 50682, new Class[]{File.class, Long.TYPE}, Void.TYPE);
                            return;
                        }
                        cVar.f50359d.d();
                        if (cVar.g != null) {
                            Iterator<i> it2 = cVar.g.iterator();
                            while (it2.hasNext()) {
                                it2.next().a(file, j);
                            }
                        }
                    }
                });
            }
            if (c.this.f50361f != null && c.this.f50358c.j <= c.f50357b) {
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50368a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50368a, false, 50695, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50368a, false, 50695, new Class[0], Void.TYPE);
                            return;
                        }
                        c.this.f50361f.setVisibility(4);
                    }
                });
            }
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f50364a, false, 50692, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f50364a, false, 50692, new Class[0], Void.TYPE);
                return;
            }
            if (c.this.f50361f != null && c.this.f50358c.j <= c.f50357b) {
                c.this.f50361f.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50370a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50370a, false, 50696, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50370a, false, 50696, new Class[0], Void.TYPE);
                            return;
                        }
                        c.this.f50361f.setVisibility(4);
                    }
                });
            }
            a.b(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f50372a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f50372a, false, 50697, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f50372a, false, 50697, new Class[0], Void.TYPE);
                        return;
                    }
                    c cVar = c.this;
                    if (PatchProxy.isSupport(new Object[0], cVar, c.f50356a, false, 50686, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], cVar, c.f50356a, false, 50686, new Class[0], Void.TYPE);
                        return;
                    }
                    if (cVar.g != null) {
                        Iterator<i> it2 = cVar.g.iterator();
                        while (it2.hasNext()) {
                            it2.next().c();
                        }
                    }
                }
            });
        }

        public final void a(int i) {
            final int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f50364a, false, 50693, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f50364a, false, 50693, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i2 == -1) {
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f50374a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f50374a, false, 50698, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f50374a, false, 50698, new Class[0], Void.TYPE);
                            return;
                        }
                        AudioRecordStateView audioRecordStateView = c.this.f50361f;
                        if (PatchProxy.isSupport(new Object[0], audioRecordStateView, AudioRecordStateView.f50426a, false, 50759, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], audioRecordStateView, AudioRecordStateView.f50426a, false, 50759, new Class[0], Void.TYPE);
                        } else {
                            if (audioRecordStateView.f50431f != -1) {
                                audioRecordStateView.f50427b.setText(audioRecordStateView.f50431f);
                            } else {
                                audioRecordStateView.f50427b.setText("");
                            }
                            audioRecordStateView.f50428c.setVisibility(4);
                            if (audioRecordStateView.h != -1) {
                                audioRecordStateView.f50429d.setImageResource(audioRecordStateView.h);
                                audioRecordStateView.f50429d.setVisibility(0);
                            } else {
                                audioRecordStateView.f50429d.setVisibility(4);
                            }
                            audioRecordStateView.a();
                            audioRecordStateView.b();
                        }
                        c.this.j.a(i2);
                    }
                });
            }
        }
    };

    public c() {
        AnonymousClass1 r0 = new CountDownTimer(f50357b, 50) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50362a;

            public final void onFinish() {
                if (PatchProxy.isSupport(new Object[0], this, f50362a, false, 50690, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50362a, false, 50690, new Class[0], Void.TYPE);
                    return;
                }
                AudioRecordStateView audioRecordStateView = c.this.f50361f;
                if (PatchProxy.isSupport(new Object[0], audioRecordStateView, AudioRecordStateView.f50426a, false, 50760, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], audioRecordStateView, AudioRecordStateView.f50426a, false, 50760, new Class[0], Void.TYPE);
                } else {
                    if (audioRecordStateView.g != -1) {
                        audioRecordStateView.f50427b.setText(audioRecordStateView.g);
                    } else {
                        audioRecordStateView.f50427b.setText("");
                    }
                    audioRecordStateView.f50428c.setVisibility(4);
                    if (audioRecordStateView.h != -1) {
                        audioRecordStateView.f50429d.setImageResource(audioRecordStateView.h);
                        audioRecordStateView.f50429d.setVisibility(0);
                    } else {
                        audioRecordStateView.f50429d.setVisibility(4);
                    }
                    audioRecordStateView.a();
                    audioRecordStateView.b();
                }
                AudioRecordBar audioRecordBar = c.this.f50360e;
                if (PatchProxy.isSupport(new Object[0], audioRecordBar, AudioRecordBar.f50418a, false, 50746, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], audioRecordBar, AudioRecordBar.f50418a, false, 50746, new Class[0], Void.TYPE);
                    return;
                }
                audioRecordBar.f50421d = false;
                audioRecordBar.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, audioRecordBar.f50419b, audioRecordBar.f50420c, 0));
            }

            public final void onTick(long j) {
                if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f50362a, false, 50689, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f50362a, false, 50689, new Class[]{Long.TYPE}, Void.TYPE);
                } else if (j <= 10000) {
                    if (c.this.f50360e.f50421d) {
                        c.this.f50361f.setSecondsRemain(j);
                    } else {
                        c.this.f50361f.a(j);
                    }
                } else if (c.this.f50360e.f50421d) {
                    c.this.f50361f.setVolumeLevel(c.this.f50358c.a(5));
                } else {
                    c.this.f50361f.a(c.this.f50358c.a(5));
                }
            }
        };
        this.n = r0;
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50676, new Class[0], Void.TYPE);
            return;
        }
        this.i = null;
        this.f50359d.a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50671, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50358c != null) {
            this.f50358c.a(true);
        }
        if (this.f50359d != null) {
            this.f50359d.a(true);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50673, new Class[0], Void.TYPE);
            return;
        }
        e();
        a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50379a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50379a, false, 50702, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50379a, false, 50702, new Class[0], Void.TYPE);
                    return;
                }
                c.this.b(c.this.i);
            }
        });
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50674, new Class[0], Void.TYPE);
            return;
        }
        a.b(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50381a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50381a, false, 50703, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50381a, false, 50703, new Class[0], Void.TYPE);
                    return;
                }
                c.this.e();
                c.this.i = null;
            }
        });
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50684, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            Iterator<i> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50685, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            Iterator<i> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().c();
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f50356a, false, 50672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50356a, false, 50672, new Class[0], Void.TYPE);
            return;
        }
        if (this.f50358c != null) {
            f fVar = this.f50358c;
            if (PatchProxy.isSupport(new Object[0], fVar, f.f50399a, false, 50729, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], fVar, f.f50399a, false, 50729, new Class[0], Void.TYPE);
            } else {
                fVar.b(true);
            }
        }
        if (this.f50359d != null) {
            d dVar = this.f50359d;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f50383a, false, 50712, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f50383a, false, 50712, new Class[0], Void.TYPE);
            } else {
                dVar.b(true);
            }
        }
        if (this.g != null) {
            this.g.clear();
        }
    }

    private void a(File file) {
        File file2 = file;
        if (PatchProxy.isSupport(new Object[]{file2}, this, f50356a, false, 50668, new Class[]{File.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{file2}, this, f50356a, false, 50668, new Class[]{File.class}, Void.TYPE);
            return;
        }
        if (this.f50359d != null) {
            d dVar = this.f50359d;
            if (PatchProxy.isSupport(new Object[]{file2}, dVar, d.f50383a, false, 50707, new Class[]{File.class}, Void.TYPE)) {
                d dVar2 = dVar;
                PatchProxy.accessDispatch(new Object[]{file2}, dVar2, d.f50383a, false, 50707, new Class[]{File.class}, Void.TYPE);
                return;
            }
            dVar.p = 0;
            dVar.a(file2, true);
        }
    }

    private void d(n nVar) {
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f50356a, false, 50670, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f50356a, false, 50670, new Class[]{n.class}, Void.TYPE);
            return;
        }
        if (!nVar.isSelf()) {
            nVar2.setMsgStatus(1);
        }
        com.ss.android.ugc.aweme.im.sdk.chat.net.a.a().a(null, nVar2, this.h);
    }

    private boolean e(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50356a, false, 50681, new Class[]{n.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{nVar}, this, f50356a, false, 50681, new Class[]{n.class}, Boolean.TYPE)).booleanValue();
        } else if (nVar.getMsgType() != 17 || nVar.isSelf()) {
            return false;
        } else {
            return true;
        }
    }

    private void f(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50356a, false, 50687, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50356a, false, 50687, new Class[]{n.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            Iterator<i> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().b(nVar);
            }
        }
    }

    private void g(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50356a, false, 50688, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50356a, false, 50688, new Class[]{n.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            Iterator<i> it2 = this.g.iterator();
            while (it2.hasNext()) {
                it2.next().a(nVar);
            }
        }
    }

    public final void b(List<n> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50356a, false, 50678, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50356a, false, 50678, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.l = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            n nVar = list.get(i2);
            if (e(nVar)) {
                if (this.l == null) {
                    this.k.put(nVar, null);
                    this.m = nVar;
                } else {
                    this.k.put(nVar, this.l);
                }
                this.l = nVar;
            }
        }
    }

    public final void c(List<n> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50356a, false, 50680, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50356a, false, 50680, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            n nVar = list.get(i2);
            if (e(nVar)) {
                if (this.l == null) {
                    this.k.put(nVar, null);
                    this.m = nVar;
                } else {
                    this.k.put(nVar, this.l);
                }
                this.l = nVar;
            }
        }
    }

    public final void a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50356a, false, 50669, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50356a, false, 50669, new Class[]{n.class}, Void.TYPE);
        } else if (nVar.equals(this.i)) {
            g();
        } else {
            f(nVar);
            if (TextUtils.isEmpty(nVar.getLocalExt().get("localpath"))) {
                d(nVar);
                return;
            }
            File file = new File(nVar.getLocalExt().get("localpath"));
            if (!file.exists() || !file.isFile()) {
                d(nVar);
                return;
            }
            a(file);
            g(nVar);
            if (nVar.getLocalExt().get("isPlayed") == null || !nVar.getLocalExt().get("isPlayed").equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
                nVar.addLocalExt("isPlayed", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                ad.b(nVar);
                Iterator<Map.Entry<n, n>> it2 = this.k.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry next = it2.next();
                    if (nVar.equals(next.getValue())) {
                        this.k.put((n) next.getKey(), nVar);
                        break;
                    }
                }
            }
            this.i = nVar;
        }
    }

    public final void c(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50356a, false, 50679, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50356a, false, 50679, new Class[]{n.class}, Void.TYPE);
            return;
        }
        n nVar2 = null;
        if (this.i != null && this.i.equals(nVar)) {
            g();
            this.i = null;
        }
        n nVar3 = this.k.get(nVar);
        if (nVar.equals(this.l)) {
            this.l = nVar3;
        } else {
            Iterator<Map.Entry<n, n>> it2 = this.k.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry next = it2.next();
                n nVar4 = (n) next.getValue();
                if (nVar4 != null && nVar4.equals(nVar)) {
                    nVar2 = (n) next.getKey();
                    break;
                }
            }
            this.k.put(nVar2, nVar3);
            if (nVar.equals(this.m)) {
                this.m = nVar2;
            }
        }
        this.k.remove(nVar);
    }

    public final void b(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f50356a, false, 50675, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f50356a, false, 50675, new Class[]{n.class}, Void.TYPE);
        } else if (nVar == null || nVar.isSelf()) {
            g();
        } else {
            n nVar2 = this.k.get(nVar);
            if (nVar2 == null || nVar.equals(nVar2)) {
                g();
            } else if ((nVar2.getLocalExt().get("isPlayed") == null || !nVar2.getLocalExt().get("isPlayed").equals(PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) && nVar2.getDeleted() != 1) {
                a(nVar2);
            } else {
                b(nVar2);
            }
        }
    }

    public final void a(List<n> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f50356a, false, 50677, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50356a, false, 50677, new Class[]{List.class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            n nVar = list.get(i2);
            if (e(nVar) && !nVar.equals(this.m)) {
                this.k.put(this.m, nVar);
                this.m = nVar;
            }
        }
    }

    public final void a(AudioRecordBar audioRecordBar, AudioRecordStateView audioRecordStateView) {
        if (PatchProxy.isSupport(new Object[]{audioRecordBar, audioRecordStateView}, this, f50356a, false, 50665, new Class[]{AudioRecordBar.class, AudioRecordStateView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{audioRecordBar, audioRecordStateView}, this, f50356a, false, 50665, new Class[]{AudioRecordBar.class, AudioRecordStateView.class}, Void.TYPE);
            return;
        }
        this.f50358c = new f();
        this.f50358c.f50404f = this.o;
        this.f50358c.f50401c = this.n;
        this.f50359d = new d(audioRecordBar.getContext());
        this.f50359d.f50387e = this;
        this.f50360e = audioRecordBar;
        this.f50361f = audioRecordStateView;
        audioRecordBar.setListener(this.j);
        audioRecordBar.setStateView(audioRecordStateView);
        this.k = new HashMap<>();
        this.g = new CopyOnWriteArrayList<>();
    }
}
