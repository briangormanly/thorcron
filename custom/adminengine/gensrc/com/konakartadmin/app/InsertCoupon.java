package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - InsertCoupon - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class InsertCoupon
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public InsertCoupon(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int insertCoupon(String sessionId, AdminCoupon coupon) throws KKAdminException
     {
         return kkAdminEng.insertCoupon(sessionId, coupon);
     }
}
