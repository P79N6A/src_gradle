package com.ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.shortvideo.sticker.m;
import com.ss.android.ugc.aweme.sticker.IStickerViewService;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.tools.bb;

public class StickerViewServiceImpl implements IStickerViewService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private m mIStickerView;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f69649a;

        a() {
        }

        /* access modifiers changed from: package-private */
        public final bb a(UrlModel urlModel) {
            if (PatchProxy.isSupport(new Object[]{urlModel}, this, f69649a, false, 79226, new Class[]{UrlModel.class}, bb.class)) {
                return (bb) PatchProxy.accessDispatch(new Object[]{urlModel}, this, f69649a, false, 79226, new Class[]{UrlModel.class}, bb.class);
            }
            bb bbVar = new bb();
            bbVar.f74652b = urlModel.getUri();
            bbVar.f74653c = urlModel.getUrlList();
            return bbVar;
        }
    }

    public String getFaceTrackPath() {
        return "face_track.model";
    }

    public void hideStickerView() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 79218, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 79218, new Class[0], Void.TYPE);
            return;
        }
        if (this.mIStickerView != null) {
            this.mIStickerView.a();
        }
    }

    public boolean isShowStickerView() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 79220, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 79220, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mIStickerView != null && this.mIStickerView.b()) {
            z = true;
        }
        return z;
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 79219, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 79219, new Class[0], Void.TYPE);
            return;
        }
        if (this.mIStickerView != null) {
            this.mIStickerView.c();
            this.mIStickerView = null;
        }
    }

    public String getStickerFilePath(IStickerService.FaceSticker faceSticker) {
        return faceSticker.localPath;
    }

    public static IStickerService.FaceSticker toFaceSticker(FaceStickerBean faceStickerBean) {
        FaceStickerBean faceStickerBean2 = faceStickerBean;
        if (PatchProxy.isSupport(new Object[]{faceStickerBean2}, null, changeQuickRedirect, true, 79215, new Class[]{FaceStickerBean.class}, IStickerService.FaceSticker.class)) {
            return (IStickerService.FaceSticker) PatchProxy.accessDispatch(new Object[]{faceStickerBean2}, null, changeQuickRedirect, true, 79215, new Class[]{FaceStickerBean.class}, IStickerService.FaceSticker.class);
        } else if (faceStickerBean2 == null || faceStickerBean2 == FaceStickerBean.NONE) {
            return null;
        } else {
            a aVar = new a();
            IStickerService.FaceSticker faceSticker = new IStickerService.FaceSticker();
            faceSticker.id = (int) faceStickerBean.getId();
            faceSticker.stickerId = faceStickerBean.getStickerId();
            faceSticker.fileUrl = aVar.a(faceStickerBean.getFileUrl());
            faceSticker.iconUrl = aVar.a(faceStickerBean.getIconUrl());
            faceSticker.localPath = faceStickerBean.getLocalPath();
            faceSticker.name = faceStickerBean.getName();
            faceSticker.hint = faceStickerBean.getHint();
            faceSticker.types = faceStickerBean.getTypes();
            return faceSticker;
        }
    }

    public void showStickerView(@NonNull AppCompatActivity appCompatActivity, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull IStickerViewService.a aVar) {
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, str, frameLayout, aVar}, this, changeQuickRedirect, false, 79216, new Class[]{AppCompatActivity.class, String.class, FrameLayout.class, IStickerViewService.a.class}, Void.TYPE)) {
            Object[] objArr = {appCompatActivity, str, frameLayout, aVar};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 79216, new Class[]{AppCompatActivity.class, String.class, FrameLayout.class, IStickerViewService.a.class}, Void.TYPE);
            return;
        }
        showStickerView(appCompatActivity, appCompatActivity.getSupportFragmentManager(), str, frameLayout, aVar);
    }

    public void showStickerView(@NonNull AppCompatActivity appCompatActivity, @NonNull FragmentManager fragmentManager, @NonNull String str, @NonNull FrameLayout frameLayout, @NonNull IStickerViewService.a aVar) {
        final IStickerViewService.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{appCompatActivity, fragmentManager, str, frameLayout, aVar2}, this, changeQuickRedirect, false, 79217, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, IStickerViewService.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{appCompatActivity, fragmentManager, str, frameLayout, aVar2}, this, changeQuickRedirect, false, 79217, new Class[]{AppCompatActivity.class, FragmentManager.class, String.class, FrameLayout.class, IStickerViewService.a.class}, Void.TYPE);
            return;
        }
        if (this.mIStickerView == null) {
            this.mIStickerView = new EffectStickerViewImpl();
        }
        this.mIStickerView.a(appCompatActivity, appCompatActivity, fragmentManager, str, frameLayout, new m.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f69646a;

            public final void a(@NonNull FaceStickerBean faceStickerBean) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69646a, false, 79223, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69646a, false, 79223, new Class[]{FaceStickerBean.class}, Void.TYPE);
                    return;
                }
                aVar2.a(StickerViewServiceImpl.toFaceSticker(faceStickerBean));
            }

            public final void b(@NonNull FaceStickerBean faceStickerBean) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69646a, false, 79224, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69646a, false, 79224, new Class[]{FaceStickerBean.class}, Void.TYPE);
                    return;
                }
                aVar2.b(StickerViewServiceImpl.toFaceSticker(faceStickerBean));
            }

            public final void c(@NonNull FaceStickerBean faceStickerBean) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f69646a, false, 79225, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f69646a, false, 79225, new Class[]{FaceStickerBean.class}, Void.TYPE);
                    return;
                }
                aVar2.a(StickerViewServiceImpl.toFaceSticker(faceStickerBean));
            }

            public final void a(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean, str}, this, f69646a, false, 79221, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean, str}, this, f69646a, false, 79221, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                    return;
                }
                StickerViewServiceImpl.toFaceSticker(faceStickerBean);
            }

            public final void b(@Nullable FaceStickerBean faceStickerBean, @Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{faceStickerBean, str}, this, f69646a, false, 79222, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{faceStickerBean, str}, this, f69646a, false, 79222, new Class[]{FaceStickerBean.class, String.class}, Void.TYPE);
                    return;
                }
                StickerViewServiceImpl.toFaceSticker(faceStickerBean);
            }
        });
    }
}
