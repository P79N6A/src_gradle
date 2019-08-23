package com.ss.android.ugc.aweme.face2face.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn;

public class Face2FaceFollowTextView extends FollowUserBtn {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44031a;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f44031a, false, 39214, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44031a, false, 39214, new Class[0], Void.TYPE);
            return;
        }
        this.f48163c.setTextSize(1, 16.0f);
        b();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f44031a, false, 39215, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44031a, false, 39215, new Class[0], Void.TYPE);
            return;
        }
        this.f48163c.setTextColor(getResources().getColor(C0906R.color.hs));
        this.f48163c.setBackgroundColor(getResources().getColor(C0906R.color.a7l));
    }

    public Face2FaceFollowTextView(Context context) {
        super(context);
        a();
    }

    public void setFollowStatus(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f44031a, false, 39216, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f44031a, false, 39216, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setFollowStatus(i);
        switch (i) {
            case 0:
            case 3:
                this.f48163c.setText(getResources().getText(C0906R.string.afp));
                this.f48163c.setTextColor(getResources().getColor(C0906R.color.hs));
                break;
            case 1:
            case 2:
                this.f48163c.setText(getResources().getText(C0906R.string.agr));
                this.f48163c.setTextColor(getResources().getColor(C0906R.color.i3));
                break;
        }
        this.f48163c.setBackgroundColor(getResources().getColor(C0906R.color.a7l));
    }

    public Face2FaceFollowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public Face2FaceFollowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
