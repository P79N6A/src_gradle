package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.a.c;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.a.a;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class b extends c<RegisterStatus> {

    /* renamed from: a  reason: collision with root package name */
    protected Handler f27273a;

    /* renamed from: b  reason: collision with root package name */
    protected ScheduledExecutorService f27274b;

    /* renamed from: c  reason: collision with root package name */
    protected int f27275c;

    public b(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
        this.f27274b = (ScheduledExecutorService) com.meizu.cloud.pushsdk.c.b.a.b.a();
        this.f27273a = new Handler(context.getMainLooper()) {
            public void handleMessage(Message message) {
                if (message.what == 0) {
                    b.this.m();
                }
            }
        };
    }

    public b(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.l = z;
    }

    public b(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
    }

    /* access modifiers changed from: protected */
    public void a(long j) {
        this.f27274b.schedule(new Runnable() {
            public void run() {
                b.this.o();
                b.this.f27273a.sendEmptyMessage(0);
            }
        }, j, TimeUnit.SECONDS);
    }

    public void a(RegisterStatus registerStatus) {
        PlatformMessageSender.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), registerStatus);
    }

    public boolean a() {
        DebugLogger.e("Strategy", "isBrandMeizu " + MzSystemUtils.isBrandMeizu(this.f27280e));
        return !TextUtils.isEmpty(this.f27281f) && !TextUtils.isEmpty(this.g);
    }

    /* access modifiers changed from: protected */
    public boolean a(String str, int i) {
        String o = o();
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(o) || (!str.startsWith(o) && (TextUtils.isEmpty(com.meizu.cloud.pushsdk.platform.a.a(str)) || !com.meizu.cloud.pushsdk.platform.a.a(str).startsWith(o))) || System.currentTimeMillis() / 1000 >= ((long) i);
    }

    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f27281f);
        intent.putExtra("app_key", this.g);
        intent.putExtra("strategy_package_name", this.f27280e.getPackageName());
        intent.putExtra("strategy_type", g());
        return intent;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public RegisterStatus b() {
        String str;
        RegisterStatus registerStatus = new RegisterStatus();
        registerStatus.setCode("20001");
        if (TextUtils.isEmpty(this.f27281f)) {
            str = "appId not empty";
        } else {
            if (TextUtils.isEmpty(this.g)) {
                str = "appKey not empty";
            }
            return registerStatus;
        }
        registerStatus.setMessage(str);
        return registerStatus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public RegisterStatus f() {
        return null;
    }

    /* renamed from: j */
    public RegisterStatus e() {
        RegisterStatus registerStatus = new RegisterStatus();
        String a2 = com.meizu.cloud.pushsdk.util.b.a(this.f27280e, this.h);
        int b2 = com.meizu.cloud.pushsdk.util.b.b(this.f27280e, this.h);
        if (!a(a2, b2)) {
            registerStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            registerStatus.setMessage("already register PushId,dont register frequently");
            registerStatus.setPushId(a2);
            registerStatus.setExpireTime((int) (((long) b2) - (System.currentTimeMillis() / 1000)));
        } else {
            com.meizu.cloud.pushsdk.util.b.f(this.f27280e, "", this.h);
            this.i = o();
            if (!TextUtils.isEmpty(this.i) || this.f27275c >= 3) {
                this.f27275c = 0;
                c a3 = this.j.a(this.f27281f, this.g, this.i);
                if (a3.b()) {
                    registerStatus = new RegisterStatus((String) a3.a());
                    DebugLogger.e("Strategy", "registerStatus " + registerStatus);
                    if (!TextUtils.isEmpty(registerStatus.getPushId())) {
                        com.meizu.cloud.pushsdk.util.b.f(this.f27280e, registerStatus.getPushId(), this.h);
                        com.meizu.cloud.pushsdk.util.b.a(this.f27280e, (int) ((System.currentTimeMillis() / 1000) + ((long) registerStatus.getExpireTime())), this.h);
                    }
                } else {
                    com.meizu.cloud.pushsdk.b.b.a c2 = a3.c();
                    if (c2.a() != null) {
                        DebugLogger.e("Strategy", "status code=" + c2.b() + " data=" + c2.a());
                    }
                    registerStatus.setCode(String.valueOf(c2.b()));
                    registerStatus.setMessage(c2.c());
                    DebugLogger.e("Strategy", "registerStatus " + registerStatus);
                }
            } else {
                DebugLogger.i("Strategy", "after " + (this.f27275c * 10) + " seconds start register");
                a((long) (this.f27275c * 10));
                this.f27275c = this.f27275c + 1;
                registerStatus.setCode("20000");
                registerStatus.setMessage("deviceId is empty");
            }
        }
        return registerStatus;
    }
}
