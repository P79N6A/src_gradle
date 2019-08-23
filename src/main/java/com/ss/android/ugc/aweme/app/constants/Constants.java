package com.ss.android.ugc.aweme.app.constants;

import com.ss.android.g.a;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.app.q;
import com.ss.android.ugc.aweme.base.utils.u;

public final class Constants extends q {

    /* renamed from: a  reason: collision with root package name */
    public static final int f34102a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f34103b = u.a(64.0d);

    public @interface AdAwemeSource {
    }

    public @interface AdClickFrom {
    }

    public @interface AdMaskType {
    }

    public @interface AwemeType {
    }

    public @interface CouponSource {
    }

    public @interface CouponType {
    }

    public @interface FeedListType {
    }

    public @interface FeedPullType {
    }

    public @interface MainPageTabMode {
    }

    public @interface Restore {
    }

    static {
        int i;
        int i2 = 0;
        int i3 = BuildConfig.VERSION_CODE;
        try {
            if (a.b()) {
                try {
                    String[] split = BuildConfig.VERSION_NAME.split("\\.");
                    int length = split.length;
                    i = 0;
                    while (i2 < length) {
                        try {
                            i = (i * 100) + Integer.valueOf(split[i2]).intValue();
                            i2++;
                        } catch (Throwable th) {
                            th = th;
                            f34102a = i;
                            throw th;
                        }
                    }
                    i3 = i;
                } catch (Throwable th2) {
                    th = th2;
                    i = 0;
                    f34102a = i;
                    throw th;
                }
            }
            f34102a = i3;
        } catch (Throwable th3) {
            th = th3;
            i = BuildConfig.VERSION_CODE;
            f34102a = i;
            throw th;
        }
    }
}
