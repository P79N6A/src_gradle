package com.ss.android.ugc.aweme.app.debug;

import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.annotation.AbBooleanField;
import com.ss.android.ugc.aweme.setting.annotation.AbIntField;
import com.ss.android.ugc.aweme.setting.annotation.d;
import com.ss.android.ugc.aweme.setting.ui.a;
import com.ss.android.ugc.aweme.setting.ui.b;
import java.lang.reflect.Field;
import java.util.TreeMap;

@Deprecated
public class AbTestSettingActivity extends AbsABActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34125a;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f34125a, false, 23315, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f34125a, false, 23315, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f34125a, false, 23316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34125a, false, 23316, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34125a, false, 23317, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34125a, false, 23317, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f34125a, false, 23314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34125a, false, 23314, new Class[0], Void.TYPE);
            return;
        }
        this.f2650f = AbTestManager.a().d();
        Field[] declaredFields = this.f2650f.getClass().getDeclaredFields();
        TreeMap treeMap = new TreeMap();
        TreeMap treeMap2 = new TreeMap();
        for (Field field : declaredFields) {
            if (((AbBooleanField) field.getAnnotation(AbBooleanField.class)) != null && field.getType().equals(Boolean.TYPE)) {
                treeMap2.put(field.getName(), field);
            } else if (((AbIntField) field.getAnnotation(AbIntField.class)) != null && field.getType().equals(Integer.TYPE)) {
                treeMap.put(new d(field, this.f2650f).b(), field);
            }
        }
        for (Field a2 : treeMap2.values()) {
            b bVar = new b(this);
            bVar.a(a2, this.f2650f);
            this.f2649e.addView(bVar);
        }
        for (Field a3 : treeMap.values()) {
            a aVar = new a(this);
            aVar.a(a3, this.f2650f);
            this.f2649e.addView(aVar);
        }
    }
}
