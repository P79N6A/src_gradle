package com.ss.android.ugc.aweme.story.feed.view.profile;

import android.arch.lifecycle.LifecycleOwner;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.player.b;
import com.ss.android.ugc.aweme.story.player.c;
import com.ss.android.ugc.aweme.video.a.a;

public class MainProfileViewHolder extends AbsProfileViewHolder {
    public static ChangeQuickRedirect g;
    public ProgressBar h;
    private final PlayingProfileIndicator i;
    private FragmentActivity j;
    private b k = new b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72765a;

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72765a, false, 84043, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72765a, false, 84043, new Class[]{Float.TYPE}, Void.TYPE);
                return;
            }
            super.a(f2);
            MainProfileViewHolder.this.h.setProgress((int) f2);
        }
    };

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, g, false, 84040, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, g, false, 84040, new Class[0], Void.TYPE);
            return;
        }
        c.d().b((a) this.k);
        this.i.a();
    }

    public final /* bridge */ /* synthetic */ void a(int i2) {
        super.a(i2);
    }

    public final /* bridge */ /* synthetic */ void b(int i2) {
        super.b(i2);
    }

    public MainProfileViewHolder(final View view) {
        super(view);
        this.j = com.ss.android.ugc.aweme.story.base.utils.a.a(view.getContext());
        this.h = (ProgressBar) view.findViewById(C0906R.id.c7_);
        this.i = (PlayingProfileIndicator) view.findViewById(C0906R.id.c79);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72767a;

            public final void onViewAttachedToWindow(View view) {
            }

            public final void onViewDetachedFromWindow(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f72767a, false, 84044, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f72767a, false, 84044, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                view.removeOnAttachStateChangeListener(this);
                MainProfileViewHolder.this.a();
            }
        });
    }

    public final void a(ProfileEntity profileEntity) {
        if (PatchProxy.isSupport(new Object[]{profileEntity}, this, g, false, 84039, new Class[]{ProfileEntity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{profileEntity}, this, g, false, 84039, new Class[]{ProfileEntity.class}, Void.TYPE);
            return;
        }
        super.a(profileEntity);
        int i2 = this.f72764f;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, g, false, 84042, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, g, false, 84042, new Class[]{Integer.TYPE}, Void.TYPE);
        } else {
            Resources resources = this.j.getResources();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72762d.getLayoutParams();
            if (i2 == 1) {
                marginLayoutParams.height = resources.getDimensionPixelOffset(C0906R.dimen.i2);
                marginLayoutParams.width = resources.getDimensionPixelOffset(C0906R.dimen.i2);
                marginLayoutParams.rightMargin = resources.getDimensionPixelOffset(C0906R.dimen.hn);
                this.f72762d.setLayoutParams(marginLayoutParams);
            } else {
                marginLayoutParams.height = resources.getDimensionPixelOffset(C0906R.dimen.i1);
                marginLayoutParams.width = resources.getDimensionPixelOffset(C0906R.dimen.i1);
                marginLayoutParams.rightMargin = resources.getDimensionPixelOffset(C0906R.dimen.hs);
                this.f72762d.setLayoutParams(marginLayoutParams);
            }
        }
        if (profileEntity.getUserStory() == StoryChange.c(this.j)) {
            c.d().a((a) this.k);
            PlayingProfileIndicator playingProfileIndicator = this.i;
            if (PatchProxy.isSupport(new Object[0], playingProfileIndicator, PlayingProfileIndicator.f72770a, false, 84045, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], playingProfileIndicator, PlayingProfileIndicator.f72770a, false, 84045, new Class[0], Void.TYPE);
            } else {
                playingProfileIndicator.a();
                playingProfileIndicator.f72772c = new StoryChange.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72776a;

                    public final void a(UserStory userStory) {
                        UserStory userStory2 = userStory;
                        if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72776a, false, 84050, new Class[]{UserStory.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72776a, false, 84050, new Class[]{UserStory.class}, Void.TYPE);
                            return;
                        }
                        PlayingProfileIndicator.this.a(userStory2);
                    }
                };
                StoryChange.a(playingProfileIndicator.f72771b, (LifecycleOwner) playingProfileIndicator.f72771b, playingProfileIndicator.f72772c);
                playingProfileIndicator.a(StoryChange.c(playingProfileIndicator.f72771b));
                playingProfileIndicator.f72773d = new StoryChange.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72778a;

                    public final void a(com.ss.android.ugc.aweme.story.api.model.b bVar) {
                        com.ss.android.ugc.aweme.story.api.model.b bVar2 = bVar;
                        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f72778a, false, 84051, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f72778a, false, 84051, new Class[]{com.ss.android.ugc.aweme.story.api.model.b.class}, Void.TYPE);
                            return;
                        }
                        PlayingProfileIndicator.this.a(bVar2);
                    }
                };
                StoryChange.a(playingProfileIndicator.f72771b, (LifecycleOwner) playingProfileIndicator.f72771b, playingProfileIndicator.f72773d);
                playingProfileIndicator.a(StoryChange.b(playingProfileIndicator.f72771b));
            }
        } else {
            a();
        }
    }
}
