package com.ss.android.ugc.aweme.opensdk.share.share;

import android.os.Bundle;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.opensdk.share.base.DYBaseRequest;
import com.ss.android.ugc.aweme.opensdk.share.base.DYBaseResp;
import com.ss.android.ugc.aweme.opensdk.share.base.DYMediaContent;

public final class Share {

    @Keep
    public static class Request extends DYBaseRequest {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mHashTag;
        public DYMediaContent mMediaContent;
        public int mTargetSceneType;

        public int getType() {
            return 3;
        }

        public Request() {
        }

        public boolean checkArgs() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 63448, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 63448, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.mMediaContent == null) {
                return false;
            } else {
                return this.mMediaContent.checkArgs();
            }
        }

        public Request(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            if (PatchProxy.isSupport(new Object[]{bundle}, this, changeQuickRedirect, false, 63446, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle}, this, changeQuickRedirect, false, 63446, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.fromBundle(bundle);
            this.mTargetSceneType = bundle.getInt("_aweme_open_sdk_params_target_scene", 0);
            this.mHashTag = bundle.getString("_aweme_open_sdk_params_target_scene", "");
            this.mMediaContent = DYMediaContent.a.a(bundle);
        }

        public void toBundle(Bundle bundle) {
            Bundle bundle2;
            Bundle bundle3 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle3}, this, changeQuickRedirect, false, 63447, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle3}, this, changeQuickRedirect, false, 63447, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.toBundle(bundle);
            DYMediaContent dYMediaContent = this.mMediaContent;
            if (PatchProxy.isSupport(new Object[]{dYMediaContent}, null, DYMediaContent.a.f58391a, true, 63416, new Class[]{DYMediaContent.class}, Bundle.class)) {
                bundle2 = (Bundle) PatchProxy.accessDispatch(new Object[]{dYMediaContent}, null, DYMediaContent.a.f58391a, true, 63416, new Class[]{DYMediaContent.class}, Bundle.class);
            } else {
                Bundle bundle4 = new Bundle();
                if (dYMediaContent.mMediaObject != null) {
                    bundle4.putString("_dyobject_identifier_", dYMediaContent.mMediaObject.getClass().getName());
                    dYMediaContent.mMediaObject.serialize(bundle4);
                }
                bundle2 = bundle4;
            }
            bundle3.putAll(bundle2);
            bundle3.putInt("_aweme_open_sdk_params_target_scene", this.mTargetSceneType);
            bundle3.putString("_aweme_open_sdk_params_target_scene", this.mHashTag);
        }
    }

    @Keep
    public static class Response extends DYBaseResp {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String state;

        public int getType() {
            return 4;
        }

        public Response() {
        }

        public Response(Bundle bundle) {
            fromBundle(bundle);
        }

        public void fromBundle(Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 63449, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 63449, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.fromBundle(bundle);
            this.state = bundle2.getString("_aweme_open_sdk_params_state");
        }

        public void toBundle(Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, this, changeQuickRedirect, false, 63450, new Class[]{Bundle.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{bundle2}, this, changeQuickRedirect, false, 63450, new Class[]{Bundle.class}, Void.TYPE);
                return;
            }
            super.toBundle(bundle);
            bundle2.putString("_aweme_open_sdk_params_state", this.state);
        }
    }
}
