package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import com.bytedance.android.livesdk.widget.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class em extends e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12168a;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f12169c;

    /* renamed from: b  reason: collision with root package name */
    public a f12170b;

    public interface a {
        void h();

        void i();
    }

    public final int a() {
        return C0906R.layout.agv;
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f12168a, true, 6335, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f12168a, true, 6335, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("RadioLiveBackgroundDialog.java", em.class);
        f12169c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.RadioLiveBackgroundDialog", "android.view.View", "view", "", "void"), 49);
    }

    public em(@NonNull Context context) {
        super(context);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f12168a, false, 6334, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f12168a, false, 6334, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f12169c, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.c_7) {
            this.f12170b.h();
        } else if (id == C0906R.id.c_8) {
            this.f12170b.i();
        }
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12168a, false, 6333, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12168a, false, 6333, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        findViewById(C0906R.id.c_7).setOnClickListener(this);
        findViewById(C0906R.id.c_8).setOnClickListener(this);
        findViewById(C0906R.id.c_6).setOnClickListener(this);
    }
}
