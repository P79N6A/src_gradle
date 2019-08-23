package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.ies.dmt.ui.widget.setting.SettingItemSwitch;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class TestPoiOverseasActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64265a;

    /* renamed from: b  reason: collision with root package name */
    private TestPoiOverseasActivity f64266b;

    /* renamed from: c  reason: collision with root package name */
    private View f64267c;

    /* renamed from: d  reason: collision with root package name */
    private View f64268d;

    /* renamed from: e  reason: collision with root package name */
    private View f64269e;

    /* renamed from: f  reason: collision with root package name */
    private View f64270f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64265a, false, 72738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64265a, false, 72738, new Class[0], Void.TYPE);
            return;
        }
        TestPoiOverseasActivity testPoiOverseasActivity = this.f64266b;
        if (testPoiOverseasActivity != null) {
            this.f64266b = null;
            testPoiOverseasActivity.fakeGps = null;
            testPoiOverseasActivity.mSchemaEditText = null;
            testPoiOverseasActivity.mTxtLat = null;
            testPoiOverseasActivity.mTxtLng = null;
            testPoiOverseasActivity.mTxtApply = null;
            testPoiOverseasActivity.latValue = null;
            testPoiOverseasActivity.lngValue = null;
            testPoiOverseasActivity.mTitle = null;
            testPoiOverseasActivity.mMccMnc = null;
            testPoiOverseasActivity.mLocationList = null;
            testPoiOverseasActivity.mMapGetPoint = null;
            this.f64267c.setOnClickListener(null);
            this.f64267c = null;
            this.f64268d.setOnClickListener(null);
            this.f64268d = null;
            this.f64269e.setOnClickListener(null);
            this.f64269e = null;
            this.f64270f.setOnClickListener(null);
            this.f64270f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public TestPoiOverseasActivity_ViewBinding(final TestPoiOverseasActivity testPoiOverseasActivity, View view) {
        this.f64266b = testPoiOverseasActivity;
        testPoiOverseasActivity.fakeGps = (SettingItemSwitch) Utils.findRequiredViewAsType(view, C0906R.id.a_0, "field 'fakeGps'", SettingItemSwitch.class);
        testPoiOverseasActivity.mSchemaEditText = (DmtEditText) Utils.findRequiredViewAsType(view, C0906R.id.cju, "field 'mSchemaEditText'", DmtEditText.class);
        testPoiOverseasActivity.mTxtLat = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.b7g, "field 'mTxtLat'", TextView.class);
        testPoiOverseasActivity.mTxtLng = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.biv, "field 'mTxtLng'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.fg, "field 'mTxtApply' and method 'onConfigPoiOverseas'");
        testPoiOverseasActivity.mTxtApply = (TextView) Utils.castView(findRequiredView, C0906R.id.fg, "field 'mTxtApply'", TextView.class);
        this.f64267c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64271a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64271a, false, 72739, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64271a, false, 72739, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                testPoiOverseasActivity.onConfigPoiOverseas();
            }
        });
        testPoiOverseasActivity.latValue = (DmtEditText) Utils.findRequiredViewAsType(view, C0906R.id.b7h, "field 'latValue'", DmtEditText.class);
        testPoiOverseasActivity.lngValue = (DmtEditText) Utils.findRequiredViewAsType(view, C0906R.id.biw, "field 'lngValue'", DmtEditText.class);
        testPoiOverseasActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        testPoiOverseasActivity.mMccMnc = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.bm1, "field 'mMccMnc'", TextView.class);
        testPoiOverseasActivity.mLocationList = (RecyclerView) Utils.findRequiredViewAsType(view, C0906R.id.bjz, "field 'mLocationList'", RecyclerView.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.blc, "field 'mMapGetPoint' and method 'mapGetPoint'");
        testPoiOverseasActivity.mMapGetPoint = (TextView) Utils.castView(findRequiredView2, C0906R.id.blc, "field 'mMapGetPoint'", TextView.class);
        this.f64268d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64274a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64274a, false, 72740, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64274a, false, 72740, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                testPoiOverseasActivity.mapGetPoint();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.b71, "method 'schemaJump'");
        this.f64269e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64277a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64277a, false, 72741, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64277a, false, 72741, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                testPoiOverseasActivity.schemaJump();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, C0906R.id.ix, "method 'exit'");
        this.f64270f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64280a;

            public final void doClick(View view) {
                View view2 = view;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f64280a, false, 72742, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f64280a, false, 72742, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                testPoiOverseasActivity.exit(view2);
            }
        });
    }
}
