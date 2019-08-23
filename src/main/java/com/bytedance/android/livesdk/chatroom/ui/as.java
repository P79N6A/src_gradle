package com.bytedance.android.livesdk.chatroom.ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class as extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11859a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f11860b;

    /* renamed from: c  reason: collision with root package name */
    public int f11861c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11862d;

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11859a, false, 5687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11859a, false, 5687, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        this.f11862d = true;
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f11859a, false, 5688, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f11859a, false, 5688, new Class[0], Void.TYPE);
            return;
        }
        this.f11862d = false;
        super.onDetachedFromWindow();
    }

    public final void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f11859a, false, 5686, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f11859a, false, 5686, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (getWindow() != null) {
            getWindow().setLayout(-1, -1);
        }
        findViewById(C0906R.id.y9).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11863a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f11863a, false, 5689, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f11863a, false, 5689, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                as.this.dismiss();
            }
        });
        final View findViewById = findViewById(C0906R.id.ao1);
        findViewById.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11865a;

            public final void run() {
                int[] iArr;
                if (PatchProxy.isSupport(new Object[0], this, f11865a, false, 5690, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f11865a, false, 5690, new Class[0], Void.TYPE);
                } else if (as.this.f11862d) {
                    Context context = as.this.getContext();
                    if (PatchProxy.isSupport(new Object[]{context}, null, ak.f17581a, true, 13752, new Class[]{Context.class}, int[].class)) {
                        iArr = (int[]) PatchProxy.accessDispatch(new Object[]{context}, null, ak.f17581a, true, 13752, new Class[]{Context.class}, int[].class);
                    } else {
                        int[] iArr2 = {0, 0};
                        if (context != null) {
                            WindowManager windowManager = (WindowManager) context.getApplicationContext().getSystemService("window");
                            if (!(windowManager == null || windowManager.getDefaultDisplay() == null)) {
                                Point point = new Point();
                                windowManager.getDefaultDisplay().getSize(point);
                                iArr2[0] = point.x;
                                iArr2[1] = point.y;
                            }
                        }
                        iArr = iArr2;
                    }
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
                    layoutParams.rightMargin = ((iArr[0] - as.this.f11860b[0]) - (as.this.f11861c / 2)) - (findViewById.getWidth() / 2);
                    layoutParams.bottomMargin = (int) UIUtils.dip2Px(as.this.getContext(), 58.0f);
                    findViewById.setLayoutParams(layoutParams);
                    findViewById.setVisibility(0);
                }
            }
        });
    }

    as(@NonNull Context context, int[] iArr, int i) {
        super(context, C0906R.style.v2);
        setContentView(LayoutInflater.from(context).inflate(C0906R.layout.afw, null), new ViewGroup.LayoutParams(-1, -1));
        this.f11860b = iArr;
        this.f11861c = i;
    }
}
