package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class dq implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13178a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f13179b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageView f13180c;

    /* renamed from: d  reason: collision with root package name */
    private final View f13181d;

    /* renamed from: e  reason: collision with root package name */
    private final TextView f13182e;

    dq(ImageView imageView, ImageView imageView2, View view, TextView textView) {
        this.f13179b = imageView;
        this.f13180c = imageView2;
        this.f13181d = view;
        this.f13182e = textView;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f13178a, false, 7289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13178a, false, 7289, new Class[0], Void.TYPE);
            return;
        }
        ImageView imageView = this.f13179b;
        ImageView imageView2 = this.f13180c;
        View view = this.f13181d;
        TextView textView = this.f13182e;
        imageView.setVisibility(8);
        imageView2.setVisibility(8);
        view.setVisibility(8);
        textView.setVisibility(8);
    }
}
