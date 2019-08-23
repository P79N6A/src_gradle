package com.ss.android.ugc.aweme.face2face.ui;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;

public class Face2FaceFollowBtn extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44029a;

    /* renamed from: e  reason: collision with root package name */
    private FrameLayout f44030e;

    public Face2FaceFollowBtn(Context context) {
        super(context);
    }

    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f44029a, false, 39197, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f44029a, false, 39197, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f44030e.setOnClickListener(onClickListener2);
    }

    public void setFollowStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44029a, false, 39198, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44029a, false, 39198, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.f48164d != i) {
            this.f48164d = i;
            setVisibility(0);
            switch (i) {
                case 0:
                    this.f48163c.setText(getResources().getText(C0906R.string.afp));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.hx));
                    return;
                case 1:
                    this.f48163c.setText(getResources().getText(C0906R.string.agr));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                    return;
                case 2:
                    this.f48163c.setText(getResources().getText(C0906R.string.a6u));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                    return;
                case 3:
                    setVisibility(8);
                    break;
                case 4:
                    this.f48163c.setText(getResources().getText(C0906R.string.agl));
                    this.f48163c.setTextColor(getResources().getColor(C0906R.color.zt));
                    return;
            }
        }
    }

    public Face2FaceFollowBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Face2FaceFollowBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet, Integer.valueOf(i)}, this, f44029a, false, 39196, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet, Integer.valueOf(i)}, this, f44029a, false, 39196, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.m1, this, true);
        this.f48163c = (NiceWidthTextView) inflate.findViewById(C0906R.id.o3);
        this.f44030e = (FrameLayout) inflate.findViewById(C0906R.id.b7l);
        this.f48163c.a(this);
        this.f48164d = 0;
    }
}
