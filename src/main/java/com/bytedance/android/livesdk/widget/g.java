package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class g extends Dialog implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18467a;
    private static final /* synthetic */ a.C0900a g;

    /* renamed from: b  reason: collision with root package name */
    private TextView f18468b;

    /* renamed from: c  reason: collision with root package name */
    private View f18469c;

    /* renamed from: d  reason: collision with root package name */
    private View f18470d;

    /* renamed from: e  reason: collision with root package name */
    private DialogInterface.OnClickListener f18471e;

    /* renamed from: f  reason: collision with root package name */
    private DialogInterface.OnClickListener f18472f;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f18467a, true, 14394, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f18467a, true, 14394, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("GuardDialog.java", g.class);
        g = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.widget.GuardDialog", "android.view.View", NotifyType.VIBRATE, "", "void"), 66);
    }

    public final g a(DialogInterface.OnClickListener onClickListener) {
        this.f18471e = onClickListener;
        return this;
    }

    public final g b(DialogInterface.OnClickListener onClickListener) {
        this.f18472f = onClickListener;
        return this;
    }

    public g(@NonNull Context context) {
        this(context, C0906R.style.vz);
    }

    public final g a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f18467a, false, 14392, new Class[]{String.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{str}, this, f18467a, false, 14392, new Class[]{String.class}, g.class);
        }
        this.f18468b.setText(str);
        return this;
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f18467a, false, 14393, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18467a, false, 14393, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(g, this, this, view));
        if (view.getId() == C0906R.id.aly) {
            if (this.f18472f != null) {
                this.f18472f.onClick(this, 1);
            }
        } else if (view.getId() == C0906R.id.alw && this.f18471e != null) {
            this.f18471e.onClick(this, 2);
        }
    }

    private g(@NonNull Context context, int i) {
        super(context, C0906R.style.vz);
        if (PatchProxy.isSupport(new Object[0], this, f18467a, false, 14391, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18467a, false, 14391, new Class[0], Void.TYPE);
            return;
        }
        setContentView(LayoutInflater.from(getContext()).inflate(C0906R.layout.agd, null));
        this.f18468b = (TextView) findViewById(C0906R.id.alx);
        this.f18469c = findViewById(C0906R.id.aly);
        this.f18470d = findViewById(C0906R.id.alw);
        this.f18469c.setOnClickListener(this);
        this.f18470d.setOnClickListener(this);
    }
}
