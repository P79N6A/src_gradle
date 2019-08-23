package com.ss.android.ugc.aweme.shortvideo.local;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.a.d;
import com.ss.android.ugc.aweme.port.in.a;
import java.util.List;

public class UploadButton extends FrameLayout implements d.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68326a;

    /* renamed from: b  reason: collision with root package name */
    AnimatedImageView f68327b;

    /* renamed from: c  reason: collision with root package name */
    private View f68328c;

    /* renamed from: d  reason: collision with root package name */
    private Context f68329d;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68326a, false, 77592, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68326a, false, 77592, new Class[0], Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (a2 != null) {
            a2.b((d.b) this);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f68326a, false, 77593, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68326a, false, 77593, new Class[0], Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (a2 != null) {
            a2.a((d.b) this);
        }
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f68326a, false, 77590, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f68326a, false, 77590, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a.H.E().c(this.f68329d) != 0) {
            return false;
        } else {
            d.a(a.f61119b.getApplicationContext());
            d.a().a(1, false);
            return true;
        }
    }

    public UploadButton(Context context) {
        this(context, null);
    }

    public UploadButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UploadButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f68326a, false, 77589, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f68326a, false, 77589, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f68329d = context;
        this.f68328c = LayoutInflater.from(context).inflate(C0906R.layout.as8, this, true);
        this.f68327b = (AnimatedImageView) this.f68328c.findViewById(C0906R.id.b6a);
    }

    public final void a(boolean z, int i, List<com.ss.android.ugc.aweme.music.b.a.a> list) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), list}, this, f68326a, false, 77591, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), list}, this, f68326a, false, 77591, new Class[]{Boolean.TYPE, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        if (z && i == 1) {
            String str = "res://" + a.f61119b.getPackageName() + "/2130840127";
            List<com.ss.android.ugc.aweme.music.b.a.a> a2 = d.a().a(1);
            if (a2 != null && a2.size() > 0) {
                if (a2.get(0) != null) {
                    str = "file://" + r1.f56315e;
                }
            }
            c.a((RemoteImageView) this.f68327b, str, (int) UIUtils.dip2Px(this.f68329d, 32.0f), (int) UIUtils.dip2Px(this.f68329d, 32.0f));
        }
    }
}
