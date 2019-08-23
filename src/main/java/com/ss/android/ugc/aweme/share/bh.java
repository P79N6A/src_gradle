package com.ss.android.ugc.aweme.share;

import a.g;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.q;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.d.e;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.u.ae;
import com.ss.android.ugc.aweme.utils.permission.a;
import com.ss.android.ugc.aweme.utils.permission.f;
import com.ss.android.ugc.aweme.utils.t;
import java.io.File;
import java.util.HashMap;
import java.util.concurrent.Callable;

public final class bh extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64779a;

    /* renamed from: b  reason: collision with root package name */
    final Activity f64780b;

    /* renamed from: c  reason: collision with root package name */
    boolean f64781c;
    private final User n;
    private int o = -1;
    private String p;
    private e q;
    private AnimatedImageView r;
    private TextView s;
    private TextView t;
    private bn u;

    interface a {
        void a(File file);
    }

    public final String f() {
        return this.p;
    }

    public final int g() {
        return this.o;
    }

    public final void a(com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f64779a, false, 73151, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f64779a, false, 73151, new Class[]{com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (this.j && !this.f64781c && isShowing()) {
            this.f64781c = true;
            a(aVar, (a) new bi(this, aVar));
        }
    }

    public final void a(View view, final com.douyin.baseshare.a aVar) {
        if (PatchProxy.isSupport(new Object[]{view, aVar}, this, f64779a, false, 73155, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, aVar}, this, f64779a, false, 73155, new Class[]{View.class, com.douyin.baseshare.a.class}, Void.TYPE);
        } else if (c()) {
            if (!this.f64781c && isShowing()) {
                this.f64781c = true;
                a(aVar, (a) new bm(this, aVar));
            }
        } else if (aVar.a()) {
            if (TextUtils.equals("rocket", aVar.d())) {
                aVar.a(a((File) null));
            } else if (f.c(this.f64780b) != 0) {
                com.ss.android.ugc.aweme.utils.permission.a.a(this.f64780b, "android.permission.WRITE_EXTERNAL_STORAGE", new a.C0792a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64786a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f64786a, false, 73162, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f64786a, false, 73162, new Class[0], Void.TYPE);
                            return;
                        }
                        bh.this.a(aVar);
                    }
                });
            } else {
                a(aVar);
            }
        } else if (q.a(aVar.d())) {
            ca.a(this.f64780b, a((File) null), null);
        } else {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), aVar.c(), 0).a();
        }
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f64779a, false, 73146, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f64779a, false, 73146, new Class[0], Integer.TYPE)).intValue();
        } else if (AbTestManager.a().bh()) {
            return C0906R.layout.k4;
        } else {
            return C0906R.layout.k3;
        }
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f64779a, false, 73147, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f64779a, false, 73147, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.isEmpty(this.p)) {
            z = true;
        }
        return z;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f64779a, false, 73148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64779a, false, 73148, new Class[0], Void.TYPE);
            return;
        }
        this.q = new e(new b(), this);
        this.r = (AnimatedImageView) findViewById(C0906R.id.asf);
        this.s = (TextView) findViewById(C0906R.id.d9b);
        this.t = (TextView) findViewById(C0906R.id.diw);
        this.f3880e = (ImageView) findViewById(C0906R.id.ate);
        this.u = new bn(this.f64780b);
    }

    @SuppressLint({"SetTextI18n"})
    public final void e() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f64779a, false, 73154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64779a, false, 73154, new Class[0], Void.TYPE);
            return;
        }
        this.s.setText("@" + this.n.getNickname());
        TextView textView = this.t;
        String string = this.f64780b.getString(C0906R.string.bmy);
        Object[] objArr = new Object[1];
        String str2 = null;
        if (PatchProxy.isSupport(new Object[0], this, f64779a, false, 73149, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], this, f64779a, false, 73149, new Class[0], String.class);
        } else {
            if (this.n == null) {
                str = null;
            } else if (TextUtils.isEmpty(this.n.getUniqueId())) {
                str = this.n.getShortId();
            } else {
                str = this.n.getUniqueId();
            }
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
        }
        objArr[0] = str;
        textView.setText(String.format(string, objArr));
        if (!AbTestManager.a().bh()) {
            this.r.setImageLoadFinishListener(new bl(this));
            c.b(this.r, t.b(this.n));
        }
        bn bnVar = this.u;
        User user = this.n;
        if (PatchProxy.isSupport(new Object[]{user}, bnVar, bn.f64803a, false, 73164, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user}, bnVar, bn.f64803a, false, 73164, new Class[]{User.class}, Void.TYPE);
            return;
        }
        bnVar.h = user;
        bnVar.f64808f.setText("@" + user.getNickname());
        TextView textView2 = bnVar.f64807e;
        String string2 = bnVar.f64804b.getString(C0906R.string.bmy);
        Object[] objArr2 = new Object[1];
        if (PatchProxy.isSupport(new Object[0], bnVar, bn.f64803a, false, 73166, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], bnVar, bn.f64803a, false, 73166, new Class[0], String.class);
        } else {
            if (bnVar.h != null) {
                if (TextUtils.isEmpty(bnVar.h.getUniqueId())) {
                    str2 = bnVar.h.getShortId();
                } else {
                    str2 = bnVar.h.getUniqueId();
                }
            }
            if (StringUtils.isEmpty(str2)) {
                str2 = "";
            }
        }
        objArr2[0] = str2;
        textView2.setText(String.format(string2, objArr2));
        if (TextUtils.isEmpty(bnVar.h.getSignature())) {
            bnVar.f64806d.setText(bnVar.f64806d.getContext().getText(C0906R.string.c8t));
        } else {
            bnVar.f64806d.setText(bnVar.h.getSignature());
        }
        bnVar.g.setImageLoadFinishListener(new bo(bnVar));
        bnVar.g.setDrawingCacheEnabled(true);
        bnVar.f64805c.setDrawingCacheEnabled(true);
        bnVar.g.a(t.b(user));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f64779a, false, 73144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64779a, false, 73144, new Class[0], Void.TYPE);
        } else if (AbTestManager.a().bh()) {
            this.q.b(4, this.n.getUid());
        } else {
            this.q.a(4, this.n.getUid());
        }
    }

    public final IShareService.ShareStruct a(File file) {
        String str;
        if (PatchProxy.isSupport(new Object[]{file}, this, f64779a, false, 73150, new Class[]{File.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{file}, this, f64779a, false, 73150, new Class[]{File.class}, IShareService.ShareStruct.class);
        }
        Activity activity = this.f64780b;
        User user = this.n;
        String path = file.getPath();
        if (PatchProxy.isSupport(new Object[]{activity, user, path}, null, i.f46055a, true, 42115, new Class[]{Context.class, User.class, String.class}, IShareService.ShareStruct.class)) {
            return (IShareService.ShareStruct) PatchProxy.accessDispatch(new Object[]{activity, user, path}, null, i.f46055a, true, 42115, new Class[]{Context.class, User.class, String.class}, IShareService.ShareStruct.class);
        }
        IShareService.ShareStruct shareStruct = new IShareService.ShareStruct();
        shareStruct.identifier = user.getUid();
        if (activity != null) {
            shareStruct.appName = activity.getString(C0906R.string.ak);
        } else {
            shareStruct.appName = "抖音短视频";
        }
        shareStruct.title = "";
        shareStruct.description = "";
        shareStruct.setThumbPath(path);
        String shareUrl = user.getShareInfo().getShareUrl();
        if (shareUrl != null && !shareUrl.startsWith("http://") && !shareUrl.startsWith("https://")) {
            shareUrl = "https://" + shareUrl;
        }
        if (TextUtils.isEmpty(shareStruct.getThumbPath())) {
            str = "";
        } else {
            str = shareStruct.getThumbPath();
        }
        shareStruct.thumbUrl = str;
        shareStruct.url = shareUrl;
        shareStruct.uid4Share = null;
        shareStruct.shareText = null;
        shareStruct.groupId = 0;
        shareStruct.itemId = 0;
        shareStruct.adId = 0;
        shareStruct.itemType = AllStoryActivity.f73306b;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("desc", user.getSignature());
        shareStruct.extraParams = hashMap;
        return shareStruct;
    }

    public final void a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, this, f64779a, false, 73145, new Class[]{Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmap2}, this, f64779a, false, 73145, new Class[]{Bitmap.class}, Void.TYPE);
            return;
        }
        super.a(bitmap);
        bn bnVar = this.u;
        if (PatchProxy.isSupport(new Object[]{bitmap2}, bnVar, bn.f64803a, false, 73168, new Class[]{Bitmap.class}, Void.TYPE)) {
            bn bnVar2 = bnVar;
            PatchProxy.accessDispatch(new Object[]{bitmap2}, bnVar2, bn.f64803a, false, 73168, new Class[]{Bitmap.class}, Void.TYPE);
        } else {
            if (bnVar.f64805c != null) {
                bnVar.f64805c.setImageBitmap(bitmap2);
            }
            bnVar.j = System.currentTimeMillis();
        }
        i();
    }

    public bh(Activity activity, User user) {
        super(activity);
        this.n = user;
        this.f64780b = activity;
    }

    private void a(com.douyin.baseshare.a aVar, a aVar2) {
        if (PatchProxy.isSupport(new Object[]{aVar, aVar2}, this, f64779a, false, 73152, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, aVar2}, this, f64779a, false, 73152, new Class[]{com.douyin.baseshare.a.class, a.class}, Void.TYPE);
            return;
        }
        Bitmap a2 = this.u.a();
        if (a2 == null) {
            this.f64781c = false;
            com.bytedance.ies.dmt.ui.d.a.c((Context) k.a(), (int) C0906R.string.bus, 1).a();
            ExceptionMonitor.ensureNotReachHere("build bitmap is null");
            aVar2.a(null);
            return;
        }
        a.i.a((Callable<TResult>) new bj<TResult>(this, aVar, a2)).a((g<TResult, TContinuationResult>) new bk<TResult,TContinuationResult>(aVar2), a.i.f1052b);
    }

    /* access modifiers changed from: package-private */
    public File a(com.douyin.baseshare.a aVar, Bitmap bitmap) {
        if (PatchProxy.isSupport(new Object[]{aVar, bitmap}, this, f64779a, false, 73153, new Class[]{com.douyin.baseshare.a.class, Bitmap.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{aVar, bitmap}, this, f64779a, false, 73153, new Class[]{com.douyin.baseshare.a.class, Bitmap.class}, File.class);
        }
        String d2 = aVar.d();
        if ("save_local".equals(aVar.d())) {
            d2 = "normal";
        }
        new ae().a("video").b(d2).c("general").e();
        return a(bitmap, "share_card_profile_" + this.n.getUid());
    }

    public bh(@NonNull Activity activity, User user, int i, String str) {
        super(activity);
        this.f64780b = activity;
        this.n = user;
        this.o = 7;
        this.p = str;
    }
}
