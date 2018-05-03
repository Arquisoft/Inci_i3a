package com.uniovi.i3a.web.incidents;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class Incident {
	@ApiModelProperty(notes = "Incident id", example="12312")
    public String incidentId = "";
    @ApiModelProperty(notes = "Incident title", example="Sequia en Murcia")
    public String title = "";
    @ApiModelProperty(notes = "Incident description", example="La capacidad de los embalses se encuentra en un 8%")
    public String description = "";
    @ApiModelProperty(notes = "Incident status", example="OPEN")
    public String status = "";
    @ApiModelProperty(notes = "Incident location", example="30N10W")
    public String location = "";
    @ApiModelProperty(notes = "incident tags", example="[DANGEROUS,SPAIN]")
    public String[] tags = { "" };
    @ApiModelProperty(notes = "Incident additional information", example="www.murcia.com")
    public String[] multimedia = { "" };
    @ApiModelProperty(notes = "Incident other", example="{ 'capacity' : '8%', 'temperature':'35º' }")
    public Map<String, String> propertyVal = new HashMap<String, String>();
    @ApiModelProperty(notes = "Incident title", example="[Propuesto un transbase, otro comentario]")
    public Comment[] comments;
    @ApiModelProperty(notes = "Agent reporting the incident", example="manuelbartual")
    public String agentId = "";
    @ApiModelProperty(notes = "Operator in charge of the incident", example="Pedro Sanchez")
    public String operatorId = "";

}
