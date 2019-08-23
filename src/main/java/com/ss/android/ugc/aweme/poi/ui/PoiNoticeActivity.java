package com.ss.android.ugc.aweme.poi.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.statusbar.StatusBarUtils;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0014J\b\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/PoiNoticeActivity;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PoiNoticeActivity extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60440a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f60441b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/ui/PoiNoticeActivity$Companion;", "", "()V", "INTENT_DATA", "", "INTENT_TITLE", "open", "", "context", "Landroid/content/Context;", "name", "data", "Lcom/ss/android/ugc/aweme/feed/model/poi/PoiClassRankBannerStruct;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60442a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/ugc/aweme/poi/ui/PoiNoticeActivity$onCreate$1$1"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60443a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PoiNoticeActivity f60444b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef f60445c;

        b(PoiNoticeActivity poiNoticeActivity, Ref.ObjectRef objectRef) {
            this.f60444b = poiNoticeActivity;
            this.f60445c = objectRef;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f60443a, false, 66063, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f60443a, false, 66063, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f60444b.finish();
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f60440a, false, 66060, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60440a, false, 66060, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f60440a, false, 66061, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f60440a, false, 66061, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f60440a, false, 66056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60440a, false, 66056, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f60440a, false, 66055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60440a, false, 66055, new Class[0], Void.TYPE);
        } else if (com.ss.android.g.a.b()) {
            ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) C0906R.color.w1).init();
        } else {
            ImmersionBar.with((Activity) this).statusBarColor((int) C0906R.color.yx).init();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f60440a, false, 66054, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f60440a, false, 66054, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.d3);
        if (Build.VERSION.SDK_INT >= 19) {
            View findViewById = findViewById(C0906R.id.cv0);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<View>(R.id.status_bar)");
            findViewById.getLayoutParams().height = StatusBarUtils.getStatusBarHeight(this);
        }
        Serializable serializableExtra = getIntent().getSerializableExtra("INTENT_DATA");
        if (serializableExtra != null) {
            PoiClassRankBannerStruct poiClassRankBannerStruct = (PoiClassRankBannerStruct) serializableExtra;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = getIntent().getStringExtra("INTENT_TITLE");
            if (poiClassRankBannerStruct != null) {
                View findViewById2 = findViewById(C0906R.id.brp);
                Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById<TextView>(R.id.notice_title)");
                ((TextView) findViewById2).setText((String) objectRef.element);
                View findViewById3 = findViewById(C0906R.id.bro);
                Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById<TextView>(R.id.notice_summary)");
                ((TextView) findViewById3).setText(poiClassRankBannerStruct.getTitle());
                View findViewById4 = findViewById(C0906R.id.bri);
                Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById<TextView>(R.id.notice_content)");
                ((TextView) findViewById4).setText(poiClassRankBannerStruct.getDescription());
                c.b((RemoteImageView) findViewById(C0906R.id.brn), poiClassRankBannerStruct.getBannerUrl());
                findViewById(C0906R.id.brg).setOnClickListener(new b(this, objectRef));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.PoiNoticeActivity", "onCreate", false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.poi.PoiClassRankBannerStruct");
    }
}
