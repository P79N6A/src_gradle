package com.ss.android.ugc.aweme.setting.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.dmt.ui.widget.setting.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.a.a;
import com.ss.android.ugc.aweme.setting.annotation.AbBooleanField;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.reflect.Field;

public final class b extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64411a;

    /* renamed from: b  reason: collision with root package name */
    public SettingItemSwitch f64412b;

    /* renamed from: c  reason: collision with root package name */
    private Field f64413c;

    public b(Context context) {
        this(context, null);
    }

    private b(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(final Field field, final Object obj) {
        if (PatchProxy.isSupport(new Object[]{field, obj}, this, f64411a, false, 72357, new Class[]{Field.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{field, obj}, this, f64411a, false, 72357, new Class[]{Field.class, Object.class}, Void.TYPE);
        } else if (field.getType().equals(Boolean.TYPE)) {
            this.f64413c = field;
            this.f64413c.setAccessible(true);
            try {
                b(field, obj);
                this.f64412b.setOnSettingItemClickListener(new b.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64414a;

                    public final void OnSettingItemClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f64414a, false, 72359, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f64414a, false, 72359, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        try {
                            if (b.this.f64412b.a()) {
                                field.set(obj, Boolean.FALSE);
                            } else {
                                field.set(obj, Boolean.TRUE);
                            }
                            b.this.b(field, obj);
                            bg.a(new a());
                        } catch (IllegalAccessException unused) {
                        }
                    }
                });
            } catch (IllegalAccessException unused) {
            }
        }
    }

    public final void b(Field field, Object obj) throws IllegalAccessException {
        SettingItemSwitch settingItemSwitch;
        String str;
        if (PatchProxy.isSupport(new Object[]{field, obj}, this, f64411a, false, 72358, new Class[]{Field.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{field, obj}, this, f64411a, false, 72358, new Class[]{Field.class, Object.class}, Void.TYPE);
            return;
        }
        boolean booleanValue = ((Boolean) field.get(obj)).booleanValue();
        AbBooleanField abBooleanField = (AbBooleanField) field.getAnnotation(AbBooleanField.class);
        this.f64412b.setChecked(booleanValue);
        if (!TextUtils.isEmpty(abBooleanField.b()) || !TextUtils.isEmpty(abBooleanField.a())) {
            settingItemSwitch = this.f64412b;
            if (booleanValue) {
                str = abBooleanField.a();
            } else {
                str = abBooleanField.b();
            }
        } else {
            SettingItemSwitch settingItemSwitch2 = this.f64412b;
            str = field.getName();
            settingItemSwitch = settingItemSwitch2;
        }
        settingItemSwitch.setStartText(str);
    }

    private b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(C0906R.layout.a1f, this, true);
        if (PatchProxy.isSupport(new Object[0], this, f64411a, false, 72356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64411a, false, 72356, new Class[0], Void.TYPE);
            return;
        }
        this.f64412b = (SettingItemSwitch) findViewById(C0906R.id.avq);
    }
}
