package com.ss.android.ugc.aweme.setting.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;

public class TestDependenciesActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64227a;

    /* renamed from: b  reason: collision with root package name */
    EditText f64228b;

    /* renamed from: c  reason: collision with root package name */
    final ArrayList<String> f64229c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    a f64230d;

    /* renamed from: e  reason: collision with root package name */
    private ListView f64231e;

    /* renamed from: f  reason: collision with root package name */
    private Button f64232f;

    class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64233a;

        /* renamed from: c  reason: collision with root package name */
        private LayoutInflater f64235c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<String> f64236d;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (PatchProxy.isSupport(new Object[0], this, f64233a, false, 72697, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f64233a, false, 72697, new Class[0], Integer.TYPE)).intValue();
            } else if (this.f64236d == null) {
                return 0;
            } else {
                return this.f64236d.size();
            }
        }

        public final void a(ArrayList<String> arrayList) {
            ArrayList<String> arrayList2 = arrayList;
            if (PatchProxy.isSupport(new Object[]{arrayList2}, this, f64233a, false, 72696, new Class[]{ArrayList.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{arrayList2}, this, f64233a, false, 72696, new Class[]{ArrayList.class}, Void.TYPE);
                return;
            }
            this.f64236d = arrayList2;
            notifyDataSetChanged();
        }

        public final Object getItem(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64233a, false, 72698, new Class[]{Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64233a, false, 72698, new Class[]{Integer.TYPE}, Object.class);
            } else if (this.f64236d == null) {
                return null;
            } else {
                return this.f64236d.get(i);
            }
        }

        a(ArrayList<String> arrayList) {
            this.f64236d = arrayList;
            this.f64235c = LayoutInflater.from(TestDependenciesActivity.this);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            b bVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f64233a, false, 72699, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f64233a, false, 72699, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (view == null) {
                bVar = new b();
                view2 = this.f64235c.inflate(C0906R.layout.a14, null);
                bVar.f64237a = (TextView) view2.findViewById(C0906R.id.das);
                view2.setTag(bVar);
            } else {
                bVar = (b) view.getTag();
                view2 = view;
            }
            int i2 = i;
            bVar.f64237a.setText(this.f64236d.get(i));
            return view2;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public TextView f64237a;

        b() {
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64227a, false, 72693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64227a, false, 72693, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f64227a, false, 72694, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f64227a, false, 72694, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64227a, false, 72690, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64227a, false, 72690, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.gj);
        if (PatchProxy.isSupport(new Object[0], this, f64227a, false, 72691, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64227a, false, 72691, new Class[0], Void.TYPE);
        } else {
            this.f64231e = (ListView) findViewById(C0906R.id.bcp);
            this.f64228b = (EditText) findViewById(C0906R.id.aah);
            this.f64232f = (Button) findViewById(C0906R.id.p0);
            this.f64232f.setText("Search");
            this.f64232f.setOnClickListener(new s(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f64227a, false, 72692, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64227a, false, 72692, new Class[0], Void.TYPE);
        } else if (!TextUtils.isEmpty("")) {
            if ("".contains(",")) {
                for (String add : "".split(",")) {
                    this.f64229c.add(add);
                }
            } else {
                this.f64229c.add("");
            }
            this.f64230d = new a(this.f64229c);
            this.f64231e.setAdapter(this.f64230d);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onCreate", false);
    }
}
