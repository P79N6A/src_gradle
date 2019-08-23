package com.ss.android.ugc.aweme.miniapp.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.douyin.baseshare.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.im.h;
import com.ss.android.ugc.aweme.share.ShareOrderService;
import com.ss.android.ugc.aweme.share.cg;
import com.ss.android.ugc.aweme.share.seconditem.j;
import com.tt.option.share.OnShareDialogEventListener;

public class MicroAppShareDialog extends IShareService.SharePage implements b.C0026b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55690a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f55691b;

    /* renamed from: c  reason: collision with root package name */
    public OnShareDialogEventListener f55692c;

    /* renamed from: d  reason: collision with root package name */
    public HorizontalScrollView f55693d;

    /* renamed from: e  reason: collision with root package name */
    public b.a f55694e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f55695f = new LinearLayout(this.f55691b);
    private View g;
    private View h;
    private View i;
    private View j;
    private DmtTextView k;
    private DmtTextView l;
    private RemoteImageView m;
    private DmtEditText n;
    private FrameLayout o;

    public void addBottomShareItem(View view) {
    }

    public void addBottomShareItem(View view, int i2) {
    }

    public void setPanelTitle(String str) {
    }

    public View getTopShareIMView() {
        return this.g;
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f55690a, false, 59226, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55690a, false, 59226, new Class[0], Void.TYPE);
            return;
        }
        setOnShowListener(new DialogInterface.OnShowListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55711a;

            public final void onShow(DialogInterface dialogInterface) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f55711a, false, 59236, new Class[]{DialogInterface.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f55711a, false, 59236, new Class[]{DialogInterface.class}, Void.TYPE);
                    return;
                }
                FrameLayout frameLayout = (FrameLayout) ((BottomSheetDialog) dialogInterface).findViewById(C0906R.id.a3z);
                if (frameLayout != null) {
                    BottomSheetBehavior from = BottomSheetBehavior.from(frameLayout);
                    from.setPeekHeight(frameLayout.getHeight());
                    from.setSkipCollapsed(true);
                }
            }
        });
        super.show();
    }

    public final h a() {
        if (PatchProxy.isSupport(new Object[0], this, f55690a, false, 59227, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], this, f55690a, false, 59227, new Class[0], h.class);
        }
        h hVar = new h();
        hVar.f50072a = this.k;
        hVar.k = this.n;
        hVar.f50076e = this.h;
        hVar.j = this.m;
        hVar.f50075d = this.i;
        hVar.f50077f = this.g;
        hVar.f50073b = this.l;
        hVar.l = this;
        hVar.m = true;
        return hVar;
    }

    public void addShareViewInTop(View view) {
        this.g = view;
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f55690a, false, 59220, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f55690a, false, 59220, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.aac);
        this.k = (DmtTextView) findViewById(C0906R.id.q2);
        this.l = (DmtTextView) findViewById(C0906R.id.cnn);
        this.h = findViewById(C0906R.id.cpg);
        this.j = findViewById(C0906R.id.b9d);
        this.m = (RemoteImageView) this.j.findViewById(C0906R.id.bo0);
        this.i = this.j;
        this.n = (DmtEditText) this.j.findViewById(C0906R.id.bo1);
        this.f55693d = (HorizontalScrollView) findViewById(C0906R.id.cpf);
        this.f55693d.addView(this.f55695f);
        this.o = (FrameLayout) findViewById(C0906R.id.d5g);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        if (this.g != null) {
            this.o.addView(this.g);
        }
        findViewById(C0906R.id.q2).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55696a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f55696a, false, 59228, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f55696a, false, 59228, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                MicroAppShareDialog.this.dismiss();
            }
        });
        IShareService iShareService = (IShareService) ServiceManager.get().getService(IShareService.class);
        ShareOrderService shareOrderService = (ShareOrderService) ServiceManager.get().getService(ShareOrderService.class);
        String[] videoShareList = shareOrderService.getVideoShareList();
        a[] aVarArr = new a[shareOrderService.getVideoShareList().length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            aVarArr[i2] = iShareService.getShareChannel(this.f55691b, videoShareList[i2]);
        }
        for (int i3 = 0; i3 < aVarArr.length; i3++) {
            final a aVar = aVarArr[i3];
            if (aVar != null) {
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f55690a, false, 59223, new Class[]{a.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f55690a, false, 59223, new Class[]{a.class}, Boolean.TYPE)).booleanValue();
                } else {
                    String d2 = aVar.d();
                    if (TextUtils.equals(d2, "qq") || TextUtils.equals(d2, "qzone") || TextUtils.equals(d2, "weixin") || TextUtils.equals(d2, "weixin_moments") || TextUtils.equals(d2, "chat_merge")) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    j a2 = cg.a(this.f55691b, aVar, 5, (View.OnClickListener) new View.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f55698a;

                        public final void onClick(View view) {
                            if (PatchProxy.isSupport(new Object[]{view}, this, f55698a, false, 59229, new Class[]{View.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{view}, this, f55698a, false, 59229, new Class[]{View.class}, Void.TYPE);
                                return;
                            }
                            ClickInstrumentation.onClick(view);
                            if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
                                if (!aVar.a() || MicroAppShareDialog.this.f55692c == null) {
                                    com.bytedance.ies.dmt.ui.d.a.c(MicroAppShareDialog.this.getContext(), aVar.c(), 0).a();
                                    return;
                                }
                                MicroAppShareDialog.this.f55692c.onItemClick(aVar.d(), true);
                                MicroAppShareDialog.this.dismiss();
                            }
                        }
                    });
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f55690a, false, 59222, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f55690a, false, 59222, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else if (i3 == 0) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        int dip2Px = (int) UIUtils.dip2Px(getContext(), 30.0f);
                        layoutParams.leftMargin = dip2Px;
                        if (Build.VERSION.SDK_INT >= 17) {
                            layoutParams.setMarginStart(dip2Px);
                        }
                    }
                    this.f55695f.addView(a2);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f55690a, false, 59221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f55690a, false, 59221, new Class[0], Void.TYPE);
            return;
        }
        setOnKeyListener(new DialogInterface.OnKeyListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55701a;

            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f55701a, false, 59230, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f55701a, false, 59230, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (i != 4 || MicroAppShareDialog.this.f55694e == null) {
                    return false;
                } else {
                    return MicroAppShareDialog.this.f55694e.b();
                }
            }
        });
    }

    public MicroAppShareDialog(@NonNull Activity activity, OnShareDialogEventListener onShareDialogEventListener) {
        super(activity, C0906R.style.qz);
        this.f55691b = activity;
        this.f55692c = onShareDialogEventListener;
    }
}
