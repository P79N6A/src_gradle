package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.commerce.service.l.d;
import com.ss.android.ugc.aweme.commerce.service.logs.an;
import com.ss.android.ugc.aweme.commerce.service.models.h;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;

public final class ah extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64624a;

    /* renamed from: b  reason: collision with root package name */
    String f64625b;

    /* renamed from: c  reason: collision with root package name */
    boolean f64626c;
    private String n;
    private String o;
    private h p;
    private TextView q;
    private TextView r;
    private AnimatedImageView s;
    private e t;
    private an u;

    interface a {
        void a(File file);
    }

    public final IShareService.ShareStruct a(File file) {
        return null;
    }

    public final int b() {
        return C0906R.layout.j5;
    }

    public final int g() {
        return 7;
    }

    public final String f() {
        return this.o;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64624a, false, 73035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64624a, false, 73035, new Class[0], Void.TYPE);
            return;
        }
        this.t.b(20, this.f64625b);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f64624a, false, 73036, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64624a, false, 73036, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.o)) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64624a, false, 73038, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64624a, false, 73038, new Class[0], Void.TYPE);
            return;
        }
        this.t = new e(new b(), this);
        this.u = new an(this.f3881f, this.p);
        this.q = (TextView) findViewById(C0906R.id.dkk);
        this.r = (TextView) findViewById(C0906R.id.dgk);
        this.s = (AnimatedImageView) findViewById(C0906R.id.asf);
        this.f3880e = (ImageView) findViewById(C0906R.id.ate);
    }

    @SuppressLint({"SetTextI18n"})
    public final void e() {
        CharSequence charSequence;
        CharSequence charSequence2;
        if (PatchProxy.isSupport(new Object[0], this, f64624a, false, 73039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64624a, false, 73039, new Class[0], Void.TYPE);
            return;
        }
        this.q.setText(this.p.getTitle());
        TextView textView = this.r;
        int price = this.p.getPrice();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(price)}, null, x.f65321a, true, 73000, new Class[]{Integer.TYPE}, CharSequence.class)) {
            charSequence = (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(price)}, null, x.f65321a, true, 73000, new Class[]{Integer.TYPE}, CharSequence.class);
        } else {
            String str = "￥ " + d.a(price);
            SpannableString spannableString = new SpannableString(str);
            int length = spannableString.length();
            if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                length = str.indexOf(ClassUtils.PACKAGE_SEPARATOR);
            }
            if (2 < length) {
                y.a(spannableString, new AbsoluteSizeSpan(18, true), 2, length, 17);
            }
            charSequence = spannableString;
        }
        textView.setText(charSequence);
        List<UrlModel> preferredImages = this.p.preferredImages();
        if (!preferredImages.isEmpty() && preferredImages.get(0) != null) {
            this.s.setImageLoadFinishListener(new ai(this));
            c.b(this.s, preferredImages.get(0));
        }
        an anVar = this.u;
        if (PatchProxy.isSupport(new Object[0], anVar, an.f64648a, false, 73052, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], anVar, an.f64648a, false, 73052, new Class[0], Void.TYPE);
            return;
        }
        anVar.f64649b.setText(anVar.f64653f.getTitle());
        TextView textView2 = anVar.f64650c;
        int price2 = anVar.f64653f.getPrice();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(price2)}, null, x.f65321a, true, 73001, new Class[]{Integer.TYPE}, CharSequence.class)) {
            charSequence2 = (CharSequence) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(price2)}, null, x.f65321a, true, 73001, new Class[]{Integer.TYPE}, CharSequence.class);
        } else {
            String str2 = "￥ " + d.a(price2);
            SpannableString spannableString2 = new SpannableString(str2);
            int length2 = spannableString2.length();
            if (str2.contains(ClassUtils.PACKAGE_SEPARATOR)) {
                length2 = str2.indexOf(ClassUtils.PACKAGE_SEPARATOR);
            }
            if (2 < length2) {
                y.a(spannableString2, new AbsoluteSizeSpan(48, false), 2, length2, 17);
            }
            charSequence2 = spannableString2;
        }
        textView2.setText(charSequence2);
        List<UrlModel> preferredImages2 = anVar.f64653f.preferredImages();
        if (!preferredImages2.isEmpty() && preferredImages2.get(0) != null) {
            c.b(anVar.f64651d, preferredImages2.get(0));
            if (anVar.f64651d.getDrawable() != null) {
                anVar.f64651d.getDrawable().setVisible(true, false);
            }
        }
        if (anVar.f64651d.getDrawable() != null) {
            anVar.f64651d.getDrawable().setVisible(true, false);
        }
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f64624a, false, 73037, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f64624a, false, 73037, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.a(bitmap);
        this.u.a(bitmap2);
        i();
    }

    public final void a(com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64624a, false, 73041, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64624a, false, 73041, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (this.j && !this.f64626c && isShowing()) {
            this.f64626c = true;
            a(aVar, (a) new ak(this, aVar));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(final com.douyin.baseshare.a aVar, final File file) {
        this.f64626c = false;
        if (file != null && file.exists()) {
            if (f.c(this.f3881f) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f3881f, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64627a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f64627a, false, 73049, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64627a, false, 73049, new Class[0], Void.TYPE);
                            return;
                        }
                        ah.this.a(aVar, file);
                        ah.this.dismiss();
                    }
                });
                return;
            }
            a(aVar, file);
            dismiss();
        }
    }

    private void a(com.douyin.baseshare.a aVar, a aVar2) {
        if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f64624a, false, 73042, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f64624a, false, 73042, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE);
            return;
        }
        Bitmap a2 = this.u.a();
        if (a2 == null) {
            this.f64626c = false;
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
            ExceptionMonitor.ensureNotReachHere("build bitmap is null");
            aVar2.a(null);
            return;
        }
        i.a((Callable<TResult>) new al<TResult>(this, aVar, a2)).a((g<TResult, TContinuationResult>) new am<TResult,TContinuationResult>(aVar2), i.f1052b);
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f64624a, false, 73040, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f64624a, false, 73040, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (!c()) {
            String d2 = aVar.d();
            if (TextUtils.equals("save_local", d2)) {
                d2 = "normal";
            }
            an anVar = new an();
            anVar.h = this.n;
            anVar.g = this.p.getPromotionId();
            anVar.j = String.valueOf(this.p.getCommodityType());
            anVar.k = d2;
            anVar.b();
            if (!aVar.a()) {
                com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
            } else if (f.c(this.f3881f) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f3881f, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64631a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f64631a, false, 73050, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64631a, false, 73050, new Class[0], Void.TYPE);
                            return;
                        }
                        ah.this.a(aVar);
                    }
                });
            } else {
                a(aVar);
            }
        } else if (!this.f64626c && isShowing()) {
            this.f64626c = true;
            a(aVar, (a) new aj(this, aVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ah(@NonNull Activity activity, String str, String str2, String str3, h hVar) {
        super(activity);
        String str4;
        String str5;
        String str6 = str2;
        this.n = str6;
        this.o = str;
        this.p = hVar;
        String promotionId = hVar.getPromotionId();
        String productId = hVar.getProductId();
        if (PatchProxy.isSupport(new Object[]{str6, promotionId, productId, str3}, null, x.f65321a, true, 73004, new Class[]{String.class, String.class, String.class, String.class}, String.class)) {
            str4 = (String) PatchProxy.accessDispatch(new Object[]{str6, promotionId, productId, str3}, null, x.f65321a, true, 73004, new Class[]{String.class, String.class, String.class, String.class}, String.class);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.isEmpty(str2) ? PushConstants.PUSH_TYPE_NOTIFY : str6);
            sb.append("_");
            sb.append(TextUtils.isEmpty(promotionId) ? PushConstants.PUSH_TYPE_NOTIFY : promotionId);
            sb.append("_");
            sb.append(TextUtils.isEmpty(productId) ? PushConstants.PUSH_TYPE_NOTIFY : productId);
            sb.append("_");
            if (!TextUtils.isEmpty(str3)) {
                str5 = str3;
            } else {
                str5 = PushConstants.PUSH_TYPE_NOTIFY;
            }
            sb.append(str5);
            str4 = sb.toString();
        }
        this.f64625b = str4;
    }
}
