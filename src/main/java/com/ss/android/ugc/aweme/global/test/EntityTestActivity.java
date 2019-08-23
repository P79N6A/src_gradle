package com.ss.android.ugc.aweme.global.test;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.ArrayMap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Stack;

public class EntityTestActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49570a;

    /* renamed from: b  reason: collision with root package name */
    public static ArrayMap<String, Object> f49571b;
    @SuppressLint({"all"})

    /* renamed from: d  reason: collision with root package name */
    public static EntityTestActivity f49572d;

    /* renamed from: c  reason: collision with root package name */
    final Stack<Fragment> f49573c = new Stack<>();

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f49574e;

    class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49579a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout.LayoutParams f49580b;

        /* renamed from: com.ss.android.ugc.aweme.global.test.EntityTestActivity$a$a  reason: collision with other inner class name */
        class C0588a {

            /* renamed from: a  reason: collision with root package name */
            Button f49585a;

            C0588a() {
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (PatchProxy.isSupport(new Object[0], this, f49579a, false, 49461, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49579a, false, 49461, new Class[0], Integer.TYPE)).intValue();
            } else if (EntityTestActivity.f49571b == null) {
                return 0;
            } else {
                return EntityTestActivity.f49571b.size();
            }
        }

        private a() {
            this.f49580b = new LinearLayout.LayoutParams(-1, -1);
        }

        public final Object getItem(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49579a, false, 49462, new Class[]{Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49579a, false, 49462, new Class[]{Integer.TYPE}, Object.class);
            } else if (EntityTestActivity.f49571b == null) {
                return null;
            } else {
                return EntityTestActivity.f49571b.get(Integer.valueOf(i));
            }
        }

        /* synthetic */ a(EntityTestActivity entityTestActivity, byte b2) {
            this();
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            C0588a aVar;
            Button button;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f49579a, false, 49463, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f49579a, false, 49463, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (view == null) {
                C0588a aVar2 = new C0588a();
                this.f49580b.weight = 1.0f;
                LinearLayout linearLayout2 = new LinearLayout(EntityTestActivity.this);
                if (PatchProxy.isSupport(new Object[0], this, f49579a, false, 49464, new Class[0], Button.class)) {
                    button = (Button) PatchProxy.accessDispatch(new Object[0], this, f49579a, false, 49464, new Class[0], Button.class);
                } else {
                    button = new Button(EntityTestActivity.this);
                    button.setGravity(17);
                    button.setAllCaps(false);
                }
                aVar2.f49585a = button;
                linearLayout2.addView(button);
                linearLayout2.setTag(aVar2);
                aVar = aVar2;
                linearLayout = linearLayout2;
            } else {
                aVar = (C0588a) view.getTag();
                linearLayout = view;
            }
            if (Build.VERSION.SDK_INT < 19) {
                return null;
            }
            aVar.f49585a.setText(EntityTestActivity.f49571b.keyAt(i2));
            final Object valueAt = EntityTestActivity.f49571b.valueAt(i2);
            if (valueAt == null || !(valueAt instanceof View.OnClickListener)) {
                aVar.f49585a.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f49582a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f49582a, false, 49465, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f49582a, false, 49465, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        EntityTestActivity entityTestActivity = EntityTestActivity.this;
                        Object obj = valueAt;
                        if (PatchProxy.isSupport(new Object[]{obj}, entityTestActivity, EntityTestActivity.f49570a, false, 49455, new Class[]{Object.class}, Void.TYPE)) {
                            EntityTestActivity entityTestActivity2 = entityTestActivity;
                            PatchProxy.accessDispatch(new Object[]{obj}, entityTestActivity2, EntityTestActivity.f49570a, false, 49455, new Class[]{Object.class}, Void.TYPE);
                            return;
                        }
                        entityTestActivity.a(EntityTestFragment.a(obj));
                    }
                });
            } else {
                aVar.f49585a.setOnClickListener((View.OnClickListener) valueAt);
            }
            return linearLayout;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f49570a, false, 49457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49570a, false, 49457, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.global.test.EntityTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.global.test.EntityTestActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49570a, false, 49458, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49570a, false, 49458, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.global.test.EntityTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f49570a, false, 49450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49570a, false, 49450, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (f49571b != null) {
            f49571b.clear();
            f49571b = null;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f49570a, false, 49454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49570a, false, 49454, new Class[0], Void.TYPE);
        } else if (!this.f49573c.empty()) {
            Fragment pop = this.f49573c.pop();
            if (pop != null) {
                getSupportFragmentManager().beginTransaction().remove(pop).commit();
            }
            if (this.f49573c.empty()) {
                this.f49574e.setVisibility(8);
            }
        }
    }

    public final void a(Fragment fragment) {
        if (PatchProxy.isSupport(new Object[]{fragment}, this, f49570a, false, 49456, new Class[]{Fragment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragment}, this, f49570a, false, 49456, new Class[]{Fragment.class}, Void.TYPE);
            return;
        }
        this.f49573c.push(fragment);
        this.f49574e.setVisibility(0);
        getSupportFragmentManager().beginTransaction().add((int) C0906R.id.ail, fragment).commit();
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49570a, false, 49451, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49570a, false, 49451, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.global.test.EntityTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.e7);
        f49572d = this;
        if (PatchProxy.isSupport(new Object[0], this, f49570a, false, 49452, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49570a, false, 49452, new Class[0], Void.TYPE);
        } else {
            this.f49574e = (FrameLayout) findViewById(C0906R.id.ail);
            findViewById(C0906R.id.o9).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49575a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49575a, false, 49459, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49575a, false, 49459, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    EntityTestActivity entityTestActivity = EntityTestActivity.this;
                    if (PatchProxy.isSupport(new Object[0], entityTestActivity, EntityTestActivity.f49570a, false, 49453, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], entityTestActivity, EntityTestActivity.f49570a, false, 49453, new Class[0], Void.TYPE);
                        return;
                    }
                    while (!entityTestActivity.f49573c.empty()) {
                        entityTestActivity.a();
                    }
                }
            });
            findViewById(C0906R.id.nt).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49577a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49577a, false, 49460, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49577a, false, 49460, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    EntityTestActivity.this.a();
                }
            });
            ((ListView) findViewById(C0906R.id.bco)).setAdapter(new a(this, (byte) 0));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.global.test.EntityTestActivity", "onCreate", false);
    }
}
