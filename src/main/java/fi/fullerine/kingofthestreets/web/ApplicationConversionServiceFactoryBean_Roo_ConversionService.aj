// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package fi.fullerine.kingofthestreets.web;

import fi.fullerine.kingofthestreets.domain.commutereval.Evaluation;
import fi.fullerine.kingofthestreets.web.ApplicationConversionServiceFactoryBean;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistry;

privileged aspect ApplicationConversionServiceFactoryBean_Roo_ConversionService {
    
    declare @type: ApplicationConversionServiceFactoryBean: @Configurable;
    
    public Converter<Evaluation, String> ApplicationConversionServiceFactoryBean.getEvaluationToStringConverter() {
        return new org.springframework.core.convert.converter.Converter<fi.fullerine.kingofthestreets.domain.commutereval.Evaluation, java.lang.String>() {
            public String convert(Evaluation evaluation) {
                return new StringBuilder().append(evaluation.getUserName()).toString();
            }
        };
    }
    
    public Converter<Long, Evaluation> ApplicationConversionServiceFactoryBean.getIdToEvaluationConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.Long, fi.fullerine.kingofthestreets.domain.commutereval.Evaluation>() {
            public fi.fullerine.kingofthestreets.domain.commutereval.Evaluation convert(java.lang.Long id) {
                return Evaluation.findEvaluation(id);
            }
        };
    }
    
    public Converter<String, Evaluation> ApplicationConversionServiceFactoryBean.getStringToEvaluationConverter() {
        return new org.springframework.core.convert.converter.Converter<java.lang.String, fi.fullerine.kingofthestreets.domain.commutereval.Evaluation>() {
            public fi.fullerine.kingofthestreets.domain.commutereval.Evaluation convert(String id) {
                return getObject().convert(getObject().convert(id, Long.class), Evaluation.class);
            }
        };
    }
    
    public void ApplicationConversionServiceFactoryBean.installLabelConverters(FormatterRegistry registry) {
        registry.addConverter(getEvaluationToStringConverter());
        registry.addConverter(getIdToEvaluationConverter());
        registry.addConverter(getStringToEvaluationConverter());
    }
    
    public void ApplicationConversionServiceFactoryBean.afterPropertiesSet() {
        super.afterPropertiesSet();
        installLabelConverters(getObject());
    }
    
}