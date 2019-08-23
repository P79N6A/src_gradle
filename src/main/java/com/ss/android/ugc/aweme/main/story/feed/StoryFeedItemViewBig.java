package com.ss.android.ugc.aweme.main.story.feed;

import android.content.Context;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

@Keep
public class StoryFeedItemViewBig extends StoryFeedItemView {
    public static ChangeQuickRedirect changeQuickRedirect;

    public int getItemLayout() {
        return C0906R.layout.asy;
    }

    public StoryFeedItemViewBig(Context context) {
        super(context);
    }

    public void bind(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, changeQuickRedirect, false, 58206, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, changeQuickRedirect, false, 58206, new Class[]{b.class}, Void.TYPE);
            return;
        }
        setIsBig(true);
        super.bind(bVar);
        if (this.mIvAvatar != null) {
            this.mIvAvatar.setAlpha(1.0f);
        }
    }
}
