package com.ss.android.ugc.aweme.share;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public abstract class AbstractDownloadedVideoShareDialog extends IShareService.SharePage {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64473a;

    /* renamed from: b  reason: collision with root package name */
    protected IShareService.ShareBar f64474b;

    /* renamed from: c  reason: collision with root package name */
    protected String f64475c;

    /* renamed from: d  reason: collision with root package name */
    protected String f64476d;

    /* renamed from: e  reason: collision with root package name */
    private View f64477e;

    /* renamed from: f  reason: collision with root package name */
    private HorizontalScrollView f64478f;
    private DmtTextView g;
    private DmtTextView h;

    static class a extends IShareService.ShareBar {
        a(@NonNull Context context) {
            super(context);
        }
    }

    public abstract IShareService.IActionHandler a();

    public void onCreate(Bundle bundle) {
        int i;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64473a, false, 72901, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64473a, false, 72901, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.l7);
        if (PatchProxy.isSupport(new Object[0], this, f64473a, false, 72902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64473a, false, 72902, new Class[0], Void.TYPE);
        } else {
            this.f64477e = findViewById(C0906R.id.chu);
            this.g = (DmtTextView) findViewById(C0906R.id.cq4);
            if (this.f64475c != null) {
                this.g.setText(this.f64475c);
            }
            this.f64478f = (HorizontalScrollView) findViewById(C0906R.id.cpf);
            this.h = (DmtTextView) findViewById(C0906R.id.q2);
            if (this.f64476d != null) {
                this.h.setText(this.f64476d);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f64473a, false, 72903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64473a, false, 72903, new Class[0], Void.TYPE);
        } else {
            this.h.setOnClickListener(new b(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f64473a, false, 72905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64473a, false, 72905, new Class[0], Void.TYPE);
        } else {
            int screenHeight = UIUtils.getScreenHeight(getOwnerActivity()) - UIUtils.getStatusBarHeight(getContext());
            Window window = getWindow();
            if (window != null) {
                if (screenHeight == 0) {
                    i = -1;
                } else {
                    i = screenHeight;
                }
                if (PatchProxy.isSupport(new Object[]{window, -1, Integer.valueOf(i)}, this, f64473a, false, 72909, new Class[]{Window.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{window, -1, Integer.valueOf(i)}, this, f64473a, false, 72909, new Class[]{Window.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    window.setLayout(-1, i);
                }
                View view = this.f64477e;
                if (PatchProxy.isSupport(new Object[]{view}, this, f64473a, false, 72910, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64473a, false, 72910, new Class[]{View.class}, Void.TYPE);
                } else {
                    final BottomSheetBehavior from = BottomSheetBehavior.from((View) view.getParent());
                    if (from != null) {
                        from.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f64479a;

                            public final void onSlide(@NonNull View view, float f2) {
                            }

                            public final void onStateChanged(@NonNull View view, int i) {
                                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f64479a, false, 72915, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f64479a, false, 72915, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
                                    return;
                                }
                                if (i == 5) {
                                    AbstractDownloadedVideoShareDialog.this.cancel();
                                    from.setState(4);
                                }
                            }
                        });
                    }
                }
                window.setGravity(80);
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.gravity = 80;
                getWindow().setAttributes(attributes);
                window.findViewById(C0906R.id.a3z).setBackgroundDrawable(new ColorDrawable(0));
                setCanceledOnTouchOutside(true);
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f64473a, false, 72911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64473a, false, 72911, new Class[0], Void.TYPE);
        } else {
            this.f64474b = new a(getContext());
            IShareService.ShareBar shareBar = this.f64474b;
            if (PatchProxy.isSupport(new Object[]{shareBar}, this, f64473a, false, 72906, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{shareBar}, this, f64473a, false, 72906, new Class[]{View.class}, Void.TYPE);
            } else {
                this.f64478f.removeAllViews();
                this.f64478f.addView(shareBar);
            }
        }
        setActionHandler(a());
    }
}
