package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - InsertTag - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class InsertTag
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public InsertTag(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int insertTag(String sessionId, AdminTag tag) throws KKAdminException
     {
         return kkAdminEng.insertTag(sessionId, tag);
     }
}