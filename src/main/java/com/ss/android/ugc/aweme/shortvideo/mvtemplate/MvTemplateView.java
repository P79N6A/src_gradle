package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.textview.AlwaysMarqueeTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.e;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.b.a;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate.CircularAnimateButton;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate.b;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager.MvItemFragment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager.MvThemeListViewPager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager.MvThemeViewPagerAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.viewpager.ScaleAlphaPageTransformer;
import com.ss.android.ugc.aweme.utils.ax;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class MvTemplateView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68460a;

    /* renamed from: b  reason: collision with root package name */
    public AlwaysMarqueeTextView f68461b;

    /* renamed from: c  reason: collision with root package name */
    public AlwaysMarqueeTextView f68462c;

    /* renamed from: d  reason: collision with root package name */
    DmtTextView f68463d;

    /* renamed from: e  reason: collision with root package name */
    View f68464e;

    /* renamed from: f  reason: collision with root package name */
    CircularAnimateButton f68465f;
    public int g;
    public int h;
    View i;
    DmtLoadingLayout j;
    public boolean k;
    View l;
    public a m;
    MvThemeListViewPager n;
    public MvThemeViewPagerAdapter o;
    public int p;
    private View q;
    private int r;
    private int s;
    private FragmentActivity t;

    public View getCloseView() {
        return this.l;
    }

    public final void a(List<j> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f68460a, false, 77868, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f68460a, false, 77868, new Class[]{List.class}, Void.TYPE);
        } else if (!j.a((Collection<T>) list)) {
            this.n.setOffscreenPageLimit(list.size());
            this.n.setAdapter(this.o);
            this.o.a(list);
            if (this.f68463d != null && !j.a((Collection<T>) list)) {
                DmtTextView dmtTextView = this.f68463d;
                dmtTextView.setText("1/" + list.size());
                j jVar = list.get(0);
                if (jVar != null) {
                    if (!TextUtils.isEmpty(jVar.h())) {
                        this.f68461b.setText(jVar.h());
                    }
                    if (!TextUtils.isEmpty(jVar.j())) {
                        this.f68462c.setText(jVar.j());
                    }
                }
            }
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77882, new Class[0], Void.TYPE);
            return;
        }
        MvItemFragment a2 = a(this.h);
        if (a2 != null) {
            a2.d();
        }
    }

    public int getDataCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f68460a, false, 77875, new Class[0], Integer.TYPE)) {
            return this.o.getCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77875, new Class[0], Integer.TYPE)).intValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77874, new Class[0], Void.TYPE);
            return;
        }
        this.j.setVisibility(8);
        this.i.setVisibility(0);
        this.f68462c.setVisibility(8);
        this.f68461b.setVisibility(8);
        this.n.setNoScroll(true);
        this.f68463d.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        j jVar = new j();
        jVar.k = true;
        arrayList.add(jVar);
        a((List<j>) arrayList);
        d();
        this.k = true;
        this.f68465f.a((b) null);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77881, new Class[0], Void.TYPE);
            return;
        }
        this.f68465f.setText(this.f68465f.getContext().getResources().getString(C0906R.string.bxb));
        this.f68465f.setBackgroundColor(this.s);
        this.f68465f.setClickable(false);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77871, new Class[0], Void.TYPE);
        } else if (getVisibility() != 8) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f68464e, "alpha", new float[]{1.0f, 0.0f});
            ofFloat.setDuration(300);
            ofFloat.start();
            CircularAnimateButton circularAnimateButton = this.f68465f;
            h hVar = new h(this);
            if (PatchProxy.isSupport(new Object[]{hVar}, circularAnimateButton, CircularAnimateButton.f68734a, false, 78117, new Class[]{b.class}, Void.TYPE)) {
                CircularAnimateButton circularAnimateButton2 = circularAnimateButton;
                PatchProxy.accessDispatch(new Object[]{hVar}, circularAnimateButton2, CircularAnimateButton.f68734a, false, 78117, new Class[]{b.class}, Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.view.circleanimate.a a2 = circularAnimateButton.a((float) circularAnimateButton.f68735b, (float) circularAnimateButton.f68738e, circularAnimateButton.f68737d, circularAnimateButton.f68738e);
                a2.f68745f = circularAnimateButton.f68736c;
                a2.g = circularAnimateButton.f68736c;
                a2.h = 0;
                a2.i = 0;
                a2.f68741b = hVar;
                a2.a();
            }
            if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77885, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77885, new Class[0], Void.TYPE);
                return;
            }
            MvItemFragment a3 = a(this.h);
            if (a3 != null) {
                if (PatchProxy.isSupport(new Object[0], a3, MvItemFragment.f68755a, false, 78143, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], a3, MvItemFragment.f68755a, false, 78143, new Class[0], Void.TYPE);
                } else if (a3.f68760f != null) {
                    a3.f68760f.U();
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77873, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77873, new Class[0], Void.TYPE);
            return;
        }
        this.j.setVisibility(8);
        this.i.setVisibility(0);
        this.f68462c.setVisibility(0);
        this.f68461b.setVisibility(0);
        this.f68463d.setVisibility(0);
        this.n.setNoScroll(false);
        if (this.o != null) {
            a(this.o.b(this.h));
        } else {
            a(true);
        }
        this.f68465f.a((b) null);
        this.k = false;
        if (this.m != null) {
            this.m.a(this.o.b(0));
        }
    }

    public final void c() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77878, new Class[0], Void.TYPE);
            return;
        }
        a(false);
        j b2 = this.o.b(this.h);
        if (b2 != null) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a(b2);
            Context context = getContext();
            i iVar = new i(this);
            int i3 = this.h;
            if (PatchProxy.isSupport(new Object[]{context, iVar, Integer.valueOf(i3)}, aVar, com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a.f68486a, false, 78069, new Class[]{Context.class, e.class, Integer.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{context, iVar, Integer.valueOf(i3)}, aVar2, com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.a.f68486a, false, 78069, new Class[]{Context.class, e.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(iVar, "listener");
            aVar.f68487b.f68496a = i3;
            aVar.f68488c = iVar;
            if (!aVar.b(aVar.f68489d)) {
                aVar.a(aVar.f68489d);
                e eVar = aVar.f68488c;
                if (eVar != null) {
                    eVar.a(-1, i3, 0, null);
                }
            } else if (aVar.f68489d.f68724b == null) {
                e eVar2 = aVar.f68488c;
                if (eVar2 != null) {
                    eVar2.a(-1, i3, 0, null);
                }
            } else if (TextUtils.isEmpty(aVar.f68489d.d())) {
                e eVar3 = aVar.f68488c;
                if (eVar3 != null) {
                    eVar3.a(-1, i3, 0, null);
                }
            } else {
                String e2 = aVar.f68489d.e();
                if (TextUtils.isEmpty(e2)) {
                    e eVar4 = aVar.f68488c;
                    if (eVar4 != null) {
                        eVar4.a(-1, i3, 0, null);
                    }
                } else if (!new File(e2).exists() || !c.a().a(aVar.f68489d)) {
                    c a2 = c.a();
                    j jVar = aVar.f68489d;
                    com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b bVar = aVar;
                    if (PatchProxy.isSupport(new Object[]{context, jVar, bVar}, a2, c.f68490a, false, 78078, new Class[]{Context.class, j.class, com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b.class}, Integer.TYPE)) {
                        Object[] objArr = {context, jVar, bVar};
                        Object[] objArr2 = objArr;
                        ChangeQuickRedirect changeQuickRedirect = c.f68490a;
                        i2 = ((Integer) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect, false, 78078, new Class[]{Context.class, j.class, com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b.class}, Integer.TYPE)).intValue();
                    } else {
                        if (!(jVar == null || context == null)) {
                            String c2 = jVar.c();
                            if (!TextUtils.isEmpty(c2)) {
                                String d2 = jVar.d();
                                if (!TextUtils.isEmpty(d2)) {
                                    if (!NetworkUtils.isNetworkAvailable(context)) {
                                        com.bytedance.ies.dmt.ui.d.a.b(context, context.getResources().getString(C0906R.string.abg)).a();
                                    } else {
                                        File file = new File(d2);
                                        int intValue = a2.f68492b.get(c2).intValue();
                                        if (intValue == 1 || intValue == -1 || intValue == 4) {
                                            DownloadTask url = Downloader.with(context).url(c2);
                                            url.savePath(file.getParent() + File.separator).name(file.getName()).mainThreadListener(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.b(bVar) {

                                                /* renamed from: a  reason: collision with root package name */
                                                public static ChangeQuickRedirect f68493a;

                                                /* renamed from: b  reason: collision with root package name */
                                                final /* synthetic */ b f68494b;

                                                public final void onProgress(DownloadInfo downloadInfo) {
                                                    if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f68493a, false, 78084, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f68493a, false, 78084, new Class[]{DownloadInfo.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    if (this.f68494b != null) {
                                                        this.f68494b.onProgress(downloadInfo);
                                                    }
                                                }

                                                public final void onSuccessed(DownloadInfo downloadInfo) {
                                                    if (PatchProxy.isSupport(new Object[]{downloadInfo}, this, f68493a, false, 78082, new Class[]{DownloadInfo.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{downloadInfo}, this, f68493a, false, 78082, new Class[]{DownloadInfo.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    c.this.f68492b.put(downloadInfo.getUrl(), 3);
                                                    if (this.f68494b != null) {
                                                        this.f68494b.onSuccessed(downloadInfo);
                                                    }
                                                }

                                                {
                                                    this.f68494b = r2;
                                                }

                                                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                                                    if (PatchProxy.isSupport(new Object[]{downloadInfo, baseException}, this, f68493a, false, 78083, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE)) {
                                                        PatchProxy.accessDispatch(new Object[]{downloadInfo, baseException}, this, f68493a, false, 78083, new Class[]{DownloadInfo.class, BaseException.class}, Void.TYPE);
                                                        return;
                                                    }
                                                    c.this.f68492b.put(downloadInfo.getUrl(), -1);
                                                    if (this.f68494b != null) {
                                                        this.f68494b.onFailed(downloadInfo, baseException);
                                                    }
                                                }
                                            }).download();
                                            a2.f68492b.put(c2, 2);
                                        }
                                        i2 = intValue;
                                    }
                                }
                            }
                        }
                        i2 = -1;
                    }
                    if (i2 == -1) {
                        e eVar5 = aVar.f68488c;
                        if (eVar5 != null) {
                            eVar5.a(-1, i3, 0, null);
                        }
                    }
                } else {
                    e eVar6 = aVar.f68488c;
                    if (eVar6 != null) {
                        eVar6.a(1, aVar.f68487b.f68496a, 100, aVar.f68489d.d());
                    }
                }
            }
        }
    }

    public void setMvThemeClickListener(a aVar) {
        this.m = aVar;
    }

    public MvTemplateView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: package-private */
    public MvItemFragment a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f68460a, false, 77880, new Class[]{Integer.TYPE}, MvItemFragment.class)) {
            return (MvItemFragment) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f68460a, false, 77880, new Class[]{Integer.TYPE}, MvItemFragment.class);
        }
        MvItemFragment mvItemFragment = null;
        if (this.o.getCount() <= 0) {
            return null;
        }
        if (i2 >= 0 && i2 < this.o.getCount()) {
            mvItemFragment = this.o.getItem(i2);
        }
        return mvItemFragment;
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68460a, false, 77879, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68460a, false, 77879, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f68465f.setText(this.f68465f.getContext().getResources().getString(C0906R.string.bxb));
            this.f68465f.setBackgroundColor(this.r);
            this.f68465f.setClickable(true);
        } else {
            this.f68465f.setText(this.f68465f.getContext().getResources().getString(C0906R.string.bx_));
            this.f68465f.setBackgroundColor(this.s);
            this.f68465f.setClickable(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(j jVar) {
        if (PatchProxy.isSupport(new Object[]{jVar}, this, f68460a, false, 77877, new Class[]{j.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jVar}, this, f68460a, false, 77877, new Class[]{j.class}, Void.TYPE);
            return;
        }
        if (jVar == null) {
            a(true);
        } else if (jVar.l() == 3) {
            a(false);
        } else {
            a(true);
        }
    }

    public MvTemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = context;
        while (true) {
            if (!(context2 instanceof ContextWrapper)) {
                break;
            } else if (context2 instanceof FragmentActivity) {
                this.t = (FragmentActivity) context2;
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.r = context2.getResources().getColor(C0906R.color.a37);
        this.s = context2.getResources().getColor(C0906R.color.a24);
        if (PatchProxy.isSupport(new Object[]{context2}, this, f68460a, false, 77866, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f68460a, false, 77866, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context2).inflate(C0906R.layout.a6r, this);
        this.f68461b = (AlwaysMarqueeTextView) findViewById(C0906R.id.d2b);
        this.f68462c = (AlwaysMarqueeTextView) findViewById(C0906R.id.d2a);
        this.f68463d = (DmtTextView) findViewById(C0906R.id.a0i);
        this.f68465f = (CircularAnimateButton) findViewById(C0906R.id.cul);
        this.i = findViewById(C0906R.id.z1);
        this.j = (DmtLoadingLayout) findViewById(C0906R.id.bj_);
        this.f68464e = findViewById(C0906R.id.bwd);
        this.q = findViewById(C0906R.id.duw);
        this.f68465f.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68466a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f68466a, false, 77893, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68466a, false, 77893, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                MvTemplateView.this.c();
            }
        });
        this.l = findViewById(C0906R.id.bp6);
        this.l.setOnClickListener(new ax() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68468a;

            public final void a(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f68468a, false, 77894, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68468a, false, 77894, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (MvTemplateView.this.m != null) {
                    MvTemplateView.this.m.a(MvTemplateView.this.o.b(MvTemplateView.this.h), 2);
                }
            }
        });
        if (PatchProxy.isSupport(new Object[0], this, f68460a, false, 77867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68460a, false, 77867, new Class[0], Void.TYPE);
            return;
        }
        this.n = (MvThemeListViewPager) findViewById(C0906R.id.duu);
        aa aaVar = new aa(this.n.getContext());
        aaVar.a(this.n);
        aaVar.f68590b = 500;
        ScaleAlphaPageTransformer scaleAlphaPageTransformer = new ScaleAlphaPageTransformer();
        this.n.setPageMargin((int) UIUtils.dip2Px(this.t, 16.0f));
        this.n.setPageTransformer(true, scaleAlphaPageTransformer);
        this.n.setBounceScrollListener(new MvThemeListViewPager.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68470a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f68470a, false, 77896, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f68470a, false, 77896, new Class[0], Void.TYPE);
                    return;
                }
                MvTemplateView.this.f68461b.setAlpha(1.0f);
                MvTemplateView.this.f68462c.setAlpha(1.0f);
            }

            public final void a(float f2) {
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f68470a, false, 77895, new Class[]{Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f68470a, false, 77895, new Class[]{Float.TYPE}, Void.TYPE);
                    return;
                }
                if (MvTemplateView.this.p == 0) {
                    MvItemFragment a2 = MvTemplateView.this.o.getItem(0);
                    if (a2 != null) {
                        MvTemplateView mvTemplateView = MvTemplateView.this;
                        if (PatchProxy.isSupport(new Object[0], a2, MvItemFragment.f68755a, false, 78129, new Class[0], Integer.TYPE)) {
                            i = ((Integer) PatchProxy.accessDispatch(new Object[0], a2, MvItemFragment.f68755a, false, 78129, new Class[0], Integer.TYPE)).intValue();
                        } else if (a2.h != null) {
                            i = a2.h.getMeasuredWidth();
                        }
                        mvTemplateView.p = i;
                    }
                }
                if (MvTemplateView.this.p > 0 && f2 < 0.0f) {
                    float abs = 1.0f - ((Math.abs(f2) / ((float) MvTemplateView.this.p)) * 2.0f);
                    MvTemplateView.this.f68461b.setAlpha(abs);
                    MvTemplateView.this.f68462c.setAlpha(abs);
                }
            }
        });
        this.o = new MvThemeViewPagerAdapter(this.t.getSupportFragmentManager());
        this.n.setAdapter(this.o);
        this.n.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68472a;

            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f2, int i2) {
            }

            public void onPageSelected(int i) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f68472a, false, 77897, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f68472a, false, 77897, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                j b2 = MvTemplateView.this.o.b(i2);
                if (b2 != null) {
                    if (MvTemplateView.this.g != i2) {
                        MvTemplateView mvTemplateView = MvTemplateView.this;
                        if (PatchProxy.isSupport(new Object[]{b2, Integer.valueOf(i)}, mvTemplateView, MvTemplateView.f68460a, false, 77876, new Class[]{j.class, Integer.TYPE}, Void.TYPE)) {
                            MvTemplateView mvTemplateView2 = mvTemplateView;
                            PatchProxy.accessDispatch(new Object[]{b2, Integer.valueOf(i)}, mvTemplateView2, MvTemplateView.f68460a, false, 77876, new Class[]{j.class, Integer.TYPE}, Void.TYPE);
                        } else {
                            mvTemplateView.f68461b.setText(b2.h());
                            mvTemplateView.f68462c.setText(b2.j());
                            DmtTextView dmtTextView = mvTemplateView.f68463d;
                            dmtTextView.setText((i2 + 1) + "/" + mvTemplateView.o.getCount());
                            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, mvTemplateView, MvTemplateView.f68460a, false, 77869, new Class[]{Integer.TYPE}, Void.TYPE)) {
                                MvTemplateView mvTemplateView3 = mvTemplateView;
                                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, mvTemplateView3, MvTemplateView.f68460a, false, 77869, new Class[]{Integer.TYPE}, Void.TYPE);
                            } else {
                                MvItemFragment a2 = mvTemplateView.a(i2);
                                if (!(a2 == null || mvTemplateView.o.b(i2) == null)) {
                                    a2.b();
                                }
                            }
                            mvTemplateView.a(b2);
                            if (mvTemplateView.m != null) {
                                mvTemplateView.m.a(b2, 3);
                            }
                        }
                    }
                    MvTemplateView.this.g = i2;
                }
                MvTemplateView.this.h = i2;
            }
        });
        this.q.setOnTouchListener(new g(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2, int i3, int i4) {
        MvItemFragment a2 = a(i3);
        if (i2 == -1) {
            if (i3 == this.h) {
                a(true);
            }
            if (a2 != null) {
                a2.c();
            }
        } else if (i2 == 1) {
            if (i3 == this.h) {
                a(true);
                if (this.m != null) {
                    this.m.a(this.o.b(this.h), 1);
                }
            }
            if (a2 != null) {
                a2.c();
            }
        } else if (i2 == 3) {
            if (a2 != null) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i4)}, a2, MvItemFragment.f68755a, false, 78133, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    MvItemFragment mvItemFragment = a2;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i4)}, mvItemFragment, MvItemFragment.f68755a, false, 78133, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    a2.d(true);
                    a2.a(false);
                    if (a2.f68757c != null) {
                        a2.f68757c.setProgress((float) i4);
                    }
                    if (a2.f68758d != null) {
                        TextView textView = a2.f68758d;
                        textView.setText(i4 + "%");
                    }
                }
            }
        } else if (i2 == 2) {
            a(false);
        }
    }
}
