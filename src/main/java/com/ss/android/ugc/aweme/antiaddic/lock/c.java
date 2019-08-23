package com.ss.android.ugc.aweme.antiaddic.lock;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.common.utility.DigestUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.MinorSettingData;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.b;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.app.an;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.setting.serverpush.a;
import com.ss.android.ugc.aweme.utils.bg;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nJ\n\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J.\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001eJ\r\u0010\u001f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\"\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0006\u0010#\u001a\u00020\u0004J \u0010$\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0006\u0010%\u001a\u00020\u001bJ\b\u0010&\u001a\u00020\u001bH\u0002J\u0006\u0010'\u001a\u00020\u001bJ\b\u0010(\u001a\u00020\u001bH\u0002J\u0006\u0010)\u001a\u00020\u001bJ\u0006\u0010*\u001a\u00020\u001bJ\u0006\u0010+\u001a\u00020\u001bJ\u0014\u0010,\u001a\u00020-2\n\u0010.\u001a\u00060/j\u0002`0H\u0016J\u0010\u00101\u001a\u00020-2\u0006\u00102\u001a\u000203H\u0016J\b\u00104\u001a\u00020-H\u0002J \u00105\u001a\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u00106\u001a\u00020\u001bJ\b\u00107\u001a\u00020-H\u0002J\u0006\u00108\u001a\u00020-J\u0010\u00109\u001a\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u0012\u0010:\u001a\u00020-2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0006\u0010;\u001a\u00020-J\u0012\u0010<\u001a\u00020-2\b\u00102\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010=\u001a\u00020-2\u0006\u0010'\u001a\u00020\u001bJ\b\u0010>\u001a\u00020-H\u0002J\u0006\u0010?\u001a\u00020-R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/ugc/aweme/antiaddic/lock/TeenageModeManager;", "Lcom/ss/android/ugc/aweme/setting/serverpush/PushSettingsManager$PushSettingCallback;", "()V", "DEFAULT_TIME_LOCK_MINUTES", "", "MINOR_CONTROL_TYPE_SYNC_LOCAL_STATE", "MINOR_CONTROL_TYPE_USE_SERVER_STATE", "mMinorSettings", "Lcom/ss/android/ugc/aweme/antiaddic/lock/entity/TeenageModeSetting;", "mOldPassword", "", "getMOldPassword", "()Ljava/lang/String;", "setMOldPassword", "(Ljava/lang/String;)V", "mPreference", "Lcom/ss/android/ugc/aweme/antiaddic/lock/entity/TeenageModePreferences;", "mPresenter", "Lcom/ss/android/ugc/aweme/antiaddic/lock/presenter/TeenagerModePresenter;", "encryptWithXor", "normalCode", "getCachedSettings", "getChangePasswordSetting", "password", "getMinorSettingContent", "pageType", "settingEnable", "", "isChangePassword", "activity", "Landroid/support/v4/app/FragmentActivity;", "getMinorType", "()Ljava/lang/Integer;", "getSetTimeLockInMin", "getTeenageModeSetting", "getTimeLockInMin", "getTimeLockSetting", "isDigitWellbeingOn", "isLastTeenageModeOn", "isMinor", "isNeedSyncTeenageModeToServer", "isTeenagerModeOn", "isTimeLockModeOn", "isUsingServerState", "onFailed", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "settings", "Lcom/ss/android/ugc/aweme/setting/serverpush/model/PushSettings;", "openTeenageMode", "processDigitWellbeingOn", "changePassword", "processTeenageModeOn", "processTeenageOff", "processTimeLockOff", "processTimeLockOn", "removeTeenageModeState", "saveCachedUserSettings", "setMinor", "syncTeenageModeToServer", "updateMinorSettingUsingPreviousSetting", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c implements a.C0028a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33440a;

    /* renamed from: b  reason: collision with root package name */
    public static TeenageModeSetting f33441b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public static String f33442c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final c f33443d;

    /* renamed from: e  reason: collision with root package name */
    private static final b f33444e;

    /* renamed from: f  reason: collision with root package name */
    private static final com.ss.android.ugc.aweme.antiaddic.lock.a.a f33445f = new com.ss.android.ugc.aweme.antiaddic.lock.a.a();

    private c() {
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21766, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21766, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (e()) {
            TeenageModeSetting teenageModeSetting = f33441b;
            if (teenageModeSetting != null ? teenageModeSetting.isTeenageModeSelf() : false) {
                z = true;
            }
        }
        return z;
    }

    static {
        c cVar = new c();
        f33443d = cVar;
        Object a2 = com.ss.android.ugc.aweme.base.sharedpref.c.a(k.a(), b.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "SharedPreferencesHelper.…ePreferences::class.java)");
        f33444e = (b) a2;
        f33441b = cVar.j();
    }

    private final boolean h() {
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21785, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21785, new Class[0], Boolean.TYPE)).booleanValue();
        }
        TeenageModeSetting teenageModeSetting = f33441b;
        if (teenageModeSetting != null) {
            i = teenageModeSetting.getMinorControlType();
        } else {
            i = 0;
        }
        if (i == 2) {
            z = true;
        }
        return z;
    }

    private final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21786, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21786, new Class[0], Void.TYPE);
            return;
        }
        if (h()) {
            f33445f.a();
        }
    }

    public final boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21767, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21767, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (c() > 0) {
            z = true;
        }
        return z;
    }

    public final int c() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21768, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21768, new Class[0], Integer.TYPE)).intValue();
        }
        if (e()) {
            TeenageModeSetting teenageModeSetting = f33441b;
            if (teenageModeSetting != null) {
                i = teenageModeSetting.getTimeLockSelfInMin();
            }
        }
        return i;
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21769, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21769, new Class[0], Boolean.TYPE)).booleanValue();
        }
        TeenageModeSetting teenageModeSetting = f33441b;
        if (teenageModeSetting != null) {
            z = teenageModeSetting.isMinor();
        }
        return z;
    }

    public final boolean e() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21771, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21771, new Class[0], Boolean.TYPE)).booleanValue();
        }
        TeenageModeSetting teenageModeSetting = f33441b;
        if (teenageModeSetting != null) {
            i = teenageModeSetting.getMinorControlType();
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21772, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21772, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a() || b()) {
            return true;
        } else {
            return false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21781, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21781, new Class[0], Void.TYPE);
            return;
        }
        TeenageModeSetting teenageModeSetting = f33441b;
        if (teenageModeSetting != null) {
            teenageModeSetting.setTeenageModeSelf(false);
        }
        TeenageModeSetting teenageModeSetting2 = f33441b;
        if (teenageModeSetting2 != null) {
            teenageModeSetting2.setTimeLockSelfInMin(0);
        }
        a(f33441b);
    }

    private final TeenageModeSetting j() {
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21790, new Class[0], TeenageModeSetting.class)) {
            return (TeenageModeSetting) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21790, new Class[0], TeenageModeSetting.class);
        }
        String a2 = f33444e.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "mPreference.teenageModeSetting");
        if (!TextUtils.isEmpty(a2)) {
            try {
                return (TeenageModeSetting) new Gson().fromJson(a2, TeenageModeSetting.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void a(@NotNull Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f33440a, false, 21765, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f33440a, false, 21765, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(exc2, "e");
        i();
    }

    public final void a(TeenageModeSetting teenageModeSetting) {
        TeenageModeSetting teenageModeSetting2 = teenageModeSetting;
        if (PatchProxy.isSupport(new Object[]{teenageModeSetting2}, this, f33440a, false, 21789, new Class[]{TeenageModeSetting.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{teenageModeSetting2}, this, f33440a, false, 21789, new Class[]{TeenageModeSetting.class}, Void.TYPE);
            return;
        }
        f33444e.a(new Gson().toJson((Object) teenageModeSetting2));
    }

    @NotNull
    public final String a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33440a, false, 21791, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f33440a, false, 21791, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "normalCode");
        try {
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            int parseInt = Integer.parseInt(str);
            String str3 = String.valueOf(parseInt * parseInt) + "dmt";
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkExpressionValueIsNotNull(forName, "Charset.forName(charsetName)");
            if (str3 != null) {
                byte[] bytes = str3.getBytes(forName);
                Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
                int length = bytes.length;
                for (int i = 0; i < length; i++) {
                    bytes[i] = (byte) (bytes[i] ^ 5);
                }
                String hexString = DigestUtils.toHexString(bytes, 0, bytes.length);
                Intrinsics.checkExpressionValueIsNotNull(hexString, "DigestUtils.toHexString(data, 0, data.size)");
                return hexString;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return str2;
        }
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.setting.serverpush.a.c cVar) {
        int i;
        com.ss.android.ugc.aweme.setting.serverpush.a.c cVar2 = cVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f33440a, false, 21764, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f33440a, false, 21764, new Class[]{com.ss.android.ugc.aweme.setting.serverpush.a.c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(cVar2, "settings");
        f33441b = new TeenageModeSetting(cVar2.w, cVar2.x, cVar2.y, cVar2.z);
        i();
        if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21787, new Class[0], Void.TYPE);
        } else {
            boolean a2 = a();
            if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21788, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21788, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                TeenageModeSetting j = j();
                if (j != null) {
                    i = j.getMinorControlType();
                } else {
                    i = 0;
                }
                if (i != 1) {
                    TimeLockUserSetting userSetting = TimeLockRuler.getUserSetting();
                    if (userSetting != null) {
                        z = userSetting.isContentFilterOn();
                    }
                } else if (j != null) {
                    z = j.isTeenageModeSelf();
                }
            }
            if (e() && a2 != z) {
                d.a();
            }
        }
        a(f33441b);
        bg.b(new com.ss.android.ugc.aweme.antiaddic.b.b());
    }

    public final void a(@Nullable FragmentActivity fragmentActivity, int i, boolean z) {
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f33440a, false, 21773, new Class[]{FragmentActivity.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, Integer.valueOf(i), Byte.valueOf(z)}, this, f33440a, false, 21773, new Class[]{FragmentActivity.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.a(d.a(), (int) C0906R.string.ck_).a();
        } else {
            if (i == 0) {
                if (PatchProxy.isSupport(new Object[]{fragmentActivity}, this, f33440a, false, 21783, new Class[]{FragmentActivity.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{fragmentActivity}, this, f33440a, false, 21783, new Class[]{FragmentActivity.class}, Void.TYPE);
                } else if (fragmentActivity != null) {
                    com.bytedance.ies.dmt.ui.d.a.a(d.a(), (int) C0906R.string.ckf).a();
                    ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(TimeLockOptionViewModel.class);
                    Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ionViewModel::class.java)");
                    MutableLiveData<TimeLockAboutFragmentV2.a> mutableLiveData = ((TimeLockOptionViewModel) viewModel).f33618a;
                    Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "ViewModelProviders.of(ac…              .optionData");
                    TimeLockAboutFragmentV2.a aVar = (TimeLockAboutFragmentV2.a) mutableLiveData.getValue();
                    TeenageModeSetting teenageModeSetting = f33441b;
                    if (teenageModeSetting != null) {
                        if (aVar != null) {
                            i2 = aVar.f33584b;
                        } else {
                            i2 = 0;
                        }
                        teenageModeSetting.setTimeLockSelfInMin(i2);
                    }
                    com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
                    if (aVar != null) {
                        i3 = aVar.f33584b;
                    }
                    r.a("open_time_lock_finish", (Map) a2.a("set_time", i3).f34114b);
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f33440a, false, 21778, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f33440a, false, 21778, new Class[0], Void.TYPE);
                } else {
                    TeenageModeSetting teenageModeSetting2 = f33441b;
                    if (teenageModeSetting2 != null) {
                        teenageModeSetting2.setTeenageModeSelf(true);
                    }
                    x a3 = x.a();
                    Intrinsics.checkExpressionValueIsNotNull(a3, "CommonSharePrefCache.inst()");
                    an<Boolean> C = a3.C();
                    Intrinsics.checkExpressionValueIsNotNull(C, "CommonSharePrefCache.inst().hasOpenTeenMode");
                    C.a(Boolean.TRUE);
                    r.a("open_teen_mode_finish", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
                    com.bytedance.ies.dmt.ui.d.a.a(d.a(), (int) C0906R.string.c00).a();
                    d.a();
                    if (!com.ss.android.g.a.a() && !TimeLockRuler.isSelfTimeLockOn()) {
                        x a4 = x.a();
                        Intrinsics.checkExpressionValueIsNotNull(a4, "CommonSharePrefCache.inst()");
                        an<Boolean> l = a4.l();
                        Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                        if (!((Boolean) l.c()).booleanValue()) {
                            TeenageModeSetting teenageModeSetting3 = f33441b;
                            if (teenageModeSetting3 != null) {
                                teenageModeSetting3.setTimeLockSelfInMin(40);
                            }
                        }
                    }
                }
            }
            a(f33441b);
        }
        if (fragmentActivity != null) {
            d.a(fragmentActivity, i);
        }
    }

    @NotNull
    public final String a(int i, boolean z, @NotNull String str, boolean z2, @NotNull FragmentActivity fragmentActivity) {
        String str2 = str;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0), str2, Byte.valueOf(z2 ? (byte) 1 : 0), fragmentActivity2}, this, f33440a, false, 21774, new Class[]{Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, FragmentActivity.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z), str2, Byte.valueOf(z2), fragmentActivity2}, this, f33440a, false, 21774, new Class[]{Integer.TYPE, Boolean.TYPE, String.class, Boolean.TYPE, FragmentActivity.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "password");
        Intrinsics.checkParameterIsNotNull(fragmentActivity2, PushConstants.INTENT_ACTIVITY_NAME);
        if (z2) {
            String a2 = a(str2);
            if (PatchProxy.isSupport(new Object[]{a2}, this, f33440a, false, 21777, new Class[]{String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{a2}, this, f33440a, false, 21777, new Class[]{String.class}, String.class);
            }
            MinorSettingData minorSettingData = new MinorSettingData();
            minorSettingData.setEventType(3);
            minorSettingData.setEventValue(a2);
            minorSettingData.setPassword(a(f33442c));
            String json = new Gson().toJson((Object) CollectionsKt.listOf(minorSettingData));
            Intrinsics.checkExpressionValueIsNotNull(json, "Gson().toJson(settingList)");
            return json;
        } else if (i == 0) {
            String a3 = a(str2);
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z), fragmentActivity2, a3}, this, f33440a, false, 21776, new Class[]{Boolean.TYPE, FragmentActivity.class, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), fragmentActivity2, a3}, this, f33440a, false, 21776, new Class[]{Boolean.TYPE, FragmentActivity.class, String.class}, String.class);
            }
            MinorSettingData minorSettingData2 = new MinorSettingData();
            minorSettingData2.setEventType(2);
            if (z) {
                if (PatchProxy.isSupport(new Object[]{fragmentActivity2}, this, f33440a, false, 21784, new Class[]{FragmentActivity.class}, Integer.TYPE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{fragmentActivity2}, this, f33440a, false, 21784, new Class[]{FragmentActivity.class}, Integer.TYPE)).intValue();
                } else {
                    ViewModel viewModel = ViewModelProviders.of(fragmentActivity).get(TimeLockOptionViewModel.class);
                    Intrinsics.checkExpressionValueIsNotNull(viewModel, "ViewModelProviders.of(ac…ionViewModel::class.java)");
                    MutableLiveData<TimeLockAboutFragmentV2.a> mutableLiveData = ((TimeLockOptionViewModel) viewModel).f33618a;
                    Intrinsics.checkExpressionValueIsNotNull(mutableLiveData, "ViewModelProviders.of(ac…              .optionData");
                    TimeLockAboutFragmentV2.a aVar = (TimeLockAboutFragmentV2.a) mutableLiveData.getValue();
                    if (aVar != null) {
                        i2 = aVar.f33584b;
                    }
                }
            }
            minorSettingData2.setEventValue(String.valueOf(i2));
            minorSettingData2.setPassword(a3);
            String json2 = new Gson().toJson((Object) CollectionsKt.listOf(minorSettingData2));
            Intrinsics.checkExpressionValueIsNotNull(json2, "Gson().toJson(settingList)");
            return json2;
        } else {
            String a4 = a(str2);
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z), a4}, this, f33440a, false, 21775, new Class[]{Boolean.TYPE, String.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), a4}, this, f33440a, false, 21775, new Class[]{Boolean.TYPE, String.class}, String.class);
            }
            MinorSettingData minorSettingData3 = new MinorSettingData();
            minorSettingData3.setEventType(1);
            minorSettingData3.setEventValue(String.valueOf(z ? 1 : 0));
            minorSettingData3.setPassword(a4);
            List arrayList = new ArrayList();
            arrayList.add(minorSettingData3);
            if (!com.ss.android.g.a.a() && z && c() == 0) {
                x a5 = x.a();
                Intrinsics.checkExpressionValueIsNotNull(a5, "CommonSharePrefCache.inst()");
                an<Boolean> l = a5.l();
                Intrinsics.checkExpressionValueIsNotNull(l, "CommonSharePrefCache.inst().isForceMinor");
                if (!((Boolean) l.c()).booleanValue()) {
                    MinorSettingData minorSettingData4 = new MinorSettingData();
                    minorSettingData4.setEventType(2);
                    minorSettingData4.setEventValue("40");
                    minorSettingData4.setPassword(a4);
                    arrayList.add(minorSettingData4);
                }
            }
            String json3 = new Gson().toJson((Object) arrayList);
            Intrinsics.checkExpressionValueIsNotNull(json3, "Gson().toJson(settingList)");
            return json3;
        }
    }
}
