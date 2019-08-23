package com.bytedance.android.livesdk.widget;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.f;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.j.c.j;
import com.bytedance.android.livesdk.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18483a;
    private static int j = 1;
    private static int k = 1;
    private static int l = BuildConfig.VERSION_CODE;
    private static int m = BuildConfig.VERSION_CODE;
    private static final /* synthetic */ a.C0900a p;

    /* renamed from: b  reason: collision with root package name */
    HSImageView f18484b;

    /* renamed from: c  reason: collision with root package name */
    TextView f18485c;

    /* renamed from: d  reason: collision with root package name */
    BaseFragment f18486d;

    /* renamed from: e  reason: collision with root package name */
    public p f18487e;

    /* renamed from: f  reason: collision with root package name */
    public String f18488f;
    public final CompositeDisposable g;
    public com.bytedance.android.livesdkapi.depend.model.live.a h;
    f i;
    private View n;
    private User o;

    public final String a() {
        if (this.i == null) {
            return null;
        }
        return this.i.f7758a;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18483a, false, 14416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18483a, false, 14416, new Class[0], Void.TYPE);
            return;
        }
        if (this.f18488f == null) {
            this.f18487e.a();
        }
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f18483a, true, 14419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f18483a, true, 14419, new Class[0], Void.TYPE);
        } else {
            b bVar = new b("LiveCoverController.java", i.class);
            p = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.widget.LiveCoverController", "android.view.View", NotifyType.VIBRATE, "", "void"), 180);
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18483a, false, 14415, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18483a, false, 14415, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.f18485c, i2);
        a(this.f18484b, i2);
        a(this.n, i2);
    }

    public void onClick(View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f18483a, false, 14413, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18483a, false, 14413, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(p, this, this, view));
        if (view.getId() == C0906R.id.bdj) {
            b();
            HashMap hashMap = new HashMap();
            if (this.h == com.bytedance.android.livesdkapi.depend.model.live.a.AUDIO) {
                str = "voice_live";
            } else {
                str = "video_live";
            }
            hashMap.put("live_type", str);
            com.bytedance.android.livesdk.j.a.a().a("cover_modify_click", hashMap, new j().f("click").b("live").a("live_take_page"));
        }
    }

    public final void a(Throwable th) {
        String str;
        if (PatchProxy.isSupport(new Object[]{th}, this, f18483a, false, 14418, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f18483a, false, 14418, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            str = ((com.bytedance.android.live.a.a.b.a) th).getErrorMsg();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f18486d.getString(C0906R.string.dha);
        }
        this.f18488f = null;
        if (this.f18486d.b_()) {
            this.f18487e.c();
            com.bytedance.android.live.uikit.d.a.a(this.f18486d.getContext(), str);
        }
    }

    public i(View view, BaseFragment baseFragment) {
        this(view, baseFragment, j, k);
    }

    private void a(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f18483a, false, 14417, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f18483a, false, 14417, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    private i(View view, BaseFragment baseFragment, int i2, int i3) {
        this.g = new CompositeDisposable();
        this.o = (User) TTLiveSDKContext.getHostService().k().a();
        j = i2;
        k = i3;
        if (i2 > i3) {
            l = 480;
            m = 270;
        } else if (i2 < i3) {
            l = 270;
            m = 480;
        }
        this.f18486d = baseFragment;
        this.f18484b = (HSImageView) view.findViewById(C0906R.id.bdj);
        this.f18484b.setImageResource(2130840959);
        this.f18484b.setOnClickListener(this);
        this.f18485c = (TextView) view.findViewById(C0906R.id.ddu);
        this.n = view.findViewById(C0906R.id.bdk);
        p pVar = new p(this.f18486d.getActivity(), this.f18486d, "cover", j, k, l, m, new j(this));
        this.f18487e = pVar;
        if (PatchProxy.isSupport(new Object[0], this, f18483a, false, 14410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18483a, false, 14410, new Class[0], Void.TYPE);
            return;
        }
        if (this.f18486d.b_()) {
            this.f18485c.setText(this.f18486d.getString(C0906R.string.d10));
            this.f18485c.setAlpha(0.64f);
            this.g.add(com.bytedance.android.livesdk.v.j.q().d().g().anchorCoverStatus().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new k(this), l.f18497b));
        }
    }
}
