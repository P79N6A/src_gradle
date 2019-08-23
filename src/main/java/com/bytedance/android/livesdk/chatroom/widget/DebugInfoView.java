package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.b.a;
import com.bytedance.android.livesdk.utils.ab;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class DebugInfoView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13369a;

    /* renamed from: b  reason: collision with root package name */
    TextView f13370b;

    /* renamed from: c  reason: collision with root package name */
    TextView f13371c;

    /* renamed from: d  reason: collision with root package name */
    TextView f13372d;

    /* renamed from: e  reason: collision with root package name */
    TextView f13373e;

    /* renamed from: f  reason: collision with root package name */
    private a f13374f;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f13369a, false, 7811, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13369a, false, 7811, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        a aVar = this.f13374f;
        if (PatchProxy.isSupport(new Object[0], aVar, a.f9755a, false, 4044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, a.f9755a, false, 4044, new Class[0], Void.TYPE);
            return;
        }
        if (ab.a() != null) {
            ab.a().removeMessageListener(aVar);
        }
    }

    public DebugInfoView(Context context) {
        this(context, null);
    }

    public DebugInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DebugInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[0], this, f13369a, false, 7812, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13369a, false, 7812, new Class[0], Void.TYPE);
            return;
        }
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(C0906R.layout.af8, this);
        this.f13372d = (TextView) findViewById(C0906R.id.a52);
        this.f13370b = (TextView) findViewById(C0906R.id.ajw);
        this.f13373e = (TextView) findViewById(C0906R.id.bmb);
        this.f13371c = (TextView) findViewById(C0906R.id.s5);
        this.f13374f = new a();
        a aVar = this.f13374f;
        d dVar = new d(this);
        if (PatchProxy.isSupport(new Object[]{dVar}, aVar, a.f9755a, false, 4046, new Class[]{a.C0081a.class}, Void.TYPE)) {
            a aVar2 = aVar;
            PatchProxy.accessDispatch(new Object[]{dVar}, aVar2, a.f9755a, false, 4046, new Class[]{a.C0081a.class}, Void.TYPE);
        } else {
            aVar.f9757c.add(dVar);
        }
        a aVar3 = this.f13374f;
        long b2 = TTLiveSDKContext.getHostService().k().b();
        if (PatchProxy.isSupport(new Object[]{new Long(b2)}, aVar3, a.f9755a, false, 4045, new Class[]{Long.TYPE}, Void.TYPE)) {
            a aVar4 = aVar3;
            PatchProxy.accessDispatch(new Object[]{new Long(b2)}, aVar4, a.f9755a, false, 4045, new Class[]{Long.TYPE}, Void.TYPE);
        } else {
            aVar3.f9756b = b2;
            aVar3.f9758d = 0;
            aVar3.f9759e = 0;
            aVar3.f9760f = 0;
            aVar3.g = 0;
            aVar3.a(com.bytedance.android.livesdkapi.depend.f.a.GIFT, aVar3.f9758d);
            aVar3.a(com.bytedance.android.livesdkapi.depend.f.a.CHAT, aVar3.f9759e);
            aVar3.a(com.bytedance.android.livesdkapi.depend.f.a.DIGG, aVar3.f9760f);
            aVar3.a(com.bytedance.android.livesdkapi.depend.f.a.MEMBER, aVar3.g);
        }
        ((TextView) findViewById(C0906R.id.dnt)).setText(String.valueOf(TTLiveSDKContext.getHostService().k().b()));
        ((TextView) findViewById(C0906R.id.a4w)).setText(TTLiveSDKContext.getHostService().a().d());
    }
}
