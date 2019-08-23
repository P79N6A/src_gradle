package com.bytedance.android.live.core.setting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.BaseDialogFragmentV2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashSet;

public class ABTestDialog extends BaseDialogFragmentV2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8124a;

    /* renamed from: f  reason: collision with root package name */
    private static HashSet<Class> f8125f;

    /* renamed from: b  reason: collision with root package name */
    LinearLayout f8126b;

    /* renamed from: c  reason: collision with root package name */
    l f8127c;

    /* renamed from: d  reason: collision with root package name */
    int f8128d;

    /* renamed from: e  reason: collision with root package name */
    Consumer<Integer> f8129e;

    static {
        HashSet<Class> hashSet = new HashSet<>();
        f8125f = hashSet;
        hashSet.add(Boolean.class);
        f8125f.add(Boolean.TYPE);
        f8125f.add(Integer.class);
        f8125f.add(Integer.TYPE);
        f8125f.add(Float.class);
        f8125f.add(Float.TYPE);
        f8125f.add(Long.class);
        f8125f.add(Long.TYPE);
        f8125f.add(Double.class);
        f8125f.add(Double.TYPE);
        f8125f.add(String.class);
    }

    /* access modifiers changed from: package-private */
    public View a(ViewGroup viewGroup, Object obj) {
        ViewGroup viewGroup2 = viewGroup;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, obj2}, this, f8124a, false, 881, new Class[]{ViewGroup.class, Object.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{viewGroup2, obj2}, this, f8124a, false, 881, new Class[]{ViewGroup.class, Object.class}, View.class);
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup2.getChildAt(i) != null && obj2 == viewGroup2.getChildAt(i).getTag()) {
                return viewGroup2.getChildAt(i);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public <T> T a(Class<T> cls, View view) {
        if (PatchProxy.isSupport(new Object[]{cls, view}, this, f8124a, false, 882, new Class[]{Class.class, View.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{cls, view}, this, f8124a, false, 882, new Class[]{Class.class, View.class}, Object.class);
        }
        int i = null;
        if (view == null) {
            return null;
        }
        if (!f8125f.contains(cls)) {
            try {
                i = cls.newInstance();
            } catch (Exception unused) {
            }
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    try {
                        field.set(i, a(field.getType(), a((ViewGroup) view, (Object) field.getName())));
                    } catch (Exception unused2) {
                    }
                }
            }
            return i;
        }
        T obj = ((EditText) view.findViewById(C0906R.id.dqy)).getText().toString();
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            try {
                i = Boolean.valueOf(((CheckedTextView) view.findViewById(C0906R.id.lv)).isChecked());
            } catch (Exception unused3) {
                i = Boolean.FALSE;
            }
        } else if (cls == Integer.class || cls == Integer.TYPE) {
            try {
                i = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
            } catch (Exception unused4) {
                i = 0;
            }
        } else if (cls == Long.class || cls == Long.TYPE) {
            try {
                i = Long.valueOf(Long.parseLong(obj));
            } catch (Exception unused5) {
                i = 0L;
            }
        } else if (cls == Float.class || cls == Float.TYPE) {
            try {
                i = Float.valueOf(Float.parseFloat(obj));
            } catch (Exception unused6) {
                i = Float.valueOf(0.0f);
            }
        } else if (cls == Double.class || cls == Double.TYPE) {
            try {
                i = Double.valueOf(Double.parseDouble(obj));
            } catch (Exception unused7) {
                i = Double.valueOf(0.0d);
            }
        } else if (cls == String.class) {
            i = obj;
        }
        return i;
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f8124a, false, 879, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f8124a, false, 879, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.afd, null);
        this.f8126b = (LinearLayout) inflate.findViewById(C0906R.id.yp);
        inflate.findViewById(C0906R.id.q2).setOnClickListener(new a(this));
        inflate.findViewById(C0906R.id.bue).setOnClickListener(new b(this));
        getDialog().requestWindowFeature(1);
        Type c2 = m.c(this.f8127c);
        if (c2 instanceof Class) {
            a(m.a(this.f8127c), (Class) c2, this.f8126b, 1);
        }
        return inflate;
    }

    private void a(String str, Class cls, LinearLayout linearLayout, int i) {
        String str2 = str;
        Class cls2 = cls;
        LinearLayout linearLayout2 = linearLayout;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{str2, cls2, linearLayout2, Integer.valueOf(i)}, this, f8124a, false, 880, new Class[]{String.class, Class.class, LinearLayout.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, cls2, linearLayout2, Integer.valueOf(i)}, this, f8124a, false, 880, new Class[]{String.class, Class.class, LinearLayout.class, Integer.TYPE}, Void.TYPE);
        } else if (f8125f.contains(cls2)) {
            View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.afc, null);
            ((TextView) inflate.findViewById(C0906R.id.b73)).setText(str2);
            if (cls2 == Boolean.class || cls2 == Boolean.TYPE) {
                inflate.findViewById(C0906R.id.dqy).setVisibility(8);
                final CheckedTextView checkedTextView = (CheckedTextView) inflate.findViewById(C0906R.id.lv);
                checkedTextView.setVisibility(0);
                checkedTextView.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f8130a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f8130a, false, 886, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f8130a, false, 886, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        checkedTextView.toggle();
                        checkedTextView.setText(String.valueOf(checkedTextView.isChecked()));
                    }
                });
            } else {
                ((EditText) inflate.findViewById(C0906R.id.dqy)).setHint(cls.getSimpleName());
            }
            inflate.setTag(str2);
            linearLayout2.addView(inflate);
        } else if (i2 <= 3) {
            TextView textView = new TextView(getContext());
            textView.setText(str2);
            linearLayout2.addView(textView);
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.setTag(str2);
            if (i2 > 1) {
                linearLayout3.setVisibility(8);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = 100;
            linearLayout2.addView(linearLayout3, marginLayoutParams);
            textView.setOnClickListener(new c(linearLayout3));
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    a(field.getName(), field.getType(), linearLayout3, i2 + 1);
                }
            }
        }
    }
}
