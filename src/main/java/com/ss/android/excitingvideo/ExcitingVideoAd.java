package com.ss.android.excitingvideo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.excitingvideo.INetworkListener;
import com.ss.android.excitingvideo.model.VideoAd;
import com.ss.android.excitingvideo.sdk.InnerVideoAd;
import com.ss.android.excitingvideo.utils.SSLog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ExcitingVideoAd {
    private ExcitingVideoAd() {
    }

    public static void onClickVideoEvent(Context context) {
        InnerVideoAd.inst().onAdClickVideoEvent(context);
    }

    public static void setAdUnitId(String str) {
        InnerVideoAd.inst().setAdUnitId(str);
    }

    public static void setDialogFactory(IDialogFactory iDialogFactory) {
        InnerVideoAd.inst().setDialogFactory(iDialogFactory);
    }

    public static void startExcitingVideo(Context context) {
        if (InnerVideoAd.inst().getVideoAd() == null) {
            SSLog.error("VideoAd data is null!!");
            return;
        }
        InnerVideoAd.inst().onAdEvent(context, "game_ad", "otherclick", InnerVideoAd.inst().getVideoAd().getId(), "game");
        try {
            Intent intent = new Intent(context, ExcitingVideoActivity.class);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            intent.setFlags(536870912);
            context.startActivity(intent);
        } catch (Exception e2) {
            SSLog.error("startExcitingVideo", (Throwable) e2);
        }
    }

    public static void requestExcitingVideo(String str, ExcitingVideoListener excitingVideoListener) {
        requestExcitingVideo("game", str, excitingVideoListener);
    }

    public static void requestExcitingVideo(String str, String str2, final ExcitingVideoListener excitingVideoListener) {
        InnerVideoAd.inst().getNetwork().requestGet("https://i.snssdk.com/api/ad/v1/inspire/" + String.format("?ad_from=%s&creator_id=%s", new Object[]{str, str2}), new INetworkListener.NetworkCallback() {
            public final void onSuccess(String str) {
                if (TextUtils.isEmpty(str)) {
                    if (excitingVideoListener != null) {
                        excitingVideoListener.onError(7, "response is empty");
                    }
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int optInt = jSONObject.optInt("code");
                    if (optInt != 0) {
                        String format = String.format("服务端错误, errorCode = %d, message: %s", new Object[]{Integer.valueOf(optInt), jSONObject.optString("message", "")});
                        if (excitingVideoListener != null) {
                            excitingVideoListener.onError(optInt, format);
                        }
                        SSLog.error(format + "\nresponse:" + str);
                        return;
                    }
                    JSONArray optJSONArray = jSONObject.optJSONArray("ad_item");
                    if (optJSONArray != null) {
                        if (optJSONArray.length() != 0) {
                            VideoAd videoAd = new VideoAd(optJSONArray.optJSONObject(0));
                            if (!videoAd.isValid()) {
                                if (excitingVideoListener != null) {
                                    excitingVideoListener.onError(5, "无效的广告");
                                }
                                SSLog.error("无效的广告\nresponse:" + str);
                                return;
                            }
                            InnerVideoAd.inst().setVideoAd(videoAd);
                            InnerVideoAd.inst().setVideoListener(excitingVideoListener);
                            if (excitingVideoListener != null) {
                                excitingVideoListener.onSuccess();
                            }
                            return;
                        }
                    }
                    if (excitingVideoListener != null) {
                        excitingVideoListener.onError(4, "服务端没有返回广告");
                    }
                    SSLog.error("服务端没有返回广告\nresponse:" + str);
                } catch (JSONException unused) {
                    if (excitingVideoListener != null) {
                        excitingVideoListener.onError(3, "JSON 数据解析异常");
                    }
                    SSLog.error("JSON 数据解析异常\nresponse:" + str);
                }
            }

            public final void onFail(int i, String str) {
                String format = String.format("网络请求错误，errorCode = %d, message: %s", new Object[]{Integer.valueOf(i), str});
                if (excitingVideoListener != null) {
                    excitingVideoListener.onError(1, format);
                }
                SSLog.error("JSON 数据解析异常\nresponse:" + format);
            }
        });
    }

    public static void startExcitingVideo(Context context, VideoAd videoAd, ExcitingVideoListener excitingVideoListener) {
        if (videoAd == null) {
            SSLog.error("VideoAd data is empty");
            if (excitingVideoListener != null) {
                excitingVideoListener.onError(4, "启动失败，广告数据为空");
            }
        } else if (videoAd == null || !videoAd.isValid()) {
            SSLog.error("VideoAd is inValid");
            if (excitingVideoListener != null) {
                excitingVideoListener.onError(5, "启动失败，广告无效");
            }
        } else {
            InnerVideoAd.inst().setVideoAd(videoAd);
            InnerVideoAd.inst().setVideoListener(excitingVideoListener);
            try {
                Intent intent = new Intent(context, ExcitingVideoActivity.class);
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                intent.setFlags(536870912);
                context.startActivity(intent);
            } catch (Exception e2) {
                SSLog.error("start ExcitingVideo error", (Throwable) e2);
            }
        }
    }

    public static void init(INetworkListener iNetworkListener, IImageLoadFactory iImageLoadFactory, IDownloadListener iDownloadListener, IOpenWebListener iOpenWebListener, IAdEventListener iAdEventListener) {
        InnerVideoAd.inst().init(iNetworkListener, iImageLoadFactory, iDownloadListener, iOpenWebListener, iAdEventListener);
    }
}
