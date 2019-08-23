package com.ss.android.ugc.aweme.commercialize.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.model.n;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.profile.ui.UserProfileActivity;
import java.util.Locale;

public class SearchAdView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39988a;

    /* renamed from: b  reason: collision with root package name */
    public DmtTextView f39989b;

    /* renamed from: c  reason: collision with root package name */
    n f39990c;

    /* renamed from: d  reason: collision with root package name */
    Rect f39991d;

    /* renamed from: e  reason: collision with root package name */
    boolean f39992e;

    /* renamed from: f  reason: collision with root package name */
    long f39993f;
    long g;
    private RemoteImageView h;
    private RemoteImageView i;
    private TextView j;
    private TextView k;
    private LinearLayout l;
    private LinearLayout m;
    private KeepRatioLayout n;
    private KeepRatioLayout o;
    private RemoteImageView p;
    private ConstraintLayout q;
    private LinearLayout r;
    private DmtTextView s;
    private LinearLayout t;
    private DmtTextView u;
    private FrameLayout v;
    private View w;
    private CountDownTimer x;
    private View y;
    private final RequestCheckListener z = new RequestCheckListener(this);

    static class RequestCheckListener extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39996a;

        /* renamed from: b  reason: collision with root package name */
        private final SearchAdView f39997b;

        RequestCheckListener(SearchAdView searchAdView) {
            this.f39997b = searchAdView;
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f39996a, false, 32993, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f39996a, false, 32993, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f39997b.a();
        }

        @SuppressLint({"TooManyMethodParam"})
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f39996a, false, 32992, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f39996a, false, 32992, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f39997b.a();
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39998a;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ViewHolder(@android.support.annotation.NonNull android.view.ViewGroup r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.commercialize.views.SearchAdView.f39988a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<android.view.ViewGroup> r3 = android.view.ViewGroup.class
                r7[r9] = r3
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.SearchAdView> r8 = com.ss.android.ugc.aweme.commercialize.views.SearchAdView.class
                r3 = 0
                r5 = 1
                r6 = 32969(0x80c9, float:4.62E-41)
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003a
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.views.SearchAdView.f39988a
                r13 = 1
                r14 = 32969(0x80c9, float:4.62E-41)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<android.view.ViewGroup> r0 = android.view.ViewGroup.class
                r15[r9] = r0
                java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.SearchAdView> r16 = com.ss.android.ugc.aweme.commercialize.views.SearchAdView.class
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                com.ss.android.ugc.aweme.commercialize.views.SearchAdView r0 = (com.ss.android.ugc.aweme.commercialize.views.SearchAdView) r0
            L_0x0036:
                r1 = r0
                r0 = r17
                goto L_0x004c
            L_0x003a:
                android.content.Context r1 = r18.getContext()
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r2 = 2131690768(0x7f0f0510, float:1.9010589E38)
                android.view.View r0 = r1.inflate(r2, r0, r9)
                com.ss.android.ugc.aweme.commercialize.views.SearchAdView r0 = (com.ss.android.ugc.aweme.commercialize.views.SearchAdView) r0
                goto L_0x0036
            L_0x004c:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.SearchAdView.ViewHolder.<init>(android.view.ViewGroup):void");
        }
    }

    static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39999a;

        /* renamed from: b  reason: collision with root package name */
        final Context f40000b;

        /* renamed from: c  reason: collision with root package name */
        final n f40001c;

        /* renamed from: d  reason: collision with root package name */
        private final n.a f40002d;

        /* renamed from: e  reason: collision with root package name */
        private final int f40003e;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39999a, false, 32990, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39999a, false, 32990, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            d.a().a("result_ad").b("click").a(Long.valueOf(this.f40001c.id)).d(String.format(Locale.US, "sq_module%d", new Object[]{Integer.valueOf(this.f40003e + 1)})).g(this.f40001c.logExtra).a(this.f40000b);
            if (!g.a(this.f40000b, this.f40002d.f39400d, false)) {
                g.a(this.f40000b, this.f40002d.f39399c, this.f40002d.f39398b);
                d.a().a("result_ad").b("open_url_h5").a(Long.valueOf(this.f40001c.id)).g(this.f40001c.logExtra).a(this.f40000b);
            } else if (!g.a(this.f40002d.f39400d)) {
                d.a().a("result_ad").b("open_url_app").a(Long.valueOf(this.f40001c.id)).g(this.f40001c.logExtra).a(this.f40000b);
                g.a((g.a) new v(this));
            }
        }

        a(Context context, n nVar, n.a aVar, int i) {
            this.f40000b = context;
            this.f40001c = nVar;
            this.f40002d = aVar;
            this.f40003e = i;
        }
    }

    private boolean c() {
        if (this.f39990c.nativeType == 1) {
            return true;
        }
        return false;
    }

    private boolean d() {
        if (this.f39990c.nativeType == 2) {
            return true;
        }
        return false;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32976, new Class[0], Void.TYPE);
            return;
        }
        this.f39993f = System.currentTimeMillis();
        postDelayed(new t(this), 200);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32982, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32982, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (c() || d()) {
            return true;
        } else {
            return false;
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32973, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32973, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.y instanceof RecyclerView) {
            ((RecyclerView) this.y).removeOnScrollListener(this.z);
        } else {
            this.y.removeOnLayoutChangeListener(this.z);
        }
        this.y = null;
        if (this.x != null) {
            this.x.cancel();
        }
    }

    public void onAttachedToWindow() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32972, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32972, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (!PatchProxy.isSupport(new Object[0], this, f39988a, false, 32974, new Class[0], View.class)) {
            view = this;
            while (true) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    if (!(parent instanceof RecyclerView)) {
                        if (!(parent instanceof View)) {
                            break;
                        }
                        view = (View) parent;
                    } else {
                        view = (View) parent;
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            view = (View) PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32974, new Class[0], View.class);
        }
        this.y = view;
        if (this.y instanceof RecyclerView) {
            ((RecyclerView) this.y).addOnScrollListener(this.z);
        } else {
            this.y.addOnLayoutChangeListener(this.z);
        }
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32970, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32970, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.h = (RemoteImageView) findViewById(C0906R.id.cks);
        this.i = (RemoteImageView) findViewById(C0906R.id.ckj);
        this.j = (TextView) findViewById(C0906R.id.ckx);
        this.k = (TextView) findViewById(C0906R.id.ckw);
        this.l = (LinearLayout) findViewById(C0906R.id.cki);
        this.m = (LinearLayout) findViewById(C0906R.id.c_);
        this.n = (KeepRatioLayout) findViewById(C0906R.id.ca);
        this.o = (KeepRatioLayout) findViewById(C0906R.id.cku);
        this.p = (RemoteImageView) findViewById(C0906R.id.clu);
        this.q = (ConstraintLayout) findViewById(C0906R.id.ckl);
        this.r = (LinearLayout) findViewById(C0906R.id.ckq);
        this.s = (DmtTextView) findViewById(C0906R.id.ckr);
        this.t = (LinearLayout) findViewById(C0906R.id.ckm);
        this.u = (DmtTextView) findViewById(C0906R.id.cko);
        this.f39989b = (DmtTextView) findViewById(C0906R.id.ckn);
        try {
            this.f39989b.setTypeface(Typeface.createFromAsset(getContext().getAssets(), "DIN-Condensed-Bold.otf"));
        } catch (Exception unused) {
        }
        this.v = (FrameLayout) findViewById(C0906R.id.ckp);
        this.w = findViewById(C0906R.id.ckk);
        this.o.a(BuildConfig.VERSION_CODE, 272, 1);
        setOnClickListener(this);
        this.q.setOnClickListener(this);
    }

    public SearchAdView(Context context) {
        super(context);
    }

    private void setupBottomDivideLine(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39988a, false, 32979, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39988a, false, 32979, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.w.getLayoutParams();
        layoutParams.topMargin = i2;
        this.w.setLayoutParams(layoutParams);
    }

    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f39988a, false, 32971, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f39988a, false, 32971, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null && this.f39990c != null) {
            if (view.getId() != C0906R.id.ckl || b()) {
                if (b()) {
                    str = "flash";
                } else {
                    str = "card";
                }
                com.ss.android.ugc.aweme.commercialize.log.g.b(getContext(), Long.toString(this.f39990c.id), str, this.f39990c.logExtra);
                if (!b()) {
                    com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) new r(this), this.f39990c.clickTrackUrlList, true);
                }
                if (!com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), this.f39990c.openUrl, false)) {
                    com.ss.android.ugc.aweme.commercialize.utils.g.a(getContext(), this.f39990c.webUrl, this.f39990c.webTitle);
                    if (b()) {
                        d.a().a("result_ad").b("open_url_h5").a(Long.valueOf(this.f39990c.id)).g(this.f39990c.logExtra).d(str).a(getContext());
                        return;
                    }
                    d.a().a("result_ad").b("open_url_h5").a(Long.valueOf(this.f39990c.id)).g(this.f39990c.logExtra).a(getContext());
                } else if (!com.ss.android.ugc.aweme.commercialize.utils.g.a(this.f39990c.openUrl)) {
                    d.a().a("result_ad").b("open_url_app").a(Long.valueOf(this.f39990c.id)).g(this.f39990c.logExtra).a(getContext());
                    com.ss.android.ugc.aweme.commercialize.utils.g.a((g.a) new s(this));
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.commercialize.log.g.b(getContext(), Long.toString(this.f39990c.id), "photoname", this.f39990c.logExtra);
            com.ss.android.ugc.aweme.commercialize.log.g.a((g.a) new q(this), this.f39990c.clickTrackUrlList, true);
            if (this.f39990c.advertisementInfo != null) {
                UserProfileActivity.a(getContext(), this.f39990c.advertisementInfo);
            }
        }
    }

    public void setup(@NonNull n nVar) {
        int i2;
        int i3;
        n nVar2 = nVar;
        if (PatchProxy.isSupport(new Object[]{nVar2}, this, f39988a, false, 32978, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar2}, this, f39988a, false, 32978, new Class[]{n.class}, Void.TYPE);
            return;
        }
        this.f39990c = nVar2;
        if (nVar2.imageList != null && !nVar2.imageList.isEmpty()) {
            c.b(this.h, nVar2.imageList.get(0));
        }
        if (!TextUtils.isEmpty(nVar2.label)) {
            this.k.setText(nVar2.label);
        } else {
            this.k.setText(C0906R.string.ck);
        }
        if (nVar2.advertisementInfo == null || nVar2.advertisementInfo.getAvatarThumb() == null) {
            this.i.setVisibility(8);
        } else {
            c.b(this.i, nVar2.advertisementInfo.getAvatarThumb());
            this.i.setVisibility(0);
        }
        if (!TextUtils.isEmpty(nVar2.title)) {
            this.j.setText(nVar2.title);
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        LinearLayout linearLayout = this.l;
        if (this.i.getVisibility() == 0 || this.j.getVisibility() == 0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        this.q.setVisibility(this.l.getVisibility());
        this.w.setVisibility(this.l.getVisibility());
        this.m.removeAllViews();
        if (nVar2.advancedInfoList != null && !nVar2.advancedInfoList.isEmpty()) {
            LayoutInflater from = LayoutInflater.from(getContext());
            for (int i4 = 0; i4 < nVar2.advancedInfoList.size(); i4++) {
                n.a aVar = nVar2.advancedInfoList.get(i4);
                if (aVar != null) {
                    if (this.m.getChildCount() > 0) {
                        from.inflate(C0906R.layout.zw, this.m);
                    }
                    View inflate = from.inflate(C0906R.layout.zv, this.m, false);
                    c.b((RemoteImageView) inflate.findViewById(C0906R.id.ckt), aVar.f39401e);
                    ((DmtTextView) inflate.findViewById(C0906R.id.ckv)).setText(aVar.f39397a);
                    inflate.setOnClickListener(new a(getContext(), nVar2, aVar, i4));
                    this.m.addView(inflate);
                }
            }
        }
        if (this.m.getChildCount() > 0) {
            this.n.a(375, 76, 1);
        } else {
            KeepRatioLayout keepRatioLayout = this.n;
            if (PatchProxy.isSupport(new Object[0], keepRatioLayout, KeepRatioLayout.f39947a, false, 32903, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], keepRatioLayout, KeepRatioLayout.f39947a, false, 32903, new Class[0], Void.TYPE);
            } else {
                keepRatioLayout.b(0, 0, keepRatioLayout.f39948b);
            }
        }
        if (this.p != null) {
            if (!b() || nVar2.imageList == null || nVar2.imageList.isEmpty()) {
                this.h.setVisibility(0);
                this.p.setVisibility(8);
            } else {
                this.h.setVisibility(8);
                this.p.setVisibility(0);
                c.b(this.p, nVar2.imageList.get(0));
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32980, new Class[0], Void.TYPE);
        } else if (this.r != null) {
            if (TextUtils.isEmpty(this.f39990c.guideText) || !b()) {
                this.r.setVisibility(8);
            } else {
                this.r.setVisibility(0);
                if (this.s != null) {
                    this.s.setText(this.f39990c.guideText);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f39988a, false, 32981, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39988a, false, 32981, new Class[0], Void.TYPE);
        } else if (this.t != null) {
            if (b()) {
                if (this.u != null) {
                    if (!TextUtils.isEmpty(this.f39990c.subText)) {
                        this.u.setText(this.f39990c.subText);
                        this.u.setVisibility(0);
                    } else {
                        this.u.setVisibility(8);
                    }
                }
                if (this.f39989b != null) {
                    if (c()) {
                        this.f39989b.setVisibility(0);
                        long currentTimeMillis = System.currentTimeMillis();
                        if ((this.f39990c.countDownTimeStamp * 1000) - currentTimeMillis > 0) {
                            AnonymousClass1 r0 = new CountDownTimer((this.f39990c.countDownTimeStamp * 1000) - currentTimeMillis, 1000) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f39994a;

                                public final void onFinish() {
                                    if (PatchProxy.isSupport(new Object[0], this, f39994a, false, 32989, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f39994a, false, 32989, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    SearchAdView.this.f39989b.setText("00 : 00 : 00");
                                }

                                public final void onTick(long j) {
                                    long j2 = j;
                                    if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f39994a, false, 32988, new Class[]{Long.TYPE}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f39994a, false, 32988, new Class[]{Long.TYPE}, Void.TYPE);
                                        return;
                                    }
                                    int i = (int) (j2 / 1000);
                                    int i2 = i / 60;
                                    SearchAdView.this.f39989b.setText(String.format(Locale.getDefault(), "%02d : %02d : %02d", new Object[]{Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60), Integer.valueOf(i % 60)}));
                                }
                            };
                            this.x = r0;
                            this.x.start();
                        } else {
                            this.f39989b.setText("00 : 00 : 00");
                        }
                    } else {
                        this.f39989b.setVisibility(8);
                    }
                }
                if (this.v != null) {
                    this.v.removeAllViews();
                    if (CollectionUtils.isEmpty(this.f39990c.iconList) || !d()) {
                        this.v.setVisibility(8);
                    } else {
                        this.v.setVisibility(0);
                        Context context = getContext();
                        int dip2Px = (int) UIUtils.dip2Px(context, 20.0f);
                        int dip2Px2 = (int) UIUtils.dip2Px(context, 16.0f);
                        int dip2Px3 = (int) UIUtils.dip2Px(context, 2.0f);
                        int size = (this.f39990c.iconList.size() - 1) * dip2Px2;
                        for (int size2 = this.f39990c.iconList.size() - 1; size2 >= 0; size2--) {
                            AvatarWithBorderView avatarWithBorderView = new AvatarWithBorderView(context);
                            avatarWithBorderView.setBorderColor(C0906R.color.a3e);
                            avatarWithBorderView.setBorderWidthPx(dip2Px3);
                            c.b(avatarWithBorderView, this.f39990c.iconList.get(size2));
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dip2Px, dip2Px);
                            layoutParams.setMargins(size, 0, 0, 0);
                            this.v.addView(avatarWithBorderView, layoutParams);
                            size -= dip2Px2;
                        }
                    }
                }
                this.t.setVisibility(8);
                int childCount = this.t.getChildCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= childCount) {
                        break;
                    }
                    View childAt = this.t.getChildAt(i5);
                    if (childAt != null && childAt.getVisibility() == 0) {
                        this.t.setVisibility(0);
                        break;
                    }
                    i5++;
                }
            } else {
                this.t.setVisibility(8);
            }
        }
        if (this.t != null) {
            if (this.t.getVisibility() == 0) {
                i3 = (int) UIUtils.dip2Px(getContext(), 12.0f);
            } else {
                i3 = 0;
            }
            this.l.setPadding(this.l.getPaddingLeft(), i3, this.l.getPaddingRight(), this.m.getPaddingBottom());
        }
        if (this.q != null) {
            if (b()) {
                this.q.setBackgroundResource(2130838180);
                setupBottomDivideLine((int) UIUtils.dip2Px(getContext(), 16.0f));
            } else {
                this.q.setBackgroundColor(0);
                setupBottomDivideLine(0);
            }
        }
        this.f39992e = false;
        a();
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
