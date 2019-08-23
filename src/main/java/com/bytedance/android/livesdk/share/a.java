package com.bytedance.android.livesdk.share;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public abstract class a extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17204a;

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ a.C0900a f17205f;

    /* renamed from: b  reason: collision with root package name */
    protected String f17206b;

    /* renamed from: c  reason: collision with root package name */
    protected Activity f17207c;

    /* renamed from: d  reason: collision with root package name */
    protected b f17208d;

    /* renamed from: e  reason: collision with root package name */
    protected C0119a f17209e;

    /* renamed from: com.bytedance.android.livesdk.share.a$a  reason: collision with other inner class name */
    public interface C0119a {
        void b(String str);
    }

    public abstract void a();

    public abstract void b();

    static {
        if (PatchProxy.isSupport(new Object[0], null, f17204a, true, 13262, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f17204a, true, 13262, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("AbsStartLiveShareView.java", a.class);
        f17205f = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.share.AbsStartLiveShareView", "android.view.View", NotifyType.VIBRATE, "", "void"), 49);
    }

    public a(Context context) {
        super(context);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f17204a, false, 13261, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f17204a, false, 13261, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(f17205f, this, this, view));
        this.f17209e.b(this.f17206b);
    }

    public a(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void a(Activity activity, C0119a aVar) {
        if (PatchProxy.isSupport(new Object[]{activity, aVar}, this, f17204a, false, 13260, new Class[]{Activity.class, C0119a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, aVar}, this, f17204a, false, 13260, new Class[]{Activity.class, C0119a.class}, Void.TYPE);
            return;
        }
        this.f17207c = activity;
        this.f17209e = aVar;
        this.f17208d = TTLiveSDKContext.getHostService().g();
        a();
        b();
    }

    @RequiresApi(api = 21)
    public a(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
