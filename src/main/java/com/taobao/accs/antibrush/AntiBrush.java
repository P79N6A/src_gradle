package com.taobao.accs.antibrush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.g;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class AntiBrush {
    private static String mHost;
    private static volatile boolean mIsInCheckCodeActivity;
    private static ScheduledFuture<?> mTimeoutTask;
    private BroadcastReceiver mAntiAttackReceiver;
    public Context mContext;

    public static class AntiReceiver extends BroadcastReceiver {
        /* JADX WARNING: type inference failed for: r4v1, types: [boolean, int] */
        public void onReceive(Context context, Intent intent) {
            boolean z = 0;
            try {
                String stringExtra = intent.getStringExtra("Result");
                ALog.e("AntiBrush", "anti onReceive result: " + stringExtra, new Object[z]);
                z = stringExtra.equalsIgnoreCase("success");
            } catch (Exception e2) {
                ALog.e("AntiBrush", "anti onReceive", e2, new Object[z]);
            } finally {
                AntiBrush.onResult(GlobalClientInfo.getContext(), z);
            }
        }
    }

    public AntiBrush(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void handleantiBrush(String str) {
        if (mIsInCheckCodeActivity) {
            ALog.e("AntiBrush", "handleantiBrush return", "mIsInCheckCodeActivity", Boolean.valueOf(mIsInCheckCodeActivity));
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("mtopsdk.mtop.antiattack.checkcode.validate.activity_action");
            intent.setPackage(this.mContext.getPackageName());
            intent.setFlags(268435456);
            intent.putExtra("Location", str);
            ALog.e("AntiBrush", "handleAntiBrush:", new Object[0]);
            this.mContext.startActivity(intent);
            mIsInCheckCodeActivity = true;
            if (this.mAntiAttackReceiver == null) {
                this.mAntiAttackReceiver = new AntiReceiver();
            }
            this.mContext.registerReceiver(this.mAntiAttackReceiver, new IntentFilter("mtopsdk.extra.antiattack.result.notify.action"));
        } catch (Throwable th) {
            ALog.e("AntiBrush", "handleantiBrush", th, new Object[0]);
        }
    }

    public static void onResult(Context context, boolean z) {
        mIsInCheckCodeActivity = false;
        Intent intent = new Intent("com.taobao.accs.intent.action.RECEIVE");
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", 104);
        intent.putExtra("anti_brush_ret", z);
        g.a(context, intent);
        if (mTimeoutTask != null) {
            mTimeoutTask.cancel(true);
            mTimeoutTask = null;
        }
        if (mHost != null) {
            UtilityImpl.b(context, b.a(mHost));
        }
    }

    public boolean checkAntiBrush(URL url, Map<Integer, String> map) {
        int i;
        boolean z = true;
        if (map != null) {
            try {
                if (UtilityImpl.j(this.mContext)) {
                    String str = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_STATUS.ordinal()));
                    if (TextUtils.isEmpty(str)) {
                        i = 0;
                    } else {
                        i = Integer.valueOf(str).intValue();
                    }
                    if (i == 419) {
                        String str2 = map.get(Integer.valueOf(TaoBaseService.ExtHeaderType.TYPE_LOCATION.ordinal()));
                        if (!TextUtils.isEmpty(str2)) {
                            ALog.e("AntiBrush", "start anti bursh location:" + str2, new Object[0]);
                            handleantiBrush(str2);
                            String str3 = null;
                            if (mTimeoutTask != null) {
                                mTimeoutTask.cancel(true);
                                mTimeoutTask = null;
                            }
                            mTimeoutTask = ThreadPoolExecutorFactory.schedule(new a(this), 60000, TimeUnit.MILLISECONDS);
                            if (url != null) {
                                str3 = url.getHost();
                            }
                            mHost = str3;
                            if (!TextUtils.isEmpty(GlobalClientInfo.f78905c) && TextUtils.isEmpty(b.a(mHost))) {
                                ALog.e("AntiBrush", "cookie invalid, clear", new Object[0]);
                                UtilityImpl.q(this.mContext);
                            }
                            return z;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                z = false;
                ALog.e("AntiBrush", "checkAntiBrush error", th, new Object[0]);
                return z;
            }
        }
        z = false;
        try {
            ALog.e("AntiBrush", "cookie invalid, clear", new Object[0]);
            UtilityImpl.q(this.mContext);
        } catch (Throwable th2) {
            th = th2;
            ALog.e("AntiBrush", "checkAntiBrush error", th, new Object[0]);
            return z;
        }
        return z;
    }
}
