package com.ss.android.ugc.aweme.favorites.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.favorites.c.a;
import com.ss.android.ugc.aweme.favorites.c.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public class UnFavouritesDialog extends BottomSheetDialog implements View.OnClickListener, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44340a;

    /* renamed from: b  reason: collision with root package name */
    private String f44341b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f44342c;

    /* renamed from: d  reason: collision with root package name */
    private Context f44343d;

    /* renamed from: e  reason: collision with root package name */
    private a f44344e;

    public final void a(BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f44340a, false, 39649, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f44340a, false, 39649, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        this.f44342c.setCollectStatus(0);
        com.ss.android.ugc.aweme.feed.a.a().d(this.f44342c.getAid(), 0);
        com.bytedance.ies.dmt.ui.d.a.c(GlobalContext.getContext(), (int) C0906R.string.pq).a();
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f44340a, false, 39650, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f44340a, false, 39650, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        com.bytedance.ies.dmt.ui.d.a.c(GlobalContext.getContext(), (int) C0906R.string.pp).a();
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f44340a, false, 39651, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f44340a, false, 39651, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.do0) {
            if (PatchProxy.isSupport(new Object[0], this, f44340a, false, 39652, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44340a, false, 39652, new Class[0], Void.TYPE);
            } else if (this.f44344e != null) {
                this.f44344e.a(2, this.f44342c.getAid(), 0);
                r.a("cancel_favourite_video", (Map) d.a().a("enter_from", this.f44341b).a("group_id", this.f44342c.getAid()).f34114b);
            }
            dismiss();
            return;
        }
        if (id == C0906R.id.dnz) {
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f44340a, false, 39643, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f44340a, false, 39643, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.kl);
        if (PatchProxy.isSupport(new Object[0], this, f44340a, false, 39644, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44340a, false, 39644, new Class[0], Void.TYPE);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f44340a, false, 39647, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44340a, false, 39647, new Class[0], Void.TYPE);
            } else {
                int screenHeight = UIUtils.getScreenHeight(this.f44343d) - UIUtils.getStatusBarHeight(this.f44343d);
                Window window = getWindow();
                if (window != null) {
                    if (screenHeight == 0) {
                        screenHeight = -1;
                    }
                    window.setLayout(-1, screenHeight);
                    window.setGravity(80);
                    WindowManager.LayoutParams attributes = getWindow().getAttributes();
                    attributes.gravity = 80;
                    getWindow().setAttributes(attributes);
                    setCanceledOnTouchOutside(true);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f44340a, false, 39646, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44340a, false, 39646, new Class[0], Void.TYPE);
            } else {
                View findViewById = findViewById(C0906R.id.do0);
                if (findViewById != null) {
                    findViewById.setOnClickListener(this);
                }
            }
            if (PatchProxy.isSupport(new Object[0], this, f44340a, false, 39645, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f44340a, false, 39645, new Class[0], Void.TYPE);
            } else {
                TextView textView = (TextView) findViewById(C0906R.id.dnz);
                if (textView != null) {
                    textView.setOnClickListener(this);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f44340a, false, 39648, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44340a, false, 39648, new Class[0], Void.TYPE);
            return;
        }
        this.f44344e = new a();
        this.f44344e.a(this);
    }

    public UnFavouritesDialog(@NonNull Context context, Aweme aweme, String str) {
        super(context, C0906R.style.re);
        this.f44342c = aweme;
        this.f44343d = context;
        this.f44341b = str;
    }
}
