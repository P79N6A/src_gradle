package com.ss.android.ugc.aweme.feed.ui;

import android.arch.lifecycle.Observer;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.feed.e;
import com.ss.android.ugc.aweme.commercialize.utils.n;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.legoImp.inflate.q;
import com.ss.android.ugc.aweme.report.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class bf extends e implements Observer<a> {
    public static ChangeQuickRedirect l;
    public ViewGroup m;
    public boolean n;
    private e o;

    public final void b() {
    }

    public bf(View view) {
        super(view);
    }

    public final void a(DataCenter dataCenter) {
        if (PatchProxy.isSupport(new Object[]{dataCenter}, this, l, false, 43122, new Class[]{DataCenter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dataCenter}, this, l, false, 43122, new Class[]{DataCenter.class}, Void.TYPE);
            return;
        }
        dataCenter.a("on_page_selected", (Observer<a>) this).a("on_render_ready", (Observer<a>) this);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, l, false, 43118, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, l, false, 43118, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View a2 = ((q) com.ss.android.ugc.aweme.lego.a.i.b(q.class)).a(this.h, (int) C0906R.layout.addiction_hint);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a2);
        }
        this.m = (ViewGroup) view.findViewById(C0906R.id.dq);
    }

    public final /* synthetic */ void onChanged(@Nullable Object obj) {
        a aVar = (a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, l, false, 43124, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, l, false, 43124, new Class[]{a.class}, Void.TYPE);
            return;
        }
        if (aVar != null) {
            String str = aVar.f34376a;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -962685926) {
                if (hashCode == 350216171 && str.equals("on_page_selected")) {
                    c2 = 0;
                }
            } else if (str.equals("on_render_ready")) {
                c2 = 1;
            }
            switch (c2) {
                case 0:
                    if (PatchProxy.isSupport(new Object[0], this, l, false, 43121, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, l, false, 43121, new Class[0], Void.TYPE);
                        break;
                    } else {
                        b.a(this.m, -v.a(this.h, (int) C0906R.dimen.bh), 0, false);
                        return;
                    }
                case 1:
                    if (!PatchProxy.isSupport(new Object[0], this, l, false, 43123, new Class[0], Void.TYPE)) {
                        if (v.a((View) this.m) && !this.n) {
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f46587a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f46587a, false, 43125, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f46587a, false, 43125, new Class[0], Void.TYPE);
                                    } else if (bf.this.m != null) {
                                        n.a(bf.this.m, 0, 360, true);
                                        bf.this.n = true;
                                        if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.antiaddic.b.f33370a, true, 21683, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.antiaddic.b.f33370a, true, 21683, new Class[0], Void.TYPE);
                                        } else {
                                            r.onEvent(MobClick.obtain().setEventName("addict_alert").setLabelName("homepage_hot"));
                                        }
                                    }
                                }
                            }, 100);
                            handler.postDelayed(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f46589a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f46589a, false, 43126, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f46589a, false, 43126, new Class[0], Void.TYPE);
                                    } else if (bf.this.m != null) {
                                        n.a(bf.this.m, -bf.this.m.getHeight(), 360, false);
                                    }
                                }
                            }, 7000);
                            break;
                        }
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, l, false, 43123, new Class[0], Void.TYPE);
                        return;
                    }
            }
        }
    }

    public final void a(VideoItemParams videoItemParams) {
        String str;
        VideoItemParams videoItemParams2 = videoItemParams;
        if (PatchProxy.isSupport(new Object[]{videoItemParams2}, this, l, false, 43119, new Class[]{VideoItemParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{videoItemParams2}, this, l, false, 43119, new Class[]{VideoItemParams.class}, Void.TYPE);
            return;
        }
        super.a(videoItemParams);
        if (videoItemParams2 != null) {
            this.o = videoItemParams2.mAdViewController;
            if (PatchProxy.isSupport(new Object[0], this, l, false, 43120, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, l, false, 43120, new Class[0], Void.TYPE);
                return;
            }
            TextView textView = (TextView) this.m.findViewById(C0906R.id.d90);
            if (!this.o.a() && !this.f3210b.isHotSearchAweme() && !this.f3210b.isHotVideoAweme()) {
                c a2 = c.a();
                if (PatchProxy.isSupport(new Object[0], a2, c.f33371a, false, 21693, new Class[0], String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[0], a2, c.f33371a, false, 21693, new Class[0], String.class);
                } else {
                    String str2 = a2.g;
                    if (TextUtils.isEmpty(str2)) {
                        str = str2;
                    } else {
                        a2.g = "";
                        String format = new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date(System.currentTimeMillis()));
                        str = String.format(k.a().getResources().getString(C0906R.string.ck2), new Object[]{format, str2});
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    this.n = false;
                    this.m.setVisibility(0);
                    textView.setText(str);
                    return;
                }
            }
            this.m.setVisibility(8);
            textView.setText("");
        }
    }
}
