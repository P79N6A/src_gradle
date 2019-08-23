package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public final class JumpToBizWebview {

    public static class Req extends BaseReq {
        public String extMsg;
        public int scene = 1;
        public String toUserName;
        public int webType;

        public boolean checkArgs() {
            String str;
            String str2;
            if (this.toUserName == null || this.toUserName.length() <= 0) {
                str = "MicroMsg.SDK.JumpToBizWebview.Req";
                str2 = "checkArgs fail, toUserName is invalid";
            } else if (this.extMsg == null || this.extMsg.length() <= 1024) {
                return true;
            } else {
                str = "MicroMsg.SDK.JumpToBizWebview.Req";
                str2 = "ext msg is not null, while the length exceed 1024 bytes";
            }
            Log.e(str, str2);
            return false;
        }

        public int getType() {
            return 8;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
            bundle.putString("_wxapi_jump_to_biz_webview_req_ext_msg", this.extMsg);
            bundle.putInt("_wxapi_jump_to_biz_webview_req_web_type", this.webType);
            bundle.putInt("_wxapi_jump_to_biz_webview_req_scene", this.scene);
        }
    }
}
