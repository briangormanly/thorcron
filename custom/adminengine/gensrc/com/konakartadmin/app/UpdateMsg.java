package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - UpdateMsg - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class UpdateMsg
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public UpdateMsg(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void updateMsg(String sessionId, String key, int type, String locale, String value) throws KKAdminException
     {
         kkAdminEng.updateMsg(sessionId, key, type, locale, value);
     }
}
