package com.tencent.mm.opensdk.modelbiz;

import android.os.Bundle;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.utils.Log;

public final class JumpToBizTempSession {

    public static class Req extends BaseReq {
        public String sessionFrom;
        public int showType;
        public String toUserName;

        public boolean checkArgs() {
            String str;
            String str2;
            if (this.toUserName == null || this.toUserName.length() <= 0) {
                str = "MicroMsg.SDK.JumpToBizTempSession.Req";
                str2 = "checkArgs fail, toUserName is invalid";
            } else if (this.sessionFrom != null && this.sessionFrom.length() <= 1024) {
                return true;
            } else {
                str = "MicroMsg.SDK.JumpToBizTempSession.Req";
                str2 = "checkArgs fail, sessionFrom is invalid";
            }
            Log.e(str, str2);
            return false;
        }

        public int getType() {
            return 10;
        }

        public void toBundle(Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_jump_to_biz_webview_req_to_user_name", this.toUserName);
            bundle.putString("_wxapi_jump_to_biz_webview_req_session_from", this.sessionFrom);
            bundle.putInt("_wxapi_jump_to_biz_webview_req_show_type", this.showType);
        }
    }
}
