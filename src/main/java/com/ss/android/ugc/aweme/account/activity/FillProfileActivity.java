package com.ss.android.ugc.aweme.account.activity;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.c;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity;
import com.ss.android.ugc.aweme.login.n;
import com.ss.android.ugc.aweme.mobile.a.b;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.a;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.s;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.TimeZone;

public class FillProfileActivity extends AmeSSActivity implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31608a;

    /* renamed from: b  reason: collision with root package name */
    NumberPicker f31609b;

    /* renamed from: c  reason: collision with root package name */
    public a f31610c;

    /* renamed from: d  reason: collision with root package name */
    public ad f31611d;

    /* renamed from: e  reason: collision with root package name */
    protected String f31612e;

    /* renamed from: f  reason: collision with root package name */
    protected String f31613f;
    AlertDialog g;
    Dialog h;
    BottomSheetDialog i;
    public s j;
    public User k;
    WeakHandler l;
    @BindView(2131493169)
    RemoteImageView mAvatar;
    @BindView(2131498261)
    TextView mBirthday;
    @BindView(2131494277)
    Button mBtnEnterAweme;
    @BindView(2131497537)
    DmtTextView mEndText;
    @BindView(2131498274)
    TextView mGender;
    @BindView(2131498133)
    TextView mSetAvatarText;
    @BindView(2131498404)
    EditText mUsernameEdit;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f31608a, false, 19558, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31608a, false, 19558, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.FillProfileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.FillProfileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f31608a, false, 19559, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f31608a, false, 19559, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.FillProfileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarBgColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f31608a, false, 19548, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ano);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f31608a, false, 19548, new Class[0], Integer.TYPE)).intValue();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f31608a, false, 19554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31608a, false, 19554, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f31608a, false, 19553, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31608a, false, 19553, new Class[0], Void.TYPE);
            return;
        }
        ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.ao4).fitsSystemWindows(true).statusBarDarkFont(true).init();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f31608a, false, 19556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31608a, false, 19556, new Class[0], Void.TYPE);
        } else if (isActive()) {
            if (this.g == null) {
                AlertDialog.Builder a2 = com.ss.android.a.a.a(this);
                a2.setTitle((int) C0906R.string.b74).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new f(this)).setPositiveButton((int) C0906R.string.a17, (DialogInterface.OnClickListener) new g(this));
                this.g = a2.create();
            }
            this.g.show();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f31608a, false, 19557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f31608a, false, 19557, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        if (getIntent().hasExtra("login_action_bundle")) {
            com.ss.android.ugc.aweme.app.accountsdk.a.a.a(getIntent().getBundleExtra("login_action_bundle"));
        }
        bg.a(new n(2));
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f31608a, false, 19550, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f31608a, false, 19550, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (!(message2.obj instanceof Exception)) {
            if (message2.obj instanceof User) {
                d.a().updateCurUser((User) message2.obj);
                this.k = d.a().getCurUser();
            }
            if (isViewValid()) {
                dismissProgressDialog();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f31608a, false, 19552, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f31608a, false, 19552, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(str, getString(C0906R.string.bfc))) {
            this.j.t = 1;
        } else {
            this.j.t = 0;
            if (TextUtils.equals(str, getString(C0906R.string.b9u))) {
                this.j.f61675e = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else if (TextUtils.equals(str, getString(C0906R.string.aek))) {
                this.j.f61675e = PushConstants.PUSH_TYPE_UPLOAD_LOG;
            }
        }
        a(this.j);
    }

    public final void a(s sVar) {
        if (PatchProxy.isSupport(new Object[]{sVar}, this, f31608a, false, 19555, new Class[]{s.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sVar}, this, f31608a, false, 19555, new Class[]{s.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.equals(this.mUsernameEdit.getText().toString(), sVar.f61672b)) {
            this.mUsernameEdit.setText(sVar.f61672b);
            Selection.setSelection(this.mUsernameEdit.getText(), this.mUsernameEdit.getText().toString().length());
        }
        if (!TextUtils.isEmpty(sVar.f61673c)) {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6j));
            if (sVar.f61673c.split("-").length == 3) {
                String str = r0[0] + "年" + r0[1] + "月" + r0[2] + "日";
                TextView textView = this.mBirthday;
                if (sVar.f61674d == 1) {
                    str = getString(C0906R.string.n7);
                }
                textView.setText(str);
            }
        } else {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6o));
            this.mBirthday.setText(C0906R.string.n9);
        }
        if (sVar.t == 1) {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6j));
            this.mGender.setText(C0906R.string.bfc);
        } else if (sVar.t != 0) {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6o));
            this.mGender.setText(C0906R.string.aiq);
        } else if (TextUtils.equals(sVar.f61675e, PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6j));
            this.mGender.setText(C0906R.string.b9u);
        } else if (TextUtils.equals(sVar.f61675e, PushConstants.PUSH_TYPE_UPLOAD_LOG)) {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6j));
            this.mGender.setText(C0906R.string.aek);
        } else {
            this.mBirthday.setTextColor(getResources().getColor(C0906R.color.a6o));
            this.mGender.setText(C0906R.string.aiq);
        }
        if (!TextUtils.isEmpty(sVar.h) || !TextUtils.isEmpty(sVar.f61672b) || !TextUtils.isEmpty(sVar.f61673c) || this.k.getShowGenderStrategy() != sVar.t || (this.k.getShowGenderStrategy() == sVar.t && !TextUtils.equals(String.valueOf(this.k.getGender()), sVar.f61675e))) {
            this.mBtnEnterAweme.setEnabled(true);
        } else {
            this.mBtnEnterAweme.setEnabled(false);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f31608a, false, 19547, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f31608a, false, 19547, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.FillProfileActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.be);
        this.f31612e = getIntent().getStringExtra("enter_from");
        this.f31613f = getIntent().getStringExtra("enter_method");
        this.k = d.a().getCurUser();
        this.l = new WeakHandler(Looper.getMainLooper(), this);
        this.j = new s();
        this.mUsernameEdit.addTextChangedListener(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31614a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f31614a, false, 19567, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f31614a, false, 19567, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                if (!TextUtils.equals(FillProfileActivity.this.j.f61672b, editable.toString())) {
                    FillProfileActivity.this.j.f61672b = editable.toString();
                    FillProfileActivity.this.a(FillProfileActivity.this.j);
                }
            }
        });
        this.f31611d = new ad();
        this.f31611d.h = new r() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f31616a;

            public final void a(boolean z) {
            }

            public final void a(User user, int i) {
                if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f31616a, false, 19568, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f31616a, false, 19568, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
                } else if (FillProfileActivity.this.isViewValid()) {
                    FillProfileActivity.this.dismissProgressDialog();
                    FillProfileActivity.this.k = d.a().getCurUser();
                    if (i == 112) {
                        if (d.a().getCurUser().isNeedRecommend()) {
                            b.a.a((Activity) FillProfileActivity.this).a(RecommendFriendActivity.class).a();
                        }
                        FillProfileActivity.this.finish();
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.a((Context) FillProfileActivity.this, (int) C0906R.string.bu).a();
                }
            }

            public final void a(Exception exc, int i) {
                if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f31616a, false, 19569, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f31616a, false, 19569, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
                } else if (FillProfileActivity.this.isViewValid() && FillProfileActivity.this.f31611d != null) {
                    FillProfileActivity.this.dismissProgressDialog();
                    if (i == 112) {
                        FillProfileActivity.this.a();
                        return;
                    }
                    if (FillProfileActivity.this.f31610c != null) {
                        FillProfileActivity.this.f31610c.c();
                        if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                            com.ss.android.common.lib.a.a(FillProfileActivity.this, "profile_image_setting", "review_failure");
                        }
                    }
                    com.ss.android.ugc.aweme.app.api.a.a.a(FillProfileActivity.this, exc, C0906R.string.bsd);
                }
            }

            public final void a(String str, boolean z) {
                if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f31616a, false, 19570, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f31616a, false, 19570, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                } else if (FillProfileActivity.this.isViewValid()) {
                    FillProfileActivity.this.dismissProgressDialog();
                    if (!TextUtils.isEmpty(str)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), str).a();
                        if (z) {
                            if (d.a().getCurUser().isNeedRecommend()) {
                                b.a.a((Activity) FillProfileActivity.this).a(RecommendFriendActivity.class).a();
                            }
                            FillProfileActivity.this.finish();
                        }
                    }
                }
            }
        };
        if (!d.a().hasUpdated()) {
            d.a().checkIn();
            d.a().queryUser(this.l);
            showProgressDialog(getString(C0906R.string.b73));
        }
        this.mEndText.setTextColor(getResources().getColor(C0906R.color.a6o));
        EditText editText = this.mUsernameEdit;
        if (PatchProxy.isSupport(new Object[]{this, editText}, null, KeyboardUtils.f35007a, true, 25237, new Class[]{LifecycleOwner.class, EditText.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this, editText}, null, KeyboardUtils.f35007a, true, 25237, new Class[]{LifecycleOwner.class, EditText.class}, Void.TYPE);
        } else {
            KeyboardUtils.f35008b.add(new KeyboardUtils.ClearCursorDecorator(this, editText));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.activity.FillProfileActivity", "onCreate", false);
    }

    @OnClick({2131493169, 2131498133, 2131498261, 2131498274, 2131494277, 2131497537})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f31608a, false, 19549, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f31608a, false, 19549, new Class[]{View.class}, Void.TYPE);
        } else if (view.getId() == C0906R.id.hk || view.getId() == C0906R.id.dip) {
            if (this.f31610c == null) {
                this.f31610c = new a();
                this.f31610c.f61562c = new l() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f31618a;

                    public final void a(String str) {
                        if (PatchProxy.isSupport(new Object[]{str}, this, f31618a, false, 19573, new Class[]{String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{str}, this, f31618a, false, 19573, new Class[]{String.class}, Void.TYPE);
                            return;
                        }
                        if (FillProfileActivity.this.f31610c != null) {
                            FillProfileActivity.this.f31610c.b();
                        }
                    }

                    public final void a(Exception exc) {
                        if (PatchProxy.isSupport(new Object[]{exc}, this, f31618a, false, 19572, new Class[]{Exception.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{exc}, this, f31618a, false, 19572, new Class[]{Exception.class}, Void.TYPE);
                        } else if (FillProfileActivity.this.isViewValid() && FillProfileActivity.this.f31610c != null) {
                            FillProfileActivity.this.f31610c.c();
                            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                                com.ss.android.common.lib.a.a(FillProfileActivity.this, "profile_image_setting", "review_failure");
                            }
                            com.ss.android.ugc.aweme.app.api.a.a.a(FillProfileActivity.this, exc, C0906R.string.bv);
                        }
                    }

                    public final void a(AvatarUri avatarUri) {
                        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f31618a, false, 19571, new Class[]{AvatarUri.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f31618a, false, 19571, new Class[]{AvatarUri.class}, Void.TYPE);
                        } else if (FillProfileActivity.this.isViewValid() && FillProfileActivity.this.f31610c != null) {
                            FillProfileActivity.this.f31610c.c();
                            if (avatarUri == null) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) FillProfileActivity.this, (int) C0906R.string.bv).a();
                                return;
                            }
                            FillProfileActivity.this.j.h = avatarUri.uri;
                            FillProfileActivity.this.a(FillProfileActivity.this.j);
                            if (avatarUri.urlList != null && avatarUri.urlList.size() > 0) {
                                com.ss.android.ugc.aweme.base.c.a(FillProfileActivity.this.mAvatar, avatarUri.urlList.get(avatarUri.urlList.size() - 1));
                            }
                        }
                    }
                };
                this.f31610c.a((Activity) this, (Fragment) null);
            }
            this.f31610c.a(0);
        } else if (view.getId() == C0906R.id.dmr) {
            KeyboardUtils.c(this.mUsernameEdit);
            if (this.h == null) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                long a2 = com.ss.android.ugc.aweme.profile.r.a(this.k.getBirthday());
                if (a2 != -1) {
                    gregorianCalendar.setTimeInMillis(a2 * 1000);
                } else if (!TextUtils.isEmpty(this.j.f61673c)) {
                    gregorianCalendar.setTimeInMillis(com.ss.android.ugc.aweme.profile.r.a(this.j.f61673c) * 1000);
                } else {
                    gregorianCalendar.setTimeInMillis(946656000000L);
                }
                this.h = new AppCompatDialog(this, C0906R.style.et);
                this.h.setContentView(C0906R.layout.in);
                DatePicker datePicker = (DatePicker) this.h.findViewById(C0906R.id.a7m);
                View findViewById = this.h.findViewById(C0906R.id.y0);
                SwitchCompat switchCompat = (SwitchCompat) this.h.findViewById(C0906R.id.cy6);
                switchCompat.setOnCheckedChangeListener(new a(datePicker));
                findViewById.setOnClickListener(new b(this, datePicker, switchCompat));
                datePicker.setStartYear(1900);
                datePicker.setUpperBoundDate(Calendar.getInstance());
                this.h.setOnShowListener(new c(this, switchCompat, datePicker, gregorianCalendar));
                Window window = this.h.getWindow();
                if (window != null) {
                    window.setGravity(80);
                }
            }
            this.h.show();
        } else if (view.getId() == C0906R.id.dn4) {
            KeyboardUtils.c(this.mUsernameEdit);
            if (this.i == null) {
                ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0906R.layout.j4, null, false);
                this.f31609b = (NumberPicker) viewGroup.findViewById(C0906R.id.bqu);
                this.f31609b.a(getResources().getStringArray(C0906R.array.m));
                this.f31609b.a((NumberPicker.b) new d(this));
                this.i = new BottomSheetDialog(this);
                this.i.setContentView((View) viewGroup);
                this.i.setOnShowListener(new e(this));
            }
            this.i.show();
        } else if (view.getId() != C0906R.id.aeg) {
            if (view.getId() == C0906R.id.d1m) {
                if (d.a().getCurUser().isNeedRecommend()) {
                    b.a.a((Activity) this).a(RecommendFriendActivity.class).a();
                }
                finish();
            }
        } else if (d.a().hasUpdated()) {
            KeyboardUtils.c(this.mUsernameEdit);
            if (!NetworkUtils.isNetworkAvailable(this)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bgf).a();
                return;
            }
            showProgressDialog(getString(C0906R.string.bc0));
            this.f31611d.a(this.j.a());
            com.ss.android.ugc.aweme.common.r.a("finish_fill_in_info", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", this.f31612e).a("enter_method", this.f31613f).f34114b);
        } else {
            a();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f31608a, false, 19551, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f31608a, false, 19551, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (this.f31610c != null) {
            int i4 = i2;
            int i5 = i3;
            if (this.f31610c.a(i2, i3, intent2)) {
                return;
            }
        } else {
            int i6 = i2;
            int i7 = i3;
        }
        super.onActivityResult(i2, i3, intent);
    }
}
