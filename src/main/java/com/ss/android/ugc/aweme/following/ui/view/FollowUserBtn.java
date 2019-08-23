package com.ss.android.ugc.aweme.following.ui.view;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.dmt.ui.common.rebranding.a;
import com.bytedance.ies.dmt.ui.common.rebranding.b;
import com.bytedance.ies.dmt.ui.common.rebranding.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.ArrayList;

public class FollowUserBtn extends RelativeLayout implements b, c {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f48162b;

    /* renamed from: c  reason: collision with root package name */
    protected NiceWidthTextView f48163c;

    /* renamed from: d  reason: collision with root package name */
    protected int f48164d;

    public LifecycleOwner getLifeCycleOwner() {
        if (!PatchProxy.isSupport(new Object[0], this, f48162b, false, 45160, new Class[0], LifecycleOwner.class)) {
            return (LifecycleOwner) getContext();
        }
        return (LifecycleOwner) PatchProxy.accessDispatch(new Object[0], this, f48162b, false, 45160, new Class[0], LifecycleOwner.class);
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f48162b, false, 45156, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48162b, false, 45156, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
    }

    public FollowUserBtn(Context context) {
        this(context, null);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f48162b, false, 45155, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f48162b, false, 45155, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f48163c.setOnClickListener(onClickListener2);
    }

    public void setFollowButtonStyle(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48162b, false, 45159, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48162b, false, 45159, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == -1) {
            this.f48163c.setPadding(0, 0, 0, 0);
            this.f48163c.setGravity(17);
            this.f48163c.setCompoundDrawables(null, null, null, null);
        } else {
            Drawable a2 = a.a(getContext().getResources(), i);
            a2.setBounds(0, 0, a2.getMinimumWidth(), a2.getMinimumHeight());
            this.f48163c.setCompoundDrawables(a2, null, null, null);
            this.f48163c.setGravity(16);
        }
    }

    public int a(TextView textView) {
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, this, f48162b, false, 45161, new Class[]{TextView.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{textView2}, this, f48162b, false, 45161, new Class[]{TextView.class}, Integer.TYPE)).intValue();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(C0906R.string.agr));
        arrayList.add(Integer.valueOf(C0906R.string.a6u));
        arrayList.add(Integer.valueOf(C0906R.string.agl));
        arrayList.add(Integer.valueOf(C0906R.string.a6w));
        return c.a(textView2, arrayList, (int) UIUtils.dip2Px(getContext(), 60.0f), (int) UIUtils.dip2Px(getContext(), 120.0f));
    }

    public void setFollowStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48162b, false, 45157, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48162b, false, 45157, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f48164d != i) {
            this.f48164d = i;
            setVisibility(0);
            switch (i) {
                case 0:
                    this.f48163c.setText(getResources().getText(C0906R.string.afp));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.hx));
                    this.f48163c.setBackground(a.a(getResources(), 2130837968));
                    switch (AbTestManager.a().k().intValue()) {
                        case 0:
                            return;
                        case 1:
                            setFollowButtonStyle(2130839876);
                            return;
                        case 2:
                            setFollowButtonStyle(2130839876);
                            return;
                        default:
                            return;
                    }
                case 1:
                    this.f48163c.setText(getResources().getText(C0906R.string.agr));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                    this.f48163c.setBackground(a.a(getResources(), 2130837983));
                    return;
                case 2:
                    this.f48163c.setText(getResources().getText(C0906R.string.a6u));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                    this.f48163c.setBackground(a.a(getResources(), 2130837983));
                    return;
                case 3:
                    setVisibility(8);
                    break;
                case 4:
                    this.f48163c.setText(getResources().getText(C0906R.string.agl));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                    this.f48163c.setBackground(a.a(getResources(), 2130837983));
                    return;
            }
        }
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ee, code lost:
        if (r12 == 1) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f48162b
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 45158(0xb066, float:6.328E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f48162b
            r3 = 0
            r4 = 45158(0xb066, float:6.328E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            r10.setVisibility(r8)
            r0 = 2131559674(0x7f0d04fa, float:1.8744699E38)
            r1 = 2130837983(0x7f0201df, float:1.7280935E38)
            r2 = 2131624913(0x7f0e03d1, float:1.887702E38)
            r3 = -1
            switch(r11) {
                case 0: goto L_0x011d;
                case 1: goto L_0x00d8;
                case 2: goto L_0x0097;
                case 3: goto L_0x0090;
                case 4: goto L_0x0061;
                default: goto L_0x005f;
            }
        L_0x005f:
            goto L_0x01d4
        L_0x0061:
            r10.setFollowButtonStyle(r3)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r3 = r10.getResources()
            r4 = 2131560069(0x7f0d0685, float:1.87455E38)
            java.lang.CharSequence r3 = r3.getText(r4)
            r0.setText(r3)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r3 = r10.getResources()
            int r2 = r3.getColor(r2)
            r0.setTextColor(r2)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r2 = r10.getResources()
            android.graphics.drawable.Drawable r1 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r1)
            r0.setBackground(r1)
            goto L_0x01d4
        L_0x0090:
            r0 = 8
            r10.setVisibility(r0)
            goto L_0x01d4
        L_0x0097:
            r10.setFollowButtonStyle(r3)
            r3 = 2131559673(0x7f0d04f9, float:1.8744697E38)
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r4 = r4.k()
            int r4 = r4.intValue()
            switch(r4) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00af;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            r0 = 2131559673(0x7f0d04f9, float:1.8744697E38)
        L_0x00af:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r3 = r10.f48163c
            android.content.res.Resources r4 = r10.getResources()
            java.lang.CharSequence r0 = r4.getText(r0)
            r3.setText(r0)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r3 = r10.getResources()
            int r2 = r3.getColor(r2)
            r0.setTextColor(r2)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r2 = r10.getResources()
            android.graphics.drawable.Drawable r1 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r1)
            r0.setBackground(r1)
            goto L_0x01d4
        L_0x00d8:
            r10.setFollowButtonStyle(r3)
            r3 = 2131560075(0x7f0d068b, float:1.8745512E38)
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r4 = r4.k()
            int r4 = r4.intValue()
            switch(r4) {
                case 0: goto L_0x00f1;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00ee;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x00f1
        L_0x00ee:
            if (r12 != r9) goto L_0x00f1
            goto L_0x00f4
        L_0x00f1:
            r0 = 2131560075(0x7f0d068b, float:1.8745512E38)
        L_0x00f4:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r3 = r10.f48163c
            android.content.res.Resources r4 = r10.getResources()
            java.lang.CharSequence r0 = r4.getText(r0)
            r3.setText(r0)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r3 = r10.getResources()
            int r2 = r3.getColor(r2)
            r0.setTextColor(r2)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r2 = r10.getResources()
            android.graphics.drawable.Drawable r1 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r2, (int) r1)
            r0.setBackground(r1)
            goto L_0x01d4
        L_0x011d:
            r0 = 2131560037(0x7f0d0665, float:1.8745435E38)
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r1 = r1.k()
            int r1 = r1.intValue()
            r2 = 2130839876(0x7f020944, float:1.7284775E38)
            r4 = 2130839877(0x7f020945, float:1.7284777E38)
            r5 = 1099956224(0x41900000, float:18.0)
            switch(r1) {
                case 0: goto L_0x01a4;
                case 1: goto L_0x017b;
                case 2: goto L_0x0139;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x01a7
        L_0x0139:
            if (r12 == r9) goto L_0x015b
            int r1 = r10.f48164d
            if (r1 != r7) goto L_0x0140
            goto L_0x015b
        L_0x0140:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r1 = r10.f48163c
            android.content.Context r3 = r10.getContext()
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r5)
            int r3 = (int) r3
            android.content.Context r4 = r10.getContext()
            float r4 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r5)
            int r4 = (int) r4
            r1.setPadding(r3, r8, r4, r8)
            r10.setFollowButtonStyle(r2)
            goto L_0x01a7
        L_0x015b:
            r0 = 2131560041(0x7f0d0669, float:1.8745443E38)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r1 = r10.f48163c
            android.content.Context r2 = r10.getContext()
            r3 = 1090519040(0x41000000, float:8.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            android.content.Context r5 = r10.getContext()
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r5, r3)
            int r3 = (int) r3
            r1.setPadding(r2, r8, r3, r8)
            r10.setFollowButtonStyle(r4)
            goto L_0x01a7
        L_0x017b:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r1 = r10.f48163c
            android.content.Context r3 = r10.getContext()
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r3, r5)
            int r3 = (int) r3
            android.content.Context r6 = r10.getContext()
            float r5 = com.bytedance.common.utility.UIUtils.dip2Px(r6, r5)
            int r5 = (int) r5
            r1.setPadding(r3, r8, r5, r8)
            if (r12 == r9) goto L_0x019d
            int r1 = r10.f48164d
            if (r1 != r7) goto L_0x0199
            goto L_0x019d
        L_0x0199:
            r10.setFollowButtonStyle(r2)
            goto L_0x01a7
        L_0x019d:
            r0 = 2131560038(0x7f0d0666, float:1.8745437E38)
            r10.setFollowButtonStyle(r4)
            goto L_0x01a7
        L_0x01a4:
            r10.setFollowButtonStyle(r3)
        L_0x01a7:
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r1 = r10.f48163c
            android.content.res.Resources r2 = r10.getResources()
            java.lang.CharSequence r0 = r2.getText(r0)
            r1.setText(r0)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2131624263(0x7f0e0147, float:1.88757E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView r0 = r10.f48163c
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2130837968(0x7f0201d0, float:1.7280905E38)
            android.graphics.drawable.Drawable r1 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r1, (int) r2)
            r0.setBackground(r1)
        L_0x01d4:
            r10.f48164d = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn.a(int, int):void");
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet, i);
    }

    public void a(Context context, AttributeSet attributeSet, int i) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet, Integer.valueOf(i)}, this, f48162b, false, 45154, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet, Integer.valueOf(i)}, this, f48162b, false, 45154, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f48163c = (NiceWidthTextView) LayoutInflater.from(context).inflate(C0906R.layout.aqw, this, true).findViewById(C0906R.id.o3);
        this.f48163c.a(this);
        com.bytedance.ies.dmt.ui.common.rebranding.a.a(getClass(), new a.C0186a(a(this.f48163c)));
        this.f48164d = 0;
    }
}
