package com.ss.android.ugc.aweme.setting.ui;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.aweme.poi.map.MapLayout;
import com.ss.android.ugc.aweme.poi.map.g;
import com.ss.android.ugc.aweme.poi.map.h;
import com.ss.android.ugc.aweme.poi.map.l;
import com.ss.android.ugc.aweme.poi.ui.n;
import com.ss.android.ugc.aweme.utils.cf;
import com.ss.android.ugc.aweme.utils.q;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001-B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0002J\b\u0010 \u001a\u00020\u0016H\u0016J\u0012\u0010!\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\"\u001a\u00020\u0016H\u0014J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\rH\u0016J\b\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016J\u0010\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u001dH\u0016J\b\u0010(\u001a\u00020\u0016H\u0014J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u0016H\u0014J\b\u0010,\u001a\u00020\u0016H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/TestPoiMapPickUpActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeBaseActivity;", "Lcom/ss/android/ugc/aweme/poi/map/OnMapViewClickListener;", "Lcom/ss/android/ugc/aweme/poi/map/OnMapReadyListener;", "()V", "mApply", "Landroid/widget/TextView;", "mButtonTitleBar", "Lcom/bytedance/ies/dmt/ui/titlebar/ButtonTitleBar;", "mLat", "Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;", "mLng", "mMyLat", "", "mMyLng", "mPoiMap", "Lcom/ss/android/ugc/aweme/poi/map/MapLayout;", "mSavedLat", "mSavedLng", "mTitle", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "bindViewById", "", "getLayout", "", "getLocation", "savedInstanceState", "Landroid/os/Bundle;", "isLatLngValid", "", "lat", "lng", "onBackPressed", "onCreate", "onDestroy", "onMapClicked", "onMapReady", "onPause", "onPointerCaptureChanged", "hasCapture", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TestPoiMapPickUpActivity extends AmeBaseActivity implements h, l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64238a = null;
    public static final a v = new a((byte) 0);
    private static final String z = z;
    private HashMap A;

    /* renamed from: b  reason: collision with root package name */
    public MapLayout f64239b;

    /* renamed from: c  reason: collision with root package name */
    public DmtEditText f64240c;

    /* renamed from: d  reason: collision with root package name */
    public DmtEditText f64241d;

    /* renamed from: e  reason: collision with root package name */
    public double f64242e;

    /* renamed from: f  reason: collision with root package name */
    public double f64243f;
    public double g;
    public double u;
    private ButtonTitleBar w;
    private DmtTextView x;
    private TextView y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/ui/TestPoiMapPickUpActivity$Companion;", "", "()V", "TITLE", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64244a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TestPoiMapPickUpActivity f64245b;

        b(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f64245b = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64244a, false, 72716, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64244a, false, 72716, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f64245b.onBackPressed();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64246a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TestPoiMapPickUpActivity f64247b;

        c(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f64247b = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f64246a, false, 72717, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64246a, false, 72717, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            n a2 = n.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "PoiCollectStateInstance.getInstance()");
            if (!a2.b()) {
                t.a(Toast.makeText(this.f64247b, "enable toggle first", 0));
                return;
            }
            double[] dArr = {this.f64247b.f64242e, this.f64247b.f64243f};
            this.f64247b.g = this.f64247b.f64242e;
            this.f64247b.u = this.f64247b.f64243f;
            n.a().a(dArr);
            t.a(Toast.makeText(this.f64247b, "lat & lng saved successfully!", 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f64248a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TestPoiMapPickUpActivity f64249b;

        d(TestPoiMapPickUpActivity testPoiMapPickUpActivity) {
            this.f64249b = testPoiMapPickUpActivity;
        }

        public final void onClick(View view) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{view}, this, f64248a, false, 72719, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f64248a, false, 72719, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            DmtEditText dmtEditText = this.f64249b.f64241d;
            if (dmtEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLat");
            }
            double parseDouble = Double.parseDouble(String.valueOf(dmtEditText.getText()));
            DmtEditText dmtEditText2 = this.f64249b.f64240c;
            if (dmtEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLng");
            }
            double parseDouble2 = Double.parseDouble(String.valueOf(dmtEditText2.getText()));
            if (parseDouble <= 0.0d || parseDouble2 <= 0.0d) {
                z = false;
            }
            if (z) {
                this.f64249b.f64242e = parseDouble;
                this.f64249b.f64243f = parseDouble2;
                MapLayout mapLayout = this.f64249b.f64239b;
                if (mapLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
                }
                mapLayout.a(BitmapFactory.decodeResource(this.f64249b.getResources(), 2130839668), this.f64249b.f64242e, this.f64249b.f64243f);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMarkerClicked"}, k = 3, mv = {1, 1, 15})
    static final class e implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final e f64250a = new e();

        e() {
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f64238a, false, 72713, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f64238a, false, 72713, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.A == null) {
            this.A = new HashMap();
        }
        View view = (View) this.A.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.A.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final int a() {
        return C0906R.layout.e8;
    }

    public final void onPointerCaptureChanged(boolean z2) {
    }

    public final void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f64238a, false, 72715, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f64238a, false, 72715, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z2);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72706, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.e();
    }

    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72704, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72704, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.c();
    }

    public final void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72702, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.a();
    }

    public final void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72705, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.d();
    }

    public final void V_() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72710, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72710, new Class[0], Void.TYPE);
            return;
        }
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.a(BitmapFactory.decodeResource(getResources(), 2130839668), this.f64242e, this.f64243f, 3.0f, (g) e.f64250a);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72711, new Class[0], Void.TYPE);
            return;
        }
        Intent intent = getIntent();
        if (this.g <= 0.0d || this.u <= 0.0d) {
            setResult(0, intent);
        } else {
            intent.putExtra("latitude", this.g);
            intent.putExtra("longitude", this.u);
            setResult(-1, intent);
        }
        finish();
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72703, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72703, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onResume", true);
        super.onResume();
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onResume", false);
    }

    public final void onSaveInstanceState(@NotNull Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64238a, false, 72712, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64238a, false, 72712, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putDouble("latitude", this.f64242e);
        bundle.putDouble("longitude", this.f64243f);
    }

    public final void onCreate(@Nullable Bundle bundle) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f64238a, false, 72700, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f64238a, false, 72700, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72701, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72701, new Class[0], Void.TYPE);
        } else {
            MapLayout mapLayout = (MapLayout) a(C0906R.id.c23);
            Intrinsics.checkExpressionValueIsNotNull(mapLayout, "poi_map");
            this.f64239b = mapLayout;
            View a2 = a(C0906R.id.d3v);
            if (a2 != null) {
                this.w = (ButtonTitleBar) a2;
                DmtEditText dmtEditText = (DmtEditText) a(C0906R.id.b7h);
                Intrinsics.checkExpressionValueIsNotNull(dmtEditText, "lat_value");
                this.f64241d = dmtEditText;
                DmtEditText dmtEditText2 = (DmtEditText) a(C0906R.id.biw);
                Intrinsics.checkExpressionValueIsNotNull(dmtEditText2, "lng_value");
                this.f64240c = dmtEditText2;
                ButtonTitleBar buttonTitleBar = this.w;
                if (buttonTitleBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mButtonTitleBar");
                }
                DmtTextView titleView = buttonTitleBar.getTitleView();
                Intrinsics.checkExpressionValueIsNotNull(titleView, "mButtonTitleBar.titleView");
                this.x = titleView;
                TextView textView = (TextView) a(C0906R.id.fg);
                Intrinsics.checkExpressionValueIsNotNull(textView, "apply_latlng");
                this.y = textView;
                ButtonTitleBar buttonTitleBar2 = this.w;
                if (buttonTitleBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mButtonTitleBar");
                }
                buttonTitleBar2.getStartBtn().setOnClickListener(new b(this));
                ButtonTitleBar buttonTitleBar3 = this.w;
                if (buttonTitleBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mButtonTitleBar");
                }
                buttonTitleBar3.getEndBtn().setOnClickListener(new c(this));
                TextView textView2 = this.y;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mApply");
                }
                textView2.setOnClickListener(new d(this));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
            }
        }
        DmtTextView dmtTextView = this.x;
        if (dmtTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitle");
        }
        dmtTextView.setText(z);
        ButtonTitleBar buttonTitleBar4 = this.w;
        if (buttonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mButtonTitleBar");
        }
        DmtTextView endBtn = buttonTitleBar4.getEndBtn();
        Intrinsics.checkExpressionValueIsNotNull(endBtn, "mButtonTitleBar.endBtn");
        endBtn.setVisibility(0);
        ButtonTitleBar buttonTitleBar5 = this.w;
        if (buttonTitleBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mButtonTitleBar");
        }
        buttonTitleBar5.getEndBtn().setText(C0906R.string.c12);
        if (com.ss.android.g.a.c() || com.ss.android.ugc.aweme.poi.e.e.j()) {
            z2 = true;
        } else {
            z2 = false;
        }
        MapLayout mapLayout2 = this.f64239b;
        if (mapLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout2.a(bundle, z2, q.b(), cf.b(), (h) this);
        MapLayout mapLayout3 = this.f64239b;
        if (mapLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout3.setOnMapClickListener(this);
        if (bundle == null) {
            if (PatchProxy.isSupport(new Object[0], this, f64238a, false, 72708, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f64238a, false, 72708, new Class[0], Void.TYPE);
            } else {
                this.f64243f = 116.4074d;
                this.f64242e = 39.9042d;
                DmtEditText dmtEditText3 = this.f64241d;
                if (dmtEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLat");
                }
                dmtEditText3.setText(String.valueOf(this.f64242e));
                DmtEditText dmtEditText4 = this.f64240c;
                if (dmtEditText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLng");
                }
                dmtEditText4.setText(String.valueOf(this.f64243f));
            }
        } else {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, f64238a, false, 72709, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, f64238a, false, 72709, new Class[]{Bundle.class}, Void.TYPE);
            } else {
                this.f64242e = bundle.getDouble("latitude");
                this.f64243f = bundle.getDouble("longitude");
                DmtEditText dmtEditText5 = this.f64241d;
                if (dmtEditText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLat");
                }
                dmtEditText5.setText(String.valueOf(this.f64242e));
                DmtEditText dmtEditText6 = this.f64240c;
                if (dmtEditText6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mLng");
                }
                dmtEditText6.setText(String.valueOf(this.f64243f));
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestPoiMapPickUpActivity", "onCreate", false);
    }

    public final void a(double d2, double d3) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f64238a, false, 72707, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2), Double.valueOf(d3)}, this, f64238a, false, 72707, new Class[]{Double.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        DmtEditText dmtEditText = this.f64241d;
        if (dmtEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLat");
        }
        dmtEditText.setText(String.valueOf(d2));
        DmtEditText dmtEditText2 = this.f64240c;
        if (dmtEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLng");
        }
        dmtEditText2.setText(String.valueOf(d3));
        this.f64242e = d2;
        this.f64243f = d3;
        MapLayout mapLayout = this.f64239b;
        if (mapLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPoiMap");
        }
        mapLayout.a(BitmapFactory.decodeResource(getResources(), 2130839668), this.f64242e, this.f64243f);
    }
}
