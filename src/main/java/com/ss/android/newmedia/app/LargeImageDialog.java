package com.ss.android.newmedia.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Message;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch;
import com.bytedance.ies.uikit.viewpager.ImageViewTouchViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.c;
import com.ss.android.download.a.e;
import com.ss.android.image.b;
import com.ss.android.image.f;
import com.ss.android.image.g;
import com.ss.android.image.j;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class LargeImageDialog extends Dialog implements WeakHandler.IHandler, c<String>, j.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30131a;

    /* renamed from: b  reason: collision with root package name */
    final Context f30132b;

    /* renamed from: c  reason: collision with root package name */
    final b f30133c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f30134d;

    /* renamed from: e  reason: collision with root package name */
    public j f30135e;

    /* renamed from: f  reason: collision with root package name */
    public g f30136f;
    public e<String, Bitmap> g;
    View h;
    TextView i;
    ImageViewTouchViewPager j;
    ImageAdapter k;
    final WeakHandler l = new WeakHandler(this);
    public final List<f> m = new ArrayList();
    final List<f> n = new ArrayList();
    public int o = -1;
    int p = -1;
    public boolean q = true;
    final View.OnClickListener r = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30137a;

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f30137a, false, 18519, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f30137a, false, 18519, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            LargeImageDialog.this.dismiss();
        }
    };

    class ImageAdapter extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30145a;

        /* renamed from: b  reason: collision with root package name */
        final LinkedList<View> f30146b = new LinkedList<>();

        /* renamed from: c  reason: collision with root package name */
        final List<f> f30147c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        LayoutInflater f30148d;

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public int getCount() {
            if (!PatchProxy.isSupport(new Object[0], this, f30145a, false, 18525, new Class[0], Integer.TYPE)) {
                return this.f30147c.size();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f30145a, false, 18525, new Class[0], Integer.TYPE)).intValue();
        }

        /* access modifiers changed from: package-private */
        public final void a(List<f> list) {
            if (PatchProxy.isSupport(new Object[]{list}, this, f30145a, false, 18523, new Class[]{List.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list}, this, f30145a, false, 18523, new Class[]{List.class}, Void.TYPE);
                return;
            }
            this.f30147c.clear();
            if (list != null) {
                this.f30147c.addAll(list);
            }
        }

        private a a(String str) {
            if (PatchProxy.isSupport(new Object[]{str}, this, f30145a, false, 18532, new Class[]{String.class}, a.class)) {
                return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f30145a, false, 18532, new Class[]{String.class}, a.class);
            } else if (LargeImageDialog.this.j == null || StringUtils.isEmpty(str)) {
                return null;
            } else {
                int childCount = LargeImageDialog.this.j.getChildCount();
                a aVar = null;
                for (int i = 0; i < childCount; i++) {
                    Object tag = LargeImageDialog.this.j.getChildAt(i).getTag();
                    if (tag instanceof a) {
                        aVar = (a) tag;
                    }
                    if (aVar != null && aVar.f30151b != null && str.equals(aVar.f30151b.mUri)) {
                        return aVar;
                    }
                }
                return null;
            }
        }

        public int getItemPosition(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f30145a, false, 18526, new Class[]{Object.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f30145a, false, 18526, new Class[]{Object.class}, Integer.TYPE)).intValue();
            } else if (this.f30147c.isEmpty()) {
                return -2;
            } else {
                return super.getItemPosition(obj);
            }
        }

        public final f a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30145a, false, 18524, new Class[]{Integer.TYPE}, f.class)) {
                return (f) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30145a, false, 18524, new Class[]{Integer.TYPE}, f.class);
            } else if (i < 0 || i >= this.f30147c.size()) {
                return null;
            } else {
                return this.f30147c.get(i);
            }
        }

        ImageAdapter(Context context) {
            this.f30148d = LayoutInflater.from(context);
        }

        private void a(a aVar, Object obj) {
            if (PatchProxy.isSupport(new Object[]{aVar, obj}, this, f30145a, false, 18534, new Class[]{a.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar, obj}, this, f30145a, false, 18534, new Class[]{a.class, Object.class}, Void.TYPE);
            } else if (aVar != null) {
                aVar.f30155f.setVisibility(8);
                aVar.g.setVisibility(8);
                if (obj == null) {
                    aVar.i.setVisibility(8);
                    LargeImageDialog.this.a(LargeImageDialog.this.h, false);
                    b.a(Toast.makeText(LargeImageDialog.this.f30132b, C0906R.string.b0v, 0));
                    com.ss.android.common.lib.a.a(LargeImageDialog.this.f30132b, "image", "fail");
                    return;
                }
                aVar.i.setVisibility(0);
                aVar.j.setVisibility(8);
                LargeImageDialog.this.a(LargeImageDialog.this.h, true);
                if (obj instanceof Bitmap) {
                    aVar.i.setImageBitmap((Bitmap) obj);
                    return;
                }
                if (obj instanceof pl.droidsonroids.gif.a) {
                    aVar.i.setImageDrawable((pl.droidsonroids.gif.a) obj);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{str, obj2}, this, f30145a, false, 18533, new Class[]{String.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, obj2}, this, f30145a, false, 18533, new Class[]{String.class, Object.class}, Void.TYPE);
                return;
            }
            a(a(str), obj2);
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            a aVar;
            Bitmap bitmap;
            ViewGroup viewGroup2 = viewGroup;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f30145a, false, 18527, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class)) {
                return PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f30145a, false, 18527, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            }
            if (this.f30146b.size() > 0) {
                view = this.f30146b.removeFirst();
            } else {
                view = null;
            }
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f30145a, false, 18529, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class)) {
                view2 = (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, viewGroup2}, this, f30145a, false, 18529, new Class[]{Integer.TYPE, View.class, ViewGroup.class}, View.class);
            } else {
                if (view == null) {
                    aVar = new a();
                    View inflate = this.f30148d.inflate(C0906R.layout.rb, viewGroup2, false);
                    boolean z = LargeImageDialog.this.f30134d;
                    boolean z2 = z;
                    view2 = inflate;
                    if (PatchProxy.isSupport(new Object[]{inflate, Byte.valueOf(z ? (byte) 1 : 0)}, aVar, a.f30150a, false, 18536, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                        a aVar2 = aVar;
                        PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z2 ? (byte) 1 : 0)}, aVar2, a.f30150a, false, 18536, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                    } else {
                        view2.setOnClickListener(LargeImageDialog.this.r);
                        aVar.f30155f = (ProgressBar) view2.findViewById(C0906R.id.c7k);
                        aVar.g = (TextView) view2.findViewById(C0906R.id.c80);
                        aVar.h = view2.findViewById(C0906R.id.cdx);
                        UIUtils.setViewVisibility(aVar.h, 8);
                        aVar.i = (ImageViewTouch) view2.findViewById(C0906R.id.aix);
                        aVar.j = (ImageView) view2.findViewById(C0906R.id.d2o);
                        if (z2) {
                            aVar.i.setFitToWidth(true);
                        }
                        ViewCompat.setLayerType(aVar.i, 1, null);
                        aVar.f30155f.setVisibility(8);
                        aVar.i.setMyOnClickListener(LargeImageDialog.this.r);
                        aVar.i.setDoubleTapListener(new ImageViewTouch.OnImageViewTouchDoubleTapListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f30156a;

                            public final void onDoubleTap() {
                                if (PatchProxy.isSupport(new Object[0], this, f30156a, false, 18537, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f30156a, false, 18537, new Class[0], Void.TYPE);
                                    return;
                                }
                                LargeImageDialog.this.onEvent("zoom_in");
                            }
                        });
                    }
                    view2.setTag(aVar);
                } else {
                    view2 = view;
                    aVar = (a) view.getTag();
                }
                f fVar = LargeImageDialog.this.m.get(i2);
                aVar.f30154e = false;
                aVar.f30151b = fVar;
                aVar.f30153d = null;
                if (LargeImageDialog.this.n == null || LargeImageDialog.this.n.size() < i2 + 1) {
                    aVar.f30152c = null;
                } else {
                    aVar.f30152c = LargeImageDialog.this.n.get(i2);
                }
                if (fVar.mKey != null) {
                    aVar.f30153d = b.c(fVar.mKey);
                }
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f30145a, false, 18531, new Class[]{a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f30145a, false, 18531, new Class[]{a.class}, Void.TYPE);
                } else {
                    aVar.i.setVisibility(8);
                    if (aVar.f30151b == null || aVar.f30151b.mUri == null) {
                        aVar.f30155f.setVisibility(8);
                    } else {
                        aVar.f30155f.setVisibility(0);
                        aVar.f30155f.setProgress(0);
                        aVar.g.setVisibility(0);
                        aVar.g.setText("");
                        LargeImageDialog.this.a(LargeImageDialog.this.h, false);
                        if (LargeImageDialog.this.g != null) {
                            bitmap = (Bitmap) LargeImageDialog.this.g.a(aVar.f30151b.mUri);
                        } else {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            a(aVar, (Object) bitmap);
                        } else if (LargeImageDialog.this.f30135e == null) {
                            a(aVar.f30151b.mUri, (Object) null);
                        } else {
                            if (LargeImageDialog.this.f30136f == null || aVar.f30152c == null) {
                                UIUtils.setViewVisibility(aVar.j, 8);
                            } else {
                                UIUtils.setViewVisibility(aVar.j, 0);
                                aVar.j.setImageDrawable(null);
                                LargeImageDialog.this.f30136f.a(aVar.j, aVar.f30152c, false);
                            }
                            j jVar = LargeImageDialog.this.f30135e;
                            String str = aVar.f30151b.mUri;
                            String str2 = aVar.f30151b.mUrlList;
                            if (jVar.h) {
                                String md5Hex = DigestUtils.md5Hex(str);
                                if (md5Hex == null) {
                                    jVar.g.a(str, null);
                                } else {
                                    jVar.f29267b.a(md5Hex, str, str2, null);
                                }
                            }
                        }
                    }
                }
            }
            viewGroup2.addView(view2);
            return view2;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            a aVar;
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f30145a, false, 18528, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i), obj}, this, f30145a, false, 18528, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            } else if (obj != null) {
                View view = (View) obj;
                viewGroup2.removeView(view);
                this.f30146b.addFirst(view);
                if (PatchProxy.isSupport(new Object[]{view}, this, f30145a, false, 18530, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f30145a, false, 18530, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                if (view != null) {
                    Object tag = view.getTag();
                    if (tag instanceof a) {
                        aVar = (a) tag;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null) {
                        aVar.f30151b = null;
                        aVar.f30153d = null;
                        aVar.i.clear();
                    }
                }
            }
        }
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30150a;

        /* renamed from: b  reason: collision with root package name */
        f f30151b;

        /* renamed from: c  reason: collision with root package name */
        f f30152c;

        /* renamed from: d  reason: collision with root package name */
        String f30153d;

        /* renamed from: e  reason: collision with root package name */
        boolean f30154e;

        /* renamed from: f  reason: collision with root package name */
        ProgressBar f30155f;
        TextView g;
        View h;
        ImageViewTouch i;
        ImageView j;

        a() {
        }
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f30131a, false, 18513, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30131a, false, 18513, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.j != null) {
            this.m.clear();
            this.k.a(this.m);
            this.k.notifyDataSetChanged();
            int childCount = this.j.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                Object tag = this.j.getChildAt(i2).getTag();
                a aVar = null;
                if (tag instanceof a) {
                    aVar = (a) tag;
                }
                if (!(aVar == null || aVar.f30151b == null || aVar.f30151b.mUri == null)) {
                    aVar.i.clear();
                }
            }
        }
    }

    public final void onEvent(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f30131a, false, 18516, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f30131a, false, 18516, new Class[]{String.class}, Void.TYPE);
            return;
        }
        com.ss.android.common.lib.a.a(this.f30132b, "image", str2);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f30131a, false, 18510, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f30131a, false, 18510, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.k != null && this.i != null && this.q) {
            int count = this.k.getCount();
            int i3 = i2 + 1;
            String str = "";
            if (i3 > 0 && i3 <= count && count > 0) {
                str = i3 + "/" + count;
            }
            this.i.setText(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        a aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f30131a, false, 18508, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f30131a, false, 18508, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.j != null) {
            b(i2);
            int i3 = this.p;
            this.p = i2;
            if (i3 >= 0 && i3 < this.k.getCount()) {
                f a2 = this.k.a(i3);
                f a3 = this.k.a(i2);
                if (a2 != null && a3 != null) {
                    int childCount = this.j.getChildCount();
                    a aVar2 = null;
                    a aVar3 = null;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        Object tag = this.j.getChildAt(i4).getTag();
                        if (tag instanceof a) {
                            aVar = (a) tag;
                        } else {
                            aVar = null;
                        }
                        if (aVar != null) {
                            if (aVar.f30151b == a2) {
                                aVar2 = aVar;
                            }
                            if (aVar.f30151b == a3) {
                                aVar3 = aVar;
                            }
                        }
                    }
                    if (!(aVar2 == null || aVar2.i.getDrawable() == null)) {
                        aVar2.i.zoomTo(1.0f, 300.0f);
                    }
                    if (!(aVar3 == null || aVar3.i.getDrawable() == null || !(aVar3.i.getDrawable() instanceof pl.droidsonroids.gif.a))) {
                        try {
                            ((pl.droidsonroids.gif.a) aVar3.i.getDrawable()).b();
                            ((pl.droidsonroids.gif.a) aVar3.i.getDrawable()).start();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
    }

    public final void handleMsg(Message message) {
        String str;
        a aVar;
        if (PatchProxy.isSupport(new Object[]{message}, this, f30131a, false, 18514, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f30131a, false, 18514, new Class[]{Message.class}, Void.TYPE);
        } else if (message.what == 257 && this.j != null && this.k != null) {
            int i2 = message.arg1;
            if (message.obj instanceof String) {
                str = (String) message.obj;
            } else {
                str = null;
            }
            if (str != null && isShowing()) {
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= 100) {
                    i2 = 99;
                }
                int childCount = this.j.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    Object tag = this.j.getChildAt(i3).getTag();
                    if (tag instanceof a) {
                        aVar = (a) tag;
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && str.equals(aVar.f30153d)) {
                        aVar.f30155f.setProgress(i2);
                        aVar.g.setText(i2 + "%");
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f30131a, false, 18502, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f30131a, false, 18502, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView(C0906R.layout.ra);
        setCancelable(true);
        this.h = findViewById(C0906R.id.cjf);
        this.i = (TextView) findViewById(C0906R.id.bw3);
        this.j = (ImageViewTouchViewPager) findViewById(C0906R.id.ari);
        this.k = new ImageAdapter(this.f30132b);
        this.j.setOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30139a;

            public void onPageSelected(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f30139a, false, 18520, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f30139a, false, 18520, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                LargeImageDialog.this.a(i);
            }
        });
        this.j.setAdapter(this.k);
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30141a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f30141a, false, 18521, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f30141a, false, 18521, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                LargeImageDialog largeImageDialog = LargeImageDialog.this;
                if (PatchProxy.isSupport(new Object[0], largeImageDialog, LargeImageDialog.f30131a, false, 18511, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], largeImageDialog, LargeImageDialog.f30131a, false, 18511, new Class[0], Void.TYPE);
                } else if (largeImageDialog.j != null) {
                    f a2 = largeImageDialog.k.a(largeImageDialog.j.getCurrentItem());
                    if (a2 != null) {
                        String str = a2.mUri;
                        if (!StringUtils.isEmpty(str)) {
                            largeImageDialog.f30133c.a(largeImageDialog.f30132b, DigestUtils.md5Hex(str), str);
                        }
                    }
                }
                LargeImageDialog.this.onEvent("download");
            }
        });
        setOnShowListener(new DialogInterface.OnShowListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f30143a;

            public final void onShow(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f30143a, false, 18522, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f30143a, false, 18522, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                LargeImageDialog largeImageDialog = LargeImageDialog.this;
                if (PatchProxy.isSupport(new Object[0], largeImageDialog, LargeImageDialog.f30131a, false, 18509, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], largeImageDialog, LargeImageDialog.f30131a, false, 18509, new Class[0], Void.TYPE);
                    return;
                }
                if (largeImageDialog.j != null) {
                    largeImageDialog.k.a((List<f>) null);
                    largeImageDialog.k.notifyDataSetChanged();
                    largeImageDialog.k.a(largeImageDialog.m);
                    largeImageDialog.k.notifyDataSetChanged();
                    int count = largeImageDialog.k.getCount();
                    if (largeImageDialog.o >= 0 && largeImageDialog.o < count) {
                        largeImageDialog.j.setCurrentItem(largeImageDialog.o, false);
                    }
                    largeImageDialog.b(largeImageDialog.j.getCurrentItem());
                    largeImageDialog.o = -1;
                    if (count > 0) {
                        largeImageDialog.h.setVisibility(0);
                        return;
                    }
                    largeImageDialog.h.setVisibility(8);
                }
            }
        });
    }

    public final /* synthetic */ void a(int i2, Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f30131a, false, 18512, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f30131a, false, 18512, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Message obtainMessage = this.l.obtainMessage(257);
        obtainMessage.arg1 = i2;
        obtainMessage.obj = str;
        this.l.sendMessage(obtainMessage);
    }

    public final void a(View view, boolean z) {
        if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f30131a, false, 18518, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f30131a, false, 18518, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(view == null || view.isEnabled() == z)) {
            view.setEnabled(z);
        }
    }

    public final void a(String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f30131a, false, 18515, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f30131a, false, 18515, new Class[]{String.class, Object.class}, Void.TYPE);
        } else if (isShowing() && this.k != null) {
            this.k.a(str, obj);
        }
    }

    public LargeImageDialog(Context context, b bVar, boolean z) {
        super(context, 16973830);
        this.f30132b = context;
        this.f30133c = bVar;
        this.f30134d = true;
        this.g = new e<>();
    }
}
