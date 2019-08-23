package com.ss.android.ugc.aweme.plugin.ui;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.frameworks.plugin.pm.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class PluginListActivity extends AppCompatActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59370a;

    /* renamed from: b  reason: collision with root package name */
    public ListView f59371b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f59372c = new ArrayList<>();

    class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59375a;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f59375a, false, 64711, new Class[0], Integer.TYPE)) {
                return PluginListActivity.this.f59372c.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f59375a, false, 64711, new Class[0], Integer.TYPE)).intValue();
        }

        private a() {
        }

        public final Object getItem(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f59375a, false, 64712, new Class[]{Integer.TYPE}, Object.class)) {
                return PluginListActivity.this.f59372c.get(i);
            }
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f59375a, false, 64712, new Class[]{Integer.TYPE}, Object.class);
        }

        /* synthetic */ a(PluginListActivity pluginListActivity, byte b2) {
            this();
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f59375a, false, 64713, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f59375a, false, 64713, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            View inflate = LayoutInflater.from(PluginListActivity.this).inflate(C0906R.layout.yi, null);
            if (inflate != null) {
                int i2 = i;
                ((TextView) inflate.findViewById(C0906R.id.dge)).setText(PluginListActivity.this.f59372c.get(i));
            }
            return inflate;
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f59370a, false, 64707, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59370a, false, 64707, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.plugin.ui.PluginListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.plugin.ui.PluginListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59370a, false, 64708, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59370a, false, 64708, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.plugin.ui.PluginListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f59370a, false, 64704, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f59370a, false, 64704, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.plugin.ui.PluginListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.gi);
        if (PatchProxy.isSupport(new Object[0], this, f59370a, false, 64705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59370a, false, 64705, new Class[0], Void.TYPE);
        } else {
            this.f59371b = (ListView) findViewById(C0906R.id.bcp);
        }
        if (PatchProxy.isSupport(new Object[0], this, f59370a, false, 64706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59370a, false, 64706, new Class[0], Void.TYPE);
        } else {
            new AsyncTask() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f59373a;

                public final Object doInBackground(Object[] objArr) {
                    if (PatchProxy.isSupport(new Object[]{objArr}, this, f59373a, false, 64709, new Class[]{Object[].class}, Object.class)) {
                        return PatchProxy.accessDispatch(new Object[]{objArr}, this, f59373a, false, 64709, new Class[]{Object[].class}, Object.class);
                    }
                    List<String> a2 = c.a();
                    if (a2 != null) {
                        for (String next : a2) {
                            int c2 = c.c(next);
                            ArrayList<String> arrayList = PluginListActivity.this.f59372c;
                            arrayList.add(next + " @ " + c2);
                        }
                    }
                    return null;
                }

                public final void onPostExecute(Object obj) {
                    if (PatchProxy.isSupport(new Object[]{obj}, this, f59373a, false, 64710, new Class[]{Object.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{obj}, this, f59373a, false, 64710, new Class[]{Object.class}, Void.TYPE);
                        return;
                    }
                    PluginListActivity.this.f59371b.setAdapter(new a(PluginListActivity.this, (byte) 0));
                }
            }.execute(new Object[0]);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.plugin.ui.PluginListActivity", "onCreate", false);
    }
}
