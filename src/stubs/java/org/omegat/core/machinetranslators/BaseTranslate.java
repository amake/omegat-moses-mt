package org.omegat.core.machinetranslators;

import org.omegat.util.Language;

public abstract class BaseTranslate {
    
    protected abstract String getPreferenceName();
    
    protected abstract String translate(Language sLang, Language tLang, String text) throws Exception;
    
    protected String cleanSpacesAroundTags(String result, String text) {
        return null;
    }

}
