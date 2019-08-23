package com.ss.android.ugc.aweme.shortvideo.cut;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.property.a;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoFragment;
import com.ss.android.ugc.aweme.shortvideo.fc;
import com.ss.android.ugc.aweme.shortvideo.hm;
import com.ss.android.ugc.aweme.story.shootvideo.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\"\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "finish", "", "getStatusBarColor", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class VECutVideoActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66189a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f66190b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f66191c = VECutVideoActivity.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0007H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoActivity$Companion;", "", "()V", "FILE_PATH", "", "FROM_MUSIC_DETAIL", "MICRO_APP_RECORD_REQUEST_CODE", "", "OPEN_SDK_IMPORT_MEDIALIST", "TAG", "kotlin.jvm.PlatformType", "startCutVideoActivity", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "requestCode", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66192a;

        @JvmOverloads
        public final void a(@NotNull Context context, @NotNull Intent intent) {
            Context context2 = context;
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{context2, intent2}, this, f66192a, false, 75548, new Class[]{Context.class, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, intent2}, this, f66192a, false, 75548, new Class[]{Context.class, Intent.class}, Void.TYPE);
                return;
            }
            a(context2, intent2, -1);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmOverloads
        public final void a(@NotNull Context context, @NotNull Intent intent, int i) {
            boolean z;
            Context context2 = context;
            Intent intent2 = intent;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{context2, intent2, Integer.valueOf(i)}, this, f66192a, false, 75547, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context2, intent2, Integer.valueOf(i)}, this, f66192a, false, 75547, new Class[]{Context.class, Intent.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(context2, "context");
            Intrinsics.checkParameterIsNotNull(intent2, "intent");
            if (intent2.hasExtra("extra_cross_process")) {
                z = intent2.getBooleanExtra("extra_cross_process_boolean_extra", false);
            } else {
                z = com.ss.android.ugc.aweme.port.in.a.M.a(a.C0682a.VECutVideoEnable);
            }
            if (z) {
                intent2.setClass(context2, VECutVideoActivity.class);
            } else {
                intent2.setClass(context2, CutMultiVideoActivity.class);
            }
            if (i2 == -1 || !(context2 instanceof Activity)) {
                context.startActivity(intent);
            } else {
                ((Activity) context2).startActivityForResult(intent2, i2);
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f66189a, false, 75545, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66189a, false, 75545, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66189a, false, 75546, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66189a, false, 75546, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final int getStatusBarColor() {
        if (!PatchProxy.isSupport(new Object[0], this, f66189a, false, 75540, new Class[0], Integer.TYPE)) {
            return getResources().getColor(C0906R.color.ano);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66189a, false, 75540, new Class[0], Integer.TYPE)).intValue();
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f66189a, false, 75541, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66189a, false, 75541, new Class[0], Void.TYPE);
            return;
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        if (findFragmentById == null || !(findFragmentById instanceof VECutVideoFragment)) {
            super.onBackPressed();
        } else {
            ((VECutVideoFragment) findFragmentById).y();
        }
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f66189a, false, 75542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66189a, false, 75542, new Class[0], Void.TYPE);
            return;
        }
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(16908290);
        super.finish();
        if (findFragmentById != null && (findFragmentById instanceof VECutVideoFragment)) {
            VECutVideoFragment vECutVideoFragment = (VECutVideoFragment) findFragmentById;
            if (PatchProxy.isSupport(new Object[0], vECutVideoFragment, VECutVideoFragment.f66193a, false, 75586, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], vECutVideoFragment, VECutVideoFragment.f66193a, false, 75586, new Class[0], Void.TYPE);
            } else if (vECutVideoFragment.f66198f != null) {
                Serializable serializable = vECutVideoFragment.f66198f;
                if (serializable != null) {
                    vECutVideoFragment.startActivity(new Intent(vECutVideoFragment.getActivity(), (Class) serializable));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
                }
            }
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        List<com.ss.android.ugc.aweme.music.b.a.a> list;
        boolean z;
        VECutVideoFragment vECutVideoFragment;
        VECutVideoFragment vECutVideoFragment2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f66189a, false, 75538, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f66189a, false, 75538, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        com.ss.android.ugc.aweme.port.in.a.a(new hm().a());
        if (fc.a()) {
            VECutVideoActivity vECutVideoActivity = this;
            vECutVideoActivity.getWindow().clearFlags(1024);
            if (ToolUtils.isFlyme()) {
                StatusBarUtils.setTranslucent(vECutVideoActivity);
            } else {
                StatusBarUtils.setTransparent(vECutVideoActivity);
            }
            if (Build.VERSION.SDK_INT >= 21) {
                Window window = vECutVideoActivity.getWindow();
                Intrinsics.checkExpressionValueIsNotNull(window, "window");
                window.setNavigationBarColor(-16777216);
            }
        } else if (getIntent() == null || d.a(getIntent().getIntExtra("shoot_mode", -1))) {
            getWindow().clearFlags(1024);
        } else {
            Activity activity = this;
            if (!com.ss.android.ugc.aweme.app.a.a.a(activity)) {
                v.a(activity);
            }
        }
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            ArrayList arrayList = new ArrayList();
            com.ss.android.ugc.aweme.mediachoose.a.d a2 = com.ss.android.ugc.aweme.mediachoose.a.d.a();
            if (a2 != null) {
                list = a2.c();
            } else {
                list = null;
            }
            if (list != null) {
                com.ss.android.ugc.aweme.mediachoose.a.d a3 = com.ss.android.ugc.aweme.mediachoose.a.d.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "MediaManager.instance()");
                List<com.ss.android.ugc.aweme.music.b.a.a> c2 = a3.c();
                if (c2 != null) {
                    arrayList = (ArrayList) c2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel>");
                }
            }
            String stringExtra = getIntent().getStringExtra("file_path");
            if (getIntent().hasExtra("open_sdk_import_media_list")) {
                arrayList = getIntent().getParcelableArrayListExtra("open_sdk_import_media_list");
                Intrinsics.checkExpressionValueIsNotNull(arrayList, "intent.getParcelableArra…PEN_SDK_IMPORT_MEDIALIST)");
            }
            if (!TextUtils.isEmpty(stringExtra) || !arrayList.isEmpty()) {
                if (arrayList.size() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                bundle2.putBoolean("is_multi_mode", z);
                bundle2.putString("single_video_path", stringExtra);
                bundle2.putParcelableArrayList("multi_video_path_list", arrayList);
                bundle2.putParcelable("page_intent_data", getIntent());
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                VECutVideoFragment.a aVar = VECutVideoFragment.q;
                if (PatchProxy.isSupport(new Object[]{bundle2}, aVar, VECutVideoFragment.a.f66199a, false, 75594, new Class[]{Bundle.class}, VECutVideoFragment.class)) {
                    VECutVideoFragment.a aVar2 = aVar;
                    vECutVideoFragment = (VECutVideoFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, aVar2, VECutVideoFragment.a.f66199a, false, 75594, new Class[]{Bundle.class}, VECutVideoFragment.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(bundle2, "args");
                    if (bundle2.getBoolean("is_multi_mode")) {
                        vECutVideoFragment2 = new VEMultiCutVideoFragment();
                    } else {
                        vECutVideoFragment2 = new VESingleCutVideoFragment();
                    }
                    vECutVideoFragment2.setArguments(bundle2);
                    vECutVideoFragment = vECutVideoFragment2;
                }
                beginTransaction.add(16908290, (Fragment) vECutVideoFragment).commit();
            } else {
                finish();
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
                return;
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Bundle bundle;
        int i3 = i;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f66189a, false, 75539, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f66189a, false, 75539, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i3 == 1002) {
            Intent intent3 = new Intent();
            if (intent2 != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    Intrinsics.throwNpe();
                }
                String string = extras.getString("edit result");
                StringBuilder sb = new StringBuilder("RecordActivity return success ");
                if (string == null) {
                    Intrinsics.throwNpe();
                }
                sb.append(string);
                intent3.putExtra("record result", sb.toString());
            }
            setResult(-1, intent3);
            finish();
            return;
        }
        if (i3 == 4 && i2 == 7) {
            setResult(7, intent2);
            finish();
        }
    }
}
