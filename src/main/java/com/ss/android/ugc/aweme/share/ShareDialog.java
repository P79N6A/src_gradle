package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.common.utility.StringUtils;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.f;
import com.ss.android.ugc.aweme.feed.h.n;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedSelfseeNoticeModel;
import com.ss.android.ugc.aweme.feed.p;
import com.ss.android.ugc.aweme.feed.t;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.seconditem.j;
import com.ss.android.ugc.aweme.utils.u;
import java.util.Map;

public class ShareDialog extends BaseShareDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64541a;

    /* renamed from: b  reason: collision with root package name */
    Activity f64542b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f64543c = new LinearLayout(this.f64542b);
    public String u;
    public Aweme v;
    public String w;
    private SparseIntArray x = new SparseIntArray(10);

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64541a, false, 73293, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64541a, false, 73293, new Class[0], Void.TYPE);
        } else if (!u.f75965b.d(this.v) || u.f75965b.b(this.v)) {
            this.t = true;
        } else {
            this.t = false;
        }
    }

    public void setActionHandler(IShareService.IActionHandler iActionHandler) {
        this.mActionHandler = iActionHandler;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        j jVar;
        int i;
        j jVar2;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4 = 1;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64541a, false, 73296, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64541a, false, 73296, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (this.t) {
            a((View) this.f64543c);
            IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
            ShareOrderService shareOrderService = (ShareOrderService) ServiceManager.get().getService(ShareOrderService.class);
            String[] videoShareList = shareOrderService.getVideoShareList();
            a[] aVarArr = new a[shareOrderService.getVideoShareList().length];
            for (int i6 = 0; i6 < aVarArr.length; i6++) {
                aVarArr[i6] = iShareService.getShareChannel(this.f64542b, videoShareList[i6]);
            }
            a[] a2 = cg.a(aVarArr);
            int length = a2.length;
            int i7 = 0;
            while (i7 < length) {
                a aVar = a2[i7];
                if (PatchProxy.isSupport(new Object[i5], this, f64541a, false, 73300, new Class[i5], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[i5], this, f64541a, false, 73300, new Class[i5], Boolean.TYPE)).booleanValue();
                } else if (this.v == null || this.v.getAwemeType() != 13) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z || !TextUtils.equals(aVar.d(), "chat_merge")) {
                    final j a3 = d.a(cg.a(this.f64542b, aVar, i4, (View.OnClickListener) new cd(this, aVar)), this.v);
                    if (TextUtils.equals("toutiao", aVar.d())) {
                        this.f64487f.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64547a;

                            /* renamed from: b  reason: collision with root package name */
                            boolean f64548b;

                            public final void onScrollChanged() {
                                boolean z = false;
                                if (PatchProxy.isSupport(new Object[0], this, f64547a, false, 73305, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f64547a, false, 73305, new Class[0], Void.TYPE);
                                    return;
                                }
                                Rect rect = new Rect();
                                if (!this.f64548b && a3.getGlobalVisibleRect(rect)) {
                                    ShareDialog shareDialog = ShareDialog.this;
                                    View view = a3;
                                    if (PatchProxy.isSupport(new Object[]{view}, shareDialog, ShareDialog.f64541a, false, 73298, new Class[]{View.class}, Boolean.TYPE)) {
                                        ShareDialog shareDialog2 = shareDialog;
                                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, shareDialog2, ShareDialog.f64541a, false, 73298, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                                    } else if (view != null) {
                                        Rect rect2 = new Rect();
                                        view.getGlobalVisibleRect(rect2);
                                        if (rect2.width() * rect2.height() > (view.getMeasuredHeight() * view.getMeasuredWidth()) / 2) {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        r.a("toutiao_icon_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "share_board").f34114b);
                                        this.f64548b = true;
                                    }
                                }
                            }
                        });
                    }
                    if (TextUtils.equals("more", aVar.d()) && AbTestManager.a().aM()) {
                        Context context = getContext();
                        Aweme aweme = this.v;
                        IShareService.IActionHandler iActionHandler = this.mActionHandler;
                        IShareService.ShareStruct shareStruct = this.mShareStruct;
                        Object[] objArr = new Object[5];
                        objArr[i5] = context;
                        objArr[i4] = this;
                        objArr[2] = aweme;
                        objArr[3] = iActionHandler;
                        objArr[4] = shareStruct;
                        ChangeQuickRedirect changeQuickRedirect = d.f45158a;
                        Class[] clsArr = new Class[5];
                        clsArr[i5] = Context.class;
                        clsArr[i4] = IShareService.SharePage.class;
                        clsArr[2] = Aweme.class;
                        clsArr[3] = IShareService.IActionHandler.class;
                        clsArr[4] = IShareService.ShareStruct.class;
                        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, 39982, clsArr, j.class)) {
                            Object[] objArr2 = new Object[5];
                            objArr2[i5] = context;
                            objArr2[i4] = this;
                            objArr2[2] = aweme;
                            objArr2[3] = iActionHandler;
                            objArr2[4] = shareStruct;
                            ChangeQuickRedirect changeQuickRedirect2 = d.f45158a;
                            Class[] clsArr2 = new Class[5];
                            clsArr2[i5] = Context.class;
                            clsArr2[i4] = IShareService.SharePage.class;
                            clsArr2[2] = Aweme.class;
                            clsArr2[3] = IShareService.IActionHandler.class;
                            clsArr2[4] = IShareService.ShareStruct.class;
                            jVar = (j) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, 39982, clsArr2, j.class);
                            i = 4;
                        } else if (d.a(aweme)) {
                            i = 4;
                            jVar = null;
                        } else {
                            t tVar = r0;
                            i = 4;
                            t tVar2 = new t(aweme, context, this, iActionHandler, shareStruct);
                            jVar = d.a(j.a(context, (int) C0906R.string.c6j, 2130839602, (View.OnClickListener) tVar2), aweme);
                        }
                        Context context2 = getContext();
                        Aweme aweme2 = this.v;
                        String str = this.w;
                        Object[] objArr3 = new Object[i];
                        objArr3[0] = context2;
                        objArr3[1] = this;
                        objArr3[2] = aweme2;
                        objArr3[3] = str;
                        ChangeQuickRedirect changeQuickRedirect3 = d.f45158a;
                        Class[] clsArr3 = new Class[i];
                        clsArr3[0] = Context.class;
                        clsArr3[1] = IShareService.SharePage.class;
                        clsArr3[2] = Aweme.class;
                        clsArr3[3] = String.class;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, 39967, clsArr3, j.class)) {
                            Object[] objArr4 = new Object[i];
                            objArr4[0] = context2;
                            objArr4[1] = this;
                            objArr4[2] = aweme2;
                            objArr4[3] = str;
                            ChangeQuickRedirect changeQuickRedirect4 = d.f45158a;
                            Class[] clsArr4 = new Class[i];
                            clsArr4[0] = Context.class;
                            clsArr4[1] = IShareService.SharePage.class;
                            clsArr4[2] = Aweme.class;
                            clsArr4[3] = String.class;
                            jVar2 = (j) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, 39967, clsArr4, j.class);
                        } else {
                            if (aweme2 == null) {
                                n nVar = new n(context2);
                                nVar.a(new FeedSelfseeNoticeModel());
                                if (aweme2.getStatus() == null || aweme2.getStatus().getPrivateStatus() != 0) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (aweme2.getAuthor() == null || !StringUtils.equal(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), d.b(aweme2))) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (!d.a(aweme2) && z2) {
                                    if (z3 && AbTestManager.a().d().picQrCodeIconSwitch == 0) {
                                        if (AbTestManager.a().bh()) {
                                            i3 = C0906R.string.bua;
                                        } else {
                                            i3 = C0906R.string.bu_;
                                        }
                                        f fVar = r0;
                                        f fVar2 = new f(aweme2, context2, this, nVar, str);
                                        jVar2 = d.a(j.a(context2, i3, 2130839621, (View.OnClickListener) fVar), aweme2);
                                    } else if (AbTestManager.a().d().picQrCodeIconSwitch == 1) {
                                        if (AbTestManager.a().bh()) {
                                            i2 = C0906R.string.bua;
                                        } else {
                                            i2 = C0906R.string.bu_;
                                        }
                                        p pVar = r0;
                                        p pVar2 = new p(aweme2, context2, this, nVar, str);
                                        jVar2 = d.a(j.a(context2, i2, 2130839621, (View.OnClickListener) pVar), aweme2);
                                    }
                                }
                            }
                            jVar2 = null;
                        }
                        if (jVar != null) {
                            this.f64543c.addView(jVar);
                        }
                        if (jVar2 != null) {
                            this.f64543c.addView(jVar2);
                        }
                    }
                    this.f64543c.addView(a3);
                }
                i7++;
                i4 = 1;
                i5 = 0;
            }
            return;
        }
        this.n.setVisibility(8);
    }

    public ShareDialog(Activity activity, ck ckVar) {
        super(activity);
        this.f64542b = activity;
        this.v = ckVar.f64973b;
        this.w = ckVar.n;
        b();
    }

    public void setShareItemVisible(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, this, f64541a, false, 73295, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, this, f64541a, false, 73295, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View findViewWithTag = this.f64543c.findViewWithTag(str);
        if (findViewWithTag != null) {
            int i2 = this.x.get(findViewWithTag.getId());
            if (i2 > 0) {
                View findViewById = this.f64543c.findViewById(i2);
                if (findViewById != null) {
                    findViewById.setVisibility(i);
                }
            }
        }
    }

    public ShareDialog(Activity activity, ck ckVar, byte b2) {
        super(activity, (byte) 0);
        this.f64542b = activity;
        this.v = ckVar.f64973b;
        this.w = ckVar.n;
        b();
    }

    public final void a(@NonNull Window window, int i, int i2) {
        Window window2 = window;
        if (PatchProxy.isSupport(new Object[]{window2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f64541a, false, 73294, new Class[]{Window.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{window2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f64541a, false, 73294, new Class[]{Window.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        String str = Build.MANUFACTURER + "-" + Build.MODEL;
        if (TextUtils.equals("vivo-V1821A", str) || TextUtils.equals("vivo-V1821T", str)) {
            super.a(window2, i, -2);
        } else {
            super.a(window, i, i2);
        }
    }
}
