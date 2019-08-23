package com.bytedance.article.common.monitor;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.j.b;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class MonitorFPS {
    public static int INTEVERAL = 120;
    public static final Long MAX_INTERVAL = 1000L;
    public static final Long MONITOR_INTERVAL;
    public static final Long MONITOR_INTERVAL_NANOS;
    private static b.C0006b fpsTimerTask = new b.C0006b() {
        public final void a(long j) {
            if (!MonitorFPS.mTimerInfo.isEmpty()) {
                long j2 = j / 1000;
                Iterator<Map.Entry<String, a>> it2 = MonitorFPS.mTimerInfo.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry next = it2.next();
                    String str = (String) next.getKey();
                    a aVar = (a) next.getValue();
                    if (j2 - aVar.f19103c >= ((long) MonitorFPS.INTEVERAL)) {
                        it2.remove();
                        float f2 = aVar.f19102b / ((float) aVar.f19101a);
                        if (com.bytedance.apm.c.d()) {
                            new String[1][0] = "聚合 fps: " + str + " , value: " + f2;
                        }
                        float f3 = 60.0f;
                        if (f2 <= 60.0f) {
                            f3 = f2;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("fps", (double) f3);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("scene", str);
                            com.bytedance.apm.b.a("fps", str, jSONObject, jSONObject2, (JSONObject) null);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    };
    public static HashMap<String, a> mTimerInfo = new HashMap<>();
    public b mFPSFpsRecordView;
    public volatile boolean mFPSState;
    private Choreographer.FrameCallback mFrameCallback;
    public c mIFPSCallBack;
    public d mIFrameCallBack;
    public String mType;
    private WindowManager mWindowManager;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f19101a = 1;

        /* renamed from: b  reason: collision with root package name */
        public float f19102b;

        /* renamed from: c  reason: collision with root package name */
        public long f19103c;

        public a(int i, float f2, long j) {
            this.f19102b = f2;
            this.f19103c = j;
        }
    }

    class b extends View {

        /* renamed from: a  reason: collision with root package name */
        public long f19104a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f19105b;

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            if (this.f19104a == -1) {
                this.f19104a = SystemClock.elapsedRealtime();
                this.f19105b = 0;
            }
            if (MonitorFPS.this.mIFrameCallBack != null) {
                SystemClock.elapsedRealtime();
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f19104a;
            if (elapsedRealtime > MonitorFPS.MONITOR_INTERVAL.longValue()) {
                double d2 = (double) this.f19105b;
                double d3 = (double) elapsedRealtime;
                Double.isNaN(d2);
                Double.isNaN(d3);
                double d4 = d2 / d3;
                double longValue = (double) MonitorFPS.MAX_INTERVAL.longValue();
                Double.isNaN(longValue);
                MonitorFPS.monitorFPSOnTimer(MonitorFPS.this.mType, (float) (d4 * longValue));
                MonitorFPS.this.stop();
            }
            this.f19105b++;
        }

        public b(Context context) {
            super(context);
        }
    }

    public interface c {
    }

    public interface d {
    }

    public boolean getMonitorFPSStatus() {
        return this.mFPSState;
    }

    @TargetApi(16)
    private void startJellyBean() {
        this.mFrameCallback = new Choreographer.FrameCallback() {

            /* renamed from: b  reason: collision with root package name */
            private long f19097b = -1;

            /* renamed from: c  reason: collision with root package name */
            private int f19098c;

            public final void doFrame(long j) {
                if (this.f19097b == -1) {
                    this.f19097b = j;
                }
                long j2 = j - this.f19097b;
                if (j2 > MonitorFPS.MONITOR_INTERVAL_NANOS.longValue()) {
                    double d2 = (double) (((long) this.f19098c) * 1000 * 1000);
                    double d3 = (double) j2;
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    double d4 = d2 / d3;
                    double longValue = (double) MonitorFPS.MAX_INTERVAL.longValue();
                    Double.isNaN(longValue);
                    MonitorFPS.monitorFPSOnTimer(MonitorFPS.this.mType, (float) (d4 * longValue));
                    MonitorFPS.this.mFPSState = false;
                    return;
                }
                this.f19098c++;
                Choreographer.getInstance().postFrameCallback(this);
            }
        };
        Choreographer.getInstance().postFrameCallback(this.mFrameCallback);
    }

    public void start() {
        if (!this.mFPSState) {
            this.mFPSState = true;
            if (Build.VERSION.SDK_INT < 16) {
                startBase();
                return;
            }
            startJellyBean();
        }
    }

    static {
        Long l = 200L;
        MONITOR_INTERVAL = l;
        MONITOR_INTERVAL_NANOS = Long.valueOf(l.longValue() * 1000 * 1000);
        com.bytedance.apm.j.b.a().a(fpsTimerTask);
    }

    private void startBase() {
        this.mFPSFpsRecordView.f19104a = -1;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST, 0, -3);
        layoutParams.gravity = 51;
        layoutParams.flags = 24;
        layoutParams.height = 1;
        layoutParams.width = 1;
        try {
            this.mWindowManager.removeView(this.mFPSFpsRecordView);
        } catch (Exception unused) {
        }
        this.mWindowManager.addView(this.mFPSFpsRecordView, layoutParams);
        this.mFPSFpsRecordView.postDelayed(new Runnable() {
            public final void run() {
                if (MonitorFPS.this.mFPSState) {
                    MonitorFPS.this.mFPSFpsRecordView.invalidate();
                    MonitorFPS.this.mFPSFpsRecordView.postDelayed(this, 10);
                }
            }
        }, 10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mFPSState     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r4.mFPSState = r0     // Catch:{ all -> 0x0032 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0032 }
            r2 = 16
            if (r1 >= r2) goto L_0x0023
            android.view.WindowManager r1 = r4.mWindowManager     // Catch:{ Exception -> 0x0021 }
            com.bytedance.article.common.monitor.MonitorFPS$b r2 = r4.mFPSFpsRecordView     // Catch:{ Exception -> 0x0021 }
            r1.removeView(r2)     // Catch:{ Exception -> 0x0021 }
            com.bytedance.article.common.monitor.MonitorFPS$b r1 = r4.mFPSFpsRecordView     // Catch:{ Exception -> 0x0021 }
            r2 = -1
            r1.f19104a = r2     // Catch:{ Exception -> 0x0021 }
            com.bytedance.article.common.monitor.MonitorFPS$b r1 = r4.mFPSFpsRecordView     // Catch:{ Exception -> 0x0021 }
            r1.f19105b = r0     // Catch:{ Exception -> 0x0021 }
            monitor-exit(r4)
            return
        L_0x0021:
            monitor-exit(r4)
            return
        L_0x0023:
            android.view.Choreographer$FrameCallback r0 = r4.mFrameCallback     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0030
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()     // Catch:{ all -> 0x0032 }
            android.view.Choreographer$FrameCallback r1 = r4.mFrameCallback     // Catch:{ all -> 0x0032 }
            r0.removeFrameCallback(r1)     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r4)
            return
        L_0x0032:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.monitor.MonitorFPS.stop():void");
    }

    public void setIFPSCallBack(c cVar) {
        this.mIFPSCallBack = cVar;
    }

    public void setIFrameCallBack(d dVar) {
        this.mIFrameCallBack = dVar;
    }

    public static void monitorFPSOnTimer(final String str, final float f2) {
        com.bytedance.apm.j.b.a().a((Runnable) new Runnable() {
            public final void run() {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                String str = str;
                a aVar = MonitorFPS.mTimerInfo.get(str);
                if (aVar == null) {
                    aVar = new a(1, f2, currentTimeMillis);
                } else {
                    aVar.f19102b += f2;
                    aVar.f19101a++;
                }
                MonitorFPS.mTimerInfo.put(str, aVar);
                if (com.bytedance.apm.c.d()) {
                    new String[1][0] = "fps: " + str + " , value: " + f2;
                }
            }
        });
    }

    public MonitorFPS(Context context, String str) {
        this.mType = str;
        if (Build.VERSION.SDK_INT < 16) {
            this.mWindowManager = (WindowManager) context.getSystemService("window");
            this.mFPSFpsRecordView = new b(context);
        }
    }
}
