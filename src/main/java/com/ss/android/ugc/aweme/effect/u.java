package com.ss.android.ugc.aweme.effect;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.shortvideo.cover.EffectVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverAdapter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.a;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.shortvideo.widget.n;
import java.util.List;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43778a;

    /* renamed from: b  reason: collision with root package name */
    private final VEEffectHelper f43779b;

    public u(VEEffectHelper vEEffectHelper) {
        this.f43779b = vEEffectHelper;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f43778a, false, 38722, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43778a, false, 38722, new Class[0], Void.TYPE);
            return;
        }
        VEEffectHelper vEEffectHelper = this.f43779b;
        int frameHeight = vEEffectHelper.mChooseVideoCoverView.getFrameHeight();
        int frameWidth = vEEffectHelper.mChooseVideoCoverView.getFrameWidth();
        int ceil = (int) Math.ceil((double) (((float) (UIUtils.getScreenWidth(vEEffectHelper.G) - (Math.round(UIUtils.dip2Px(vEEffectHelper.G, 16.0f)) * 2))) / (((float) frameWidth) * 1.0f)));
        vEEffectHelper.mChooseVideoCoverView.setCoverSize(ceil);
        EffectVideoCoverGeneratorImpl effectVideoCoverGeneratorImpl = new EffectVideoCoverGeneratorImpl(vEEffectHelper.G, vEEffectHelper.f3086b.isReverse() ? vEEffectHelper.f3086b.mReversePath : vEEffectHelper.f3086b.mPath, vEEffectHelper.f3086b.mEffectList, w.a(vEEffectHelper.f3086b.mSelectedId).j, vEEffectHelper.mChooseVideoCoverView.getCoverSize(), vEEffectHelper.f3086b.isReverse(), vEEffectHelper.f3086b.previewConfigure);
        vEEffectHelper.q = effectVideoCoverGeneratorImpl;
        vEEffectHelper.t = new n(vEEffectHelper.q, frameWidth, frameHeight, ceil);
        if (vEEffectHelper.f3086b.isMvThemeVideoType()) {
            MvChooseCoverAdapter mvChooseCoverAdapter = new MvChooseCoverAdapter(frameWidth, frameHeight);
            vEEffectHelper.mChooseVideoCoverView.setAdapter(mvChooseCoverAdapter);
            new a().b(vEEffectHelper.Q).a(vEEffectHelper.P).a(frameWidth, frameHeight).a(vEEffectHelper.G, vEEffectHelper.r, ceil, new x(mvChooseCoverAdapter));
            vEEffectHelper.mChooseVideoCoverView.setAdapter(mvChooseCoverAdapter);
        } else {
            vEEffectHelper.mChooseVideoCoverView.setAdapter(new ChooseVideoCoverView.Adapter(vEEffectHelper.t, frameWidth, frameHeight));
        }
        if (PatchProxy.isSupport(new Object[0], vEEffectHelper, VEEffectHelper.f3085a, false, 38685, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], vEEffectHelper, VEEffectHelper.f3085a, false, 38685, new Class[0], Void.TYPE);
            return;
        }
        vEEffectHelper.p = (CutMultiVideoViewModel) ViewModelProviders.of(vEEffectHelper.G).get(CutMultiVideoViewModel.class);
        vEEffectHelper.mVideoEditView.setMinVideoLength(1000);
        vEEffectHelper.mVideoEditView.setMaxVideoLength((long) vEEffectHelper.r.t());
        vEEffectHelper.p.m = vEEffectHelper.f3086b.isMvThemeVideoType();
        vEEffectHelper.p.n = vEEffectHelper.r.t();
        ai.c("initCutTimeView video duration is " + vEEffectHelper.r.t());
        vEEffectHelper.mVideoEditView.setVeEditor(vEEffectHelper.r);
        List<com.ss.android.ugc.aweme.music.b.a.a> mediaModelList = vEEffectHelper.f3086b.getMediaModelList();
        if (mediaModelList != null && mediaModelList.size() == 1) {
            ai.c("duration is 0");
            mediaModelList.get(0).h = (long) vEEffectHelper.r.t();
        }
        VideoEditView videoEditView = vEEffectHelper.mVideoEditView;
        FragmentActivity fragmentActivity = vEEffectHelper.G;
        CutMultiVideoViewModel cutMultiVideoViewModel = vEEffectHelper.p;
        n nVar = vEEffectHelper.t;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, cutMultiVideoViewModel, nVar, mediaModelList}, videoEditView, VideoEditView.f66542c, false, 75902, new Class[]{FragmentActivity.class, CutMultiVideoViewModel.class, n.class, List.class}, Boolean.TYPE)) {
            ((Boolean) PatchProxy.accessDispatch(new Object[]{fragmentActivity, cutMultiVideoViewModel, nVar, mediaModelList}, videoEditView, VideoEditView.f66542c, false, 75902, new Class[]{FragmentActivity.class, CutMultiVideoViewModel.class, n.class, List.class}, Boolean.TYPE)).booleanValue();
        } else {
            videoEditView.q = nVar;
            videoEditView.a(fragmentActivity, cutMultiVideoViewModel, mediaModelList);
        }
        vEEffectHelper.mVideoEditView.setPointerScaleRatio(1.2f);
        vEEffectHelper.mVideoEditView.setPointerType(2);
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().f66562c.observe(vEEffectHelper.G, new ac(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().f66565f.observe(vEEffectHelper.G, new ad(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().j.observe(vEEffectHelper.G, new ae(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().i.observe(vEEffectHelper.G, new af(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().i.observe(vEEffectHelper.G, new q(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().g.observe(vEEffectHelper.G, new r(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().h.observe(vEEffectHelper.G, new s(vEEffectHelper));
        vEEffectHelper.mVideoEditView.getVideoEditViewModel().f66564e.observe(vEEffectHelper.G, new t(vEEffectHelper));
    }
}
