package com.konakart.app;

import com.konakart.appif.*;

/**
 *  The KonaKart Custom Engine - GetPdf - Generated by CreateKKCustomEng
 */
@SuppressWarnings("all")
public class GetPdf
{
    KKEng kkEng = null;

    /**
     * Constructor
     */
     public GetPdf(KKEng _kkEng)
     {
         kkEng = _kkEng;
     }

     public PdfResultIf getPdf(String sessionId, PdfOptionsIf options) throws KKException
     {
         return kkEng.getPdf(sessionId, options);
     }
}
