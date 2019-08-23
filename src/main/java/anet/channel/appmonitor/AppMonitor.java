package anet.channel.appmonitor;

import anet.channel.statist.AlarmObject;
import anet.channel.statist.CountObject;
import anet.channel.statist.StatObject;

public class AppMonitor {
    public static volatile IAppMonitor apmMonitor = null;
    private static volatile IAppMonitor appMonitor = new a(null);

    static class a implements IAppMonitor {

        /* renamed from: a  reason: collision with root package name */
        IAppMonitor f1159a;

        @Deprecated
        public void register() {
        }

        @Deprecated
        public void register(Class<?> cls) {
        }

        a(IAppMonitor iAppMonitor) {
            this.f1159a = iAppMonitor;
        }

        public void commitAlarm(AlarmObject alarmObject) {
            if (this.f1159a != null) {
                this.f1159a.commitAlarm(alarmObject);
            }
        }

        public void commitCount(CountObject countObject) {
            if (this.f1159a != null) {
                this.f1159a.commitCount(countObject);
            }
        }

        public void commitStat(StatObject statObject) {
            if (AppMonitor.apmMonitor != null) {
                AppMonitor.apmMonitor.commitStat(statObject);
            }
            if (this.f1159a != null) {
                this.f1159a.commitStat(statObject);
            }
        }
    }

    public static IAppMonitor getInstance() {
        return appMonitor;
    }

    public static void setApmMonitor(IAppMonitor iAppMonitor) {
        apmMonitor = iAppMonitor;
    }

    public static void setInstance(IAppMonitor iAppMonitor) {
        appMonitor = new a(iAppMonitor);
    }
}
