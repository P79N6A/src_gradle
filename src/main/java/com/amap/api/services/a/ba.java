package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.LatLonSharePoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.interfaces.IShareSearch;
import com.amap.api.services.share.ShareSearch;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class ba implements IShareSearch {

    /* renamed from: b  reason: collision with root package name */
    private static String f6546b = "http://wb.amap.com/?r=%f,%f,%s,%f,%f,%s,%d,%d,%d,%s,%s,%s&sourceapplication=openapi/0";

    /* renamed from: c  reason: collision with root package name */
    private static String f6547c = "http://wb.amap.com/?q=%f,%f,%s&sourceapplication=openapi/0";

    /* renamed from: d  reason: collision with root package name */
    private static String f6548d = "http://wb.amap.com/?n=%f,%f,%f,%f,%d&sourceapplication=openapi/0";

    /* renamed from: e  reason: collision with root package name */
    private static String f6549e = "http://wb.amap.com/?p=%s,%f,%f,%s,%s&sourceapplication=openapi/0";

    /* renamed from: f  reason: collision with root package name */
    private static final String f6550f = String.valueOf("");

    /* renamed from: a  reason: collision with root package name */
    private Context f6551a;
    /* access modifiers changed from: private */
    public ShareSearch.OnShareSearchListener g;

    public void setOnShareSearchListener(ShareSearch.OnShareSearchListener onShareSearchListener) {
        this.g = onShareSearchListener;
    }

    public ba(Context context) {
        this.f6551a = context;
    }

    public void searchBusRouteShareUrlAsyn(final ShareSearch.ShareBusRouteQuery shareBusRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    if (ba.this.g != null) {
                        Message obtainMessage = s.a().obtainMessage();
                        obtainMessage.arg1 = 11;
                        obtainMessage.what = 1103;
                        obtainMessage.obj = ba.this.g;
                        try {
                            String searchBusRouteShareUrl = ba.this.searchBusRouteShareUrl(shareBusRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchBusRouteShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        } catch (AMapException e2) {
                            obtainMessage.arg2 = e2.getErrorCode();
                        } catch (Throwable th) {
                            s.a().sendMessage(obtainMessage);
                            throw th;
                        }
                        s.a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void searchDrivingRouteShareUrlAsyn(final ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    if (ba.this.g != null) {
                        Message obtainMessage = s.a().obtainMessage();
                        obtainMessage.arg1 = 11;
                        obtainMessage.what = 1104;
                        obtainMessage.obj = ba.this.g;
                        try {
                            String searchDrivingRouteShareUrl = ba.this.searchDrivingRouteShareUrl(shareDrivingRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchDrivingRouteShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        } catch (AMapException e2) {
                            obtainMessage.arg2 = e2.getErrorCode();
                        } catch (Throwable th) {
                            s.a().sendMessage(obtainMessage);
                            throw th;
                        }
                        s.a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void searchLocationShareUrlAsyn(final LatLonSharePoint latLonSharePoint) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    if (ba.this.g != null) {
                        Message obtainMessage = s.a().obtainMessage();
                        obtainMessage.arg1 = 11;
                        obtainMessage.what = 1101;
                        obtainMessage.obj = ba.this.g;
                        try {
                            String searchLocationShareUrl = ba.this.searchLocationShareUrl(latLonSharePoint);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchLocationShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        } catch (AMapException e2) {
                            obtainMessage.arg2 = e2.getErrorCode();
                        } catch (Throwable th) {
                            s.a().sendMessage(obtainMessage);
                            throw th;
                        }
                        s.a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void searchNaviShareUrlAsyn(final ShareSearch.ShareNaviQuery shareNaviQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    if (ba.this.g != null) {
                        Message obtainMessage = s.a().obtainMessage();
                        obtainMessage.arg1 = 11;
                        obtainMessage.what = 1102;
                        obtainMessage.obj = ba.this.g;
                        try {
                            String searchNaviShareUrl = ba.this.searchNaviShareUrl(shareNaviQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchNaviShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        } catch (AMapException e2) {
                            obtainMessage.arg2 = e2.getErrorCode();
                        } catch (Throwable th) {
                            s.a().sendMessage(obtainMessage);
                            throw th;
                        }
                        s.a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void searchPoiShareUrlAsyn(final PoiItem poiItem) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    if (ba.this.g != null) {
                        Message obtainMessage = s.a().obtainMessage();
                        obtainMessage.arg1 = 11;
                        obtainMessage.what = 1100;
                        obtainMessage.obj = ba.this.g;
                        try {
                            String searchPoiShareUrl = ba.this.searchPoiShareUrl(poiItem);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchPoiShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        } catch (AMapException e2) {
                            obtainMessage.arg2 = e2.getErrorCode();
                        } catch (Throwable th) {
                            s.a().sendMessage(obtainMessage);
                            throw th;
                        }
                        s.a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public void searchWalkRouteShareUrlAsyn(final ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    if (ba.this.g != null) {
                        Message obtainMessage = s.a().obtainMessage();
                        obtainMessage.arg1 = 11;
                        obtainMessage.what = 1105;
                        obtainMessage.obj = ba.this.g;
                        try {
                            String searchWalkRouteShareUrl = ba.this.searchWalkRouteShareUrl(shareWalkRouteQuery);
                            Bundle bundle = new Bundle();
                            bundle.putString("shareurlkey", searchWalkRouteShareUrl);
                            obtainMessage.setData(bundle);
                            obtainMessage.arg2 = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
                        } catch (AMapException e2) {
                            obtainMessage.arg2 = e2.getErrorCode();
                        } catch (Throwable th) {
                            s.a().sendMessage(obtainMessage);
                            throw th;
                        }
                        s.a().sendMessage(obtainMessage);
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    public String searchLocationShareUrl(LatLonSharePoint latLonSharePoint) throws AMapException {
        if (latLonSharePoint != null) {
            try {
                return (String) new ag(this.f6551a, String.format(f6547c, new Object[]{Double.valueOf(latLonSharePoint.getLatitude()), Double.valueOf(latLonSharePoint.getLongitude()), latLonSharePoint.getSharePointName()})).c();
            } catch (AMapException e2) {
                j.a(e2, "ShareSearch", "searchLocationShareUrl");
                throw e2;
            }
        } else {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
    }

    public String searchPoiShareUrl(PoiItem poiItem) throws AMapException {
        if (poiItem != null) {
            try {
                if (poiItem.getLatLonPoint() != null) {
                    LatLonPoint latLonPoint = poiItem.getLatLonPoint();
                    return (String) new ag(this.f6551a, String.format(f6549e, new Object[]{poiItem.getPoiId(), Double.valueOf(latLonPoint.getLatitude()), Double.valueOf(latLonPoint.getLongitude()), poiItem.getTitle(), poiItem.getSnippet()})).c();
                }
            } catch (AMapException e2) {
                j.a(e2, "ShareSearch", "searchPoiShareUrl");
                throw e2;
            }
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    public String searchBusRouteShareUrl(ShareSearch.ShareBusRouteQuery shareBusRouteQuery) throws AMapException {
        if (shareBusRouteQuery != null) {
            try {
                int busMode = shareBusRouteQuery.getBusMode();
                ShareSearch.ShareFromAndTo shareFromAndTo = shareBusRouteQuery.getShareFromAndTo();
                if (shareFromAndTo.getFrom() == null || shareFromAndTo.getTo() == null) {
                    throw new AMapException("无效的参数 - IllegalArgumentException");
                }
                LatLonPoint from = shareFromAndTo.getFrom();
                LatLonPoint to = shareFromAndTo.getTo();
                String fromName = shareFromAndTo.getFromName();
                String toName = shareFromAndTo.getToName();
                return (String) new ag(this.f6551a, String.format(f6546b, new Object[]{Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), fromName, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), toName, Integer.valueOf(busMode), 1, 0, f6550f, f6550f, f6550f})).c();
            } catch (AMapException e2) {
                j.a(e2, "ShareSearch", "searchBusRouteShareUrl");
                throw e2;
            }
        } else {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
    }

    public String searchDrivingRouteShareUrl(ShareSearch.ShareDrivingRouteQuery shareDrivingRouteQuery) throws AMapException {
        if (shareDrivingRouteQuery != null) {
            try {
                int drivingMode = shareDrivingRouteQuery.getDrivingMode();
                ShareSearch.ShareFromAndTo shareFromAndTo = shareDrivingRouteQuery.getShareFromAndTo();
                if (shareFromAndTo.getFrom() == null || shareFromAndTo.getTo() == null) {
                    throw new AMapException("无效的参数 - IllegalArgumentException");
                }
                LatLonPoint from = shareFromAndTo.getFrom();
                LatLonPoint to = shareFromAndTo.getTo();
                String fromName = shareFromAndTo.getFromName();
                String toName = shareFromAndTo.getToName();
                return (String) new ag(this.f6551a, String.format(f6546b, new Object[]{Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), fromName, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), toName, Integer.valueOf(drivingMode), 0, 0, f6550f, f6550f, f6550f})).c();
            } catch (AMapException e2) {
                j.a(e2, "ShareSearch", "searchDrivingRouteShareUrl");
                throw e2;
            }
        } else {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
    }

    public String searchNaviShareUrl(ShareSearch.ShareNaviQuery shareNaviQuery) throws AMapException {
        String str;
        if (shareNaviQuery != null) {
            try {
                ShareSearch.ShareFromAndTo fromAndTo = shareNaviQuery.getFromAndTo();
                if (fromAndTo.getTo() != null) {
                    LatLonPoint from = fromAndTo.getFrom();
                    LatLonPoint to = fromAndTo.getTo();
                    int naviMode = shareNaviQuery.getNaviMode();
                    if (fromAndTo.getFrom() == null) {
                        str = String.format(f6548d, new Object[]{null, null, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode)});
                    } else {
                        str = String.format(f6548d, new Object[]{Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), Integer.valueOf(naviMode)});
                    }
                    return (String) new ag(this.f6551a, str).c();
                }
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } catch (AMapException e2) {
                j.a(e2, "ShareSearch", "searchNaviShareUrl");
                throw e2;
            }
        } else {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
    }

    public String searchWalkRouteShareUrl(ShareSearch.ShareWalkRouteQuery shareWalkRouteQuery) throws AMapException {
        if (shareWalkRouteQuery != null) {
            try {
                int walkMode = shareWalkRouteQuery.getWalkMode();
                ShareSearch.ShareFromAndTo shareFromAndTo = shareWalkRouteQuery.getShareFromAndTo();
                if (shareFromAndTo.getFrom() == null || shareFromAndTo.getTo() == null) {
                    throw new AMapException("无效的参数 - IllegalArgumentException");
                }
                LatLonPoint from = shareFromAndTo.getFrom();
                LatLonPoint to = shareFromAndTo.getTo();
                String fromName = shareFromAndTo.getFromName();
                String toName = shareFromAndTo.getToName();
                return (String) new ag(this.f6551a, String.format(f6546b, new Object[]{Double.valueOf(from.getLatitude()), Double.valueOf(from.getLongitude()), fromName, Double.valueOf(to.getLatitude()), Double.valueOf(to.getLongitude()), toName, Integer.valueOf(walkMode), 2, 0, f6550f, f6550f, f6550f})).c();
            } catch (AMapException e2) {
                j.a(e2, "ShareSearch", "searchWalkRouteShareUrl");
                throw e2;
            }
        } else {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
    }
}
