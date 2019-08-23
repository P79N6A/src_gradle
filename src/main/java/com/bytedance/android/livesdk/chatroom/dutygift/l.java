package com.bytedance.android.livesdk.chatroom.dutygift;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.event.aa;
import com.bytedance.android.livesdk.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class l extends e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10002a;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f10003c;

    /* renamed from: b  reason: collision with root package name */
    private View.OnClickListener f10004b;

    public final int a() {
        return C0906R.layout.afu;
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f10002a, true, 4180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f10002a, true, 4180, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("DutyGiftDialog.java", l.class);
        f10003c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.dutygift.DutyGiftDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 44);
    }

    public void onClick(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f10002a, false, 4179, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f10002a, false, 4179, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f10003c, this, this, view2));
        if (view.getId() == C0906R.id.b1j) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new aa("https://webcast.huoshan.com/falcon/webcast_huoshan/page/gift_task_intro/", ""));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10002a, false, 4178, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f10002a, false, 4178, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        findViewById(C0906R.id.ajp).setOnClickListener(this.f10004b);
        findViewById(C0906R.id.b1j).setOnClickListener(this);
    }

    public l(Context context, View.OnClickListener onClickListener) {
        super(context);
        this.f10004b = onClickListener;
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }
}
