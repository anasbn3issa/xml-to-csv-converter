package com.fratt.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


import lombok.Data;

@Data
@XmlRootElement(name= "clinical_study")
@XmlAccessorType(XmlAccessType.FIELD)
public class ClinicalStudy {

    @XmlElement(name = "download_date")
    private String download_date;
    @XmlElement(name = "link_text")
    private String link_text;
    @XmlElement(name = "url")
    private String url;
    @XmlElement(name = "org_study_id")
    private String org_study_id;
    @XmlElement(name = "nct_id")
    private String nct_id;
    @XmlElement(name = "nct_alias")
    private String nct_alias;
    @XmlElement(name = "brief_title")
    private String brief_title;
    @XmlElement(name = "official_title")
    private String official_title;
    @XmlElement(name = "agency")
    private String agency;
    @XmlElement(name = "agency_class")
    private String agency_class;
    @XmlElement(name = "status")
    private String status;
    @XmlElement(name = "has_dmc")
    private String has_dmc;
    @XmlElement(name = "textblock")
    private String textblock;
    @XmlElement(name = "overall_status")
    private String overall_status;
    @XmlElement(name = "start_date")
    private String start_date;
    @XmlElement(name = "completion_date")
    private String completion_date;
    @XmlElement(name = "type")
    private String type;
    @XmlElement(name = "primary_completion_date")
    private String primary_completion_date;
    @XmlElement(name = "type2")
    private String type2;
    @XmlElement(name = "phase")
    private String phase;
    @XmlElement(name = "study_type")
    private String study_type;
    @XmlElement(name = "has_expanded_access")
    private String has_expanded_access;
    @XmlElement(name = "allocation")
    private String allocation;
    @XmlElement(name = "intervention_model")
    private String intervention_model;
    @XmlElement(name = "primary_purpose")
    private String primary_purpose;
    @XmlElement(name = "masking")
    private String masking;
    @XmlElement(name = "measure")
    private String measure;
    @XmlElement(name = "time_frame")
    private String time_frame;
    @XmlElement(name = "description")
    private String description;
    @XmlElement(name = "measure3")
    private String measure3;
    @XmlElement(name = "time_frame4")
    private String time_frame4;
    @XmlElement(name = "description5")
    private String description5;
    @XmlElement(name = "number_of_arms")
    private String number_of_arms;
    @XmlElement(name = "enrollment")
    private String enrollment;
    @XmlElement(name = "type6")
    private String type6;
    @XmlElement(name = "condition")
    private String condition;
    @XmlElement(name = "arm_group_label")
    private String arm_group_label;
    @XmlElement(name = "arm_group_type")
    private String arm_group_type;
    @XmlElement(name = "intervention_type")
    private String intervention_type;
    @XmlElement(name = "intervention_name")
    private String intervention_name;
    @XmlElement(name = "description7")
    private String description7;
    @XmlElement(name = "arm_group_label8")
    private String arm_group_label8;
    @XmlElement(name = "textblock9")
    private String textblock9;
    @XmlElement(name = "gender")
    private String gender;
    @XmlElement(name = "minimum_age")
    private String minimum_age;
    @XmlElement(name = "maximum_age")
    private String maximum_age;
    @XmlElement(name = "healthy_volunteers")
    private String healthy_volunteers;
    @XmlElement(name = "last_name")
    private String last_name;
    @XmlElement(name = "role")
    private String role;
    @XmlElement(name = "affiliation")
    private String affiliation;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "city")
    private String city;
    @XmlElement(name = "state")
    private String state;
    @XmlElement(name = "country")
    private String country;
    @XmlElement(name = "country10")
    private String country10;
    @XmlElement(name = "url11")
    private String url11;
    @XmlElement(name = "description12")
    private String description12;
    @XmlElement(name = "verification_date")
    private String verification_date;
    @XmlElement(name = "study_first_submitted")
    private String study_first_submitted;
    @XmlElement(name = "study_first_submitted_qc")
    private String study_first_submitted_qc;
    @XmlElement(name = "study_first_posted")
    private String study_first_posted;
    @XmlElement(name = "type13")
    private String type13;
    @XmlElement(name = "results_first_submitted")
    private String results_first_submitted;
    @XmlElement(name = "results_first_submitted_qc")
    private String results_first_submitted_qc;
    @XmlElement(name = "results_first_posted")
    private String results_first_posted;
    @XmlElement(name = "type14")
    private String type14;
    @XmlElement(name = "last_update_submitted")
    private String last_update_submitted;
    @XmlElement(name = "last_update_submitted_qc")
    private String last_update_submitted_qc;
    @XmlElement(name = "last_update_posted")
    private String last_update_posted;
    @XmlElement(name = "type15")
    private String type15;
    @XmlElement(name = "responsible_party_type")
    private String responsible_party_type;
    @XmlElement(name = "mesh_term")
    private String mesh_term;
    @XmlElement(name = "recruitment_details")
    private String recruitment_details;
    @XmlElement(name = "pre_assignment_details")
    private String pre_assignment_details;
    @XmlElement(name = "group_id")
    private String group_id;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "description16")
    private String description16;
    @XmlElement(name = "title17")
    private String title17;
    @XmlElement(name = "title18")
    private String title18;
    @XmlElement(name = "group_id19")
    private String group_id19;
    @XmlElement(name = "count")
    private String count;
    @XmlElement(name = "title20")
    private String title20;
    @XmlElement(name = "group_id21")
    private String group_id21;
    @XmlElement(name = "count22")
    private String count22;
    @XmlElement(name = "group_id23")
    private String group_id23;
    @XmlElement(name = "title24")
    private String title24;
    @XmlElement(name = "units")
    private String units;
    @XmlElement(name = "scope")
    private String scope;
    @XmlElement(name = "group_id25")
    private String group_id25;
    @XmlElement(name = "value")
    private String value;
    @XmlElement(name = "title26")
    private String title26;
    @XmlElement(name = "units27")
    private String units27;
    @XmlElement(name = "param")
    private String param;
    @XmlElement(name = "dispersion")
    private String dispersion;
    @XmlElement(name = "group_id28")
    private String group_id28;    
    @XmlElement(name = "value29")
    private String value29;
    @XmlElement(name = "lower_limit")
    private String lower_limit;
    @XmlElement(name = "upper_limit")
    private String upper_limit;
    @XmlElement(name = "title30")
    private String title30;
    @XmlElement(name = "type31")
    private String type31;
    @XmlElement(name = "title32")
    private String title32;
    @XmlElement(name = "description33")
    private String description33;
    @XmlElement(name = "time_frame34")
    private String time_frame34;
    @XmlElement(name = "population")
    private String population;
    @XmlElement(name = "group_id35")
    private String group_id35;
    @XmlElement(name = "title36")
    private String title36;
    @XmlElement(name = "title37")
    private String title37;
    @XmlElement(name = "description38")
    private String description38;
    @XmlElement(name = "population39")
    private String population39;
    @XmlElement(name = "units40")
    private String units40;
    @XmlElement(name = "param41")
    private String param41;
    @XmlElement(name = "units42")
    private String units42;
    @XmlElement(name = "scope43")
    private String scope43;
    @XmlElement(name = "group_id44")
    private String group_id44;
    @XmlElement(name = "value45")
    private String value45;
    @XmlElement(name = "group_id46")
    private String group_id46;
    @XmlElement(name = "value47")
    private String value47;
    @XmlElement(name = "time_frame48")
    private String time_frame48;
    @XmlElement(name = "desc")
    private String desc;
    @XmlElement(name = "group_id49")
    private String group_id49;
    @XmlElement(name = "title50")
    private String title50;
    @XmlElement(name = "title51")
    private String title51;
    @XmlElement(name = "sub_title")
    private String sub_title;
    @XmlElement(name = "group_id52")
    private String group_id52;
    @XmlElement(name = "subjects_affected")
    private String subjects_affected;
    @XmlElement(name = "subjects_at_risk")
    private String subjects_at_risk;
    @XmlElement(name = "frequency_threshold")
    private String frequency_threshold;
    @XmlElement(name = "default_vocab53")
    private String default_vocab53;
    @XmlElement(name = "default_assessment54")
    private String default_assessment54;
    @XmlElement(name = "title55")
    private String title55;
    @XmlElement(name = "sub_title56")
    private String sub_title56;
    @XmlElement(name = "group_id57")
    private String group_id57;
    @XmlElement(name = "subjects_affected58")
    private String subjects_affected58;
    @XmlElement(name = "subjects_at_risk59")
    private String subjects_at_risk59;
    @XmlElement(name = "pi_employee")
    private String pi_employee;
    @XmlElement(name = "restrictive_agreement")
    private String restrictive_agreement;
    @XmlElement(name = "name_or_title")
    private String name_or_title;
    @XmlElement(name = "organization")
    private String organization;
    @XmlElement(name = "phone")
    private String phone;
    @XmlElement(name = "email")
    private String email;

    
}
