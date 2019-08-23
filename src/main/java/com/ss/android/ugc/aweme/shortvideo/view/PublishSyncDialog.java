package com.ss.android.ugc.aweme.shortvideo.view;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.collect.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.iesapi.a;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.util.ac;
import com.ss.android.ugc.aweme.story.model.b;
import com.ss.android.ugc.bytex.a.a.a;
import java.util.Map;

public class PublishSyncDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71263a;

    /* renamed from: b  reason: collision with root package name */
    public int f71264b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f71265c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f71266d;

    /* renamed from: e  reason: collision with root package name */
    private b f71267e;

    public void onCreate(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f71263a, false, 81242, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f71263a, false, 81242, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setCancelable(false);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -1);
        if (this.f71266d) {
            setContentView((int) C0906R.layout.k7);
        } else {
            setContentView((int) C0906R.layout.k6);
        }
        Window window = getWindow();
        window.setBackgroundDrawable(a.a(getContext().getResources(), 2130840612));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        User curUser = d.a().getCurUser();
        ((CircleImageView) findViewById(C0906R.id.c8t)).a(curUser.getAvatarMedium());
        ((TextView) findViewById(C0906R.id.c8u)).setText(curUser.getNickname());
        ImageView imageView = (ImageView) findViewById(C0906R.id.c8q);
        TextView textView = (TextView) findViewById(C0906R.id.c8r);
        TextView textView2 = (TextView) findViewById(C0906R.id.c8p);
        TextView textView3 = (TextView) findViewById(C0906R.id.c8s);
        if (this.f71264b == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f71266d) {
            i = 2130839402;
        } else {
            i = 2130839401;
        }
        if (z) {
            i = 2130838992;
        }
        imageView.setImageResource(i);
        if (z) {
            i2 = C0906R.string.an4;
        } else {
            i2 = C0906R.string.co8;
        }
        textView.setText(i2);
        if (z) {
            textView2.setText(C0906R.string.an5);
            str = String.format(getContext().getString(C0906R.string.cdo), new Object[]{getContext().getString(C0906R.string.an4)});
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f71263a, false, 81243, new Class[0], String.class)) {
                str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f71263a, false, 81243, new Class[0], String.class);
            } else if (this.f71267e == null || this.f71267e.i == null || TextUtils.isEmpty(this.f71267e.i.text)) {
                str2 = getContext().getString(C0906R.string.coc);
            } else {
                str2 = this.f71267e.i.text;
            }
            textView2.setText(str2);
            if (PatchProxy.isSupport(new Object[0], this, f71263a, false, 81244, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f71263a, false, 81244, new Class[0], String.class);
            } else if (this.f71267e == null || this.f71267e.i == null || TextUtils.isEmpty(this.f71267e.i.btnText)) {
                str = String.format(getContext().getString(C0906R.string.cdo), new Object[]{getContext().getString(C0906R.string.co8)});
            } else {
                str = this.f71267e.i.btnText;
            }
        }
        textView3.setText(str);
        textView3.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71268a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f71268a, false, 81245, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f71268a, false, 81245, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                PublishSyncDialog.this.dismiss();
                if (PublishSyncDialog.this.f71264b == 0) {
                    new com.ss.android.ugc.aweme.iesapi.a.b(PublishSyncDialog.this.f71265c).a((a.C0592a) new a.C0592a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f71270a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f71270a, false, 81246, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f71270a, false, 81246, new Class[0], Void.TYPE);
                                return;
                            }
                            SharePrefCache.inst().isSyncToHuoshan().a(Boolean.TRUE);
                        }

                        public final void a(String str) {
                            String str2 = str;
                            if (PatchProxy.isSupport(new Object[]{str2}, this, f71270a, false, 81247, new Class[]{String.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{str2}, this, f71270a, false, 81247, new Class[]{String.class}, Void.TYPE);
                                return;
                            }
                            com.bytedance.ies.dmt.ui.d.a.b(PublishSyncDialog.this.getContext(), str2, 0).a();
                        }
                    });
                    return;
                }
                ac.a(PublishSyncDialog.this.f71265c);
                r.a("sync_toutiao_confirm", (Map) ak.of("current_fans_count", String.valueOf(d.a().getCurUser().getFansCount()), "enter_method", "after_publish"));
            }
        });
        final ImageView imageView2 = (ImageView) findViewById(C0906R.id.c8o);
        imageView2.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71272a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f71272a, false, 81248, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f71272a, false, 81248, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                imageView2.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71275a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f71275a, false, 81249, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f71275a, false, 81249, new Class[0], Void.TYPE);
                            return;
                        }
                        imageView2.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                        PublishSyncDialog.this.dismiss();
                    }
                }).start();
            }
        });
    }

    public PublishSyncDialog(Activity activity, int i, b bVar) {
        super(activity);
        this.f71265c = activity;
        this.f71264b = i;
        this.f71267e = bVar;
    }
}
