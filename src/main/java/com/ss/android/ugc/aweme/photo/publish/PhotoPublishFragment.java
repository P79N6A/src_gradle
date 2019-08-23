package com.ss.android.ugc.aweme.photo.publish;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.f;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.commercialize.model.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.t;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.photo.k;
import com.ss.android.ugc.aweme.port.in.m;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PoiAndGoodsPublishModel;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.PublishPermissionActivity;
import com.ss.android.ugc.aweme.shortvideo.bw;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.shortvideo.edit.cg;
import com.ss.android.ugc.aweme.shortvideo.ek;
import com.ss.android.ugc.aweme.shortvideo.gy;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.publish.a;
import com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.tools.a.e;
import com.ss.android.ugc.aweme.tools.a.g;
import java.util.List;
import java.util.Map;

public class PhotoPublishFragment extends Fragment implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58642a;

    /* renamed from: b  reason: collision with root package name */
    a f58643b = new a();

    /* renamed from: c  reason: collision with root package name */
    gy f58644c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58645d;

    /* renamed from: e  reason: collision with root package name */
    View.OnTouchListener f58646e = new View.OnTouchListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58652a;

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f58652a, false, 63751, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f58652a, false, 63751, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
            }
            cg.a((Activity) PhotoPublishFragment.this.getActivity());
            return false;
        }
    };

    /* renamed from: f  reason: collision with root package name */
    private PhotoContext f58647f;
    private bw g;
    private ek h;
    private List<Pair<Class<?>, IAVPublishExtension<?>>> i = com.ss.android.ugc.aweme.port.in.a.t.a(AVPublishContentType.Photo);
    @BindView(2131493377)
    LinearLayout mLayoutSettingContainer;
    @BindView(2131493497)
    PermissionSettingItem mPermissionSettingItem;
    @BindView(2131493247)
    ImageView mPhotoThumbView;

    public void onHiddenChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58642a, false, 63742, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58642a, false, 63742, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f58642a, false, 63744, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58642a, false, 63744, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f58642a, false, 63743, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58642a, false, 63743, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58642a, false, 63745, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58642a, false, 63745, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final String a() {
        if (this.f58647f == null) {
            return null;
        }
        return this.f58647f.commerceData;
    }

    public final boolean b() {
        if (this.f58647f == null || this.f58647f.microAppModel == null) {
            return false;
        }
        return true;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f58642a, false, 63736, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58642a, false, 63736, new Class[0], Void.TYPE);
            return;
        }
        a(getView(), null);
        super.onDestroyView();
        this.h.c();
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.i) {
            ((IAVPublishExtension) pair.second).onDestroy();
        }
    }

    public final PhotoContext e() {
        if (PatchProxy.isSupport(new Object[0], this, f58642a, false, 63741, new Class[0], PhotoContext.class)) {
            return (PhotoContext) PatchProxy.accessDispatch(new Object[0], this, f58642a, false, 63741, new Class[0], PhotoContext.class);
        }
        this.f58644c.b();
        this.f58647f.mText = this.f58644c.c();
        if (this.f58644c.d() != null) {
            this.f58647f.mExtras = this.f58644c.d();
        }
        this.f58647f.mIsPrivate = this.mPermissionSettingItem.getPermission();
        this.f58647f.mPoiId = ((PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.i, PoiAndGoodsPublishModel.class)).getPoiContext();
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.i) {
            ((IAVPublishExtension) pair.second).onBackPressed(k.a(this.f58647f));
        }
        return this.f58647f;
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f58642a, false, 63733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58642a, false, 63733, new Class[0], Void.TYPE);
        } else if (!com.ss.android.ugc.aweme.port.in.a.x.c()) {
            com.ss.android.ugc.aweme.port.in.a.x.a((Fragment) this, "photo_post_page", "click_post", (Bundle) null, (f.a) null);
        } else {
            PoiAndGoodsPublishModel poiAndGoodsPublishModel = (PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.i, PoiAndGoodsPublishModel.class);
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a().a("creation_id", this.f58647f.creationId).a("shoot_way", this.f58647f.mShootWay).a("filter_list", this.f58647f.mFilterName).a("filter_id_list", this.f58647f.mFilterId).a("prop_selected_from", this.f58647f.mPropSource).a("privacy_status", Publish.a(this.mPermissionSettingItem.getPermission())).a("content_type", "photo");
            if (this.f58647f.mPhotoFrom == 0) {
                str = "upload";
            } else {
                str = "shoot";
            }
            Map<String, String> map = a2.a("content_source", str).a("enter_from", "video_post_page").f34114b;
            if (poiAndGoodsPublishModel.getMobParams() != null) {
                map.putAll(poiAndGoodsPublishModel.getMobParams());
            }
            r.a("publish", (Map) map);
            this.f58644c.b("publish");
            if (Build.VERSION.SDK_INT < 18 || com.ss.android.ugc.aweme.port.in.a.j.a() || com.ss.android.ugc.aweme.port.in.a.j.b()) {
                d();
                return;
            }
            ((ViewGroup) getActivity().getWindow().getDecorView()).getOverlay().add(this.mPhotoThumbView);
            float dip2Px = UIUtils.dip2Px(getActivity(), 76.0f) / ((float) this.mPhotoThumbView.getMeasuredWidth());
            this.mPhotoThumbView.animate().translationY((-this.mPhotoThumbView.getY()) + ((float) p.c())).translationX(-UIUtils.dip2Px(getActivity(), 5.0f)).scaleX(dip2Px).scaleY(UIUtils.dip2Px(getActivity(), 96.0f) / ((float) this.mPhotoThumbView.getMeasuredHeight())).alpha(0.0f).setDuration(1000).setListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58650a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f58650a, false, 63750, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f58650a, false, 63750, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    PhotoPublishFragment.this.d();
                }

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f58650a, false, 63749, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f58650a, false, 63749, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    PhotoPublishFragment.this.getActivity().findViewById(16908290).setVisibility(4);
                }
            }).start();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58642a, false, 63737, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58642a, false, 63737, new Class[0], Void.TYPE);
            return;
        }
        this.f58647f.updatePhotoPath();
        if (getActivity() != null) {
            getActivity().finish();
            this.f58644c.b();
            this.f58647f.mText = this.f58644c.c();
            if (this.f58644c.d() != null) {
                this.f58647f.mExtras = this.f58644c.d();
            }
            PoiAndGoodsPublishModel poiAndGoodsPublishModel = (PoiAndGoodsPublishModel) AVPublishExtensionUtils.findModel(this.i, PoiAndGoodsPublishModel.class);
            this.f58647f.mIsPrivate = this.mPermissionSettingItem.getPermission();
            this.f58647f.mPoiId = poiAndGoodsPublishModel.getPoiContext();
            this.f58647f.mLatitude = poiAndGoodsPublishModel.getLatitude();
            this.f58647f.mLongitude = poiAndGoodsPublishModel.getLongitude();
            this.f58647f.mSyncPlatforms = this.h.a();
            this.h.a(this.f58647f.mSyncPlatforms, 1);
            if (!TextUtils.isEmpty(poiAndGoodsPublishModel.getGoodsDraftId())) {
                this.f58647f.shopDraftId = poiAndGoodsPublishModel.getGoodsDraftId();
            }
            g.a(com.ss.android.ugc.aweme.shortvideo.r.b(this.f58647f), com.ss.android.ugc.aweme.shortvideo.r.a(this.f58647f), e.PUBLISH, e.SEND_REQUEST);
            Bundle bundle = new Bundle();
            bundle.putSerializable("extra_photo_publish_args", this.f58647f);
            bundle.putString("shoot_way", this.f58647f.mShootWay);
            bundle.putInt("video_type", 5);
            bundle.putBoolean("enter_record_from_other_platform", this.f58647f.mFromOtherPlatform);
            ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().startPublish(getActivity(), bundle);
            r.onEvent(MobClick.obtain().setEventName("publish").setLabelName("submit").setJsonObject(new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a()));
            for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.i) {
                ((IAVPublishExtension) pair.second).onPublish(k.a(this.f58647f));
            }
        }
    }

    public final void a(String str) {
        if (this.f58647f != null) {
            this.f58647f.commerceData = str;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f58642a, false, 63739, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f58642a, false, 63739, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onSaveInstanceState(bundle);
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.i) {
            ((IAVPublishExtension) pair.second).onSaveInstanceState(bundle);
        }
        bundle.putInt("permission", this.mPermissionSettingItem.getPermission());
        bundle.putSerializable("challenge", this.f58643b.f68864b);
        bundle.putBoolean("contentModified", this.f58645d);
    }

    /* access modifiers changed from: package-private */
    @OnClick({2131493497, 2131492905, 2131493523, 2131493247})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f58642a, false, 63732, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f58642a, false, 63732, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.bxe) {
            PublishPermissionActivity.a(this, 5, this.mPermissionSettingItem.getPermission(), C0906R.string.afe, C0906R.string.afd, 2);
            r.onEvent(MobClick.obtain().setEventName("scope_click").setLabelName("edit_page").setJsonObject(new t().a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a()));
        } else if (id != C0906R.id.c8h) {
            if (id == C0906R.id.ar7) {
                FragmentActivity activity = getActivity();
                PhotoContext photoContext = this.f58647f;
                ImageView imageView = this.mPhotoThumbView;
                if (PatchProxy.isSupport(new Object[]{activity, photoContext, imageView}, null, PhotoPreviewActivity.f58626a, true, 63709, new Class[]{Activity.class, PhotoContext.class, View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{activity, photoContext, imageView}, null, PhotoPreviewActivity.f58626a, true, 63709, new Class[]{Activity.class, PhotoContext.class, View.class}, Void.TYPE);
                    return;
                }
                Intent intent = new Intent();
                intent.setClass(activity, PhotoPreviewActivity.class);
                intent.putExtra("photo_model", photoContext);
                ViewCompat.setTransitionName(imageView, "photo_preview_transition");
                activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(activity, imageView, "photo_preview_transition").toBundle());
            }
        } else if (com.ss.android.ugc.aweme.port.in.a.x.b()) {
            com.bytedance.ies.dmt.ui.d.a.c(getContext(), (int) C0906R.string.chy).a();
        } else if (this.mPermissionSettingItem.getPermission() == 1) {
            c();
        } else {
            com.ss.android.ugc.aweme.port.in.a.f61121d.a(getContext(), (m.a) new m.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f58648a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f58648a, false, 63748, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f58648a, false, 63748, new Class[0], Void.TYPE);
                        return;
                    }
                    com.bytedance.ies.dmt.ui.d.a.b(PhotoPublishFragment.this.getContext(), PhotoPublishFragment.this.getString(C0906R.string.mp)).a();
                }

                public final void a(boolean z) {
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f58648a, false, 63747, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f58648a, false, 63747, new Class[]{Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z) {
                        PhotoPublishFragment.this.mPermissionSettingItem.setPermission(1);
                        PhotoPublishFragment.this.f58645d = true;
                    }
                    PhotoPublishFragment.this.c();
                }
            });
        }
    }

    private void a(View view, View.OnTouchListener onTouchListener) {
        View view2 = view;
        View.OnTouchListener onTouchListener2 = onTouchListener;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{view2, onTouchListener2}, this, f58642a, false, 63740, new Class[]{View.class, View.OnTouchListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, onTouchListener2}, this, f58642a, false, 63740, new Class[]{View.class, View.OnTouchListener.class}, Void.TYPE);
            return;
        }
        if (!(view2 instanceof EditText)) {
            view.setOnTouchListener(onTouchListener);
        }
        if (view2 instanceof ViewGroup) {
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view2;
                if (i2 >= viewGroup.getChildCount()) {
                    break;
                }
                a(viewGroup.getChildAt(i2), onTouchListener2);
                i2++;
            }
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        gy gyVar;
        List<AVTextExtraStruct> list;
        View view2 = view;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{view2, bundle2}, this, f58642a, false, 63735, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, bundle2}, this, f58642a, false, 63735, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        ButterKnife.bind((Object) this, view);
        a(view2, this.f58646e);
        this.f58647f = (PhotoContext) getArguments().getSerializable("photo_model");
        HashTagMentionEditText hashTagMentionEditText = (HashTagMentionEditText) view2.findViewById(C0906R.id.a92);
        View findViewById = view2.findViewById(C0906R.id.g2);
        View findViewById2 = view2.findViewById(C0906R.id.g1);
        if (PatchProxy.isSupport(new Object[]{this, hashTagMentionEditText, findViewById, findViewById2, 0}, null, gy.f68017a, true, 74779, new Class[]{Fragment.class, HashTagMentionEditText.class, View.class, View.class, Integer.TYPE}, gy.class)) {
            gyVar = (gy) PatchProxy.accessDispatch(new Object[]{this, hashTagMentionEditText, findViewById, findViewById2, 0}, null, gy.f68017a, true, 74779, new Class[]{Fragment.class, HashTagMentionEditText.class, View.class, View.class, Integer.TYPE}, gy.class);
        } else {
            gyVar = new gy(this, hashTagMentionEditText, findViewById, findViewById2, 0, 1);
        }
        this.f58644c = gyVar;
        this.g = bw.a(this.f58644c, view2);
        this.h = ek.a((Fragment) this, view);
        this.h.a(this.f58647f.mShootWay);
        this.f58644c.a();
        this.f58644c.a(this.f58647f.mText);
        gy gyVar2 = this.f58644c;
        if (this.f58647f.mExtras == null) {
            list = null;
        } else {
            list = this.f58647f.mExtras;
        }
        gyVar2.b(list);
        this.f58644c.a(this.f58647f.challenges);
        if (this.f58647f.microAppModel != null) {
            this.f58644c.a(this.f58647f.microAppModel);
        }
        this.mPermissionSettingItem.setPermission(this.f58647f.mIsPrivate);
        if (!com.ss.android.g.a.a()) {
            this.h.f67535b.a(getString(C0906R.string.btc));
        }
        if (bundle2 != null) {
            this.f58643b.f68864b = (c) bundle2.getSerializable("challenge");
            this.mPermissionSettingItem.setPermission(bundle2.getInt("permission"));
            this.f58645d = bundle2.getBoolean("contentModified");
        }
        Fresco.getImagePipeline().evictFromMemoryCache(this.f58647f.getTmpPhotoUri(com.ss.android.ugc.aweme.port.in.a.f61119b));
        this.mPhotoThumbView.setImageURI(this.f58647f.getTmpPhotoUri(com.ss.android.ugc.aweme.port.in.a.f61119b));
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.i) {
            AVPublishContentType aVPublishContentType = AVPublishContentType.Photo;
            PublishOutput a2 = k.a(this.f58647f);
            ExtensionMisc extensionMisc = new ExtensionMisc(this.f58647f.poiData, this.f58647f.defaultSelectStickerPoi, this.f58647f.mPoiId, b(), this.f58647f.commerceData, null, true);
            ((IAVPublishExtension) pair.second).onCreate(this, (LinearLayout) view2.findViewById(C0906R.id.abb), bundle, aVPublishContentType, a2, extensionMisc, new d(this));
        }
        com.ss.android.ugc.aweme.port.in.a.t.a(AVPublishContentType.Photo, this.i);
        this.g.a(this, true, bw.f65843c);
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58642a, false, 63734, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.pg, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f58642a, false, 63734, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58642a, false, 63738, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f58642a, false, 63738, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        for (Pair<Class<?>, IAVPublishExtension<?>> pair : this.i) {
            ((IAVPublishExtension) pair.second).onActivityResult(i4, i5, intent2);
        }
        this.h.a(i4, i5, intent2);
        this.f58643b.f68864b = com.ss.android.ugc.aweme.port.in.a.f61122e.a(i4, i5, intent2, 1);
        if (i4 == 1) {
            this.f58645d = true;
        }
        if (i4 == 2 && i5 == -1 && intent2 != null) {
            int intExtra = intent2.getIntExtra("extra.PERMISSION", 0);
            this.mPermissionSettingItem.setPermission(intExtra);
            this.f58645d = true;
            r.onEvent(MobClick.obtain().setEventName("scope_control").setLabelName("edit_page").setJsonObject(new t().a("to_status", Publish.a(intExtra)).a("is_photo", PushConstants.PUSH_TYPE_THROUGH_MESSAGE).a()));
        }
        if (i4 == 3 && i5 == -1) {
            this.f58644c.a(intent2);
            this.f58645d = true;
        }
    }
}
