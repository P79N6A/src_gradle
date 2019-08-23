package com.bytedance.android.livesdk.banner.ad;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.e;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.ae;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import org.aspectj.lang.a;

public class b extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9118a;
    private static final /* synthetic */ a.C0900a g;

    /* renamed from: b  reason: collision with root package name */
    View f9119b;

    /* renamed from: c  reason: collision with root package name */
    HSImageView f9120c;

    /* renamed from: d  reason: collision with root package name */
    boolean f9121d;

    /* renamed from: e  reason: collision with root package name */
    e f9122e;

    /* renamed from: f  reason: collision with root package name */
    boolean f9123f;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f9118a, true, 3201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f9118a, true, 3201, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("BannerAdView.java", b.class);
        g = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.banner.ad.BannerAdView", "android.view.View", NotifyType.VIBRATE, "", "void"), 97);
    }

    public b(Context context) {
        this(context, null);
    }

    public final void a(String str) {
        String str2;
        String str3;
        if (PatchProxy.isSupport(new Object[]{str}, this, f9118a, false, 3200, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f9118a, false, 3200, new Class[]{String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.f9122e != null) {
            str2 = this.f9122e.f11109b;
        } else {
            str2 = "";
        }
        hashMap.put("banner_name", str2);
        if (this.f9122e != null) {
            str3 = String.valueOf(this.f9122e.f11108a);
        } else {
            str3 = "";
        }
        hashMap.put("banner_id", str3);
        com.bytedance.android.livesdk.j.a.a().a(str, hashMap, new j().a("live_detail"), Room.class);
    }

    public void onClick(View view) {
        View view2 = view;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f9118a, false, 3198, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f9118a, false, 3198, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(g, this, this, view2));
        if (view.getId() == C0906R.id.af_) {
            if (PatchProxy.isSupport(new Object[]{view2}, this, f9118a, false, 3199, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view2}, this, f9118a, false, 3199, new Class[]{View.class}, Void.TYPE);
            } else {
                UIUtils.setViewVisibility(this, 8);
                this.f9121d = true;
                com.bytedance.android.livesdk.u.a.a().a((Object) new a(false));
                a("livesdk_game_ad_banner_close");
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], null, ae.f17571a, true, 13720, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, ae.f17571a, true, 13720, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                long uptimeMillis = SystemClock.uptimeMillis();
                ae.f17572b = uptimeMillis;
                if (uptimeMillis - ae.f17572b <= 500) {
                    z = false;
                }
            }
            if (z) {
                if (!NetworkUtils.isNetworkAvailable(getContext())) {
                    ai.a((int) C0906R.string.d8r);
                    return;
                }
                Object tag = view.getTag();
                if (tag instanceof e) {
                    com.bytedance.android.livesdk.chatroom.c.b.a(getContext(), (e) tag);
                    a("livesdk_game_ad_banner_click");
                }
            }
        }
    }

    private b(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[]{context}, this, f9118a, false, 3195, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f9118a, false, 3195, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(C0906R.layout.aet, this, true);
        setOnClickListener(this);
        this.f9119b = findViewById(C0906R.id.af_);
        this.f9119b.setOnClickListener(this);
        this.f9120c = (HSImageView) findViewById(C0906R.id.az1);
    }
}
