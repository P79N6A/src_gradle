package com.ss.android.ugc.aweme.photomovie;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59017a;

    /* renamed from: b  reason: collision with root package name */
    private final PhotoMoviePublishFragment f59018b;

    n(PhotoMoviePublishFragment photoMoviePublishFragment) {
        this.f59018b = photoMoviePublishFragment;
    }

    public final void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f59017a, false, 64031, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f59017a, false, 64031, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        PhotoMoviePublishFragment photoMoviePublishFragment = this.f59018b;
        FragmentActivity activity = photoMoviePublishFragment.getActivity();
        ImageView imageView = photoMoviePublishFragment.j;
        PhotoMovieContext photoMovieContext = photoMoviePublishFragment.f58858b;
        if (PatchProxy.isSupport(new Object[]{activity, imageView, photoMovieContext}, null, PhotoMoviePreViewActivity.f58826a, true, 63970, new Class[]{Activity.class, ImageView.class, PhotoMovieContext.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, imageView, photoMovieContext}, null, PhotoMoviePreViewActivity.f58826a, true, 63970, new Class[]{Activity.class, ImageView.class, PhotoMovieContext.class}, Void.TYPE);
        } else {
            Intent intent = new Intent(activity, PhotoMoviePreViewActivity.class);
            intent.putExtra("photo_movie_context", photoMovieContext);
            ViewCompat.setTransitionName(imageView, "transition_img_name");
            activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation(activity, imageView, "transition_img_name").toBundle());
        }
        r.onEvent(MobClick.obtain().setEventName("preview_cover").setLabelName("edit_page"));
    }
}
