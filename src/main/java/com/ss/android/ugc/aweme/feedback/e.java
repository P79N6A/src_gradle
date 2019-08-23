package com.ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.uikit.base.LifeCycleMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.h;
import com.ss.android.image.b;
import com.ss.android.image.g;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feedback.d;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.t;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class e extends BaseAdapter implements LifeCycleMonitor, p {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47159a;

    /* renamed from: b  reason: collision with root package name */
    List<d> f47160b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private LayoutInflater f47161c;

    /* renamed from: d  reason: collision with root package name */
    private SimpleDateFormat f47162d;

    /* renamed from: e  reason: collision with root package name */
    private com.ss.android.image.a f47163e;

    /* renamed from: f  reason: collision with root package name */
    private g f47164f;
    private h g;
    private BaseAppData h;
    private Context i;
    private ColorFilter j;
    private int k;
    private int l = 20000;
    private boolean m = true;
    private boolean n = false;
    private p o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47165a;

        /* renamed from: b  reason: collision with root package name */
        public ImageView f47166b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f47167c;

        /* renamed from: d  reason: collision with root package name */
        public ImageView f47168d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f47169e;

        /* renamed from: f  reason: collision with root package name */
        public TextView f47170f;
        public LinearLayout g;
        public View h;
        public View i;
        public View j;
        public View k;
        public d l;
        public boolean m;
        public p n;
        View.OnClickListener o = new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47171a;

            public final void onClick(View view) {
                Bitmap bitmap;
                if (PatchProxy.isSupport(new Object[]{view}, this, f47171a, false, 43789, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f47171a, false, 43789, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (a.this.l != null && a.this.n != null && a.this.f47168d != null) {
                    Drawable drawable = a.this.f47168d.getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        bitmap = ((BitmapDrawable) drawable).getBitmap();
                    } else {
                        bitmap = null;
                    }
                    a.this.n.a(a.this.l.g, null, bitmap);
                }
            }
        };

        public a(p pVar) {
            this.n = pVar;
        }
    }

    public final void onPause() {
    }

    public final int getCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f47159a, false, 43778, new Class[0], Integer.TYPE)) {
            return this.f47160b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f47159a, false, 43778, new Class[0], Integer.TYPE)).intValue();
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f47159a, false, 43784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47159a, false, 43784, new Class[0], Void.TYPE);
            return;
        }
        this.n = true;
        if (this.f47163e != null) {
            this.f47163e.a();
        }
        if (this.f47164f != null) {
            this.f47164f.a();
        }
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f47159a, false, 43785, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47159a, false, 43785, new Class[0], Void.TYPE);
            return;
        }
        this.n = false;
        if (this.f47163e != null) {
            this.f47163e.b();
        }
        if (this.f47164f != null) {
            this.f47164f.b();
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f47159a, false, 43786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47159a, false, 43786, new Class[0], Void.TYPE);
            return;
        }
        if (this.f47163e != null) {
            this.f47163e.c();
        }
        if (this.f47164f != null) {
            g gVar = this.f47164f;
            gVar.t = false;
            gVar.f29241d.clear();
            gVar.h.b();
            com.ss.android.download.a.e<String, Bitmap> eVar = gVar.f29243f;
            eVar.f28438c.clear();
            eVar.f28436a.f28441b = eVar.f28437b;
            eVar.f28437b.f28440a = eVar.f28436a;
            if (gVar.p != null) {
                gVar.p.a();
            }
        }
        if (this.g != null) {
            this.g.a();
        }
    }

    public final Object getItem(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47159a, false, 43779, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47159a, false, 43779, new Class[]{Integer.TYPE}, Object.class);
        } else if (i2 < 0 || i2 >= this.f47160b.size()) {
            return null;
        } else {
            return this.f47160b.get(i2);
        }
    }

    public final long getItemId(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f47159a, false, 43780, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f47159a, false, 43780, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        } else if (i2 < 0 || i2 >= this.f47160b.size()) {
            return -1;
        } else {
            return this.f47160b.get(i2).f47146c;
        }
    }

    public e(Context context, p pVar) {
        Locale locale;
        Context context2 = context;
        this.f47161c = LayoutInflater.from(context);
        this.f47162d = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).isArabicLang(context2)) {
            locale = Locale.US;
        } else {
            locale = ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getCountryLocale();
        }
        this.f47162d = new SimpleDateFormat("yyyy-MM-dd HH:mm", locale);
        this.g = new h();
        this.h = BaseAppData.a();
        this.i = context2;
        this.j = BaseAppData.i();
        this.o = pVar;
        Resources resources = context.getResources();
        boolean z = resources.getBoolean(C0906R.bool.g);
        int dimensionPixelSize = resources.getDimensionPixelSize(C0906R.dimen.g9);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0906R.dimen.g7);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(C0906R.dimen.g8);
        if (z) {
            com.ss.android.image.a aVar = new com.ss.android.image.a(2130838561, this.g, new b(context2), dimensionPixelSize3 * 2, false, dimensionPixelSize3, true);
            this.f47163e = aVar;
        } else {
            com.ss.android.image.a aVar2 = new com.ss.android.image.a(2130840567, this.g, new b(context2), dimensionPixelSize, false, dimensionPixelSize2);
            this.f47163e = aVar2;
        }
        this.m = resources.getBoolean(C0906R.bool.h);
        this.k = resources.getDisplayMetrics().widthPixels - resources.getDimensionPixelOffset(C0906R.dimen.g_);
        g gVar = new g(context, this.g, 4, 4, 4, new b(context2), this.k, this.l, 2130838334);
        this.f47164f = gVar;
        this.q = resources.getColor(C0906R.color.a08);
        this.p = resources.getColor(C0906R.color.a32);
        this.r = resources.getColor(C0906R.color.mf);
        this.s = resources.getColor(C0906R.color.mr);
        this.t = resources.getColor(C0906R.color.mg);
        this.u = resources.getDimensionPixelOffset(C0906R.dimen.ga);
        this.v = resources.getDimensionPixelOffset(C0906R.dimen.gb);
    }

    public final void a(String str, String str2, Bitmap bitmap) {
        Bitmap bitmap2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4, bitmap}, this, f47159a, false, 43787, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, bitmap}, this, f47159a, false, 43787, new Class[]{String.class, String.class, Bitmap.class}, Void.TYPE);
        } else if (this.n) {
            if (bitmap == null) {
                g gVar = this.f47164f;
                String md5Hex = DigestUtils.md5Hex(str);
                bitmap2 = null;
                if (md5Hex != null) {
                    bitmap2 = (Bitmap) gVar.f29243f.a(md5Hex);
                    if (bitmap2 == null && gVar.f29242e != null) {
                        bitmap2 = (Bitmap) gVar.f29242e.a(md5Hex);
                    }
                }
            } else {
                bitmap2 = bitmap;
            }
            if (this.o != null) {
                this.o.a(str, str4, bitmap2);
            }
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        a aVar;
        int i3;
        int i4;
        int i5;
        ColorFilter colorFilter;
        int i6;
        int i7;
        String str;
        int i8;
        int i9 = i2;
        char c2 = 3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view, viewGroup}, this, f47159a, false, 43781, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view, viewGroup}, this, f47159a, false, 43781, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
        }
        if (view == null) {
            a aVar2 = new a(this);
            View inflate = this.f47161c.inflate(C0906R.layout.m8, null);
            aVar2.f47167c = (ImageView) inflate.findViewById(C0906R.id.ib);
            aVar2.f47166b = (ImageView) inflate.findViewById(C0906R.id.i6);
            aVar2.f47168d = (ImageView) inflate.findViewById(C0906R.id.ad5);
            aVar2.f47169e = (TextView) inflate.findViewById(C0906R.id.ad7);
            aVar2.f47170f = (TextView) inflate.findViewById(C0906R.id.ad8);
            aVar2.g = (LinearLayout) inflate.findViewById(C0906R.id.ad6);
            aVar2.h = inflate.findViewById(C0906R.id.ceo);
            aVar2.i = inflate.findViewById(C0906R.id.bb0);
            aVar2.j = inflate.findViewById(C0906R.id.d5j);
            aVar2.k = inflate.findViewById(C0906R.id.mn);
            inflate.setTag(aVar2);
            aVar = aVar2;
            view2 = inflate;
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        if (i9 == 0) {
            aVar.j.setVisibility(0);
        } else {
            aVar.j.setVisibility(8);
        }
        if (i9 == this.f47160b.size() - 1) {
            aVar.k.setVisibility(0);
        } else {
            aVar.k.setVisibility(8);
        }
        d dVar = this.f47160b.get(i9);
        if (PatchProxy.isSupport(new Object[]{dVar}, aVar, a.f47165a, false, 43788, new Class[]{d.class}, Void.TYPE)) {
            a aVar3 = aVar;
            PatchProxy.accessDispatch(new Object[]{dVar}, aVar3, a.f47165a, false, 43788, new Class[]{d.class}, Void.TYPE);
        } else {
            aVar.l = dVar;
            if (aVar.f47168d != null) {
                aVar.f47168d.setOnClickListener(aVar.o);
            }
        }
        if (dVar.m == null || dVar.m.size() <= 0 || StringUtils.isEmpty(dVar.f47149f)) {
            aVar.f47169e.setText(dVar.f47149f);
            TextView textView = aVar.f47169e;
            if (StringUtils.isEmpty(dVar.f47149f)) {
                i8 = 8;
            } else {
                i8 = 0;
            }
            textView.setVisibility(i8);
        } else {
            SpannableString spannableString = new SpannableString(dVar.f47149f);
            int size = dVar.m.size();
            for (int i10 = 0; i10 < size; i10++) {
                d.b bVar = dVar.m.get(i10);
                m mVar = new m(bVar.f47157d);
                if (bVar != null && bVar.f47155b >= 0 && bVar.f47156c > 0) {
                    int i11 = bVar.f47155b;
                    int i12 = bVar.f47155b + bVar.f47156c;
                    Object[] objArr = new Object[5];
                    objArr[0] = spannableString;
                    objArr[1] = mVar;
                    objArr[2] = Integer.valueOf(i11);
                    objArr[c2] = Integer.valueOf(i12);
                    objArr[4] = 34;
                    if (PatchProxy.isSupport(objArr, null, f.f47173a, true, 43790, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {spannableString, mVar, Integer.valueOf(i11), Integer.valueOf(i12), 34};
                        c2 = 3;
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, f.f47173a, true, 43790, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    } else {
                        c2 = 3;
                        spannableString.setSpan(mVar, i11, i12, 34);
                    }
                }
            }
            aVar.f47169e.setText(spannableString);
            aVar.f47169e.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (dVar.f47148e <= 0 || i9 == 0) {
            aVar.f47170f.setVisibility(8);
        } else {
            aVar.f47170f.setVisibility(0);
            aVar.f47170f.setText(this.f47162d.format(new Date(dVar.f47148e * 1000)));
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) aVar.f47170f.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) aVar.g.getLayoutParams();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) aVar.f47169e.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) aVar.f47168d.getLayoutParams();
        if (aVar.m) {
            i3 = this.s;
        } else {
            i3 = this.q;
        }
        if (aVar.m) {
            i4 = this.t;
        } else {
            i4 = this.r;
        }
        if (aVar.m) {
            i5 = this.t;
        } else {
            i5 = this.p;
        }
        if (dVar.k == 0) {
            aVar.g.setBackgroundResource(2130837959);
            if (Build.VERSION.SDK_INT >= 19) {
                aVar.g.getBackground().setAutoMirrored(true);
            }
            aVar.g.setGravity(8388613);
            aVar.f47167c.setVisibility(0);
            aVar.f47166b.setVisibility(4);
            aVar.f47169e.setTextColor(i3);
            aVar.f47170f.setTextColor(i5);
            if (this.f47163e != null) {
                User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                if (curUser == null) {
                    str = "";
                } else {
                    UrlModel a2 = t.a(curUser);
                    if (a2 == null || a2.getUrlList() == null || a2.getUrlList().size() == 0) {
                        str = "";
                    } else {
                        str = a2.getUrlList().get(0);
                    }
                }
                this.f47163e.a(aVar.f47167c, str);
            }
            aVar.h.setVisibility(8);
            aVar.i.setVisibility(0);
            layoutParams.gravity = 8388613;
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = this.v;
                layoutParams3.rightMargin = this.u;
            }
            if (layoutParams4 != null) {
                layoutParams4.leftMargin = this.v;
                layoutParams4.rightMargin = this.u;
                if (aVar.f47169e.getVisibility() == 8) {
                    layoutParams4.topMargin = u.a(10.0d);
                } else {
                    layoutParams4.topMargin = 0;
                }
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388613;
            }
        } else {
            aVar.g.setBackgroundResource(2130837958);
            if (Build.VERSION.SDK_INT >= 19) {
                aVar.g.getBackground().setAutoMirrored(true);
            }
            aVar.g.setGravity(8388611);
            aVar.f47167c.setVisibility(4);
            aVar.f47166b.setVisibility(0);
            aVar.f47169e.setTextColor(i4);
            aVar.f47170f.setTextColor(i5);
            aVar.f47166b.setImageResource(2130838561);
            if (this.f47163e != null) {
                this.f47163e.a(aVar.f47166b, dVar.h);
            }
            aVar.h.setVisibility(0);
            aVar.i.setVisibility(8);
            if (layoutParams3 != null) {
                layoutParams3.leftMargin = this.u;
                layoutParams3.rightMargin = this.v;
            }
            if (layoutParams4 != null) {
                layoutParams4.leftMargin = this.u;
                layoutParams4.rightMargin = this.v;
            }
            if (layoutParams2 != null) {
                layoutParams2.gravity = 8388611;
            }
        }
        aVar.g.requestLayout();
        if (StringUtils.isEmpty(dVar.g) || dVar.i <= 0 || dVar.j <= 0) {
            colorFilter = null;
            aVar.f47168d.setVisibility(8);
        } else {
            aVar.f47168d.setVisibility(0);
            int i13 = (this.k * dVar.j) / dVar.i;
            ViewGroup.LayoutParams layoutParams5 = aVar.f47168d.getLayoutParams();
            layoutParams5.height = i13;
            layoutParams5.width = this.k;
            aVar.f47168d.setLayoutParams(layoutParams5);
            if (!com.ss.android.a.a.a() || !this.m) {
                aVar.f47168d.setImageResource(2130838334);
            } else {
                aVar.f47168d.setImageResource(2130838335);
            }
            colorFilter = null;
            this.f47164f.a(aVar.f47168d, dVar.g, (String) null);
        }
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f47159a, false, 43782, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f47159a, false, 43782, new Class[]{a.class}, Void.TYPE);
        } else if (aVar.m != com.ss.android.a.a.a() && this.m) {
            aVar.m = com.ss.android.a.a.a();
            Resources resources = this.i.getResources();
            if (aVar.m) {
                i6 = C0906R.color.mg;
            } else {
                i6 = C0906R.color.mf;
            }
            if (aVar.m) {
                i7 = C0906R.color.mm;
            } else {
                i7 = C0906R.color.ml;
            }
            if (aVar.m) {
                colorFilter = this.j;
            }
            aVar.f47169e.setTextColor(resources.getColor(i6));
            aVar.f47170f.setTextColor(resources.getColor(i7));
            aVar.f47166b.setColorFilter(colorFilter);
            aVar.f47167c.setColorFilter(colorFilter);
        }
        return view2;
    }
}
