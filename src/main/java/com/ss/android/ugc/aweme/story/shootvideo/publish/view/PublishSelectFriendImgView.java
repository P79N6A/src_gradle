package com.ss.android.ugc.aweme.story.shootvideo.publish.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;

public class PublishSelectFriendImgView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73778a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f73779b;

    /* renamed from: c  reason: collision with root package name */
    public AvatarWithBorderView f73780c;

    /* renamed from: d  reason: collision with root package name */
    public AvatarWithBorderView f73781d;

    /* renamed from: e  reason: collision with root package name */
    public AvatarWithBorderView f73782e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f73783f;
    private View g;
    private Context h;

    public PublishSelectFriendImgView(@NonNull Context context) {
        this(context, null);
    }

    public PublishSelectFriendImgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context;
        if (PatchProxy.isSupport(new Object[0], this, f73778a, false, 85522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73778a, false, 85522, new Class[0], Void.TYPE);
            return;
        }
        this.g = LayoutInflater.from(this.h).inflate(C0906R.layout.a95, null);
        this.f73779b = (ImageView) this.g.findViewById(C0906R.id.a33);
        this.f73780c = (AvatarWithBorderView) this.g.findViewById(C0906R.id.buj);
        this.f73781d = (AvatarWithBorderView) this.g.findViewById(C0906R.id.dm5);
        this.f73782e = (AvatarWithBorderView) this.g.findViewById(C0906R.id.d2n);
        this.f73783f = (TextView) this.g.findViewById(C0906R.id.b7k);
        this.f73780c.setVisibility(8);
        this.f73781d.setVisibility(8);
        this.f73782e.setVisibility(8);
        this.f73780c.setBorderColor(C0906R.color.a08);
        this.f73780c.setBorderWidth(1);
        this.f73781d.setBorderColor(C0906R.color.a08);
        this.f73781d.setBorderWidth(1);
        this.f73782e.setBorderColor(C0906R.color.a08);
        this.f73782e.setBorderWidth(1);
        addView(this.g);
    }
}
