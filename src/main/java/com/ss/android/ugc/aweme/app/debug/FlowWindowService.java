package com.ss.android.ugc.aweme.app.debug;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.LogListActivity;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.bytex.a.a.a;

public class FlowWindowService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34148a;

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f34148a, false, 23347, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34148a, false, 23347, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f34148a, false, 23349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34148a, false, 23349, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, f34148a, false, 23348, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent, Integer.valueOf(i), Integer.valueOf(i2)}, this, f34148a, false, 23348, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[0], this, f34148a, false, 23350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34148a, false, 23350, new Class[0], Void.TYPE);
        } else {
            DmtButton dmtButton = new DmtButton(getApplicationContext());
            dmtButton.setText("Log");
            dmtButton.setBackgroundDrawable(a.a(k.a().getResources(), 2130840590));
            dmtButton.setWidth((int) UIUtils.dip2Px(k.a(), 50.0f));
            dmtButton.setHeight((int) UIUtils.dip2Px(k.a(), 50.0f));
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.type = 2002;
            layoutParams.format = 1;
            layoutParams.gravity = 51;
            layoutParams.flags = 40;
            layoutParams.width = (int) UIUtils.dip2Px(k.a(), 50.0f);
            layoutParams.height = (int) UIUtils.dip2Px(k.a(), 50.0f);
            layoutParams.x = UIUtils.getScreenWidth(k.a()) - ((int) UIUtils.dip2Px(k.a(), 55.0f));
            layoutParams.y = (int) UIUtils.dip2Px(k.a(), 120.0f);
            ((WindowManager) getSystemService("window")).addView(dmtButton, layoutParams);
            dmtButton.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34149a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f34149a, false, 23351, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f34149a, false, 23351, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (Build.VERSION.SDK_INT < 23) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) FlowWindowService.this, "请使用Android 5.0以上系统手机", 1).a();
                    } else if (Settings.canDrawOverlays(FlowWindowService.this)) {
                        Intent intent = new Intent(FlowWindowService.this, LogListActivity.class);
                        intent.addFlags(268435456);
                        FlowWindowService.this.startActivity(intent);
                    } else {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) FlowWindowService.this, "请先授予抖音悬浮窗权限", 1).a();
                    }
                }
            });
        }
        return super.onStartCommand(intent, i, i2);
    }
}
