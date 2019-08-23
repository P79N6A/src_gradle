package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.notification.c.b;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.concurrent.ScheduledExecutorService;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private int[] f27270a;

    /* renamed from: b  reason: collision with root package name */
    private int f27271b;

    /* renamed from: c  reason: collision with root package name */
    private String f27272c;

    public a(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.a.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.k = MinSdkChecker.isSupportSetDrawableSmallIcon();
    }

    public a(Context context, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, null, null, null, scheduledExecutorService);
        this.l = z;
    }

    public void a(int i) {
        this.f27271b = i;
    }

    /* access modifiers changed from: protected */
    public void a(BasicPushStatus basicPushStatus) {
    }

    public void a(String str) {
        this.f27272c = str;
    }

    public void a(int... iArr) {
        this.f27270a = iArr;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return this.f27271b == 0 || (this.f27270a != null && this.f27270a.length > 0 && this.f27271b == 1) || (this.f27271b == 2 && !TextUtils.isEmpty(this.f27272c));
    }

    /* access modifiers changed from: protected */
    public BasicPushStatus b() {
        return null;
    }

    /* access modifiers changed from: protected */
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("strategy_package_name", this.f27280e.getPackageName());
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f27271b);
        if (this.f27271b == 2) {
            intent.putExtra("strategy_params", this.f27272c);
            return intent;
        } else if (this.f27271b == 1) {
            return null;
        } else {
            return intent;
        }
    }

    /* access modifiers changed from: protected */
    public Intent[] d() {
        if (this.f27270a == null) {
            return null;
        }
        Intent[] intentArr = new Intent[this.f27270a.length];
        for (int i = 0; i < this.f27270a.length; i++) {
            DebugLogger.i("Strategy", "send notifyId " + this.f27270a[i] + " to PushManagerService");
            Intent intent = new Intent();
            intent.putExtra("strategy_package_name", this.f27280e.getPackageName());
            intent.putExtra("strategy_type", g());
            intent.putExtra("strategy_child_type", this.f27271b);
            intent.putExtra("strategy_params", this.f27270a[i]);
            intentArr[i] = intent;
        }
        return intentArr;
    }

    /* access modifiers changed from: protected */
    public BasicPushStatus e() {
        switch (this.f27271b) {
            case 0:
                if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                    DebugLogger.e("Strategy", "android 6.0 blow so cancel all by context");
                    b.a(this.f27280e);
                }
                b.a(this.f27280e, this.h);
                break;
            case 1:
                if (this.f27270a != null) {
                    for (int a2 : this.f27270a) {
                        DebugLogger.e("Strategy", "clear notifyId " + a2);
                        b.a(this.f27280e, this.h, a2);
                    }
                    break;
                }
                break;
            case 2:
                b.a(this.f27280e, this.h, this.f27272c);
                break;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public BasicPushStatus f() {
        return null;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 64;
    }
}
