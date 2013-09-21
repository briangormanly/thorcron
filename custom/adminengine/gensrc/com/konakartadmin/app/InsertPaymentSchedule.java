package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - InsertPaymentSchedule - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class InsertPaymentSchedule
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public InsertPaymentSchedule(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int insertPaymentSchedule(String sessionId, AdminPaymentSchedule ps) throws KKAdminException
     {
         return kkAdminEng.insertPaymentSchedule(sessionId, ps);
     }
}
