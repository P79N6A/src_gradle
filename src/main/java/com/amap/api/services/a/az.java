package com.amap.api.services.a;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.interfaces.IRouteSearch;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;
import com.amap.api.services.route.WalkRouteResult;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public class az implements IRouteSearch {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public RouteSearch.OnRouteSearchListener f6532a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public RouteSearch.OnTruckRouteSearchListener f6533b;

    /* renamed from: c  reason: collision with root package name */
    private Context f6534c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f6535d = s.a();

    public void setOnTruckRouteSearchListener(RouteSearch.OnTruckRouteSearchListener onTruckRouteSearchListener) {
        this.f6533b = onTruckRouteSearchListener;
    }

    public void setRouteSearchListener(RouteSearch.OnRouteSearchListener onRouteSearchListener) {
        this.f6532a = onRouteSearchListener;
    }

    public az(Context context) {
        this.f6534c = context.getApplicationContext();
    }

    private boolean a(RouteSearch.FromAndTo fromAndTo) {
        if (fromAndTo == null || fromAndTo.getFrom() == null || fromAndTo.getTo() == null) {
            return false;
        }
        return true;
    }

    public void calculateBusRouteAsyn(final RouteSearch.BusRouteQuery busRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = 100;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    BusRouteResult busRouteResult = null;
                    try {
                        BusRouteResult calculateBusRoute = az.this.calculateBusRoute(busRouteQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", calculateBusRoute);
                        } catch (AMapException e2) {
                            BusRouteResult busRouteResult2 = calculateBusRoute;
                            e = e2;
                            busRouteResult = busRouteResult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", busRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", busRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            BusRouteResult busRouteResult3 = calculateBusRoute;
                            th = th2;
                            busRouteResult = busRouteResult3;
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", busRouteResult);
                            obtainMessage.setData(bundle);
                            az.this.f6535d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = az.this.f6532a;
                        bundle.putParcelable("result", busRouteResult);
                        obtainMessage.setData(bundle);
                        az.this.f6535d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    az.this.f6535d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "RouteSearch", "calculateBusRouteAsyn");
        }
    }

    public void calculateDriveRouteAsyn(final RouteSearch.DriveRouteQuery driveRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = BaseLoginOrRegisterActivity.o;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    DriveRouteResult driveRouteResult = null;
                    try {
                        DriveRouteResult calculateDriveRoute = az.this.calculateDriveRoute(driveRouteQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", calculateDriveRoute);
                        } catch (AMapException e2) {
                            DriveRouteResult driveRouteResult2 = calculateDriveRoute;
                            e = e2;
                            driveRouteResult = driveRouteResult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", driveRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", driveRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            DriveRouteResult driveRouteResult3 = calculateDriveRoute;
                            th = th2;
                            driveRouteResult = driveRouteResult3;
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", driveRouteResult);
                            obtainMessage.setData(bundle);
                            az.this.f6535d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = az.this.f6532a;
                        bundle.putParcelable("result", driveRouteResult);
                        obtainMessage.setData(bundle);
                        az.this.f6535d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    az.this.f6535d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "RouteSearch", "calculateDriveRouteAsyn");
        }
    }

    public void calculateRideRouteAsyn(final RouteSearch.RideRouteQuery rideRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = 103;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    RideRouteResult rideRouteResult = null;
                    try {
                        RideRouteResult calculateRideRoute = az.this.calculateRideRoute(rideRouteQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", calculateRideRoute);
                        } catch (AMapException e2) {
                            RideRouteResult rideRouteResult2 = calculateRideRoute;
                            e = e2;
                            rideRouteResult = rideRouteResult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", rideRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", rideRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            RideRouteResult rideRouteResult3 = calculateRideRoute;
                            th = th2;
                            rideRouteResult = rideRouteResult3;
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", rideRouteResult);
                            obtainMessage.setData(bundle);
                            az.this.f6535d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = az.this.f6532a;
                        bundle.putParcelable("result", rideRouteResult);
                        obtainMessage.setData(bundle);
                        az.this.f6535d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    az.this.f6535d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "RouteSearch", "calculateRideRouteAsyn");
        }
    }

    public void calculateTruckRouteAsyn(final RouteSearch.TruckRouteQuery truckRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = 104;
                    obtainMessage.arg1 = 17;
                    Bundle bundle = new Bundle();
                    TruckRouteRestult truckRouteRestult = null;
                    try {
                        TruckRouteRestult calculateTruckRoute = az.this.calculateTruckRoute(truckRouteQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = az.this.f6533b;
                            bundle.putParcelable("result", calculateTruckRoute);
                        } catch (AMapException e2) {
                            TruckRouteRestult truckRouteRestult2 = calculateTruckRoute;
                            e = e2;
                            truckRouteRestult = truckRouteRestult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = az.this.f6533b;
                                bundle.putParcelable("result", truckRouteRestult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = az.this.f6533b;
                                bundle.putParcelable("result", truckRouteRestult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            TruckRouteRestult truckRouteRestult3 = calculateTruckRoute;
                            th = th2;
                            truckRouteRestult = truckRouteRestult3;
                            obtainMessage.obj = az.this.f6533b;
                            bundle.putParcelable("result", truckRouteRestult);
                            obtainMessage.setData(bundle);
                            az.this.f6535d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = az.this.f6533b;
                        bundle.putParcelable("result", truckRouteRestult);
                        obtainMessage.setData(bundle);
                        az.this.f6535d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    az.this.f6535d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "RouteSearch", "calculateTruckRouteAsyn");
        }
    }

    public void calculateWalkRouteAsyn(final RouteSearch.WalkRouteQuery walkRouteQuery) {
        try {
            ai.a().a(new Runnable() {
                public void run() {
                    Message obtainMessage = s.a().obtainMessage();
                    obtainMessage.what = 102;
                    obtainMessage.arg1 = 1;
                    Bundle bundle = new Bundle();
                    WalkRouteResult walkRouteResult = null;
                    try {
                        WalkRouteResult calculateWalkRoute = az.this.calculateWalkRoute(walkRouteQuery);
                        try {
                            bundle.putInt("errorCode", PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", calculateWalkRoute);
                        } catch (AMapException e2) {
                            WalkRouteResult walkRouteResult2 = calculateWalkRoute;
                            e = e2;
                            walkRouteResult = walkRouteResult2;
                            try {
                                bundle.putInt("errorCode", e.getErrorCode());
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", walkRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                            } catch (Throwable th) {
                                th = th;
                                obtainMessage.obj = az.this.f6532a;
                                bundle.putParcelable("result", walkRouteResult);
                                obtainMessage.setData(bundle);
                                az.this.f6535d.sendMessage(obtainMessage);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            WalkRouteResult walkRouteResult3 = calculateWalkRoute;
                            th = th2;
                            walkRouteResult = walkRouteResult3;
                            obtainMessage.obj = az.this.f6532a;
                            bundle.putParcelable("result", walkRouteResult);
                            obtainMessage.setData(bundle);
                            az.this.f6535d.sendMessage(obtainMessage);
                            throw th;
                        }
                    } catch (AMapException e3) {
                        e = e3;
                        bundle.putInt("errorCode", e.getErrorCode());
                        obtainMessage.obj = az.this.f6532a;
                        bundle.putParcelable("result", walkRouteResult);
                        obtainMessage.setData(bundle);
                        az.this.f6535d.sendMessage(obtainMessage);
                    }
                    obtainMessage.setData(bundle);
                    az.this.f6535d.sendMessage(obtainMessage);
                }
            });
        } catch (Throwable th) {
            j.a(th, "RouteSearch", "calculateWalkRouteAsyn");
        }
    }

    public BusRouteResult calculateBusRoute(RouteSearch.BusRouteQuery busRouteQuery) throws AMapException {
        try {
            q.a(this.f6534c);
            if (busRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (a(busRouteQuery.getFromAndTo())) {
                RouteSearch.BusRouteQuery clone = busRouteQuery.clone();
                BusRouteResult busRouteResult = (BusRouteResult) new c(this.f6534c, clone).c();
                if (busRouteResult != null) {
                    busRouteResult.setBusQuery(clone);
                }
                return busRouteResult;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, "RouteSearch", "calculateBusRoute");
            throw e2;
        }
    }

    public DriveRouteResult calculateDriveRoute(RouteSearch.DriveRouteQuery driveRouteQuery) throws AMapException {
        try {
            q.a(this.f6534c);
            if (driveRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (a(driveRouteQuery.getFromAndTo())) {
                RouteSearch.DriveRouteQuery clone = driveRouteQuery.clone();
                DriveRouteResult driveRouteResult = (DriveRouteResult) new m(this.f6534c, clone).c();
                if (driveRouteResult != null) {
                    driveRouteResult.setDriveQuery(clone);
                }
                return driveRouteResult;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, "RouteSearch", "calculateDriveRoute");
            throw e2;
        }
    }

    public RideRouteResult calculateRideRoute(RouteSearch.RideRouteQuery rideRouteQuery) throws AMapException {
        try {
            q.a(this.f6534c);
            if (rideRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (a(rideRouteQuery.getFromAndTo())) {
                RouteSearch.RideRouteQuery clone = rideRouteQuery.clone();
                RideRouteResult rideRouteResult = (RideRouteResult) new ad(this.f6534c, clone).c();
                if (rideRouteResult != null) {
                    rideRouteResult.setRideQuery(clone);
                }
                return rideRouteResult;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, "RouteSearch", "calculaterideRoute");
            throw e2;
        }
    }

    public TruckRouteRestult calculateTruckRoute(RouteSearch.TruckRouteQuery truckRouteQuery) throws AMapException {
        try {
            q.a(this.f6534c);
            if (truckRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (a(truckRouteQuery.getFromAndTo())) {
                RouteSearch.TruckRouteQuery clone = truckRouteQuery.clone();
                TruckRouteRestult truckRouteRestult = (TruckRouteRestult) new aj(this.f6534c, clone).c();
                if (truckRouteRestult != null) {
                    truckRouteRestult.setTruckQuery(clone);
                }
                return truckRouteRestult;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, "RouteSearch", "calculateDriveRoute");
            throw e2;
        }
    }

    public WalkRouteResult calculateWalkRoute(RouteSearch.WalkRouteQuery walkRouteQuery) throws AMapException {
        try {
            q.a(this.f6534c);
            if (walkRouteQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            } else if (a(walkRouteQuery.getFromAndTo())) {
                RouteSearch.WalkRouteQuery clone = walkRouteQuery.clone();
                WalkRouteResult walkRouteResult = (WalkRouteResult) new ak(this.f6534c, clone).c();
                if (walkRouteResult != null) {
                    walkRouteResult.setWalkQuery(clone);
                }
                return walkRouteResult;
            } else {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
        } catch (AMapException e2) {
            j.a(e2, "RouteSearch", "calculateWalkRoute");
            throw e2;
        }
    }
}
