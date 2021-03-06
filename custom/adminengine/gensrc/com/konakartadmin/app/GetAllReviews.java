package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetAllReviews - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetAllReviews
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetAllReviews(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public AdminReviews getAllReviews(String sessionId, AdminDataDescriptor dataDesc) throws KKAdminException
     {
         return kkAdminEng.getAllReviews(sessionId, dataDesc);
     }
}
