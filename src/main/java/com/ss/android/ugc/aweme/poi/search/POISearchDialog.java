package com.ss.android.ugc.aweme.poi.search;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.b;
import com.ss.android.ugc.aweme.poi.b.c;
import com.ss.android.ugc.aweme.poi.search.a;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.AwemeViewPagerNavigator;
import com.ss.android.ugc.aweme.views.RtlViewPager;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class POISearchDialog extends Dialog implements ViewPager.OnPageChangeListener, TextWatcher, View.OnClickListener, TextView.OnEditorActionListener, a.C0027a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3743a;

    /* renamed from: b  reason: collision with root package name */
    public a f3744b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f3745c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f3746d;

    /* renamed from: e  reason: collision with root package name */
    private EditText f3747e;

    /* renamed from: f  reason: collision with root package name */
    private DmtTextView f3748f;
    private View g;
    private AwemeViewPagerNavigator h;
    private RtlViewPager i;
    private PoiSearchPagerAdapter j;
    private Context k;
    private String l;
    private String m;
    private boolean n;
    private boolean o;

    public interface a {
        void onPOIChanged(c cVar);
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f2, int i3) {
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65729, new Class[0], Void.TYPE);
        } else if (getOwnerActivity() != null) {
            b.a(getOwnerActivity(), (View) this.f3747e);
            this.f3747e.clearFocus();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65728, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65728, new Class[0], Void.TYPE);
            return;
        }
        c();
    }

    public final String b() {
        if (!PatchProxy.isSupport(new Object[0], this, f3743a, false, 65731, new Class[0], String.class)) {
            return this.j.a(this.i.getCurrentItem()).getPoiSearchRegionType();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65731, new Class[0], String.class);
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65723, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65723, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65724, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65724, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65718, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65718, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        this.f3747e.getText().clear();
        b(false);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65719, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65719, new Class[0], Void.TYPE);
            return;
        }
        c();
        if (PatchProxy.isSupport(new Object[]{this}, null, h.f60345a, true, 65732, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, h.f60345a, true, 65732, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
    }

    @Subscribe
    public void onEvent(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3743a, false, 65727, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3743a, false, 65727, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (this.f3744b != null) {
            this.f3744b.onPOIChanged(cVar);
        }
        dismiss();
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f3743a, false, 65730, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f3743a, false, 65730, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = this.f3747e.getText().toString();
        this.j.a(this.i.getCurrentItem()).a(z, this.m);
    }

    public void afterTextChanged(Editable editable) {
        Editable editable2 = editable;
        if (PatchProxy.isSupport(new Object[]{editable2}, this, f3743a, false, 65722, new Class[]{Editable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{editable2}, this, f3743a, false, 65722, new Class[]{Editable.class}, Void.TYPE);
            return;
        }
        String obj = editable.toString();
        if (obj.contains("\n")) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.bi4).a();
            int indexOf = obj.indexOf("\n");
            editable2.replace(indexOf, indexOf + 1, "");
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3743a, false, 65717, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3743a, false, 65717, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.c3b) {
            b(true);
            c();
        } else if (id == C0906R.id.c3c) {
            dismiss();
        } else if (id == C0906R.id.ns) {
            this.f3747e.setText("");
            b(true);
        } else {
            if (id == C0906R.id.c3e) {
                c();
            }
        }
    }

    public void onPageSelected(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3743a, false, 65726, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3743a, false, 65726, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        b(false);
        r.a("search_poi_tab_change", (Map) d.a().a("enter_method", "slide").a("search_region_type", this.j.a(i2).getPoiSearchRegionType()).f34114b);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f3743a, false, 65720, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f3743a, false, 65720, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        PoiSearchPagerAdapter poiSearchPagerAdapter = this.j;
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, poiSearchPagerAdapter, PoiSearchPagerAdapter.f60327a, false, 65740, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PoiSearchPagerAdapter poiSearchPagerAdapter2 = poiSearchPagerAdapter;
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, poiSearchPagerAdapter2, PoiSearchPagerAdapter.f60327a, false, 65740, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        poiSearchPagerAdapter.f60328b.setNotShowNoMyLocation(true);
        if (poiSearchPagerAdapter.f60329c != null) {
            poiSearchPagerAdapter.f60329c.setNotShowNoMyLocation(true);
        }
    }

    public POISearchDialog(@NonNull Context context, Bundle bundle) {
        this(context, bundle, (byte) 0);
    }

    public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f3743a, false, 65725, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i2), keyEvent}, this, f3743a, false, 65725, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
        }
        if (3 == i2) {
            c();
            b(true);
        }
        return false;
    }

    private POISearchDialog(@NonNull Context context, Bundle bundle, byte b2) {
        super(context, C0906R.style.ta);
        this.m = "";
        setContentView(C0906R.layout.jw);
        if (bundle != null) {
            this.l = bundle.getString("candidateloc");
            this.n = bundle.getBoolean("enable_global_search");
            this.o = bundle.getBoolean("is_over_sea");
        }
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(34);
        }
        this.k = context;
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65716, new Class[0], Void.TYPE);
        } else {
            this.f3745c = (ImageView) findViewById(C0906R.id.c3c);
            this.f3746d = (TextView) findViewById(C0906R.id.c3h);
            this.f3747e = (EditText) findViewById(C0906R.id.c3d);
            this.f3748f = (DmtTextView) findViewById(C0906R.id.c3b);
            this.g = findViewById(C0906R.id.ns);
            this.h = (AwemeViewPagerNavigator) findViewById(C0906R.id.bq0);
            this.i = (RtlViewPager) findViewById(C0906R.id.duu);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65715, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65715, new Class[0], Void.TYPE);
        } else {
            findViewById(C0906R.id.c3e).setOnClickListener(this);
            this.f3745c.setOnClickListener(this);
            this.f3748f.setOnClickListener(this);
            this.f3747e.addTextChangedListener(this);
            this.f3747e.setOnEditorActionListener(this);
            this.g.setOnClickListener(this);
        }
        if (PatchProxy.isSupport(new Object[0], this, f3743a, false, 65714, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3743a, false, 65714, new Class[0], Void.TYPE);
            return;
        }
        this.f3746d.setText(C0906R.string.da);
        this.f3747e.setHint(C0906R.string.c2l);
        this.j = new PoiSearchPagerAdapter(this.k, this.l, this.n, this);
        this.i.setAdapter(this.j);
        this.h.a(this.i, new k());
        this.i.addOnPageChangeListener(this);
        if (!this.n) {
            this.h.setVisibility(8);
            return;
        }
        if (this.o) {
            this.i.setCurrentItem(this.j.getCount());
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int i5 = i2;
        if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f3743a, false, 65721, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f3743a, false, 65721, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i4 == 1 && !TextUtils.isEmpty(charSequence) && 10 == charSequence.toString().charAt(i5)) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.bi4).a();
            this.f3747e.getEditableText().delete(i5, i5 + 1);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (!StringUtils.isEmpty(this.m)) {
                b(true);
            }
            this.g.setVisibility(8);
            return;
        }
        this.g.setVisibility(0);
    }
}
