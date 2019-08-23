package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.captcha.c.b;
import com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import com.ss.android.ugc.aweme.profile.a.c;
import com.ss.android.ugc.aweme.profile.d.m;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.SchoolViewModel;
import com.ss.android.ugc.aweme.profile.model.SelectedLocationViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.a;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.l;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.presenter.t;
import com.ss.android.ugc.aweme.profile.s;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cc;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class ProfileEditFragment extends AbsFragment implements WeakHandler.IHandler, l, r, t, ProfileEditActivity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62137a = null;
    private static final String m = "ProfileEditFragment";

    /* renamed from: b  reason: collision with root package name */
    View f62138b;

    /* renamed from: c  reason: collision with root package name */
    GregorianCalendar f62139c;

    /* renamed from: d  reason: collision with root package name */
    Dialog f62140d;

    /* renamed from: e  reason: collision with root package name */
    public ad f62141e;
    @BindView(2131494709)
    CommonItemView editId;

    /* renamed from: f  reason: collision with root package name */
    boolean f62142f;
    public s g;
    SchoolViewModel h;
    SelectedLocationViewModel i;
    User j;
    boolean k;
    String l;
    @BindView(2131495659)
    CommonItemView locationLayout;
    @Nullable
    @BindView(2131493180)
    CommonItemView mAvatarDecoName;
    @Nullable
    @BindView(2131493183)
    View mAvatarDecoSettingItemContainer;
    @BindView(2131493293)
    CommonItemView mBirthdayText;
    @BindView(2131497340)
    DmtStatusView mDmtStatusView;
    @BindView(2131494432)
    CommonItemView mGenderText;
    @BindView(2131494586)
    AnimatedImageView mHeaderImage;
    @BindView(2131495893)
    CommonItemView mNickname;
    @BindView(2131497157)
    CommonItemView mSignature;
    @BindView(2131498617)
    CommonItemView mWeiboLayout;
    private boolean n;
    private boolean o;
    private boolean p;
    private a q;
    private boolean r;
    private TextTitleBar s;
    @BindView(2131496906)
    CommonItemView schoolInput;

    public final void a(boolean z) {
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f62137a, false, 68713, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f62137a, false, 68713, new Class[]{Exception.class}, Void.TYPE);
        } else if (isViewValid() && this.q != null) {
            this.q.c();
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                com.ss.android.common.lib.a.a(getActivity(), "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bv);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f62137a, false, 68714, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f62137a, false, 68714, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.r = true;
        this.l = str;
        e();
    }

    public final void a(final Exception exc, final int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f62137a, false, 68717, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f62137a, false, 68717, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (isViewValid() && this.f62141e != null && this.q != null) {
            if (b.a(exc)) {
                b.a(getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62148a;

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f62148a, false, 68744, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f62148a, false, 68744, new Class[0], Void.TYPE);
                            return;
                        }
                        ProfileEditFragment.this.b(exc, i2);
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f62148a, false, 68743, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f62148a, false, 68743, new Class[0], Void.TYPE);
                            return;
                        }
                        ProfileEditFragment.this.d();
                        if (!(ProfileEditFragment.this.g == null || ProfileEditFragment.this.f62141e == null)) {
                            ProfileEditFragment.this.mDmtStatusView.d();
                            ProfileEditFragment.this.f62141e.a(ProfileEditFragment.this.g.a());
                        }
                    }
                });
            } else {
                b(exc, i2);
            }
            this.mDmtStatusView.setVisibility(8);
            this.q.c();
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62137a, false, 68719, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f62137a, false, 68719, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            this.q.c();
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.b();
            }
            if (!TextUtils.isEmpty(str)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) k.a(), str).a();
                if (z && getActivity() != null) {
                    getActivity().finish();
                }
            }
        }
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68696, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68696, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.q == null || !this.r) {
            return true;
        } else {
            this.q.b();
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68732, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.sec.a.a("profile_edit");
        d();
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68698, new Class[0], Void.TYPE);
            return;
        }
        this.mDmtStatusView.setVisibility(8);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68729, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68676, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68676, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        bg.a(new c(1));
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68684, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68684, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.q != null) {
            this.q.c();
        }
        if (this.q != null) {
            this.q.f61562c = null;
        }
        if (this.f62141e != null) {
            this.f62141e.h = null;
        }
        this.mDmtStatusView.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68692, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68692, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String birthday = this.j.getBirthday();
        int birthdayHideLevel = this.j.getBirthdayHideLevel();
        User curUser = d.a().getCurUser();
        if (birthdayHideLevel != curUser.getBirthdayHideLevel() || !TextUtils.equals(birthday, curUser.getBirthday())) {
            if (birthday.split("-").length == 3) {
                try {
                    this.mDmtStatusView.d();
                    ad adVar = this.f62141e;
                    if (PatchProxy.isSupport(new Object[]{birthday}, this, f62137a, false, 68690, new Class[]{String.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{birthday}, this, f62137a, false, 68690, new Class[]{String.class}, String.class);
                    } else if (TextUtils.isEmpty(birthday)) {
                        str = "";
                    } else {
                        String[] split = birthday.split("-");
                        if (split.length == 3) {
                            str = String.format(Locale.CHINA, "%04d-%s-%s", new Object[]{Integer.valueOf(Integer.parseInt(split[0])), split[1], split[2]});
                        } else {
                            throw new NumberFormatException("Date format as year-month-day");
                        }
                    }
                    Object[] objArr = {str, Integer.valueOf(birthdayHideLevel)};
                    ChangeQuickRedirect changeQuickRedirect = ad.f61573a;
                    ad adVar2 = adVar;
                    if (PatchProxy.isSupport(objArr, adVar, changeQuickRedirect, false, 67634, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
                        ad adVar3 = adVar2;
                        PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(birthdayHideLevel)}, adVar3, ad.f61573a, false, 67634, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
                    } else if (!adVar2.f61575c) {
                        adVar2.f61575c = true;
                        d.a().updateBirthday(adVar2.g, str, birthdayHideLevel);
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return false;
        }
        this.g.f61673c = "";
        return true;
    }

    public final void d() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68710, new Class[0], Void.TYPE);
        } else if (!NetworkUtils.isNetworkAvailable(getActivity())) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bgf).a();
        } else {
            this.mDmtStatusView.d();
            boolean e2 = e();
            boolean z7 = !e2;
            if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68693, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68693, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                String str = (String) this.h.schoolName.getValue();
                if (!TextUtils.equals(str, d.a().getCurUser().getSchoolName())) {
                    this.n = true;
                    this.g.j = str;
                    z = false;
                } else {
                    this.n = false;
                    this.g.j = "";
                    z = true;
                }
            }
            if (!z || !e2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68695, new Class[0], Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68695, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                String str2 = (String) this.h.enrollYear.getValue();
                if (!TextUtils.equals(str2, d.a().getCurUser().getEnrollYear())) {
                    this.p = true;
                    this.g.n = str2;
                    z3 = false;
                } else {
                    this.p = false;
                    this.g.n = "";
                    z3 = true;
                }
            }
            if (!z3 || !z2) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68694, new Class[0], Boolean.TYPE)) {
                z5 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68694, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                String str3 = (String) this.h.collegeName.getValue();
                if (!TextUtils.equals(str3, d.a().getCurUser().getCollegeName())) {
                    this.o = true;
                    this.g.m = str3;
                    z5 = false;
                } else {
                    this.o = false;
                    this.g.m = "";
                    z5 = true;
                }
            }
            if (z5 && z4) {
                z6 = true;
            }
            if (z6) {
                getActivity().finish();
                this.mDmtStatusView.setVisibility(8);
                this.q.c();
            } else if (!z7) {
                this.f62141e.a(this.g.a());
            }
            bg.a(new com.ss.android.ugc.aweme.profile.a.d());
        }
    }

    private void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f62137a, false, 68678, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f62137a, false, 68678, new Class[]{String.class}, Void.TYPE);
        } else if (TextUtils.isEmpty(str)) {
            this.mSignature.setRightText(getString(C0906R.string.oe));
        } else {
            this.mSignature.setRightText(str);
        }
    }

    private String d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62137a, false, 68715, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f62137a, false, 68715, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str2.charAt(i2) != 10) {
                    sb.append(str2.charAt(i2));
                }
            }
            return sb.toString();
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68708, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68708, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            d.a().queryUser(new WeakHandler(Looper.getMainLooper(), this));
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f62137a, false, 68688, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f62137a, false, 68688, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!m.a(str)) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.bgz).a();
            this.mDmtStatusView.setVisibility(8);
            return false;
        } else if (!str.equals(d.a().getCurUser().getNickname())) {
            this.f62141e.a(str);
            this.mDmtStatusView.d();
            this.j.setNickname(str);
            return false;
        } else {
            this.g.f61672b = "";
            return true;
        }
    }

    @OnClick({2131493180})
    public void changeDecoClicked(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68682, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68682, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            com.ss.android.ugc.aweme.commercialize.model.b.a(getActivity(), d.a().getCurUser(), "personal_homepage");
        }
    }

    @OnClick({2131494432})
    public void editGender(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68701, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68701, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f62142f = true;
            final String[] stringArray = getResources().getStringArray(C0906R.array.m);
            com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(getActivity());
            aVar.a((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62145a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2 = i;
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62145a, false, 68742, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62145a, false, 68742, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (i2 < stringArray.length && i2 >= 0) {
                        ProfileEditFragment profileEditFragment = ProfileEditFragment.this;
                        String str = stringArray[i2];
                        if (PatchProxy.isSupport(new Object[]{str}, profileEditFragment, ProfileEditFragment.f62137a, false, 68687, new Class[]{String.class}, Boolean.TYPE)) {
                            ProfileEditFragment profileEditFragment2 = profileEditFragment;
                            ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, profileEditFragment2, ProfileEditFragment.f62137a, false, 68687, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                        } else if (!str.equals("") && !str.equals(profileEditFragment.getString(C0906R.string.aip))) {
                            if (str.equals(profileEditFragment.getString(C0906R.string.bfc))) {
                                profileEditFragment.f62141e.a(d.a().getCurUser().getGender(), 1);
                                profileEditFragment.mDmtStatusView.d();
                                profileEditFragment.j.setShowGenderStrategy(1);
                                profileEditFragment.j.setGender(d.a().getCurUser().getGender());
                            } else if (str.equals(profileEditFragment.getString(C0906R.string.b9u))) {
                                profileEditFragment.f62141e.a(1, 0);
                                profileEditFragment.mDmtStatusView.d();
                                profileEditFragment.j.setShowGenderStrategy(0);
                                profileEditFragment.j.setGender(1);
                            } else if (str.equals(profileEditFragment.getString(C0906R.string.aek))) {
                                profileEditFragment.f62141e.a(2, 0);
                                profileEditFragment.mDmtStatusView.d();
                                profileEditFragment.j.setShowGenderStrategy(0);
                                profileEditFragment.j.setGender(2);
                            }
                            profileEditFragment.g.f61675e = "";
                        }
                    }
                }
            });
            aVar.b();
        }
    }

    @OnClick({2131494586})
    public void editHeaderImage(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68699, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68699, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && isViewValid()) {
            this.f62142f = true;
            com.ss.android.ugc.aweme.common.r.a("replace_profile_info", (Map) new com.ss.android.ugc.aweme.app.d.d().a("enter_method", "click_head").f34114b);
            this.q.a(0, getActivity(), this.mHeaderImage, d.a().getCurUser());
        }
    }

    @OnClick({2131495659})
    public void editLocation(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68707, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68707, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ProfileEditLocationFragment a2 = ProfileEditLocationFragment.a("", getString(C0906R.string.c3o));
        a2.setUserVisibleHint(true);
        a2.h = new cl(this);
        a2.show(getActivity().getSupportFragmentManager(), "ProfileEditLocation");
    }

    @OnClick({2131497157})
    public void editSignature(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68702, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68702, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && isViewValid()) {
            this.f62142f = true;
            ProfileEditSignatureFragment a2 = ProfileEditSignatureFragment.a(this.j.getSignature());
            a2.setUserVisibleHint(true);
            a2.f62222e = new ck(this);
            a2.show(getActivity().getSupportFragmentManager(), "EditSignatureDialog");
        }
    }

    public void handleMsg(Message message) {
        Message message2 = message;
        if (PatchProxy.isSupport(new Object[]{message2}, this, f62137a, false, 68730, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message2}, this, f62137a, false, 68730, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (!(message2.obj instanceof Exception) && (message2.obj instanceof User)) {
            d.a().setCurUser((User) message2.obj);
        }
    }

    @OnClick({2131494709})
    public void onIdClick(View view) {
        boolean z;
        ProfileEditIdFragment profileEditIdFragment;
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68681, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68681, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && isViewValid()) {
            this.f62142f = true;
            if (Math.abs((int) ((new Date().getTime() - new Date(d.a().getCurUser().getHandleModified() * 1000).getTime()) / 86400000)) > 30) {
                z = true;
            } else {
                z = false;
            }
            String charSequence = this.editId.getTextRight().toString();
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), charSequence}, null, ProfileEditIdFragment.f62185c, true, 68757, new Class[]{Boolean.TYPE, String.class}, ProfileEditIdFragment.class)) {
                profileEditIdFragment = (ProfileEditIdFragment) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), charSequence}, null, ProfileEditIdFragment.f62185c, true, 68757, new Class[]{Boolean.TYPE, String.class}, ProfileEditIdFragment.class);
            } else {
                ProfileEditIdFragment profileEditIdFragment2 = new ProfileEditIdFragment();
                Bundle bundle = new Bundle();
                bundle.putString("douyin_id", charSequence);
                bundle.putBoolean("is_id_edited", z);
                profileEditIdFragment2.setArguments(bundle);
                profileEditIdFragment = profileEditIdFragment2;
            }
            profileEditIdFragment.setUserVisibleHint(true);
            profileEditIdFragment.f62188f = new cf(this);
            profileEditIdFragment.show(getActivity().getSupportFragmentManager(), "IdEditDialog");
        }
    }

    @OnClick({2131495893})
    public void onNicknameClick(View view) {
        ProfileEditNicknameFragment profileEditNicknameFragment;
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68679, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68679, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && isViewValid()) {
            this.f62142f = true;
            String charSequence = this.mNickname.getTextRight().toString();
            if (PatchProxy.isSupport(new Object[]{charSequence}, null, ProfileEditNicknameFragment.f62207c, true, 68792, new Class[]{String.class}, ProfileEditNicknameFragment.class)) {
                profileEditNicknameFragment = (ProfileEditNicknameFragment) PatchProxy.accessDispatch(new Object[]{charSequence}, null, ProfileEditNicknameFragment.f62207c, true, 68792, new Class[]{String.class}, ProfileEditNicknameFragment.class);
            } else {
                ProfileEditNicknameFragment profileEditNicknameFragment2 = new ProfileEditNicknameFragment();
                Bundle bundle = new Bundle();
                bundle.putString("old_nickname", charSequence);
                profileEditNicknameFragment2.setArguments(bundle);
                profileEditNicknameFragment = profileEditNicknameFragment2;
            }
            profileEditNicknameFragment.setUserVisibleHint(true);
            profileEditNicknameFragment.f62209e = new ce(this);
            profileEditNicknameFragment.show(getActivity().getSupportFragmentManager(), "EditNicknameDialog");
        }
    }

    @OnClick({2131493293})
    public void editBirthday(View view) {
        long j2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68700, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68700, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            this.f62142f = true;
            User curUser = d.a().getCurUser();
            if (curUser != null) {
                if (this.f62139c == null) {
                    this.f62139c = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                }
                this.f62139c = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                if (TextUtils.isEmpty(curUser.getBirthday())) {
                    j2 = -1;
                } else {
                    j2 = com.ss.android.ugc.aweme.profile.r.a(curUser.getBirthday());
                }
                if (j2 != -1) {
                    this.f62139c.setTimeInMillis(j2 * 1000);
                } else {
                    this.f62139c.setTimeInMillis(946656000000L);
                }
                if (this.f62140d == null) {
                    Context context = getContext();
                    if (context != null) {
                        this.f62140d = new AppCompatDialog(context, C0906R.style.et);
                        this.f62140d.setContentView(C0906R.layout.in);
                        DatePicker datePicker = (DatePicker) this.f62140d.findViewById(C0906R.id.a7m);
                        View findViewById = this.f62140d.findViewById(C0906R.id.y0);
                        SwitchCompat switchCompat = (SwitchCompat) this.f62140d.findViewById(C0906R.id.cy6);
                        switchCompat.setOnCheckedChangeListener(new ch(datePicker));
                        findViewById.setOnClickListener(new ci(this, datePicker, switchCompat));
                        datePicker.setStartYear(1900);
                        datePicker.setUpperBoundDate(Calendar.getInstance());
                        this.f62140d.setOnShowListener(new cj(this, curUser, switchCompat, datePicker));
                        Window window = this.f62140d.getWindow();
                        if (window != null) {
                            window.setGravity(80);
                        }
                    } else {
                        return;
                    }
                }
                this.f62140d.show();
            }
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        String str;
        String str2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62137a, false, 68675, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62137a, false, 68675, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f62137a, false, 68677, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62137a, false, 68677, new Class[0], Void.TYPE);
        } else {
            this.g = new s();
            this.j = new User();
            User curUser = d.a().getCurUser();
            if (curUser != null) {
                this.mNickname.setRightText(curUser.getNickname());
                CommonItemView commonItemView = this.editId;
                if (TextUtils.isEmpty(curUser.getUniqueId())) {
                    str = curUser.getShortId();
                } else {
                    str = curUser.getUniqueId();
                }
                commonItemView.setRightText(str);
                if (curUser.getShowGenderStrategy() == 0) {
                    if (curUser.getGender() == 1) {
                        this.mGenderText.setRightText(getString(C0906R.string.b9u));
                    } else if (curUser.getGender() == 2) {
                        this.mGenderText.setRightText(getString(C0906R.string.aek));
                    }
                } else if (curUser.getShowGenderStrategy() == 1) {
                    this.mGenderText.setRightText(getString(C0906R.string.bfc));
                }
                try {
                    this.mBirthdayText.setRightText(a(curUser.getBirthday(), curUser.getBirthdayHideLevel()));
                } catch (NumberFormatException unused) {
                }
                this.j.setSignature(curUser.getSignature());
                c(d(curUser.getSignature()));
                CommonItemView commonItemView2 = this.schoolInput;
                if (PatchProxy.isSupport(new Object[]{curUser}, this, f62137a, false, 68731, new Class[]{User.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{curUser}, this, f62137a, false, 68731, new Class[]{User.class}, String.class);
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(curUser.getSchoolName())) {
                        sb.append(curUser.getSchoolName());
                        if (!TextUtils.isEmpty(curUser.getCollegeName())) {
                            sb.append(curUser.getCollegeName());
                        }
                    }
                    str2 = sb.toString();
                }
                commonItemView2.setRightText(str2);
                a(curUser, true);
                this.mWeiboLayout.setVisibility(8);
                this.g.i = curUser.isBindedWeibo();
                com.ss.android.ugc.aweme.base.c.b(this.mHeaderImage, curUser.getAvatarMedium());
                this.f62142f = false;
                if (this.g.i) {
                    this.mWeiboLayout.setRightText(curUser.getWeiboNickname());
                }
                this.h.setSchoolName(curUser.getSchoolName());
                this.h.setCollegeName(curUser.getCollegeName());
                this.h.setEnrollYear(curUser.getEnrollYear());
                this.h.setDegree(curUser.getEducation());
                this.h.setShowRange(curUser.getSchoolInfoShowRange());
                if (this.mAvatarDecoName != null) {
                    if (com.ss.android.ugc.aweme.commercialize.model.b.a(curUser)) {
                        this.mAvatarDecoName.setRightText(com.ss.android.ugc.aweme.commercialize.model.b.b(curUser));
                    } else {
                        this.mAvatarDecoName.setRightText(getString(C0906R.string.jj));
                    }
                }
            }
        }
        if (getArguments() != null) {
            if (getArguments().getInt("jump_school_edit", 0) != 1) {
                z = false;
            }
            this.k = z;
            if (this.k) {
                onSchoolClick(null);
            }
        }
    }

    @OnClick({2131496906})
    public void onSchoolClick(View view) {
        ProfileSetSchoolFragment profileSetSchoolFragment;
        if (PatchProxy.isSupport(new Object[]{view}, this, f62137a, false, 68680, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62137a, false, 68680, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view) && isViewValid()) {
            this.f62142f = true;
            if (this.k) {
                com.ss.android.ugc.aweme.common.r.a("edit_school", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "banner").f34114b);
            } else {
                com.ss.android.ugc.aweme.common.r.a("edit_school", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "edit_profile_page").f34114b);
            }
            String str = (String) this.h.schoolName.getValue();
            String str2 = (String) this.h.collegeName.getValue();
            String str3 = (String) this.h.enrollYear.getValue();
            int intValue = ((Integer) this.h.degree.getValue()).intValue();
            int intValue2 = ((Integer) this.h.showRange.getValue()).intValue();
            boolean z = this.k;
            if (PatchProxy.isSupport(new Object[]{str, str2, str3, Integer.valueOf(intValue), Integer.valueOf(intValue2), Byte.valueOf(z ? (byte) 1 : 0)}, null, ProfileSetSchoolFragment.f62273c, true, 68886, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, ProfileSetSchoolFragment.class)) {
                Object[] objArr = {str, str2, str3, Integer.valueOf(intValue), Integer.valueOf(intValue2), Byte.valueOf(z)};
                Object[] objArr2 = objArr;
                profileSetSchoolFragment = (ProfileSetSchoolFragment) PatchProxy.accessDispatch(objArr2, null, ProfileSetSchoolFragment.f62273c, true, 68886, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, ProfileSetSchoolFragment.class);
            } else {
                ProfileSetSchoolFragment profileSetSchoolFragment2 = new ProfileSetSchoolFragment();
                Bundle bundle = new Bundle();
                bundle.putString("school_name", str);
                bundle.putString("college_name", str2);
                bundle.putString("enroll_year", str3);
                bundle.putInt("degree", intValue);
                bundle.putInt("show_range", intValue2);
                bundle.putBoolean("just_edit_school", z);
                profileSetSchoolFragment2.setArguments(bundle);
                profileSetSchoolFragment = profileSetSchoolFragment2;
            }
            profileSetSchoolFragment.setUserVisibleHint(true);
            profileSetSchoolFragment.show(getActivity().getSupportFragmentManager(), "SetSchoolDialog");
        }
    }

    public final void a(AvatarUri avatarUri) {
        if (PatchProxy.isSupport(new Object[]{avatarUri}, this, f62137a, false, 68712, new Class[]{AvatarUri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{avatarUri}, this, f62137a, false, 68712, new Class[]{AvatarUri.class}, Void.TYPE);
            return;
        }
        this.q.c();
        if (this.f62141e == null || avatarUri == null) {
            com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bv).a();
            return;
        }
        this.f62141e.c(avatarUri.uri);
        Uri parse = Uri.parse("file://" + this.l);
        Fresco.getImagePipeline().evictFromCache(parse);
        com.ss.android.ugc.aweme.base.c.a((RemoteImageView) this.mHeaderImage, parse.toString(), (int) UIUtils.dip2Px(getContext(), 84.0f), (int) UIUtils.dip2Px(getContext(), 84.0f));
    }

    private String a(String str, int i2) throws NumberFormatException {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f62137a, false, 68689, new Class[]{String.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f62137a, false, 68689, new Class[]{String.class, Integer.TYPE}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "";
        } else {
            if (i2 == 1) {
                return getString(C0906R.string.n7);
            }
            String[] split = str2.split("-");
            if (split.length == 3) {
                return String.format(Locale.CHINA, "%d-%02d-%02d", new Object[]{Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2]))});
            }
            throw new NumberFormatException("Date format as year-month-day");
        }
    }

    public final void b(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f62137a, false, 68718, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f62137a, false, 68718, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (4 == i2) {
            this.mDmtStatusView.setVisibility(8);
            this.q.c();
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 20022) {
                com.ss.android.common.lib.a.a(getActivity(), "profile_image_setting", "review_failure");
            }
        }
        if (i2 == 116 && (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
            com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc;
            cc.a(String.valueOf(aVar.getErrorCode()), aVar.getErrorMsg(), this.editId.getTextRight().toString(), getContext());
            c();
        }
        if (i2 != 116) {
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bsd);
        }
    }

    private void a(User user, boolean z) {
        if (PatchProxy.isSupport(new Object[]{user, (byte) 1}, this, f62137a, false, 68703, new Class[]{User.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, (byte) 1}, this, f62137a, false, 68703, new Class[]{User.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(user.getCountry())) {
            sb.append(user.getCountry());
        }
        if (!TextUtils.isEmpty(user.getProvince())) {
            sb.append("·");
            sb.append(user.getProvince());
            if (!TextUtils.isEmpty(user.getCityName()) && !user.getProvince().equalsIgnoreCase(user.getCityName())) {
                sb.append("·");
                sb.append(user.getCityName());
            }
        } else if (!TextUtils.isEmpty(user.getCityName())) {
            sb.append("·");
            sb.append(user.getCityName());
        }
        if (!TextUtils.isEmpty(user.getDistrict())) {
            sb.append("·");
            sb.append(user.getDistrict());
        }
        if (!TextUtils.isEmpty(sb)) {
            this.locationLayout.setRightText(sb.toString());
        }
    }

    public final void a(User user, int i2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f62137a, false, 68716, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f62137a, false, 68716, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = true;
        if (i2 == 7) {
            a(this.j, true);
        } else if (i2 != 116) {
            switch (i2) {
                case 0:
                    this.mNickname.setRightText(this.j.getNickname());
                    break;
                case 1:
                    CommonItemView commonItemView = this.mGenderText;
                    User user2 = this.j;
                    if (PatchProxy.isSupport(new Object[]{user2}, this, f62137a, false, 68691, new Class[]{User.class}, String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[]{user2}, this, f62137a, false, 68691, new Class[]{User.class}, String.class);
                    } else {
                        String[] stringArray = getResources().getStringArray(C0906R.array.m);
                        if (user2.getShowGenderStrategy() == 1) {
                            str = stringArray[2];
                        } else if (user2.getGender() == 1) {
                            str = stringArray[0];
                        } else if (user2.getGender() == 2) {
                            str = stringArray[1];
                        } else {
                            str = "";
                        }
                    }
                    commonItemView.setRightText(str);
                    break;
                case 2:
                    c(d(this.j.getSignature()));
                    break;
                case 3:
                    this.mBirthdayText.setRightText(a(this.j.getBirthday(), this.j.getBirthdayHideLevel()));
                    break;
                case 4:
                    com.ss.android.ugc.aweme.base.c.b(this.mHeaderImage, user.getAvatarMedium());
                    com.bytedance.ies.dmt.ui.d.a.a(GlobalContext.getContext(), (int) C0906R.string.bs9).a();
                    break;
            }
        } else {
            this.editId.setRightText(this.j.getUniqueId());
        }
        if (this.n) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
            } catch (JSONException unused) {
            }
            bg.a(new com.ss.android.ugc.aweme.web.jsbridge.t("userSchoolChange", jSONObject));
            this.n = false;
        }
        this.mDmtStatusView.setVisibility(8);
        this.q.c();
        bg.a(new com.ss.android.ugc.aweme.base.a.c());
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f62137a, false, 68720, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f62137a, false, 68720, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (!this.q.a(i2, i3, intent2)) {
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        boolean z;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62137a, false, 68674, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62137a, false, 68674, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.r3, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        this.f62138b = inflate.findViewById(C0906R.id.cv0);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62137a, false, 68683, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62137a, false, 68683, new Class[]{View.class}, Void.TYPE);
        } else {
            if (Build.VERSION.SDK_INT >= 19) {
                this.f62138b.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(getActivity());
            }
            this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
            this.s = (TextTitleBar) inflate.findViewById(C0906R.id.d3m);
            this.s.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62143a;

                public final void b(View view) {
                }

                public final void a(View view) {
                    View view2 = view;
                    if (PatchProxy.isSupport(new Object[]{view2}, this, f62143a, false, 68741, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view2}, this, f62143a, false, 68741, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ProfileEditFragment.this.a(view2);
                }
            });
            this.q = new a();
            this.q.f61562c = this;
            this.q.a((Activity) getActivity(), (Fragment) this);
            this.f62141e = new ad();
            this.f62141e.h = this;
            this.h = (SchoolViewModel) ViewModelProviders.of(getActivity()).get(SchoolViewModel.class);
            this.h.schoolName.observe(this, new cg(this));
            this.i = (SelectedLocationViewModel) ViewModelProviders.of(getActivity()).get(SelectedLocationViewModel.class);
            if (this.mAvatarDecoSettingItemContainer != null) {
                View view = this.mAvatarDecoSettingItemContainer;
                if (PatchProxy.isSupport(new Object[0], null, com.ss.android.ugc.aweme.commercialize.model.b.f39371a, true, 31877, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, com.ss.android.ugc.aweme.commercialize.model.b.f39371a, true, 31877, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    z = com.ss.android.ugc.aweme.commercialize.model.b.f39372b.a();
                }
                if (!z) {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
        return inflate;
    }
}
