package com.ss.android.ugc.aweme.photo.publish;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import java.util.Map;

public class PhotoPublishActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58634a;

    /* renamed from: b  reason: collision with root package name */
    private PhotoContext f58635b;

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58634a, false, 63727, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58634a, false, 63727, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58634a, false, 63728, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58634a, false, 63728, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f58634a, false, 63726, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58634a, false, 63726, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.onBackPressed();
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58634a, false, 63725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58634a, false, 63725, new Class[0], Void.TYPE);
            return;
        }
        PhotoContext e2 = ((PhotoPublishFragment) getSupportFragmentManager().findFragmentById(C0906R.id.aic)).e();
        Intent intent = new Intent();
        intent.putExtra("photo_model", e2);
        setResult(-1, intent);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131492929})
    public void onClick(@NonNull View view) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view}, this, f58634a, false, 63723, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58634a, false, 63723, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.iu) {
            r.onEvent(MobClick.obtain().setEventName("back_to_edit").setLabelName("edit_page").setJsonObject(new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a()));
            d a2 = d.a().a("creation_id", this.f58635b.creationId).a("shoot_way", this.f58635b.mShootWay).a("draft_id", this.f58635b.draftId).a("content_type", "photo").a("filter_list", this.f58635b.mFilterName).a("filter_id_list", this.f58635b.mFilterId);
            if (this.f58635b.mPhotoFrom == 0) {
                str = "upload";
            } else {
                str = "shoot";
            }
            r.a("enter_video_edit_page", (Map) a2.a("content_source", str).f34114b);
            a();
            ActivityCompat.finishAfterTransition(this);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        PhotoPublishFragment photoPublishFragment;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58634a, false, 63724, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58634a, false, 63724, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.cx);
        this.f58635b = (PhotoContext) getIntent().getSerializableExtra("photo_model");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (((PhotoPublishFragment) supportFragmentManager.findFragmentById(C0906R.id.aic)) == null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            PhotoContext photoContext = this.f58635b;
            if (PatchProxy.isSupport(new Object[]{photoContext}, null, PhotoPublishFragment.f58642a, true, 63731, new Class[]{PhotoContext.class}, PhotoPublishFragment.class)) {
                photoPublishFragment = (PhotoPublishFragment) PatchProxy.accessDispatch(new Object[]{photoContext}, null, PhotoPublishFragment.f58642a, true, 63731, new Class[]{PhotoContext.class}, PhotoPublishFragment.class);
            } else {
                PhotoPublishFragment photoPublishFragment2 = new PhotoPublishFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("photo_model", photoContext);
                photoPublishFragment2.setArguments(bundle2);
                photoPublishFragment = photoPublishFragment2;
            }
            beginTransaction.add((int) C0906R.id.aic, (Fragment) photoPublishFragment).commit();
        }
        d a2 = d.a().a("creation_id", this.f58635b.creationId).a("shoot_way", this.f58635b.mShootWay).a("draft_id", this.f58635b.draftId).a("filter_list", this.f58635b.mFilterName).a("filter_id_list", this.f58635b.mFilterId).a("content_type", "photo");
        if (this.f58635b.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        r.a("enter_video_post_page", (Map) a2.a("content_source", str).f34114b);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.publish.PhotoPublishActivity", "onCreate", false);
    }
}
