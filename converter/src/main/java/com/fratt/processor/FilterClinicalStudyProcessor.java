package com.fratt.processor;

import org.springframework.batch.item.ItemProcessor;
import com.fratt.model.ClinicalStudy;

//run before writing
public class FilterClinicalStudyProcessor implements ItemProcessor<ClinicalStudy, ClinicalStudy> {

	@Override
	public ClinicalStudy process(ClinicalStudy item) throws Exception {

		return item;
	}

}
