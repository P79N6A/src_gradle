package com.umeng.commonsdk.statistics.common;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.Defcon;

public class ReportPolicy {

    public static class DebugPolicy extends ReportStrategy {
        private final long ReportInterval = ea.f66827f;
        private StatTracer mTracer;

        public DebugPolicy(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        public boolean shouldSendMessage(boolean z) {
            if (System.currentTimeMillis() - UMEnvelopeBuild.lastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= ea.f66827f) {
                return true;
            }
            return false;
        }
    }

    public static class DefconPolicy extends ReportStrategy {
        private Defcon defcon;
        private StatTracer tracer;

        public boolean isValid() {
            return this.defcon.isOpen();
        }

        public boolean shouldSendMessageByInstant() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - UMEnvelopeBuild.lastInstantBuildTime(UMModuleRegister.getAppContext()) >= this.defcon.getReqInterval()) {
                return true;
            }
            return false;
        }

        public boolean shouldSendMessage(boolean z) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - UMEnvelopeBuild.lastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.defcon.getReqInterval()) {
                return true;
            }
            return false;
        }

        public DefconPolicy(StatTracer statTracer, Defcon defcon2) {
            this.tracer = statTracer;
            this.defcon = defcon2;
        }
    }

    public static class LatentPolicy extends ReportStrategy {
        private long latency;
        private long start = System.currentTimeMillis();

        public boolean isValid() {
            if (System.currentTimeMillis() - this.start < this.latency) {
                return true;
            }
            return false;
        }

        public LatentPolicy(int i) {
            this.latency = (long) i;
        }

        public boolean shouldSendMessage(boolean z) {
            if (System.currentTimeMillis() - this.start >= this.latency) {
                return true;
            }
            return false;
        }
    }

    public static class ReportAtLaunch extends ReportStrategy {
        public boolean shouldSendMessage(boolean z) {
            return z;
        }
    }

    public static class ReportByInterval extends ReportStrategy {
        private static long MAX_REPORT_INTERVAL = 86400000;
        private static long MIN_REPORT_INTERVAL = 90000;
        private long mReportInterval;
        private StatTracer mTracer;

        public long getReportInterval() {
            return this.mReportInterval;
        }

        public static boolean isValidValue(int i) {
            if (((long) i) < MIN_REPORT_INTERVAL) {
                return false;
            }
            return true;
        }

        public void setReportInterval(long j) {
            if (j < MIN_REPORT_INTERVAL || j > MAX_REPORT_INTERVAL) {
                this.mReportInterval = MIN_REPORT_INTERVAL;
            } else {
                this.mReportInterval = j;
            }
        }

        public boolean shouldSendMessage(boolean z) {
            if (!z && System.currentTimeMillis() - UMEnvelopeBuild.lastSuccessfulBuildTime(UMModuleRegister.getAppContext()) < this.mReportInterval) {
                return false;
            }
            return true;
        }

        public ReportByInterval(StatTracer statTracer, long j) {
            this.mTracer = statTracer;
            setReportInterval(j);
        }
    }

    public static class ReportDaily extends ReportStrategy {
        private long HOURS_DAY = 86400000;
        private StatTracer mTracer;

        public ReportDaily(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        public boolean shouldSendMessage(boolean z) {
            if (System.currentTimeMillis() - UMEnvelopeBuild.lastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= this.HOURS_DAY) {
                return true;
            }
            return false;
        }
    }

    public static class ReportQuasiRealtime extends ReportStrategy {
        private static long MAX_REPORT_INTERVAL = 90000;
        private static long MIN_REPORT_INTERVAL = 15000;
        private long mReportInterval;

        public boolean shouldSendMessage(boolean z) {
            return true;
        }

        public long getReportInterval() {
            return this.mReportInterval;
        }

        public void setReportInterval(long j) {
            if (j < MIN_REPORT_INTERVAL || j > MAX_REPORT_INTERVAL) {
                this.mReportInterval = MIN_REPORT_INTERVAL;
            } else {
                this.mReportInterval = j;
            }
        }
    }

    public static class ReportRealtime extends ReportStrategy {
        public boolean shouldSendMessage(boolean z) {
            return true;
        }
    }

    public static class ReportStrategy {
        public boolean isValid() {
            return true;
        }

        public boolean shouldSendMessage(boolean z) {
            return true;
        }
    }

    public static class ReportWifiOnly extends ReportStrategy {
        private Context mContext;

        public ReportWifiOnly(Context context) {
            this.mContext = context;
        }

        public boolean shouldSendMessage(boolean z) {
            return DeviceConfig.isWiFiAvailable(this.mContext);
        }
    }

    public static class SmartPolicy extends ReportStrategy {
        private final long ReportInterval = 10800000;
        private StatTracer mTracer;

        public SmartPolicy(StatTracer statTracer) {
            this.mTracer = statTracer;
        }

        public boolean shouldSendMessage(boolean z) {
            if (System.currentTimeMillis() - UMEnvelopeBuild.lastSuccessfulBuildTime(UMModuleRegister.getAppContext()) >= 10800000) {
                return true;
            }
            return false;
        }
    }

    public static boolean isValid(int i) {
        if (!(i == 8 || i == 11)) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
