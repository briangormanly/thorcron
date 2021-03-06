package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - DoesMallStoreExist - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class DoesMallStoreExist
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public DoesMallStoreExist(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public boolean doesMallStoreExist(String storeId) throws KKAdminException
     {
         return kkAdminEng.doesMallStoreExist(storeId);
     }
}
