package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.message.model.as;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import org.aspectj.lang.a;

public class b extends LinearLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14886a;

    /* renamed from: b  reason: collision with root package name */
    public static float f14887b = 0.0f;
    private static final /* synthetic */ a.C0900a h;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f14888c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f14889d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f14890e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f14891f;
    private com.bytedance.android.livesdk.gift.effect.entry.e.a g;

    static {
        if (PatchProxy.isSupport(new Object[0], null, f14886a, true, 9484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f14886a, true, 9484, new Class[0], Void.TYPE);
        } else {
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("EnterAnimTrayView.java", b.class);
            h = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimTrayView", "android.view.View", NotifyType.VIBRATE, "", "void"), 79);
        }
    }

    public b(Context context) {
        this(context, null);
    }

    private void setTextContent(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        com.bytedance.android.livesdk.gift.effect.entry.e.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f14886a, false, 9483, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f14886a, false, 9483, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
        } else if (aVar2 != null) {
            this.f14889d.setText(getContext().getString(C0906R.string.cvv, new Object[]{aVar2.f14848c}));
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f14886a, false, 9478, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f14886a, false, 9478, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(h, this, this, view));
        if (C0906R.id.dlg == view.getId() && this.g != null) {
            com.bytedance.android.livesdk.u.a.a().a((Object) new UserProfileEvent(this.g.f14847b));
        }
    }

    public final void a(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14886a, false, 9479, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14886a, false, 9479, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
        } else if (aVar != null) {
            this.g = aVar;
            boolean c2 = aVar.c();
            if (c2) {
                this.f14890e.setVisibility(0);
                a((View) this.f14890e, aVar.h);
                a(aVar, 2130841079);
            } else {
                this.f14890e.setVisibility(8);
            }
            if (((int) aVar.m) < 10 || aVar.p != 1 || c2) {
                this.f14888c.setVisibility(8);
            } else {
                a((View) this.f14888c, aVar.o);
                this.f14891f.setText(aVar.n);
                this.f14888c.setVisibility(0);
                a(aVar, 2130841044);
            }
            setTextContent(aVar);
        }
    }

    private b(Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private void a(View view, ImageModel imageModel) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, imageModel}, this, f14886a, false, 9481, new Class[]{View.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, imageModel}, this, f14886a, false, 9481, new Class[]{View.class, ImageModel.class}, Void.TYPE);
        } else if (view2 == null || imageModel == null) {
        } else {
            com.bytedance.android.livesdk.chatroom.f.b.a(imageModel).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new c<Object>(this, view2));
        }
    }

    private void a(View view, String str) {
        final View view2 = view;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, str2}, this, f14886a, false, 9482, new Class[]{View.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, str2}, this, f14886a, false, 9482, new Class[]{View.class, String.class}, Void.TYPE);
        } else if (view2 != null) {
            k.a(str2, 0, 0, (q.b) new q.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14892a;

                public final void a(Bitmap bitmap) {
                    if (PatchProxy.isSupport(new Object[]{bitmap}, this, f14892a, false, 9486, new Class[]{Bitmap.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bitmap}, this, f14892a, false, 9486, new Class[]{Bitmap.class}, Void.TYPE);
                        return;
                    }
                    if (bitmap != null) {
                        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                            UIUtils.setLayoutParams(view2, (int) (((float) bitmap.getWidth()) * b.f14887b), (int) (((float) bitmap.getHeight()) * b.f14887b));
                        }
                        view2.setBackgroundDrawable(new BitmapDrawable(bitmap));
                        b.this.invalidate();
                    }
                }
            });
        }
    }

    private void a(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f14886a, false, 9480, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f14886a, false, 9480, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class, Integer.TYPE}, Void.TYPE);
        } else if (aVar != null) {
            as.a aVar2 = aVar.l;
            if (aVar2 == null || aVar2.f16494e == null || t.a(aVar2.f16494e.getUrls())) {
                setBackgroundResource(i);
            } else {
                a((View) this, aVar2.f16494e);
            }
        }
    }

    private b(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        if (PatchProxy.isSupport(new Object[0], this, f14886a, false, 9477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14886a, false, 9477, new Class[0], Void.TYPE);
            return;
        }
        inflate(getContext(), C0906R.layout.ahn, this);
        this.f14888c = (LinearLayout) findViewById(C0906R.id.d6o);
        this.f14889d = (TextView) findViewById(C0906R.id.dlg);
        this.f14890e = (ViewGroup) findViewById(C0906R.id.aon);
        this.f14891f = (TextView) findViewById(C0906R.id.dkb);
        this.f14888c.setOnClickListener(this);
        this.f14889d.setOnClickListener(this);
        if (f14887b <= 0.0f) {
            if (com.bytedance.android.live.core.b.a() != null) {
                f14887b = com.bytedance.android.live.core.b.a().getResources().getDisplayMetrics().density / 3.0f;
            }
        }
        setGravity(16);
    }
}
