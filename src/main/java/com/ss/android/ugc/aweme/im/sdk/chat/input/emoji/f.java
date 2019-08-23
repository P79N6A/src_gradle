package com.ss.android.ugc.aweme.im.sdk.chat.input.emoji;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.a.d;
import com.ss.android.ugc.aweme.im.sdk.chat.input.IInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.view.b;
import com.ss.android.ugc.aweme.im.sdk.resources.model.a;
import com.ss.android.ugc.aweme.im.sdk.utils.az;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50567a;

    /* renamed from: b  reason: collision with root package name */
    public IInputView f50568b;

    /* renamed from: c  reason: collision with root package name */
    public IInputView f50569c;

    /* renamed from: d  reason: collision with root package name */
    public b f50570d;

    /* renamed from: e  reason: collision with root package name */
    public String f50571e;

    /* renamed from: f  reason: collision with root package name */
    private ViewGroup f50572f;
    private LinearLayout g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private View o;
    private Activity p;
    private Handler q = new Handler(Looper.getMainLooper());

    public final void a(List<a> list) {
        int i2;
        int i3;
        if (PatchProxy.isSupport(new Object[]{list}, this, f50567a, false, 50850, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f50567a, false, 50850, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.q.removeCallbacksAndMessages(null);
        if (CollectionUtils.isEmpty(list)) {
            if (this.f50570d != null && this.f50570d.isShowing()) {
                this.f50570d.dismiss();
            }
            return;
        }
        z.a().d(this.f50571e);
        if (list.size() == 1) {
            i3 = this.i;
            i2 = (UIUtils.getScreenWidth(this.f50572f.getContext()) - this.i) - this.l;
        } else if (list.size() == 2) {
            i3 = this.j;
            i2 = (UIUtils.getScreenWidth(this.f50572f.getContext()) - this.j) - this.l;
        } else {
            i3 = this.h;
            i2 = (UIUtils.getScreenWidth(this.f50572f.getContext()) - this.h) - this.l;
        }
        this.g.removeAllViews();
        for (a a2 : list) {
            this.g.addView(a(this.g.getContext(), a2));
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.height = this.n;
        layoutParams.width = i3;
        this.f50572f.setLayoutParams(layoutParams);
        if (this.f50570d == null || !this.f50570d.isShowing()) {
            this.f50570d = new b();
        } else {
            this.f50570d.dismiss();
        }
        this.f50570d.a(this.f50572f, this.p, layoutParams.width, layoutParams.height);
        this.f50570d.f51039b = 0;
        this.f50570d.a(this.o, i2, -this.m);
        this.f50570d.update(layoutParams.width, layoutParams.height);
        this.q.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50573a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f50573a, false, 50852, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f50573a, false, 50852, new Class[0], Void.TYPE);
                    return;
                }
                if (f.this.f50570d != null && f.this.f50570d.isShowing()) {
                    f.this.f50570d.dismiss();
                }
            }
        }, 5000);
    }

    private View a(Context context, final a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, aVar}, this, f50567a, false, 50851, new Class[]{Context.class, a.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context, aVar}, this, f50567a, false, 50851, new Class[]{Context.class, a.class}, View.class);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.k, this.k);
        marginLayoutParams.rightMargin = this.l;
        remoteImageView.setLayoutParams(marginLayoutParams);
        UrlModel urlModel = new UrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add("file://" + com.ss.android.ugc.aweme.im.sdk.resources.a.b(aVar));
        urlModel.setUrlList(arrayList);
        urlModel.setUri("file://" + com.ss.android.ugc.aweme.im.sdk.resources.a.b(aVar));
        az.b(remoteImageView, urlModel);
        remoteImageView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f50575a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f50575a, false, 50853, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f50575a, false, 50853, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                c cVar = new c();
                cVar.f50558b = aVar.getRealDisplayName();
                cVar.f50557a = aVar;
                f.this.f50569c.a(cVar);
                f.this.f50568b.c();
                z a2 = z.a();
                String str = f.this.f50571e;
                String valueOf = String.valueOf(aVar.getId());
                if (PatchProxy.isSupport(new Object[]{str, valueOf}, a2, z.f52670a, false, 53602, new Class[]{String.class, String.class}, Void.TYPE)) {
                    z zVar = a2;
                    PatchProxy.accessDispatch(new Object[]{str, valueOf}, zVar, z.f52670a, false, 53602, new Class[]{String.class, String.class}, Void.TYPE);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("to_user_id", str);
                hashMap.put("emoji_id", valueOf);
                r.a("auto_emoji_click", (Map) hashMap);
            }
        });
        return remoteImageView;
    }

    public f(IInputView iInputView, View view, String str) {
        this.f50568b = iInputView;
        this.o = view;
        this.f50571e = str;
        this.p = (Activity) view.getContext();
        this.f50569c = new d(iInputView, this.p);
        this.f50572f = (ViewGroup) LayoutInflater.from(this.p).inflate(C0906R.layout.a3p, null);
        this.g = (LinearLayout) this.f50572f.findViewById(C0906R.id.a9g);
        this.i = (int) UIUtils.dip2Px(this.f50572f.getContext(), 96.0f);
        this.j = (int) UIUtils.dip2Px(this.f50572f.getContext(), 181.0f);
        this.h = (int) UIUtils.dip2Px(this.f50572f.getContext(), 218.0f);
        this.k = (int) UIUtils.dip2Px(this.f50572f.getContext(), 80.0f);
        this.l = (int) UIUtils.dip2Px(this.f50572f.getContext(), 5.0f);
        this.m = (int) UIUtils.dip2Px(this.f50572f.getContext(), 5.0f);
        this.n = (int) UIUtils.dip2Px(this.f50572f.getContext(), 102.6f);
    }
}
