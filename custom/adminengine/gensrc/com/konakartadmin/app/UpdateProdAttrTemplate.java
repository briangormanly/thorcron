package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - UpdateProdAttrTemplate - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class UpdateProdAttrTemplate
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public UpdateProdAttrTemplate(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int updateProdAttrTemplate(String sessionId, AdminProdAttrTemplate template) throws KKAdminException
     {
         return kkAdminEng.updateProdAttrTemplate(sessionId, template);
     }
}
