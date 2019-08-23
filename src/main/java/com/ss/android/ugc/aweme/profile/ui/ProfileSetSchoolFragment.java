package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.dmt.ui.widget.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.a.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.ui.YearPickerDialog;
import com.ss.android.ugc.aweme.profile.model.CollegeSearchModel;
import com.ss.android.ugc.aweme.profile.model.SchoolViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ad;
import com.ss.android.ugc.aweme.profile.presenter.r;
import com.ss.android.ugc.aweme.profile.ui.dm;
import com.ss.android.ugc.aweme.profile.ui.dq;
import com.ss.android.ugc.aweme.profile.ui.k;
import java.util.HashMap;
import java.util.List;

public class ProfileSetSchoolFragment extends ProfileDetailEditFragment implements CollegeSearchModel.SearchCollegeListener, r {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f62273c;

    /* renamed from: d  reason: collision with root package name */
    public String f62274d;

    /* renamed from: e  reason: collision with root package name */
    public String f62275e;

    /* renamed from: f  reason: collision with root package name */
    public String f62276f;
    public int g;
    public int h;
    DmtTextView i;
    CollegeSearchModel j;
    volatile boolean k;
    public boolean l;
    public boolean m;
    @BindView(2131493607)
    CommonItemView mCollegeText;
    @BindView(2131493896)
    CommonItemView mDegreeText;
    @BindView(2131497340)
    DmtStatusView mDmtStatusView;
    @BindView(2131494130)
    CommonItemView mEnrollYearText;
    @BindView(2131496907)
    CommonItemView mSchoolText;
    @BindView(2131498543)
    CommonItemView mShowRangeText;
    SchoolViewModel n;
    private String o;
    private String p;
    private String q;
    private int r;
    private int s;
    private ad t;
    @BindView(2131497604)
    TextTitleBar textTitleBar;
    private boolean u;

    public final void a(boolean z) {
    }

    public final void a(String str, String str2, String str3, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62273c, false, 68892, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Byte.valueOf(z)}, this, f62273c, false, 68892, new Class[]{String.class, String.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!this.m) {
            final boolean z2 = z;
            a.a(getContext()).setMessage((CharSequence) str4).setPositiveButton((CharSequence) str6, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62293a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62293a, false, 68921, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62293a, false, 68921, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    ProfileSetSchoolFragment.this.c();
                }
            }).setNegativeButton((CharSequence) str5, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62290a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62290a, false, 68920, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62290a, false, 68920, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z2) {
                        ProfileSetSchoolFragment.this.dismiss();
                    }
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() {
                public final void onDismiss(DialogInterface dialogInterface) {
                    ProfileSetSchoolFragment.this.m = false;
                }
            }).show();
            this.m = true;
        }
    }

    public final void a(Exception exc, int i2) {
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i2)}, this, f62273c, false, 68910, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i2)}, this, f62273c, false, 68910, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
        } else if (this.t != null) {
            this.mDmtStatusView.setVisibility(8);
            com.ss.android.ugc.aweme.app.api.a.a.a(getActivity(), exc, C0906R.string.bsd);
            dismiss();
        }
    }

    public final void a(String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f62273c, false, 68911, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f62273c, false, 68911, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
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

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68893, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68893, new Class[0], Void.TYPE);
            return;
        }
        this.l = true;
        b bVar = new b(0.5f, 1.0f);
        this.i.setAlpha(1.0f);
        this.i.setOnTouchListener(bVar);
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68894, new Class[0], Void.TYPE);
            return;
        }
        this.l = false;
        this.i.setAlpha(0.5f);
        this.i.setOnTouchListener(null);
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68913, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68913, new Class[0], Boolean.TYPE)).booleanValue();
        }
        User curUser = d.a().getCurUser();
        if (curUser != null) {
            return curUser.isCanModifySchoolInfo();
        }
        return false;
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68888, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68888, new Class[0], Void.TYPE);
        } else if (!this.u || getActivity() == null) {
            super.dismissAllowingStateLoss();
        } else {
            getActivity().finish();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68891, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68891, new Class[0], Void.TYPE);
        } else if (!this.l) {
            dismiss();
        } else {
            String string = getString(C0906R.string.c1r);
            if (d()) {
                string = getString(C0906R.string.c1b);
            }
            a(string, getString(C0906R.string.aja), getString(C0906R.string.c12), true);
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68908, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68908, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.equals(this.f62274d, this.o) || !TextUtils.equals(this.f62275e, this.p) || !TextUtils.equals(this.f62276f, this.q) || this.g != this.r || this.h == this.s) {
            return false;
        } else {
            return true;
        }
    }

    public void onSearchCollegeFail() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68904, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68904, new Class[0], Void.TYPE);
        } else if (getActivity() != null && getContext() != null) {
            com.bytedance.ies.dmt.ui.d.a.c((Context) getActivity(), (int) C0906R.string.b6z).a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68898, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68898, new Class[0], Void.TYPE);
        } else if (!TextUtils.equals(this.f62274d, this.o) || !TextUtils.equals(this.f62275e, this.p) || !TextUtils.equals(this.f62276f, this.q) || this.g != this.r || this.h != this.s) {
            e();
        } else {
            f();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f62273c, false, 68907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62273c, false, 68907, new Class[0], Void.TYPE);
            return;
        }
        this.mDmtStatusView.d();
        if (d()) {
            ad adVar = this.t;
            int i2 = this.h;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, adVar, ad.f61573a, false, 67646, new Class[]{Integer.TYPE}, Void.TYPE)) {
                ad adVar2 = adVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, adVar2, ad.f61573a, false, 67646, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                if (!adVar.f61578f) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("school_visible", String.valueOf(i2));
                    d.a().updateSchool(adVar.g, hashMap);
                    adVar.f61578f = true;
                }
            }
        } else {
            ad adVar3 = this.t;
            String str = this.f62274d;
            String str2 = this.f62275e;
            String str3 = this.f62276f;
            int i3 = this.g;
            int i4 = this.h;
            if (PatchProxy.isSupport(new Object[]{str, str2, str3, Integer.valueOf(i3), Integer.valueOf(i4)}, adVar3, ad.f61573a, false, 67645, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {str, str2, str3, Integer.valueOf(i3), Integer.valueOf(i4)};
                Object[] objArr2 = objArr;
                ad adVar4 = adVar3;
                PatchProxy.accessDispatch(objArr2, adVar4, ad.f61573a, false, 67645, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else if (!adVar3.f61578f) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("school_name", str);
                hashMap2.put("college_name", str2);
                hashMap2.put("enroll_year", str3);
                hashMap2.put("education", String.valueOf(i3));
                hashMap2.put("school_visible", String.valueOf(i4));
                d.a().updateSchool(adVar3.g, hashMap2);
                adVar3.f61578f = true;
            }
        }
    }

    public final String b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62273c, false, 68903, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62273c, false, 68903, new Class[]{Integer.TYPE}, String.class);
        } else if (getContext() == null) {
            return "";
        } else {
            if (i2 == 1) {
                return getString(C0906R.string.c8a);
            }
            if (i2 == 2) {
                return getString(C0906R.string.c8b);
            }
            if (i2 == 3) {
                return getString(C0906R.string.c8_);
            }
            return "";
        }
    }

    public void onCheckCollegeResult(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62273c, false, 68906, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62273c, false, 68906, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.k = z;
        if (!this.k) {
            this.f62275e = "";
            a(this.mCollegeText);
        }
    }

    public void onSearchCollegeSuccess(List<String> list) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f62273c, false, 68905, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f62273c, false, 68905, new Class[]{List.class}, Void.TYPE);
        } else if (getActivity() == null || getContext() == null) {
        } else {
            k kVar = new k(getContext(), list2);
            kVar.f62949b = new k.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62281a;

                public final void a(String str) {
                    if (PatchProxy.isSupport(new Object[]{str}, this, f62281a, false, 68915, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str}, this, f62281a, false, 68915, new Class[]{String.class}, Void.TYPE);
                    } else if (!TextUtils.isEmpty(str) && !TextUtils.equals(ProfileSetSchoolFragment.this.f62275e, str)) {
                        ProfileSetSchoolFragment.this.f62275e = str;
                        ProfileSetSchoolFragment.this.a(ProfileSetSchoolFragment.this.mCollegeText, (CharSequence) str);
                        ProfileSetSchoolFragment.this.b();
                    }
                }
            };
            kVar.show();
        }
    }

    @OnClick({2131493607})
    public void selectCollege(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62273c, false, 68899, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62273c, false, 68899, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (!g()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c1s).a();
            } else if (TextUtils.isEmpty(this.f62274d)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c3s).a();
            } else if (!this.k) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.bh8).a();
            } else {
                this.j.searchCollege(this.f62274d);
            }
        }
    }

    @OnClick({2131496907})
    public void selectSchool(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62273c, false, 68884, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62273c, false, 68884, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (!g()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c1s).a();
                return;
            }
            dq dqVar = new dq(getActivity());
            dqVar.setOwnerActivity(getActivity());
            dqVar.f62682c = new dq.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62277a;

                public final void a(String str) {
                    String str2 = str;
                    if (PatchProxy.isSupport(new Object[]{str2}, this, f62277a, false, 68914, new Class[]{String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str2}, this, f62277a, false, 68914, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    ProfileSetSchoolFragment profileSetSchoolFragment = ProfileSetSchoolFragment.this;
                    if (PatchProxy.isSupport(new Object[]{str2}, profileSetSchoolFragment, ProfileSetSchoolFragment.f62273c, false, 68897, new Class[]{String.class}, Void.TYPE)) {
                        ProfileSetSchoolFragment profileSetSchoolFragment2 = profileSetSchoolFragment;
                        PatchProxy.accessDispatch(new Object[]{str2}, profileSetSchoolFragment2, ProfileSetSchoolFragment.f62273c, false, 68897, new Class[]{String.class}, Void.TYPE);
                        return;
                    }
                    if (!TextUtils.equals(str2, profileSetSchoolFragment.f62274d)) {
                        profileSetSchoolFragment.f62274d = str2;
                        profileSetSchoolFragment.k = false;
                        profileSetSchoolFragment.f62275e = "";
                        profileSetSchoolFragment.f62276f = "";
                        profileSetSchoolFragment.g = 0;
                        profileSetSchoolFragment.a(profileSetSchoolFragment.mSchoolText, (CharSequence) profileSetSchoolFragment.f62274d);
                        profileSetSchoolFragment.a(profileSetSchoolFragment.mCollegeText);
                        profileSetSchoolFragment.a(profileSetSchoolFragment.mEnrollYearText);
                        profileSetSchoolFragment.a(profileSetSchoolFragment.mDegreeText);
                        if (!TextUtils.isEmpty(str)) {
                            profileSetSchoolFragment.j.checkHasCollege(str2);
                        }
                    }
                    profileSetSchoolFragment.b();
                }
            };
            dqVar.show();
        }
    }

    public final String a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62273c, false, 68902, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62273c, false, 68902, new Class[]{Integer.TYPE}, String.class);
        } else if (getContext() == null) {
            return "";
        } else {
            switch (i2) {
                case 1:
                    return getString(C0906R.string.ki);
                case 2:
                    return getString(C0906R.string.akx);
                case 3:
                    return getString(C0906R.string.b40);
                case 4:
                    return getString(C0906R.string.dnr);
                case 5:
                    return getString(C0906R.string.a6_);
                default:
                    return "";
            }
        }
    }

    @OnClick({2131498543})
    public void changeShowRange(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62273c, false, 68901, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62273c, false, 68901, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            Context context = getContext();
            AnonymousClass10 r1 = new dm.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62279a;

                public final void a(int i) {
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f62279a, false, 68923, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f62279a, false, 68923, new Class[]{Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    ProfileSetSchoolFragment.this.h = i;
                    ProfileSetSchoolFragment.this.a(ProfileSetSchoolFragment.this.mShowRangeText, (CharSequence) ProfileSetSchoolFragment.this.b(i));
                    ProfileSetSchoolFragment.this.b();
                }
            };
            int i2 = this.h;
            if (PatchProxy.isSupport(new Object[]{context, r1, Integer.valueOf(i2)}, null, dm.f62660a, true, 68991, new Class[]{Context.class, dm.a.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, r1, Integer.valueOf(i2)}, null, dm.f62660a, true, 68991, new Class[]{Context.class, dm.a.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            dm dmVar = new dm(context, i2);
            dmVar.f62665f = r1;
            dmVar.show();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62273c, false, 68887, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62273c, false, 68887, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.fu);
        if (getArguments() != null) {
            this.o = getArguments().getString("school_name");
            this.p = getArguments().getString("college_name");
            this.q = getArguments().getString("enroll_year");
            this.r = getArguments().getInt("degree");
            this.s = getArguments().getInt("show_range");
            this.u = getArguments().getBoolean("just_edit_school");
            if (this.s == 0) {
                this.s = 1;
            }
            this.f62274d = this.o;
            this.f62275e = this.p;
            this.f62276f = this.q;
            this.g = this.r;
            this.h = this.s;
        }
        this.n = (SchoolViewModel) ViewModelProviders.of(getActivity()).get(SchoolViewModel.class);
        this.j = new CollegeSearchModel(this);
    }

    @OnClick({2131493896})
    public void selectDegree(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62273c, false, 68900, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62273c, false, 68900, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (!g()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c1s).a();
            } else if (TextUtils.isEmpty(this.f62274d)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c3s).a();
            } else {
                String[] stringArray = getResources().getStringArray(C0906R.array.j);
                com.ss.android.ugc.aweme.common.ui.a aVar = new com.ss.android.ugc.aweme.common.ui.a(getContext());
                aVar.a((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62295a;

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = 2;
                        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62295a, false, 68922, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f62295a, false, 68922, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        dialogInterface.dismiss();
                        switch (i) {
                            case 0:
                                i2 = 3;
                                break;
                            case 1:
                                i2 = 4;
                                break;
                            case 2:
                                break;
                            case 3:
                                i2 = 5;
                                break;
                            default:
                                i2 = 0;
                                break;
                        }
                        if (i2 != ProfileSetSchoolFragment.this.g) {
                            ProfileSetSchoolFragment.this.g = i2;
                            ProfileSetSchoolFragment.this.a(ProfileSetSchoolFragment.this.mDegreeText, (CharSequence) ProfileSetSchoolFragment.this.a(ProfileSetSchoolFragment.this.g));
                            ProfileSetSchoolFragment.this.b();
                        }
                    }
                });
                aVar.b();
            }
        }
    }

    @OnClick({2131494130})
    public void setEnrollYear(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f62273c, false, 68885, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f62273c, false, 68885, new Class[]{View.class}, Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.c.a.a.a(view)) {
            if (!g()) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c1s).a();
            } else if (TextUtils.isEmpty(this.f62274d)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) getActivity(), (int) C0906R.string.c3s).a();
            } else {
                YearPickerDialog yearPickerDialog = new YearPickerDialog(getActivity());
                yearPickerDialog.f46366c = new YearPickerDialog.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f62283a;

                    public final void a(int i, int i2) {
                        if (PatchProxy.isSupport(new Object[]{0, Integer.valueOf(i2)}, this, f62283a, false, 68916, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{0, Integer.valueOf(i2)}, this, f62283a, false, 68916, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        String str = i2;
                        if (!TextUtils.equals(ProfileSetSchoolFragment.this.f62276f, str)) {
                            ProfileSetSchoolFragment.this.f62276f = str;
                            ProfileSetSchoolFragment.this.a(ProfileSetSchoolFragment.this.mEnrollYearText, (CharSequence) ProfileSetSchoolFragment.this.f62276f);
                            ProfileSetSchoolFragment.this.b();
                        }
                    }
                };
                if (!TextUtils.isEmpty(this.mEnrollYearText.getTextRight())) {
                    try {
                        int parseInt = Integer.parseInt(this.mEnrollYearText.getTextRight().toString());
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(parseInt)}, yearPickerDialog, YearPickerDialog.f46364a, false, 43375, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            Object[] objArr = {Integer.valueOf(parseInt)};
                            ChangeQuickRedirect changeQuickRedirect = YearPickerDialog.f46364a;
                            YearPickerDialog yearPickerDialog2 = yearPickerDialog;
                            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                            PatchProxy.accessDispatch(objArr, yearPickerDialog2, changeQuickRedirect2, false, 43375, new Class[]{Integer.TYPE}, Void.TYPE);
                        } else {
                            yearPickerDialog.f46365b.d(parseInt);
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                yearPickerDialog.show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(@NonNull CommonItemView commonItemView) {
        CommonItemView commonItemView2 = commonItemView;
        if (PatchProxy.isSupport(new Object[]{commonItemView2}, this, f62273c, false, 68895, new Class[]{CommonItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView2}, this, f62273c, false, 68895, new Class[]{CommonItemView.class}, Void.TYPE);
            return;
        }
        commonItemView2.setRightText(getString(C0906R.string.ti));
    }

    public void show(FragmentManager fragmentManager, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{fragmentManager, str2}, this, f62273c, false, 68912, new Class[]{FragmentManager.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentManager, str2}, this, f62273c, false, 68912, new Class[]{FragmentManager.class, String.class}, Void.TYPE);
            return;
        }
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        beginTransaction.add((Fragment) this, str2);
        beginTransaction.commitAllowingStateLoss();
    }

    public final void a(@NonNull CommonItemView commonItemView, CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{commonItemView, charSequence}, this, f62273c, false, 68896, new Class[]{CommonItemView.class, CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commonItemView, charSequence}, this, f62273c, false, 68896, new Class[]{CommonItemView.class, CharSequence.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(charSequence)) {
            commonItemView.setRightText(charSequence);
        } else {
            a(commonItemView);
        }
    }

    public final void a(User user, int i2) {
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i2)}, this, f62273c, false, 68909, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i2)}, this, f62273c, false, 68909, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
        } else if (getActivity() != null && getContext() != null) {
            if (i2 == 8) {
                this.n.setSchoolName(this.f62274d);
                this.n.setCollegeName(this.f62275e);
                this.n.setEnrollYear(this.f62276f);
                this.n.setDegree(this.g);
                this.n.setShowRange(this.h);
                d.a().updateCurSchoolInfo(this.f62274d, this.f62275e, this.f62276f, this.g, this.h);
                if (!d()) {
                    d.a().updateCurCanChangeSchoolInfo(false);
                }
            }
            this.mDmtStatusView.setVisibility(8);
            com.bytedance.ies.dmt.ui.d.a.a((Context) com.ss.android.ugc.aweme.app.k.a(), com.ss.android.ugc.aweme.app.k.a().getString(C0906R.string.bu)).a();
            dismiss();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62273c, false, 68889, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62273c, false, 68889, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ps, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f62273c, false, 68890, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f62273c, false, 68890, new Class[]{View.class}, Void.TYPE);
        } else {
            this.t = new ad();
            this.t.h = this;
            this.mDmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
            if (!TextUtils.isEmpty(this.o)) {
                a(this.mSchoolText, (CharSequence) this.o);
                this.j.checkHasCollege(this.o);
            }
            if (!TextUtils.isEmpty(this.p)) {
                a(this.mCollegeText, (CharSequence) this.p);
            }
            if (!TextUtils.isEmpty(this.q)) {
                a(this.mEnrollYearText, (CharSequence) this.q);
            }
            a(this.mDegreeText, (CharSequence) a(this.r));
            a(this.mShowRangeText, (CharSequence) b(this.s));
            this.textTitleBar.setOnTitleBarClickListener(new com.bytedance.ies.dmt.ui.titlebar.a.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62285a;

                public final void a(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62285a, false, 68917, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62285a, false, 68917, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ProfileSetSchoolFragment.this.a();
                }

                public final void b(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f62285a, false, 68918, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f62285a, false, 68918, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (ProfileSetSchoolFragment.this.l) {
                        if (ProfileSetSchoolFragment.this.d()) {
                            ProfileSetSchoolFragment.this.c();
                            return;
                        }
                        String string = ProfileSetSchoolFragment.this.getString(C0906R.string.c1t);
                        if (TextUtils.isEmpty(ProfileSetSchoolFragment.this.f62274d) || TextUtils.isEmpty(ProfileSetSchoolFragment.this.f62275e) || TextUtils.isEmpty(ProfileSetSchoolFragment.this.f62276f) || ProfileSetSchoolFragment.this.g == 0) {
                            string = ProfileSetSchoolFragment.this.getString(C0906R.string.c1u);
                        }
                        ProfileSetSchoolFragment.this.a(string, ProfileSetSchoolFragment.this.getString(C0906R.string.pm), ProfileSetSchoolFragment.this.getString(C0906R.string.aee), false);
                    }
                }
            });
            this.i = this.textTitleBar.getEndText();
            f();
            getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f62287a;

                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f62287a, false, 68919, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, f62287a, false, 68919, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
                    } else if (i == 4) {
                        ProfileSetSchoolFragment.this.a();
                        return true;
                    } else {
                        return false;
                    }
                }
            });
        }
        return inflate;
    }
}
