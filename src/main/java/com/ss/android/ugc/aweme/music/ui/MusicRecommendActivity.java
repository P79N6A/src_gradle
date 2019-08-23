package com.ss.android.ugc.aweme.music.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.component.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.b;
import com.ss.android.ugc.aweme.music.presenter.h;
import com.ss.android.ugc.aweme.music.presenter.i;
import com.ss.android.ugc.aweme.music.ui.dialog.b;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

public class MusicRecommendActivity extends AmeSSActivity implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56578a;

    /* renamed from: b  reason: collision with root package name */
    public b f56579b;

    /* renamed from: c  reason: collision with root package name */
    public d f56580c;

    /* renamed from: d  reason: collision with root package name */
    public String f56581d;

    /* renamed from: e  reason: collision with root package name */
    public int f56582e;
    @BindView(2131497203)
    EditText editSongLink;
    @BindView(2131497204)
    EditText editSongName;

    /* renamed from: f  reason: collision with root package name */
    ClickableSpan f56583f = new ClickableSpan() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56592a;

        public final void updateDrawState(TextPaint textPaint) {
            TextPaint textPaint2 = textPaint;
            if (PatchProxy.isSupport(new Object[]{textPaint2}, this, f56592a, false, 60439, new Class[]{TextPaint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textPaint2}, this, f56592a, false, 60439, new Class[]{TextPaint.class}, Void.TYPE);
                return;
            }
            super.updateDrawState(textPaint);
            textPaint2.setColor(ContextCompat.getColor(MusicRecommendActivity.this, C0906R.color.a1s));
            textPaint2.setUnderlineText(false);
        }

        public final void onClick(View view) {
            b bVar;
            if (PatchProxy.isSupport(new Object[]{view}, this, f56592a, false, 60438, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f56592a, false, 60438, new Class[]{View.class}, Void.TYPE);
                return;
            }
            if (MusicRecommendActivity.this.f56579b == null) {
                MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                b.a aVar = new b.a();
                aVar.f56689b = "https://aweme.snssdk.com/aweme/in_app/music_agreement/";
                MusicRecommendActivity musicRecommendActivity2 = MusicRecommendActivity.this;
                if (PatchProxy.isSupport(new Object[]{musicRecommendActivity2}, aVar, b.a.f56688a, false, 60555, new Class[]{Context.class}, b.class)) {
                    b.a aVar2 = aVar;
                    bVar = (b) PatchProxy.accessDispatch(new Object[]{musicRecommendActivity2}, aVar2, b.a.f56688a, false, 60555, new Class[]{Context.class}, b.class);
                } else {
                    b bVar2 = new b(musicRecommendActivity2);
                    bVar2.f56684b = aVar;
                    bVar = bVar2;
                }
                musicRecommendActivity.f56579b = bVar;
            }
            if (!MusicRecommendActivity.this.f56579b.isShowing()) {
                MusicRecommendActivity.this.f56579b.show();
            }
        }
    };
    public b.a g = new b.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56594a;

        public final void a(final int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f56594a, false, 60442, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f56594a, false, 60442, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56602a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f56602a, false, 60445, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f56602a, false, 60445, new Class[0], Void.TYPE);
                        return;
                    }
                    MusicRecommendActivity.this.f56580c.setProgress(i);
                }
            });
        }

        public final void a(final String str, long j) {
            String str2 = str;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, f56594a, false, 60440, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, f56594a, false, 60440, new Class[]{String.class, Long.TYPE}, Void.TYPE);
                return;
            }
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56596a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f56596a, false, 60443, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f56596a, false, 60443, new Class[0], Void.TYPE);
                        return;
                    }
                    MusicRecommendActivity.this.a(str);
                }
            });
        }

        public final void a(String str, Exception exc, long j) {
            final Exception exc2 = exc;
            long j2 = j;
            if (PatchProxy.isSupport(new Object[]{str, exc2, new Long(j2)}, this, f56594a, false, 60441, new Class[]{String.class, Exception.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, exc2, new Long(j2)}, this, f56594a, false, 60441, new Class[]{String.class, Exception.class, Long.TYPE}, Void.TYPE);
                return;
            }
            MusicRecommendActivity.this.runOnUiThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56599a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f56599a, false, 60444, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f56599a, false, 60444, new Class[0], Void.TYPE);
                        return;
                    }
                    a.b((Context) MusicRecommendActivity.this, (int) C0906R.string.bf6).a();
                    if (MusicRecommendActivity.this.isViewValid() && MusicRecommendActivity.this.isActive()) {
                        MusicRecommendActivity.this.f56580c.dismiss();
                    }
                }
            });
        }
    };
    private i h;
    private String i;
    @BindView(2131493567)
    ImageView ivClickUpload;
    @BindView(2131493568)
    LinearLayout llClickForUpload;
    @BindView(2131497604)
    TextTitleBar mTitleBar;
    @BindView(2131493758)
    TextView tvContentAgreement;
    @BindView(2131493569)
    TextView txtClickUploadTv;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f56578a, false, 60429, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56578a, false, 60429, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56578a, false, 60430, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56578a, false, 60430, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56578a, false, 60426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56578a, false, 60426, new Class[0], Void.TYPE);
            return;
        }
        a.b((Context) this, (int) C0906R.string.bf6).a();
        this.f56580c.dismiss();
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f56578a, false, 60419, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56578a, false, 60419, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        finish();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f56578a, false, 60423, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56578a, false, 60423, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56578a, false, 60425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56578a, false, 60425, new Class[0], Void.TYPE);
            return;
        }
        this.f56580c.setContentView(C0906R.layout.a5p);
        ((RelativeLayout) this.f56580c.findViewById(C0906R.id.chu)).setLayoutParams(new FrameLayout.LayoutParams((int) UIUtils.dip2Px(this, 140.0f), this.f56582e, 17));
        com.ss.android.b.a.a.a.a(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56605a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f56605a, false, 60446, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56605a, false, 60446, new Class[0], Void.TYPE);
                    return;
                }
                MusicRecommendActivity.this.f56580c.dismiss();
                a.a((Context) MusicRecommendActivity.this, (int) C0906R.string.ciz).a();
                MusicRecommendActivity.this.finish();
            }
        }, 500);
    }

    public final void a(String str) {
        String str2;
        int i2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f56578a, false, 60424, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56578a, false, 60424, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String obj = this.editSongName.getText().toString();
        String obj2 = this.editSongLink.getText().toString();
        if (!TextUtils.isEmpty(str)) {
            str2 = "";
            i2 = 1;
        } else {
            str2 = obj2;
            i2 = 2;
        }
        this.h.a(Integer.valueOf(i2), str, str2, obj);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56578a, false, 60418, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f56578a, false, 60418, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(C0906R.anim.r, 0);
        setContentView((int) C0906R.layout.dj);
        if (PatchProxy.isSupport(new Object[0], this, f56578a, false, 60420, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56578a, false, 60420, new Class[0], Void.TYPE);
        } else {
            this.h = new i();
            this.h.a(new h());
            this.h.a(this);
            SpannableString spannableString = new SpannableString(getString(C0906R.string.a1t));
            ClickableSpan clickableSpan = this.f56583f;
            if (PatchProxy.isSupport(new Object[]{spannableString, clickableSpan, 2, 10, 33}, null, x.f56781a, true, 60449, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{spannableString, clickableSpan, 2, 10, 33}, null, x.f56781a, true, 60449, new Class[]{SpannableString.class, Object.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                spannableString.setSpan(clickableSpan, 2, 10, 33);
            }
            this.tvContentAgreement.setText(spannableString);
            this.tvContentAgreement.setMovementMethod(LinkMovementMethod.getInstance());
            this.tvContentAgreement.setHighlightColor(0);
            this.mTitleBar.setColorMode(0);
            this.mTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56584a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56584a, false, 60431, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56584a, false, 60431, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    MusicRecommendActivity.this.finish();
                }

                public final void b(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f56584a, false, 60432, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f56584a, false, 60432, new Class[]{View.class}, Void.TYPE);
                    } else if (TextUtils.isEmpty(MusicRecommendActivity.this.editSongName.getText().toString())) {
                        a.c((Context) MusicRecommendActivity.this, (int) C0906R.string.bn_).a();
                    } else if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                        e.a((Activity) MusicRecommendActivity.this, "recommend_music", "click_music", (Bundle) null, (f) new w(view2));
                    } else {
                        MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                        if (PatchProxy.isSupport(new Object[0], musicRecommendActivity, MusicRecommendActivity.f56578a, false, 60427, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], musicRecommendActivity, MusicRecommendActivity.f56578a, false, 60427, new Class[0], Void.TYPE);
                        } else {
                            musicRecommendActivity.f56580c = d.b(musicRecommendActivity, musicRecommendActivity.getResources().getString(C0906R.string.c97));
                            View findViewById = musicRecommendActivity.f56580c.findViewById(C0906R.id.chu);
                            if (findViewById != null) {
                                findViewById.post(new Runnable(findViewById) {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f56607a;

                                    /* renamed from: b  reason: collision with root package name */
                                    final /* synthetic */ View f56608b;

                                    public final void run() {
                                        if (PatchProxy.isSupport(new Object[0], this, f56607a, false, 60447, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f56607a, false, 60447, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        MusicRecommendActivity.this.f56582e = this.f56608b.getHeight();
                                    }

                                    {
                                        this.f56608b = r2;
                                    }
                                });
                            }
                            musicRecommendActivity.f56580c.setOnDismissListener(new DialogInterface.OnDismissListener() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f56610a;

                                public final void onDismiss(DialogInterface dialogInterface) {
                                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f56610a, false, 60448, new Class[]{DialogInterface.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f56610a, false, 60448, new Class[]{DialogInterface.class}, Void.TYPE);
                                        return;
                                    }
                                    MusicRecommendActivity.this.f56580c.setContentView(C0906R.layout.a5p);
                                }
                            });
                        }
                        if (!TextUtils.isEmpty(MusicRecommendActivity.this.f56581d)) {
                            MusicRecommendActivity musicRecommendActivity2 = MusicRecommendActivity.this;
                            if (PatchProxy.isSupport(new Object[0], musicRecommendActivity2, MusicRecommendActivity.f56578a, false, 60421, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], musicRecommendActivity2, MusicRecommendActivity.f56578a, false, 60421, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.b.a.a.a.a(new Runnable() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f56590a;

                                    public final void run() {
                                        RequestBody requestBody;
                                        if (PatchProxy.isSupport(new Object[0], this, f56590a, false, 60437, new Class[0], Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[0], this, f56590a, false, 60437, new Class[0], Void.TYPE);
                                            return;
                                        }
                                        try {
                                            String str = MusicRecommendActivity.this.f56581d;
                                            b.a aVar = MusicRecommendActivity.this.g;
                                            if (PatchProxy.isSupport(new Object[]{str, aVar}, null, MusicApi.f56294a, true, 59988, new Class[]{String.class, b.a.class}, Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[]{str, aVar}, null, MusicApi.f56294a, true, 59988, new Class[]{String.class, b.a.class}, Void.TYPE);
                                            } else {
                                                if (PatchProxy.isSupport(new Object[]{str, "https://aweme.snssdk.com/aweme/v1/upload/file/", aVar}, null, com.ss.android.ugc.aweme.music.b.f56301a, true, 59788, new Class[]{String.class, String.class, b.a.class}, Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[]{str, "https://aweme.snssdk.com/aweme/v1/upload/file/", aVar}, null, com.ss.android.ugc.aweme.music.b.f56301a, true, 59788, new Class[]{String.class, String.class, b.a.class}, Void.TYPE);
                                                } else {
                                                    MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
                                                    File file = new File(str);
                                                    if (file.exists()) {
                                                        if (file.length() != 0) {
                                                            String name = file.getName();
                                                            MediaType mediaType = MultipartBody.FORM;
                                                            if (PatchProxy.isSupport(new Object[]{mediaType, file, aVar}, null, com.ss.android.ugc.aweme.music.b.f56301a, true, 59789, new Class[]{MediaType.class, File.class, b.a.class}, RequestBody.class)) {
                                                                requestBody = (RequestBody) PatchProxy.accessDispatch(new Object[]{mediaType, file, aVar}, null, com.ss.android.ugc.aweme.music.b.f56301a, true, 59789, new Class[]{MediaType.class, File.class, b.a.class}, RequestBody.class);
                                                            } else {
                                                                requestBody = new RequestBody(mediaType, file, aVar) {

                                                                    /* renamed from: a */
                                                                    public static ChangeQuickRedirect f56309a;

                                                                    /* renamed from: b */
                                                                    final /* synthetic */ MediaType f56310b;

                                                                    /* renamed from: c */
                                                                    final /* synthetic */ File f56311c;

                                                                    /* renamed from: d */
                                                                    final /* synthetic */ a f56312d;

                                                                    public final okhttp3.MediaType contentType(
/*
Method generation error in method: com.ss.android.ugc.aweme.music.b.2.contentType():okhttp3.MediaType, dex: classes5.dex
                                                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.music.b.2.contentType():okhttp3.MediaType, class status: UNLOADED
                                                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                                    
*/

                                                                    public final long contentLength(
/*
Method generation error in method: com.ss.android.ugc.aweme.music.b.2.contentLength():long, dex: classes5.dex
                                                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.music.b.2.contentLength():long, class status: UNLOADED
                                                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                                    
*/

                                                                    /* Code decompiled incorrectly, please refer to instructions dump. */
                                                                    public final void writeTo(
/*
Method generation error in method: com.ss.android.ugc.aweme.music.b.2.writeTo(okio.BufferedSink):void, dex: classes5.dex
                                                                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.music.b.2.writeTo(okio.BufferedSink):void, class status: UNLOADED
                                                                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                    	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                                    
*/
                                                                };
                                                            }
                                                            type.addFormDataPart("file", name, requestBody);
                                                            type.addFormDataPart("file_type", "mpeg");
                                                            MultipartBody build = type.build();
                                                            HttpUrl.Builder newBuilder = HttpUrl.parse("https://aweme.snssdk.com/aweme/v1/upload/file/").newBuilder();
                                                            HashMap hashMap = new HashMap();
                                                            NetUtil.putCommonParams(hashMap, true);
                                                            for (Map.Entry entry : hashMap.entrySet()) {
                                                                newBuilder.addQueryParameter((String) entry.getKey(), (String) entry.getValue());
                                                            }
                                                            Call newCall = com.ss.android.ugc.aweme.music.b.f56303c.newCall(new Request.Builder().url(newBuilder.build()).post(build).build());
                                                            com.ss.android.ugc.aweme.music.b.f56304d = newCall;
                                                            newCall.enqueue(new Callback(aVar, str, file) {

                                                                /* renamed from: a */
                                                                public static ChangeQuickRedirect f56305a;

                                                                /* renamed from: b */
                                                                final /* synthetic */ a f56306b;

                                                                /* renamed from: c */
                                                                final /* synthetic */ String f56307c;

                                                                /* renamed from: d */
                                                                final /* synthetic */ File f56308d;

                                                                public final void onFailure(
/*
Method generation error in method: com.ss.android.ugc.aweme.music.b.1.onFailure(okhttp3.Call, java.io.IOException):void, dex: classes5.dex
                                                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.music.b.1.onFailure(okhttp3.Call, java.io.IOException):void, class status: UNLOADED
                                                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                                
*/

                                                                public final void onResponse(
/*
Method generation error in method: com.ss.android.ugc.aweme.music.b.1.onResponse(okhttp3.Call, okhttp3.Response):void, dex: classes5.dex
                                                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ss.android.ugc.aweme.music.b.1.onResponse(okhttp3.Call, okhttp3.Response):void, class status: UNLOADED
                                                                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                                                                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                                                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                                                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                                                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                                                                	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                                                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                                                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                                                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                                                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                                                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                                                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                                                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                                                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                                                                
*/
                                                            });
                                                            return;
                                                        }
                                                    }
                                                    aVar.a(str, new Exception(), file.length());
                                                }
                                            }
                                        } catch (Exception unused) {
                                        }
                                    }
                                });
                            }
                        } else {
                            MusicRecommendActivity.this.a("");
                        }
                    }
                }
            });
            this.llClickForUpload.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56586a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56586a, false, 60435, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56586a, false, 60435, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    com.ss.android.ugc.aweme.music.util.d.a((Activity) MusicRecommendActivity.this, 1);
                    r.onEvent(MobClick.obtain().setEventName("hand_in").setLabelName("recommend_music"));
                }
            });
            this.editSongName.addTextChangedListener(new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56588a;

                public final void afterTextChanged(Editable editable) {
                }

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56588a, false, 60436, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56588a, false, 60436, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    MusicRecommendActivity.this.editSongName.setSelection(charSequence.length());
                    MusicRecommendActivity musicRecommendActivity = MusicRecommendActivity.this;
                    EditText editText = MusicRecommendActivity.this.editSongName;
                    if (PatchProxy.isSupport(new Object[]{editText, 50}, musicRecommendActivity, MusicRecommendActivity.f56578a, false, 60422, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE)) {
                        MusicRecommendActivity musicRecommendActivity2 = musicRecommendActivity;
                        PatchProxy.accessDispatch(new Object[]{editText, 50}, musicRecommendActivity2, MusicRecommendActivity.f56578a, false, 60422, new Class[]{EditText.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    Editable text = editText.getText();
                    if (text.length() > 50) {
                        a.b((Context) musicRecommendActivity, musicRecommendActivity.getString(C0906R.string.bau, new Object[]{"50"})).a();
                        int selectionEnd = Selection.getSelectionEnd(text);
                        editText.setText(text.toString().substring(0, 50));
                        Editable text2 = editText.getText();
                        if (selectionEnd > text2.length()) {
                            selectionEnd = text2.length();
                        }
                        Selection.setSelection(text2, selectionEnd);
                    }
                }
            });
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicRecommendActivity", "onCreate", false);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f56578a, false, 60428, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f56578a, false, 60428, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1 && i2 == 1) {
            this.i = intent2.getStringExtra("local_music_name");
            this.f56581d = intent2.getStringExtra("local_music_path");
            this.editSongName.setText(this.i);
            this.txtClickUploadTv.setText(this.i);
            this.ivClickUpload.setImageResource(2130839345);
            this.mTitleBar.getEndText().setTextColor(Color.parseColor("#fe2c55"));
        }
    }
}
