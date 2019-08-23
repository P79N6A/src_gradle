package com.ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.aweme.common.widget.datepicker.NumberPicker;
import com.ss.android.ugc.aweme.friends.ui.RecommendFriendActivity;
import com.ss.android.ugc.aweme.login.n;
import com.ss.android.ugc.aweme.mobile.a.b;
import com.ss.android.ugc.aweme.mobile.a.c;
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

public class EditProfileActivityV2 extends AmeSSActivity implements WeakHandler.IHandler, NumberPicker.b, l, r {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56040a = null;
    private static final String o = "EditProfileActivityV2";

    /* renamed from: b  reason: collision with root package name */
    NumberPicker f56041b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f56042c;

    /* renamed from: d  reason: collision with root package name */
    public AlertDialog f56043d;

    /* renamed from: e  reason: collision with root package name */
    s f56044e;

    /* renamed from: f  reason: collision with root package name */
    int f56045f;
    a g;
    ad h;
    boolean i;
    public WeakHandler j;
    BottomSheetDialog k;
    GregorianCalendar l;
    Dialog m;
    @BindView(2131493169)
    RemoteImageView mAvatar;
    @BindView(2131494277)
    Button mBtnEnterAweme;
    @BindView(2131498133)
    TextView mSetAvatarText;
    @BindView(2131498404)
    EditText mUsernameEdit;
    String n;
    private c p = new c("profile");
    private boolean q;
    @BindView(2131498261)
    TextView txtBirthday;
    @BindView(2131497514)
    TextView txtExtra;
    @BindView(2131498274)
    TextView txtGender;

    public final void a(boolean z) {
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59683, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56040a, false, 59684, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56040a, false, 59684, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f56040a, false, 59672, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f56040a, false, 59672, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid() && this.g != null) {
            this.g.c();
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                com.ss.android.common.lib.a.a(this, "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(this, exc, C0906R.string.bv);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f56040a, false, 59673, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f56040a, false, 59673, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.i = true;
        Uri parse = Uri.parse("file://" + str);
        Fresco.getImagePipeline().evictFromCache(parse);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0906R.dimen.ft);
        com.ss.android.ugc.aweme.base.c.a(this.mAvatar, parse.toString(), dimensionPixelOffset, dimensionPixelOffset);
        this.mSetAvatarText.setText(C0906R.string.jh);
        a();
    }

    public final void a(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f56040a, false, 59675, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f56040a, false, 59675, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.h != null) {
            dismissProgressDialog();
            if (this.g != null) {
                this.g.c();
                if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                    com.ss.android.common.lib.a.a(this, "profile_image_setting", "review_failure");
                }
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(this, exc, C0906R.string.bsd);
        }
    }

    public final void a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f56040a, false, 59676, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f56040a, false, 59676, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            dismissProgressDialog();
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), str2).a();
                if (z) {
                    if (d.a().getCurUser().isNeedRecommend()) {
                        b.a.a((Activity) this).a(RecommendFriendActivity.class).a();
                    }
                    finish();
                }
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59669, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59669, new Class[0], Void.TYPE);
            return;
        }
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.mUsernameEdit.getWindowToken(), 0);
    }

    @OnClick({2131493169, 2131498133})
    public void editAvatar() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59653, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59653, new Class[0], Void.TYPE);
        } else if (!d.a().hasUpdated()) {
            d();
        } else {
            this.g.a(0);
        }
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59663, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59663, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59665, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59665, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    @OnClick({2131498274})
    public void selectGender() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59656, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59656, new Class[0], Void.TYPE);
        } else if (isViewValid()) {
            c();
            this.k.show();
        }
    }

    public void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59651, new Class[0], Void.TYPE);
            return;
        }
        StatusBarUtils.setTransparent(this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59667, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59667, new Class[0], Void.TYPE);
            return;
        }
        boolean z = !TextUtils.isEmpty(this.mUsernameEdit.getText().toString().trim());
        boolean z2 = !TextUtils.equals(this.txtGender.getText().toString(), getString(C0906R.string.aiq));
        boolean z3 = !this.txtBirthday.getText().equals(getString(C0906R.string.n9));
        if (this.i || z || z2 || z3) {
            this.mBtnEnterAweme.setEnabled(true);
        } else {
            this.mBtnEnterAweme.setEnabled(false);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59668, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59668, new Class[0], Void.TYPE);
            return;
        }
        this.p.a(this, "finish_no_name");
        this.p.a(this, "default_name");
        if (d.a().getCurUser().isNeedRecommend()) {
            b.a.a((Activity) this).a(RecommendFriendActivity.class).a();
        }
        finish();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59670, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59670, new Class[0], Void.TYPE);
        } else if (isActive()) {
            if (this.f56043d == null) {
                AlertDialog.Builder a2 = com.ss.android.a.a.a(this);
                a2.setTitle((int) C0906R.string.b74).setNegativeButton((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56054a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f56054a, false, 59693, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f56054a, false, 59693, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        EditProfileActivityV2.this.f56043d.dismiss();
                    }
                }).setPositiveButton((int) C0906R.string.a17, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f56052a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f56052a, false, 59692, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f56052a, false, 59692, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        EditProfileActivityV2.this.showProgressDialog(EditProfileActivityV2.this.getString(C0906R.string.b73));
                        d.a().queryUser(EditProfileActivityV2.this.j);
                        EditProfileActivityV2.this.f56043d.dismiss();
                    }
                });
                this.f56043d = a2.create();
            }
            this.f56043d.show();
        }
    }

    public void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59682, new Class[0], Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{message2}, this, f56040a, false, 59680, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f56040a, false, 59680, new Class[]{Message.class}, Void.TYPE);
        } else if (!(message2.obj instanceof Exception)) {
            if (message2.obj instanceof User) {
                d.a().setCurUser((User) message2.obj);
            }
            if (isViewValid()) {
                dismissProgressDialog();
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f56040a, false, 59677, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle2}, this, f56040a, false, 59677, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        bundle2.putBoolean("avatarset", this.q);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f56040a, false, 59657, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f56040a, false, 59657, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        c();
        return super.onTouchEvent(motionEvent);
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f56040a, false, 59671, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f56040a, false, 59671, new Class[]{AvatarUri.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.g.c();
            if (avatarUri == null || this.g == null) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this, (int) C0906R.string.bv).a();
                return;
            }
            this.f56044e.h = avatarUri.uri;
            this.h.a(this.f56044e.a());
        }
    }

    @OnClick({2131498261})
    public void editBirthday(View view) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f56040a, false, 59654, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56040a, false, 59654, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            c();
            User curUser = d.a().getCurUser();
            if (curUser != null) {
                if (this.l == null) {
                    this.l = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                }
                if (TextUtils.isEmpty(curUser.getBirthday())) {
                    j2 = -1;
                } else {
                    j2 = com.ss.android.ugc.aweme.profile.r.a(curUser.getBirthday());
                }
                if (j2 != -1) {
                    this.l.setTimeInMillis(j2 * 1000);
                } else if (!TextUtils.isEmpty(this.n)) {
                    this.l.setTimeInMillis(com.ss.android.ugc.aweme.profile.r.a(this.n) * 1000);
                } else {
                    this.l.setTimeInMillis(946656000000L);
                }
                if (this.m == null) {
                    this.m = new AppCompatDialog(this, C0906R.style.et);
                    this.m.setContentView(C0906R.layout.in);
                    SwitchCompat switchCompat = (SwitchCompat) this.m.findViewById(C0906R.id.cy6);
                    View findViewById = this.m.findViewById(C0906R.id.y0);
                    DatePicker datePicker = (DatePicker) this.m.findViewById(C0906R.id.a7m);
                    switchCompat.setOnCheckedChangeListener(new b(datePicker));
                    findViewById.setOnClickListener(new c(this, datePicker, switchCompat));
                    datePicker.setStartYear(1900);
                    datePicker.setUpperBoundDate(Calendar.getInstance());
                    this.m.setOnShowListener(new d(this, switchCompat, datePicker));
                    Window window = this.m.getWindow();
                    if (window != null) {
                        window.setGravity(80);
                    }
                }
                this.m.show();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f56040a, false, 59649, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f56040a, false, 59649, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.b7);
        if (bundle != null) {
            this.q = bundle.getBoolean("avatarset", false);
        }
        if (PatchProxy.isSupport(new Object[0], this, f56040a, false, 59652, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56040a, false, 59652, new Class[0], Void.TYPE);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                View findViewById = findViewById(C0906R.id.cv4);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = StatusBarUtils.getStatusBarHeight(this);
                findViewById.setLayoutParams(layoutParams);
            }
            this.j = new WeakHandler(Looper.getMainLooper(), this);
            this.f56044e = new s();
            this.mBtnEnterAweme.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56046a;

                public final void onClick(View view) {
                    boolean z = true;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56046a, false, 59689, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56046a, false, 59689, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    EditProfileActivityV2 editProfileActivityV2 = EditProfileActivityV2.this;
                    if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59650, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59650, new Class[0], Void.TYPE);
                        return;
                    }
                    if (d.a().hasUpdated()) {
                        if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59666, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59666, new Class[0], Void.TYPE);
                        } else {
                            editProfileActivityV2.c();
                            if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59660, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59660, new Class[0], Void.TYPE);
                            } else if (!NetworkUtils.isNetworkAvailable(editProfileActivityV2)) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) editProfileActivityV2, (int) C0906R.string.bgf).a();
                            } else {
                                editProfileActivityV2.showProgressDialog(editProfileActivityV2.getString(C0906R.string.bc0));
                                if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59661, new Class[0], Boolean.TYPE)) {
                                    ((Boolean) PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59661, new Class[0], Boolean.TYPE)).booleanValue();
                                } else {
                                    String obj = editProfileActivityV2.mUsernameEdit.getText().toString();
                                    if (TextUtils.isEmpty(obj)) {
                                        editProfileActivityV2.dismissProgressDialog();
                                    } else if (!obj.equals(d.a().getCurUser().getNickname())) {
                                        editProfileActivityV2.f56044e.f61672b = obj;
                                    } else {
                                        editProfileActivityV2.f56044e.f61672b = "";
                                    }
                                }
                                if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59679, new Class[0], Boolean.TYPE)) {
                                    ((Boolean) PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59679, new Class[0], Boolean.TYPE)).booleanValue();
                                } else if (editProfileActivityV2.txtGender != null) {
                                    String charSequence = editProfileActivityV2.txtGender.getText().toString();
                                    if (PatchProxy.isSupport(new Object[]{charSequence}, editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59678, new Class[]{String.class}, Boolean.TYPE)) {
                                        EditProfileActivityV2 editProfileActivityV22 = editProfileActivityV2;
                                        boolean booleanValue = ((Boolean) PatchProxy.accessDispatch(new Object[]{charSequence}, editProfileActivityV22, EditProfileActivityV2.f56040a, false, 59678, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                                    } else if (!charSequence.equals("") && !charSequence.equals(editProfileActivityV2.getString(C0906R.string.aip))) {
                                        if (charSequence.equals(editProfileActivityV2.getString(C0906R.string.bfc))) {
                                            editProfileActivityV2.f56044e.t = 1;
                                        } else {
                                            editProfileActivityV2.f56044e.t = 0;
                                            if (charSequence.equals(editProfileActivityV2.getString(C0906R.string.b9u))) {
                                                editProfileActivityV2.f56044e.f61675e = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                                            } else if (charSequence.equals(editProfileActivityV2.getString(C0906R.string.aek))) {
                                                editProfileActivityV2.f56044e.f61675e = PushConstants.PUSH_TYPE_UPLOAD_LOG;
                                            } else {
                                                editProfileActivityV2.f56044e.f61675e = "";
                                            }
                                        }
                                    }
                                }
                                if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59659, new Class[0], Boolean.TYPE)) {
                                    ((Boolean) PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59659, new Class[0], Boolean.TYPE)).booleanValue();
                                } else {
                                    User curUser = d.a().getCurUser();
                                    if (!TextUtils.equals(editProfileActivityV2.n, curUser.getBirthday()) || editProfileActivityV2.f56045f != curUser.getBirthdayHideLevel()) {
                                        editProfileActivityV2.f56044e.f61673c = editProfileActivityV2.n;
                                        editProfileActivityV2.f56044e.f61674d = editProfileActivityV2.f56045f;
                                    }
                                }
                                if (PatchProxy.isSupport(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59662, new Class[0], Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], editProfileActivityV2, EditProfileActivityV2.f56040a, false, 59662, new Class[0], Boolean.TYPE)).booleanValue();
                                } else if (editProfileActivityV2.g != null && editProfileActivityV2.i) {
                                    editProfileActivityV2.g.b();
                                    z = false;
                                }
                                editProfileActivityV2.dismissProgressDialog();
                                if (z) {
                                    editProfileActivityV2.h.a(editProfileActivityV2.f56044e.a());
                                }
                                com.ss.android.ugc.aweme.common.r.a("finish_fill_in_info", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", com.ss.android.ugc.aweme.account.c.b().getLoginMobEnterFrom()).a("enter_method", com.ss.android.ugc.aweme.account.c.b().getLoginMobEnterMethod()).f34114b);
                                bg.a(new com.ss.android.ugc.aweme.profile.a.d());
                            }
                        }
                    } else {
                        editProfileActivityV2.d();
                    }
                }
            });
            if (this.q && d.a().hasUpdated()) {
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0906R.dimen.ft);
                com.ss.android.ugc.aweme.base.c.a(this.mAvatar, d.a().getCurUser().getAvatarMedium(), dimensionPixelOffset, dimensionPixelOffset);
            }
            this.h = new ad();
            this.h.h = this;
            if (!d.a().hasUpdated()) {
                d.a().checkIn();
                d.a().queryUser(this.j);
                showProgressDialog(getString(C0906R.string.b73));
            }
            this.g = new a();
            this.g.f61562c = this;
            this.g.a((Activity) this, (Fragment) null);
            this.txtExtra.setText(getString(C0906R.string.c_a));
            this.txtExtra.setVisibility(0);
            this.txtExtra.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56048a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f56048a, false, 59690, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f56048a, false, 59690, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    EditProfileActivityV2.this.c();
                    com.ss.android.ugc.aweme.common.r.a("skip_fill_in_info", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", com.ss.android.ugc.aweme.account.c.b().getLoginMobEnterFrom()).a("enter_method", com.ss.android.ugc.aweme.account.c.b().getLoginMobEnterMethod()).f34114b);
                    EditProfileActivityV2.this.b();
                }
            });
            this.mUsernameEdit.addTextChangedListener(new TextWatcher() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56050a;

                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (PatchProxy.isSupport(new Object[]{editable}, this, f56050a, false, 59691, new Class[]{Editable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{editable}, this, f56050a, false, 59691, new Class[]{Editable.class}, Void.TYPE);
                        return;
                    }
                    EditProfileActivityV2.this.a();
                }
            });
            this.mBtnEnterAweme.setOnTouchListener(new com.ss.android.ugc.aweme.h.b(1.2f, 100, null));
            a();
            showImeOnce(this.mUsernameEdit);
            this.f56042c = (ViewGroup) LayoutInflater.from(this).inflate(C0906R.layout.j4, null, false);
            this.f56041b = (NumberPicker) this.f56042c.getChildAt(0);
            this.f56041b.a(getResources().getStringArray(C0906R.array.m));
            this.f56041b.a((NumberPicker.b) this);
            this.k = new BottomSheetDialog(this);
            this.k.setContentView((View) this.f56042c);
            this.k.setOnShowListener(new a(this));
        }
        com.ss.android.ugc.aweme.common.r.a("first_login_page", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", com.ss.android.ugc.aweme.account.c.b().getLoginMobEnterFrom()).a("enter_method", com.ss.android.ugc.aweme.account.c.b().getLoginMobEnterMethod()).f34114b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.mobile.EditProfileActivityV2", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    public void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f56040a, false, 59655, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f56040a, false, 59655, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.txtGender != null) {
            this.txtGender.setTextColor(getResources().getColor(C0906R.color.zt));
            this.txtGender.setText(charSequence);
        }
    }

    public final void a(User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f56040a, false, 59674, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f56040a, false, 59674, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.i = true;
        if (isViewValid()) {
            dismissProgressDialog();
            if (i2 == 112) {
                if (d.a().getCurUser().isNeedRecommend()) {
                    b.a.a((Activity) this).a(RecommendFriendActivity.class).a();
                }
                finish();
            } else if (i2 == 0) {
                this.p.a(this, "register_finish");
                setResult(-1);
                finish();
            } else if (i2 == 4) {
                if (this.g != null) {
                    this.g.c();
                }
                this.q = true;
                com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.bw).a();
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(C0906R.dimen.ft);
                com.ss.android.ugc.aweme.base.c.a(this.mAvatar, d.a().getCurUser().getAvatarMedium(), dimensionPixelOffset, dimensionPixelOffset);
                this.mSetAvatarText.setText(C0906R.string.jh);
                a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.a((Context) this, (int) C0906R.string.bu).a();
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f56040a, false, 59664, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f56040a, false, 59664, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (this.g != null) {
            int i4 = i2;
            int i5 = i3;
            if (this.g.a(i2, i3, intent2)) {
                return;
            }
        } else {
            int i6 = i2;
            int i7 = i3;
        }
        super.onActivityResult(i2, i3, intent);
    }

    public final void a(NumberPicker numberPicker, int i2, int i3) {
        NumberPicker numberPicker2 = numberPicker;
        if (PatchProxy.isSupport(new Object[]{numberPicker2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56040a, false, 59681, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{numberPicker2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f56040a, false, 59681, new Class[]{NumberPicker.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a((CharSequence) numberPicker2.i(i3));
    }
}
