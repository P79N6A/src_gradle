package com.ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.g.a;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.e;
import com.ss.android.sdk.app.d;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.bn;
import com.ss.android.ugc.aweme.utils.eb;
import com.ss.android.ugc.aweme.utils.ej;
import com.ss.android.ugc.aweme.utils.m;
import com.ss.android.ugc.aweme.video.b;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;

public class SubmitFeedbackActivity extends AmeBaseActivity implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3219a;
    private View A;
    private TextView B;
    private BaseAppData C;
    private WeakReference<FeedbackThread2> D;
    private ColorFilter E;
    private boolean F = true;
    private boolean G = false;

    /* renamed from: b  reason: collision with root package name */
    public EditText f3220b;

    /* renamed from: c  reason: collision with root package name */
    EditText f3221c;

    /* renamed from: d  reason: collision with root package name */
    public String f3222d;

    /* renamed from: e  reason: collision with root package name */
    public WeakHandler f3223e = new WeakHandler(this);

    /* renamed from: f  reason: collision with root package name */
    public InputMethodManager f3224f;
    public String g;
    public String u;
    public String v;
    boolean w = false;
    public String x;
    String y;
    private ImageView z;

    public final int a() {
        return C0906R.layout.adm;
    }

    public final int f() {
        return C0906R.color.a67;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3219a, false, 43843, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3219a, false, 43843, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43844, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43844, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f3219a, false, 43845, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f3219a, false, 43845, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final int e() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43827, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43827, new Class[0], Integer.TYPE)).intValue();
        }
        this.F = getResources().getBoolean(C0906R.bool.h);
        if (this.F) {
            return 0;
        }
        return 2;
    }

    public void onPostResume() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43832, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43832, new Class[0], Void.TYPE);
            return;
        }
        super.onPostResume();
        this.f3221c.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47103a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f47103a, false, 43848, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f47103a, false, 43848, new Class[0], Void.TYPE);
                    return;
                }
                if (SubmitFeedbackActivity.this.f3220b.requestFocus() && SubmitFeedbackActivity.this.f3224f != null) {
                    SubmitFeedbackActivity.this.f3224f.showSoftInput(SubmitFeedbackActivity.this.f3220b, 1);
                }
            }
        }, 200);
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43828, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43828, new Class[0], Void.TYPE);
            return;
        }
        if (!a.a()) {
            eb.a(this, getResources().getColor(C0906R.color.yx));
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43839, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43839, new Class[0], Void.TYPE);
        } else if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = ToolUtils.getLaunchIntentForPackage(this, getPackageName());
            }
            if (intent != null) {
                finish();
                startActivity(intent);
                return;
            }
            setResult(0);
            finish();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43829, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43829, new Class[0], Void.TYPE);
            return;
        }
        super.g();
        if (this.F) {
            Resources resources = getResources();
            int a2 = d.a(2130838669, this.k);
            int a3 = d.a(2130837961, this.k);
            int a4 = d.a(2130837960, this.k);
            int a5 = d.a(C0906R.color.mj, this.k);
            int a6 = d.a(C0906R.color.mk, this.k);
            int a7 = d.a(C0906R.color.f4496me, this.k);
            this.z.setColorFilter(null);
            if (StringUtils.isEmpty(this.f3222d)) {
                this.z.setImageResource(a2);
            } else if (this.k) {
                this.z.setColorFilter(this.E);
            }
            this.f3220b.setTextColor(resources.getColor(a5));
            this.f3221c.setTextColor(resources.getColor(a5));
            this.f3220b.setHintTextColor(resources.getColor(a6));
            this.f3221c.setHintTextColor(resources.getColor(a6));
            this.B.setTextColor(resources.getColor(a7));
            UIUtils.setViewBackgroundWithPadding(this.A, a3);
            UIUtils.setViewBackgroundWithPadding((View) this.f3221c, a4);
        }
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43840, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43840, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        if (this.f3221c != null) {
            this.C.c(this.f3221c.getText().toString());
        }
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43838, new Class[0], Void.TYPE);
        } else if (this.D != null) {
            FeedbackThread2 feedbackThread2 = (FeedbackThread2) this.D.get();
            if (feedbackThread2 != null) {
                if (PatchProxy.isSupport(new Object[0], feedbackThread2, FeedbackThread2.f47087a, false, 43797, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], feedbackThread2, FeedbackThread2.f47087a, false, 43797, new Class[0], Void.TYPE);
                } else {
                    feedbackThread2.f47092c = true;
                    if (feedbackThread2.f47091b != null) {
                        for (int i = 0; i < feedbackThread2.f47091b.length; i++) {
                            if (feedbackThread2.f47091b[i] != null) {
                                try {
                                    feedbackThread2.f47091b[i].a();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                    }
                }
            }
            this.D.clear();
            this.D = null;
        }
        this.w = false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43826, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43826, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        Intent intent = getIntent();
        if (intent != null) {
            this.x = intent.getStringExtra("feedback_id");
            this.y = intent.getStringExtra("enter_from");
            this.f3222d = Uri.decode(intent.getStringExtra("img_url"));
        }
        if (this.G) {
            this.y = "rating_popup";
        }
        this.C = BaseAppData.a();
        this.E = BaseAppData.i();
        this.f3224f = (InputMethodManager) getSystemService("input_method");
        File a2 = b.a("feedback");
        if (a2 != null) {
            this.g = a2.getPath();
        } else {
            this.g = "";
        }
        this.v = "camera.data";
        this.u = "upload.data";
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43830, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43830, new Class[0], Void.TYPE);
            return;
        }
        this.q.setText(C0906R.string.clm);
        this.p.setText(C0906R.string.b4d);
        this.p.setVisibility(0);
        this.p.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47099a;

            public final void onClick(View view) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5 = false;
                if (PatchProxy.isSupport(new Object[]{view}, this, f47099a, false, 43846, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f47099a, false, 43846, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                if (PatchProxy.isSupport(new Object[0], submitFeedbackActivity, SubmitFeedbackActivity.f3219a, false, 43836, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], submitFeedbackActivity, SubmitFeedbackActivity.f3219a, false, 43836, new Class[0], Void.TYPE);
                } else if (!submitFeedbackActivity.w) {
                    if (!NetworkUtils.isNetworkAvailable(submitFeedbackActivity)) {
                        UIUtils.displayToastWithIcon((Context) submitFeedbackActivity, 2130838336, (int) C0906R.string.cae);
                    } else {
                        String obj = submitFeedbackActivity.f3220b.getText().toString();
                        String obj2 = submitFeedbackActivity.f3221c.getText().toString();
                        if (StringUtils.isEmpty(obj) || obj.length() < 2) {
                            UIUtils.displayToastWithIcon((Context) submitFeedbackActivity, 2130838336, (int) C0906R.string.b1d);
                            submitFeedbackActivity.f3220b.requestFocus();
                        } else {
                            submitFeedbackActivity.w = true;
                            if (!a.a()) {
                                if (PatchProxy.isSupport(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88318, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                                    z5 = ((Boolean) PatchProxy.accessDispatch(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88318, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                                } else if (!TextUtils.isEmpty(obj)) {
                                    if (PatchProxy.isSupport(new Object[0], null, m.f75909a, true, 87900, new Class[0], Boolean.TYPE)) {
                                        z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, m.f75909a, true, 87900, new Class[0], Boolean.TYPE)).booleanValue();
                                    } else {
                                        z = TextUtils.equals(m.a(), "aea615ab910015038f73c47e45d21466");
                                    }
                                    if (z) {
                                        if (PatchProxy.isSupport(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88319, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                                            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88319, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                                        } else if (obj.contains("QQ") || obj.contains("qq") || obj.contains("Qq") || obj.contains("qQ")) {
                                            z2 = ej.b(submitFeedbackActivity, "com.tencent.mobileqq");
                                        } else {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            if (PatchProxy.isSupport(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88321, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                                                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88321, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                                            } else if (obj.contains("微博")) {
                                                z3 = ej.b(submitFeedbackActivity, "com.sina.weibo");
                                            } else {
                                                z3 = true;
                                            }
                                            if (z3) {
                                                if (PatchProxy.isSupport(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88320, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
                                                    z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{submitFeedbackActivity, obj}, null, bn.f75622a, true, 88320, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
                                                } else if (obj.contains("微信")) {
                                                    z4 = ej.b(submitFeedbackActivity, "com.tencent.mm");
                                                } else {
                                                    z4 = true;
                                                }
                                                if (z4) {
                                                    z5 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (!z5) {
                                    UIUtils.displayToastWithIcon((Context) submitFeedbackActivity, 2130838576, (int) C0906R.string.cn3);
                                }
                            }
                            r.a("click_send_feedback", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", submitFeedbackActivity.y).a("faq_id", submitFeedbackActivity.x).a("uid", com.ss.android.ugc.aweme.account.d.a().getCurUserId()).f34114b);
                            if (!StringUtils.isEmpty(submitFeedbackActivity.f3222d)) {
                                if (!(submitFeedbackActivity.g + "/" + submitFeedbackActivity.u).equals(submitFeedbackActivity.f3222d)) {
                                    new ThreadPlus(obj, obj2) {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f47111a;

                                        /* renamed from: b  reason: collision with root package name */
                                        final /* synthetic */ String f47112b;

                                        /* renamed from: c  reason: collision with root package name */
                                        final /* synthetic */ String f47113c;

                                        public final void run() {
                                            if (PatchProxy.isSupport(new Object[0], this, f47111a, false, 43854, new Class[0], Void.TYPE)) {
                                                PatchProxy.accessDispatch(new Object[0], this, f47111a, false, 43854, new Class[0], Void.TYPE);
                                                return;
                                            }
                                            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(SubmitFeedbackActivity.this.f3222d, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                                            if (bitmapFromSD != null) {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                bitmapFromSD.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                                                BitmapUtils.saveImageData(byteArrayOutputStream.toByteArray(), SubmitFeedbackActivity.this.g, SubmitFeedbackActivity.this.u);
                                                SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                                                submitFeedbackActivity.f3222d = SubmitFeedbackActivity.this.g + "/" + SubmitFeedbackActivity.this.u;
                                            }
                                            n nVar = new n();
                                            nVar.f47199a = this.f47112b;
                                            nVar.f47200b = this.f47113c;
                                            nVar.f47204f = SubmitFeedbackActivity.this.f3222d;
                                            nVar.i = com.ss.android.ugc.aweme.account.login.loginlog.a.a().b();
                                            nVar.j = com.ss.android.ugc.aweme.account.d.a().getLastUid();
                                            User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                                            if (curUser != null) {
                                                nVar.k = curUser.getSignature();
                                            }
                                            if (!TextUtils.isEmpty(SubmitFeedbackActivity.this.x)) {
                                                nVar.g = SubmitFeedbackActivity.this.x;
                                            }
                                            Message obtainMessage = SubmitFeedbackActivity.this.f3223e.obtainMessage(10007);
                                            obtainMessage.obj = nVar;
                                            SubmitFeedbackActivity.this.f3223e.sendMessage(obtainMessage);
                                        }

                                        {
                                            this.f47112b = r2;
                                            this.f47113c = r3;
                                        }
                                    }.start();
                                }
                            }
                            n nVar = new n();
                            nVar.f47199a = obj;
                            nVar.f47200b = obj2;
                            nVar.f47204f = submitFeedbackActivity.f3222d;
                            nVar.i = com.ss.android.ugc.aweme.account.login.loginlog.a.a().b();
                            nVar.j = com.ss.android.ugc.aweme.account.d.a().getLastUid();
                            if (!TextUtils.isEmpty(submitFeedbackActivity.x)) {
                                nVar.g = submitFeedbackActivity.x;
                            }
                            User curUser = com.ss.android.ugc.aweme.account.d.a().getCurUser();
                            if (curUser != null) {
                                nVar.k = curUser.getSignature();
                            }
                            submitFeedbackActivity.a(nVar);
                        }
                    }
                }
                com.ss.android.ugc.aweme.b.a.a.f34456b.a();
            }
        });
        this.z = (ImageView) findViewById(C0906R.id.ar_);
        this.z.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47101a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f47101a, false, 43847, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f47101a, false, 43847, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                if (PatchProxy.isSupport(new Object[0], submitFeedbackActivity, SubmitFeedbackActivity.f3219a, false, 43833, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], submitFeedbackActivity, SubmitFeedbackActivity.f3219a, false, 43833, new Class[0], Void.TYPE);
                    return;
                }
                String[] stringArray = submitFeedbackActivity.getResources().getStringArray(C0906R.array.f4407b);
                AlertDialog.Builder a2 = com.ss.android.a.a.a(submitFeedbackActivity);
                a2.setItems((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f47105a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f47105a, false, 43849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f47105a, false, 43849, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        } else if (TextUtils.isEmpty(SubmitFeedbackActivity.this.g)) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) SubmitFeedbackActivity.this, (int) C0906R.string.c1x).a();
                        } else {
                            SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                            if (PatchProxy.isSupport(new Object[0], submitFeedbackActivity, SubmitFeedbackActivity.f3219a, false, 43834, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], submitFeedbackActivity, SubmitFeedbackActivity.f3219a, false, 43834, new Class[0], Void.TYPE);
                            } else if (submitFeedbackActivity.f3224f != null) {
                                submitFeedbackActivity.f3224f.hideSoftInputFromWindow(submitFeedbackActivity.getWindow().getDecorView().getWindowToken(), 0);
                            }
                            switch (i) {
                                case 0:
                                    com.ss.android.ugc.aweme.ac.b.a(SubmitFeedbackActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new b.C0400b() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f47107a;

                                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
                                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object[]} */
                                        /* JADX WARNING: Multi-variable type inference failed */
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final void a(java.lang.String[] r20, int[] r21) {
                                            /*
                                                r19 = this;
                                                r7 = r19
                                                r8 = r20
                                                r9 = 2
                                                java.lang.Object[] r0 = new java.lang.Object[r9]
                                                r10 = 0
                                                r0[r10] = r8
                                                r11 = 1
                                                r0[r11] = r21
                                                com.meituan.robust.ChangeQuickRedirect r2 = f47107a
                                                java.lang.Class[] r5 = new java.lang.Class[r9]
                                                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                                r5[r10] = r1
                                                java.lang.Class<int[]> r1 = int[].class
                                                r5[r11] = r1
                                                java.lang.Class r6 = java.lang.Void.TYPE
                                                r3 = 0
                                                r4 = 43850(0xab4a, float:6.1447E-41)
                                                r1 = r19
                                                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                                                if (r0 == 0) goto L_0x0045
                                                java.lang.Object[] r0 = new java.lang.Object[r9]
                                                r0[r10] = r8
                                                r0[r11] = r21
                                                com.meituan.robust.ChangeQuickRedirect r2 = f47107a
                                                r3 = 0
                                                r4 = 43850(0xab4a, float:6.1447E-41)
                                                java.lang.Class[] r5 = new java.lang.Class[r9]
                                                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                                r5[r10] = r1
                                                java.lang.Class<int[]> r1 = int[].class
                                                r5[r11] = r1
                                                java.lang.Class r6 = java.lang.Void.TYPE
                                                r1 = r19
                                                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                                                return
                                            L_0x0045:
                                                int r0 = r8.length
                                                if (r0 <= 0) goto L_0x0057
                                                r0 = r21[r10]
                                                if (r0 != 0) goto L_0x0057
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                r1 = 0
                                                r2 = 1003(0x3eb, float:1.406E-42)
                                                com.ss.android.newmedia.e.a((android.app.Activity) r0, (android.support.v4.app.Fragment) r1, (int) r2)
                                                return
                                            L_0x0057:
                                                boolean r0 = com.ss.android.g.a.a()
                                                if (r0 == 0) goto L_0x006b
                                                r0 = 2131561491(0x7f0d0c13, float:1.8748384E38)
                                                r1 = 2131561490(0x7f0d0c12, float:1.8748382E38)
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r2 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r2 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                com.ss.android.ugc.aweme.utils.permission.b.a(r0, r1, r2)
                                                return
                                            L_0x006b:
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                r1 = 2131561640(0x7f0d0ca8, float:1.8748686E38)
                                                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
                                                java.lang.Object[] r12 = new java.lang.Object[r11]
                                                r12[r10] = r0
                                                r13 = 0
                                                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feedback.q.f47211a
                                                r15 = 1
                                                r16 = 43851(0xab4b, float:6.1448E-41)
                                                java.lang.Class[] r1 = new java.lang.Class[r11]
                                                java.lang.Class<android.widget.Toast> r2 = android.widget.Toast.class
                                                r1[r10] = r2
                                                java.lang.Class r18 = java.lang.Void.TYPE
                                                r17 = r1
                                                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                                                if (r1 == 0) goto L_0x00aa
                                                java.lang.Object[] r12 = new java.lang.Object[r11]
                                                r12[r10] = r0
                                                r13 = 0
                                                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feedback.q.f47211a
                                                r15 = 1
                                                r16 = 43851(0xab4b, float:6.1448E-41)
                                                java.lang.Class[] r0 = new java.lang.Class[r11]
                                                java.lang.Class<android.widget.Toast> r1 = android.widget.Toast.class
                                                r0[r10] = r1
                                                java.lang.Class r18 = java.lang.Void.TYPE
                                                r17 = r0
                                                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                                                return
                                            L_0x00aa:
                                                int r1 = android.os.Build.VERSION.SDK_INT
                                                r2 = 25
                                                if (r1 != r2) goto L_0x00b6
                                                r1 = r0
                                                android.widget.Toast r1 = (android.widget.Toast) r1
                                                com.ss.android.ugc.aweme.utils.eq.a(r1)
                                            L_0x00b6:
                                                r0.show()
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.AnonymousClass1.a(java.lang.String[], int[]):void");
                                        }
                                    });
                                    return;
                                case 1:
                                    com.ss.android.ugc.aweme.ac.b.a(SubmitFeedbackActivity.this, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new b.C0400b() {

                                        /* renamed from: a  reason: collision with root package name */
                                        public static ChangeQuickRedirect f47109a;

                                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
                                        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
                                        /* JADX WARNING: Multi-variable type inference failed */
                                        /* Code decompiled incorrectly, please refer to instructions dump. */
                                        public final void a(java.lang.String[] r20, int[] r21) {
                                            /*
                                                r19 = this;
                                                r7 = r19
                                                r8 = r20
                                                r9 = 2
                                                java.lang.Object[] r0 = new java.lang.Object[r9]
                                                r10 = 0
                                                r0[r10] = r8
                                                r11 = 1
                                                r0[r11] = r21
                                                com.meituan.robust.ChangeQuickRedirect r2 = f47109a
                                                java.lang.Class[] r5 = new java.lang.Class[r9]
                                                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                                r5[r10] = r1
                                                java.lang.Class<int[]> r1 = int[].class
                                                r5[r11] = r1
                                                java.lang.Class r6 = java.lang.Void.TYPE
                                                r3 = 0
                                                r4 = 43852(0xab4c, float:6.145E-41)
                                                r1 = r19
                                                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                                                if (r0 == 0) goto L_0x0045
                                                java.lang.Object[] r0 = new java.lang.Object[r9]
                                                r0[r10] = r8
                                                r0[r11] = r21
                                                com.meituan.robust.ChangeQuickRedirect r2 = f47109a
                                                r3 = 0
                                                r4 = 43852(0xab4c, float:6.145E-41)
                                                java.lang.Class[] r5 = new java.lang.Class[r9]
                                                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                                                r5[r10] = r1
                                                java.lang.Class<int[]> r1 = int[].class
                                                r5[r11] = r1
                                                java.lang.Class r6 = java.lang.Void.TYPE
                                                r1 = r19
                                                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                                                return
                                            L_0x0045:
                                                int r0 = r8.length
                                                if (r0 <= r11) goto L_0x0067
                                                r0 = r21[r10]
                                                if (r0 != 0) goto L_0x0067
                                                r0 = r21[r11]
                                                if (r0 != 0) goto L_0x0067
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                r1 = 0
                                                r2 = 1002(0x3ea, float:1.404E-42)
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r3 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r3 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                java.lang.String r3 = r3.g
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r4 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r4 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                java.lang.String r4 = r4.v
                                                com.ss.android.newmedia.e.a((android.app.Activity) r0, (android.support.v4.app.Fragment) r1, (int) r2, (java.lang.String) r3, (java.lang.String) r4)
                                                return
                                            L_0x0067:
                                                boolean r0 = com.ss.android.g.a.a()
                                                if (r0 == 0) goto L_0x007b
                                                r0 = 2131561491(0x7f0d0c13, float:1.8748384E38)
                                                r1 = 2131561490(0x7f0d0c12, float:1.8748382E38)
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r2 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r2 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                com.ss.android.ugc.aweme.utils.permission.b.a(r0, r1, r2)
                                                return
                                            L_0x007b:
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity$4 r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.this
                                                com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity r0 = com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.this
                                                r1 = 2131561640(0x7f0d0ca8, float:1.8748686E38)
                                                android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r10)
                                                java.lang.Object[] r12 = new java.lang.Object[r11]
                                                r12[r10] = r0
                                                r13 = 0
                                                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feedback.r.f47212a
                                                r15 = 1
                                                r16 = 43853(0xab4d, float:6.1451E-41)
                                                java.lang.Class[] r1 = new java.lang.Class[r11]
                                                java.lang.Class<android.widget.Toast> r2 = android.widget.Toast.class
                                                r1[r10] = r2
                                                java.lang.Class r18 = java.lang.Void.TYPE
                                                r17 = r1
                                                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                                                if (r1 == 0) goto L_0x00ba
                                                java.lang.Object[] r12 = new java.lang.Object[r11]
                                                r12[r10] = r0
                                                r13 = 0
                                                com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.feedback.r.f47212a
                                                r15 = 1
                                                r16 = 43853(0xab4d, float:6.1451E-41)
                                                java.lang.Class[] r0 = new java.lang.Class[r11]
                                                java.lang.Class<android.widget.Toast> r1 = android.widget.Toast.class
                                                r0[r10] = r1
                                                java.lang.Class r18 = java.lang.Void.TYPE
                                                r17 = r0
                                                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                                                return
                                            L_0x00ba:
                                                int r1 = android.os.Build.VERSION.SDK_INT
                                                r2 = 25
                                                if (r1 != r2) goto L_0x00c6
                                                r1 = r0
                                                android.widget.Toast r1 = (android.widget.Toast) r1
                                                com.ss.android.ugc.aweme.utils.eq.a(r1)
                                            L_0x00c6:
                                                r0.show()
                                                return
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity.AnonymousClass4.AnonymousClass2.a(java.lang.String[], int[]):void");
                                        }
                                    });
                                    break;
                            }
                        }
                    }
                });
                a2.show();
            }
        });
        this.f3220b = (EditText) findViewById(C0906R.id.yp);
        this.f3221c = (EditText) findViewById(C0906R.id.y7);
        this.A = findViewById(C0906R.id.z1);
        this.B = (TextView) findViewById(C0906R.id.y8);
        this.f3221c.setText(this.C.B);
        if (PatchProxy.isSupport(new Object[0], this, f3219a, false, 43831, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3219a, false, 43831, new Class[0], Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.f3222d)) {
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(this.f3222d, 50, 50);
            if (bitmapFromSD != null) {
                this.z.setImageBitmap(bitmapFromSD);
                this.z.setScaleType(ImageView.ScaleType.FIT_XY);
                if (com.ss.android.a.a.a()) {
                    this.z.setColorFilter(this.E);
                }
            } else {
                this.f3222d = "";
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(n nVar) {
        if (PatchProxy.isSupport(new Object[]{nVar}, this, f3219a, false, 43837, new Class[]{n.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{nVar}, this, f3219a, false, 43837, new Class[]{n.class}, Void.TYPE);
            return;
        }
        FeedbackThread2 feedbackThread2 = new FeedbackThread2(this.f3223e, (Context) this, nVar);
        feedbackThread2.start();
        if (this.D != null) {
            this.D.clear();
            this.D = null;
        }
        this.D = new WeakReference<>(feedbackThread2);
    }

    @Subscribe(b = true)
    public void onDouyinPraiseFeedbackEvent(com.ss.android.ugc.aweme.ug.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3219a, false, 43842, new Class[]{com.ss.android.ugc.aweme.ug.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3219a, false, 43842, new Class[]{com.ss.android.ugc.aweme.ug.b.class}, Void.TYPE);
            return;
        }
        if (!a.a()) {
            this.G = true;
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f3219a, false, 43841, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f3219a, false, 43841, new Class[]{Message.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (message.what == 10007) {
                if (message.obj instanceof n) {
                    a((n) message.obj);
                }
                return;
            }
            this.w = false;
            if (message.what == 10) {
                r.a("feedback_succeed", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("faq_id", this.x).a("is_app", 1).f34114b);
                UIUtils.displayToastWithIcon((Context) this, 2130838576, (int) C0906R.string.cn3);
                if (TextUtils.isEmpty(this.x)) {
                    setResult(-1);
                    finish();
                    return;
                }
                Intent intent = new Intent(this, FeedbackActivity.class);
                intent.putExtra("feedback_id", this.x);
                startActivity(intent);
                finish();
                return;
            }
            UIUtils.displayToast((Context) this, 2130838576, getString(e.a(message.arg1)));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3219a, false, 43835, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f3219a, false, 43835, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i3 == 1003) {
            if (i2 != 0 && intent != null) {
                String a2 = e.a((Context) this, intent.getData());
                if (StringUtils.isEmpty(a2)) {
                    UIUtils.displayToastWithIcon((Context) this, 2130838336, (int) C0906R.string.bmk);
                } else if (!new File(a2).exists()) {
                    UIUtils.displayToastWithIcon((Context) this, 2130838336, (int) C0906R.string.bmk);
                } else {
                    this.f3222d = a2;
                    Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(this.f3222d, 50, 50);
                    if (bitmapFromSD != null) {
                        this.z.setImageBitmap(bitmapFromSD);
                        this.z.setScaleType(ImageView.ScaleType.FIT_XY);
                        if (com.ss.android.a.a.a()) {
                            this.z.setColorFilter(this.E);
                        }
                    } else {
                        this.f3222d = "";
                    }
                }
            }
        } else if (i3 != 1002) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != 0) {
            this.f3222d = this.g + "/" + this.v;
            Bitmap rotateBitmap = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(this.f3222d, 50, 50), BitmapUtils.readPictureDegree(this.f3222d));
            if (rotateBitmap != null) {
                this.z.setImageBitmap(rotateBitmap);
                this.z.setScaleType(ImageView.ScaleType.FIT_XY);
                if (com.ss.android.a.a.a()) {
                    this.z.setColorFilter(this.E);
                }
            } else {
                this.f3222d = "";
            }
        }
    }
}
