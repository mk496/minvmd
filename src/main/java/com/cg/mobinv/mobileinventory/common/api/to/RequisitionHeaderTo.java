package com.cg.mobinv.mobileinventory.common.api.to;

import java.util.List;

import org.apache.olingo.odata2.api.annotation.edm.*;


@EdmEntityType(name = "RequisitionHeader")
@EdmEntitySet(name = "RequisitionHeaderSet")
public class RequisitionHeaderTo {
	
	@EdmKey
    @EdmProperty
    private Long id;
	
	@EdmProperty
	private String requisitionDescription;
	
	@EdmProperty
	private Integer newAttribute;
	
	@EdmNavigationProperty
	private List<RequisitionItemTo> toItems;
	
	
	public RequisitionHeaderTo() {}


	public RequisitionHeaderTo(Long id, String requisitionDescription, Integer newAttribute,
			List<RequisitionItemTo> toItems) {
		this.id = id;
		this.requisitionDescription = requisitionDescription;
		this.newAttribute = newAttribute;
		this.toItems = toItems;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRequisitionDescription() {
		return requisitionDescription;
	}


	public void setRequisitionDescription(String requisitionDescription) {
		this.requisitionDescription = requisitionDescription;
	}


	public Integer getNewAttribute() {
		return newAttribute;
	}


	public void setNewAttribute(Integer newAttribute) {
		this.newAttribute = newAttribute;
	}


	public List<RequisitionItemTo> getItems() {
		return toItems;
	}


	public void setItems(List<RequisitionItemTo> toItems) {
		this.toItems = toItems;
	}
	
}
