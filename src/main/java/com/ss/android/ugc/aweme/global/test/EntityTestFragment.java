package com.ss.android.ugc.aweme.global.test;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.utils.eq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

@SuppressLint({"ValidFragment"})
public class EntityTestFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49587a;

    /* renamed from: b  reason: collision with root package name */
    Object f49588b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f49589c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    BaseAdapter f49590d = new BaseAdapter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49593a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout.LayoutParams f49594b = new LinearLayout.LayoutParams(-1, -1);

        /* renamed from: com.ss.android.ugc.aweme.global.test.EntityTestFragment$2$a */
        class a {

            /* renamed from: a  reason: collision with root package name */
            View f49599a;

            /* renamed from: b  reason: collision with root package name */
            TextView f49600b;

            /* renamed from: c  reason: collision with root package name */
            TextView f49601c;

            a() {
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f49593a, false, 49476, new Class[0], Integer.TYPE)) {
                return EntityTestFragment.this.f49589c.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f49593a, false, 49476, new Class[0], Integer.TYPE)).intValue();
        }

        private TextView a() {
            if (PatchProxy.isSupport(new Object[0], this, f49593a, false, 49479, new Class[0], TextView.class)) {
                return (TextView) PatchProxy.accessDispatch(new Object[0], this, f49593a, false, 49479, new Class[0], TextView.class);
            }
            final BorderTextView borderTextView = new BorderTextView(EntityTestFragment.this.getContext());
            borderTextView.setGravity(17);
            borderTextView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f49596a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f49596a, false, 49480, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f49596a, false, 49480, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    Object tag = borderTextView.getTag(C0906R.id.aqw);
                    if (tag == null || tag.getClass().isPrimitive() || (tag instanceof String) || (tag instanceof List)) {
                        Toast makeText = Toast.makeText(EntityTestFragment.this.getContext(), ((TextView) view).getText().toString(), 0);
                        if (PatchProxy.isSupport(new Object[]{makeText}, null, a.f49610a, true, 49481, new Class[]{Toast.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{makeText}, null, a.f49610a, true, 49481, new Class[]{Toast.class}, Void.TYPE);
                        } else {
                            if (Build.VERSION.SDK_INT == 25) {
                                eq.a(makeText);
                            }
                            makeText.show();
                        }
                    } else if (EntityTestActivity.f49572d != null && !EntityTestActivity.f49572d.isFinishing()) {
                        EntityTestActivity.f49572d.a(EntityTestFragment.a(tag));
                    }
                }
            });
            return borderTextView;
        }

        public final Object getItem(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f49593a, false, 49477, new Class[]{Integer.TYPE}, Object.class)) {
                return EntityTestFragment.this.f49589c.get(i);
            }
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f49593a, false, 49477, new Class[]{Integer.TYPE}, Object.class);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            LinearLayout linearLayout;
            a aVar;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f49593a, false, 49478, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup}, this, f49593a, false, 49478, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            }
            if (view == null) {
                aVar = new a();
                this.f49594b.weight = 1.0f;
                linearLayout = new LinearLayout(EntityTestFragment.this.getContext());
                aVar.f49600b = a();
                LinearLayout linearLayout2 = linearLayout;
                linearLayout2.addView(aVar.f49600b, this.f49594b);
                aVar.f49601c = a();
                linearLayout2.addView(aVar.f49601c, this.f49594b);
                aVar.f49599a = linearLayout;
                linearLayout.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
                linearLayout = view;
            }
            aVar.f49600b.setText(EntityTestFragment.this.f49589c.get(i).f49605a);
            aVar.f49601c.setTag(C0906R.id.aqw, EntityTestFragment.this.f49589c.get(i).f49606b);
            aVar.f49601c.setText(String.valueOf(EntityTestFragment.this.f49589c.get(i).f49606b));
            return linearLayout;
        }
    };

    static class BorderTextView extends AppCompatTextView {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49603a;

        /* renamed from: b  reason: collision with root package name */
        private int f49604b = 1;

        public BorderTextView(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas) {
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f49603a, false, 49482, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f49603a, false, 49482, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            Paint paint = new Paint();
            paint.setColor(-16777216);
            Paint paint2 = paint;
            canvas.drawLine(0.0f, 0.0f, (float) (getWidth() - this.f49604b), 0.0f, paint2);
            canvas.drawLine(0.0f, 0.0f, 0.0f, (float) getHeight(), paint2);
            canvas.drawLine((float) (getWidth() - this.f49604b), 0.0f, (float) (getWidth() - this.f49604b), (float) getHeight(), paint2);
            canvas.drawLine(0.0f, (float) getHeight(), (float) (getWidth() - this.f49604b), (float) getHeight(), paint2);
            super.onDraw(canvas);
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f49605a;

        /* renamed from: b  reason: collision with root package name */
        public Object f49606b;

        /* renamed from: com.ss.android.ugc.aweme.global.test.EntityTestFragment$a$a  reason: collision with other inner class name */
        public static final class C0589a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f49607a;

            /* renamed from: b  reason: collision with root package name */
            public String f49608b;

            /* renamed from: c  reason: collision with root package name */
            public Object f49609c = "/";

            public final a a() {
                if (!PatchProxy.isSupport(new Object[0], this, f49607a, false, 49483, new Class[0], a.class)) {
                    return new a(this, (byte) 0);
                }
                return (a) PatchProxy.accessDispatch(new Object[0], this, f49607a, false, 49483, new Class[0], a.class);
            }

            public final C0589a a(Object obj) {
                this.f49609c = obj;
                return this;
            }

            public final C0589a a(String str) {
                this.f49608b = str;
                return this;
            }
        }

        private a(C0589a aVar) {
            this.f49605a = aVar.f49608b;
            this.f49606b = aVar.f49609c;
        }

        /* synthetic */ a(C0589a aVar, byte b2) {
            this(aVar);
        }
    }

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49587a, false, 49471, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49587a, false, 49471, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f49587a, false, 49473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49587a, false, 49473, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f49587a, false, 49472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49587a, false, 49472, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f49587a, false, 49474, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f49587a, false, 49474, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public EntityTestFragment() {
    }

    private a.C0589a a() {
        if (!PatchProxy.isSupport(new Object[0], this, f49587a, false, 49469, new Class[0], a.C0589a.class)) {
            return new a.C0589a();
        }
        return (a.C0589a) PatchProxy.accessDispatch(new Object[0], this, f49587a, false, 49469, new Class[0], a.C0589a.class);
    }

    private EntityTestFragment(Object obj) {
        this.f49588b = obj;
    }

    public static EntityTestFragment a(Object obj) {
        Object obj2 = obj;
        if (!PatchProxy.isSupport(new Object[]{obj2}, null, f49587a, true, 49466, new Class[]{Object.class}, EntityTestFragment.class)) {
            return new EntityTestFragment(obj2);
        }
        return (EntityTestFragment) PatchProxy.accessDispatch(new Object[]{obj2}, null, f49587a, true, 49466, new Class[]{Object.class}, EntityTestFragment.class);
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49587a, false, 49468, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49587a, false, 49468, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (getView() != null && getActivity() != null) {
            try {
                this.f49589c.add(a().a(this.f49588b.getClass().getSimpleName()).a());
                this.f49589c.add(a().a("key").a((Object) "value").a());
                if (PatchProxy.isSupport(new Object[0], this, f49587a, false, 49470, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f49587a, false, 49470, new Class[0], Void.TYPE);
                } else {
                    ArrayList<Map.Entry> arrayList = new ArrayList<>(c.a(this.f49588b).entrySet());
                    Collections.sort(arrayList, new Comparator<Map.Entry<String, Object>>() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f49591a;

                        public final /* synthetic */ int compare(Object obj, Object obj2) {
                            Map.Entry entry = (Map.Entry) obj;
                            Map.Entry entry2 = (Map.Entry) obj2;
                            if (!PatchProxy.isSupport(new Object[]{entry, entry2}, this, f49591a, false, 49475, new Class[]{Map.Entry.class, Map.Entry.class}, Integer.TYPE)) {
                                return ((String) entry.getKey()).compareTo((String) entry2.getKey());
                            }
                            return ((Integer) PatchProxy.accessDispatch(new Object[]{entry, entry2}, this, f49591a, false, 49475, new Class[]{Map.Entry.class, Map.Entry.class}, Integer.TYPE)).intValue();
                        }
                    });
                    for (Map.Entry entry : arrayList) {
                        this.f49589c.add(a().a((String) entry.getKey()).a(entry.getValue()).a());
                    }
                }
            } catch (Exception e2) {
                Toast makeText = Toast.makeText(getContext(), e2.getMessage(), 0);
                if (PatchProxy.isSupport(new Object[]{makeText}, null, b.f49611a, true, 49484, new Class[]{Toast.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{makeText}, null, b.f49611a, true, 49484, new Class[]{Toast.class}, Void.TYPE);
                } else {
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(makeText);
                    }
                    makeText.show();
                }
            }
            ListView listView = (ListView) getView();
            listView.setBackgroundColor(-1);
            listView.setAdapter(this.f49590d);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (!PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f49587a, false, 49467, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return new ListView(viewGroup.getContext());
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f49587a, false, 49467, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
