package com.meizu.cloud.pushsdk.platform.b;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.b.a.c;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.a.a;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import java.util.concurrent.ScheduledExecutorService;

public class e extends c<SubTagsStatus> {

    /* renamed from: a  reason: collision with root package name */
    private String f27286a;

    /* renamed from: b  reason: collision with root package name */
    private int f27287b;

    /* renamed from: c  reason: collision with root package name */
    private String f27288c;

    public e(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public e(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.l = z;
    }

    public e(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.f27287b = 3;
    }

    public e(Context context, String str, String str2, String str3, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.f27286a = str3;
    }

    public void a(int i) {
        this.f27287b = i;
    }

    /* access modifiers changed from: protected */
    public void a(SubTagsStatus subTagsStatus) {
        PlatformMessageSender.a(this.f27280e, !TextUtils.isEmpty(this.h) ? this.h : this.f27280e.getPackageName(), subTagsStatus);
    }

    public void a(String str) {
        this.f27288c = str;
    }

    /* access modifiers changed from: protected */
    public boolean a() {
        return !TextUtils.isEmpty(this.f27281f) && !TextUtils.isEmpty(this.g) && !TextUtils.isEmpty(this.f27286a);
    }

    /* access modifiers changed from: protected */
    public Intent c() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.f27281f);
        intent.putExtra("app_key", this.g);
        intent.putExtra("strategy_package_name", this.f27280e.getPackageName());
        intent.putExtra("push_id", this.f27286a);
        intent.putExtra("strategy_type", g());
        intent.putExtra("strategy_child_type", this.f27287b);
        intent.putExtra("strategy_params", this.f27288c);
        return intent;
    }

    public void e(String str) {
        this.f27286a = str;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public SubTagsStatus b() {
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        subTagsStatus.setCode("20001");
        if (TextUtils.isEmpty(this.f27281f)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.g)) {
            str = "appKey not empty";
        } else {
            if (TextUtils.isEmpty(this.f27286a)) {
                str = "pushId not empty";
            }
            return subTagsStatus;
        }
        subTagsStatus.setMessage(str);
        return subTagsStatus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public SubTagsStatus e() {
        c cVar;
        String str;
        StringBuilder sb;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        switch (this.f27287b) {
            case 0:
                cVar = this.j.a(this.f27281f, this.g, this.f27286a, this.f27288c);
                break;
            case 1:
                cVar = this.j.b(this.f27281f, this.g, this.f27286a, this.f27288c);
                break;
            case 2:
                cVar = this.j.d(this.f27281f, this.g, this.f27286a);
                break;
            case 3:
                cVar = this.j.e(this.f27281f, this.g, this.f27286a);
                break;
            default:
                cVar = null;
                break;
        }
        if (cVar.b()) {
            subTagsStatus = new SubTagsStatus((String) cVar.a());
            str = "Strategy";
            sb = new StringBuilder("network subTagsStatus ");
        } else {
            com.meizu.cloud.pushsdk.b.b.a c2 = cVar.c();
            if (c2.a() != null) {
                DebugLogger.e("Strategy", "status code=" + c2.b() + " data=" + c2.a());
            }
            subTagsStatus.setCode(String.valueOf(c2.b()));
            subTagsStatus.setMessage(c2.c());
            str = "Strategy";
            sb = new StringBuilder("subTagsStatus ");
        }
        sb.append(subTagsStatus);
        DebugLogger.e(str, sb.toString());
        return subTagsStatus;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public SubTagsStatus f() {
        return null;
    }
}
