package com.ss.android.ugc.aweme.profile.ui.widget;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63112a;

    public a(Context context) {
        this(context, (byte) 0);
    }

    private a(Context context, byte b2) {
        this(context, null, 0);
    }

    private a(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, null, 0);
        if (PatchProxy.isSupport(new Object[]{context}, this, f63112a, false, 69676, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63112a, false, 69676, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.aqz, this);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        inflate.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f63113a;

            public final void onClick(View view) {
                boolean z = true;
                if (PatchProxy.isSupport(new Object[]{view}, this, f63113a, false, 69679, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f63113a, false, 69679, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                a aVar = a.this;
                if (PatchProxy.isSupport(new Object[0], aVar, a.f63112a, false, 69677, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, a.f63112a, false, 69677, new Class[0], Void.TYPE);
                    return;
                }
                if (PatchProxy.isSupport(new Object[0], aVar, a.f63112a, false, 69678, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], aVar, a.f63112a, false, 69678, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (ContextCompat.checkSelfPermission(aVar.getContext(), "android.permission.READ_CONTACTS") != 0) {
                    ActivityCompat.requestPermissions((Activity) aVar.getContext(), new String[]{"android.permission.READ_CONTACTS"}, 1);
                    z = false;
                }
                if (z) {
                    ComponentName componentName = new ComponentName(aVar.getContext().getPackageName(), "com.ss.android.ugc.aweme.friends.ui.ContactsActivity");
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    aVar.getContext().startActivity(intent);
                    return;
                }
                com.bytedance.ies.dmt.ui.d.a.c(aVar.getContext(), (int) C0906R.string.eh).a();
            }
        });
    }
}
