package com.ss.android.ugc.aweme.hotsearch.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hotsearch.a.e;
import com.ss.android.ugc.aweme.qrcode.c.b;
import com.ss.android.ugc.aweme.qrcode.d.a;
import com.ss.android.ugc.aweme.share.BaseShareDialog;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.ck;
import com.ss.android.ugc.aweme.share.seconditem.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;

public class HotSearchRankingShareDialog extends BaseShareDialog implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49787a;
    private e A;

    /* renamed from: b  reason: collision with root package name */
    Activity f49788b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.qrcode.c.a f49789c;
    private final CountDownLatch u;
    private ViewGroup v;
    private ShareInfo w;
    private SparseIntArray x;
    private int y;
    private boolean z;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b() throws Exception {
        try {
            if (this.u != null) {
                this.u.await();
            }
        } catch (InterruptedException unused) {
        }
        return null;
    }

    public final void a(com.ss.android.ugc.aweme.qrcode.c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f49787a, false, 49763, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f49787a, false, 49763, new Class[]{com.ss.android.ugc.aweme.qrcode.c.a.class}, Void.TYPE);
            return;
        }
        this.f49789c = aVar;
        if (this.u != null) {
            this.u.countDown();
        }
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f49787a, false, 49764, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f49787a, false, 49764, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        this.f49789c = null;
        if (this.u != null) {
            this.u.countDown();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(com.douyin.baseshare.a aVar) throws Exception {
        if (this.f49789c == null) {
            com.bytedance.ies.dmt.ui.d.a.b(getContext(), (int) C0906R.string.dml).a();
            cancel();
            return null;
        }
        String d2 = aVar.d();
        char c2 = 65535;
        int hashCode = d2.hashCode();
        if (hashCode != -929929834) {
            if (hashCode != -791575966) {
                if (hashCode != 3616) {
                    if (hashCode != 108102557) {
                        if (hashCode == 113011944 && d2.equals("weibo")) {
                            c2 = 2;
                        }
                    } else if (d2.equals("qzone")) {
                        c2 = 4;
                    }
                } else if (d2.equals("qq")) {
                    c2 = 3;
                }
            } else if (d2.equals("weixin")) {
                c2 = 0;
            }
        } else if (d2.equals("weixin_moments")) {
            c2 = 1;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                g gVar = new g(this.f49788b, this.A.d(), this.w, this.f49789c, this.A.e(), aVar.d(), this.y);
                gVar.show();
                break;
        }
        if (this.mActionHandler != null) {
            if (this.r != null && TextUtils.equals(aVar.d(), "chat_merge")) {
                this.r.a(this.mShareStruct);
            }
            this.mActionHandler.onAction(this.mShareStruct, aVar.d());
        }
        cancel();
        return null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        j jVar;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f49787a, false, 49761, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f49787a, false, 49761, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.findViewById(C0906R.id.a3z).setBackgroundDrawable(new ColorDrawable(0));
        }
        a((View) this.v);
        com.ss.android.ugc.aweme.qrcode.d.e eVar = new com.ss.android.ugc.aweme.qrcode.d.e(new b(), this);
        String valueOf = String.valueOf(this.y);
        if (TextUtils.isEmpty(this.A.f())) {
            str = null;
        } else {
            str = this.A.f();
        }
        eVar.a(10, valueOf, str);
        IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, ((ShareOrderService) ServiceManager.get().getService(ShareOrderService.class)).getImageShareList());
        if (!this.z) {
            arrayList.remove("chat_merge");
        }
        com.douyin.baseshare.a[] aVarArr = new com.douyin.baseshare.a[arrayList.size()];
        for (int i = 0; i < aVarArr.length; i++) {
            aVarArr[i] = iShareService.getShareChannel(this.f49788b, (String) arrayList.get(i));
        }
        for (com.douyin.baseshare.a aVar : cg.a(aVarArr)) {
            this.v.addView(cg.a(this.f49788b, aVar, (View.OnClickListener) new c(this, aVar)));
        }
        Activity activity = this.f49788b;
        if (PatchProxy.isSupport(new Object[]{activity, this}, this, f49787a, false, 49762, new Class[]{Context.class, IShareService.SharePage.class}, j.class)) {
            jVar = (j) PatchProxy.accessDispatch(new Object[]{activity, this}, this, f49787a, false, 49762, new Class[]{Context.class, IShareService.SharePage.class}, j.class);
        } else {
            jVar = j.a((Context) activity, (int) C0906R.string.c6j, 2130839601, (View.OnClickListener) new d(this));
        }
        addBottomShareItem(jVar);
    }

    public void setShareItemVisible(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f49787a, false, 49760, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f49787a, false, 49760, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View findViewWithTag = this.v.findViewWithTag(str);
        if (findViewWithTag != null) {
            int i2 = this.x.get(findViewWithTag.getId());
            if (i2 > 0) {
                View findViewById = this.v.findViewById(i2);
                if (findViewById != null) {
                    findViewById.setVisibility(i);
                }
            }
        }
    }

    public HotSearchRankingShareDialog(Activity activity, ShareInfo shareInfo, int i, CountDownLatch countDownLatch, e eVar) {
        super(activity, (byte) 0);
        this.f49788b = activity;
        this.x = new SparseIntArray(10);
        this.v = new LinearLayout(this.f49788b);
        this.w = shareInfo;
        this.u = countDownLatch;
        this.A = eVar;
        this.y = i;
    }

    public HotSearchRankingShareDialog(Activity activity, ShareInfo shareInfo, ck ckVar, int i, boolean z2, CountDownLatch countDownLatch, e eVar) {
        this(activity, shareInfo, i, countDownLatch, eVar);
        this.z = true;
    }
}
