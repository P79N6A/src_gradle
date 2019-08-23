package com.bytedance.common.wschannel.channel.impl.ok.policy;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import okhttp3.Response;

public class RetryIntervalPolicy implements RetryPolicy {
    private final Context mContext;
    private int mReconnectTimes;

    public void reset() {
        this.mReconnectTimes = 0;
    }

    public long getRandomInterval() {
        return (long) ((Math.random() * 4500.0d) + 500.0d);
    }

    public long getNextRetryInterval() {
        if (!isNetworkAvailable(this.mContext)) {
            return -1;
        }
        this.mReconnectTimes++;
        double min = (double) Math.min(((long) (1 << this.mReconnectTimes)) * 5000, 120000);
        Double.isNaN(min);
        return (long) (min + (Math.random() * 10.0d * 1000.0d));
    }

    RetryIntervalPolicy(Context context) {
        this.mContext = context;
    }

    private static boolean isNetworkAvailable(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public long getRetryIntervalWithResponse(Response response) {
        long nextRetryInterval = getNextRetryInterval();
        if (nextRetryInterval == -1) {
            return -1;
        }
        if (response != null) {
            try {
                if (!response.isSuccessful()) {
                    int code = response.code();
                    if (code == 414 || code == 511 || code == 512) {
                        String header = response.header("Handshake-Options");
                        if (header != null) {
                            String[] split = header.split(";");
                            int length = split.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    break;
                                }
                                String str = split[i];
                                if (!TextUtils.isEmpty(str)) {
                                    String[] split2 = str.split("=");
                                    if ("reconnect-interval".equals(split2[0])) {
                                        try {
                                            nextRetryInterval = 1000 * Long.parseLong(split2[1]);
                                            break;
                                        } catch (NumberFormatException unused) {
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                                i++;
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return nextRetryInterval;
    }
}
