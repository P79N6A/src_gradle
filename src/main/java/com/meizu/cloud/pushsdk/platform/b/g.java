package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.a.c;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.a.a;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.b;
import java.util.concurrent.ScheduledExecutorService;

public class g extends c<UnRegisterStatus> {
    public g(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
    }

    public g(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.l = z;
    }

    public g(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
    }

    /* access modifiers changed from: protected */
    public void a(UnRegisterStatus unRegisterStatus) {
        PlatformMessageSender.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), unRegisterStatus);
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return !TextUtils.isEmpty(this.f27281f) && !TextUtils.isEmpty(this.g);
    }

    /* access modifiers changed from: protected */
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
        return 32;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public UnRegisterStatus b() {
        String str;
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        unRegisterStatus.setCode("20001");
        if (TextUtils.isEmpty(this.f27281f)) {
            str = "appId not empty";
        } else {
            if (TextUtils.isEmpty(this.g)) {
                str = "appKey not empty";
            }
            return unRegisterStatus;
        }
        unRegisterStatus.setMessage(str);
        return unRegisterStatus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public UnRegisterStatus e() {
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        if (TextUtils.isEmpty(b.a(this.f27280e, this.h))) {
            unRegisterStatus.setCode(BasicPushStatus.SUCCESS_CODE);
            unRegisterStatus.setMessage("already unRegister PushId,dont unRegister frequently");
            unRegisterStatus.setIsUnRegisterSuccess(true);
        } else {
            this.i = o();
            c b2 = this.j.b(this.f27281f, this.g, this.i);
            if (b2.b()) {
                unRegisterStatus = new UnRegisterStatus((String) b2.a());
                DebugLogger.e("Strategy", "network unRegisterStatus " + unRegisterStatus);
                if (BasicPushStatus.SUCCESS_CODE.equals(unRegisterStatus.getCode())) {
                    b.f(this.f27280e, "", this.h);
                }
            } else {
                com.meizu.cloud.pushsdk.b.b.a c2 = b2.c();
                if (c2.a() != null) {
                    DebugLogger.e("Strategy", "status code=" + c2.b() + " data=" + c2.a());
                }
                unRegisterStatus.setCode(String.valueOf(c2.b()));
                unRegisterStatus.setMessage(c2.c());
                DebugLogger.e("Strategy", "unRegisterStatus " + unRegisterStatus);
            }
        }
        return unRegisterStatus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public UnRegisterStatus f() {
        return null;
    }
}
