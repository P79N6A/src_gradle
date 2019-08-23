package com.zhihu.matisse.internal.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.C0906R;
import com.zhihu.matisse.c.b;
import com.zhihu.matisse.internal.entity.IncapableCause;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.entity.d;
import com.zhihu.matisse.internal.model.a;
import com.zhihu.matisse.internal.ui.adapter.PreviewPagerAdapter;
import com.zhihu.matisse.internal.ui.widget.CheckRadioView;
import com.zhihu.matisse.internal.ui.widget.CheckView;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;
import it.sephiroth.android.library.imagezoom.ImageViewTouch;

public abstract class BasePreviewActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener, View.OnClickListener, b {

    /* renamed from: a  reason: collision with root package name */
    protected final a f82672a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    protected d f82673b;

    /* renamed from: c  reason: collision with root package name */
    protected ViewPager f82674c;

    /* renamed from: d  reason: collision with root package name */
    protected PreviewPagerAdapter f82675d;

    /* renamed from: e  reason: collision with root package name */
    protected CheckView f82676e;

    /* renamed from: f  reason: collision with root package name */
    protected TextView f82677f;
    protected TextView g;
    protected TextView h;
    protected int i = -1;
    public CheckRadioView j;
    protected boolean k;
    private LinearLayout l;
    private FrameLayout m;
    private FrameLayout n;
    private boolean o = false;

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageScrolled(int i2, float f2, int i3) {
    }

    public void onBackPressed() {
        a(false);
        super.onBackPressed();
    }

    public final int d() {
        int f2 = this.f82672a.f();
        int i2 = 0;
        for (int i3 = 0; i3 < f2; i3++) {
            c cVar = this.f82672a.b().get(i3);
            if (cVar.a() && com.zhihu.matisse.internal.a.c.a(cVar.f82644d) > ((float) this.f82673b.u)) {
                i2++;
            }
        }
        return i2;
    }

    private void a() {
        this.j.setChecked(this.k);
        if (!this.k) {
            this.j.setColor(-1);
        }
        if (d() > 0 && this.k) {
            IncapableDialog.a("", getString(C0906R.string.bak, new Object[]{Integer.valueOf(this.f82673b.u)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
            this.j.setChecked(false);
            this.j.setColor(-1);
            this.k = false;
        }
    }

    public final void c() {
        int f2 = this.f82672a.f();
        if (f2 == 0) {
            this.g.setText(C0906R.string.bad);
            this.g.setEnabled(false);
        } else if (f2 != 1 || !this.f82673b.b()) {
            this.g.setEnabled(true);
            this.g.setText(getString(C0906R.string.bac, new Object[]{Integer.valueOf(f2)}));
        } else {
            this.g.setText(C0906R.string.bad);
            this.g.setEnabled(true);
        }
        if (this.f82673b.s) {
            this.l.setVisibility(0);
            a();
            return;
        }
        this.l.setVisibility(8);
    }

    public final void b() {
        if (this.f82673b.t) {
            if (this.o) {
                this.n.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy((float) this.n.getMeasuredHeight()).start();
                this.m.animate().translationYBy((float) (-this.m.getMeasuredHeight())).setInterpolator(new FastOutSlowInInterpolator()).start();
            } else {
                this.n.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy((float) (-this.n.getMeasuredHeight())).start();
                this.m.animate().setInterpolator(new FastOutSlowInInterpolator()).translationYBy((float) this.m.getMeasuredHeight()).start();
            }
            this.o = !this.o;
        }
    }

    public final boolean b(c cVar) {
        IncapableCause d2 = this.f82672a.d(cVar);
        IncapableCause.a(this, d2);
        if (d2 == null) {
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f82672a.b(bundle);
        bundle.putBoolean("checkState", this.k);
        super.onSaveInstanceState(bundle);
    }

    public void onClick(View view) {
        if (view.getId() == C0906R.id.pt) {
            onBackPressed();
            return;
        }
        if (view.getId() == C0906R.id.ps) {
            a(true);
            finish();
        }
    }

    private void a(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.f82672a.a());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.k);
        setResult(-1, intent);
    }

    /* access modifiers changed from: protected */
    public final void a(c cVar) {
        if (cVar.b()) {
            this.h.setVisibility(0);
            TextView textView = this.h;
            textView.setText(com.zhihu.matisse.internal.a.c.a(cVar.f82644d) + "M");
        } else {
            this.h.setVisibility(8);
        }
        if (cVar.c()) {
            this.l.setVisibility(8);
            return;
        }
        if (this.f82673b.s) {
            this.l.setVisibility(0);
        }
    }

    public void onPageSelected(int i2) {
        CheckView checkView;
        CheckView checkView2;
        PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) this.f82674c.getAdapter();
        if (!(this.i == -1 || this.i == i2)) {
            PreviewItemFragment previewItemFragment = (PreviewItemFragment) previewPagerAdapter.instantiateItem(this.f82674c, this.i);
            if (previewItemFragment.getView() != null) {
                ((ImageViewTouch) previewItemFragment.getView().findViewById(C0906R.id.arl)).a();
            }
            c a2 = previewPagerAdapter.a(i2);
            boolean z = true;
            if (this.f82673b.f82651f) {
                int e2 = this.f82672a.e(a2);
                this.f82676e.setCheckedNum(e2);
                if (e2 > 0) {
                    checkView2 = this.f82676e;
                } else {
                    checkView2 = this.f82676e;
                    if (this.f82672a.e()) {
                        z = false;
                    }
                }
                checkView2.setEnabled(z);
            } else {
                boolean c2 = this.f82672a.c(a2);
                this.f82676e.setChecked(c2);
                if (c2) {
                    checkView = this.f82676e;
                } else {
                    checkView = this.f82676e;
                    if (this.f82672a.e()) {
                        z = false;
                    }
                }
                checkView.setEnabled(z);
            }
            a(a2);
        }
        this.i = i2;
    }

    public void onCreate(@Nullable Bundle bundle) {
        setTheme(d.a().f82649d);
        super.onCreate(bundle);
        if (!d.a().q) {
            setResult(0);
            finish();
            return;
        }
        setContentView((int) C0906R.layout.cg);
        if (com.zhihu.matisse.internal.a.d.b()) {
            getWindow().addFlags(67108864);
        }
        this.f82673b = d.a();
        if (this.f82673b.c()) {
            setRequestedOrientation(this.f82673b.f82650e);
        }
        if (bundle == null) {
            this.f82672a.a(getIntent().getBundleExtra("extra_default_bundle"));
            this.k = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.f82672a.a(bundle);
            this.k = bundle.getBoolean("checkState");
        }
        this.f82677f = (TextView) findViewById(C0906R.id.pt);
        this.g = (TextView) findViewById(C0906R.id.ps);
        this.h = (TextView) findViewById(C0906R.id.crp);
        this.f82677f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.f82674c = (ViewPager) findViewById(C0906R.id.bw4);
        this.f82674c.addOnPageChangeListener(this);
        this.f82675d = new PreviewPagerAdapter(getSupportFragmentManager(), null);
        this.f82674c.setAdapter(this.f82675d);
        this.f82676e = (CheckView) findViewById(C0906R.id.sa);
        this.f82676e.setCountable(this.f82673b.f82651f);
        this.m = (FrameLayout) findViewById(C0906R.id.mv);
        this.n = (FrameLayout) findViewById(C0906R.id.d5y);
        this.f82676e.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                if (BasePreviewActivity.this.f82675d.getCount() > 0) {
                    c a2 = BasePreviewActivity.this.f82675d.a(BasePreviewActivity.this.f82674c.getCurrentItem());
                    if (BasePreviewActivity.this.f82672a.c(a2)) {
                        BasePreviewActivity.this.f82672a.b(a2);
                        if (BasePreviewActivity.this.f82673b.f82651f) {
                            BasePreviewActivity.this.f82676e.setCheckedNum(Integer.MIN_VALUE);
                        } else {
                            BasePreviewActivity.this.f82676e.setChecked(false);
                        }
                    } else if (BasePreviewActivity.this.b(a2)) {
                        BasePreviewActivity.this.f82672a.a(a2);
                        if (BasePreviewActivity.this.f82673b.f82651f) {
                            BasePreviewActivity.this.f82676e.setCheckedNum(BasePreviewActivity.this.f82672a.e(a2));
                        } else {
                            BasePreviewActivity.this.f82676e.setChecked(true);
                        }
                    }
                    BasePreviewActivity.this.c();
                    if (BasePreviewActivity.this.f82673b.r != null) {
                        BasePreviewActivity.this.f82672a.c();
                        BasePreviewActivity.this.f82672a.d();
                    }
                }
            }
        });
        this.l = (LinearLayout) findViewById(C0906R.id.bvk);
        this.j = (CheckRadioView) findViewById(C0906R.id.bvj);
        this.l.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                int d2 = BasePreviewActivity.this.d();
                if (d2 > 0) {
                    IncapableDialog.a("", BasePreviewActivity.this.getString(C0906R.string.baj, new Object[]{Integer.valueOf(d2), Integer.valueOf(BasePreviewActivity.this.f82673b.u)})).show(BasePreviewActivity.this.getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                }
                BasePreviewActivity.this.k = true ^ BasePreviewActivity.this.k;
                BasePreviewActivity.this.j.setChecked(BasePreviewActivity.this.k);
                if (!BasePreviewActivity.this.k) {
                    BasePreviewActivity.this.j.setColor(-1);
                }
            }
        });
        c();
    }
}
