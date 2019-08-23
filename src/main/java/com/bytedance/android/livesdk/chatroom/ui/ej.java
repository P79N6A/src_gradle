package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public final class ej extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f12149a;

    /* renamed from: b  reason: collision with root package name */
    public a f12150b;

    /* renamed from: c  reason: collision with root package name */
    private String f12151c;

    /* renamed from: d  reason: collision with root package name */
    private String f12152d;

    public interface a {
        void a();

        void b();

        void c();
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f12149a, false, 6288, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f12149a, false, 6288, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.alf);
        if (!TextUtils.isEmpty(this.f12151c)) {
            ((TextView) findViewById(C0906R.id.dc1)).setText(this.f12151c);
        }
        TextView textView = (TextView) findViewById(C0906R.id.bq5);
        if (!TextUtils.isEmpty(this.f12152d)) {
            textView.setText(this.f12152d);
        }
        findViewById(C0906R.id.bq5).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12153a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f12154c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f12153a, true, 6290, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f12153a, true, 6290, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("NetworkFreeDialog.java", AnonymousClass1.class);
                f12154c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.NetworkFreeDialog$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 75);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f12153a, false, 6289, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f12153a, false, 6289, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f12154c, this, this, view));
                f.a(TTLiveSDKContext.getHostService().a().a());
                if (ej.this.f12150b != null) {
                    ej.this.f12150b.a();
                }
            }
        });
        findViewById(C0906R.id.buz).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12156a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f12157c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f12156a, true, 6292, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f12156a, true, 6292, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("NetworkFreeDialog.java", AnonymousClass2.class);
                f12157c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.NetworkFreeDialog$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 87);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f12156a, false, 6291, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f12156a, false, 6291, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f12157c, this, this, view));
                f.a(TTLiveSDKContext.getHostService().a().a());
                if (ej.this.f12150b != null) {
                    ej.this.f12150b.b();
                }
                ej.this.dismiss();
            }
        });
        findViewById(C0906R.id.q2).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f12159a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f12160c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f12159a, true, 6294, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f12159a, true, 6294, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("NetworkFreeDialog.java", AnonymousClass3.class);
                f12160c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.chatroom.ui.NetworkFreeDialog$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 97);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f12159a, false, 6293, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f12159a, false, 6293, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f12160c, this, this, view));
                f.a(TTLiveSDKContext.getHostService().a().a());
                if (ej.this.f12150b != null) {
                    ej.this.f12150b.c();
                }
                ej.this.dismiss();
            }
        });
    }

    public ej(@NonNull Context context, a aVar) {
        super(context);
        setCanceledOnTouchOutside(false);
        this.f12150b = aVar;
        f.a(context);
    }
}
