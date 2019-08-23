package com.hianalytics.android.v1;

import android.content.Context;
import android.os.Handler;
import com.hianalytics.android.a.a.a;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class HiAnalytics {
    private static int reportPeriod = 0;
    private static ScheduledExecutorService scheduler = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1);
    private static boolean timerOn = false;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i) {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a());
        }
    }

    public static void onEvent(Context context, String str, String str2) {
        if (context == null) {
            a.h();
        } else if (str == null || str.equals("")) {
            a.h();
        } else if (str2 == null || str2.equals("")) {
            a.h();
        } else {
            Handler g = a.g();
            if (g != null) {
                a aVar = new a(context, str, str2, System.currentTimeMillis());
                g.post(aVar);
                new StringBuilder(String.valueOf(context.getClass().getName())).append(" onEvent!");
            }
            a.h();
        }
    }

    public static void onPause(Context context) {
        if (context == null) {
            a.h();
            return;
        }
        Handler g = a.g();
        if (g != null) {
            g.post(new d(context, 0, System.currentTimeMillis()));
            new StringBuilder(String.valueOf(context.getClass().getName())).append(" onPause() !");
        }
        a.h();
    }

    public static void onReport(Context context) {
        if (context == null) {
            a.h();
            return;
        }
        Handler g = a.g();
        if (g != null) {
            g.post(new d(context, 2, System.currentTimeMillis()));
            new StringBuilder(String.valueOf(context.getClass().getName())).append(" onReport !");
        }
        a.h();
    }

    public static void onResume(Context context) {
        if (context == null) {
            a.h();
            return;
        }
        Handler g = a.g();
        if (g != null) {
            g.post(new d(context, 1, System.currentTimeMillis()));
            new StringBuilder(String.valueOf(context.getClass().getName())).append(" onResume() !");
        }
        a.h();
    }

    public static void setEventSize(int i) {
        if (i >= 0) {
            a.a(i);
        }
    }

    public static void setMaxMsg(Long l) {
        if (l.longValue() >= 1000) {
            a.c(l);
        }
    }

    public static void setMaxSessionIDTimeOut(long j) {
        if (j >= 30) {
            a.d(Long.valueOf(j * 60));
        }
    }

    public static void setRecordExpireTimeOut(Long l) {
        if (l.longValue() >= 24) {
            a.b(Long.valueOf(l.longValue() * 60 * 60));
        }
    }

    public static void setReportTimer(Context context, int i) {
        if (i == 0) {
            try {
                timerOn = false;
                scheduler.shutdown();
                scheduler = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1);
            } catch (Exception e2) {
                new StringBuilder("setReportTimer() throw exception:").append(e2.getMessage());
                a.h();
            }
        } else if (!timerOn) {
            timerOn = true;
            a.h();
            long j = (long) i;
            scheduler.scheduleAtFixedRate(new d(context, 2, System.currentTimeMillis()), j, j, TimeUnit.SECONDS);
        } else {
            if (timerOn && i != reportPeriod) {
                reportPeriod = i;
                a.h();
                scheduler.shutdown();
                ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1);
                scheduler = com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool;
                long j2 = (long) i;
                com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool.scheduleAtFixedRate(new d(context, 2, System.currentTimeMillis()), j2, j2, TimeUnit.SECONDS);
            }
        }
    }

    public static void setReportWhenFull(boolean z) {
        a.a(z);
    }

    public static void setSessionExpireTimeOut(Long l) {
        if (l.longValue() >= 30) {
            a.a(l);
        }
    }
}
