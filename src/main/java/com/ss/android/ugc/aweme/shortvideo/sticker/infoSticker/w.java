package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.f;
import java.util.List;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70115a;

    /* renamed from: b  reason: collision with root package name */
    TextView f70116b;

    /* renamed from: c  reason: collision with root package name */
    FrameLayout f70117c;

    /* renamed from: d  reason: collision with root package name */
    EditText f70118d;

    /* renamed from: e  reason: collision with root package name */
    ImageButton f70119e;

    /* renamed from: f  reason: collision with root package name */
    FrameLayout f70120f;
    public DmtStatusView g;
    RelativeLayout h;
    SearchInfoStickerFragment i;
    FragmentActivity j;
    FragmentManager k;
    TextWatcher l;
    SearchInfoStickerPresenter m;
    View n;
    boolean o = true;
    f p;
    f.a q;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f70115a, false, 79461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70115a, false, 79461, new Class[0], Void.TYPE);
            return;
        }
        this.f70118d.setText("");
        this.f70119e.setVisibility(8);
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f70115a, false, 79468, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f70115a, false, 79468, new Class[0], String.class);
        } else if (this.f70118d == null) {
            return "";
        } else {
            return this.f70118d.getText().toString();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70115a, false, 79464, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70115a, false, 79464, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != -1) {
            switch (i2) {
                case 1:
                    this.h.setVisibility(4);
                    this.g.e();
                    return;
                case 2:
                    this.h.setVisibility(4);
                    this.g.f();
                    break;
            }
        } else {
            this.h.setVisibility(0);
            this.g.b();
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70115a, false, 79465, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70115a, false, 79465, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i.a(i2);
    }

    public final void a(List<p> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f70115a, false, 79466, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f70115a, false, 79466, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
        } else if (Lists.isEmpty(list)) {
            this.g.e();
        } else {
            if (this.o) {
                this.k.beginTransaction().add((int) C0906R.id.cl6, (Fragment) this.i).commit();
                this.o = false;
            }
            if (z) {
                this.i.b(list);
            } else {
                this.i.a(list);
            }
            this.i.f69792c = new y(this);
        }
    }

    w(View view, FragmentActivity fragmentActivity, TextWatcher textWatcher) {
        this.l = textWatcher;
        this.j = fragmentActivity;
        this.n = view;
    }
}
